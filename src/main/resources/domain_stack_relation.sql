CREATE TABLE `domain_stack_relation` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `domain_id` int(11) DEFAULT NULL,
  `stack_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;