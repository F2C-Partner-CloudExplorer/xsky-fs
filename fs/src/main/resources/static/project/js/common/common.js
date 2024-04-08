CommonApp.directive("quotaTree", function (HttpUtils, Notification, $filter) {
    return {
        replace: true,
        templateUrl: "project/html/quota/quota-tree.html" + '?_t=' + window.appversion,
        scope: {
            item: "="
        },
        link: function ($scope, element, attr, ctrl) {
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

            $scope.getOrgDefaultQuotaSetting = function () {
                $scope.loadingLayer = HttpUtils.get('quota/org/default/', function (response) {
                    $scope.defaultOrgQuotaSetting = response.data;
                });
            };

            $scope.getDefaultQuotaSetting = function () {
                $scope.loadingLayer = HttpUtils.get('quota/default/', function (response) {
                    $scope.defaultQuotaSetting = response.data;
                });
            };

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
                $scope.$emit('editQuota', {org: $scope.org, quotaSetting: $scope.quotaSetting});
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
        }
    };
});