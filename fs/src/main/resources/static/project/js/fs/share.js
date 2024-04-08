ProjectApp.controller('SharePageController', function ($scope, HttpUtils, UserService, Notification, $state, JumpService) {

    $scope.jumpFlag = false
    /** 跳转资源管理 */
    $scope.jumpUrl = "/project-management/?banner=false#!/resource-management";
    $scope.methodJump = angular.fromJson(sessionStorage.getItem("methodJump"));
    sessionStorage.removeItem("methodJump");
    $scope.checkboxStatus = [];

    $scope.ftpShareListUrl = 'project/html/share/ftp-list.html';
    $scope.nfsShareListUrl = 'project/html/share/nfs-list.html';
    $scope.smbShareListUrl = 'project/html/share/smb-list.html';
    $scope.shareAclListUrl = 'project/html/share/acl-list.html';
    $scope.getAllXSkyAccounts($scope);
    $scope.getAllXSkyOrganizations($scope)

    $scope.select = function (type) {
        $scope.selected = type;
        $scope.$broadcast(type + "Event");
    };

    $scope.aclColumns = [
        {key: 'id', value: '序号', checked: true},
        {key: 'aclName', value: '名称', checked: true},
        {key: 'typeCN', value: '类型', checked: true},
        {key: 'permissionCN', value: '权限', checked: true},
        {key: 'createTime', value: '创建时间', checked: true}
    ];

    $scope.showAcl = function(type, item) {
        $scope.aclList = [];
        $scope.aclLoadingLayer = HttpUtils.get('xsky/' + type + '/share/acl/listByShare/' + item.accountId + '/' + item.shareId, function (response) {
            $scope.aclList = response.data;
        }, function () {
            Notification.warn('fail');
        });
        $scope.formUrl = 'project/html/share/acl-list.html' + '?_t=' + Math.random();
        $scope.toggleForm();
    }

    $scope.deleteAcl = function(acl) {
        Notification.confirm('将删除: ' +  acl.aclName + '的访问控制, 确认删除?', function () {
            $scope.loadingLayer = HttpUtils.get('xsky/' + acl.aclType + '/share/acl/delete/'+ acl.id, function () {
                Notification.success('删除成功');
                $scope.showAcl(acl.aclType, acl)
            }, function (response) {
                Notification.danger('删除失败, ' + response.message);
            });
        });
    }

    $scope.edit = function (type, item) {
        $scope.shareInfo=null;
        $scope.tmpItem = {};
        item.shareType = type;
        $scope.tmpItem = angular.copy(item);
        $scope.formUrl = 'project/html/share/'+ type +'-share-edit.html?_t=' + window.appversion;
        $scope.folderList = [];
        $scope.gatewayGroupList = [];
        $scope.visitList = [];
        $scope.visitGroupList = [];
        $scope.done = false;
        $scope.doneGroup = false;

        if (!$scope.tmpItem.id) {
            $scope.tmpItem.visitIdList = [];
            $scope.tmpItem.visitGroupIdList = [];
            if ($scope.accountList.length > 0) {
                $scope.tmpItem.accountId = $scope.accountList[0].id;
            }
        }

        if (UserService.getWorkSpaceId()) {
            $scope.tmpItem.workspace = UserService.getWorkSpaceId();
        }
        if (UserService.getOrganizationId()) {
            $scope.tmpItem.organization = UserService.getOrganizationId();

            $scope.loadingLayer = HttpUtils.get('xsky/account/getAllWorkSpaceByOrgId/'+ $scope.tmpItem.organization , function (response) {
                $scope.workspaceList = [];
                angular.forEach(response.data, function (model) {
                    let obj = {id: model.id, name: model.name};
                    $scope.workspaceList.push(obj);
                });
            });
        }
        if($scope.tmpItem.id && 'ftp' === type){
            $scope.showCheckBox($scope.tmpItem);
        }

        if(!$scope.tmpItem.id){
            //默认选中权限
            $scope.checkboxStatus = ['listEnabled','downloadEnabled'];
        }

        if ($scope.tmpItem.accountId) {
            $scope.onAccountChange($scope.tmpItem, type);
        }
        $scope.getFsPricePolicyInfo(item)
        $scope.toggleForm();
    };

    //ftp文件共享回显复选框
    $scope.showCheckBox = function (item) {
        if (item.permission.listEnabled && $scope.checkboxStatus.indexOf('listEnabled') == -1) {
            $scope.checkboxStatus.push('listEnabled');
        }
        if (item.permission.createEnabled && $scope.checkboxStatus.indexOf('createEnabled') == -1) {
            $scope.checkboxStatus.push('createEnabled');
        }
        if (item.permission.uploadEnabled && $scope.checkboxStatus.indexOf('uploadEnabled') == -1) {
            $scope.checkboxStatus.push('uploadEnabled');
        }
        if (item.permission.downloadEnabled && $scope.checkboxStatus.indexOf('downloadEnabled') == -1) {
            $scope.checkboxStatus.push('downloadEnabled');
        }
        if (item.permission.deleteEnabled && $scope.checkboxStatus.indexOf('deleteEnabled') == -1) {
            $scope.checkboxStatus.push('deleteEnabled');
        }
        if (item.permission.renameEnabled && $scope.checkboxStatus.indexOf('renameEnabled') == -1) {
            $scope.checkboxStatus.push('renameEnabled');
        }
    }

    $scope.onAccountChange = function(item, type) {
        $scope.formLoadingLayer = HttpUtils.get('xsky/gatewayGroup/listByAccount/' + item.accountId + '/' + type, function (res) {
            $scope.gatewayGroupList = angular.copy(res.data);
        }, function (response) {
            Notification.danger('获取网关组失败,' + response.message);
        });
        if (item.id){ // 更新
            $scope.formLoadingLayer = HttpUtils.get('xsky/smb/share/DfsRootfsesInfo/' + item.accountId, function (res) {
                $scope.folderList = angular.copy(res.data);
                $scope.tmpItem.folderId=$scope.folderList[0].id;
            }, function (response) {
                Notification.danger('获取文件系统失败,' + response.message);
            });
        }else { //创建
            $scope.formLoadingLayer = HttpUtils.get('xsky/smb/share/DfsRootfsesInfo/' + item.accountId, function (res) {
                $scope.folderList = angular.copy(res.data);
            }, function (response) {
                Notification.danger('获取文件系统失败,' + response.message);
            });
        }


        let aclType = -1;
        if (type === 'smb' || type === 'ftp') {
            aclType = 'user';
        } else if (type === 'nfs') {
            aclType = 'client';
        }

        if (aclType != -1) {
            $scope.formLoadingLayer = HttpUtils.get('xsky/' + aclType + '/listByAccount/' + item.accountId, function (res) {
                $scope.visitList = angular.copy(res.data);
                $scope.done = true;
            }, function (response) {
                Notification.danger('获取' + aclType + ',' + response.message);
            });

            $scope.formLoadingLayer = HttpUtils.get('xsky/' + aclType + 'Group/listByAccount/' + item.accountId, function (res) {
                $scope.visitGroupList = angular.copy(res.data);
                $scope.doneGroup = true;
            }, function (response) {
                Notification.danger('获取' + aclType + '组,' + response.message);
            });
        }
    }


    $scope.prepare = function(item, data) {
        $scope.folderList.forEach(function(ii) {
            if (ii.id && item.folderId && ii.id == item.folderId) {
                item.folderName = ii.name;
            }
        })
        $scope.gatewayGroupList.forEach(function(ii) {
            if (ii.gatewayGroupId == item.gatewayGroupId) {
                item.gatewayGroupName = ii.name;
            }
        })
        item.visitNames = '';
        item.visitGroupNames = '';
        $scope.visitList.forEach(function(ii) {
            item.visitIdList.forEach(function(id) {
                if (item.shareType == 'nfs') {
                    if (ii.clientId == id) {
                        item.visitNames = item.visitNames + ii.name + '  '
                    }
                }
                if (item.shareType != 'nfs') {
                    if (ii.userId == id) {
                        item.visitNames = item.visitNames + ii.name + '  '
                    }
                }
            })
        });
        $scope.visitGroupList.forEach(function(ii) {
            item.visitGroupIdList.forEach(function(id) {
                if (item.shareType == 'nfs') {
                    if (ii.clientGroupId == id) {
                        item.visitGroupNames = item.visitGroupNames + ii.name + '  '
                    }
                }
                if (item.shareType != 'nfs') {
                    if (ii.userGroupId == id) {
                        item.visitGroupNames = item.visitGroupNames + ii.name + '  '
                    }
                }
            })
        });
        switch (item.shareType) {
            case 'smb':
                data.smbShareDTO = item;
                break;
            case 'nfs':
                data.nfsShareDTO = item;
                break;
            case 'ftp':
                item.permission.listEnabled = $scope.expression('listEnabled');
                item.permission.createEnabled = $scope.expression('createEnabled');
                item.permission.uploadEnabled = $scope.expression('uploadEnabled');
                item.permission.downloadEnabled = $scope.expression('downloadEnabled');
                item.permission.deleteEnabled = $scope.expression('deleteEnabled');
                item.permission.renameEnabled = $scope.expression('renameEnabled');
                data.ftpShareDTO = item;
                break;
        }
    }

    $scope.boxStatus = function (event, id) {
        if (event.target.checked) {
            if ($scope.checkboxStatus.indexOf(id) == -1) {
                $scope.checkboxStatus.push(id);
            }
        } else {
            var index = $scope.checkboxStatus.indexOf(id);
            if(index != -1){
                $scope.checkboxStatus.splice(index, 1)
            }
        }
    }

    //回显复选框状态
    $scope.expression = function (id) {
        return $scope.checkboxStatus.indexOf(id) != -1;
    }

    $scope.save = function (item) {

        if(!item.permission){
            Notification.warn('权限不能为空');
            return;
        }
     /*   if (!item.id && item.visitGroupIdList && item.visitIdList) {
            if (item.visitGroupIdList.length <= 0 && item.visitIdList.length <= 0) {
                Notification.warn('访问控制不能为空');
                return;
            }
        }
*/
        let data = {shareType: item.shareType};
        $scope.prepare(item, data);

        if (!item.id) {
            $scope.formLoadingLayer = HttpUtils.post('order/apply/share', data, function () {
                Notification.success('提交成功');
                $scope.toggleForm();
                $scope.jumpBak()
                $state.go("xsky_order_list");
            }, function (response) {
                Notification.danger('提交失败, ' + response.message);
            });
        } else {
            $scope.formLoadingLayer = HttpUtils.post('order/update/share', data, function () {
                Notification.success('提交成功');
                $scope.toggleForm();
                $scope.jumpBak()
                $state.go("xsky_order_list");
            }, function (response) {
                Notification.danger('提交失败, ' + response.message);
            });
        }
    }

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

    //start 文件共享价格计算
    $scope.getFsPricePolicyInfo = function (tmpItem) {
        console.log(tmpItem)
        if (tmpItem && tmpItem.workspace) {
            let request = {
                "name": "FTP文件共享",
                "fileShare": 1,
                "workspaceId": tmpItem.workspace,
                "accountId": tmpItem.accountId
            }
            HttpUtils.post("policy/getSharePricePolicyInfo", request, function (resp) {
                console.log(resp.data)
                if (resp.data) {
                    $scope.shareInfo = resp.data;
                    $scope.shareInfo.totalPrice = $scope.shareInfo.totalPrice.toFixed(2);
                }
            })
        }
    }
    //end 文件共享价格计算

    $scope.bind = function (item) {
        $scope.formLoadingLayer = HttpUtils.get('xsky/' + item.itemType + '/share/bind/' + item.id
            + "/" + item.organization + "/" + item.workspace, function () {
            Notification.success('操作成功');
            $scope.toggleForm();
            $scope.$broadcast(item.itemType + "RefreshEvent");
        }, function (response) {
            Notification.danger('操作失败,' + response.message);
        });
    };

    $scope.$on('shareEvent', function(event, data, item) {
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


    /** 返回资源管理模块 */
    $scope.jumpBak = function () {
        if ($scope.jumpFlag) {
            $scope.jumpFlag = false
            JumpService.jumpBak($scope);
            return
        }
    }

    // 跳转取消
    $scope.jumpOrToggleForm = function () {
        $scope.jumpBak();
        $scope.toggleForm();
    }


    $scope.$watch('toggleForm', function (a, b) {
        if($scope.methodJump && $scope.methodJump.item) {
            $scope.selected = $scope.methodJump.item.jumpType
            $scope.jumpFlag = true
            // 虚拟机迁移
            switch($scope.methodJump.method) {
                // case 'bind': // 授权
                //     $scope.methodJump.item.itemType = $scope.selected
                //     $scope.bind($scope.methodJump.item);
                //     break;
                case 'edit': // 编辑
                    $scope.edit($scope.selected, $scope.methodJump.item);
                    break;
                case 'showAcl': // 详情
                    $scope.showAcl($scope.selected, $scope.methodJump.item);
                    break;
            }
        }
    })
});

ProjectApp.controller('FtpShareController', function ($scope, $mdDialog, $document, UserService,
                                                     $mdBottomSheet, HttpUtils, FilterSearch, Notification, $state, $window) {

    $scope.init = function () {
        $scope.filters = [];
        $scope.conditions = [
            {
                key: 'folderName',
                name: '文件系统',
                directive: 'filter-contains'
            }
        ];

        $scope.columns = [
            {key: 'id', value: '序号', checked: true},
            {key: 'folderName', value: '共享路径', checked: true},
            {key: 'gatewayGroupIp', value: '共享地址', checked: true},
            {key: 'workspace', value: '组织', checked: true},
            {key: 'organization', value: '工作空间', checked: true},
            {key: 'gatewayGroupName', value: '网关组', checked: true},
            {key: 'status', value: '状态', checked: true},
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
        if ($scope.accountList && $scope.accountList.length === 1) {
            conditions.accountId = $scope.accountList[0].id;
            HttpUtils.paging($scope, 'xsky/ftp/share/list', conditions);
        } else {
            HttpUtils.get('xsky/account/getAllAccounts', function (response) {
                conditions.accountId = response.data[0].id;
                HttpUtils.paging($scope, 'xsky/ftp/share/list', conditions);
            });
        }
    };

    $scope.$on('ftpEvent', function () {
        setTimeout(function(){
            $scope.init();
        },200)
    })

    $scope.$on('ftpRefreshEvent', function () {
        $scope.list();
    })

    $scope.delete = function (item) {
        let data = {shareType: 'ftp'};
        data.ftpShareDTO = item;

        let name = '/' + item.folderName + '/';
        Notification.confirm('确定删除FTP共享 ' +  name + ' 吗？删除后，可能引起相关共享服务中断或者访问异常。', function () {
            if (UserService.isAdmin() || UserService.isOrgAdmin()) {
                $scope.loadingLayer = HttpUtils.get('xsky/ftp/share/delete/'+ item.id, function () {
                    Notification.success('删除成功');
                    $scope.list();
                }, function (response) {
                    Notification.danger('删除失败, ' + response.message);
                });
                return;
            }

            $scope.formLoadingLayer = HttpUtils.post('order/delete/share', data, function () {
                Notification.success('提交成功');
                $state.go("xsky_order_list");
            }, function (response) {
                Notification.danger('提交失败, ' + response.message);
            });
        });
    };

    $scope.bind = function (item) {
        $scope.tmpItem = angular.copy(item);
        $scope.formUrl = 'project/html/common/workspace.html?_t=' + window.appversion;
        $scope.tmpItem.itemType = 'ftp';
        $scope.$emit("shareEvent", $scope.formUrl, $scope.tmpItem);
    };
});

ProjectApp.controller('SmbShareController', function ($scope, $mdDialog, $document, UserService,
                                                      $mdBottomSheet, HttpUtils, FilterSearch, Notification, $state, $window) {

    $scope.init = function () {
        $scope.filters = [];
        $scope.conditions = [
            {
                key: 'name',
                name: '名称',
                directive: 'filter-contains'
            }
        ];

        $scope.columns = [
            {key: 'id', value: '序号', checked: true},
            {key: 'name', value: '名称', checked: true},
            {key: 'folderName', value: '共享路径', checked: true},
            {key: 'sharedAddress', value: '共享地址', checked: true},
            {key: 'workspace', value: '组织', checked: true},
            {key: 'organization', value: '工作空间', checked: true},
            {key: 'gatewayGroupName', value: '网关组', checked: true},
            {key: 'status', value: '状态', checked: true},
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
        if ($scope.accountList.length === 1) {
            conditions.accountId = $scope.accountList[0].id;
        }
        HttpUtils.paging($scope, 'xsky/smb/share/list', conditions);
    };

    $scope.$on('smbEvent', function () {
        $scope.init();
    })

    $scope.$on('smbRefreshEvent', function () {
        $scope.list();
    })

    $scope.delete = function (item) {
        let data = {shareType: 'smb'};
        data.smbShareDTO = item;

        let name = '/' + item.folderName + '/';
        Notification.confirm('确定删除SMB/CIFS共享 ' +  name + ' 吗？删除后，可能引起相关共享服务中断或者访问异常。', function () {
            if (UserService.isAdmin() || UserService.isOrgAdmin()) {
                $scope.loadingLayer = HttpUtils.get('xsky/smb/share/delete/'+ item.id, function () {
                    Notification.success('删除成功');
                    $scope.list();
                }, function (response) {
                    Notification.danger('删除失败, ' + response.message);
                });
                return;
            }
            $scope.formLoadingLayer = HttpUtils.post('order/delete/share', data, function () {
                Notification.success('提交成功');
                $state.go("xsky_order_list");
            }, function (response) {
                Notification.danger('提交失败, ' + response.message);
            });
        });
    };

    $scope.bind = function (item) {
        $scope.tmpItem = angular.copy(item);
        $scope.formUrl = 'project/html/common/workspace.html?_t=' + window.appversion;
        $scope.tmpItem.itemType = 'smb';
        $scope.$emit("shareEvent", $scope.formUrl, $scope.tmpItem);
    };

});

ProjectApp.controller('NfsShareController', function ($scope, $mdDialog, $document, UserService,
                                                      $mdBottomSheet, HttpUtils, FilterSearch, Notification, $state, $window) {

    $scope.init = function () {
        $scope.filters = [];
        $scope.conditions = [
            {
                key: 'folderName',
                name: '文件系统',
                directive: 'filter-contains'
            }
        ];

        $scope.columns = [
            {key: 'id', value: '序号', checked: true},
            {key: 'folderName', value: '共享路径', checked: true},
            {key: 'gatewayGroupIp', value: '共享地址', checked: true},
            {key: 'workspace', value: '组织', checked: true},
            {key: 'organization', value: '工作空间', checked: true},
            {key: 'gatewayGroupName', value: '网关组', checked: true},
            {key: 'status', value: '状态', checked: true},
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
        if ($scope.accountList.length === 1) {
            conditions.accountId = $scope.accountList[0].id;
        }
        HttpUtils.paging($scope, 'xsky/nfs/share/list', conditions);
    };

    $scope.$on('nfsEvent', function () {
        $scope.init();
    })

    $scope.$on('nfsRefreshEvent', function () {
        $scope.list();
    })

    $scope.delete = function (item) {
        let data = {shareType: 'nfs'};
        data.nfsShareDTO = item;

        let name = '/' + item.folderName + '/';
        Notification.confirm('确定删除NFS共享 ' +  name + ' 吗？删除后，可能引起相关共享服务中断或者访问异常。', function () {
            if (UserService.isAdmin() || UserService.isOrgAdmin()) {
                $scope.loadingLayer = HttpUtils.get('xsky/nfs/share/delete/'+ item.id, function () {
                    Notification.success('删除成功');
                    $scope.list();
                }, function (response) {
                    Notification.danger('删除失败, ' + response.message);
                });
                return;
            }
            $scope.formLoadingLayer = HttpUtils.post('order/delete/share', data, function () {
                Notification.success('提交成功');
                $state.go("xsky_order_list");
            }, function (response) {
                Notification.danger('提交失败, ' + response.message);
            });
        });
    };

    $scope.bind = function (item) {
        $scope.tmpItem = angular.copy(item);
        $scope.formUrl = 'project/html/common/workspace.html?_t=' + window.appversion;
        $scope.tmpItem.itemType = 'nfs';
        $scope.$emit("shareEvent", $scope.formUrl, $scope.tmpItem);
    };

});




