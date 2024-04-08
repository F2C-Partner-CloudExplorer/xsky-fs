CREATE TABLE `fs_xsky_user` (
            `id` int(11) NOT NULL AUTO_INCREMENT,
            `name` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '名称',
            `user_id` bigint(13) NOT NULL COMMENT '用户id',
            `password` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '密码',
            `fs_user_group_num` bigint(11) DEFAULT NULL COMMENT '所属用户组数目',
            `fs_user_group_ids` text COLLATE utf8_bin COMMENT '所属用户组组id',
            `action_status` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT '密码',
            `account_id` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT 'xsky账号id',
            `create_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
            `update_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
            PRIMARY KEY (`id`),
            KEY `IDX_XSKY_ENDPOINT` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户';

CREATE TABLE `fs_xsky_user_group` (
              `id` int(11) NOT NULL AUTO_INCREMENT,
              `name` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '名称',
              `user_group_id` bigint(13) NOT NULL COMMENT '客户端id',
              `user_num` bigint(11) DEFAULT NULL COMMENT '客户端数目',
              `user_ids` text COLLATE utf8_bin COMMENT '客户端id',
              `action_status` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT 'ip',
              `account_id` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT 'xsky账号',
              `create_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
              `update_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
              PRIMARY KEY (`id`),
              KEY `IDX_XSKY_ENDPOINT` (`user_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户组';

ALTER TABLE fs_xsky_folder add COLUMN `pool_id` bigint(11) DEFAULT NULL COMMENT '池id' after `pool_name`;