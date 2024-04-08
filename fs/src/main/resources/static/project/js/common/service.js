ProjectApp.service('operationArr', function () {
    this.removeByValue = function (arr, val) {
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] === val) {
                arr.splice(i, 1);
                break;
            }
        }
    };
});

ProjectApp.service('eyeService', function () {
    this.view = function (password, eye, type) {
        var passwordElement = angular.element(password);
        var eyeElement = angular.element(eye);
        eyeElement.removeClass();
        if (passwordElement[0].type === 'password') {
            if (type) {
                passwordElement[0].type = type;
            } else {
                passwordElement[0].type = 'text';
            }
            eyeElement.addClass("fa fa-eye-slash f2c-eye");
        } else {
            passwordElement[0].type = 'password';
            eyeElement.addClass("fa fa-eye f2c-eye");
        }
    };
});

ProjectApp.service('ProhibitPrompts', function () {
    this.changeType = function (passwordId) {
        var passwordIdSelect = "#" + passwordId;
        var passwordElement = angular.element(passwordIdSelect);
        if (passwordElement[0].type === 'text') {
            passwordElement[0].type = 'password';
        }
    };
});

/** 跳模块 */
ProjectApp.service('JumpService', function () {
    // 跳回
    this.jumpBak = function($scope) {
        if (!$scope.methodJump) {
            return;
        }
        $scope.methodJump = null;
        sessionStorage.setItem("jumpBak",
            angular.toJson({
                method: 'getEnvList'
            })
        );
        window.open($scope.jumpUrl,"_self")
    }
});