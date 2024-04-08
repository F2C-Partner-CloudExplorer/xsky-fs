alter table `fs_xsky_account` change `password` `token`
varchar(250) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT 'xsky token';