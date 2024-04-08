var TYPES = {
    CREATE: 'CREATE',
    UPDATE: 'UPDATE',
    DELETE: 'DELETE',
    DEFAULTUPDATE:'DEFAULTUPDATE'
};

ProjectApp.controller('OssUserListController', function ($scope, $mdDialog, $document,
           $mdBottomSheet, HttpUtils, FilterSearch, Notification, UserService, eyeService, $window) {
    $scope.xskyUserParam = angular.fromJson(sessionStorage.getItem("xskyUserParam"));
    sessionStorage.removeItem("xskyUserParam");
    $scope.TYPES = TYPES;
    $scope.isAdmin = UserService.isAdmin() ;
    $scope.isOrgAdmin = UserService.isOrgAdmin();

    $scope.goResource = function (item) {
        sessionStorage.setItem("xskyBucketParam", angular.toJson({
                label: item.name,
                value: item.userId
            }
        ));
        var url = "/oss-xsky/?banner=false#!/xsky/bucket";
        $window.parent.api.open(url);
    };

    $scope.init = function () {
        $scope.filters = [];
        $scope.conditions = [
            {
                key: 'name',
                name: '用户名',
                directive: 'filter-contains'
            },
            {
                key: 'status',
                name: '用户状态',
                directive: 'filter-select',
                selects: [
                    {label: '激活中', value: 'active'},
                    {label: '创建中', value: 'building'},
                    {label: '删除失败', value: 'deleting_error'}
                ]
            },
            {
                key: "accountId",
                name: "环境",
                directive: "filter-select-virtual",
                url: "oss/account/getAllAccounts",
                search: true,
                convert: {value: "id", label: "description"}
            },
            {
                key: "costcenterId",
                name: "组织",
                directive: "filter-select-virtual",
                url: "oss/account/org/list",
                search: true,
                convert: {value: "id", label: "name"}
            },
            {
                key: "groupId",
                name: "工作空间",
                directive: "filter-select-virtual",
                url: "oss/account/getAllWorkSpace",
                search: true,
                convert: {value: "id", label: "name"}
            }
        ];

        if ($scope.xskyUserParam) {
            $scope.filters = [{
                key: "accountId",
                name: "环境",
                operator: "=",
                label: $scope.xskyUserParam.label,
                value: $scope.xskyUserParam.value
            }];
        }

        $scope.first = {
            default: true,
            sort: false,
            type: 'checkbox',
            checkValue: false,
            change: function (checked) {
                $scope.items.forEach(function (item) {
                    item.enable = checked;
                });
            },
            width: '40px'
        };

        $scope.columns = [
            {key: 'id', value: '序号'},
            {key: 'name', value: '用户名'},
            {key: 'email', value: '邮箱'},
            {key: 'accountId', value: '所属环境'},
            {key: 'bucketNum', value: '桶数'},
            {key: 'status', value: '状态'},
            {key: 'costcenterId', value: '组织'},
            {key: 'groupId', value: '工作空间'},
            {key: 'syncedAt', value:'同步时间'}
        ];

        $scope.list();
    };

    $scope.list = function (sorts) {
        $scope.getAccounts();
        $scope.getOrgs();
        $scope.getWorkSpace();
        $scope.getCmpUser();
        $scope.listModel();
        $scope.listCmpUser();
        $scope.listWorkSpace();
        $scope.listAccounts();

        var conditions = FilterSearch.convert($scope.filters);
        if (sorts) {
            $scope.sort = sorts;
        }
        if ($scope.sort) {
            conditions.sort = $scope.sort.sql;
        }
        HttpUtils.paging($scope, 'oss/user/list', conditions);
    };

    $scope.getAccounts = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllAccounts', function (response) {
            $scope.accounts = response.data;
        });
    };

    $scope.getOrgs = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/org/list', function (response) {
            $scope.orgs = response.data;
        });
    };

    $scope.getWorkSpace = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllWorkSpace', function (response) {
            $scope.workspaces = response.data;
        });
    };

    $scope.getCmpUser = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllUsers', function (response) {
            $scope.users = response.data;
        });
    };

    $scope.listModel = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/org/list', function (response) {
            $scope.models = [];
            angular.forEach(response.data, function (model) {
                var obj = {key: model.id, name: model.name};
                $scope.models.push(obj);
            });
        });
    };

    $scope.listCmpUser = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllUsers', function (response) {
            $scope.cmpUsers = [];
            angular.forEach(response.data, function (model) {
                var obj = {key: model.id, name: model.name};
                $scope.cmpUsers.push(obj);
            });
        });
    };


    $scope.listWorkSpace = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllWorkSpace', function (response) {
            $scope.groups = [];
        angular.forEach(response.data, function (model) {
            var obj = {key: model.id, name: model.name};
            $scope.groups.push(obj);
            });
        });
    };

    $scope.listWorkSpaceChange = function () {
        if($scope.isAdmin){
            var orgId = $scope.tmpItem.costcenterId;
        }
        if($scope.isOrgAdmin){
            var orgId = UserService.getOrganizationId();
        }
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllWorkSpaceByOrgId/'+ orgId, function (response) {
            $scope.groups = [];
            angular.forEach(response.data, function (model) {
                var obj = {key: model.id, name: model.name};
                $scope.groups.push(obj);
            });
        });
    };


    $scope.listAccounts = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAccounts/pro', function (response) {
            $scope.xskyAccounts = [];
        angular.forEach(response.data, function (model) {
            var obj = {key: model.id, name: model.description};
            $scope.xskyAccounts.push(obj);
          });
        });
    };

    //获取用户对应存储桶
    $scope.getOsUserBucket = function (item){
        $scope.loadingLayer = HttpUtils.get('oss/user/getOsUserBucket/'+ item.id, function (response) {
            $scope.osBuckets = response.data;
        });
    };

    //获取用户对应秘钥
    $scope.getOsUserKey = function (item){
        $scope.loadingLayer = HttpUtils.get('oss/user/getOsUserKey/'+ item.id, function (response) {
            $scope.osKeys = response.data;
        });
    };

    $scope.tabDetail = null;
    $scope.selectRow = function (item) {
        $scope.tabDetail = item;
        $scope.getOsUserKey(item);
        $scope.getOsUserBucket(item);
        $scope.formUrl = 'project/html/bucket/user-view.html' + '?_t=' + window.appversion;
        $scope.toggleForm();
    };

    $scope.add = function () {
        $scope.type = $scope.TYPES.CREATE;
        $scope.tmpItem = {};
        $scope.formUrl = 'project/html/bucket/user-add.html?_t=' + window.appversion;
        $scope.toggleForm();
    };

    $scope.update = function (item) {
        $scope.type = $scope.TYPES.UPDATE;
        $scope.tmpItem = item;
        if (item.credential) {
            var credential = angular.fromJson(item.credential);
            $scope.tmpItem.accessKey = credential.accessKey;
            $scope.tmpItem.secretKey = credential.secretKey;
        }
        $scope.formUrl = 'project/html/bucket/user-update.html?_t=' + window.appversion;
        $scope.toggleForm();
    };

    $scope.delete = function (item) {
        Notification.confirm('将删除以下对象用户，确认删除?', function () {
            $scope.loadingLayer = HttpUtils.get('oss/user/delete/'+ item.id, function () {
                Notification.success('删除成功');
                $scope.list();
            }, function (response) {
                Notification.danger('删除失败, ' + response.message);
            });
        });
    };

    $scope.saveAccount = function (item, type) {
        if (type === 'CREATE') {
            $scope.formLoadingLayer = HttpUtils.post('oss/user/create', item, function () {
                Notification.success('创建成功');
                $scope.toggleForm();
                $scope.list();
            }, function (response) {
                Notification.danger('创建失败,' + response.message);
            });
        } else if (type === 'UPDATE') {
            $scope.formLoadingLayer = HttpUtils.post('oss/user/update', item, function () {
                Notification.success('编辑成功');
                $scope.toggleForm();
                $scope.list();
            }, function (response) {
                Notification.danger('编辑失败,' + response.message);
            });
        }
    };


    //对象用户名称全集群唯一，必须英文小写，名称不能带有下划线_,不可重复！
    $scope.$watch('tmpItem.name',function (newValue , oldValue) {
        if(newValue !=oldValue){
            if(newValue && (newValue.indexOf('_')!=-1 || /[\A-\Z]/g.test(newValue) || /[\u4E00-\u9FA5]/g.test(newValue))){
                $scope.nameshow = true;
            } else {
                $scope.nameshow = false;
            }
        }
    });

    $scope.view = function (index) {
        eyeService.view('#password' + index, '#eye' + index);
    };

    $scope.init();

});

