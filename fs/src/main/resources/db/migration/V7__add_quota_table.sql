CREATE TABLE `fs_configuration` (
         `id` int(11) NOT NULL AUTO_INCREMENT,
         `workspace_id` varchar(40) DEFAULT NULL COMMENT '工作空间ID',
         `_key` varchar(100) NOT NULL DEFAULT '' COMMENT '标识',
         `_value` longtext COMMENT '值',
         `last_update_by` varchar(100) DEFAULT NULL COMMENT '上次更新人',
         `last_update_time` bigint(14) NOT NULL COMMENT '上次更新时间',
         PRIMARY KEY (`id`),
         KEY `IDX_KEY` (`_key`),
         KEY `IDX_GROUP` (`workspace_id`),
         KEY `IDX_LAST_UPDATE` (`last_update_by`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;