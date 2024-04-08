TaskApp.controller('OssOrderHandleController', function ($scope, HttpUtils, Notification, TaskLog) {
    $scope.getOrderDetail = function () {
        $scope.childLoadingLayer = HttpUtils.get('order/detail/' + $scope.businessKey, function (response) {
            let currentOrder = response.data;
            let orderItemList = currentOrder.orderItemList;
            for (let i = 0, len = orderItemList.length; i < len; i++) {
                let orderItem = orderItemList[i];
                orderItem.show = true;
                orderItem.details = angular.fromJson(orderItem.details);
            }
            currentOrder.orderItemList = orderItemList;
            $scope.currentProduct = currentOrder;
            TaskLog.execute($scope, $scope.currentProduct.processId);
            $scope.getPricePolicy(currentOrder.id, currentOrder)
        }, function (response) {
            Notification.alert(response.message)
        })
    };

    $scope.getPricePolicy = function (orderId, currentOrder) {
        console.log(orderId)
        let details = currentOrder.orderItemList[0].details;
        console.log(details)
        if (orderId) {
            let request = {
                "fsOrderId": orderId
            }
            HttpUtils.post("policy/getPricePolicy", request, function (resp) {
                console.log(resp.data)
                if (resp.data) {
                    $scope.currentProduct.orderItemList[0].totalPrice = (resp.data.capacityPrice * 1).toFixed(2);
                }
            })
        }
    }

    $scope.getOrderDetail();
});


