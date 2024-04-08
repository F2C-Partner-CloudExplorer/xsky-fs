ProjectApp.controller('AccountListController', function ($scope, HttpUtils, eyeService,
           Notification, FilterSearch, AuthService, $interval, $state, $window) {

    $scope.init = function () {
        $scope.filters = [];
        $scope.conditions = [
            {
                key: 'xskyEndpoint',
                name: 'XSKY地址',
                directive: 'filter-contains'
            },
            {
                key: 'status',
                name: '账号状态',
                directive: 'filter-select',
                selects: [
                    {label: '有效', value: 'VALID'},
                    {label: '无效', value: 'INVALID'}
                ]
            },
            {
                key: 'syncStatus',
                name: '同步状态',
                directive: 'filter-select',
                selects: [
                    {label: '同步成功', value: 'SUCCESS'},
                    {label: '同步失败', value: 'ERROR'},
                    {label: '同步中', value: 'SYNC'},
                    {label: '等待同步', value: 'PENDING'}
                ]
            }
        ];

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
            {key: 'platform', value: '存储类型'},
            {key: 'xskyEndpoint', value: 'xskyEndpoint'},
            {key: 'username', value: 'XSKY用户名'},
            {key: 'status', value: '账号状态', sort: false},
            {key: 'syncStatus', value: '同步状态', sort: false},
            {key: 'syncdAt', value: '上次同步时间'}
        ];

        HttpUtils.get("platform/getAll",function (resp) {
            $scope.platforms = resp.data;
        })

        $scope.list();
    };

    $scope.showDetail = function (item) {
        $scope.detail = item;
    };

    $scope.platforms=[];

    $scope.list = function (sorts) {
        var conditions = FilterSearch.convert($scope.filters);
        if (sorts) {
            $scope.sort = sorts;
        }
        if ($scope.sort) {
            conditions.sort = $scope.sort.sql;
        }
        HttpUtils.paging($scope, 'xsky/account/list', conditions);
    };

    $scope.add = function () {
        $scope.tmpList = {};
        $scope.item = {};
        $scope.formUrl = 'project/html/account/account-add.html?_t=' + window.appversion;
        $scope.toggleForm();
    };

    $scope.update = function (item) {
        $scope.tmpList = {};
        $scope.item = item;
        $scope.formUrl = 'project/html/account/account-update.html?_t=' + window.appversion;
        $scope.toggleForm();
    };

    $scope.delete = function (item) {
        Notification.confirm('将删除以下OSS账号，确认删除?', function () {
            $scope.loadingLayer = HttpUtils.get('xsky/account/delete/'+ item.id, function () {
                Notification.success('删除成功');
                $scope.list();
            }, function (response) {
                Notification.danger('删除失败, ' + response.message);
            });
        });
    };

    $scope.saveAccount = function (item, type) {

        if (type === 'create') {
            $scope.formLoadingLayer = HttpUtils.post('xsky/account/create', item, function () {
                Notification.success('创建成功');
                $scope.toggleForm();
                $scope.list();
            }, function (response) {
                Notification.danger('创建失败,' + response.message);
            });
        } else if (type === 'update') {
            $scope.formLoadingLayer = HttpUtils.post('xsky/account/update', item, function () {
                Notification.success('编辑成功');
                $scope.toggleForm();
                $scope.list();
            }, function (response) {
                Notification.danger('编辑失败,' + response.message);
            });
        }
    };

    $scope.validate = function (item) {
        $scope.loadingLayer = HttpUtils.get('xsky/account/validate/' + item.id, function () {
            Notification.success('校验成功,账号有效');
            $scope.list();
        }, function (response) {
            Notification.danger('校验失败,账号无效, ' + response.message);
            $scope.list();
        });
    };

    $scope.sync = function (item) {
        $scope.loadingLayer = HttpUtils.get('xsky/account/sync/'+ item.id, function () {
            Notification.success('同步成功');
            $scope.list();
        }, function (response) {
            Notification.danger('同步失败, ' + response.message);
            $scope.list();
        });
    };

    $scope.view = function (index) {
        eyeService.view('#password' + index, '#eye' + index);
    };

    $scope.checkStatus = function () {
        $scope.timer = $interval(function () {
            var condition = FilterSearch.convert($scope.filters);
            if ($scope.sort) {
                condition.sort = $scope.sort.sql;
            }

            HttpUtils.post("xsky/account/list/ " + $scope.pagination.page + "/" + $scope.pagination.limit, condition, function (response) {
                var items = response.data.listObject;
                for (var i = 0; i < items.length; i++) {
                    angular.forEach($scope.items, function (item) {
                        if (item.id === items[i].id) {
                            item.syncStatus = items[i].syncStatus;
                        }
                    });
                }
                var i = 0;
                angular.forEach($scope.items, function (item) {
                    if (item.syncStatus === 'sync') {
                        i++;
                    }
                });
                if (i > 0) {
                    $scope.syncStatusCancel = true;
                } else {
                    $scope.syncStatusCancel = false;
                }
            });
        }, 10000);
    };

    $scope.checkStatus();

    $scope.$watch('syncStatusCancel', function (newValue) {

        if (!newValue) {
            if ($scope.timer) {
                $interval.cancel($scope.timer);
            }
            $scope.syncStatusCancel = false;
        }
    });

    $scope.$on("$destroy", function () {
        if ($scope.timer) {
            $interval.cancel($scope.timer);
        }
    });
});