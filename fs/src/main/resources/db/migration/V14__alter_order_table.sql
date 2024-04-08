ALTER TABLE fs_order add COLUMN `organization_id` varchar(64)
    NOT NULL DEFAULT '' COMMENT '组织ID' after `workspace_id`;