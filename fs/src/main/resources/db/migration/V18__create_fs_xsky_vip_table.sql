create table if not exists `fs_xsky_vip`(
    `id` int(11) not null AUTO_INCREMENT,
    `account_id` varchar(64) not null comment '所属设备',
    `vip` varchar(11) NOT NULL COMMENT '虚拟ip',
    `vip_id` bigint(13) NOT NULL COMMENT '虚拟ip Id',
    `vip_mask` bigint(10) not null comment '掩码',
    `gateway_id` bigint(10) not null comment '网关id',
    `gateway_group_id` bigint(10) not null comment '网关组id',
    primary key (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 comment '虚拟ip表';