ProjectApp.controller('FolderController', function ($scope, $mdDialog, $document, $state,
                                                        $mdBottomSheet, HttpUtils, FilterSearch, Notification, UserService, $window) {

    /** 资源模块跳转参数*/
    $scope.methodJump = angular.fromJson(sessionStorage.getItem("methodJump"));
    sessionStorage.removeItem("methodJump");

    $scope.getAllXSkyAccounts($scope);
    $scope.getAllXSkyOrganizations($scope);
    $scope.GB = 1024 * 1024 * 1024;

    $scope.init = function () {
        $scope.filters = [];
        $scope.conditions = [
            {
                key: 'name',
                name: '名称',
                directive: 'filter-contains'
            },
            {
                key: 'shared',
                name: '共享状态',
                directive: "filter-select",
                selects: [
                    {value: true, label: "已共享"},
                    {value: false, label: "未共享"}
                ]
            }
        ];
        $scope.addFilter($scope.conditions);

        $scope.columns = [
            {key: 'id', value: '序号', checked: true},
            {key: 'name', value: '名称', checked: true},
            {key: 'shared', value: '共享状态', checked: true},
            {key: 'status', value: '状态', checked: true},
            {key: 'size', value: '容量使用', checked: true},
            {key: 'poolName', value: '存储池名', checked: true},
            {key: 'workspace', value: '工作空间', checked: true},
            {key: 'organization', value: '组织', checked: true},
            {key: 'createTime', value:'创建时间', checked: true}
        ];

        $scope.list();
    };

    $scope.list = function (sorts) {
        let conditions = FilterSearch.convert($scope.filters);
        if (sorts) {
            $scope.sort = sorts;
        }
        if ($scope.sort) {
            conditions.sort = $scope.sort.sql;
        }
        HttpUtils.paging($scope, 'xsky/folder/list', conditions);
    };

    $scope.setStyle = function(item) {
        return {"width": item.usedRateInt + "%"};
    }

    $scope.openBind = function (item) {
        $scope.tmpItem = angular.copy(item);
        $scope.formUrl = 'project/html/common/workspace.html?_t=' + window.appversion;
        if ($scope.tmpItem.organization) {
            $scope.onOrganizationChange($scope.tmpItem.organization);
        }

        $scope.toggleForm();
    };

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

    $scope.bind = function (item) {
        $scope.formLoadingLayer = HttpUtils.get('xsky/folder/bind/' + item.id
            + "/" + item.organization + "/" + item.workspace, function () {
            Notification.success('操作成功');
            $scope.toggleForm();
            $scope.list();
        }, function (response) {
            Notification.danger('操作失败,' + response.message);
        });
    };

    $scope.edit = function (item) {
        $scope.fsInfo = null;
        //获取预估单价
        $scope.getFsPricePolicyInfo(item)
        $scope.tmpItem = angular.copy(item);
        $scope.formUrl = 'project/html/folder/folder-edit.html?_t=' + window.appversion;

        if (UserService.getWorkSpaceId()) {
            $scope.tmpItem.workspace = UserService.getWorkSpaceId();
        }
        if (UserService.getOrganizationId()) {
            $scope.tmpItem.organization = UserService.getOrganizationId();
        }

        if ($scope.tmpItem.organization) {
            $scope.onOrganizationChange($scope.tmpItem.organization);
        }

        if (!$scope.tmpItem.id && $scope.accountList.length > 0) {
            $scope.tmpItem.accountId = $scope.accountList[0].id;
        }

        if ($scope.tmpItem.accountId) {
            $scope.onAccountChange($scope.tmpItem.accountId);
        }
        $scope.toggleForm();
    };

    $scope.saveFolder = function (item) {
        $scope.poolList.forEach(function(ii) {
            if (ii.id == item.poolId) {
                item.poolName = ii.name
            }
        });
        let data = {};
        if (!item.id) {
            item.size = item.sizeGB * $scope.GB;
            data.folder = item;
            $scope.formLoadingLayer = HttpUtils.post('order/apply/folder', data, function () {
                Notification.success('提交成功');
                $scope.toggleForm();
                $state.go("xsky_order_list");
            }, function (response) {
                Notification.danger('提交失败, ' + response.message);
            });
        } else {
            if (item.sizeGB * $scope.GB < item.originalSize) {
                Notification.warn('容量必须大于原始容量');
                return;
            }
            item.size = item.sizeGB * $scope.GB;

            data.folder = item;
            $scope.formLoadingLayer = HttpUtils.post('order/update/folder', data, function () {
                Notification.success('提交成功');
                $scope.toggleForm();
                $state.go("xsky_order_list");
            }, function (response) {
                Notification.danger('提交失败, ' + response.message);
            });
        }
    };

    $scope.delete = function (item) {
        if (item.shared) {
            Notification.warn('文件系统已被共享，请解除关系后继续操作');
            return;
        }

        let data = {folder: item};
        Notification.confirm('将删除文件系统: ' +  item.name + ', 确认删除?', function () {
            if (UserService.isAdmin() || UserService.isOrgAdmin()) {
                $scope.loadingLayer = HttpUtils.get('xsky/folder/delete/'+ item.id, function () {
                    Notification.success('删除成功');
                    $scope.list();
                }, function (response) {
                    Notification.danger('删除失败, ' + response.message);
                });
                return;
            }

            $scope.loadingLayer = HttpUtils.post('order/delete/folder', data, function () {
                Notification.success('提交成功');
                $scope.list();
            }, function (response) {
                Notification.danger('提交失败, ' + response.message);
            });
        });
    };

    $scope.onAccountChange = function(accountId) {
        $scope.formLoadingLayer = HttpUtils.get('xsky/pool/listByAccount/' + accountId, function (res) {
            $scope.poolList = angular.copy(res.data);
        }, function (response) {
            Notification.danger('获取客户端失败,' + response.message);
        });
    };

    $scope.init();

    /**
     * 打开此文件关联的共享文件
     */
    $scope.showSharedFile = function(item){
        $scope.formLoadingLayer = HttpUtils.get("xsky/folder/shared/file/"+item.folderId,function (response) {
            $scope.sharedFiles = response.data;
            $scope.formUrl = 'project/html/folder/shared-files-list.html' + '?_t=' + Math.random();
            $scope.toggleForm();
        });
    }


    //文件共享 start



    /**
     * 文件共享
     */
    $scope.editShared = function (type, item) {
        $scope.tmpItem = {};
        item.shareType = type;
        item.create = true;
        $scope.tmpItem = angular.copy(item);
        $scope.showFolderIdInput = true;
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
        if ($scope.tmpItem.accountId) {
            $scope.onAccountChangeByFolder($scope.tmpItem.accountId, type);
        }
        $scope.toggleForm();
    };

    $scope.onAccountChangeByFolder = function(accountId, type) {
        $scope.formLoadingLayer = HttpUtils.get('xsky/gatewayGroup/listByAccount/' + accountId + '/' + type, function (res) {
            $scope.gatewayGroupList = angular.copy(res.data);
        }, function (response) {
            Notification.danger('获取网关组失败,' + response.message);
        });

        $scope.formLoadingLayer = HttpUtils.get('xsky/folder/listByAccount/' + accountId + '/' + type, function (res) {
            $scope.folderList = angular.copy(res.data);
        }, function (response) {
            Notification.danger('获取文件系统失败,' + response.message);
        });

        let aclType = -1;
        if (type === 'smb' || type === 'ftp') {
            aclType = 'user';
        } else if (type === 'nfs') {
            aclType = 'client';
        }

        if (aclType != -1) {
            $scope.formLoadingLayer = HttpUtils.get('xsky/' + aclType + '/listByAccount/' + accountId, function (res) {
                $scope.visitList = angular.copy(res.data);
                $scope.done = true;
            }, function (response) {
                Notification.danger('获取' + aclType + ',' + response.message);
            });

            $scope.formLoadingLayer = HttpUtils.get('xsky/' + aclType + 'Group/listByAccount/' + accountId, function (res) {
                $scope.visitGroupList = angular.copy(res.data);
                $scope.doneGroup = true;
            }, function (response) {
                Notification.danger('获取' + aclType + '组,' + response.message);
            });
        }
    };

    $scope.onFolderChange = function(item) {
        console.log($scope.gatewayGroupList);
        $scope.folderList.forEach(function(ii) {
            if (ii.folderId == item.folderId) {
                item.gatewayGroupId = null;
                item.gatewayGroupName = null;
                if (ii.shared && ii.gatewayGroupId) {
                    $scope.gatewayGroupList.forEach(function (kk) {
                        if (kk.gatewayGroupId == ii.gatewayGroupId) {
                            item.gatewayGroupId = ii.gatewayGroupId;
                        }
                    })
                }

            }
        })
    };


    /**
     * 获取共享类型
     */
    $scope.getSharedType = function (item) {
        let shareTypes = angular.fromJson(item.shareTypes);
        let shareTypeEntity = {
            nfs: null,
            ftp: null,
            smb: null
        };
        if(shareTypes.length >0){
            shareTypes.forEach(function (i) {
               if (i === 'nfs'){
                   shareTypeEntity.nfs = i;
               }else if(i === 'ftp'){
                   shareTypeEntity.ftp = i;
               }else{
                   shareTypeEntity.smb = i;
               }
            });
        }
        return shareTypeEntity;
    }

    /**
     * 保存文件系统共享
     */
    $scope.save = function (item) {

        if (!item.folderId){
            Notification.warn('文件系统不能为空');
            return;
        }
        if (!item.gatewayGroupId){
            Notification.warn('文件网关组不能为空');
            return;
        }

        if (!item.id && item.visitGroupIdList && item.visitIdList) {
            if (item.visitGroupIdList.length <= 0 && item.visitIdList.length <= 0) {
                Notification.warn('访问控制不能为空');
                return;
            }
        }

        let data = {shareType: item.shareType};
        $scope.prepare(item, data);

        if (!item.id) {
            $scope.formLoadingLayer = HttpUtils.post('order/apply/share', data, function () {
                Notification.success('提交成功');
                $scope.toggleForm();
                $state.go("xsky_order_list");
            }, function (response) {
                Notification.danger('提交失败, ' + response.message);
            });
        } else {
            $scope.formLoadingLayer = HttpUtils.post('order/update/share', data, function () {
                Notification.success('提交成功');
                $scope.toggleForm();
                $state.go("xsky_order_list");
            }, function (response) {
                Notification.danger('提交失败, ' + response.message);
            });
        }
    }


    $scope.prepare = function(item, data) {
        $scope.folderList.forEach(function(ii) {
            if (ii.folderId == item.folderId) {
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
                data.ftpShareDTO = item;
                break;
        }
    }

    //文件共享 end


    $scope.$watch('toggleForm', function (a, b) {
        if($scope.methodJump && $scope.methodJump.item) {
            switch($scope.methodJump.method) {
                case 'openBind':
                    $scope.openBind($scope.methodJump.item);
                    break;
                case 'edit':
                    $scope.edit($scope.methodJump.item);
                    break;
                case 'delete':
                    $scope.delete($scope.methodJump.item);
                    break;
                case 'showSharedFile':
                    $scope.showSharedFile($scope.methodJump.item);
                    break;
                case 'editShared':
                    $scope.editShared($scope.methodJump.item.jumpType, $scope.methodJump.item);
                    break;
            }
        }
    })

    //start 文件系统价格计算
    $scope.getFsPricePolicyInfo = function (tmpItem) {
        console.log(tmpItem)
        if (tmpItem && tmpItem.sizeGB && tmpItem.workspace) {
            let request = {
                "capacity": tmpItem.sizeGB,
                "workspaceId": tmpItem.workspace,
                "accountId": tmpItem.accountId
            }
            HttpUtils.post("policy/getFsPricePolicyInfo", request, function (resp) {
                console.log(resp.data)
                if (resp.data) {
                    $scope.fsInfo = resp.data;
                    $scope.fsInfo.totalPrice = $scope.fsInfo.totalPrice.toFixed(2);
                }
            })
        }
    }

    //end 文件系统价格计算
});





