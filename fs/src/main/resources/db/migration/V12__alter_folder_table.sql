ALTER TABLE fs_xsky_folder add COLUMN `gateway_group_id` bigint(11) DEFAULT NULL COMMENT '文件网关组id' after `pool_id`;
ALTER TABLE fs_xsky_folder add COLUMN `gateway_group_name` varchar(64) NULL COMMENT '文件网关组' after `pool_id`;
