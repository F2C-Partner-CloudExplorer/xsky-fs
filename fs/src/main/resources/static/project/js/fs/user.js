ProjectApp.controller('UserPageController', function ($scope, HttpUtils, eyeService, Notification, UserService) {

    $scope.userListUrl = 'project/html/user/user-list.html';
    $scope.userGroupListUrl = 'project/html/user/user-group-list.html';
    $scope.getAllXSkyAccounts($scope);
    $scope.getAllXSkyOrganizations($scope);

    $scope.select = function (type) {
        $scope.selected = type;
        $scope.$broadcast(type + "Event");
    };

    $scope.bind = function (item) {
        if (angular.isDefined(item.userNum) && item.userNum > 0) {
            Notification.warn('用户组已拥有用户，请解除关系后继续操作');
            return;
        }
        if (angular.isDefined(item.editable) && item.editable == false) {
            Notification.warn('用户或用户组已被使用或共享，请解除关系后继续操作');
            return;
        }
        $scope.formLoadingLayer = HttpUtils.get('xsky/' + item.itemType + '/bind/' + item.id
            + "/" + item.organization + "/" + item.workspace, function () {
            Notification.success('操作成功');
            $scope.toggleForm();
            $scope.$broadcast(item.itemType + "RefreshEvent");
        }, function (response) {
            Notification.danger('操作失败,' + response.message);
        });
    };

    $scope.save = function (type, item) {
        if (!item.id) {
            $scope.formLoadingLayer = HttpUtils.post('xsky/' + type + '/create', item, function () {
                Notification.success('创建成功');
                $scope.toggleForm();
                $scope.$broadcast(type + "RefreshEvent");
            }, function (response) {
                Notification.danger('创建失败,' + response.message);
            });
        } else {
            if (angular.isDefined(item.editable) && item.editable == false) {
                Notification.warn('用户或用户组已被使用或共享，请解除关系后继续操作');
                return;
            }
            $scope.formLoadingLayer = HttpUtils.post('xsky/' + type + '/update', item, function () {
                Notification.success('编辑成功');
                $scope.toggleForm();
                $scope.$broadcast(type + "RefreshEvent");
            }, function (response) {
                Notification.danger('编辑失败,' + response.message);
            });
        }
    };

    $scope.edit = function (type, item) {
        $scope.tmpItem = angular.copy(item);
        $scope.formUrl = 'project/html/user/'+ type +'-edit.html?_t=' + window.appversion;
        $scope.$emit("userFormEvent", $scope.formUrl, $scope.tmpItem);
        //$scope.toggleForm();
    };

    $scope.$on('userFormEvent', function(event, data, item) {
        if (item.id && (!item.workspace || !item.organization)) {
            Notification.warn('目标资源未绑定工作空间，请绑定后继续操作');
            return;
        }
        $scope.formUrl = data;
        $scope.tmpItem = item;
        $scope.userList = [];
        if (!$scope.tmpItem.id) {
            $scope.tmpItem.userIdList = [];
            if ($scope.accountList.length > 0) {
                $scope.tmpItem.accountId = $scope.accountList[0].id;
            }
        }
        if (UserService.getWorkSpaceId()) {
            $scope.tmpItem.workspace = UserService.getWorkSpaceId();
        }
        if (UserService.getOrganizationId()) {
            $scope.tmpItem.organization = UserService.getOrganizationId();
        }
        if ($scope.tmpItem.accountId) {
            $scope.onAccountChange($scope.tmpItem.accountId);
        }
        if ($scope.tmpItem.organization) {
            $scope.onOrganizationChange($scope.tmpItem.organization);
        }
        $scope.toggleForm();
    });

    $scope.$on('userWorkspaceEvent', function(event, data, item) {
        $scope.formUrl = data;
        $scope.tmpItem = item;
        if ($scope.tmpItem.organization) {
            $scope.onOrganizationChange($scope.tmpItem.organization);
        }

        $scope.toggleForm();
    });

    $scope.onOrganizationChange = function (organizationId) {
        let orgId;
        if($scope.isAdmin){
            orgId = organizationId;
        }
        if($scope.isOrgAdmin){
            orgId = UserService.getOrganizationId();
        }
        $scope.loadingLayer = HttpUtils.get('xsky/account/getAllWorkSpaceByOrgId/'+ orgId, function (response) {
            $scope.workspaceList = [];
            angular.forEach(response.data, function (model) {
                let obj = {id: model.id, name: model.name};
                $scope.workspaceList.push(obj);
            });
        });
    };

    $scope.view = function (index) {
        eyeService.view('#password' + index, '#eye' + index);
    };

    $scope.onAccountChange = function(accountId) {
        $scope.formLoadingLayer = HttpUtils.get('xsky/user/listByAccount/' + accountId, function (res) {
            $scope.userList = angular.copy(res.data);
        }, function (response) {
            Notification.danger('获取用户失败,' + response.message);
        });
    }
});

