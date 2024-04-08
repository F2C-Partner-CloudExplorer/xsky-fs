ProjectApp.service("OrderService", function (HttpUtils) {
    let self = this;

    this.initOrderProductInfo = function (order) {
        let orderItemList = order.orderItemList;
        for (let i = 0, len = orderItemList.length; i < len; i++) {
            let orderItem = orderItemList[i];
            orderItem.show = true;
            orderItem.details = angular.fromJson(orderItem.details);
        }
        order.orderItemList = orderItemList;
    };
});


ProjectApp.controller('OrderController', function ($scope, $mdDialog, $document, $mdBottomSheet, $state, HttpUtils, $timeout, FilterSearch, Notification, $interval, AuthService, eyeService, UserService, OrderService) {
    $scope.searchParam = angular.fromJson(sessionStorage.getItem("searchParam"));
    sessionStorage.removeItem("searchParam");

    $scope.conditions = [
        {key: "id", name: "订单号", directive: "filter-contains"},
        {
            key: "status", name: "订单状态", directive: "filter-select", selects: [
                {value: 'UNCHECKED', label: '审批中'},
                {value: 'APPROVED', label: '已审批'},
                // {value: 'TERMINATED', label: '已终止'},
                // {value: 'CANCELED', label: '已作废'},
                // {value: 'REJECTED', label: '已驳回'},
                {value: 'PROCESSING', label: '正在处理'},
                {value: 'FINISHED', label: '已完成'},
                {value: 'WARNING', label: '警告'},
                {value: 'ERROR', label: '异常'},
            ]
        },
        // {key: "applyUser", name: "申请人", directive: "filter-contains"},
        {key: "createTime", name: "申请时间", directive: "filter-date"},
    ];

    // 用于传入后台的参数
    $scope.filters = [];

    $scope.isAdmin = UserService.isAdmin();
    $scope.isUser = UserService.isUser();
    if(!$scope.isUser) {
        $scope.conditions.push(
            {
                key: "workspaceId",
                name: "工作空间",
                directive: "filter-select-ajax",
                url: "workspace/listAll",
                search: true,
                convert: {value: "id", label: "name"}
            }
        )
    }

    $scope.columns = [
        {key: "type", value: "订单类型", checked: true, sort: false},
        {key: "id", value: "订单号", checked: true, sort: false},
        {key: "workspace_id", value: "工作空间", checked: true, sort: false},
        {key: "account", value: "账号", checked: true, sort: false},
        {key: "create_time", value: "申请时间", checked: true, sort: false},
        {key: "name", value: "申请人", checked: true, sort: false},
        {key: "status", value: "状态", checked: true, sort: false},
        //{key: "relate_resource", value: "相关资源", checked: true, sort: false},
        {value: "", default: true, sort: false}
    ];

    $scope.showOrderDetail = function (order, type) {
        $scope.type = type;
        switch (order.type) {
            case 'CREATE_FOLDER':
                $scope.orderLoadingLayer = $scope.getOrderDetail(order.id, OrderService.initOrderProductInfo);
                $scope.formUrl = 'project/html/order/folder-view.html' + '?_t=' + Math.random();
                break;
            case 'UPDATE_FOLDER':
                $scope.orderLoadingLayer = $scope.getOrderDetail(order.id, OrderService.initOrderProductInfo);
                $scope.formUrl = 'project/html/order/folder-view.html' + '?_t=' + Math.random();
                break;
            case 'DELETE_FOLDER':
                $scope.orderLoadingLayer = $scope.getOrderDetail(order.id, OrderService.initOrderProductInfo);
                $scope.formUrl = 'project/html/order/delete-folder.html' + '?_t=' + Math.random();
                break;
            case 'CREATE_SHARE':
                $scope.orderLoadingLayer = $scope.getOrderDetail(order.id, OrderService.initOrderProductInfo);
                $scope.formUrl = 'project/html/order/share-view.html' + '?_t=' + Math.random();
                break;
            case 'UPDATE_SHARE':
                $scope.orderLoadingLayer = $scope.getOrderDetail(order.id, OrderService.initOrderProductInfo);
                $scope.formUrl = 'project/html/order/share-view.html' + '?_t=' + Math.random();
                break;
            case 'DELETE_SHARE':
                $scope.orderLoadingLayer = $scope.getOrderDetail(order.id, OrderService.initOrderProductInfo);
                $scope.formUrl = 'project/html/order/delete-share.html' + '?_t=' + Math.random();
                break;
            default:
                return;
        }
        $scope.toggleForm();
    };

    $scope.show = function (orderItem) {
        orderItem.show = !orderItem.show;
    };

    $scope.getOrderDetail = function (businessKey, callback) {
        return HttpUtils.get('order/detail/readonly/' + businessKey, function (response) {
            let currentOrder = response.data;
            $scope.currentProduct = currentOrder;
            $scope.currentOrder = currentOrder;
            if (callback && angular.isFunction(callback)) {
                callback(currentOrder);
            }
            $scope.getTaskLogs($scope, $scope.currentProduct.processId);
            $scope.getPricePolicy(businessKey);
        }, function (response) {
            Notification.alert(response.message)
        })
    };

    $scope.getTaskLogs = function($scope, processId){
        HttpUtils.get("flow/runtime/task/log/" + processId, function (response) {
            $scope.logs = response.data;
            $scope.logs.forEach(function (log) {
                if (log.taskExecutor) {
                    log.executors = log.taskExecutor.split(",");
                    log.executor = (log.executors.length > 1) ? (log.executors[0] + ", ...") : log.executors[0];
                }
            })
        });
    };

    $scope.getExtendInfo = function (item) {
        let itemInNewQueryResult = false;
        $scope.items.forEach(function (order) {
            if (item && order.id === item.id) {
                itemInNewQueryResult = true;
            }
        });
        if (itemInNewQueryResult === false) {
            return;
        }
        HttpUtils.get('order/extendinfo/' + item.id, function (response) {
            item.resources = {};
            item.bucketCount = response.data.bucketCount;
            if (response.data.status) {
                item.status = response.data.status;
                if (item.status === "PROCESSING" || item.status === "APPROVED") {
                    let promise = $timeout(function () {
                        $scope.getExtendInfo(item);
                    }, 5000);
                    $scope.timeOutPromises.push(promise);
                }
            }
        }, function () {
            item.resources = {};
        });
    };


    $scope.showOrderLog = function (order) {
        $scope.showLogOrderId = order.id;
        $scope.formUrl = 'project/html/order/order-log.html' + '?_t=' + Math.random();
        $scope.toggleForm();
    };


    $scope.closeDialog = function () {
        $mdDialog.cancel();
    };

    // $scope.goResource = function (item) {
    //     sessionStorage.setItem("orderBucketParam", angular.toJson({
    //             label: item.id,
    //             value: item.id
    //         }
    //     ));
    //     $state.go("bucket")
    // };

    $scope.timeOutPromises = [];

    $scope.$on("$destroy", function () {
        $scope.clearTimeoutPromises();
    });

    $scope.clearTimeoutPromises = function () {
        if ($scope.timeOutPromises) {
            $scope.timeOutPromises.forEach(function (promise) {
                $timeout.cancel(promise);
            });
            $scope.timeOutPromises = [];
        }
    };

    $scope.list = function (sortObj) {
        let condition = FilterSearch.convert($scope.filters);
        if (sortObj || $scope.sort) {
            $scope.sort = sortObj || $scope.sort;
        }
        if ($scope.sort) {
            condition.sort = $scope.sort.sql;
        }
        condition = condition ? condition : {};
        HttpUtils.paging($scope, 'order/list', condition, $scope.clearTimeoutPromises)
    };

    $scope.showOrderLog = function (order) {
        $scope.showLogOrderId = order.id;
        $scope.formUrl = 'project/html/order/order-log.html' + '?_t=' + Math.random();
        $scope.toggleForm();
    };


    $scope.list();

    $scope.getPricePolicy = function (orderId) {
        console.log(orderId)
        if (orderId) {
            let request = {
                "fsOrderId": orderId
            }
            HttpUtils.post("policy/getPricePolicy", request, function (resp) {
                console.log(resp.data)
                if (resp.data) {
                    $scope.currentOrder.orderItemList[0].totalPrice = (resp.data.capacityPrice * 1).toFixed(2);
                }
            })
        }
    }

});

ProjectApp.controller('OrderItemLogController', function ($scope, HttpUtils, $interval) {
    $scope.uri = "";
    $scope.id = "";
    if ($scope.showLogResourceId) {
        $scope.uri = "order/log/resourceId/";
        $scope.id = $scope.showLogResourceId;
    }
    if ($scope.showLogOrderId) {
        $scope.uri = "order/log/orderId/";
        $scope.id = $scope.showLogOrderId;
    }

    $scope.orderItemLogDTOs = [];

    $scope.destroyTimer = function () {
        if ($scope.timer) {
            $interval.cancel($scope.timer);
        }
    };

    $scope.$on("$destroy", function () {
        $scope.destroyTimer();
    });

    $scope.getLogs = function () {
        HttpUtils.get($scope.uri + $scope.id, function (response) {
            $scope.orderItemLogDTOs = response.data;
            let refresh = true;
            if ($scope.orderItemLogDTOs.length === 0) {
                refresh = false;
            }
            if (refresh && !$scope.timer) {
                $scope.timer = $interval($scope.getLogs, 5000);
            }
        });
    };
    $scope.getLogs();

});