// ProjectApp.controller('GatewayController', function ($scope, $mdDialog, $document,
//            $mdBottomSheet, HttpUtils, FilterSearch, Notification, eyeService, $window) {
//
//     $scope.init = function () {
//         $scope.filters = [];
//         $scope.conditions = [
//             {
//                 key: 'name',
//                 name: '名称',
//                 directive: 'filter-contains'
//             }
//         ];
//
//         $scope.columns = [
//             {key: 'id', value: '序号'},
//             {key: 'name', value: '名称'},
//             {key: 'email', value: '状态'},
//             {key: 'accountId', value: '支持的协议'},
//             {key: 'bucketNum', value: '网关服务器'},
//             {key: 'status', value: '网卡'},
//             {key: 'costcenterId', value: '网关状态'},
//             {key: 'groupId', value: '虚拟IP/掩码'},
//             {key: 'createTime', value:'创建时间'}
//         ];
//
//         $scope.list();
//     };
//
//     $scope.list = function (sorts) {
//         var conditions = FilterSearch.convert($scope.filters);
//         if (sorts) {
//             $scope.sort = sorts;
//         }
//         if ($scope.sort) {
//             conditions.sort = $scope.sort.sql;
//         }
//         HttpUtils.paging($scope, 'xsky/gateway/list', conditions);
//     };
//
//     $scope.init();
//
// });

ProjectApp.controller('GatewayGroupController', function ($scope, $mdDialog, $document,
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
                key: 'vip',
                name: '虚拟IP',
                directive: 'filter-contains'
            }
        ];

        $scope.columns = [
            {key: 'id', value: '序号', checked: true},
            {key: 'name', value: '名称', checked: true},
            {key: 'status', value: '状态', checked: true},
            {key: 'smbenabled', value: 'SMB/CIFS', checked: true},
            {key: 'nfsenabled', value: 'NFS', checked: true},
            {key: 'ftpenabled', value: 'FTP', checked: true},
            {key: 'gatewayHosts', value: '网关服务器', checked: true},
            {key: 'gatewayNetworks', value: '网卡', checked: true},
            {key: 'gatewayStatus', value:'网关状态', checked: true},
            {key: 'gatewayVipAndVipMasks', value:'虚拟IP/掩码', checked: true},
            {key: 'createTime', value:'创建时间', checked: true}
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
        HttpUtils.paging($scope, 'xsky/gatewayGroup/list', conditions);
    };

    $scope.init();

});





