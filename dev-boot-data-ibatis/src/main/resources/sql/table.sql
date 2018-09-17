CREATE TABLE `task_info` (
  `uid`         varchar(100) NOT NULL,
  `remark`      varchar(200)      DEFAULT NULL,
  `create_time` timestamp    NULL DEFAULT NULL,
  `create_ac`   varchar(100)      DEFAULT NULL,
  PRIMARY KEY (`uid`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1