ProjectApp.controller('UserController', function ($scope, $mdDialog, $document,
                                                    $mdBottomSheet, HttpUtils, FilterSearch, Notification, eyeService, UserService) {

    $scope.init = function () {
        $scope.filters = [];
        $scope.conditions = [
            {
                key: 'name',
                name: '名称',
                directive: 'filter-contains'
            }
        ];
        $scope.addFilter($scope.conditions);

        $scope.columns = [
            {key: 'id', value: '序号', checked: true},
            {key: 'name', value: '名称', checked: true},
            {key: 'fsUserGroupNum', value: '所属用户组数', checked: true},
            {key: 'workspace', value: '工作空间', checked: true},
            {key: 'organization', value: '组织', checked: true},
            {key: 'createTime', value: '创建时间', checked: true}
        ];

        $scope.list();
    };

    $scope.list = function (sorts) {
        var conditions = FilterSearch.convert($scope.filters);
        if (sorts) {
            $scope.sort = sorts;
        }
        if ($scope.sort) {
            conditions.sort = $scope.sort.sql;
        }
        HttpUtils.paging($scope, 'xsky/user/list', conditions);
    };

    $scope.$on('userEvent', function () {
        $scope.init();
    })

    $scope.$on('userRefreshEvent', function () {
        $scope.list();
    })

    $scope.delete = function (item) {
        if (item.fsUserGroupNum > 0) {
            Notification.warn('用户已被加入用户组，请解除关系后继续操作');
            return;
        }
        Notification.confirm('将删除用户: ' +  item.name + ', 确认删除?', function () {
            $scope.loadingLayer = HttpUtils.get('xsky/user/delete/'+ item.id, function () {
                Notification.success('删除成功');
                $scope.list();
            }, function (response) {
                Notification.danger('删除失败, ' + response.message);
            });
        });
    };

    $scope.bind = function (item) {
        $scope.tmpItem = angular.copy(item);
        $scope.formUrl = 'project/html/common/workspace.html?_t=' + window.appversion;
        $scope.tmpItem.itemType = 'user';
        $scope.$emit("userWorkspaceEvent", $scope.formUrl, $scope.tmpItem);
    };
});

ProjectApp.controller('UserGroupController', function ($scope, $mdDialog, $document,
                                                          $mdBottomSheet, HttpUtils, FilterSearch, Notification, eyeService, $window, UserService) {

    $scope.init = function () {
        $scope.filters = [];
        $scope.conditions = [
            {
                key: 'name',
                name: '名称',
                directive: 'filter-contains'
            },
            {
                key: "accountId",
                name: "环境",
                directive: "filter-select-virtual",
                url: "xsky/account/getAllAccounts",
                search: true,
                convert: {value: "id", label: "description"}
            },
        ];
        $scope.addFilter($scope.conditions);

        $scope.columns = [
            {key: 'id', value: '序号', checked: true},
            {key: 'name', value: '名称', checked: true},
            {key: 'userNum', value: '用户数', checked: true},
            {key: 'workspace', value: '工作空间', checked: true},
            {key: 'organization', value: '组织', checked: true},
            {key: 'createTime', value: '创建时间', checked: true}
        ];

        $scope.list();
        $scope.getAllXSkyAccounts($scope);
        $scope.getAllXSkyOrganizations($scope);
    };

    $scope.list = function (sorts) {
        var conditions = FilterSearch.convert($scope.filters);
        if (sorts) {
            $scope.sort = sorts;
        }
        if ($scope.sort) {
            conditions.sort = $scope.sort.sql;
        }
        HttpUtils.paging($scope, 'xsky/userGroup/list', conditions);
    };

    $scope.$on('userGroupEvent', function () {
        $scope.init();
    })

    $scope.$on('userGroupRefreshEvent', function () {
        $scope.list();
    })

    $scope.delete = function (item) {
        Notification.confirm('将删除用户组: ' +  item.name + ', 确认删除?', function () {
            $scope.loadingLayer = HttpUtils.get('xsky/userGroup/delete/'+ item.id, function () {
                Notification.success('删除成功');
                $scope.list();
            }, function (response) {
                Notification.danger('删除失败, ' + response.message);
            });
        });
    };

    $scope.bind = function (item) {
        $scope.tmpItem = angular.copy(item);
        $scope.formUrl = 'project/html/common/workspace.html?_t=' + window.appversion;
        $scope.tmpItem.itemType = 'userGroup';
        $scope.$emit("userWorkspaceEvent", $scope.formUrl, $scope.tmpItem);
    };
});





