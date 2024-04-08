ALTER TABLE fs_xsky_folder add COLUMN `share_types`
    varchar(128) CHARACTER SET utf8 NOT NULL default '' COMMENT '已共享类型' after `description`;