CREATE TABLE `stack` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT NULL,
  `desc` varchar(512) DEFAULT '',
  `githubUrl` varchar(256) DEFAULT NULL,
  `officialUrl` varchar(256) DEFAULT NULL,
  `starNum` int(11) DEFAULT NULL,
  `icon` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;