ProjectApp.controller('OssBucketListController', function ($scope, $mdDialog, $document, $mdBottomSheet,
                    HttpUtils, FilterSearch, Notification, UserService) {
    $scope.TYPES = TYPES;
    $scope.isAdmin = UserService.isAdmin() ;
    $scope.isOrgAdmin = UserService.isOrgAdmin();
    $scope.xskyBucketParam = angular.fromJson(sessionStorage.getItem("xskyBucketParam"));
    sessionStorage.removeItem("xskyBucketParam");

    $scope.init = function () {
        $scope.filters = [];
        $scope.conditions = [
            {
                key: 'name',
                name: '存储桶名称',
                directive: 'filter-contains'
            },
            {
                key: 'status',
                name: '存储桶状态',
                directive: 'filter-select',
                selects: [
                    {label: '激活中', value: 'active'},
                    {label: '创建中', value: 'building'},
                    {label: '删除失败', value: 'deleting_error'}
                ]
            },
            {
                key: "accountId",
                name: "环境",
                directive: "filter-select-virtual",
                url: "oss/account/getAllAccounts",
                search: true,
                convert: {value: "id", label: "description"}
            },
            {
                key: "ownerId",
                name: "租户",
                directive: "filter-select-virtual",
                url: "oss/user/all",
                search: true,
                convert: {value: "userId", label: "name"}
            },
            {
                key: "groupId",
                name: "工作空间",
                directive: "filter-select-virtual",
                url: "oss/account/getAllWorkSpace",
                search: true,
                convert: {value: "id", label: "name"}
            },
            {
                key: "costcenterId",
                name: "组织",
                directive: "filter-select-virtual",
                url: "oss/account/org/list",
                search: true,
                convert: {value: "id", label: "name"}
            },
        ];

        if ($scope.xskyBucketParam) {
            $scope.filters = [{
                key: "ownerId",
                name: "租户",
                operator: "=",
                label: $scope.xskyBucketParam.label,
                value: $scope.xskyBucketParam.value
            }];
        }

        $scope.first = {
            default: true,
            sort: false,
            type: 'checkbox',
            checkValue: false,
            change: function (checked) {
                $scope.items.forEach(function (item) {
                    item.enable = checked;
                });
            },
            width: '40px'
        };

        $scope.columns = [
            {key: 'id', value: '序号'},
            {key: 'name', value: '名称'},
            {key: 'ownerId', value: '租户'},
            {key: 'allocatedSizeStr', value: '已使用(GB)'},
            {key: 'allocatedObjects', value: '对象数'},
            {key: 'quotaMaxSize', value: '容量配额(GB)'},
            {key: 'costcenterId', value: '组织'},
            {key: 'groupId', value: '工作空间'},
            {key: 'status', value: '状态'},
            {key: 'syncedAt', value:'同步时间'}
        ];

        $scope.list();
    };

    $scope.list = function (sorts) {
        $scope.getAccounts();
        $scope.getOrgs();
        $scope.getWorkSpace();
        $scope.getCmpUser();
        $scope.getOsUser();
        $scope.listModel();
        $scope.listCmpUser();
        $scope.listWorkSpace();
        $scope.listAccounts();

        var conditions = FilterSearch.convert($scope.filters);
        if (sorts) {
            $scope.sort = sorts;
        }
        if ($scope.sort) {
            conditions.sort = $scope.sort.sql;
        }
        HttpUtils.paging($scope, 'oss/bucket/list', conditions);
    };

    $scope.getAccounts = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllAccounts', function (response) {
            $scope.accounts = response.data;
        });
    };

    $scope.getOrgs = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/org/list', function (response) {
            $scope.orgs = response.data;
        });
    };

    $scope.getWorkSpace = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllWorkSpace', function (response) {
            $scope.workspaces = response.data;
        });
    };

    $scope.getCmpUser = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllUsers', function (response) {
            $scope.users = response.data;
        });
    };

    $scope.getOsUser = function () {
        $scope.loadingLayer = HttpUtils.get('oss/user/all', function (response) {
            $scope.osUsers = response.data;
        });
    };


    /**
     * to存储桶添加
     */
    $scope.add = function () {
        $scope.type = $scope.TYPES.CREATE;
        $scope.tmpItem = {};
        $scope.formUrl = 'project/html/bucket/bucket-add.html?_t=' + Math.random();
        $scope.toggleForm();
    };

    /**
     * to存储桶编辑
     */
    $scope.update = function (item) {
        $scope.type = $scope.TYPES.UPDATE;
        $scope.tmpItem = item;
        $scope.tmpItem.readonlyUserId = JSON.parse($scope.tmpItem.readonlyUserId);
        $scope.tmpItem.quotaMaxSizeG = Number(($scope.tmpItem.quotaMaxSize/1024/1024/1024));
        $scope.listOsUserInAccount($scope.tmpItem.accountId);
        $scope.formUrl = 'project/html/bucket/bucket-update.html?_t=' + Math.random();
        $scope.toggleForm();
    };

    /**
     * to存储桶添加
     */
    $scope.delete = function (item) {
        $scope.tmpItem = item;
        $scope.formUrl = 'project/html/bucket/bucket-delete.html?_t=' + Math.random();
        $scope.toggleForm();
    };

    /**
     * 存储桶添加/编辑
     * @param item
     * @param type
     */
    $scope.saveAccount = function (item, type) {
        if (type === 'CREATE') {
            var tempItem = angular.copy(item);
            var data = angular.copy(item.content);
            data.quotaMaxSize = data.quotaMaxSizeG;
            tempItem.type =  $scope.TYPES.CREATE;

            var param = {
                ticket: tempItem,
                process: {
                    modelId: 'bucketflow',
                    data: null
                },
                costcenterId: tempItem.costcenterId,
                groupId: tempItem.groupId
            };

            var content = param.ticket.content;

            for (var i = 0; i < $scope.accounts.length; i++) {
                if (content.accountId == $scope.accounts[i].id) {
                    content._account = $scope.accounts[i].description;
                    break;
                }
            }

            if(content.worm == false){
                content.versioned = true;
            }else{
                content.versioned = false;
                content.worm = true;
            }

            content.quotaMaxSize = data.quotaMaxSize;

            content.applicantId = UserService.getUserInfo().id;

            content.groupId = UserService.getWorkSpaceId() ;

            param.ticket.content = angular.toJson(content);

            $scope.formLoadingLayer = HttpUtils.post('ticket/create', param, function () {
                Notification.success('创建成功');
                $scope.toggleForm();
                $scope.list();
            }, function (response) {
                Notification.danger('创建失败,' + response.message);
            });
        } else if (type === 'UPDATE') {
            item.readonlyUserId  = JSON.stringify(item.readonlyUserId);
            var data = angular.copy(item);
            data.quotaMaxSize = data.quotaMaxSizeG;
            item.quotaMaxSize = data.quotaMaxSize;
            if(item.worm == true){
                item.versioned = false;
            }else{
                item.versioned = true;
                item.worm == false;
            }
            $scope.formLoadingLayer = HttpUtils.post('oss/bucket/update', item, function () {
                Notification.success('编辑成功');
                $scope.toggleForm();
                $scope.list();
            }, function (response) {
                Notification.danger('编辑失败,' + response.message);
                $scope.toggleForm();
                $scope.list();
            });
        }
    };

    /**
     * 获取存储桶对应应用信息
     * @param item
     */
    $scope.getOsBucket = function (item){
        $scope.loadingLayer = HttpUtils.get('oss/bucket/getOssBucketAssign/' + item.id, function (response) {
            $scope.ossApplicationInfo = response.data;
        });
    };
    $scope.tabDetail = null;


    $scope.selectRow = function (item) {
        $scope.tabDetail = item;
        $scope.getOsBucket(item);
        $scope.formUrl = 'project/html/bucket/bucket-view.html' + '?_t=' + window.appversion;
        $scope.toggleForm();
    };

    $scope.listOsUserInAccount = function (accountId) {
        $scope.loadingLayer = HttpUtils.get('oss/user/inaccount/'+ accountId, function (response) {
            $scope.ossUsersInAccount = [];
            $scope.readUsersInAccount = [];
            angular.forEach(response.data, function (model) {
                var obj = {key: model.userId, name: model.name};
                var read = {key: model.id, name: model.name};
                $scope.ossUsersInAccount.push(obj);
                $scope.readUsersInAccount.push(read);
            });
        });
    };

    $scope.listOsUserChange = function () {
        var accountId = $scope.tmpItem.content.accountId;
        $scope.loadingLayer = HttpUtils.get('oss/user/inaccount/'+ accountId, function (response) {
            $scope.ossUsers = [];
            $scope.readOnlyUsers = [];
            angular.forEach(response.data, function (model) {
                var obj = {key: model.userId, name: model.name};
                var read = {key: model.id, name: model.name};
                $scope.ossUsers.push(obj);
                $scope.readOnlyUsers.push(read);
            });
        });
    };

    $scope.listWorkSpace = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllWorkSpace', function (response) {
            $scope.groups = [];
            angular.forEach(response.data, function (model) {
                var obj = {key: model.id, name: model.name};
                $scope.groups.push(obj);
            });
        });
    };

    $scope.listWorkSpaceChange = function () {
        if($scope.isAdmin){
            var orgId = $scope.tmpItem.costcenterId;
        }
        if($scope.isOrgAdmin){
            var orgId = UserService.getOrganizationId();
        }
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllWorkSpaceByOrgId/'+ orgId, function (response) {
            $scope.groups = [];
            angular.forEach(response.data, function (model) {
                var obj = {key: model.id, name: model.name};
                $scope.groups.push(obj);
            });
        });
    };


    $scope.listAccounts = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAccounts/pro', function (response) {
            $scope.xskyAccounts = [];
            angular.forEach(response.data, function (model) {
                var obj = {key: model.id, name: model.description};
                $scope.xskyAccounts.push(obj);
            });
        });
    };

    $scope.deleteFlow = function (item) {
        var param = {
            ticket:{
                content:JSON.stringify(item),
                type:"DELETE"
            },
            process: {
                modelId: 'bucketdelete',
                data: null
            },
            ossBucket:item
        };
        $scope.loadingLayer = HttpUtils.post('ticket/create',param, function () {
            Notification.success('提交成功');
            $scope.toggleForm();
            $scope.list();
        }, function (response) {
            Notification.danger('提交失败, ' + response.message);
        });
    };


    //存储桶名称全集群唯一，必须英文小写，名称不能带有下划线_,不可重复！
    $scope.$watch('tmpItem.content.name',function (newValue , oldValue) {
        if(newValue !=oldValue){
            if(newValue && (newValue.indexOf('_')!=-1 || /[\A-\Z]/g.test(newValue) || /[\u4E00-\u9FA5]/g.test(newValue))){
                $scope.nameshow = true;
            } else {
                $scope.nameshow = false;
            }
        }
    });

    $scope.listModel = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/org/list', function (response) {
            $scope.models = [];
            angular.forEach(response.data, function (model) {
                var obj = {key: model.id, name: model.name};
                $scope.models.push(obj);
            });
        });
    };

    $scope.listCmpUser = function () {
        $scope.loadingLayer = HttpUtils.get('oss/account/getAllUsers', function (response) {
            $scope.cmpUsers = [];
            angular.forEach(response.data, function (model) {
                var obj = {key: model.id, name: model.name};
                $scope.cmpUsers.push(obj);
            });
        });
    };

    $scope.init();

});
