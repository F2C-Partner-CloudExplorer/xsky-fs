ProjectApp.controller('QuotaController', function ($scope, FilterSearch, HttpUtils, Notification) {

    $scope.conditions = [
        {key: "name", name:  '组织', directive: "filter-contains"}
    ];

    // 用于传入后台的参数
    $scope.filters = [];

    $scope.list = function (sortObj) {
        let condition = FilterSearch.convert($scope.filters);
        if (sortObj || $scope.sort) {
            $scope.sort = sortObj || $scope.sort;
        }
        if ($scope.sort) {
            condition.sort = $scope.sort.sql;
        }
        condition = condition ? condition : {};
        HttpUtils.paging($scope, "quota/org/list", condition, $scope.setOrgQuotaUsage);
    };

    /**
     * 组织管理员  配个管理页面
     * @param response
     */
    $scope.setOrgQuotaUsage = function (response) {
        let items = response.data["listObject"];
        if (!items) {
            items = response.data;
        }
        for (let i = 0; i < items.length; i++) {
            $scope.getOrgQuotaUsage(items[i]);
        }
        $scope.getOrgDefaultQuotaSetting();
        $scope.getDefaultQuotaSetting();
    };

    /**
     * 组织默认配额
     */
    $scope.getOrgDefaultQuotaSetting = function () {
        $scope.loadingLayer = HttpUtils.get('quota/org/default/', function (response) {
            $scope.defaultOrgQuotaSetting = response.data;
        });
    };

    /**
     * 工作空间默认配额
     */
    $scope.getDefaultQuotaSetting = function () {
        $scope.loadingLayer = HttpUtils.get('quota/default/', function (response) {
            $scope.defaultQuotaSetting = response.data;
        });
    };

    /**
     * 获取每个组织的配额信息
     * @param item
     */
    $scope.getOrgQuotaUsage = function (item) {
        $scope.loadingLayer = HttpUtils.get('quota/org/' + item.id, function (data) {
            item.quotaUsage = data.data;
        });
    };

    $scope.showDetail = function (item) {
        item.show = (item.show === undefined || item.show === false);
        if (!item.workspaces) {
            $scope.getGroupEnvList(item);
        }
        $scope.getGroupOrgEnvList(item);
    };

    $scope.getGroupEnvList = function (org) {
        $scope.loadingLayer = HttpUtils.get("quota/org/workspaces/" + org.id, function (response) {
            org.workspaces = response.data;
            $scope.setQuotaUsage(response);
        });
    };

    $scope.getGroupOrgEnvList = function (org) {
        $scope.loadingLayer = HttpUtils.post("quota/org/orgs/" + org.id, {}, function (response) {
            org.orgs = response.data;
            $scope.setOrgQuotaUsage(response);
        });
    };

    $scope.setQuotaUsage = function (response) {
        let items = response.data;
        for (let i = 0; i < items.length; i++) {
            $scope.getQuotaUsage(items[i]);
        }
    };

    $scope.getQuotaUsage = function (item) {
        $scope.loadingLayer = HttpUtils.get('quota/workspace/' + item.id, function (response) {
            item.quotaUsage = response.data;
        });
    };

    /**
     * 管理员 配额编辑
     */
    $scope.saveQuota = function () {
        let url;
        if ($scope.quotaSetting.type === "org") {
            url = 'quota/org/save/' + $scope.quotaSetting.workspaceId;
        } else {
            url = 'quota/save/' + $scope.quotaSetting.workspaceId;
        }
        // 默认
        if ($scope.quotaSetting.isDefault) {
            url = $scope.quotaSetting.type === "org" ? 'quota/org/save-default' : 'quota/save-default';
        }
        $scope.quotaEditLoading = HttpUtils.post(url, $scope.quotaSetting, function (response) {
            $scope.toggleForm();
            Notification.success( '操作成功');
            if ($scope.quotaSetting.type === "org" || $scope.quotaSetting.isDefault) {
                // $scope.list();
            } else {
                $scope.getGroupEnvList($scope.org);
            }
            $scope.list();
        });
    };

    $scope.editQuota = function (isVM, item, isDefault, type, org) {
        $scope.org = org;
        if (isDefault) {
            $scope.quotaSetting = jQuery.extend(true, {}, item);
        } else {
            $scope.quotaSetting = jQuery.extend(true, {}, item.quotaUsage);
            $scope.quotaSetting.workspaceName = item.name;
        }
        $scope.quotaSetting.type = type;
        $scope.quotaSetting.workspaceId = item.id;
        $scope.quotaSetting.isDefault = isDefault;
        $scope.formUrl = 'project/html/quota/quota-edit.html' + '?_t=' + window.appversion;
        $scope.toggleForm();
    };


    $scope.disableCount = function (quota) {
        return !quota.isDefault && quota.fsDefaultSetting;
    };

    $scope.enableDefault = function (quota) {
        if (quota.fsDefaultSetting) {
            if ($scope.quotaSetting.type === 'org') {
                quota.folderCount = $scope.defaultOrgQuotaSetting.folderCount;
            } else {
                quota.folderCount = $scope.defaultQuotaSetting.folderCount;
            }
        }
    };

    $scope.$on('editQuota', function (event, arg) {
        // console.log(arg);
        $scope.org = arg.org;
        $scope.quotaSetting = arg.quotaSetting;
        $scope.formUrl = 'project/html/quota/quota-edit.html' + '?_t=' + window.appversion;
        $scope.toggleForm();
    });

    $scope.list();
});

