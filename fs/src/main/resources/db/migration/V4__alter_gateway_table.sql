ALTER TABLE fs_xsky_gateway add COLUMN `status` varchar(32) CHARACTER SET utf8 DEFAULT '' COMMENT '状态' after `network_ip`;

ALTER TABLE fs_xsky_gateway add COLUMN `host_name` varchar(64) CHARACTER SET utf8 DEFAULT '' COMMENT '主机名' after `host_ip`;

ALTER TABLE fs_xsky_gateway add COLUMN `gateway_group_id` bigint(13) DEFAULT NULL COMMENT '网关组id' after `gateway_group_vip`;

ALTER TABLE fs_xsky_folder DROP COLUMN `qos_enabled`,
                           DROP COLUMN `progress`,
                           DROP COLUMN `snapshot_name`,
                           DROP COLUMN `fs_snapshot_num`,
                           DROP COLUMN `formatted`,
                           DROP COLUMN `flattened`,
                           DROP COLUMN `volume_status`,
                           DROP COLUMN `volume_name`;

ALTER TABLE fs_xsky_folder add COLUMN `total_iops` double DEFAULT NULL COMMENT '总IOPS' after `size`;
ALTER TABLE fs_xsky_folder add COLUMN `total_bandwidth_kbyte` double DEFAULT NULL COMMENT '总带宽' after `size`;
ALTER TABLE fs_xsky_folder add COLUMN `used_kbyte` double DEFAULT NULL COMMENT '使用' after `size`;

ALTER TABLE fs_xsky_folder MODIFY COLUMN `size` bigint(32) DEFAULT NULL COMMENT '大小';

