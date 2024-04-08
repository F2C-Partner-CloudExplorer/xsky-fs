CREATE TABLE `fs_xsky_pool` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `account_id` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '设备',
        `name` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '名称',
        `pool_id` bigint(13) NOT NULL COMMENT '存储池id',
        `status` varchar(32) CHARACTER SET utf8 DEFAULT '' COMMENT '状态',
        `create_time` bigint(16) DEFAULT NULL COMMENT '创建时间',
        `update_time` bigint(16) DEFAULT NULL COMMENT '更新时间',
        PRIMARY KEY (`id`),
        KEY `IDX_XSKY_ENDPOINT` (`pool_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='存储池';

alter table fs_xsky_folder drop index `folder_id` ;