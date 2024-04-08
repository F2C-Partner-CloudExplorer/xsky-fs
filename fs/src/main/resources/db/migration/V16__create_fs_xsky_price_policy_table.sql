CREATE TABLE IF NOT EXISTS `fs_xsky_price_policy` (
    `id` varchar(50) NOT NULL,
    `platform` varchar(64) NOT NULL COMMENT '存储类型',
    `capacity_price` decimal(7,4) DEFAULT NULL COMMENT '容量(元/GB)',
    `env` varchar(64) NULL COMMENT '环境',
    PRIMARY KEY (`id`),
    KEY `IDX_CAPACITY_PRICE` (`capacity_price`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;