ProjectApp.controller('BucketTypeController', function ($scope, HttpUtils, FilterSearch, Notification, AuthService, $filter) {
    $scope.select = function () {
        $scope.formUrl = 'project/html/buckettype/bucket-type-edit.html' + '?_t=' + window.appversion;

        $scope.columns = [
            {value: '存储类型', key: "platform", sort: false},
            {value: '备注', key: "remark", sort: false},
        ];
        if (AuthService.hasPermissions("POLICY:READ+EDIT,POLICY:READ+DELETE")) {
            $scope.columns.push({value: "", default: true, sort: false});
        }
        $scope.list();
    };

    $scope.platforms = [];

    $scope.editBucketTypeForm = function (item) {
        $scope.item = angular.copy(item);
        $scope.toggleForm();
    };

    $scope.editBucketTypeSubmit = function (item) {
        let url = item.id ? 'platform/update' : 'platform/add';
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
        HttpUtils.paging($scope, 'platform/list', condition)
    };

    $scope.deleteBucketType = function (item) {
        Notification.confirm('确认删除' + '?', function () {
            // 确认删除
            HttpUtils.post('platform/delete/' + item.id, {}, function (response) {
                $scope.list();
                Notification.success('操作成功');
            });
        });
    };
    $scope.select('config');
});


