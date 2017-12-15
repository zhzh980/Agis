/*
Navicat MySQL Data Transfer

Source Server         : GIS
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : info

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2017-06-13 13:09:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cover`
-- ----------------------------
DROP TABLE IF EXISTS `cover`;
CREATE TABLE `cover` (
  `point` varchar(255) NOT NULL default '',
  `nwpoint` varchar(255) default NULL,
  `nepoint` varchar(255) default NULL,
  `swpoint` varchar(255) default NULL,
  `sepoint` varchar(255) default NULL,
  `id1` int(11) default NULL,
  `zone` varchar(255) default NULL,
  PRIMARY KEY  (`point`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cover
-- ----------------------------
INSERT INTO `cover` VALUES ('108.626494,34.462163', '108.625326,34.462758', '108.627212,34.4631', '108.62759,34.461493', '108.625703,34.461151', '7', 'mz-07');
INSERT INTO `cover` VALUES ('108.626781,34.460585', '108.625703,34.461077', '108.62759,34.46133', '108.627931,34.460065', '108.625973,34.459767', '1', 'mz-01');
INSERT INTO `cover` VALUES ('108.628434,34.462475', '108.627374,34.463056', '108.629566,34.463502', '108.629961,34.461999', '108.627679,34.461642', '8', 'mz-08');
INSERT INTO `cover` VALUES ('108.628993,34.461038', '108.627654,34.461603', '108.6299,34.461953', '108.630268,34.46039', '108.628032,34.460048', '6', 'mz-06');
INSERT INTO `cover` VALUES ('108.631506,34.459841', '108.632101,34.460595', '108.630457,34.460342', '108.630762,34.459114', '108.632334,34.459352', '2', 'mz-02');
INSERT INTO `cover` VALUES ('108.631715,34.458593', '108.632321,34.459293', '108.630767,34.459073', '108.63105,34.457808', '108.632563,34.458005', '4', 'mz-04');
INSERT INTO `cover` VALUES ('108.632882,34.460037', '108.633493,34.460826', '108.632249,34.460613', '108.632415,34.459322', '108.63379,34.459531', '3', 'mz-03');
INSERT INTO `cover` VALUES ('108.633107,34.458772', '108.633637,34.45946', '108.632424,34.459259', '108.632734,34.458039', '108.633888,34.458258', '5', 'mz-05');
INSERT INTO `cover` VALUES ('109.106263,34.224445', '109.105652,34.225997', '109.107916,34.225056', '109.106892,34.223071', '109.104556,34.223937', '10', 'bl-01');
INSERT INTO `cover` VALUES ('116.075094,39.597749', '116.076388,39.598493', '116.074169,39.598556', '116.073989,39.596943', '116.076172,39.596888', '9', 'zh-01');

-- ----------------------------
-- Table structure for `farm`
-- ----------------------------
DROP TABLE IF EXISTS `farm`;
CREATE TABLE `farm` (
  `point` varchar(255) NOT NULL default '',
  `area` int(11) default NULL,
  `zone` varchar(255) character set utf8 default NULL,
  `farm_id` int(11) default NULL,
  `id` int(11) default NULL,
  `crop` varchar(255) character set utf8 default NULL,
  PRIMARY KEY  (`point`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of farm
-- ----------------------------
INSERT INTO `farm` VALUES ('108.626494,34.462163', '8', 'mz-07', '1', '7', '土豆');
INSERT INTO `farm` VALUES ('108.626781,34.460585', '2', 'mz-01', '1', '1', '辣椒');
INSERT INTO `farm` VALUES ('108.628434,34.462475', '8', 'mz-08', '1', '8', '玉米');
INSERT INTO `farm` VALUES ('108.628993,34.461038', '8', 'mz-06', '1', '6', '白菜');
INSERT INTO `farm` VALUES ('108.631506,34.459841', '20', 'mz-02', '1', '2', '土豆');
INSERT INTO `farm` VALUES ('108.631715,34.458593', '25', 'mz-04', '1', '4', '辣椒');
INSERT INTO `farm` VALUES ('108.632882,34.460037', '50', 'mz-03', '1', '3', '油麦菜');
INSERT INTO `farm` VALUES ('108.633107,34.458772', '8', 'mz-05', '1', '5', '山药');
INSERT INTO `farm` VALUES ('109.106263,34.224445', '6', 'bl-01', '2', '10', '小麦');
INSERT INTO `farm` VALUES ('116.075094,39.597749', '30', 'zh-01', '3', '9', '小麦');

-- ----------------------------
-- Table structure for `farm_gi`
-- ----------------------------
DROP TABLE IF EXISTS `farm_gi`;
CREATE TABLE `farm_gi` (
  `zone` varchar(255) NOT NULL default '',
  `scK` float default NULL,
  `scN` float default NULL,
  `scP` float default NULL,
  `spH` float default NULL,
  `swater` float default NULL,
  `id2` int(11) default NULL,
  PRIMARY KEY  (`zone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of farm_gi
-- ----------------------------
INSERT INTO `farm_gi` VALUES ('bl-01', '5', '6', '5', '6', '5', '10');
INSERT INTO `farm_gi` VALUES ('mz-01', '4', '6', '7', '6', '5', '1');
INSERT INTO `farm_gi` VALUES ('mz-02', '5', '1', '6', '1', '5', '2');
INSERT INTO `farm_gi` VALUES ('mz-03', '9', '1', '3', '5', '2', '3');
INSERT INTO `farm_gi` VALUES ('mz-04', '7', '5', '6', '8', '4', '4');
INSERT INTO `farm_gi` VALUES ('mz-05', '7', '5', '6', '8', '5', '5');
INSERT INTO `farm_gi` VALUES ('mz-06', '3', '3', '5', '5', '7', '6');
INSERT INTO `farm_gi` VALUES ('mz-07', '5', '6', '7', '8', '9', '7');
INSERT INTO `farm_gi` VALUES ('mz-08', '6', '6', '5', '4', '2', '8');
INSERT INTO `farm_gi` VALUES ('zh-01', '6', '8', '6', '6', '6', '9');

-- ----------------------------
-- Table structure for `farm_info`
-- ----------------------------
DROP TABLE IF EXISTS `farm_info`;
CREATE TABLE `farm_info` (
  `farm_id` int(11) NOT NULL,
  `point` varchar(255) NOT NULL default '',
  `province` varchar(255) default NULL,
  `city` varchar(255) default NULL,
  `county` varchar(255) default NULL,
  `farm_name` varchar(255) default NULL,
  `owner` varchar(255) default NULL,
  `owner_phone` bigint(11) default NULL,
  `sum_area` int(11) default NULL,
  PRIMARY KEY  (`point`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of farm_info
-- ----------------------------
INSERT INTO `farm_info` VALUES ('1', '108.628928，34.458941', '陕西省', '咸阳市', '秦都区', '马庄农场', '小明', '123456789', '8');
INSERT INTO `farm_info` VALUES ('2', '109.101565，34.223161', '陕西省', '西安市', '灞桥区', '白鹿原生态农场', '小米', '2453453', '1');
INSERT INTO `farm_info` VALUES ('3', '116.076794，39.597765', '北京', '房山区', '房山区', '中粮智慧农场', '小张', '11122333', '21');

-- ----------------------------
-- Table structure for `grand_info`
-- ----------------------------
DROP TABLE IF EXISTS `grand_info`;
CREATE TABLE `grand_info` (
  `zone` varchar(255) NOT NULL default '',
  `pH` float(11,0) default NULL,
  `water` float(255,0) default NULL,
  `temp` float(255,0) default NULL,
  `G_time` timestamp NOT NULL default '0000-00-00 00:00:00' on update CURRENT_TIMESTAMP,
  `id3` int(11) default NULL,
  PRIMARY KEY  (`zone`,`G_time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of grand_info
-- ----------------------------
INSERT INTO `grand_info` VALUES ('bl-01', '5', '6', '12', '2017-06-11 22:28:28', '15');
INSERT INTO `grand_info` VALUES ('mz-01', '5', '7', '8', '2017-01-01 14:54:05', '1');
INSERT INTO `grand_info` VALUES ('mz-01', '7', '5', '8', '2017-02-03 21:59:51', '2');
INSERT INTO `grand_info` VALUES ('mz-01', '5', '5', '5', '2017-03-05 21:59:53', '3');
INSERT INTO `grand_info` VALUES ('mz-01', '6', '6', '2', '2017-04-19 21:59:55', '4');
INSERT INTO `grand_info` VALUES ('mz-01', '5', '5', '6', '2017-05-20 21:59:57', '5');
INSERT INTO `grand_info` VALUES ('mz-01', '6', '7', '16', '2017-06-02 22:38:17', '16');
INSERT INTO `grand_info` VALUES ('mz-01', '5', '12', '18', '2017-06-10 22:38:52', '17');
INSERT INTO `grand_info` VALUES ('mz-01', '6', '7', '15', '2017-06-11 22:39:22', '18');
INSERT INTO `grand_info` VALUES ('mz-01', '6', '8', '12', '2017-06-12 08:40:58', '19');
INSERT INTO `grand_info` VALUES ('mz-02', '5', '6', '13', '2017-01-01 22:41:26', '20');
INSERT INTO `grand_info` VALUES ('mz-02', '6', '7', '11', '2017-02-10 22:41:50', '21');
INSERT INTO `grand_info` VALUES ('mz-02', '6', '6', '14', '2017-03-18 22:42:15', '22');
INSERT INTO `grand_info` VALUES ('mz-02', '5', '7', '12', '2017-05-18 22:43:04', '23');
INSERT INTO `grand_info` VALUES ('mz-02', '5', '6', '16', '2017-06-08 22:43:59', '24');
INSERT INTO `grand_info` VALUES ('mz-02', '5', '2', '4', '2017-06-12 07:59:59', '6');
INSERT INTO `grand_info` VALUES ('mz-03', '6', '8', '13', '2017-03-03 22:44:45', '25');
INSERT INTO `grand_info` VALUES ('mz-03', '6', '7', '11', '2017-05-01 22:45:10', '26');
INSERT INTO `grand_info` VALUES ('mz-03', '7', '9', '10', '2017-06-10 22:46:25', '27');
INSERT INTO `grand_info` VALUES ('mz-03', '6', '4', '7', '2017-06-12 08:00:00', '7');
INSERT INTO `grand_info` VALUES ('mz-04', '6', '8', '12', '2017-03-03 22:46:51', '28');
INSERT INTO `grand_info` VALUES ('mz-04', '7', '8', '15', '2017-06-08 22:47:16', '29');
INSERT INTO `grand_info` VALUES ('mz-04', '4', '3', '20', '2017-06-12 06:00:00', '8');
INSERT INTO `grand_info` VALUES ('mz-05', '6', '6', '14', '2017-04-09 22:48:02', '30');
INSERT INTO `grand_info` VALUES ('mz-05', '7', '4', '15', '2017-06-08 22:48:30', '31');
INSERT INTO `grand_info` VALUES ('mz-05', '5', '5', '5', '2017-06-12 05:00:03', '9');
INSERT INTO `grand_info` VALUES ('mz-06', '6', '7', '12', '2017-05-05 22:49:02', '32');
INSERT INTO `grand_info` VALUES ('mz-06', '7', '6', '16', '2017-06-07 22:49:33', '33');
INSERT INTO `grand_info` VALUES ('mz-06', '6', '6', '8', '2017-06-12 22:00:05', '10');
INSERT INTO `grand_info` VALUES ('mz-07', '7', '5', '15', '2017-06-09 22:50:21', '34');
INSERT INTO `grand_info` VALUES ('mz-07', '5', '6', '10', '2017-06-11 22:00:06', '11');
INSERT INTO `grand_info` VALUES ('mz-07', '6', '5', '11', '2017-06-12 07:51:30', '35');
INSERT INTO `grand_info` VALUES ('mz-08', '5', '6', '5', '2017-05-01 22:00:09', '13');
INSERT INTO `grand_info` VALUES ('mz-08', '5', '7', '6', '2017-06-11 22:00:07', '12');
INSERT INTO `grand_info` VALUES ('mz-08', '5', '6', '17', '2017-06-12 05:51:34', '36');
INSERT INTO `grand_info` VALUES ('zh-01', '5', '6', '12', '2017-06-11 22:02:55', '14');

-- ----------------------------
-- Table structure for `image`
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image` (
  `zone` varchar(255) NOT NULL default '',
  `img` varchar(255) NOT NULL,
  `pic_time` timestamp NOT NULL default '0000-00-00 00:00:00' on update CURRENT_TIMESTAMP,
  `id` int(11) NOT NULL,
  PRIMARY KEY  (`zone`,`pic_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES ('bl-01', 'img/小麦.jpg', '2017-06-11 23:03:40', '10');
INSERT INTO `image` VALUES ('bl-01', 'img/小麦.jpg', '2017-06-11 23:03:47', '10');
INSERT INTO `image` VALUES ('bl-01', 'img/小麦.jpg', '2017-06-11 23:03:52', '10');
INSERT INTO `image` VALUES ('mz-01', 'img/辣椒.jpg', '2017-06-11 23:04:21', '1');
INSERT INTO `image` VALUES ('mz-01', 'img/辣椒.jpg', '2017-06-11 23:04:28', '1');
INSERT INTO `image` VALUES ('mz-01', 'img/辣椒.jpg', '2017-06-11 23:04:32', '1');
INSERT INTO `image` VALUES ('mz-02', 'img/土豆.jpg', '2017-06-11 23:04:49', '2');
INSERT INTO `image` VALUES ('mz-02', 'img/土豆.jpg', '2017-06-11 23:04:57', '2');
INSERT INTO `image` VALUES ('mz-02', 'img/土豆.jpg', '2017-06-11 23:05:05', '2');
INSERT INTO `image` VALUES ('mz-02', 'img/土豆.jpg', '2017-06-11 23:05:22', '2');
INSERT INTO `image` VALUES ('mz-03', 'img/油麦菜.jpg', '2017-06-11 23:05:29', '3');
INSERT INTO `image` VALUES ('mz-03', 'img/油麦菜.jpg', '2017-06-11 23:05:41', '3');
INSERT INTO `image` VALUES ('mz-03', 'img/油麦菜.jpg', '2017-06-11 23:05:50', '3');
INSERT INTO `image` VALUES ('mz-04', 'img/辣椒.jpg', '2017-06-11 23:06:06', '4');
INSERT INTO `image` VALUES ('mz-04', 'img/辣椒.jpg', '2017-06-11 23:06:13', '4');
INSERT INTO `image` VALUES ('mz-04', 'img/辣椒.jpg', '2017-06-11 23:06:28', '4');
INSERT INTO `image` VALUES ('mz-05', 'img/山药.jpg', '2017-06-11 23:06:59', '5');
INSERT INTO `image` VALUES ('mz-05', 'img/山药.jpg', '2017-06-11 23:07:38', '5');
INSERT INTO `image` VALUES ('mz-05', 'img/山药.jpg', '2017-06-11 23:08:00', '5');
INSERT INTO `image` VALUES ('mz-06', 'img/白菜.png', '2017-06-11 23:08:11', '6');
INSERT INTO `image` VALUES ('mz-06', 'img/白菜.png', '2017-06-11 23:09:09', '6');
INSERT INTO `image` VALUES ('mz-06', 'img/白菜.png', '2017-06-11 23:09:27', '6');
INSERT INTO `image` VALUES ('mz-07', 'img/土豆.jpg', '2017-06-11 23:09:59', '7');
INSERT INTO `image` VALUES ('mz-07', 'img/土豆.jpg', '2017-06-11 23:10:10', '7');
INSERT INTO `image` VALUES ('mz-07', 'img/土豆.jpg', '2017-06-11 23:10:25', '7');
INSERT INTO `image` VALUES ('mz-08', 'img/玉米.jpg', '2017-06-11 23:11:01', '8');
INSERT INTO `image` VALUES ('mz-08', 'img/玉米.jpg', '2017-06-11 23:11:29', '8');
INSERT INTO `image` VALUES ('mz-08', 'img/玉米.jpg', '2017-06-11 23:11:40', '8');
INSERT INTO `image` VALUES ('zh-01', 'img/5.jpg', '2017-06-11 22:07:28', '9');
INSERT INTO `image` VALUES ('zh-01', 'img/5.jpg', '2017-06-11 22:13:46', '9');
INSERT INTO `image` VALUES ('zh-01', 'img/5.jpg', '2017-06-11 22:15:16', '9');

-- ----------------------------
-- Table structure for `know_pest`
-- ----------------------------
DROP TABLE IF EXISTS `know_pest`;
CREATE TABLE `know_pest` (
  `id` int(11) NOT NULL auto_increment,
  `crop` varchar(255) default NULL,
  `disease_name` varchar(255) default NULL,
  `disease_chara` varchar(255) default NULL,
  `growth` varchar(255) default NULL,
  `cure_treat` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of know_pest
-- ----------------------------
INSERT INTO `know_pest` VALUES ('1', '辣椒', '蝗虫', '蝗虫咬噬', '幼苗期', '生物驱赶');
INSERT INTO `know_pest` VALUES ('2', '土豆', '蝗虫', '蝗虫咬噬', '幼苗期', '生物驱赶');
INSERT INTO `know_pest` VALUES ('3', '玉米', '蝗虫', '蝗虫咬噬', '幼苗期', '用药物施肥');
INSERT INTO `know_pest` VALUES ('4', '辣椒', '锈斑病', '会出现锈状物，叶、茎可能会有锈洞', '幼苗期', '喷洒药剂45%百菌清烟剂');
INSERT INTO `know_pest` VALUES ('5', '土豆', '锈斑病', '会出现锈状物', '幼苗期', '用药物施肥');
INSERT INTO `know_pest` VALUES ('7', '辣椒', '灰霉病', '会出现霉状物', '幼苗期', '使用扑海因粉剂喷洒');
INSERT INTO `know_pest` VALUES ('8', '玉米', '锈斑病', '会出现锈状物', '茁壮期', '用药物施肥');
INSERT INTO `know_pest` VALUES ('10', '玉米', '锈斑病', '会出现锈状物', '茁壮期', '用药物施肥');
INSERT INTO `know_pest` VALUES ('11', '土豆', '白粉病', '会出现白色粉状物，作物生长异常', '幼苗期', '喷洒药剂，40%百菌清烟剂');
INSERT INTO `know_pest` VALUES ('12', '辣椒', '锈斑病', '会出现锈状物', '成熟期', '用药物施肥');

-- ----------------------------
-- Table structure for `nutrient_info`
-- ----------------------------
DROP TABLE IF EXISTS `nutrient_info`;
CREATE TABLE `nutrient_info` (
  `zone` varchar(255) NOT NULL default '',
  `cN` float default NULL,
  `cP` float default NULL,
  `cK` float default NULL,
  `Nu_time` timestamp NOT NULL default '0000-00-00 00:00:00' on update CURRENT_TIMESTAMP,
  `id4` int(11) default NULL,
  PRIMARY KEY  (`zone`,`Nu_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nutrient_info
-- ----------------------------
INSERT INTO `nutrient_info` VALUES ('bl-01', '5', '7', '5', '2017-06-11 22:23:35', '13');
INSERT INTO `nutrient_info` VALUES ('mz-01', '6', '8', '5', '2017-04-12 06:01:02', '4');
INSERT INTO `nutrient_info` VALUES ('mz-01', '7', '2', '4', '2017-05-11 22:01:01', '3');
INSERT INTO `nutrient_info` VALUES ('mz-01', '5', '7', '8', '2017-06-09 22:01:00', '2');
INSERT INTO `nutrient_info` VALUES ('mz-01', '6', '5', '4', '2017-06-12 06:00:59', '1');
INSERT INTO `nutrient_info` VALUES ('mz-02', '5', '8', '5', '2017-04-23 22:53:10', '15');
INSERT INTO `nutrient_info` VALUES ('mz-02', '7', '7', '7', '2017-06-07 22:52:40', '14');
INSERT INTO `nutrient_info` VALUES ('mz-02', '5', '2', '5', '2017-06-12 05:01:03', '5');
INSERT INTO `nutrient_info` VALUES ('mz-03', '4', '5', '8', '2017-06-12 07:01:03', '6');
INSERT INTO `nutrient_info` VALUES ('mz-04', '5', '2', '6', '2017-06-09 22:53:49', '16');
INSERT INTO `nutrient_info` VALUES ('mz-04', '1', '2', '5', '2017-06-11 22:01:04', '7');
INSERT INTO `nutrient_info` VALUES ('mz-05', '7', '9', '5', '2017-06-11 22:01:05', '8');
INSERT INTO `nutrient_info` VALUES ('mz-06', '2', '4', '8', '2017-06-11 22:01:06', '9');
INSERT INTO `nutrient_info` VALUES ('mz-07', '2', '3', '8', '2017-06-11 22:01:08', '10');
INSERT INTO `nutrient_info` VALUES ('mz-08', '7', '4', '8', '2017-06-11 22:01:09', '11');
INSERT INTO `nutrient_info` VALUES ('zh-01', '6', '5', '6', '2017-06-11 22:01:11', '12');

-- ----------------------------
-- Table structure for `plant_situation`
-- ----------------------------
DROP TABLE IF EXISTS `plant_situation`;
CREATE TABLE `plant_situation` (
  `id` int(11) NOT NULL auto_increment,
  `zone` varchar(255) default NULL,
  `growth` varchar(255) default NULL,
  `disease_name` varchar(255) default NULL,
  `disease_mes` varchar(255) default NULL,
  `time` timestamp NULL default NULL on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plant_situation
-- ----------------------------
INSERT INTO `plant_situation` VALUES ('1', 'mz-01', '幼苗期', '锈斑病', '作物出现锈斑，部分叶子出现锈洞，需要治疗', '2017-06-11 23:23:27');
INSERT INTO `plant_situation` VALUES ('2', 'mz-02', '幼苗期', '白粉病', '作物出现粉状病态', '2017-06-11 23:17:28');
INSERT INTO `plant_situation` VALUES ('3', 'mz-03', '幼苗期', '正常', '苗情正常，无病虫害情况', '2017-06-11 23:14:26');
INSERT INTO `plant_situation` VALUES ('4', 'mz-04', '幼苗期', '灰霉病', '出现霉斑，部分腐烂，需要紧急处理，以保证收成良好', '2017-06-11 23:16:58');
INSERT INTO `plant_situation` VALUES ('5', 'mz-05', '幼苗期', '锈斑病', '出现锈斑', '2017-06-08 22:02:52');
INSERT INTO `plant_situation` VALUES ('6', 'mz-06', '幼苗期', '锈斑病', '出现锈斑', '2017-06-08 22:02:52');
INSERT INTO `plant_situation` VALUES ('7', 'mz-07', '幼苗期', '锈斑病', '出现锈斑', '2017-06-08 22:02:54');
INSERT INTO `plant_situation` VALUES ('8', 'mz-08', '幼苗期', '锈斑病', '出现锈斑', '2017-06-08 22:02:59');
INSERT INTO `plant_situation` VALUES ('9', 'zh-01', '成熟期', '正常', '苗情正常，无病虫害', '2017-06-11 22:04:59');
INSERT INTO `plant_situation` VALUES ('10', 'bl-01', '茁壮期', '正常', '苗情正常，无病虫害', '2017-06-11 22:22:20');

-- ----------------------------
-- Table structure for `type`
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `type_id` int(11) NOT NULL default '0',
  `data_type` varchar(255) default NULL,
  `unit` varchar(255) default NULL,
  PRIMARY KEY  (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('1', 'water', 'pF');
INSERT INTO `type` VALUES ('2', 'temp', '摄氏度');
INSERT INTO `type` VALUES ('3', 'pH', null);
INSERT INTO `type` VALUES ('4', 'cN', 'mg/kg');
INSERT INTO `type` VALUES ('5', 'cK', 'mg/kg');
INSERT INTO `type` VALUES ('6', 'cP', 'mg/kg');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL auto_increment,
  `user_name` varchar(255) default NULL,
  `user_password` varchar(255) default NULL,
  `user_QQ` varchar(11) default NULL,
  `user_power` int(11) unsigned zerofill default '00000000000',
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zzh', 'zzh', '123', '00000000001');
INSERT INTO `user` VALUES ('2', 'Bob', 'Bob', '111', '00000000001');
INSERT INTO `user` VALUES ('3', 'zzz', 'zzz', '111', '00000000000');
INSERT INTO `user` VALUES ('4', 'Lily', '123', '111', '00000000000');
INSERT INTO `user` VALUES ('29', 'luo980', '123456', '111', '00000000000');
INSERT INTO `user` VALUES ('30', 'zhzh980', '123456', '21111', '00000000000');
INSERT INTO `user` VALUES ('32', 'zhzh9800', '666666', '6666666666', '00000000000');

-- ----------------------------
-- View structure for `farm_cover`
-- ----------------------------
DROP VIEW IF EXISTS `farm_cover`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `farm_cover` AS select `farm`.`point` AS `point`,`farm`.`area` AS `area`,`info`.`farm`.`name` AS `name`,`info`.`farm`.`owner` AS `owner`,`info`.`farm`.`id` AS `id`,`info`.`farm`.`crop` AS `crop`,`info`.`cover`.`nepoint` AS `nepoint`,`info`.`cover`.`nwpoint` AS `nwpoint`,`info`.`cover`.`sepoint` AS `sepoint`,`info`.`cover`.`swpoint` AS `swpoint`,`info`.`cover`.`id1` AS `id1` from (`farm` left join `cover` on((convert(`info`.`farm`.`point` using utf8) = `info`.`cover`.`point`))) ;

-- ----------------------------
-- View structure for `grand_info2`
-- ----------------------------
DROP VIEW IF EXISTS `grand_info2`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `grand_info2` AS select `farm`.`point` AS `point`,`farm`.`zone` AS `zone`,`farm`.`id` AS `id`,`farm`.`crop` AS `crop`,`grand_info`.`pH` AS `pH`,`farm_gi`.`spH` AS `spH`,`grand_info`.`water` AS `water`,`farm_gi`.`swater` AS `swater`,`grand_info`.`temp` AS `temp`,`grand_info`.`G_time` AS `G_time` from ((`farm` join `farm_gi`) join `grand_info`) where ((`farm`.`zone` = `farm_gi`.`zone`) and (`farm_gi`.`zone` = convert(`grand_info`.`zone` using utf8))) ;

-- ----------------------------
-- View structure for `kp_cure`
-- ----------------------------
DROP VIEW IF EXISTS `kp_cure`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `kp_cure` AS select `plant_situation`.`zone` AS `zone`,`plant_situation`.`id` AS `id`,`farm`.`crop` AS `crop`,`plant_situation`.`growth` AS `growth`,`plant_situation`.`disease_name` AS `disease_name`,`know_pest`.`cure_treat` AS `cure_treat`,`know_pest`.`disease_chara` AS `disease_chara` from ((`farm` join `know_pest`) join `plant_situation`) where ((`plant_situation`.`zone` = `farm`.`zone`) and (`know_pest`.`disease_name` = `plant_situation`.`disease_name`) and (`know_pest`.`crop` = `farm`.`crop`) and (`know_pest`.`growth` = `plant_situation`.`growth`)) ;

-- ----------------------------
-- View structure for `nutrient_info2`
-- ----------------------------
DROP VIEW IF EXISTS `nutrient_info2`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `nutrient_info2` AS select `farm`.`zone` AS `zone`,`farm`.`point` AS `point`,`farm`.`crop` AS `crop`,`nutrient_info`.`cK` AS `cK`,`farm_gi`.`scK` AS `scK`,`nutrient_info`.`cN` AS `cN`,`farm_gi`.`scN` AS `scN`,`nutrient_info`.`cP` AS `cP`,`farm_gi`.`scP` AS `scP`,`nutrient_info`.`Nu_time` AS `Nu_time`,`nutrient_info`.`id4` AS `id4` from ((`farm` join `nutrient_info`) join `farm_gi`) where ((`farm`.`zone` = `nutrient_info`.`zone`) and (`nutrient_info`.`zone` = `farm_gi`.`zone`)) ;