ProjectApp.controller('QuotaWorkspaceController', function ($scope, FilterSearch, HttpUtils, Notification, $filter) {
    $scope.conditions = [
        {key: "name", name: '组织', directive: "filter-contains"}
    ];
    $scope.filters = [];

    $scope.list = function (sortObj) {
        let condition = FilterSearch.convert($scope.filters);
        if (sortObj || $scope.sort) {
            $scope.sort = sortObj || $scope.sort;
        }
        if ($scope.sort) {
            condition.sort = $scope.sort.sql;
        }
        condition = condition ? condition : {};
        HttpUtils.paging($scope, "quota/workspace/list", condition, $scope.setQuotaUsage);
    };

    $scope.getOrgQuotaUsage = function () {
        HttpUtils.get("quota/org/current", function (response) {
            $scope.orgQuotaSetting = response.data;
        })
    };

    $scope.getOrgDefaultQuotaSetting = function () {
        HttpUtils.get("quota/org/default/", function (response) {
            $scope.defaultOrgQuotaSetting = response.data;
            $scope.getOrgQuotaUsage();
        });
    };

    $scope.setQuotaUsage = function (response) {
        let items = response.data["listObject"];
        for (let i = 0; i < items.length; i++) {
            $scope.getQuotaUsage(items[i]);
        }
        $scope.getDefaultQuotaSetting();
    };

    $scope.getQuotaUsage = function (item) {
        $scope.loadingLayer = HttpUtils.get('quota/workspace/' + item.id, function (data) {
            item.quotaUsage = data.data;
        });
    };

    $scope.getDefaultQuotaSetting = function () {
        $scope.loadingLayer = HttpUtils.get('quota/default/', function (data) {
            $scope.defaultQuotaSetting = data.data;
        });
    };

    $scope.saveQuota = function () {
        let url = 'quota/save/' + $scope.quotaSetting.workspaceId;
        if ($scope.quotaSetting.isDefault) {
            url = 'quota/save-default';
        }
        $scope.quotaEditLoading = HttpUtils.post(url, $scope.quotaSetting, function (response) {
            Notification.success('操作成功');
            $scope.toggleForm();
            $scope.list();
        });
    };

    $scope.editQuota = function (isVM, item, isDefault) {
        $scope.quotaSetting = {};
        if (isDefault) {
            $scope.quotaSetting = jQuery.extend(true, {}, $scope.defaultQuotaSetting);
        } else {
            $scope.quotaSetting = jQuery.extend(true, {}, item.quotaUsage);
            $scope.quotaSetting.workspaceName = item.name;
        }
        $scope.quotaSetting.workspaceId = item.id;
        $scope.quotaSetting.isDefault = isDefault;
        // $scope.quotaSetting.isVM = isVM;
        $scope.formUrl = 'project/html/quota/quota-edit.html' + '?_t=' + window.appversion;
        $scope.toggleForm();
    };


    $scope.disableCount = function (quota) {
        return quota.fsDefaultSetting;
    };

    $scope.enableDefault = function (quota) {
        // if (quota.vmDefaultSetting) {
        //     quota.vmCount = $scope.defaultQuotaSetting.vmCount;
        //     quota.vmCpuCount = $scope.defaultQuotaSetting.vmCpuCount;
        //     quota.vmMemSize = $scope.defaultQuotaSetting.vmMemSize;
        //     quota.vmDiskSize = $scope.defaultQuotaSetting.vmDiskSize;
        // }

    };

    $scope.list();
    $scope.getOrgDefaultQuotaSetting();
});

ProjectApp.controller('QuotaUserController', function ($scope, HttpUtils, UserService) {
    $scope.list = function () {
        HttpUtils.get('quota/workspace/' + UserService.getWorkSpaceId(), function (response) {
            $scope.quotaSetting = response.data;
        });
    };

    $scope.list();
});