ProjectApp.controller('PolicyController', function ($scope, HttpUtils, FilterSearch, Notification, AuthService, $filter) {
    $scope.select = function (tab) {
        $scope.tab = tab;
        $scope.formUrl = 'project/html/policy/' + tab + '-edit.html' + '?_t=' + window.appversion;
        // 获取环境标签集合
        HttpUtils.get("policy/getEnvList", function (resp) {
            $scope.envList = resp.data;
        });

        $scope.columns = [
            {value: '存储类型', key: "platform", sort: false},
            {value: '价格(元/个数/天)', key: "capacityPrice", sort: false},
            {value: '环境', key: "disk", sort: false},
        ];
        if (AuthService.hasPermissions("POLICY:READ+EDIT,POLICY:READ+DELETE")) {
            $scope.columns.push({value: "", default: true, sort: false});
        }
        HttpUtils.get("platform/getAll",function (resp) {
            $scope.platforms = resp.data;
        })

        $scope.list();
    };

    $scope.platforms = [];

    $scope.editPolicyForm = function (item) {
        $scope.item = angular.copy(item);
        $scope.toggleForm();
    };

    $scope.editPolicySubmit = function (item) {
        let url = item.id ? 'policy/update' : 'policy/add';
        HttpUtils.post(url, item, function () {
            $scope.toggleForm();
            $scope.list();
            Notification.success('操作成功');
        });
    };

    // 用于传入后台的参数
    $scope.filters = [];

    $scope.list = function (sortObj) {
        let condition = FilterSearch.convert($scope.filters);
        if (sortObj) {
            $scope.sort = sortObj;
        }
        if ($scope.sort) {
            condition.sort = $scope.sort.sql;
        }
        HttpUtils.paging($scope, 'policy/' + $scope.tab + '/list', condition)
    };

    $scope.deletePolicy = function (item) {
        Notification.confirm('确认删除' + '?', function () {
            // 确认删除
            HttpUtils.post('policy/delete/' + item.id, {}, function (response) {
                $scope.list();
                Notification.success('操作成功');
            });
        });
    };
    $scope.select('config');
});


