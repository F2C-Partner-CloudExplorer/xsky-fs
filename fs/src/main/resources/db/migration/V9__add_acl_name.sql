ALTER TABLE fs_xsky_smb_share_acl add COLUMN `acl_name` varchar(64) DEFAULT '' COMMENT '名称' after `share_id`;
ALTER TABLE fs_xsky_nfs_share_acl add COLUMN `acl_name` varchar(64) DEFAULT '' COMMENT '名称' after `share_id`;
ALTER TABLE fs_xsky_ftp_share_acl add COLUMN `acl_name` varchar(64) DEFAULT '' COMMENT '名称' after `share_id`;