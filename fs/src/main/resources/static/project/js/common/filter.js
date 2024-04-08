ProjectApp.filter('userSource', function () {
    return function (input) {
        if (input === 'local') {
            return '本地创建'
        }
        if (input === 'extra') {
            return '第三方'
        }

        return input;
    }
});

ProjectApp.filter('roleType', function () {
    return function (input) {
        if (input === 'System') {
            return '系统'
        }
        if (input === 'Additional') {
            return '自定义'
        }
    }
});


ProjectApp.filter('roleParentType', function () {
    return function (input) {
        if (input === 'ADMIN') {
            return '系统管理员'
        }
        if (input === 'ORGADMIN') {
            return '组织管理员'
        }
        if (input === 'USER') {
            return '工作空间用户'
        }
    }
});

ProjectApp.filter('moduleType', function () {
    return function (input) {
        if (input === 'oss') {
            return '对象存储'
        }
    }
});

ProjectApp.filter('resourceType', function () {
    return function (input) {
        if (input === 'USER') {
            return '用户'
        }
        if (input === 'WORKSPACE') {
            return '工作空间'
        }
        if (input === 'VIRTUALMACHINE') {
            return '云主机'
        }
        if (input === 'PRODUCT') {
            return '产品'
        }
    }
});

ProjectApp.filter('storageClassType', function () {
    return function (input) {
        if (input === 'Standard') {
            return '标准存储'
        }
        if (input === 'IA') {
            return '低频访问'
        }
        if (input === 'Archive') {
            return '归档存储'
        }
        if (input === 'Unknown') {
            return '未知类型'
        }
    }
});


ProjectApp.filter('formatBucketCapacityQuota', function () {
    return function (input) {
        if (input === 0) {
            return '无限制';
        }
        return input;
    }
});

ProjectApp.filter('isSyncXsky', function () {
    return function (input) {
        if (input === 0) {
            return '否';
        } else if (input === 1){
            return '是';
        }
        return input;
    }
});


ProjectApp.filter('convAccountId2Desc', function () {
    return function (input, array) {
        if (input && array && array.length > 0) {
            for (var i = 0; i < array.length; i++) {
                if (input == array[i].id) {
                    return array[i].description;
                }
            }
        }
        return input;
    };
});

ProjectApp.filter('convCostcenterId2Name', function () {
    return function (input, array) {
        if (input && array && array.length > 0) {
            for (var i = 0; i < array.length; i++) {
                if (input == array[i].id) {
                    return array[i].name;
                }
            }
        }
        return input;
    };
});

ProjectApp.filter('workSpaceId2Name', function () {
    return function (input, array) {
        if (input && array && array.length > 0) {
            for (var i = 0; i < array.length; i++) {
                if (input == array[i].id) {
                    return array[i].name;
                }
            }
        }
        return input;
    };
});

ProjectApp.filter('cmpUserName', function () {
    return function (input, array) {
        if (input && array && array.length > 0) {
            for (var i = 0; i < array.length; i++) {
                if (input == array[i].id) {
                    return array[i].name;
                }
            }
        }
        return input;
    };
});

ProjectApp.filter('convOsUserId2Name', function () {
    return function (input, array) {
        if (input && array && array.length > 0) {
            for (var i = 0; i < array.length; i++) {
                if (input == array[i].userId) {
                    return array[i].name;
                }
            }
        }
    }
});

ProjectApp.filter('formatBucketQuotaMaxSize', function () {
    return function (input) {
        if (input) {
            return (input / 1024 / 1024 / 1024).toFixed(1) + '';
        } else if (input == 0) {
            return '无限制';
        }
        return input + '';
    };
});


ProjectApp.filter('formatBoolean', function () {
    return function (input) {
        return input ? '是' : '否';
    }
});

ProjectApp.filter('KBToSize', function () {
    return function (bytes) {
        bytes *= 1024;
        if (bytes === 0) return '0 B';
        let k = 1024, // or 1024
            sizes = ['B', 'KB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB'],
            i = Math.floor(Math.log(bytes) / Math.log(k));

        return (bytes / Math.pow(k, i)).toPrecision(3) + ' ' + sizes[i];
    }
});

ProjectApp.filter('bytesToSize', function () {
    return function (bytes) {
        if (bytes === 0) return '0 B';
        let k = 1024, // or 1024
            sizes = ['B', 'KB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB'],
            i = Math.floor(Math.log(bytes) / Math.log(k));

        return (bytes / Math.pow(k, i)).toPrecision(3) + ' ' + sizes[i];
    }
});