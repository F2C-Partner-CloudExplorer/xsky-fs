CREATE TABLE `fs_xsky_nfs_share_acl` (
         `id` int(11) NOT NULL AUTO_INCREMENT,
         `acl_id` bigint(13) NOT NULL COMMENT 'Acl id',
         `share_id` bigint(13) NOT NULL COMMENT '客户端id',
         `permission` varchar(64) DEFAULT '' COMMENT '权限',
         `client_id` bigint(11) DEFAULT NULL COMMENT '客户端id',
         `client_group_id` bigint(11) DEFAULT NULL COMMENT '客户端组id',
         `type` varchar(64) NOT NULL DEFAULT '' COMMENT '类型',
         `account_id` varchar(64) NOT NULL DEFAULT '' COMMENT '所属设备',
         `create_time` bigint(16) DEFAULT NULL COMMENT '创建时间',
         `update_time` bigint(16) DEFAULT NULL COMMENT '更新时间',
         PRIMARY KEY (`id`),
         KEY `IDX_XSKY_ENDPOINT` (`share_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='nfs acl共享';

CREATE TABLE `fs_xsky_nfs_share` (
                                     `id` int(11) NOT NULL AUTO_INCREMENT,
                                     `name` varchar(64) NOT NULL DEFAULT '' COMMENT '名称',
                                     `share_id` bigint(13) NOT NULL COMMENT '客户端id',
                                     `folder_id` bigint(13) NOT NULL COMMENT '文件系统id',
                                     `folder_name` varchar(64) DEFAULT '' COMMENT '文件系统名',
                                     `gateway_group_id` bigint(13) COMMENT '文件网关组id',
                                     `gateway_group_name` varchar(64) DEFAULT '' COMMENT '文件网关组名',
                                     `acl_num` bigint(11) DEFAULT NULL COMMENT '所属客户端组数目',
                                     `account_id` varchar(64) NOT NULL DEFAULT '' COMMENT '所属设备',
                                     `status` varchar(64) NOT NULL DEFAULT '' COMMENT '状态',
                                     `create_time` bigint(16) DEFAULT NULL COMMENT '创建时间',
                                     `update_time` bigint(16) DEFAULT NULL COMMENT '更新时间',
                                     `path_id` bigint(13) NOT NULL COMMENT '文件目录id',
                                     `path_name` varchar(64) DEFAULT '' COMMENT '文件目录地址',
                                     `workspace` varchar(64) DEFAULT NULL COMMENT '工作空间',
                                     `organization` varchar(64) DEFAULT NULL COMMENT '组织',
                                     PRIMARY KEY (`id`),
                                     KEY `IDX_XSKY_ENDPOINT` (`share_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='nfs共享';

CREATE TABLE `fs_xsky_smb_share` (
         `id` int(11) NOT NULL AUTO_INCREMENT,
         `name` varchar(64) NOT NULL DEFAULT '' COMMENT '名称',
         `folder_id` bigint(13) NOT NULL COMMENT '文件系统id',
         `folder_name` varchar(64) DEFAULT '' COMMENT '文件系统名',
         `share_id` bigint(13) NOT NULL COMMENT '客户端id',
         `gateway_group_id` bigint(13) COMMENT '文件网关组id',
         `gateway_group_name` varchar(64) DEFAULT '' COMMENT '文件网关组名',
         `acl_num` bigint(11) DEFAULT NULL COMMENT '所属客户端组数目',
         `account_id` varchar(64) NOT NULL DEFAULT '' COMMENT '所属设备',
         `status` varchar(64) NOT NULL DEFAULT '' COMMENT '状态',
         `create_time` bigint(16) DEFAULT NULL COMMENT '创建时间',
         `update_time` bigint(16) DEFAULT NULL COMMENT '更新时间',
         `path_id` bigint(13) NOT NULL COMMENT '文件目录id',
         `path_name` varchar(64) DEFAULT '' COMMENT '文件目录地址',
         `workspace` varchar(64) DEFAULT NULL COMMENT '工作空间',
         `organization` varchar(64) DEFAULT NULL COMMENT '组织',
         PRIMARY KEY (`id`),
         KEY `IDX_XSKY_ENDPOINT` (`share_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='smb共享';

CREATE TABLE `fs_xsky_smb_share_acl` (
                 `id` int(11) NOT NULL AUTO_INCREMENT,
                 `acl_id` bigint(13) NOT NULL COMMENT 'Acl id',
                 `share_id` bigint(13) NOT NULL COMMENT '客户端id',
                 `permission` varchar(64) DEFAULT '' COMMENT '权限',
                 `user_id` bigint(11) DEFAULT NULL COMMENT '客户端id',
                 `user_group_id` bigint(11) DEFAULT NULL COMMENT '客户端组id',
                 `type` varchar(64) NOT NULL DEFAULT '' COMMENT '类型',
                 `account_id` varchar(64) NOT NULL DEFAULT '' COMMENT '所属设备',
                 `create_time` bigint(16) DEFAULT NULL COMMENT '创建时间',
                 `update_time` bigint(16) DEFAULT NULL COMMENT '更新时间',
                 PRIMARY KEY (`id`),
                 KEY `IDX_XSKY_ENDPOINT` (`share_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='nfs共享';

CREATE TABLE `fs_xsky_ftp_share` (
             `id` int(11) NOT NULL AUTO_INCREMENT,
             `name` varchar(64) NOT NULL DEFAULT '' COMMENT '名称',
             `share_id` bigint(13) NOT NULL COMMENT '共享id',
             `folder_id` bigint(13) NOT NULL COMMENT '文件系统id',
             `folder_name` varchar(64) DEFAULT '' COMMENT '文件系统名',
             `gateway_group_id` bigint(13) COMMENT '文件网关组id',
             `gateway_group_name` varchar(64) DEFAULT '' COMMENT '文件网关组名',
             `acl_num` bigint(11) DEFAULT NULL COMMENT '所属客户端组数目',
             `account_id` varchar(64) NOT NULL DEFAULT '' COMMENT '所属设备',
             `status` varchar(64) NOT NULL DEFAULT '' COMMENT '状态',
             `create_time` bigint(16) DEFAULT NULL COMMENT '创建时间',
             `update_time` bigint(16) DEFAULT NULL COMMENT '更新时间',
             `path_id` bigint(13) NOT NULL COMMENT '文件目录id',
             `path_name` varchar(64) DEFAULT '' COMMENT '文件目录地址',
             `workspace` varchar(64) DEFAULT NULL COMMENT '工作空间',
             `organization` varchar(64) DEFAULT NULL COMMENT '组织',
             PRIMARY KEY (`id`),
             KEY `IDX_XSKY_ENDPOINT` (`share_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='ftp共享';

CREATE TABLE `fs_xsky_ftp_share_acl` (
                                         `id` int(11) NOT NULL AUTO_INCREMENT,
                                         `acl_id` bigint(13) NOT NULL COMMENT 'Acl id',
                                         `share_id` bigint(13) NOT NULL COMMENT '客户端id',
                                         `user_id` bigint(11) DEFAULT NULL COMMENT '客户端id',
                                         `user_group_id` bigint(11) DEFAULT NULL COMMENT '客户端组id',
                                         `create_enabled` tinyint(1) NOT NULL COMMENT '创建',
                                         `upload_enabled` tinyint(1) NOT NULL COMMENT '上传',
                                         `upload_bandwidth` bigint(11) DEFAULT NULL COMMENT '上传带宽',
                                         `download_enabled` tinyint(1) NOT NULL COMMENT '下载',
                                         `download_bandwidth` bigint(11) DEFAULT NULL COMMENT '上传带宽',
                                         `list_enabled` tinyint(1) NOT NULL COMMENT '查看',
                                         `rename_enabled` tinyint(1) NOT NULL COMMENT '重命名',
                                         `delete_enabled` tinyint(1) NOT NULL COMMENT '删除',
                                         `type` varchar(64) NOT NULL DEFAULT '' COMMENT '类型',
                                         `account_id` varchar(64) NOT NULL DEFAULT '' COMMENT '所属设备',
                                         `create_time` bigint(16) DEFAULT NULL COMMENT '创建时间',
                                         `update_time` bigint(16) DEFAULT NULL COMMENT '更新时间',
                                         PRIMARY KEY (`id`),
                                         KEY `IDX_XSKY_ENDPOINT` (`share_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='nfs共享';

