ProjectApp.controller('ClientPageController', function ($scope, HttpUtils, UserService, Notification) {

    $scope.clientListUrl = 'project/html/client/client-list.html';
    $scope.clientGroupListUrl = 'project/html/client/client-group-list.html';

    $scope.getAllXSkyAccounts($scope);
    $scope.getAllXSkyOrganizations($scope);

    $scope.select = function (type) {
        $scope.selected = type;
        $scope.$broadcast(type + "Event");
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
        $scope.formUrl = 'project/html/client/'+ type +'-edit.html?_t=' + window.appversion;
        $scope.$emit("clientFormEvent", $scope.formUrl, $scope.tmpItem);
    };

    $scope.bind = function (item) {
        if (angular.isDefined(item.clientGroupNum) && item.clientGroupNum > 0) {
            Notification.warn('客户端组已拥有客户端，请解除关系后继续操作');
            return;
        }
        if (angular.isDefined(item.editable) && item.editable == false) {
            Notification.warn('客户端或客户端组已被使用或共享，请解绑后继续操作');
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

    $scope.$on('clientFormEvent', function(event, data, item) {
        if (item.id && (!item.workspace || !item.organization)) {
            Notification.warn('目标资源未绑定工作空间，请绑定后继续操作');
            return;
        }
        $scope.formUrl = data;
        $scope.tmpItem = item;

        if (UserService.getWorkSpaceId()) {
            $scope.tmpItem.workspace = UserService.getWorkSpaceId();
        }
        if (UserService.getOrganizationId()) {
            $scope.tmpItem.organization = UserService.getOrganizationId();
        }

        $scope.clientList = [];
        if (!$scope.tmpItem.id) {
            $scope.tmpItem.clientIdList = [];
            if ($scope.accountList.length > 0) {
                $scope.tmpItem.accountId = $scope.accountList[0].id;
            }
        }
       /* if ($scope.tmpItem.accountId) {
            $scope.onAccountChange($scope.tmpItem.accountId);
        }*/
        if ($scope.tmpItem.organization) {
            $scope.onOrganizationChange($scope.tmpItem.organization);
        }

        $scope.toggleForm();
    });

    $scope.$on('clientWorkspaceEvent', function(event, data, item) {
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

    $scope.onAccountChange = function(accountId) {
        $scope.formLoadingLayer = HttpUtils.get('xsky/client/listByAccount/' + accountId, function (res) {
            $scope.clientList = angular.copy(res.data);
        }, function (response) {
            Notification.danger('获取客户端失败,' + response.message);
        });
    }
});

ProjectApp.controller('ClientController', function ($scope, $mdDialog, $document,
                                                     $mdBottomSheet, HttpUtils, FilterSearch, Notification, eyeService, $window) {

    $scope.init = function () {
        $scope.filters = [];
        $scope.conditions = [
            {
                key: 'name',
                name: '名称',
                directive: 'filter-contains'
            },
            {
                key: 'ip',
                name: '网段或IP',
                directive: 'filter-contains'
            }
        ];
        $scope.addFilter($scope.conditions);

        $scope.columns = [
            {key: 'id', value: '序号', checked: true},
            {key: 'name', value: '名称', checked: true},
            {key: 'ip', value: '网段或IP', checked: true},
            {key: 'clientGroupNum', value: '所属客户端组数', checked: true},
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
        HttpUtils.paging($scope, 'xsky/client/list', conditions);
    };

    $scope.$on('clientEvent', function () {
        $scope.init();
    })

    $scope.$on('clientRefreshEvent', function () {
        $scope.list();
    })

    $scope.delete = function (item) {
        if (item.clientGroupNum > 0) {
            Notification.warn('用户已被加入用户组，请解除关系后继续操作');
            return;
        }
        Notification.confirm('将删除客户端: ' +  item.name + ', 确认删除?', function () {
            $scope.loadingLayer = HttpUtils.get('xsky/client/delete/'+ item.id, function () {
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
        $scope.tmpItem.itemType = 'client';
        $scope.$emit("clientWorkspaceEvent", $scope.formUrl, $scope.tmpItem);
    };

});

ProjectApp.controller('ClientGroupController', function ($scope, $mdDialog, $document,
                                                          $mdBottomSheet, HttpUtils, FilterSearch, Notification, eyeService, $window) {

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
            {key: 'clientNum', value: '客户端数', checked: true},
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
        HttpUtils.paging($scope, 'xsky/clientGroup/list', conditions);
    };

    $scope.$on('clientGroupEvent', function () {
        $scope.init();
    })

    $scope.$on('clientGroupRefreshEvent', function () {
        $scope.list();
    })

    $scope.bind = function (item) {
        $scope.tmpItem = angular.copy(item);
        $scope.formUrl = 'project/html/common/workspace.html?_t=' + window.appversion;
        $scope.tmpItem.itemType = 'clientGroup';
        $scope.$emit("clientWorkspaceEvent", $scope.formUrl, $scope.tmpItem);
    };

    $scope.delete = function (item) {
        Notification.confirm('将删除客户端组: ' +  item.name + ', 确认删除?', function () {
            $scope.loadingLayer = HttpUtils.get('xsky/clientGroup/delete/'+ item.id, function () {
                Notification.success('删除成功');
                $scope.list();
            }, function (response) {
                Notification.danger('删除失败, ' + response.message);
            });
        });
    };
});





