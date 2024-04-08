ALTER TABLE fs_xsky_client add COLUMN `workspace` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '工作空间' after `account_id`;
ALTER TABLE fs_xsky_client add COLUMN `organization` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '组织' after `workspace`;

ALTER TABLE fs_xsky_client_group add COLUMN `workspace` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '工作空间' after `account_id`;
ALTER TABLE fs_xsky_client_group add COLUMN `organization` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '组织' after `workspace`;

ALTER TABLE fs_xsky_folder add COLUMN `workspace` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '工作空间' after `account_id`;
ALTER TABLE fs_xsky_folder add COLUMN `organization` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '组织' after `workspace`;

ALTER TABLE fs_xsky_user add COLUMN `workspace` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '工作空间' after `account_id`;
ALTER TABLE fs_xsky_user add COLUMN `organization` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '组织' after `workspace`;

ALTER TABLE fs_xsky_user_group add COLUMN `workspace` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '工作空间' after `account_id`;
ALTER TABLE fs_xsky_user_group add COLUMN `organization` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '组织' after `workspace`;
