CREATE TABLE `fs_xsky_account` (
       `id` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
       `name` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '名称',
       `xsky_endpoint` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT 'xsky endpoint',
       `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT 'xsky username',
       `password` varchar(128) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT 'xsky password',
       `status` varchar(16) COLLATE utf8_bin DEFAULT 'PENDING' COMMENT 'OSS账号状态',
       `sync_status` varchar(16) COLLATE utf8_bin DEFAULT 'PENDING' COMMENT 'OSS资源同步状态',
       `syncd_at` bigint(14) DEFAULT NULL COMMENT '上次资源同步时间',
       PRIMARY KEY (`id`),
       KEY `IDX_XSKY_ENDPOINT` (`xsky_endpoint`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `fs_xsky_client` (
      `id` int(11) NOT NULL AUTO_INCREMENT,
      `name` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '名称',
      `client_id` bigint(13) NOT NULL COMMENT '客户端id',
      `ip` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT 'ip',
      `client_group_num` bigint(11) DEFAULT NULL COMMENT '所属客户端组数目',
      `client_group_ids` text COLLATE utf8_bin COMMENT '所属客户端组id',
      `account_id` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT 'xsky账号id',
      `create_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
      `update_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
      PRIMARY KEY (`id`),
      KEY `IDX_XSKY_ENDPOINT` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='客户端';

CREATE TABLE `fs_xsky_client_group` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `name` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '名称',
        `client_group_id` bigint(13) NOT NULL COMMENT '客户端id',
        `client_num` bigint(11) DEFAULT NULL COMMENT '客户端数目',
        `client_ids` text COLLATE utf8_bin COMMENT '客户端id',
        `action_status` varchar(32) CHARACTER SET utf8 DEFAULT '' COMMENT 'ip',
        `account_id` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT 'xsky账号',
        `create_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
        `update_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
        PRIMARY KEY (`id`),
        KEY `IDX_XSKY_ENDPOINT` (`client_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='客户端组';

CREATE TABLE `fs_xsky_folder` (
      `id` int(11) NOT NULL AUTO_INCREMENT,
      `name` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '名称',
      `folder_id` bigint(13) NOT NULL COMMENT '文件系统id',
      `access_member_num` bigint(11) DEFAULT NULL COMMENT '访问成员数目',
      `access_path_name` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT '访问路径名',
      `action_status` varchar(32) CHARACTER SET utf8 DEFAULT '' COMMENT '状态',
      `volume_name` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT '块存储卷名',
      `volume_status` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT '块存储卷状态',
      `flattened` tinyint(1) DEFAULT NULL,
      `formatted` tinyint(1) DEFAULT NULL,
      `fs_quota_tree_num` bigint(11) DEFAULT NULL COMMENT '配额树数目',
      `fs_snapshot_num` bigint(11) DEFAULT NULL COMMENT '快照数',
      `snapshot_name` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT '快照名称',
      `pool_name` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT '池名称',
      `progress` double DEFAULT NULL COMMENT '进程',
      `status` varchar(32) CHARACTER SET utf8 DEFAULT '' COMMENT '状态',
      `qos_enabled` tinyint(1) DEFAULT NULL,
      `shared` tinyint(1) DEFAULT NULL COMMENT '共享',
      `size` bigint(13) DEFAULT NULL COMMENT '大小',
      `description` varchar(128) CHARACTER SET utf8 DEFAULT '' COMMENT '描述',
      `account_id` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT 'xsky账号',
      `create_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
      `update_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
      PRIMARY KEY (`id`),
      UNIQUE KEY `folder_id` (`folder_id`),
      KEY `IDX_XSKY_ENDPOINT` (`folder_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='文件系统表';

CREATE TABLE `fs_xsky_gateway` (
       `id` int(11) NOT NULL AUTO_INCREMENT,
       `account_id` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '账号',
       `name` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '名称',
       `gateway_id` bigint(13) NOT NULL COMMENT '网关id',
       `vip` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT 'vip',
       `gateway_group_vip` varchar(64) COLLATE utf8_bin DEFAULT '' COMMENT '网关组id',
       `host_ip` varchar(64) COLLATE utf8_bin DEFAULT '' COMMENT '主机地址',
       `network_ip` varchar(64) COLLATE utf8_bin DEFAULT '' COMMENT '网络地址',
       `create_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
       `update_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
       PRIMARY KEY (`id`),
       KEY `IDX_XSKY_ENDPOINT` (`gateway_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='网关';

CREATE TABLE `fs_xsky_gateway_group` (
     `id` int(11) NOT NULL AUTO_INCREMENT,
     `name` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '名称',
     `gateway_group_id` bigint(13) NOT NULL COMMENT '网关组id',
     `vip` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT 'vip',
     `vip_mask` bigint(11) DEFAULT NULL COMMENT 'vip掩码',
     `port` bigint(11) DEFAULT NULL COMMENT '端口',
     `access_group_num` bigint(11) DEFAULT NULL COMMENT '访问组数',
     `folder_num` bigint(11) DEFAULT NULL COMMENT '文件系统数',
     `security` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT '安全',
     `types` varchar(512) CHARACTER SET utf8 DEFAULT '' COMMENT '描述',
     `status` varchar(32) CHARACTER SET utf8 DEFAULT '' COMMENT '状态',
     `action_status` varchar(32) CHARACTER SET utf8 DEFAULT '' COMMENT '状态',
     `encoding` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT '编码',
     `description` varchar(128) CHARACTER SET utf8 DEFAULT '' COMMENT '描述',
     `account_id` varchar(64) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '账号',
     `create_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
     `update_time` bigint(16) DEFAULT NULL COMMENT '上次资源同步时间',
     PRIMARY KEY (`id`),
     KEY `IDX_XSKY_ENDPOINT` (`gateway_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='网关组';