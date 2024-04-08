/**
 * 启动app，加载菜单
 */
var ProjectApp = angular.module('ProjectApp', ['CommonApp','f2c.common', 'f2c.process']);

ProjectApp.controller('IndexCtrl', function ($scope, HttpUtils, UserService, Notification) {
    $scope.getAllXSkyAccounts = function ($scope) {
        HttpUtils.get('xsky/account/getAllAccounts', function (response) {
            $scope.accountList = response.data;
            if ($scope.accountList.length < 1) {
                Notification.warn("未获取到有效设备");
            }
        });
        $scope.isAdmin = UserService.isAdmin() ;
        $scope.isOrgAdmin = UserService.isOrgAdmin();
    };

    $scope.getAllXSkyOrganizations = function ($scope) {
        HttpUtils.get('xsky/account/org/list', function (response) {
            $scope.organizationList = response.data;
        });
    };

    $scope.addFilter = function(conditions) {
        $scope.isAdmin = UserService.isAdmin();
        $scope.isOrgAdmin = UserService.isOrgAdmin();

        if ($scope.isAdmin) {
            conditions.push(
                {
                    key: "organization",
                    name: "组织",
                    directive: "filter-select-virtual",
                    url: "organization/listAll",
                    search: true,
                    convert: {value: "id", label: "name"}
                }
            )
            conditions.push(
                {
                    key: "workspace",
                    name: "工作空间",
                    directive: "filter-select-virtual",
                    url: "workspace/listAll",
                    search: true,
                    convert: {value: "id", label: "name"}
                }
            )
        }

        if ($scope.isOrgAdmin) {
            conditions.push(
                {
                    key: "workspace",
                    name: "工作空间",
                    directive: "filter-select-virtual",
                    url: "workspace/listAll",
                    search: true,
                    convert: {value: "id", label: "name"}
                }
            )
        }
    }
});

