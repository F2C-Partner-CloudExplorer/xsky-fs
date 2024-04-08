create table if not exists `fs_xsky_platform` (
    `id` varchar(50) not null,
    `platform` varchar(64) NOT NULL COMMENT '存储类型',
    `remark` varchar(255) COMMENT '备注',
    primary key (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '存储类型表';

alter table `fs_xsky_account` add `platform` varchar(64) NOT NULL COMMENT '存储类型';