/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


CREATE TABLE `cotton_batch` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `production_code` bigint(10) unsigned NOT NULL COMMENT '产品批号',
  `colour_w1` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '白棉1',
  `colour_w2` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '白棉2',
  `colour_w3` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '白棉3',
  `colour_w4` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '白棉4',
  `colour_w5` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '白棉5',
  `colour_l1` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡棉1',
  `colour_l2` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡棉2',
  `colour_l3` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡棉3',
  `colour_ly1` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡黄1',
  `colour_ly2` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡黄2',
  `colour_ly3` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡黄3',
  `colour_y1` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '黄染1',
  `colour_y2` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '黄染2',
  `ginning_p1` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '轧工  P1',
  `ginning_p2` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '轧工  P2',
  `ginning_p3` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '轧工  P3',
  `avg_length` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '长度均值',
  `avg_micronaire` double(12,5) NOT NULL DEFAULT '0.00000' COMMENT '马克隆平均值',
  `avg_evenness` double(12,5) NOT NULL DEFAULT '0.00000' COMMENT '长整均值',
  `strength` double(12,5) NOT NULL DEFAULT '0.00000' COMMENT '强度',
  `miscellaneous` double(12,5) NOT NULL DEFAULT '0.00000' COMMENT '含杂',
  `factory` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '加工厂',
  `production_area` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '产地',
  `warehouse` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '存放仓库',
  `remark` varchar(200) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ;


 CREATE TABLE `cotton_template` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '模板名称',
  `creator_id` bigint(10) unsigned NOT NULL COMMENT '创建者ID',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `range_strategy` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `template_id` bigint(10) unsigned NOT NULL COMMENT '所属模板ID',
  `min` double(12,5) unsigned NOT NULL COMMENT '最小值',
  `max` double(12,5) unsigned NOT NULL COMMENT '最大值',
  `type` tinyint(4) unsigned NOT NULL COMMENT '策略类别',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `price` double(12,5) NOT NULL DEFAULT '0.00000' COMMENT '升贴价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ;



CREATE TABLE `ratio_strategy` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `template_id` bigint(10) unsigned NOT NULL COMMENT '所属模板ID',
  `colour_w1` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '白棉1',
  `colour_w2` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '白棉2',
  `colour_w3` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '白棉3',
  `colour_w4` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '白棉4',
  `colour_w5` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '白棉5',
  `colour_l1` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡棉1',
  `colour_l2` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡棉2',
  `colour_l3` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡棉3',
  `colour_ly1` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡黄1',
  `colour_ly2` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡黄2',
  `colour_ly3` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '淡黄3',
  `colour_y1` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '黄染1',
  `colour_y2` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '黄染2',
  `ginning_p1` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '轧工  P1',
  `ginning_p2` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '轧工  P2',
  `ginning_p3` double(12,5) unsigned NOT NULL DEFAULT '0.00000' COMMENT '轧工  P3',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ;

#棉花期货  批量
DROP TABLE IF EXISTS `futures_batch`;
CREATE TABLE `futures_batch` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `production_code` bigint(10) unsigned NOT NULL COMMENT '产品批号',
  `w1` DOUBLE (12,5) unsigned not null DEFAULT  '0' comment '白棉1',
   `w2` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '白棉2',
 `w3` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '白棉3',
  `w4` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '白棉4',
  `w5` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '白棉5',
  `l1` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '淡棉1',
  `l2` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '淡棉2',
  `l3` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '淡棉3',
  `1y1` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '淡黄1',
  `ly2` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '淡黄2',
  `ly3` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '淡黄3',
  `y1` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '黄染1',
  `y2` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '黄染2',
  `ginning_p1` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '轧工  P1',
  `ginning_p2` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '轧工  P2',
  `ginning_p3` double(12,5) unsigned NOT NULL DEFAULT '0'COMMENT '轧工  P3',
  `avg_length` double(12,5) unsigned not null  default '0' COMMENT '长度均值',
  `avg_micronaire` double(12,5) not null  default '0' COMMENT '马克隆平均值',
  `avg_evenness` double(12,5) not null  default '0' COMMENT '长整均值',
  `strength` double(12,5) not null  default '0' COMMENT '强度',
  `miscellaneous` double(12,5) not null  default '0' COMMENT '含杂',

  `type` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin default '' COMMENT '类型  手摘 机采',
  `production_area` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '产地',
  `count` int(11) not null  default '0' COMMENT '件数',
  `price` varchar(10) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '价格',
  `weight` int(11) not null  default '0' COMMENT '重量',
  `colour_level` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '颜色级',
  `moisture` int(11) not null  default '0' COMMENT '回潮',
  `ginning_quality` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '轧工  P2...',
  `warehouse` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '存放仓库',

  `weight_number` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '重量证书编号',
  `standard` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '执行标准',
  `gross_weight` int(11) not null  default '0' COMMENT '毛重',
  `net_weight` int(11) not null  default '0' COMMENT '净重',
  `tare_weight` int(11) not null  default '0' COMMENT '皮重',
  `quality_number` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT'质量证书编号',
  `core_length` int(11) not null  default '0' COMMENT '主度长度级',
  `core_micronaire`  varchar(10) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT'马克隆主体级别',
  `max_evenness` int(11) not null  default '0' COMMENT '长整最大',
  `min_evenness` int(11) not null  default '0' COMMENT '长整最小',
  `remark`  varchar(200) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;




#棉花期货  单条
DROP TABLE IF EXISTS `cotton_item`;
CREATE TABLE `cotton_item` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `batch_id` bigint(10) unsigned NOT NULL COMMENT '批量ID',
  `barcod` bigint(10) unsigned NOT NULL COMMENT '条码',
  `colour_level` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '颜色级',
  `length` int(11) not null  default '0' COMMENT '长度',
  `strength` int(11) not null  default '0' COMMENT '强度',
  `micronaire` int(11) not null  default '0' COMMENT '马克隆值',
  `evenness` int(11) not null  default '0' COMMENT '长整',
  `ginning_quality` int(11) not null  default '0' COMMENT '轧工  P2...',
  `create_date` timestamp not null default CURRENT_TIMESTAMP comment '公检日期',
  `yellow_level` int(11) not null  default '0' COMMENT '黄度',
  `reflectivity` int(11) not null  default '0' COMMENT '反射率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;




# Dump of table ssm_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ssm_user`;

CREATE TABLE `ssm_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(100) NOT NULL DEFAULT '' COMMENT '登录名',
  `password` varchar(100) NOT NULL DEFAULT '' COMMENT '加密后的密码字段',
  `role_name` varchar(20) NOT NULL DEFAULT '普通管理员' COMMENT '用户角色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `ssm_user` WRITE;
/*!40000 ALTER TABLE `ssm_user` DISABLE KEYS */;

INSERT INTO `ssm_user` (`id`, `user_name`, `password`, `role_name`)
VALUES
	(2,'admin','e10adc3949ba59abbe56e057f20f883e','系统管理员'),
	(86,'asdf','cc83733cb0af8b884ff6577086b87909','普通管理员'),
	(87,'ads','36b74e397832402c57934da8c172fd83','普通管理员');

/*!40000 ALTER TABLE `ssm_user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
