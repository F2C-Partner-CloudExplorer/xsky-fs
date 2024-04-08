let CommonApp = angular.module('CommonApp', ['f2c.common']);

let TaskApp = angular.module('TaskApp', ['CommonApp']);

// TaskApp.filter("toTrusted", ['$sce', function ($sce) {
//     return function (text) {
//         if (text) {
//             return $sce.trustAs($sce.HTML, text);
//         } else {
//             return null;
//         }
//     }
// }]);

TaskApp.controller('OrderHandleController', function ($scope, $document, $window, HttpUtils, Notification) {
    $scope.businessKey = window.businessKey;
    $scope.taskId = window.taskId;
    $scope.commit = false;

    $scope.orderUrl = {
        folder_delete: 'project/html/order/order-handle.html',
        share_delete: 'project/html/order/order-handle.html',
        folder_create: 'project/html/order/order-handle.html',
        folder_update: 'project/html/order/order-handle.html',
        share_create: 'project/html/order/order-handle.html',
        share_update: 'project/html/order/order-handle.html',
    };

    $scope.request = {
        remarks: "",
        taskId: $scope.taskId,
    };

    $scope.getOrderStatus = function () {
        $scope.loadingLayer = HttpUtils.get('order/status/' + $scope.businessKey, function (response) {
            $scope.orderStatus = response.data;
        }, function (response) {
            Notification.alert(response.message);
        })
    };

    $scope.getModelId = function () {
        $scope.loadingLayer = HttpUtils.get('order/process/' + $scope.businessKey, function (response) {
            let orderInfo = response.data;
            $scope.url = $scope.orderUrl[orderInfo.modelId];
            $scope.request.order = orderInfo;
        }, function (response) {
            Notification.alert(response.message);
        })
    };

    $scope.complete = function () {
        $scope.commit = true;
        $scope.submitLoadingLayer = HttpUtils.post('order/approval', $scope.request, function () {
            $scope.refresh();
            $scope.cancel();
            $scope.commit = false;
        }, function (response) {
            $scope.commit = false;
            Notification.alert(response.message);
        })
    };

    $scope.reject = function () {
        Notification.confirm('确认驳回?', function () {
            $scope.task = {
                taskId: $scope.taskId,
                taskRemarks: $scope.request.remarks
            };
            $scope.loadingLayer = HttpUtils.post('task/reject', $scope.task, function () {
                $scope.refresh();
            }, function (response) {
                Notification.alert(response.message);
            })
        });
    };

    $scope.cancel = function () {
        let frame = angular.element($window.parent.document).find("#frame");
        frame.attr("src", "");
    };

    $scope.refresh = function () {
        $window.parent.api.tasks();
    };

    $scope.getOrderStatus();
    $scope.getModelId();
});

TaskApp.directive("orderReadOnly", function () {
    return {
        replace: true,
        template: '<div ng-include="url"></div>',
        scope: {
            currentProduct: "=",
        },
        link: function ($scope, element, attr, ctrl) {
            $scope.url = "project/html/order/order-read-only.html";
            $scope.show = function (orderItem) {
                orderItem.show = !orderItem.show;
            };
        }
    };
});

TaskApp.service('TaskLog', function (HttpUtils) {
    this.execute = function ($scope, processId) {
        HttpUtils.get("flow/runtime/task/log/" + processId, function (response) {
            $scope.logs = response.data;
            $scope.logs.forEach(function (log) {
                if (log.taskExecutor) {
                    log.executors = log.taskExecutor.split(",");
                    log.executor = (log.executors.length > 1) ? (log.executors[0] + ", ...") : log.executors[0];
                }
            })
        });
    }
});
