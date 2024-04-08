CREATE TABLE `fs_order` (
         `id` varchar(50) NOT NULL,
         `workspace_id` varchar(40) NOT NULL DEFAULT '' COMMENT '工作空间ID',
         `status` varchar(20) NOT NULL DEFAULT '' COMMENT '状态',
         `apply_user` varchar(50) NOT NULL DEFAULT '' COMMENT '申请人',
         `create_time` bigint(13) NOT NULL COMMENT '创建时间',
         `process_id` varchar(50) DEFAULT NULL COMMENT '流程ID',
         `type` varchar(20) DEFAULT NULL COMMENT '类型',
         `description` varchar(255) DEFAULT NULL COMMENT '描述',
         PRIMARY KEY (`id`),
         KEY `IDX_GROUP_ID` (`workspace_id`),
         KEY `IDX_STATUS` (`status`),
         KEY `IDX_APPLY_USER` (`apply_user`),
         KEY `IDX_PROCESS_ID` (`process_id`),
         KEY `IDX_TYPE` (`type`),
         KEY `IDX_CREATE_TIME` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `fs_order_item` (
      `id` varchar(50) NOT NULL,
      `order_id` varchar(50) NOT NULL DEFAULT '' COMMENT '订单ID',
      `details` longtext NOT NULL COMMENT '订单内容',
      `status` varchar(20) DEFAULT NULL COMMENT '状态',
      `resource_type` varchar(20) DEFAULT NULL COMMENT '资源类型',
      `count` int(11) NOT NULL DEFAULT '1' COMMENT '数量',
      PRIMARY KEY (`id`),
      KEY `IDX_ORDER_ID` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `fs_order_item_log` (
      `id` int(11) NOT NULL AUTO_INCREMENT,
      `order_item_id` varchar(50) NOT NULL DEFAULT '' COMMENT '订单项ID',
      `resource_id` varchar(50) DEFAULT NULL COMMENT '资源ID',
      `create_time` bigint(13) NOT NULL COMMENT '创建时间',
      `operator` varchar(100) DEFAULT NULL COMMENT '操作人',
      `operation` varchar(50) DEFAULT NULL COMMENT '操作内容',
      `output` mediumtext COMMENT '输出',
      `result` tinyint(1) DEFAULT NULL COMMENT '结果',
      PRIMARY KEY (`id`),
      KEY `IDX_ITEM_ID` (`order_item_id`),
      KEY `IDX_RES_ID` (`resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

