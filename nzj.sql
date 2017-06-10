/*
Navicat MySQL Data Transfer

Source Server         : 119.23.67.238
Source Server Version : 50555
Source Host           : 119.23.67.238:3306
Source Database       : nzj

Target Server Type    : MYSQL
Target Server Version : 50555
File Encoding         : 65001

Date: 2017-06-10 17:47:28
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `appliance`
-- ----------------------------
DROP TABLE IF EXISTS `appliance`;
CREATE TABLE `appliance` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appliance
-- ----------------------------
INSERT INTO `appliance` VALUES ('1', '电饭锅');
INSERT INTO `appliance` VALUES ('2', '煤气灶');
INSERT INTO `appliance` VALUES ('3', '电冰箱');
INSERT INTO `appliance` VALUES ('4', '高压锅');
INSERT INTO `appliance` VALUES ('5', '吸尘器');
INSERT INTO `appliance` VALUES ('6', '电磁炉');
INSERT INTO `appliance` VALUES ('7', '微波炉');
INSERT INTO `appliance` VALUES ('8', '消毒柜');
INSERT INTO `appliance` VALUES ('9', '洗衣机');

-- ----------------------------
-- Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `digest` varchar(255) DEFAULT '',
  `url` varchar(255) NOT NULL,
  `time` bigint(20) NOT NULL,
  `fstr` varchar(5000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('13', '未来家政行业的发展趋势', '123', 'http://192.168.1.226:8080/nzj/ueditor/jsp/upload/article/20170518/1495095035804_4.html', '1495095035', '20170518-1495095035804_4.html-1495095033384035007.png-');
INSERT INTO `article` VALUES ('15', '娘子军团队大鹏一日游', ' 在这春末夏初时节，娘子军团队来到了有着深圳鼓浪屿之称的大鹏较场尾金水湾度假区，被誉为深圳唯一的一块净土。作为深圳的“鼓浪屿”、深圳小“丽江”、深圳的“后花园”，在大鹏较场尾到处可见装修别致、风格迥异的客栈。有欧陆风情、亦有民族气息，五颜六色的房屋，可爱有趣的装饰，我们选了一栋比较大的民宿屋，并在这度过了一个轻松愉快的小假日~\r\n跟着我们的脚步一起来看看吧~', 'http://192.168.1.226:8080/nzj/ueditor/jsp/upload/article/20170518/1495109859369_14.html', '1495109859', '20170518-1495109859369_14.html-1495109856823071383.jpg-1495109857166035587.jpg-1495109857246093808.jpg-1495109857267017211.jpg-1495109857348045255.jpg-1495109857401029583.jpg-1495109857427001564.png-1495109857458048769.jpg-');
INSERT INTO `article` VALUES ('16', '你选择成为一名月嫂到底有前途吗？', '你选择成为一名月嫂到底有前途吗？\r\n后台有许多40岁上下的大姐，常常问我：“现在我这个年纪当月嫂合适吗？找的到工作？成为月嫂有前途吗”她们目前在老家做着各种工资2000元~3000元的低薪工作，一家温饱不愁吃穿。\r\n但是。。。\r\n但是提高生活质量买心爱的东西，总是舍不得；\r\n但是给孩子最好的教育机会，总感觉捉襟见肘；\r\n但是成为一名体面的新职业女性，感到缺乏信心；\r\n今天我们就把月嫂这个行业从2006年、2016年、2026年三个时间点展开给姐姐看看，到底要不要进入月嫂？有没有机会？能不能发展？', 'http://192.168.1.226:8080/nzj/ueditor/jsp/upload/article/20170519/1495164898582_17.html', '1495164898', '20170519-1495164898582_17.html-1495164895962074243.png-');
INSERT INTO `article` VALUES ('17', '签约砸金蛋拿大奖，娘子军品牌加盟部周年庆！', '签约砸金蛋拿大奖，娘子军品牌加盟部周年庆！', 'http://192.168.1.226:8080/nzj/ueditor/jsp/upload/article/20170519/1495165289560_5.html', '1495165289', '20170519-1495165289560_5.html-1495165287191039435.png-');
INSERT INTO `article` VALUES ('18', '姚晨写感人文章感谢月嫂！', '大型文化情感类节目《朗读者》播出第七期“告别”主题节目，姚晨惊喜亮相。现场讲述自己与陌生人之间的难忘情谊，爆料曾被收留睡木板床，分享首当妈妈时与月嫂魏姐的故事及自己写下的文章《魏姐》。姚晨还现场深情朗读了鲁迅经典《阿长与》，感恩每一次萍水相逢的遇见。（娘子军家政）', 'http://192.168.1.226:8080/nzj/ueditor/jsp/upload/article/20170519/1495165359541_17.html', '1495165359', '20170519-1495165359541_17.html-1495165357777036406.jpg-');
INSERT INTO `article` VALUES ('19', '娘子军团队大鹏一日游', '娘子军团队大鹏一日游', 'http://192.168.1.115:8080/nzj/ueditor/jsp/upload/article/20170519/1495166139118_8.html', '1495166139', '20170519-1495166139118_8.html-');

-- ----------------------------
-- Table structure for `aunt`
-- ----------------------------
DROP TABLE IF EXISTS `aunt`;
CREATE TABLE `aunt` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `sign` varchar(255) NOT NULL,
  `native` varchar(255) NOT NULL,
  `sex` int(11) NOT NULL,
  `education` varchar(255) NOT NULL,
  `marriage` int(11) NOT NULL,
  `nation` varchar(255) NOT NULL,
  `height` double NOT NULL,
  `weight` double NOT NULL,
  `sigh` double NOT NULL,
  `idnumber` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aunt
-- ----------------------------
INSERT INTO `aunt` VALUES ('30', 'zzz', '1', '3', '3', '1', '1', '2', '2', '4', '3', '4', '111111', '5', '2', '0', '6');
INSERT INTO `aunt` VALUES ('31', '13', '2', '3', '4', '0', '6', '7', '8', '9', '0', '123', '7723', '1', '2', '0', '1');
INSERT INTO `aunt` VALUES ('32', '阿斯蒂芬', '1', '2', '3', '1', '3', '3', '3', '3', '3', '3', '3', '3', '3', '0', '6');
INSERT INTO `aunt` VALUES ('36', '1', '2', '3', '4', '0', '6', '7', '8', '9', '0', '1', '2', '2', '3', '0', '6');
INSERT INTO `aunt` VALUES ('37', '小花', '11', '兔', '汉', '0', '高中', '0', '汉', '1.66', '55', '5', '431124199311351', '13522684957', '啊', '0', '1');
INSERT INTO `aunt` VALUES ('38', '1', '2', '3', '4', '5', '2', '2', '2', '2', '2', '2', '2123213', '2', '2', '0', '6');
INSERT INTO `aunt` VALUES ('39', '1', '2', '3', '4', '5', '2', '2', '2', '2', '2', '2', '21232134', '2', '2', '0', '6');
INSERT INTO `aunt` VALUES ('40', '翠花', '31', '狗', '广西桂林', '0', '小学', '0', '汉', '172', '64', '5.1', '362329199201567854', '189708564865', '深圳市龙岗区坂田顺兴工业园区125号', '0', '1');
INSERT INTO `aunt` VALUES ('41', '翠花', '31', '狗', '广西桂林', '0', '小学', '0', '汉', '172', '64', '5.1', '3623291992015678511', '189708564865', '深圳市龙岗区坂田顺兴工业园区125号', '0', '1');
INSERT INTO `aunt` VALUES ('42', '翠花', '31', '狗', '广西桂林', '0', '小学', '0', '汉', '172', '64', '5.1', '362329199201567844', '189708564865', '深圳市龙岗区坂田顺兴工业园区125号', '0', '20');
INSERT INTO `aunt` VALUES ('43', '王二狗', '27', '狗', '山西大庆', '1', '大专', '1', '汉', '165', '70', '5', '43134199244361246', '189708564865', '深圳市龙岗区坂田顺兴工业园区125号', '0', '1');
INSERT INTO `aunt` VALUES ('45', '小妞妞', '18', '兔', '湖南', '0', '大学', '0', '汉', '1.77', '60', '5', '431125199311036138', '13566803738', '啊啊', '0', '1');
INSERT INTO `aunt` VALUES ('47', '1', '1', '1', '1', '0', '1', '0', '1', '1', '1', '1', '1', '1', '1', '0', '1');
INSERT INTO `aunt` VALUES ('48', '2', '2', '2', '2', '0', '2', '0', '2', '2', '2', '2', '22', '2', '2', '0', '1');
INSERT INTO `aunt` VALUES ('54', '8', '8', '8', '8', '0', '8', '0', '8', '8', '8', '8', '88', '8', '8', '0', '1');
INSERT INTO `aunt` VALUES ('55', '张小红', '28', '猪', '广东深圳', '0', '初中', '0', '满', '168', '70', '4.5', '3523291996012864557', '13846847592', '广东省广州市白云区天府路203号', '0', '1');
INSERT INTO `aunt` VALUES ('56', 'q', '1', '1', 'q', '0', '1', '0', 'q', '1', '1', '1', '431124185611675123', '13066906731', 'q', '0', '1');
INSERT INTO `aunt` VALUES ('57', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1234', '1', '1', '0', '1');
INSERT INTO `aunt` VALUES ('58', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '23', '1', '1', '0', '1');
INSERT INTO `aunt` VALUES ('59', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2321', '1', '1', '0', '1');
INSERT INTO `aunt` VALUES ('60', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '232112312', '1', '1', '0', '1');
INSERT INTO `aunt` VALUES ('61', '李小晓', '30', '兔', '江西', '0', '初中', '0', '汉', '1.66', '62', '5', '431124198911035648', '13066803435', '龙岗', '0', '20');
INSERT INTO `aunt` VALUES ('64', '马小猪', '23', '猪', '广东', '1', '本科', '0', '汉', '168', '56', '5.1', '256456879421364854', '18970568945', '广东省深圳市龙岗区坂田顺兴工业区E栋602', '0', '1');
INSERT INTO `aunt` VALUES ('65', '张小曼', '31', '狗', '广东', '0', '高中', '0', '汉', '165', '62', '5', '431124198911360215', '13574251232', '深圳市南山区西丽茶光村169号', '0', '1');

-- ----------------------------
-- Table structure for `aunt_appliance`
-- ----------------------------
DROP TABLE IF EXISTS `aunt_appliance`;
CREATE TABLE `aunt_appliance` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `aunt_id` bigint(20) NOT NULL,
  `appliance_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aunt_appliance
-- ----------------------------
INSERT INTO `aunt_appliance` VALUES ('8', '30', '3');
INSERT INTO `aunt_appliance` VALUES ('9', '31', '3');
INSERT INTO `aunt_appliance` VALUES ('10', '32', '3');
INSERT INTO `aunt_appliance` VALUES ('19', '888', '6');
INSERT INTO `aunt_appliance` VALUES ('23', '36', '2');
INSERT INTO `aunt_appliance` VALUES ('24', '37', '1');
INSERT INTO `aunt_appliance` VALUES ('25', '38', '2');
INSERT INTO `aunt_appliance` VALUES ('26', '39', '2');
INSERT INTO `aunt_appliance` VALUES ('27', '40', '1');
INSERT INTO `aunt_appliance` VALUES ('28', '41', '1');
INSERT INTO `aunt_appliance` VALUES ('29', '42', '1');
INSERT INTO `aunt_appliance` VALUES ('30', '43', '1');
INSERT INTO `aunt_appliance` VALUES ('32', '45', '1');
INSERT INTO `aunt_appliance` VALUES ('34', '47', '1');
INSERT INTO `aunt_appliance` VALUES ('35', '48', '1');
INSERT INTO `aunt_appliance` VALUES ('41', '54', '1');
INSERT INTO `aunt_appliance` VALUES ('62', '55', '9');
INSERT INTO `aunt_appliance` VALUES ('63', '56', '1');
INSERT INTO `aunt_appliance` VALUES ('64', '57', '1');
INSERT INTO `aunt_appliance` VALUES ('65', '58', '1');
INSERT INTO `aunt_appliance` VALUES ('66', '59', '1');
INSERT INTO `aunt_appliance` VALUES ('67', '60', '1');
INSERT INTO `aunt_appliance` VALUES ('68', '61', '1');
INSERT INTO `aunt_appliance` VALUES ('71', '64', '1');
INSERT INTO `aunt_appliance` VALUES ('72', '65', '1');

-- ----------------------------
-- Table structure for `aunt_certificate`
-- ----------------------------
DROP TABLE IF EXISTS `aunt_certificate`;
CREATE TABLE `aunt_certificate` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `aunt_id` bigint(20) NOT NULL,
  `certificate_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aunt_certificate
-- ----------------------------
INSERT INTO `aunt_certificate` VALUES ('8', '30', '5');
INSERT INTO `aunt_certificate` VALUES ('9', '31', '5');
INSERT INTO `aunt_certificate` VALUES ('10', '32', '3');
INSERT INTO `aunt_certificate` VALUES ('14', '36', '2');
INSERT INTO `aunt_certificate` VALUES ('15', '37', '1');
INSERT INTO `aunt_certificate` VALUES ('16', '38', '2');
INSERT INTO `aunt_certificate` VALUES ('17', '39', '2');
INSERT INTO `aunt_certificate` VALUES ('18', '40', '1');
INSERT INTO `aunt_certificate` VALUES ('19', '41', '1');
INSERT INTO `aunt_certificate` VALUES ('20', '42', '1');
INSERT INTO `aunt_certificate` VALUES ('21', '43', '1');
INSERT INTO `aunt_certificate` VALUES ('23', '45', '1');
INSERT INTO `aunt_certificate` VALUES ('25', '47', '1');
INSERT INTO `aunt_certificate` VALUES ('26', '48', '1');
INSERT INTO `aunt_certificate` VALUES ('32', '54', '1');
INSERT INTO `aunt_certificate` VALUES ('53', '55', '9');
INSERT INTO `aunt_certificate` VALUES ('54', '56', '1');
INSERT INTO `aunt_certificate` VALUES ('55', '56', '8');
INSERT INTO `aunt_certificate` VALUES ('56', '57', '1');
INSERT INTO `aunt_certificate` VALUES ('57', '58', '1');
INSERT INTO `aunt_certificate` VALUES ('58', '59', '1');
INSERT INTO `aunt_certificate` VALUES ('59', '60', '1');
INSERT INTO `aunt_certificate` VALUES ('60', '61', '1');
INSERT INTO `aunt_certificate` VALUES ('63', '64', '2');
INSERT INTO `aunt_certificate` VALUES ('64', '64', '8');
INSERT INTO `aunt_certificate` VALUES ('65', '65', '1');

-- ----------------------------
-- Table structure for `aunt_contact`
-- ----------------------------
DROP TABLE IF EXISTS `aunt_contact`;
CREATE TABLE `aunt_contact` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) NOT NULL,
  `relation` varchar(255) NOT NULL,
  `workstatus` varchar(255) NOT NULL,
  `cphone` varchar(255) NOT NULL,
  `aunt_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aunt_contact
-- ----------------------------
INSERT INTO `aunt_contact` VALUES ('14', '6', '7', '8', '9', '30');
INSERT INTO `aunt_contact` VALUES ('15', '4', '32', '-', '0', '30');
INSERT INTO `aunt_contact` VALUES ('16', '6', '7', '8', '9', '31');
INSERT INTO `aunt_contact` VALUES ('17', '4', '32', '-', '0', '31');
INSERT INTO `aunt_contact` VALUES ('29', '2', '2', '2', '1', '36');
INSERT INTO `aunt_contact` VALUES ('30', '1', '2', '3', '4', '36');
INSERT INTO `aunt_contact` VALUES ('34', 's', '323', 'dsfa', 'fwef', '32');
INSERT INTO `aunt_contact` VALUES ('35', 'fer', 'f34g', 'vvafd', 'vsdfv', '32');
INSERT INTO `aunt_contact` VALUES ('36', '4g', 'ds', 'vsd', 'vd', '32');
INSERT INTO `aunt_contact` VALUES ('37', '1', '1', '1', '1', '37');
INSERT INTO `aunt_contact` VALUES ('38', '1', '1', '1', '1', '37');
INSERT INTO `aunt_contact` VALUES ('39', '2', '2', '2', '2', '38');
INSERT INTO `aunt_contact` VALUES ('40', '', '', '', '', '38');
INSERT INTO `aunt_contact` VALUES ('41', '2', '2', '2', '2', '39');
INSERT INTO `aunt_contact` VALUES ('42', '', '', '', '', '39');
INSERT INTO `aunt_contact` VALUES ('43', '曾', '外亲', '土豪2', '23', '40');
INSERT INTO `aunt_contact` VALUES ('44', '吴', '母子', '土豪1', '12', '41');
INSERT INTO `aunt_contact` VALUES ('45', '吴', '母子', '土豪1', '12', '42');
INSERT INTO `aunt_contact` VALUES ('46', '曾', '外亲', '土豪2', '23', '42');
INSERT INTO `aunt_contact` VALUES ('47', '唐', '父子', '土豪3', '34', '42');
INSERT INTO `aunt_contact` VALUES ('48', '吴', '母子', '土豪1', '12', '43');
INSERT INTO `aunt_contact` VALUES ('49', '曾', '外亲', '土豪2', '23', '43');
INSERT INTO `aunt_contact` VALUES ('50', '唐', '父子', '土豪3', '34', '43');
INSERT INTO `aunt_contact` VALUES ('54', '啊', '啊', '啊', '1', '45');
INSERT INTO `aunt_contact` VALUES ('56', '1', '1', '1', '1', '47');
INSERT INTO `aunt_contact` VALUES ('57', '2', '2', '2', '2', '48');
INSERT INTO `aunt_contact` VALUES ('63', '8', '8', '8', '8', '54');
INSERT INTO `aunt_contact` VALUES ('64', '1', '2', '3', '3', '55');
INSERT INTO `aunt_contact` VALUES ('65', 's', 's', 's', '1', '56');
INSERT INTO `aunt_contact` VALUES ('66', '1', '1', '1', '1', '57');
INSERT INTO `aunt_contact` VALUES ('67', '1', '1', '1', '1', '57');
INSERT INTO `aunt_contact` VALUES ('68', '1', '1', '1', '1', '58');
INSERT INTO `aunt_contact` VALUES ('69', '1', '1', '1', '1', '58');
INSERT INTO `aunt_contact` VALUES ('70', '1', '1', '1', '1', '59');
INSERT INTO `aunt_contact` VALUES ('71', '1', '1', '1', '1', '59');
INSERT INTO `aunt_contact` VALUES ('72', '1', '1', '1', '1', '60');
INSERT INTO `aunt_contact` VALUES ('73', '1', '1', '1', '1', '60');
INSERT INTO `aunt_contact` VALUES ('74', '啊', '啊', '啊', '啊', '61');
INSERT INTO `aunt_contact` VALUES ('76', '马三立', '父亲', '公务员', '13689751364', '64');
INSERT INTO `aunt_contact` VALUES ('77', '陈赫', '好朋友', '在职', '13544684564', '65');

-- ----------------------------
-- Table structure for `aunt_cooking`
-- ----------------------------
DROP TABLE IF EXISTS `aunt_cooking`;
CREATE TABLE `aunt_cooking` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `aunt_id` bigint(20) NOT NULL,
  `cooking_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aunt_cooking
-- ----------------------------
INSERT INTO `aunt_cooking` VALUES ('8', '30', '1');
INSERT INTO `aunt_cooking` VALUES ('9', '31', '1');
INSERT INTO `aunt_cooking` VALUES ('10', '32', '3');
INSERT INTO `aunt_cooking` VALUES ('14', '36', '2');
INSERT INTO `aunt_cooking` VALUES ('15', '37', '1');
INSERT INTO `aunt_cooking` VALUES ('16', '40', '1');
INSERT INTO `aunt_cooking` VALUES ('17', '41', '1');
INSERT INTO `aunt_cooking` VALUES ('18', '42', '1');
INSERT INTO `aunt_cooking` VALUES ('19', '43', '1');
INSERT INTO `aunt_cooking` VALUES ('21', '45', '1');
INSERT INTO `aunt_cooking` VALUES ('23', '47', '1');
INSERT INTO `aunt_cooking` VALUES ('24', '48', '1');
INSERT INTO `aunt_cooking` VALUES ('30', '54', '1');
INSERT INTO `aunt_cooking` VALUES ('48', '55', '5');
INSERT INTO `aunt_cooking` VALUES ('49', '56', '1');
INSERT INTO `aunt_cooking` VALUES ('50', '57', '1');
INSERT INTO `aunt_cooking` VALUES ('51', '58', '1');
INSERT INTO `aunt_cooking` VALUES ('52', '59', '1');
INSERT INTO `aunt_cooking` VALUES ('53', '60', '1');
INSERT INTO `aunt_cooking` VALUES ('54', '61', '1');
INSERT INTO `aunt_cooking` VALUES ('57', '64', '2');
INSERT INTO `aunt_cooking` VALUES ('58', '65', '1');

-- ----------------------------
-- Table structure for `aunt_job`
-- ----------------------------
DROP TABLE IF EXISTS `aunt_job`;
CREATE TABLE `aunt_job` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `aunt_id` bigint(20) NOT NULL,
  `job_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aunt_job
-- ----------------------------
INSERT INTO `aunt_job` VALUES ('8', '30', '4');
INSERT INTO `aunt_job` VALUES ('9', '31', '4');
INSERT INTO `aunt_job` VALUES ('10', '32', '3');
INSERT INTO `aunt_job` VALUES ('14', '36', '2');
INSERT INTO `aunt_job` VALUES ('15', '37', '1');
INSERT INTO `aunt_job` VALUES ('16', '38', '2');
INSERT INTO `aunt_job` VALUES ('17', '39', '2');
INSERT INTO `aunt_job` VALUES ('18', '40', '1');
INSERT INTO `aunt_job` VALUES ('19', '41', '1');
INSERT INTO `aunt_job` VALUES ('20', '42', '1');
INSERT INTO `aunt_job` VALUES ('21', '43', '1');
INSERT INTO `aunt_job` VALUES ('23', '45', '1');
INSERT INTO `aunt_job` VALUES ('25', '47', '1');
INSERT INTO `aunt_job` VALUES ('26', '48', '1');
INSERT INTO `aunt_job` VALUES ('32', '54', '1');
INSERT INTO `aunt_job` VALUES ('49', '55', '6');
INSERT INTO `aunt_job` VALUES ('50', '56', '1');
INSERT INTO `aunt_job` VALUES ('51', '57', '1');
INSERT INTO `aunt_job` VALUES ('52', '58', '1');
INSERT INTO `aunt_job` VALUES ('53', '59', '1');
INSERT INTO `aunt_job` VALUES ('54', '60', '1');
INSERT INTO `aunt_job` VALUES ('55', '61', '1');
INSERT INTO `aunt_job` VALUES ('58', '64', '1');
INSERT INTO `aunt_job` VALUES ('59', '65', '1');

-- ----------------------------
-- Table structure for `aunt_language`
-- ----------------------------
DROP TABLE IF EXISTS `aunt_language`;
CREATE TABLE `aunt_language` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `aunt_id` bigint(20) NOT NULL,
  `language_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aunt_language
-- ----------------------------
INSERT INTO `aunt_language` VALUES ('9', '30', '3');
INSERT INTO `aunt_language` VALUES ('10', '31', '3');
INSERT INTO `aunt_language` VALUES ('11', '32', '3');
INSERT INTO `aunt_language` VALUES ('15', '36', '2');
INSERT INTO `aunt_language` VALUES ('16', '37', '1');
INSERT INTO `aunt_language` VALUES ('17', '38', '2');
INSERT INTO `aunt_language` VALUES ('18', '39', '2');
INSERT INTO `aunt_language` VALUES ('19', '40', '1');
INSERT INTO `aunt_language` VALUES ('20', '41', '1');
INSERT INTO `aunt_language` VALUES ('21', '42', '1');
INSERT INTO `aunt_language` VALUES ('22', '43', '1');
INSERT INTO `aunt_language` VALUES ('24', '45', '1');
INSERT INTO `aunt_language` VALUES ('25', '45', '2');
INSERT INTO `aunt_language` VALUES ('26', '45', '3');
INSERT INTO `aunt_language` VALUES ('27', '45', '4');
INSERT INTO `aunt_language` VALUES ('28', '45', '5');
INSERT INTO `aunt_language` VALUES ('30', '47', '1');
INSERT INTO `aunt_language` VALUES ('31', '48', '1');
INSERT INTO `aunt_language` VALUES ('88', '54', '1');
INSERT INTO `aunt_language` VALUES ('89', '54', '5');
INSERT INTO `aunt_language` VALUES ('91', '55', '1');
INSERT INTO `aunt_language` VALUES ('92', '55', '2');
INSERT INTO `aunt_language` VALUES ('93', '55', '3');
INSERT INTO `aunt_language` VALUES ('94', '55', '4');
INSERT INTO `aunt_language` VALUES ('95', '55', '5');
INSERT INTO `aunt_language` VALUES ('97', '56', '1');
INSERT INTO `aunt_language` VALUES ('98', '56', '2');
INSERT INTO `aunt_language` VALUES ('99', '57', '1');
INSERT INTO `aunt_language` VALUES ('100', '58', '1');
INSERT INTO `aunt_language` VALUES ('101', '59', '1');
INSERT INTO `aunt_language` VALUES ('102', '60', '1');
INSERT INTO `aunt_language` VALUES ('103', '61', '1');
INSERT INTO `aunt_language` VALUES ('106', '64', '1');
INSERT INTO `aunt_language` VALUES ('107', '64', '2');
INSERT INTO `aunt_language` VALUES ('108', '65', '1');

-- ----------------------------
-- Table structure for `aunt_photo`
-- ----------------------------
DROP TABLE IF EXISTS `aunt_photo`;
CREATE TABLE `aunt_photo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `url` varchar(255) NOT NULL,
  `aunt_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aunt_photo
-- ----------------------------
INSERT INTO `aunt_photo` VALUES ('8', 'http://192.168.1.128:8080/nzj/upload/aunt_photo/1493956064_8.png', '30');
INSERT INTO `aunt_photo` VALUES ('9', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1493972091_8.png', '31');
INSERT INTO `aunt_photo` VALUES ('10', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1494125722_5.png', '32');
INSERT INTO `aunt_photo` VALUES ('14', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1494125722_5.png', '36');
INSERT INTO `aunt_photo` VALUES ('15', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1494315098_2.png', '37');
INSERT INTO `aunt_photo` VALUES ('16', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1494318921_5.png', '38');
INSERT INTO `aunt_photo` VALUES ('17', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1494325233_9.png', '39');
INSERT INTO `aunt_photo` VALUES ('18', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1494382335_9.png', '40');
INSERT INTO `aunt_photo` VALUES ('19', 'http://192.168.1.226:8080/nzj/upload/aunt_photo/1494382499_8.png', '41');
INSERT INTO `aunt_photo` VALUES ('20', 'http://192.168.1.226:8080/nzj/upload/aunt_photo/1494382660_9.png', '42');
INSERT INTO `aunt_photo` VALUES ('21', 'http://192.168.1.226:8080/nzj/upload/aunt_photo/1494383773_7.png', '43');
INSERT INTO `aunt_photo` VALUES ('23', 'http://192.168.1.226:8080/nzj/upload/aunt_photo/1494398656_5.png', '45');
INSERT INTO `aunt_photo` VALUES ('25', 'http://192.168.1.226:8080/nzj/upload/aunt_photo/1494399492_4.png', '47');
INSERT INTO `aunt_photo` VALUES ('26', 'http://192.168.1.226:8080/nzj/upload/aunt_photo/1494399563_9.png', '48');
INSERT INTO `aunt_photo` VALUES ('32', 'http://192.168.1.226:8080/nzj/upload/aunt_photo/1494408094_7.png', '54');
INSERT INTO `aunt_photo` VALUES ('33', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1494926480_8.png', '55');
INSERT INTO `aunt_photo` VALUES ('34', 'http://192.168.1.226:8080/nzj/upload/aunt_photo/1495075210_8.png', '56');
INSERT INTO `aunt_photo` VALUES ('35', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1495530452_8.png', '57');
INSERT INTO `aunt_photo` VALUES ('36', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1495530464_9.png', '58');
INSERT INTO `aunt_photo` VALUES ('37', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1495531720_2.png', '59');
INSERT INTO `aunt_photo` VALUES ('38', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1495531729_2.png', '60');
INSERT INTO `aunt_photo` VALUES ('39', 'http://192.168.1.226:8080/nzj/upload/aunt_photo/1495698570_3.png', '61');
INSERT INTO `aunt_photo` VALUES ('41', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1496993100_4.png', '64');
INSERT INTO `aunt_photo` VALUES ('42', 'http://192.168.1.115:8080/nzj/upload/aunt_photo/1497063602_6.png', '65');

-- ----------------------------
-- Table structure for `aunt_skill`
-- ----------------------------
DROP TABLE IF EXISTS `aunt_skill`;
CREATE TABLE `aunt_skill` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `aunt_id` bigint(20) NOT NULL,
  `skill_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aunt_skill
-- ----------------------------
INSERT INTO `aunt_skill` VALUES ('8', '30', '2');
INSERT INTO `aunt_skill` VALUES ('9', '31', '2');
INSERT INTO `aunt_skill` VALUES ('10', '32', '3');
INSERT INTO `aunt_skill` VALUES ('14', '36', '2');
INSERT INTO `aunt_skill` VALUES ('15', '37', '1');
INSERT INTO `aunt_skill` VALUES ('16', '40', '1');
INSERT INTO `aunt_skill` VALUES ('17', '41', '1');
INSERT INTO `aunt_skill` VALUES ('18', '42', '1');
INSERT INTO `aunt_skill` VALUES ('19', '43', '1');
INSERT INTO `aunt_skill` VALUES ('21', '45', '1');
INSERT INTO `aunt_skill` VALUES ('23', '47', '1');
INSERT INTO `aunt_skill` VALUES ('24', '48', '1');
INSERT INTO `aunt_skill` VALUES ('30', '54', '1');
INSERT INTO `aunt_skill` VALUES ('56', '55', '11');
INSERT INTO `aunt_skill` VALUES ('57', '56', '1');
INSERT INTO `aunt_skill` VALUES ('58', '57', '1');
INSERT INTO `aunt_skill` VALUES ('59', '58', '1');
INSERT INTO `aunt_skill` VALUES ('60', '59', '1');
INSERT INTO `aunt_skill` VALUES ('61', '60', '1');
INSERT INTO `aunt_skill` VALUES ('62', '61', '1');
INSERT INTO `aunt_skill` VALUES ('65', '64', '1');
INSERT INTO `aunt_skill` VALUES ('66', '65', '1');

-- ----------------------------
-- Table structure for `aunt_work`
-- ----------------------------
DROP TABLE IF EXISTS `aunt_work`;
CREATE TABLE `aunt_work` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `time` varchar(255) NOT NULL,
  `work` varchar(255) NOT NULL,
  `aunt_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aunt_work
-- ----------------------------
INSERT INTO `aunt_work` VALUES ('8', '12', '34', '30');
INSERT INTO `aunt_work` VALUES ('9', '12', '34', '31');
INSERT INTO `aunt_work` VALUES ('14', '3', '5', '36');
INSERT INTO `aunt_work` VALUES ('15', 'v', 'sd', '32');
INSERT INTO `aunt_work` VALUES ('16', 'vdsv', 'f', '32');
INSERT INTO `aunt_work` VALUES ('17', '1', '1', '37');
INSERT INTO `aunt_work` VALUES ('18', '2', '2', '38');
INSERT INTO `aunt_work` VALUES ('19', '2', '2', '39');
INSERT INTO `aunt_work` VALUES ('20', '2015.1.1', 'dfdf', '40');
INSERT INTO `aunt_work` VALUES ('21', '25425', 'ghg', '41');
INSERT INTO `aunt_work` VALUES ('22', '242', '24', '42');
INSERT INTO `aunt_work` VALUES ('23', 'dfdsf', 'fdsf', '43');
INSERT INTO `aunt_work` VALUES ('25', '啊', '啊', '45');
INSERT INTO `aunt_work` VALUES ('27', '1', '1', '47');
INSERT INTO `aunt_work` VALUES ('28', '2', '2', '48');
INSERT INTO `aunt_work` VALUES ('34', '8', '8', '54');
INSERT INTO `aunt_work` VALUES ('35', '3', '3', '55');
INSERT INTO `aunt_work` VALUES ('36', '1', '1', '56');
INSERT INTO `aunt_work` VALUES ('37', '1', '1', '57');
INSERT INTO `aunt_work` VALUES ('38', '1', '1', '58');
INSERT INTO `aunt_work` VALUES ('39', '1', '1', '59');
INSERT INTO `aunt_work` VALUES ('40', '1', '1', '60');
INSERT INTO `aunt_work` VALUES ('41', '啊', '啊', '61');
INSERT INTO `aunt_work` VALUES ('43', '2016-2017', '看厕所', '64');
INSERT INTO `aunt_work` VALUES ('44', '2016年9月20号', '带小孩', '65');

-- ----------------------------
-- Table structure for `authority`
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `alias` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authority
-- ----------------------------

-- ----------------------------
-- Table structure for `board`
-- ----------------------------
DROP TABLE IF EXISTS `board`;
CREATE TABLE `board` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT '',
  `name` varchar(255) NOT NULL,
  `time` bigint(20) NOT NULL,
  `url` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of board
-- ----------------------------
INSERT INTO `board` VALUES ('8', 'gaga2', '', '软件项目交付清单.doc', '1494817746', 'http://192.168.1.115:8080/nzj/upload/board_file/1494817570_7.doc');

-- ----------------------------
-- Table structure for `certificate`
-- ----------------------------
DROP TABLE IF EXISTS `certificate`;
CREATE TABLE `certificate` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of certificate
-- ----------------------------
INSERT INTO `certificate` VALUES ('1', '月嫂证');
INSERT INTO `certificate` VALUES ('2', '育婴师证');
INSERT INTO `certificate` VALUES ('3', '催乳师证');
INSERT INTO `certificate` VALUES ('4', '厨师证');
INSERT INTO `certificate` VALUES ('5', '营养师证');
INSERT INTO `certificate` VALUES ('6', '驾照');
INSERT INTO `certificate` VALUES ('7', '港澳通行证');
INSERT INTO `certificate` VALUES ('8', '学历证');
INSERT INTO `certificate` VALUES ('9', '乙肝两对半');

-- ----------------------------
-- Table structure for `cooking`
-- ----------------------------
DROP TABLE IF EXISTS `cooking`;
CREATE TABLE `cooking` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cooking
-- ----------------------------
INSERT INTO `cooking` VALUES ('1', '广东菜');
INSERT INTO `cooking` VALUES ('2', '辣菜');
INSERT INTO `cooking` VALUES ('3', '北方菜');
INSERT INTO `cooking` VALUES ('4', '面食');
INSERT INTO `cooking` VALUES ('5', '海鲜');

-- ----------------------------
-- Table structure for `employer`
-- ----------------------------
DROP TABLE IF EXISTS `employer`;
CREATE TABLE `employer` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `time` bigint(20) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT '',
  `content` varchar(255) NOT NULL,
  `status` int(11) NOT NULL COMMENT '-2黑名单 -1放弃 0新单 1已签约',
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employer
-- ----------------------------
INSERT INTO `employer` VALUES ('26', '小红', '1483200000', '2', 'joasdjfasjfjo', 'jj', '0', '6');
INSERT INTO `employer` VALUES ('83', '小白', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '-2', '1');
INSERT INTO `employer` VALUES ('84', '小西', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('85', '小猪', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('86', '小狗', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('87', '小猫', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('88', '小小', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('89', '小王', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '-1', '6');
INSERT INTO `employer` VALUES ('90', '小李', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('91', '小胡', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('92', '小靳', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('93', '小钱', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '-1', '1');
INSERT INTO `employer` VALUES ('94', '小赵', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('95', '小孙', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '6');
INSERT INTO `employer` VALUES ('96', '小周', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('97', '小吴', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '6');
INSERT INTO `employer` VALUES ('98', '小郑', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('99', '小王', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '-1', '6');
INSERT INTO `employer` VALUES ('100', '小曹', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('101', '小花', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '6');
INSERT INTO `employer` VALUES ('102', '校草', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('103', '小树', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('104', '小唧唧', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('105', '小眼睛', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('106', '小手', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('107', '小手指', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('108', '小可爱', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('112', '小王八', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '6');
INSERT INTO `employer` VALUES ('113', '小憨', '1483200000', '18156497852', '斌斌家的高老庄502号', '要蜘蛛精一样的大长腿', '0', '1');
INSERT INTO `employer` VALUES ('128', '小猴', '1494259200', '13566834679', '大幅度11111111111', '大幅度是的撒旦', '0', '1');
INSERT INTO `employer` VALUES ('130', '沙和尚', '1494259200', '1237', '深圳', '清洁工', '0', '1');
INSERT INTO `employer` VALUES ('140', 'hjfldh', '1496937600', '13894687569', '深圳窑洞', '美少女', '0', '1');

-- ----------------------------
-- Table structure for `employer_tracking`
-- ----------------------------
DROP TABLE IF EXISTS `employer_tracking`;
CREATE TABLE `employer_tracking` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `etime` bigint(20) NOT NULL,
  `econtent` varchar(255) NOT NULL,
  `employer_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employer_tracking
-- ----------------------------
INSERT INTO `employer_tracking` VALUES ('16', '1494518401', '我写的是中文呀，这个客户能不能看得懂我写的东西呢？', '83');
INSERT INTO `employer_tracking` VALUES ('17', '1494518400', 'nihaowoshinidedazuiba', '83');
INSERT INTO `employer_tracking` VALUES ('18', '1492012800', '我写中文会不会乱码，好怕怕。', '83');
INSERT INTO `employer_tracking` VALUES ('19', '1494000000', '添加成功了', '83');

-- ----------------------------
-- Table structure for `help`
-- ----------------------------
DROP TABLE IF EXISTS `help`;
CREATE TABLE `help` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `company` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `content` varchar(1000) NOT NULL,
  `status` int(20) NOT NULL COMMENT '状态码：-1已完成,0待处理，1已处理',
  `time` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `identifier` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of help
-- ----------------------------
INSERT INTO `help` VALUES ('2', '深圳市娘子军家政龙岗分店', '小毛驴', '18970853588', '总部快点给我们分公司发奖金啊，money不够花了啊', '0', '1495881760', '1', '01546846641');
INSERT INTO `help` VALUES ('3', '深圳市娘子军家政龙岗分店', '马六', '18970853588', '总部快点给我们分公司发奖金啊，money不够花了啊', '0', '1495881760', '1', '01546846642');
INSERT INTO `help` VALUES ('4', '深圳市娘子军家政龙华分店', '小丸子', '18975653588', '总部快点给我们分公司发奖金啊，money不够花了啊', '0', '1495881760', '1', '01546846643');
INSERT INTO `help` VALUES ('5', '深圳市娘子军家政龙华分店', '小丸子', '18975653588', '总部快点给我们分公司发奖金啊，money不够花了啊', '0', '1495881760', '1', '01546846644');
INSERT INTO `help` VALUES ('6', '深圳市娘子军家政龙华分店', '小丸子', '18975653588', '总部快点给我们分公司发奖金啊，money不够花了啊', '-1', '1495881760', '1', '01546846645');
INSERT INTO `help` VALUES ('8', '深圳市娘子军家政龙华分店', '小鸡吧', '18975653588', '总部快点给我们分公司发奖金啊，money不够花了啊', '0', '1495881760', '1', '01546846647');
INSERT INTO `help` VALUES ('9', '深圳市娘子军家政龙华分店', '小鸡吧', '18975653588', '总部快点给我们分公司发奖金啊，money不够花了啊', '1', '1495881760', '1', '01546846648');
INSERT INTO `help` VALUES ('10', '深圳市娘子军家政龙华分店', '小鸡吧', '18975653588', '总部快点给我们分公司发奖金啊，money不够花了啊', '0', '1495881760', '1', '01546846649');
INSERT INTO `help` VALUES ('11', '深圳市娘子军家政龙华分店', '小鸡吧', '18975653588', '总部快点给我们分公司发奖金啊，money不够花了啊', '0', '1495881760', '1', '015468466410');
INSERT INTO `help` VALUES ('12', 'nzjjz', '小马荣', '13975653588', '黄河之水天上来，奔流到海不复回。你懂的。', '0', '1495881760', '1', 'hp1495881760');
INSERT INTO `help` VALUES ('13', 'nzjjz', '小马荣', '13975653588', '黄河之水天上来，奔流到海不复回。你懂的。', '0', '1495881770', '1', 'hp1495881770');
INSERT INTO `help` VALUES ('14', 'nzjjz', '王三小', '13975653588', '天马行空的渣渣在那里，你妹的，考！', '0', '1495883533', '1', 'hp14958835336692');
INSERT INTO `help` VALUES ('15', 'nzjjz', '陈程', '13574651252', '涨工资', '0', '1496658141', '1', 'hp14966581417993');
INSERT INTO `help` VALUES ('16', '南山娘子军', '去', '13566080164', '去', '0', '1496972133', '1', 'hp14969721332258');
INSERT INTO `help` VALUES ('17', '南山娘子军', '毛六', '13589756425', '我要吃饭', '0', '1496997990', '1', 'hp14969979904985');

-- ----------------------------
-- Table structure for `job`
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES ('1', '保姆');
INSERT INTO `job` VALUES ('2', '育婴师');
INSERT INTO `job` VALUES ('3', '月嫂');
INSERT INTO `job` VALUES ('4', '照顾老人');
INSERT INTO `job` VALUES ('5', '家教');
INSERT INTO `job` VALUES ('6', '钟点');

-- ----------------------------
-- Table structure for `join_account`
-- ----------------------------
DROP TABLE IF EXISTS `join_account`;
CREATE TABLE `join_account` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `prepare` varchar(255) NOT NULL,
  `quantity` double(20,0) unsigned NOT NULL,
  `cityprice` double(20,0) unsigned NOT NULL,
  `atime` bigint(20) NOT NULL,
  `join_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of join_account
-- ----------------------------

-- ----------------------------
-- Table structure for `join_orders`
-- ----------------------------
DROP TABLE IF EXISTS `join_orders`;
CREATE TABLE `join_orders` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `perparer` varchar(255) NOT NULL COMMENT '表填人',
  `phone` varchar(255) NOT NULL,
  `status` int(20) NOT NULL COMMENT '0:审核中1:通过-1驳回:-2:已完成',
  `time` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of join_orders
-- ----------------------------
INSERT INTO `join_orders` VALUES ('8', 'jack', '13586944685', '0', '1496978078', '1');

-- ----------------------------
-- Table structure for `join_userdetail`
-- ----------------------------
DROP TABLE IF EXISTS `join_userdetail`;
CREATE TABLE `join_userdetail` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `joinorder_id` bigint(20) NOT NULL COMMENT '单订的id号',
  `userdetail_id` bigint(20) NOT NULL COMMENT '订单元素的组成：用户id（多个）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of join_userdetail
-- ----------------------------
INSERT INTO `join_userdetail` VALUES ('3', '6', '6');
INSERT INTO `join_userdetail` VALUES ('4', '6', '12');
INSERT INTO `join_userdetail` VALUES ('7', '8', '12');
INSERT INTO `join_userdetail` VALUES ('8', '8', '6');

-- ----------------------------
-- Table structure for `language`
-- ----------------------------
DROP TABLE IF EXISTS `language`;
CREATE TABLE `language` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of language
-- ----------------------------
INSERT INTO `language` VALUES ('1', '普通话');
INSERT INTO `language` VALUES ('2', '白话');
INSERT INTO `language` VALUES ('3', '客家话');
INSERT INTO `language` VALUES ('4', '潮州话');
INSERT INTO `language` VALUES ('5', '英语');

-- ----------------------------
-- Table structure for `log`
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `phone` bigint(20) NOT NULL,
  `operation` varchar(255) NOT NULL,
  `time` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5324 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------
INSERT INTO `log` VALUES ('1', '123', 'login', '1495452788');
INSERT INTO `log` VALUES ('2', '123', 'getAllShareAuntList', '1495452792');
INSERT INTO `log` VALUES ('3', '123', 'getAllShareEmployerList', '1495452792');
INSERT INTO `log` VALUES ('4', '123', 'login', '1495502916');
INSERT INTO `log` VALUES ('5', '123', 'getAllShareAuntList', '1495502919');
INSERT INTO `log` VALUES ('6', '123', 'getAllShareEmployerList', '1495502919');
INSERT INTO `log` VALUES ('7', '21323', 'login', '1495502934');
INSERT INTO `log` VALUES ('8', '123', 'login', '1495526004');
INSERT INTO `log` VALUES ('9', '123', 'getAllShareAuntList', '1495526007');
INSERT INTO `log` VALUES ('10', '123', 'getAllShareEmployerList', '1495526007');
INSERT INTO `log` VALUES ('11', '123', 'getAuntList', '1495526008');
INSERT INTO `log` VALUES ('12', '123', 'getAuntList', '1495526098');
INSERT INTO `log` VALUES ('13', '123', 'login', '1495526126');
INSERT INTO `log` VALUES ('14', '123', 'getAllShareAuntList', '1495526129');
INSERT INTO `log` VALUES ('15', '123', 'getAllShareEmployerList', '1495526129');
INSERT INTO `log` VALUES ('16', '123', 'getAuntList', '1495526130');
INSERT INTO `log` VALUES ('17', '123', 'getAuntList', '1495526140');
INSERT INTO `log` VALUES ('18', '123', 'login', '1495526438');
INSERT INTO `log` VALUES ('19', '123', 'getAllShareAuntList', '1495526441');
INSERT INTO `log` VALUES ('20', '123', 'getAllShareEmployerList', '1495526441');
INSERT INTO `log` VALUES ('21', '123', 'getAuntList', '1495526443');
INSERT INTO `log` VALUES ('22', '123', 'getAuntList', '1495526466');
INSERT INTO `log` VALUES ('23', '123', 'getAuntById', '1495526533');
INSERT INTO `log` VALUES ('24', '123', 'login', '1495526622');
INSERT INTO `log` VALUES ('25', '123', 'getAllShareAuntList', '1495526624');
INSERT INTO `log` VALUES ('26', '123', 'getAllShareEmployerList', '1495526624');
INSERT INTO `log` VALUES ('27', '123', 'getAuntById', '1495526634');
INSERT INTO `log` VALUES ('28', '123', 'getAuntById', '1495526664');
INSERT INTO `log` VALUES ('29', '123', 'getAuntById', '1495526681');
INSERT INTO `log` VALUES ('30', '123', 'getSession', '1495527524');
INSERT INTO `log` VALUES ('31', '123', 'getPactList', '1495527553');
INSERT INTO `log` VALUES ('32', '123', 'getSession', '1495528424');
INSERT INTO `log` VALUES ('33', '123', 'getSession', '1495529324');
INSERT INTO `log` VALUES ('34', '123', 'getSession', '1495530224');
INSERT INTO `log` VALUES ('35', '123', 'login', '1495530414');
INSERT INTO `log` VALUES ('36', '123', 'getAllShareAuntList', '1495530416');
INSERT INTO `log` VALUES ('37', '123', 'getAllShareEmployerList', '1495530417');
INSERT INTO `log` VALUES ('38', '123', 'addAunt', '1495530419');
INSERT INTO `log` VALUES ('39', '123', 'addAunt', '1495530446');
INSERT INTO `log` VALUES ('40', '123', 'addAunt', '1495530452');
INSERT INTO `log` VALUES ('41', '123', 'addAunt', '1495530459');
INSERT INTO `log` VALUES ('42', '123', 'addAunt', '1495530464');
INSERT INTO `log` VALUES ('43', '123', 'getPactList', '1495531143');
INSERT INTO `log` VALUES ('44', '123', 'getPactList', '1495531148');
INSERT INTO `log` VALUES ('45', '123', 'getPactList', '1495531153');
INSERT INTO `log` VALUES ('46', '123', 'getPactList', '1495531153');
INSERT INTO `log` VALUES ('47', '123', 'getPactList', '1495531153');
INSERT INTO `log` VALUES ('48', '123', 'getPactList', '1495531153');
INSERT INTO `log` VALUES ('49', '123', 'getPactList', '1495531154');
INSERT INTO `log` VALUES ('50', '123', 'getPactList', '1495531154');
INSERT INTO `log` VALUES ('51', '123', 'getPactList', '1495531154');
INSERT INTO `log` VALUES ('52', '123', 'getPactList', '1495531154');
INSERT INTO `log` VALUES ('53', '123', 'getPactList', '1495531154');
INSERT INTO `log` VALUES ('54', '123', 'getPactList', '1495531154');
INSERT INTO `log` VALUES ('55', '123', 'getPactList', '1495531155');
INSERT INTO `log` VALUES ('56', '123', 'getPactList', '1495531155');
INSERT INTO `log` VALUES ('57', '123', 'getPactList', '1495531155');
INSERT INTO `log` VALUES ('58', '123', 'getPactList', '1495531155');
INSERT INTO `log` VALUES ('59', '123', 'getPactList', '1495531155');
INSERT INTO `log` VALUES ('60', '123', 'getPactList', '1495531156');
INSERT INTO `log` VALUES ('61', '123', 'getPactList', '1495531156');
INSERT INTO `log` VALUES ('62', '123', 'getPactList', '1495531157');
INSERT INTO `log` VALUES ('63', '123', 'getPactList', '1495531157');
INSERT INTO `log` VALUES ('64', '123', 'getPactList', '1495531157');
INSERT INTO `log` VALUES ('65', '123', 'getPactList', '1495531158');
INSERT INTO `log` VALUES ('66', '123', 'getPactList', '1495531158');
INSERT INTO `log` VALUES ('67', '123', 'getPactList', '1495531158');
INSERT INTO `log` VALUES ('68', '123', 'getAuntList', '1495531178');
INSERT INTO `log` VALUES ('69', '123', 'getLanguageList', '1495531179');
INSERT INTO `log` VALUES ('70', '123', 'getCookingList', '1495531179');
INSERT INTO `log` VALUES ('71', '123', 'getSkillList', '1495531179');
INSERT INTO `log` VALUES ('72', '123', 'getApplianceList', '1495531179');
INSERT INTO `log` VALUES ('73', '123', 'getJobList', '1495531179');
INSERT INTO `log` VALUES ('74', '123', 'getCertificateList', '1495531179');
INSERT INTO `log` VALUES ('75', '123', 'getAuntById', '1495531183');
INSERT INTO `log` VALUES ('76', '123', 'getAuntById', '1495531187');
INSERT INTO `log` VALUES ('77', '123', 'getSession', '1495531316');
INSERT INTO `log` VALUES ('78', '123', 'addAunt', '1495531707');
INSERT INTO `log` VALUES ('79', '123', 'addAunt', '1495531719');
INSERT INTO `log` VALUES ('80', '123', 'addAunt', '1495531729');
INSERT INTO `log` VALUES ('81', '123', 'login', '1495531818');
INSERT INTO `log` VALUES ('82', '123', 'getAllShareAuntList', '1495531821');
INSERT INTO `log` VALUES ('83', '123', 'getAllShareEmployerList', '1495531821');
INSERT INTO `log` VALUES ('84', '123', 'login', '1495532233');
INSERT INTO `log` VALUES ('85', '123', 'getAllShareAuntList', '1495532235');
INSERT INTO `log` VALUES ('86', '123', 'getAllShareEmployerList', '1495532236');
INSERT INTO `log` VALUES ('87', '123', 'login', '1495532518');
INSERT INTO `log` VALUES ('88', '123', 'getAllShareAuntList', '1495532520');
INSERT INTO `log` VALUES ('89', '123', 'getAllShareEmployerList', '1495532520');
INSERT INTO `log` VALUES ('90', '123', 'getSession', '1495533420');
INSERT INTO `log` VALUES ('91', '123', 'getSession', '1495534320');
INSERT INTO `log` VALUES ('92', '123', 'getSession', '1495535220');
INSERT INTO `log` VALUES ('93', '123', 'login', '1495588347');
INSERT INTO `log` VALUES ('94', '123', 'getAllShareAuntList', '1495588351');
INSERT INTO `log` VALUES ('95', '123', 'getAllShareEmployerList', '1495588351');
INSERT INTO `log` VALUES ('96', '123', 'getShareEmployerList', '1495588352');
INSERT INTO `log` VALUES ('97', '18124606495', 'login', '1495588372');
INSERT INTO `log` VALUES ('98', '18124606495', 'getUser', '1495588375');
INSERT INTO `log` VALUES ('99', '18124606495', 'getShareEmployerList', '1495588375');
INSERT INTO `log` VALUES ('100', '18124606495', 'getShareAuntList', '1495588375');
INSERT INTO `log` VALUES ('101', '18124606495', 'getUnShareAuntList', '1495588375');
INSERT INTO `log` VALUES ('102', '18124606495', 'getAllShareEmployerList', '1495588376');
INSERT INTO `log` VALUES ('103', '18124606495', 'getArticleList', '1495588382');
INSERT INTO `log` VALUES ('104', '18124606495', 'getBoardList', '1495588383');
INSERT INTO `log` VALUES ('105', '18124606495', 'getAllShareEmployerList', '1495588404');
INSERT INTO `log` VALUES ('106', '18124606495', 'getArticleList', '1495588406');
INSERT INTO `log` VALUES ('107', '18124606495', 'getBoardList', '1495588406');
INSERT INTO `log` VALUES ('108', '18124606495', 'getUser', '1495588579');
INSERT INTO `log` VALUES ('109', '18124606495', 'getShareEmployerList', '1495588579');
INSERT INTO `log` VALUES ('110', '18124606495', 'getShareAuntList', '1495588579');
INSERT INTO `log` VALUES ('111', '18124606495', 'getUnShareAuntList', '1495588580');
INSERT INTO `log` VALUES ('112', '18124606495', 'getAllShareEmployerList', '1495588580');
INSERT INTO `log` VALUES ('113', '18124606495', 'getArticleList', '1495588582');
INSERT INTO `log` VALUES ('114', '18124606495', 'getBoardList', '1495588582');
INSERT INTO `log` VALUES ('115', '18124606495', 'login', '1495588593');
INSERT INTO `log` VALUES ('116', '18124606495', 'getUser', '1495588593');
INSERT INTO `log` VALUES ('117', '18124606495', 'getShareEmployerList', '1495588593');
INSERT INTO `log` VALUES ('118', '18124606495', 'getShareAuntList', '1495588593');
INSERT INTO `log` VALUES ('119', '18124606495', 'getUnShareAuntList', '1495588593');
INSERT INTO `log` VALUES ('120', '18124606495', 'getAllShareEmployerList', '1495588594');
INSERT INTO `log` VALUES ('121', '18124606495', 'getArticleList', '1495588594');
INSERT INTO `log` VALUES ('122', '18124606495', 'getBoardList', '1495588594');
INSERT INTO `log` VALUES ('123', '18124606495', 'getUser', '1495588626');
INSERT INTO `log` VALUES ('124', '18124606495', 'getShareEmployerList', '1495588626');
INSERT INTO `log` VALUES ('125', '18124606495', 'getShareAuntList', '1495588626');
INSERT INTO `log` VALUES ('126', '18124606495', 'getUnShareAuntList', '1495588626');
INSERT INTO `log` VALUES ('127', '18124606495', 'getAllShareEmployerList', '1495588627');
INSERT INTO `log` VALUES ('128', '18124606495', 'getArticleList', '1495588627');
INSERT INTO `log` VALUES ('129', '18124606495', 'getBoardList', '1495588627');
INSERT INTO `log` VALUES ('130', '18124606495', 'getEmployerList', '1495588759');
INSERT INTO `log` VALUES ('131', '18124606495', 'getAllShareEmployerList', '1495588763');
INSERT INTO `log` VALUES ('132', '18124606495', 'getArticleList', '1495588763');
INSERT INTO `log` VALUES ('133', '18124606495', 'getBoardList', '1495588763');
INSERT INTO `log` VALUES ('134', '123', 'getSession', '1495589251');
INSERT INTO `log` VALUES ('135', '18124606495', 'getSession', '1495589526');
INSERT INTO `log` VALUES ('136', '123', 'getSession', '1495590151');
INSERT INTO `log` VALUES ('137', '18124606495', 'getSession', '1495590426');
INSERT INTO `log` VALUES ('138', '123', 'getSession', '1495591051');
INSERT INTO `log` VALUES ('139', '18124606495', 'getSession', '1495591326');
INSERT INTO `log` VALUES ('140', '123', 'getArticleList', '1495591580');
INSERT INTO `log` VALUES ('141', '18124606495', 'login', '1495591772');
INSERT INTO `log` VALUES ('142', '18124606495', 'getUser', '1495591773');
INSERT INTO `log` VALUES ('143', '18124606495', 'getShareEmployerList', '1495591773');
INSERT INTO `log` VALUES ('144', '18124606495', 'getShareAuntList', '1495591773');
INSERT INTO `log` VALUES ('145', '18124606495', 'getUnShareAuntList', '1495591773');
INSERT INTO `log` VALUES ('146', '18124606495', 'getAllShareEmployerList', '1495591773');
INSERT INTO `log` VALUES ('147', '18124606495', 'getArticleList', '1495591774');
INSERT INTO `log` VALUES ('148', '18124606495', 'getBoardList', '1495591774');
INSERT INTO `log` VALUES ('149', '18124606495', 'getUser', '1495591851');
INSERT INTO `log` VALUES ('150', '18124606495', 'getShareEmployerList', '1495591851');
INSERT INTO `log` VALUES ('151', '18124606495', 'getShareAuntList', '1495591851');
INSERT INTO `log` VALUES ('152', '18124606495', 'getUnShareAuntList', '1495591851');
INSERT INTO `log` VALUES ('153', '18124606495', 'getAllShareEmployerList', '1495591851');
INSERT INTO `log` VALUES ('154', '18124606495', 'getArticleList', '1495591851');
INSERT INTO `log` VALUES ('155', '18124606495', 'getBoardList', '1495591852');
INSERT INTO `log` VALUES ('156', '18124606495', 'getUser', '1495592156');
INSERT INTO `log` VALUES ('157', '18124606495', 'getShareEmployerList', '1495592157');
INSERT INTO `log` VALUES ('158', '18124606495', 'getShareAuntList', '1495592157');
INSERT INTO `log` VALUES ('159', '18124606495', 'getUnShareAuntList', '1495592157');
INSERT INTO `log` VALUES ('160', '18124606495', 'getAllShareEmployerList', '1495592157');
INSERT INTO `log` VALUES ('161', '18124606495', 'getArticleList', '1495592157');
INSERT INTO `log` VALUES ('162', '18124606495', 'getBoardList', '1495592157');
INSERT INTO `log` VALUES ('163', '18124606495', 'getUser', '1495592458');
INSERT INTO `log` VALUES ('164', '18124606495', 'getShareEmployerList', '1495592459');
INSERT INTO `log` VALUES ('165', '18124606495', 'getShareAuntList', '1495592459');
INSERT INTO `log` VALUES ('166', '18124606495', 'getUnShareAuntList', '1495592459');
INSERT INTO `log` VALUES ('167', '18124606495', 'getAllShareEmployerList', '1495592459');
INSERT INTO `log` VALUES ('168', '18124606495', 'getArticleList', '1495592459');
INSERT INTO `log` VALUES ('169', '18124606495', 'getBoardList', '1495592460');
INSERT INTO `log` VALUES ('170', '18124606495', 'updateUserDetail', '1495592465');
INSERT INTO `log` VALUES ('171', '18124606495', 'updateUserDetail', '1495592472');
INSERT INTO `log` VALUES ('172', '18124606495', 'getUser', '1495592492');
INSERT INTO `log` VALUES ('173', '18124606495', 'getShareEmployerList', '1495592493');
INSERT INTO `log` VALUES ('174', '18124606495', 'getShareAuntList', '1495592493');
INSERT INTO `log` VALUES ('175', '18124606495', 'getUnShareAuntList', '1495592493');
INSERT INTO `log` VALUES ('176', '18124606495', 'getAllShareEmployerList', '1495592493');
INSERT INTO `log` VALUES ('177', '18124606495', 'getArticleList', '1495592493');
INSERT INTO `log` VALUES ('178', '18124606495', 'getBoardList', '1495592493');
INSERT INTO `log` VALUES ('179', '18124606495', 'updateUserDetail', '1495592499');
INSERT INTO `log` VALUES ('180', '18124606495', 'login', '1495592508');
INSERT INTO `log` VALUES ('181', '18124606495', 'getUser', '1495592509');
INSERT INTO `log` VALUES ('182', '18124606495', 'getShareEmployerList', '1495592509');
INSERT INTO `log` VALUES ('183', '18124606495', 'getShareAuntList', '1495592509');
INSERT INTO `log` VALUES ('184', '18124606495', 'getUnShareAuntList', '1495592509');
INSERT INTO `log` VALUES ('185', '18124606495', 'getAllShareEmployerList', '1495592510');
INSERT INTO `log` VALUES ('186', '18124606495', 'getArticleList', '1495592510');
INSERT INTO `log` VALUES ('187', '18124606495', 'getBoardList', '1495592510');
INSERT INTO `log` VALUES ('188', '18124606495', 'getUser', '1495592541');
INSERT INTO `log` VALUES ('189', '18124606495', 'getShareEmployerList', '1495592541');
INSERT INTO `log` VALUES ('190', '18124606495', 'getShareAuntList', '1495592542');
INSERT INTO `log` VALUES ('191', '18124606495', 'getUnShareAuntList', '1495592542');
INSERT INTO `log` VALUES ('192', '18124606495', 'getAllShareEmployerList', '1495592542');
INSERT INTO `log` VALUES ('193', '18124606495', 'getArticleList', '1495592542');
INSERT INTO `log` VALUES ('194', '18124606495', 'getBoardList', '1495592542');
INSERT INTO `log` VALUES ('195', '18124606495', 'getUser', '1495592656');
INSERT INTO `log` VALUES ('196', '18124606495', 'getShareEmployerList', '1495592656');
INSERT INTO `log` VALUES ('197', '18124606495', 'getShareAuntList', '1495592656');
INSERT INTO `log` VALUES ('198', '18124606495', 'getUnShareAuntList', '1495592656');
INSERT INTO `log` VALUES ('199', '18124606495', 'getAllShareEmployerList', '1495592657');
INSERT INTO `log` VALUES ('200', '18124606495', 'getArticleList', '1495592657');
INSERT INTO `log` VALUES ('201', '18124606495', 'getBoardList', '1495592657');
INSERT INTO `log` VALUES ('202', '18124606495', 'getUser', '1495592789');
INSERT INTO `log` VALUES ('203', '18124606495', 'getShareEmployerList', '1495592789');
INSERT INTO `log` VALUES ('204', '18124606495', 'getShareAuntList', '1495592790');
INSERT INTO `log` VALUES ('205', '18124606495', 'getUnShareAuntList', '1495592790');
INSERT INTO `log` VALUES ('206', '18124606495', 'getAllShareEmployerList', '1495592790');
INSERT INTO `log` VALUES ('207', '18124606495', 'getArticleList', '1495592790');
INSERT INTO `log` VALUES ('208', '18124606495', 'getBoardList', '1495592790');
INSERT INTO `log` VALUES ('209', '18124606495', 'getUser', '1495592918');
INSERT INTO `log` VALUES ('210', '18124606495', 'getShareEmployerList', '1495592918');
INSERT INTO `log` VALUES ('211', '18124606495', 'getShareAuntList', '1495592918');
INSERT INTO `log` VALUES ('212', '18124606495', 'getUnShareAuntList', '1495592918');
INSERT INTO `log` VALUES ('213', '18124606495', 'getAllShareEmployerList', '1495592919');
INSERT INTO `log` VALUES ('214', '18124606495', 'getArticleList', '1495592919');
INSERT INTO `log` VALUES ('215', '18124606495', 'getBoardList', '1495592919');
INSERT INTO `log` VALUES ('216', '18124606495', 'getUser', '1495592943');
INSERT INTO `log` VALUES ('217', '18124606495', 'getShareEmployerList', '1495592943');
INSERT INTO `log` VALUES ('218', '18124606495', 'getShareAuntList', '1495592943');
INSERT INTO `log` VALUES ('219', '18124606495', 'getUnShareAuntList', '1495592944');
INSERT INTO `log` VALUES ('220', '18124606495', 'getAllShareEmployerList', '1495592944');
INSERT INTO `log` VALUES ('221', '18124606495', 'getArticleList', '1495592944');
INSERT INTO `log` VALUES ('222', '18124606495', 'getBoardList', '1495592944');
INSERT INTO `log` VALUES ('223', '18124606495', 'login', '1495592966');
INSERT INTO `log` VALUES ('224', '18124606495', 'getUser', '1495592967');
INSERT INTO `log` VALUES ('225', '18124606495', 'getShareEmployerList', '1495592967');
INSERT INTO `log` VALUES ('226', '18124606495', 'getShareAuntList', '1495592967');
INSERT INTO `log` VALUES ('227', '18124606495', 'getUnShareAuntList', '1495592967');
INSERT INTO `log` VALUES ('228', '18124606495', 'getAllShareEmployerList', '1495592967');
INSERT INTO `log` VALUES ('229', '18124606495', 'getArticleList', '1495592968');
INSERT INTO `log` VALUES ('230', '18124606495', 'getBoardList', '1495592968');
INSERT INTO `log` VALUES ('231', '18124606495', 'getUser', '1495593145');
INSERT INTO `log` VALUES ('232', '18124606495', 'getShareEmployerList', '1495593145');
INSERT INTO `log` VALUES ('233', '18124606495', 'getShareAuntList', '1495593145');
INSERT INTO `log` VALUES ('234', '18124606495', 'getUnShareAuntList', '1495593146');
INSERT INTO `log` VALUES ('235', '18124606495', 'getAllShareEmployerList', '1495593146');
INSERT INTO `log` VALUES ('236', '18124606495', 'getArticleList', '1495593146');
INSERT INTO `log` VALUES ('237', '18124606495', 'getBoardList', '1495593146');
INSERT INTO `log` VALUES ('238', '18124606495', 'getUser', '1495593253');
INSERT INTO `log` VALUES ('239', '18124606495', 'getShareEmployerList', '1495593253');
INSERT INTO `log` VALUES ('240', '18124606495', 'getShareAuntList', '1495593253');
INSERT INTO `log` VALUES ('241', '18124606495', 'getUnShareAuntList', '1495593253');
INSERT INTO `log` VALUES ('242', '18124606495', 'getAllShareEmployerList', '1495593254');
INSERT INTO `log` VALUES ('243', '18124606495', 'getArticleList', '1495593254');
INSERT INTO `log` VALUES ('244', '18124606495', 'getBoardList', '1495593254');
INSERT INTO `log` VALUES ('245', '18124606495', 'getUser', '1495593299');
INSERT INTO `log` VALUES ('246', '18124606495', 'getShareEmployerList', '1495593300');
INSERT INTO `log` VALUES ('247', '18124606495', 'getShareAuntList', '1495593300');
INSERT INTO `log` VALUES ('248', '18124606495', 'getUnShareAuntList', '1495593300');
INSERT INTO `log` VALUES ('249', '18124606495', 'getAllShareEmployerList', '1495593300');
INSERT INTO `log` VALUES ('250', '18124606495', 'getArticleList', '1495593300');
INSERT INTO `log` VALUES ('251', '18124606495', 'getBoardList', '1495593301');
INSERT INTO `log` VALUES ('252', '18124606495', 'getUser', '1495593356');
INSERT INTO `log` VALUES ('253', '18124606495', 'getShareEmployerList', '1495593357');
INSERT INTO `log` VALUES ('254', '18124606495', 'getShareAuntList', '1495593357');
INSERT INTO `log` VALUES ('255', '18124606495', 'getUnShareAuntList', '1495593357');
INSERT INTO `log` VALUES ('256', '18124606495', 'getAllShareEmployerList', '1495593357');
INSERT INTO `log` VALUES ('257', '18124606495', 'getArticleList', '1495593358');
INSERT INTO `log` VALUES ('258', '18124606495', 'getBoardList', '1495593358');
INSERT INTO `log` VALUES ('259', '18124606495', 'getUser', '1495593462');
INSERT INTO `log` VALUES ('260', '18124606495', 'getShareEmployerList', '1495593462');
INSERT INTO `log` VALUES ('261', '18124606495', 'getShareAuntList', '1495593463');
INSERT INTO `log` VALUES ('262', '18124606495', 'getUnShareAuntList', '1495593463');
INSERT INTO `log` VALUES ('263', '18124606495', 'getAllShareEmployerList', '1495593463');
INSERT INTO `log` VALUES ('264', '18124606495', 'getArticleList', '1495593463');
INSERT INTO `log` VALUES ('265', '18124606495', 'getBoardList', '1495593463');
INSERT INTO `log` VALUES ('266', '18124606495', 'getUser', '1495593579');
INSERT INTO `log` VALUES ('267', '18124606495', 'getShareEmployerList', '1495593579');
INSERT INTO `log` VALUES ('268', '18124606495', 'getShareAuntList', '1495593579');
INSERT INTO `log` VALUES ('269', '18124606495', 'getUnShareAuntList', '1495593579');
INSERT INTO `log` VALUES ('270', '18124606495', 'getAllShareEmployerList', '1495593579');
INSERT INTO `log` VALUES ('271', '18124606495', 'getArticleList', '1495593579');
INSERT INTO `log` VALUES ('272', '18124606495', 'getBoardList', '1495593580');
INSERT INTO `log` VALUES ('273', '18124606495', 'getUser', '1495593617');
INSERT INTO `log` VALUES ('274', '18124606495', 'getShareEmployerList', '1495593617');
INSERT INTO `log` VALUES ('275', '18124606495', 'getShareAuntList', '1495593618');
INSERT INTO `log` VALUES ('276', '18124606495', 'getUnShareAuntList', '1495593618');
INSERT INTO `log` VALUES ('277', '18124606495', 'getAllShareEmployerList', '1495593618');
INSERT INTO `log` VALUES ('278', '18124606495', 'getArticleList', '1495593618');
INSERT INTO `log` VALUES ('279', '18124606495', 'getBoardList', '1495593618');
INSERT INTO `log` VALUES ('280', '18124606495', 'updateUserDetail', '1495593627');
INSERT INTO `log` VALUES ('281', '18124606495', 'getUser', '1495594085');
INSERT INTO `log` VALUES ('282', '18124606495', 'getShareEmployerList', '1495594085');
INSERT INTO `log` VALUES ('283', '18124606495', 'getShareAuntList', '1495594086');
INSERT INTO `log` VALUES ('284', '18124606495', 'getUnShareAuntList', '1495594086');
INSERT INTO `log` VALUES ('285', '18124606495', 'getAllShareEmployerList', '1495594086');
INSERT INTO `log` VALUES ('286', '18124606495', 'getArticleList', '1495594086');
INSERT INTO `log` VALUES ('287', '18124606495', 'getBoardList', '1495594086');
INSERT INTO `log` VALUES ('288', '18124606495', 'updateUserDetail', '1495594102');
INSERT INTO `log` VALUES ('289', '18124606495', 'getUser', '1495594411');
INSERT INTO `log` VALUES ('290', '18124606495', 'getShareEmployerList', '1495594411');
INSERT INTO `log` VALUES ('291', '18124606495', 'getShareAuntList', '1495594411');
INSERT INTO `log` VALUES ('292', '18124606495', 'getUnShareAuntList', '1495594411');
INSERT INTO `log` VALUES ('293', '18124606495', 'getAllShareEmployerList', '1495594412');
INSERT INTO `log` VALUES ('294', '18124606495', 'getArticleList', '1495594412');
INSERT INTO `log` VALUES ('295', '18124606495', 'getBoardList', '1495594412');
INSERT INTO `log` VALUES ('296', '18124606495', 'login', '1495594430');
INSERT INTO `log` VALUES ('297', '18124606495', 'getUser', '1495594430');
INSERT INTO `log` VALUES ('298', '18124606495', 'getShareEmployerList', '1495594430');
INSERT INTO `log` VALUES ('299', '18124606495', 'getShareAuntList', '1495594431');
INSERT INTO `log` VALUES ('300', '18124606495', 'getUnShareAuntList', '1495594431');
INSERT INTO `log` VALUES ('301', '18124606495', 'getAllShareEmployerList', '1495594431');
INSERT INTO `log` VALUES ('302', '18124606495', 'getArticleList', '1495594431');
INSERT INTO `log` VALUES ('303', '18124606495', 'getBoardList', '1495594431');
INSERT INTO `log` VALUES ('304', '18124606495', 'updateUserDetail', '1495594446');
INSERT INTO `log` VALUES ('305', '18124606495', 'getUser', '1495594673');
INSERT INTO `log` VALUES ('306', '18124606495', 'getShareEmployerList', '1495594673');
INSERT INTO `log` VALUES ('307', '18124606495', 'getShareAuntList', '1495594673');
INSERT INTO `log` VALUES ('308', '18124606495', 'getUnShareAuntList', '1495594673');
INSERT INTO `log` VALUES ('309', '18124606495', 'getAllShareEmployerList', '1495594674');
INSERT INTO `log` VALUES ('310', '18124606495', 'getArticleList', '1495594674');
INSERT INTO `log` VALUES ('311', '18124606495', 'getBoardList', '1495594674');
INSERT INTO `log` VALUES ('312', '18124606495', 'updateUserDetail', '1495594685');
INSERT INTO `log` VALUES ('313', '123', 'login', '1495594833');
INSERT INTO `log` VALUES ('314', '123', 'getAllShareAuntList', '1495594833');
INSERT INTO `log` VALUES ('315', '123', 'getAllShareEmployerList', '1495594834');
INSERT INTO `log` VALUES ('316', '18124606495', 'getUser', '1495594762');
INSERT INTO `log` VALUES ('317', '18124606495', 'getShareEmployerList', '1495594762');
INSERT INTO `log` VALUES ('318', '18124606495', 'getShareAuntList', '1495594762');
INSERT INTO `log` VALUES ('319', '18124606495', 'getUnShareAuntList', '1495594762');
INSERT INTO `log` VALUES ('320', '18124606495', 'getAllShareEmployerList', '1495594763');
INSERT INTO `log` VALUES ('321', '18124606495', 'getArticleList', '1495594763');
INSERT INTO `log` VALUES ('322', '18124606495', 'getBoardList', '1495594763');
INSERT INTO `log` VALUES ('323', '18124606495', 'updateUserDetail', '1495594772');
INSERT INTO `log` VALUES ('324', '18124606495', 'getUser', '1495594835');
INSERT INTO `log` VALUES ('325', '18124606495', 'getShareEmployerList', '1495594835');
INSERT INTO `log` VALUES ('326', '18124606495', 'getShareAuntList', '1495594835');
INSERT INTO `log` VALUES ('327', '18124606495', 'getUnShareAuntList', '1495594835');
INSERT INTO `log` VALUES ('328', '18124606495', 'getAllShareEmployerList', '1495594835');
INSERT INTO `log` VALUES ('329', '18124606495', 'getArticleList', '1495594836');
INSERT INTO `log` VALUES ('330', '18124606495', 'getBoardList', '1495594836');
INSERT INTO `log` VALUES ('331', '123', 'getUser', '1495594937');
INSERT INTO `log` VALUES ('332', '18124606495', 'updateUserDetail', '1495594849');
INSERT INTO `log` VALUES ('333', '123', 'updateUserDetail', '1495594961');
INSERT INTO `log` VALUES ('334', '123', 'getAllShareAuntList', '1495594971');
INSERT INTO `log` VALUES ('335', '123', 'getAllShareEmployerList', '1495594972');
INSERT INTO `log` VALUES ('336', '123', 'getUser', '1495594974');
INSERT INTO `log` VALUES ('337', '123', 'updateUserDetail', '1495594983');
INSERT INTO `log` VALUES ('338', '123', 'updateUserDetail', '1495594992');
INSERT INTO `log` VALUES ('339', '123', 'updateUserDetail', '1495595001');
INSERT INTO `log` VALUES ('340', '18124606495', 'getUser', '1495594911');
INSERT INTO `log` VALUES ('341', '18124606495', 'getShareEmployerList', '1495594911');
INSERT INTO `log` VALUES ('342', '18124606495', 'getShareAuntList', '1495594911');
INSERT INTO `log` VALUES ('343', '18124606495', 'getUnShareAuntList', '1495594912');
INSERT INTO `log` VALUES ('344', '18124606495', 'getAllShareEmployerList', '1495594912');
INSERT INTO `log` VALUES ('345', '18124606495', 'getArticleList', '1495594912');
INSERT INTO `log` VALUES ('346', '18124606495', 'getBoardList', '1495594912');
INSERT INTO `log` VALUES ('347', '18124606495', 'updateUserDetail', '1495594923');
INSERT INTO `log` VALUES ('348', '18124606495', 'getUser', '1495595194');
INSERT INTO `log` VALUES ('349', '18124606495', 'getUser', '1495595270');
INSERT INTO `log` VALUES ('350', '18124606495', 'getShareEmployerList', '1495595270');
INSERT INTO `log` VALUES ('351', '18124606495', 'getShareAuntList', '1495595271');
INSERT INTO `log` VALUES ('352', '18124606495', 'getUnShareAuntList', '1495595271');
INSERT INTO `log` VALUES ('353', '18124606495', 'getAllShareEmployerList', '1495595271');
INSERT INTO `log` VALUES ('354', '18124606495', 'getArticleList', '1495595271');
INSERT INTO `log` VALUES ('355', '18124606495', 'getBoardList', '1495595271');
INSERT INTO `log` VALUES ('356', '18124606495', 'getUser', '1495595272');
INSERT INTO `log` VALUES ('357', '18124606495', 'getShareEmployerList', '1495595272');
INSERT INTO `log` VALUES ('358', '18124606495', 'getShareAuntList', '1495595272');
INSERT INTO `log` VALUES ('359', '18124606495', 'getUnShareAuntList', '1495595272');
INSERT INTO `log` VALUES ('360', '18124606495', 'getAllShareEmployerList', '1495595272');
INSERT INTO `log` VALUES ('361', '18124606495', 'getArticleList', '1495595273');
INSERT INTO `log` VALUES ('362', '18124606495', 'getBoardList', '1495595273');
INSERT INTO `log` VALUES ('363', '18124606495', 'updateUserDetail', '1495595286');
INSERT INTO `log` VALUES ('364', '18124606495', 'getUser', '1495595347');
INSERT INTO `log` VALUES ('365', '18124606495', 'getShareEmployerList', '1495595347');
INSERT INTO `log` VALUES ('366', '18124606495', 'getShareAuntList', '1495595347');
INSERT INTO `log` VALUES ('367', '18124606495', 'getUnShareAuntList', '1495595347');
INSERT INTO `log` VALUES ('368', '18124606495', 'getAllShareEmployerList', '1495595348');
INSERT INTO `log` VALUES ('369', '18124606495', 'getArticleList', '1495595348');
INSERT INTO `log` VALUES ('370', '18124606495', 'getBoardList', '1495595348');
INSERT INTO `log` VALUES ('371', '18124606495', 'updateUserDetail', '1495595358');
INSERT INTO `log` VALUES ('372', '18124606495', 'getUser', '1495595374');
INSERT INTO `log` VALUES ('373', '18124606495', 'getShareEmployerList', '1495595374');
INSERT INTO `log` VALUES ('374', '18124606495', 'getShareAuntList', '1495595374');
INSERT INTO `log` VALUES ('375', '18124606495', 'getUnShareAuntList', '1495595375');
INSERT INTO `log` VALUES ('376', '18124606495', 'getAllShareEmployerList', '1495595375');
INSERT INTO `log` VALUES ('377', '18124606495', 'getArticleList', '1495595375');
INSERT INTO `log` VALUES ('378', '18124606495', 'getBoardList', '1495595375');
INSERT INTO `log` VALUES ('379', '18124606495', 'updateUserDetail', '1495595384');
INSERT INTO `log` VALUES ('380', '123', 'getSession', '1495595888');
INSERT INTO `log` VALUES ('381', '123', 'login', '1495595912');
INSERT INTO `log` VALUES ('382', '123', 'getSession', '1495595932');
INSERT INTO `log` VALUES ('383', '123', 'getEmployerList', '1495595946');
INSERT INTO `log` VALUES ('384', '123', 'login', '1495595964');
INSERT INTO `log` VALUES ('385', '123', 'getEmployerList', '1495595967');
INSERT INTO `log` VALUES ('386', '123', 'updateEmployer', '1495596022');
INSERT INTO `log` VALUES ('387', '123', 'getEmployerList', '1495596031');
INSERT INTO `log` VALUES ('388', '123', 'getUser', '1495596118');
INSERT INTO `log` VALUES ('389', '123', 'login', '1495596180');
INSERT INTO `log` VALUES ('390', '123', 'getEmployerList', '1495596201');
INSERT INTO `log` VALUES ('391', '123', 'deleteEmployer', '1495596211');
INSERT INTO `log` VALUES ('392', '123', 'getEmployerList', '1495596211');
INSERT INTO `log` VALUES ('393', '123', 'deleteEmployer', '1495596246');
INSERT INTO `log` VALUES ('394', '123', 'getEmployerList', '1495596246');
INSERT INTO `log` VALUES ('395', '123', 'updateEmployer', '1495596280');
INSERT INTO `log` VALUES ('396', '123', 'getEmployerList', '1495596281');
INSERT INTO `log` VALUES ('397', '123', 'getEmployerList', '1495596295');
INSERT INTO `log` VALUES ('398', '18124606495', 'getSession', '1495596275');
INSERT INTO `log` VALUES ('399', '123', 'updateEmployer', '1495596313');
INSERT INTO `log` VALUES ('400', '123', 'getEmployerList', '1495596313');
INSERT INTO `log` VALUES ('401', '123', 'login', '1495596465');
INSERT INTO `log` VALUES ('402', '123', 'getEmployerList', '1495596471');
INSERT INTO `log` VALUES ('403', '123', 'updateEmployer', '1495596479');
INSERT INTO `log` VALUES ('404', '123', 'getEmployerList', '1495596479');
INSERT INTO `log` VALUES ('405', '123', 'updateEmployer', '1495596522');
INSERT INTO `log` VALUES ('406', '123', 'getEmployerList', '1495596523');
INSERT INTO `log` VALUES ('407', '18124606495', 'getUser', '1495596523');
INSERT INTO `log` VALUES ('408', '18124606495', 'getShareEmployerList', '1495596523');
INSERT INTO `log` VALUES ('409', '18124606495', 'getShareAuntList', '1495596523');
INSERT INTO `log` VALUES ('410', '18124606495', 'getUnShareAuntList', '1495596523');
INSERT INTO `log` VALUES ('411', '18124606495', 'getAllShareEmployerList', '1495596524');
INSERT INTO `log` VALUES ('412', '18124606495', 'getArticleList', '1495596524');
INSERT INTO `log` VALUES ('413', '18124606495', 'getBoardList', '1495596524');
INSERT INTO `log` VALUES ('414', '123', 'login', '1495596586');
INSERT INTO `log` VALUES ('415', '123', 'getEmployerList', '1495596591');
INSERT INTO `log` VALUES ('416', '123', 'updateEmployer', '1495596601');
INSERT INTO `log` VALUES ('417', '123', 'getEmployerList', '1495596601');
INSERT INTO `log` VALUES ('418', '18124606495', 'getUser', '1495596675');
INSERT INTO `log` VALUES ('419', '18124606495', 'getShareEmployerList', '1495596676');
INSERT INTO `log` VALUES ('420', '18124606495', 'getShareAuntList', '1495596676');
INSERT INTO `log` VALUES ('421', '18124606495', 'getUnShareAuntList', '1495596676');
INSERT INTO `log` VALUES ('422', '18124606495', 'getAllShareEmployerList', '1495596676');
INSERT INTO `log` VALUES ('423', '18124606495', 'getArticleList', '1495596676');
INSERT INTO `log` VALUES ('424', '18124606495', 'getBoardList', '1495596677');
INSERT INTO `log` VALUES ('425', '18124606495', 'login', '1495596687');
INSERT INTO `log` VALUES ('426', '18124606495', 'getUser', '1495596687');
INSERT INTO `log` VALUES ('427', '18124606495', 'getShareEmployerList', '1495596688');
INSERT INTO `log` VALUES ('428', '18124606495', 'getShareAuntList', '1495596688');
INSERT INTO `log` VALUES ('429', '18124606495', 'getUnShareAuntList', '1495596688');
INSERT INTO `log` VALUES ('430', '18124606495', 'getAllShareEmployerList', '1495596688');
INSERT INTO `log` VALUES ('431', '18124606495', 'getArticleList', '1495596688');
INSERT INTO `log` VALUES ('432', '18124606495', 'getBoardList', '1495596689');
INSERT INTO `log` VALUES ('433', '123', 'getSession', '1495596788');
INSERT INTO `log` VALUES ('434', '18124606495', 'getUser', '1495596704');
INSERT INTO `log` VALUES ('435', '18124606495', 'getShareEmployerList', '1495596704');
INSERT INTO `log` VALUES ('436', '18124606495', 'getShareAuntList', '1495596704');
INSERT INTO `log` VALUES ('437', '18124606495', 'getUnShareAuntList', '1495596705');
INSERT INTO `log` VALUES ('438', '18124606495', 'getAllShareEmployerList', '1495596705');
INSERT INTO `log` VALUES ('439', '18124606495', 'getArticleList', '1495596705');
INSERT INTO `log` VALUES ('440', '18124606495', 'getBoardList', '1495596705');
INSERT INTO `log` VALUES ('441', '123', 'login', '1495596749');
INSERT INTO `log` VALUES ('442', '123', 'getEmployerList', '1495596767');
INSERT INTO `log` VALUES ('443', '123', 'updateEmployer', '1495596776');
INSERT INTO `log` VALUES ('444', '123', 'getEmployerList', '1495596777');
INSERT INTO `log` VALUES ('445', '123', 'getEmployerList', '1495596810');
INSERT INTO `log` VALUES ('446', '123', 'updateEmployer', '1495596816');
INSERT INTO `log` VALUES ('447', '123', 'getEmployerList', '1495596817');
INSERT INTO `log` VALUES ('448', '123', 'getUser', '1495596940');
INSERT INTO `log` VALUES ('449', '123', 'getUser', '1495596942');
INSERT INTO `log` VALUES ('450', '123', 'getUser', '1495596944');
INSERT INTO `log` VALUES ('451', '123', 'getAllShareAuntList', '1495596983');
INSERT INTO `log` VALUES ('452', '123', 'getAllShareEmployerList', '1495596983');
INSERT INTO `log` VALUES ('453', '18124606495', 'getUser', '1495596934');
INSERT INTO `log` VALUES ('454', '18124606495', 'getShareEmployerList', '1495596934');
INSERT INTO `log` VALUES ('455', '18124606495', 'getShareAuntList', '1495596934');
INSERT INTO `log` VALUES ('456', '18124606495', 'getUnShareAuntList', '1495596935');
INSERT INTO `log` VALUES ('457', '18124606495', 'getAllShareEmployerList', '1495596935');
INSERT INTO `log` VALUES ('458', '18124606495', 'getArticleList', '1495596935');
INSERT INTO `log` VALUES ('459', '18124606495', 'getBoardList', '1495596935');
INSERT INTO `log` VALUES ('460', '123', 'updateEmployer', '1495596993');
INSERT INTO `log` VALUES ('461', '123', 'getEmployerList', '1495596993');
INSERT INTO `log` VALUES ('462', '123', 'getEmployerList', '1495597007');
INSERT INTO `log` VALUES ('463', '123', 'updateEmployer', '1495597030');
INSERT INTO `log` VALUES ('464', '123', 'getEmployerList', '1495597031');
INSERT INTO `log` VALUES ('465', '123', 'getAllShareAuntList', '1495597108');
INSERT INTO `log` VALUES ('466', '123', 'getAllShareEmployerList', '1495597109');
INSERT INTO `log` VALUES ('467', '123', 'getUser', '1495597110');
INSERT INTO `log` VALUES ('468', '18124606495', 'getEmployerList', '1495597022');
INSERT INTO `log` VALUES ('469', '18124606495', 'getAllShareEmployerList', '1495597024');
INSERT INTO `log` VALUES ('470', '18124606495', 'getArticleList', '1495597024');
INSERT INTO `log` VALUES ('471', '18124606495', 'getBoardList', '1495597024');
INSERT INTO `log` VALUES ('472', '123', 'updateEmployer', '1495597316');
INSERT INTO `log` VALUES ('473', '123', 'getEmployerList', '1495597317');
INSERT INTO `log` VALUES ('474', '123', 'updateEmployer', '1495597330');
INSERT INTO `log` VALUES ('475', '123', 'getEmployerList', '1495597332');
INSERT INTO `log` VALUES ('476', '123', 'login', '1495597426');
INSERT INTO `log` VALUES ('477', '123', 'getAllShareAuntList', '1495597429');
INSERT INTO `log` VALUES ('478', '123', 'getAllShareEmployerList', '1495597429');
INSERT INTO `log` VALUES ('479', '18124606495', 'getUser', '1495597353');
INSERT INTO `log` VALUES ('480', '18124606495', 'getShareEmployerList', '1495597353');
INSERT INTO `log` VALUES ('481', '18124606495', 'getShareAuntList', '1495597353');
INSERT INTO `log` VALUES ('482', '18124606495', 'getUnShareAuntList', '1495597354');
INSERT INTO `log` VALUES ('483', '18124606495', 'getAllShareEmployerList', '1495597354');
INSERT INTO `log` VALUES ('484', '18124606495', 'getArticleList', '1495597354');
INSERT INTO `log` VALUES ('485', '18124606495', 'getBoardList', '1495597354');
INSERT INTO `log` VALUES ('486', '123', 'login', '1495597390');
INSERT INTO `log` VALUES ('487', '123', 'login', '1495597393');
INSERT INTO `log` VALUES ('488', '123', 'getEmployerList', '1495597396');
INSERT INTO `log` VALUES ('489', '123', 'login', '1495597458');
INSERT INTO `log` VALUES ('490', '123', 'getUser', '1495597458');
INSERT INTO `log` VALUES ('491', '123', 'getShareEmployerList', '1495597458');
INSERT INTO `log` VALUES ('492', '123', 'getShareAuntList', '1495597458');
INSERT INTO `log` VALUES ('493', '123', 'getUnShareAuntList', '1495597459');
INSERT INTO `log` VALUES ('494', '18124606495', 'login', '1495597364');
INSERT INTO `log` VALUES ('495', '18124606495', 'getUser', '1495597364');
INSERT INTO `log` VALUES ('496', '123', 'getAllShareEmployerList', '1495597459');
INSERT INTO `log` VALUES ('497', '18124606495', 'getShareEmployerList', '1495597364');
INSERT INTO `log` VALUES ('498', '123', 'getArticleList', '1495597459');
INSERT INTO `log` VALUES ('499', '18124606495', 'getShareAuntList', '1495597364');
INSERT INTO `log` VALUES ('500', '123', 'getBoardList', '1495597459');
INSERT INTO `log` VALUES ('501', '18124606495', 'getUnShareAuntList', '1495597364');
INSERT INTO `log` VALUES ('502', '18124606495', 'getAllShareEmployerList', '1495597365');
INSERT INTO `log` VALUES ('503', '18124606495', 'getArticleList', '1495597365');
INSERT INTO `log` VALUES ('504', '18124606495', 'getBoardList', '1495597365');
INSERT INTO `log` VALUES ('505', '123', 'updateEmployer', '1495597402');
INSERT INTO `log` VALUES ('506', '123', 'getEmployerList', '1495597403');
INSERT INTO `log` VALUES ('507', '123', 'getAllShareEmployerList', '1495597471');
INSERT INTO `log` VALUES ('508', '123', 'getArticleList', '1495597471');
INSERT INTO `log` VALUES ('509', '123', 'getBoardList', '1495597472');
INSERT INTO `log` VALUES ('510', '123', 'getAuntList', '1495597473');
INSERT INTO `log` VALUES ('511', '123', 'getLanguageList', '1495597473');
INSERT INTO `log` VALUES ('512', '123', 'getCookingList', '1495597473');
INSERT INTO `log` VALUES ('513', '123', 'getSkillList', '1495597473');
INSERT INTO `log` VALUES ('514', '123', 'getApplianceList', '1495597473');
INSERT INTO `log` VALUES ('515', '123', 'getJobList', '1495597473');
INSERT INTO `log` VALUES ('516', '123', 'getCertificateList', '1495597473');
INSERT INTO `log` VALUES ('517', '123', 'getAuntList', '1495597478');
INSERT INTO `log` VALUES ('518', '123', 'getLanguageList', '1495597478');
INSERT INTO `log` VALUES ('519', '123', 'getCookingList', '1495597478');
INSERT INTO `log` VALUES ('520', '123', 'getSkillList', '1495597478');
INSERT INTO `log` VALUES ('521', '123', 'getApplianceList', '1495597478');
INSERT INTO `log` VALUES ('522', '123', 'getJobList', '1495597478');
INSERT INTO `log` VALUES ('523', '123', 'getCertificateList', '1495597478');
INSERT INTO `log` VALUES ('524', '123', 'getEmployerList', '1495597479');
INSERT INTO `log` VALUES ('525', '123', 'getAuntList', '1495597482');
INSERT INTO `log` VALUES ('526', '123', 'getLanguageList', '1495597482');
INSERT INTO `log` VALUES ('527', '123', 'getCookingList', '1495597482');
INSERT INTO `log` VALUES ('528', '123', 'getSkillList', '1495597482');
INSERT INTO `log` VALUES ('529', '123', 'getApplianceList', '1495597482');
INSERT INTO `log` VALUES ('530', '123', 'getJobList', '1495597482');
INSERT INTO `log` VALUES ('531', '123', 'getCertificateList', '1495597483');
INSERT INTO `log` VALUES ('532', '123', 'getAuntList', '1495597492');
INSERT INTO `log` VALUES ('533', '123', 'getAuntList', '1495597494');
INSERT INTO `log` VALUES ('534', '123', 'getAuntList', '1495597496');
INSERT INTO `log` VALUES ('535', '18124606495', 'getUser', '1495597406');
INSERT INTO `log` VALUES ('536', '18124606495', 'getShareEmployerList', '1495597406');
INSERT INTO `log` VALUES ('537', '18124606495', 'getShareAuntList', '1495597407');
INSERT INTO `log` VALUES ('538', '18124606495', 'getUnShareAuntList', '1495597407');
INSERT INTO `log` VALUES ('539', '18124606495', 'getAllShareEmployerList', '1495597407');
INSERT INTO `log` VALUES ('540', '18124606495', 'getArticleList', '1495597407');
INSERT INTO `log` VALUES ('541', '18124606495', 'getBoardList', '1495597407');
INSERT INTO `log` VALUES ('542', '123', 'getAuntList', '1495597510');
INSERT INTO `log` VALUES ('543', '123', 'getLanguageList', '1495597511');
INSERT INTO `log` VALUES ('544', '123', 'getCookingList', '1495597511');
INSERT INTO `log` VALUES ('545', '123', 'getSkillList', '1495597511');
INSERT INTO `log` VALUES ('546', '123', 'getApplianceList', '1495597511');
INSERT INTO `log` VALUES ('547', '123', 'getJobList', '1495597511');
INSERT INTO `log` VALUES ('548', '123', 'getCertificateList', '1495597511');
INSERT INTO `log` VALUES ('549', '18124606495', 'getUser', '1495597477');
INSERT INTO `log` VALUES ('550', '18124606495', 'getShareEmployerList', '1495597477');
INSERT INTO `log` VALUES ('551', '18124606495', 'getShareAuntList', '1495597477');
INSERT INTO `log` VALUES ('552', '18124606495', 'getUnShareAuntList', '1495597477');
INSERT INTO `log` VALUES ('553', '18124606495', 'getAllShareEmployerList', '1495597477');
INSERT INTO `log` VALUES ('554', '18124606495', 'getArticleList', '1495597478');
INSERT INTO `log` VALUES ('555', '18124606495', 'getBoardList', '1495597478');
INSERT INTO `log` VALUES ('556', '18124606495', 'getUser', '1495597509');
INSERT INTO `log` VALUES ('557', '18124606495', 'getShareEmployerList', '1495597509');
INSERT INTO `log` VALUES ('558', '18124606495', 'getShareAuntList', '1495597509');
INSERT INTO `log` VALUES ('559', '18124606495', 'getUnShareAuntList', '1495597509');
INSERT INTO `log` VALUES ('560', '18124606495', 'getAllShareEmployerList', '1495597509');
INSERT INTO `log` VALUES ('561', '18124606495', 'getArticleList', '1495597510');
INSERT INTO `log` VALUES ('562', '18124606495', 'getBoardList', '1495597510');
INSERT INTO `log` VALUES ('563', '18124606495', 'getUser', '1495597514');
INSERT INTO `log` VALUES ('564', '18124606495', 'getShareEmployerList', '1495597514');
INSERT INTO `log` VALUES ('565', '18124606495', 'getShareAuntList', '1495597515');
INSERT INTO `log` VALUES ('566', '18124606495', 'getUnShareAuntList', '1495597515');
INSERT INTO `log` VALUES ('567', '18124606495', 'getAllShareEmployerList', '1495597515');
INSERT INTO `log` VALUES ('568', '18124606495', 'getArticleList', '1495597515');
INSERT INTO `log` VALUES ('569', '18124606495', 'getBoardList', '1495597515');
INSERT INTO `log` VALUES ('570', '123', 'getUser', '1495597622');
INSERT INTO `log` VALUES ('571', '123', 'getShareEmployerList', '1495597622');
INSERT INTO `log` VALUES ('572', '123', 'getShareAuntList', '1495597622');
INSERT INTO `log` VALUES ('573', '123', 'getUnShareAuntList', '1495597622');
INSERT INTO `log` VALUES ('574', '123', 'getAllShareEmployerList', '1495597623');
INSERT INTO `log` VALUES ('575', '123', 'getArticleList', '1495597623');
INSERT INTO `log` VALUES ('576', '123', 'getBoardList', '1495597623');
INSERT INTO `log` VALUES ('577', '18124606495', 'getUser', '1495597530');
INSERT INTO `log` VALUES ('578', '18124606495', 'getShareEmployerList', '1495597531');
INSERT INTO `log` VALUES ('579', '18124606495', 'getShareAuntList', '1495597531');
INSERT INTO `log` VALUES ('580', '18124606495', 'getUnShareAuntList', '1495597531');
INSERT INTO `log` VALUES ('581', '18124606495', 'getAllShareEmployerList', '1495597531');
INSERT INTO `log` VALUES ('582', '18124606495', 'getArticleList', '1495597531');
INSERT INTO `log` VALUES ('583', '18124606495', 'getBoardList', '1495597532');
INSERT INTO `log` VALUES ('584', '123', 'getSearchShareAuntList', '1495597632');
INSERT INTO `log` VALUES ('585', '123', 'getSearchEmployerList', '1495597632');
INSERT INTO `log` VALUES ('586', '123', 'getSearchBoardList', '1495597632');
INSERT INTO `log` VALUES ('587', '123', 'getSearchShareAuntList', '1495597636');
INSERT INTO `log` VALUES ('588', '123', 'getSearchEmployerList', '1495597637');
INSERT INTO `log` VALUES ('589', '123', 'getSearchBoardList', '1495597637');
INSERT INTO `log` VALUES ('590', '123', 'getSearchShareAuntList', '1495597639');
INSERT INTO `log` VALUES ('591', '123', 'getSearchEmployerList', '1495597639');
INSERT INTO `log` VALUES ('592', '123', 'getSearchBoardList', '1495597639');
INSERT INTO `log` VALUES ('593', '123', 'getSearchShareAuntList', '1495597642');
INSERT INTO `log` VALUES ('594', '123', 'getSearchEmployerList', '1495597643');
INSERT INTO `log` VALUES ('595', '123', 'getSearchBoardList', '1495597643');
INSERT INTO `log` VALUES ('596', '123', 'getSearchShareAuntList', '1495597648');
INSERT INTO `log` VALUES ('597', '123', 'getSearchEmployerList', '1495597649');
INSERT INTO `log` VALUES ('598', '123', 'getSearchBoardList', '1495597649');
INSERT INTO `log` VALUES ('599', '123', 'getSearchShareAuntList', '1495597650');
INSERT INTO `log` VALUES ('600', '123', 'getSearchEmployerList', '1495597650');
INSERT INTO `log` VALUES ('601', '123', 'getSearchBoardList', '1495597651');
INSERT INTO `log` VALUES ('602', '123', 'getSearchShareAuntList', '1495597658');
INSERT INTO `log` VALUES ('603', '123', 'getSearchEmployerList', '1495597658');
INSERT INTO `log` VALUES ('604', '123', 'getSearchBoardList', '1495597658');
INSERT INTO `log` VALUES ('605', '18124606495', 'getUser', '1495597954');
INSERT INTO `log` VALUES ('606', '18124606495', 'getShareEmployerList', '1495597954');
INSERT INTO `log` VALUES ('607', '18124606495', 'getShareAuntList', '1495597954');
INSERT INTO `log` VALUES ('608', '18124606495', 'getUnShareAuntList', '1495597954');
INSERT INTO `log` VALUES ('609', '18124606495', 'getUser', '1495597982');
INSERT INTO `log` VALUES ('610', '18124606495', 'getShareEmployerList', '1495597982');
INSERT INTO `log` VALUES ('611', '18124606495', 'getShareAuntList', '1495597982');
INSERT INTO `log` VALUES ('612', '18124606495', 'getUnShareAuntList', '1495597982');
INSERT INTO `log` VALUES ('613', '18124606495', 'getAllShareEmployerList', '1495597983');
INSERT INTO `log` VALUES ('614', '18124606495', 'getArticleList', '1495597983');
INSERT INTO `log` VALUES ('615', '18124606495', 'getBoardList', '1495597983');
INSERT INTO `log` VALUES ('616', '18124606495', 'getUser', '1495598108');
INSERT INTO `log` VALUES ('617', '18124606495', 'getShareEmployerList', '1495598108');
INSERT INTO `log` VALUES ('618', '18124606495', 'getShareAuntList', '1495598108');
INSERT INTO `log` VALUES ('619', '18124606495', 'getUnShareAuntList', '1495598108');
INSERT INTO `log` VALUES ('620', '18124606495', 'getAllShareEmployerList', '1495598109');
INSERT INTO `log` VALUES ('621', '18124606495', 'getArticleList', '1495598109');
INSERT INTO `log` VALUES ('622', '18124606495', 'getBoardList', '1495598109');
INSERT INTO `log` VALUES ('623', '123', 'getSession', '1495598522');
INSERT INTO `log` VALUES ('624', '18124606495', 'getSession', '1495599008');
INSERT INTO `log` VALUES ('625', '18124606495', 'getSession', '1495599908');
INSERT INTO `log` VALUES ('626', '18124606495', 'getSession', '1495600808');
INSERT INTO `log` VALUES ('627', '18124606495', 'getSession', '1495601708');
INSERT INTO `log` VALUES ('628', '18124606495', 'getSession', '1495602608');
INSERT INTO `log` VALUES ('629', '18124606495', 'getSession', '1495603508');
INSERT INTO `log` VALUES ('630', '18124606495', 'getSession', '1495604408');
INSERT INTO `log` VALUES ('631', '18124606495', 'getUser', '1495604767');
INSERT INTO `log` VALUES ('632', '18124606495', 'getShareEmployerList', '1495604767');
INSERT INTO `log` VALUES ('633', '18124606495', 'getShareAuntList', '1495604767');
INSERT INTO `log` VALUES ('634', '18124606495', 'getUnShareAuntList', '1495604768');
INSERT INTO `log` VALUES ('635', '18124606495', 'getAllShareEmployerList', '1495604768');
INSERT INTO `log` VALUES ('636', '18124606495', 'getArticleList', '1495604768');
INSERT INTO `log` VALUES ('637', '18124606495', 'getBoardList', '1495604768');
INSERT INTO `log` VALUES ('638', '18124606495', 'getUser', '1495604965');
INSERT INTO `log` VALUES ('639', '18124606495', 'getShareEmployerList', '1495604966');
INSERT INTO `log` VALUES ('640', '18124606495', 'getShareAuntList', '1495604966');
INSERT INTO `log` VALUES ('641', '18124606495', 'getUnShareAuntList', '1495604966');
INSERT INTO `log` VALUES ('642', '18124606495', 'getUser', '1495604983');
INSERT INTO `log` VALUES ('643', '18124606495', 'getShareEmployerList', '1495604983');
INSERT INTO `log` VALUES ('644', '18124606495', 'getShareAuntList', '1495604984');
INSERT INTO `log` VALUES ('645', '18124606495', 'getUnShareAuntList', '1495604984');
INSERT INTO `log` VALUES ('646', '18124606495', 'getAllShareEmployerList', '1495604984');
INSERT INTO `log` VALUES ('647', '18124606495', 'getArticleList', '1495604984');
INSERT INTO `log` VALUES ('648', '18124606495', 'getBoardList', '1495604984');
INSERT INTO `log` VALUES ('649', '18124606495', 'getPactList', '1495605026');
INSERT INTO `log` VALUES ('650', '18124606495', 'getShareEmployerList', '1495605030');
INSERT INTO `log` VALUES ('651', '18124606495', 'getShareAuntList', '1495605031');
INSERT INTO `log` VALUES ('652', '18124606495', 'getUnShareAuntList', '1495605031');
INSERT INTO `log` VALUES ('653', '18124606495', 'deleteShareEmployer', '1495605036');
INSERT INTO `log` VALUES ('654', '18124606495', 'getShareEmployerList', '1495605039');
INSERT INTO `log` VALUES ('655', '18124606495', 'getShareAuntList', '1495605039');
INSERT INTO `log` VALUES ('656', '18124606495', 'getUnShareAuntList', '1495605039');
INSERT INTO `log` VALUES ('657', '18124606495', 'deleteShareEmployer', '1495605042');
INSERT INTO `log` VALUES ('658', '18124606495', 'getShareEmployerList', '1495605043');
INSERT INTO `log` VALUES ('659', '18124606495', 'getShareAuntList', '1495605043');
INSERT INTO `log` VALUES ('660', '18124606495', 'getUnShareAuntList', '1495605043');
INSERT INTO `log` VALUES ('661', '18124606495', 'addShareEmployer', '1495605148');
INSERT INTO `log` VALUES ('662', '18124606495', 'getShareEmployerList', '1495605150');
INSERT INTO `log` VALUES ('663', '18124606495', 'getShareAuntList', '1495605150');
INSERT INTO `log` VALUES ('664', '18124606495', 'getUnShareAuntList', '1495605150');
INSERT INTO `log` VALUES ('665', '18124606495', 'getAllShareEmployerList', '1495605157');
INSERT INTO `log` VALUES ('666', '18124606495', 'getArticleList', '1495605157');
INSERT INTO `log` VALUES ('667', '18124606495', 'getBoardList', '1495605157');
INSERT INTO `log` VALUES ('668', '18124606495', 'getUser', '1495605196');
INSERT INTO `log` VALUES ('669', '18124606495', 'getShareEmployerList', '1495605196');
INSERT INTO `log` VALUES ('670', '18124606495', 'getShareAuntList', '1495605196');
INSERT INTO `log` VALUES ('671', '18124606495', 'getUnShareAuntList', '1495605196');
INSERT INTO `log` VALUES ('672', '18124606495', 'getAllShareEmployerList', '1495605197');
INSERT INTO `log` VALUES ('673', '18124606495', 'getArticleList', '1495605197');
INSERT INTO `log` VALUES ('674', '18124606495', 'getBoardList', '1495605197');
INSERT INTO `log` VALUES ('675', '18124606495', 'getUser', '1495605463');
INSERT INTO `log` VALUES ('676', '18124606495', 'getShareEmployerList', '1495605463');
INSERT INTO `log` VALUES ('677', '18124606495', 'getShareAuntList', '1495605464');
INSERT INTO `log` VALUES ('678', '18124606495', 'getUnShareAuntList', '1495605464');
INSERT INTO `log` VALUES ('679', '18124606495', 'getAllShareEmployerList', '1495605464');
INSERT INTO `log` VALUES ('680', '18124606495', 'getArticleList', '1495605464');
INSERT INTO `log` VALUES ('681', '18124606495', 'getBoardList', '1495605464');
INSERT INTO `log` VALUES ('682', '18124606495', 'getUser', '1495605491');
INSERT INTO `log` VALUES ('683', '18124606495', 'getShareEmployerList', '1495605491');
INSERT INTO `log` VALUES ('684', '18124606495', 'getShareAuntList', '1495605491');
INSERT INTO `log` VALUES ('685', '18124606495', 'getUnShareAuntList', '1495605491');
INSERT INTO `log` VALUES ('686', '18124606495', 'getAllShareEmployerList', '1495605491');
INSERT INTO `log` VALUES ('687', '18124606495', 'getArticleList', '1495605492');
INSERT INTO `log` VALUES ('688', '18124606495', 'getBoardList', '1495605492');
INSERT INTO `log` VALUES ('689', '18124606495', 'getUser', '1495605510');
INSERT INTO `log` VALUES ('690', '18124606495', 'getShareEmployerList', '1495605510');
INSERT INTO `log` VALUES ('691', '18124606495', 'getShareAuntList', '1495605511');
INSERT INTO `log` VALUES ('692', '18124606495', 'getUnShareAuntList', '1495605511');
INSERT INTO `log` VALUES ('693', '18124606495', 'getAllShareEmployerList', '1495605511');
INSERT INTO `log` VALUES ('694', '18124606495', 'getArticleList', '1495605511');
INSERT INTO `log` VALUES ('695', '18124606495', 'getBoardList', '1495605511');
INSERT INTO `log` VALUES ('696', '18124606495', 'getUser', '1495605527');
INSERT INTO `log` VALUES ('697', '18124606495', 'getShareEmployerList', '1495605527');
INSERT INTO `log` VALUES ('698', '18124606495', 'getShareAuntList', '1495605527');
INSERT INTO `log` VALUES ('699', '18124606495', 'getUnShareAuntList', '1495605527');
INSERT INTO `log` VALUES ('700', '18124606495', 'getAllShareEmployerList', '1495605527');
INSERT INTO `log` VALUES ('701', '18124606495', 'getArticleList', '1495605528');
INSERT INTO `log` VALUES ('702', '18124606495', 'getBoardList', '1495605528');
INSERT INTO `log` VALUES ('703', '18124606495', 'login', '1495605537');
INSERT INTO `log` VALUES ('704', '18124606495', 'getUser', '1495605537');
INSERT INTO `log` VALUES ('705', '18124606495', 'getShareEmployerList', '1495605538');
INSERT INTO `log` VALUES ('706', '18124606495', 'getShareAuntList', '1495605538');
INSERT INTO `log` VALUES ('707', '18124606495', 'getUnShareAuntList', '1495605538');
INSERT INTO `log` VALUES ('708', '18124606495', 'getAllShareEmployerList', '1495605538');
INSERT INTO `log` VALUES ('709', '18124606495', 'getArticleList', '1495605538');
INSERT INTO `log` VALUES ('710', '18124606495', 'getBoardList', '1495605538');
INSERT INTO `log` VALUES ('711', '18124606495', 'getUser', '1495605622');
INSERT INTO `log` VALUES ('712', '18124606495', 'getShareEmployerList', '1495605622');
INSERT INTO `log` VALUES ('713', '18124606495', 'getShareAuntList', '1495605622');
INSERT INTO `log` VALUES ('714', '18124606495', 'getUnShareAuntList', '1495605622');
INSERT INTO `log` VALUES ('715', '18124606495', 'getAllShareEmployerList', '1495605622');
INSERT INTO `log` VALUES ('716', '18124606495', 'getArticleList', '1495605623');
INSERT INTO `log` VALUES ('717', '18124606495', 'getBoardList', '1495605623');
INSERT INTO `log` VALUES ('718', '18124606495', 'getUser', '1495605688');
INSERT INTO `log` VALUES ('719', '18124606495', 'getShareEmployerList', '1495605688');
INSERT INTO `log` VALUES ('720', '18124606495', 'getShareAuntList', '1495605688');
INSERT INTO `log` VALUES ('721', '18124606495', 'getUnShareAuntList', '1495605688');
INSERT INTO `log` VALUES ('722', '18124606495', 'getAllShareEmployerList', '1495605688');
INSERT INTO `log` VALUES ('723', '18124606495', 'getArticleList', '1495605689');
INSERT INTO `log` VALUES ('724', '18124606495', 'getBoardList', '1495605689');
INSERT INTO `log` VALUES ('725', '18124606495', 'getUser', '1495605700');
INSERT INTO `log` VALUES ('726', '18124606495', 'getShareEmployerList', '1495605700');
INSERT INTO `log` VALUES ('727', '18124606495', 'getShareAuntList', '1495605700');
INSERT INTO `log` VALUES ('728', '18124606495', 'getUnShareAuntList', '1495605701');
INSERT INTO `log` VALUES ('729', '18124606495', 'getAllShareEmployerList', '1495605701');
INSERT INTO `log` VALUES ('730', '18124606495', 'getArticleList', '1495605701');
INSERT INTO `log` VALUES ('731', '18124606495', 'getBoardList', '1495605701');
INSERT INTO `log` VALUES ('732', '18124606495', 'getUser', '1495605729');
INSERT INTO `log` VALUES ('733', '18124606495', 'getShareEmployerList', '1495605730');
INSERT INTO `log` VALUES ('734', '18124606495', 'getShareAuntList', '1495605730');
INSERT INTO `log` VALUES ('735', '18124606495', 'getUnShareAuntList', '1495605730');
INSERT INTO `log` VALUES ('736', '18124606495', 'getAllShareEmployerList', '1495605730');
INSERT INTO `log` VALUES ('737', '18124606495', 'getArticleList', '1495605731');
INSERT INTO `log` VALUES ('738', '18124606495', 'getBoardList', '1495605731');
INSERT INTO `log` VALUES ('739', '18124606495', 'getUser', '1495605748');
INSERT INTO `log` VALUES ('740', '18124606495', 'getShareEmployerList', '1495605748');
INSERT INTO `log` VALUES ('741', '18124606495', 'getShareAuntList', '1495605748');
INSERT INTO `log` VALUES ('742', '18124606495', 'getUnShareAuntList', '1495605748');
INSERT INTO `log` VALUES ('743', '18124606495', 'getAllShareEmployerList', '1495605749');
INSERT INTO `log` VALUES ('744', '18124606495', 'getArticleList', '1495605749');
INSERT INTO `log` VALUES ('745', '18124606495', 'getBoardList', '1495605749');
INSERT INTO `log` VALUES ('746', '18124606495', 'getUser', '1495605766');
INSERT INTO `log` VALUES ('747', '18124606495', 'getShareEmployerList', '1495605766');
INSERT INTO `log` VALUES ('748', '18124606495', 'getShareAuntList', '1495605766');
INSERT INTO `log` VALUES ('749', '18124606495', 'getUnShareAuntList', '1495605766');
INSERT INTO `log` VALUES ('750', '18124606495', 'getAllShareEmployerList', '1495605767');
INSERT INTO `log` VALUES ('751', '18124606495', 'getArticleList', '1495605767');
INSERT INTO `log` VALUES ('752', '18124606495', 'getBoardList', '1495605767');
INSERT INTO `log` VALUES ('753', '18124606495', 'getUser', '1495605888');
INSERT INTO `log` VALUES ('754', '18124606495', 'getShareEmployerList', '1495605888');
INSERT INTO `log` VALUES ('755', '18124606495', 'getShareAuntList', '1495605888');
INSERT INTO `log` VALUES ('756', '18124606495', 'getUnShareAuntList', '1495605888');
INSERT INTO `log` VALUES ('757', '18124606495', 'getAllShareEmployerList', '1495605888');
INSERT INTO `log` VALUES ('758', '18124606495', 'getArticleList', '1495605888');
INSERT INTO `log` VALUES ('759', '18124606495', 'getBoardList', '1495605889');
INSERT INTO `log` VALUES ('760', '18124606495', 'getUser', '1495605904');
INSERT INTO `log` VALUES ('761', '18124606495', 'getShareEmployerList', '1495605904');
INSERT INTO `log` VALUES ('762', '18124606495', 'getShareAuntList', '1495605904');
INSERT INTO `log` VALUES ('763', '18124606495', 'getUnShareAuntList', '1495605904');
INSERT INTO `log` VALUES ('764', '18124606495', 'getAllShareEmployerList', '1495605905');
INSERT INTO `log` VALUES ('765', '18124606495', 'getArticleList', '1495605905');
INSERT INTO `log` VALUES ('766', '18124606495', 'getBoardList', '1495605905');
INSERT INTO `log` VALUES ('767', '18124606495', 'getUser', '1495605992');
INSERT INTO `log` VALUES ('768', '18124606495', 'getShareEmployerList', '1495605992');
INSERT INTO `log` VALUES ('769', '18124606495', 'getShareAuntList', '1495605992');
INSERT INTO `log` VALUES ('770', '18124606495', 'getUnShareAuntList', '1495605993');
INSERT INTO `log` VALUES ('771', '18124606495', 'getAllShareEmployerList', '1495605993');
INSERT INTO `log` VALUES ('772', '18124606495', 'getArticleList', '1495605993');
INSERT INTO `log` VALUES ('773', '18124606495', 'getBoardList', '1495605993');
INSERT INTO `log` VALUES ('774', '18124606495', 'getUser', '1495605995');
INSERT INTO `log` VALUES ('775', '18124606495', 'getShareEmployerList', '1495605995');
INSERT INTO `log` VALUES ('776', '18124606495', 'getShareAuntList', '1495605996');
INSERT INTO `log` VALUES ('777', '18124606495', 'getUnShareAuntList', '1495605996');
INSERT INTO `log` VALUES ('778', '18124606495', 'getAllShareEmployerList', '1495605996');
INSERT INTO `log` VALUES ('779', '18124606495', 'getArticleList', '1495605996');
INSERT INTO `log` VALUES ('780', '18124606495', 'getBoardList', '1495605996');
INSERT INTO `log` VALUES ('781', '18124606495', 'login', '1495606018');
INSERT INTO `log` VALUES ('782', '18124606495', 'getUser', '1495606018');
INSERT INTO `log` VALUES ('783', '18124606495', 'getShareEmployerList', '1495606018');
INSERT INTO `log` VALUES ('784', '18124606495', 'getShareAuntList', '1495606018');
INSERT INTO `log` VALUES ('785', '18124606495', 'getUnShareAuntList', '1495606018');
INSERT INTO `log` VALUES ('786', '18124606495', 'getAllShareEmployerList', '1495606019');
INSERT INTO `log` VALUES ('787', '18124606495', 'getArticleList', '1495606019');
INSERT INTO `log` VALUES ('788', '18124606495', 'getBoardList', '1495606019');
INSERT INTO `log` VALUES ('789', '18124606495', 'getUser', '1495606048');
INSERT INTO `log` VALUES ('790', '18124606495', 'getShareEmployerList', '1495606048');
INSERT INTO `log` VALUES ('791', '18124606495', 'getShareAuntList', '1495606048');
INSERT INTO `log` VALUES ('792', '18124606495', 'getUnShareAuntList', '1495606048');
INSERT INTO `log` VALUES ('793', '18124606495', 'getAllShareEmployerList', '1495606048');
INSERT INTO `log` VALUES ('794', '18124606495', 'getArticleList', '1495606049');
INSERT INTO `log` VALUES ('795', '18124606495', 'getBoardList', '1495606049');
INSERT INTO `log` VALUES ('796', '18124606495', 'getSession', '1495606948');
INSERT INTO `log` VALUES ('797', '18124606495', 'login', '1495607528');
INSERT INTO `log` VALUES ('798', '18124606495', 'getUser', '1495607528');
INSERT INTO `log` VALUES ('799', '18124606495', 'getShareEmployerList', '1495607528');
INSERT INTO `log` VALUES ('800', '18124606495', 'getShareAuntList', '1495607528');
INSERT INTO `log` VALUES ('801', '18124606495', 'getUnShareAuntList', '1495607528');
INSERT INTO `log` VALUES ('802', '18124606495', 'getAllShareEmployerList', '1495607529');
INSERT INTO `log` VALUES ('803', '18124606495', 'getArticleList', '1495607529');
INSERT INTO `log` VALUES ('804', '18124606495', 'getBoardList', '1495607529');
INSERT INTO `log` VALUES ('805', '18124606495', 'login', '1495607548');
INSERT INTO `log` VALUES ('806', '18124606495', 'getUser', '1495607548');
INSERT INTO `log` VALUES ('807', '18124606495', 'getShareEmployerList', '1495607548');
INSERT INTO `log` VALUES ('808', '18124606495', 'getShareAuntList', '1495607548');
INSERT INTO `log` VALUES ('809', '18124606495', 'getUnShareAuntList', '1495607548');
INSERT INTO `log` VALUES ('810', '18124606495', 'getAllShareEmployerList', '1495607549');
INSERT INTO `log` VALUES ('811', '18124606495', 'getArticleList', '1495607549');
INSERT INTO `log` VALUES ('812', '18124606495', 'getBoardList', '1495607549');
INSERT INTO `log` VALUES ('813', '18124606495', 'login', '1495607554');
INSERT INTO `log` VALUES ('814', '18124606495', 'getUser', '1495607554');
INSERT INTO `log` VALUES ('815', '18124606495', 'getShareEmployerList', '1495607554');
INSERT INTO `log` VALUES ('816', '18124606495', 'getShareAuntList', '1495607555');
INSERT INTO `log` VALUES ('817', '18124606495', 'getUnShareAuntList', '1495607555');
INSERT INTO `log` VALUES ('818', '18124606495', 'getAllShareEmployerList', '1495607555');
INSERT INTO `log` VALUES ('819', '18124606495', 'getArticleList', '1495607555');
INSERT INTO `log` VALUES ('820', '18124606495', 'getBoardList', '1495607555');
INSERT INTO `log` VALUES ('821', '123', 'login', '1495607907');
INSERT INTO `log` VALUES ('822', '123', 'getUser', '1495607908');
INSERT INTO `log` VALUES ('823', '123', 'getShareEmployerList', '1495607908');
INSERT INTO `log` VALUES ('824', '123', 'getShareAuntList', '1495607908');
INSERT INTO `log` VALUES ('825', '123', 'getUnShareAuntList', '1495607908');
INSERT INTO `log` VALUES ('826', '123', 'getAllShareEmployerList', '1495607908');
INSERT INTO `log` VALUES ('827', '123', 'getArticleList', '1495607908');
INSERT INTO `log` VALUES ('828', '123', 'getBoardList', '1495607909');
INSERT INTO `log` VALUES ('829', '18124606495', 'getSession', '1495608454');
INSERT INTO `log` VALUES ('830', '18124606495', 'getSession', '1495609354');
INSERT INTO `log` VALUES ('831', '18124606495', 'getUser', '1495609519');
INSERT INTO `log` VALUES ('832', '18124606495', 'getShareEmployerList', '1495609519');
INSERT INTO `log` VALUES ('833', '18124606495', 'getShareAuntList', '1495609519');
INSERT INTO `log` VALUES ('834', '18124606495', 'getUnShareAuntList', '1495609519');
INSERT INTO `log` VALUES ('835', '18124606495', 'getAllShareEmployerList', '1495609519');
INSERT INTO `log` VALUES ('836', '18124606495', 'getArticleList', '1495609520');
INSERT INTO `log` VALUES ('837', '18124606495', 'getBoardList', '1495609520');
INSERT INTO `log` VALUES ('838', '18124606495', 'getUser', '1495609582');
INSERT INTO `log` VALUES ('839', '18124606495', 'getShareEmployerList', '1495609582');
INSERT INTO `log` VALUES ('840', '18124606495', 'getShareAuntList', '1495609582');
INSERT INTO `log` VALUES ('841', '18124606495', 'getUnShareAuntList', '1495609582');
INSERT INTO `log` VALUES ('842', '18124606495', 'getAllShareEmployerList', '1495609582');
INSERT INTO `log` VALUES ('843', '18124606495', 'getArticleList', '1495609583');
INSERT INTO `log` VALUES ('844', '18124606495', 'getBoardList', '1495609583');
INSERT INTO `log` VALUES ('845', '18124606495', 'login', '1495609617');
INSERT INTO `log` VALUES ('846', '18124606495', 'getUser', '1495609617');
INSERT INTO `log` VALUES ('847', '18124606495', 'getShareEmployerList', '1495609617');
INSERT INTO `log` VALUES ('848', '18124606495', 'getShareAuntList', '1495609617');
INSERT INTO `log` VALUES ('849', '18124606495', 'getUnShareAuntList', '1495609618');
INSERT INTO `log` VALUES ('850', '18124606495', 'getAllShareEmployerList', '1495609618');
INSERT INTO `log` VALUES ('851', '18124606495', 'getArticleList', '1495609618');
INSERT INTO `log` VALUES ('852', '18124606495', 'getBoardList', '1495609618');
INSERT INTO `log` VALUES ('853', '18124606495', 'getUser', '1495609717');
INSERT INTO `log` VALUES ('854', '18124606495', 'getShareEmployerList', '1495609717');
INSERT INTO `log` VALUES ('855', '18124606495', 'getShareAuntList', '1495609717');
INSERT INTO `log` VALUES ('856', '18124606495', 'getUnShareAuntList', '1495609718');
INSERT INTO `log` VALUES ('857', '18124606495', 'getAllShareEmployerList', '1495609718');
INSERT INTO `log` VALUES ('858', '18124606495', 'getArticleList', '1495609718');
INSERT INTO `log` VALUES ('859', '18124606495', 'getBoardList', '1495609718');
INSERT INTO `log` VALUES ('860', '18124606495', 'getUser', '1495609745');
INSERT INTO `log` VALUES ('861', '18124606495', 'getShareEmployerList', '1495609745');
INSERT INTO `log` VALUES ('862', '18124606495', 'getShareAuntList', '1495609746');
INSERT INTO `log` VALUES ('863', '18124606495', 'getUnShareAuntList', '1495609746');
INSERT INTO `log` VALUES ('864', '18124606495', 'getAllShareEmployerList', '1495609746');
INSERT INTO `log` VALUES ('865', '18124606495', 'getArticleList', '1495609746');
INSERT INTO `log` VALUES ('866', '18124606495', 'getBoardList', '1495609746');
INSERT INTO `log` VALUES ('867', '18124606495', 'getUser', '1495609761');
INSERT INTO `log` VALUES ('868', '18124606495', 'getShareEmployerList', '1495609761');
INSERT INTO `log` VALUES ('869', '18124606495', 'getShareAuntList', '1495609762');
INSERT INTO `log` VALUES ('870', '18124606495', 'getUnShareAuntList', '1495609762');
INSERT INTO `log` VALUES ('871', '18124606495', 'getAllShareEmployerList', '1495609762');
INSERT INTO `log` VALUES ('872', '18124606495', 'getArticleList', '1495609762');
INSERT INTO `log` VALUES ('873', '18124606495', 'getBoardList', '1495609762');
INSERT INTO `log` VALUES ('874', '18124606495', 'getUser', '1495609813');
INSERT INTO `log` VALUES ('875', '18124606495', 'getShareEmployerList', '1495609813');
INSERT INTO `log` VALUES ('876', '18124606495', 'getShareAuntList', '1495609813');
INSERT INTO `log` VALUES ('877', '18124606495', 'getUnShareAuntList', '1495609813');
INSERT INTO `log` VALUES ('878', '18124606495', 'getAllShareEmployerList', '1495609814');
INSERT INTO `log` VALUES ('879', '18124606495', 'getArticleList', '1495609814');
INSERT INTO `log` VALUES ('880', '18124606495', 'getBoardList', '1495609814');
INSERT INTO `log` VALUES ('881', '18124606495', 'getUser', '1495609891');
INSERT INTO `log` VALUES ('882', '18124606495', 'getShareEmployerList', '1495609892');
INSERT INTO `log` VALUES ('883', '18124606495', 'getShareAuntList', '1495609892');
INSERT INTO `log` VALUES ('884', '18124606495', 'getUnShareAuntList', '1495609892');
INSERT INTO `log` VALUES ('885', '18124606495', 'getAllShareEmployerList', '1495609892');
INSERT INTO `log` VALUES ('886', '18124606495', 'getArticleList', '1495609892');
INSERT INTO `log` VALUES ('887', '18124606495', 'getBoardList', '1495609892');
INSERT INTO `log` VALUES ('888', '18124606495', 'getUser', '1495610053');
INSERT INTO `log` VALUES ('889', '18124606495', 'getShareEmployerList', '1495610054');
INSERT INTO `log` VALUES ('890', '18124606495', 'getShareAuntList', '1495610054');
INSERT INTO `log` VALUES ('891', '18124606495', 'getUnShareAuntList', '1495610054');
INSERT INTO `log` VALUES ('892', '18124606495', 'getAllShareEmployerList', '1495610054');
INSERT INTO `log` VALUES ('893', '18124606495', 'getArticleList', '1495610054');
INSERT INTO `log` VALUES ('894', '18124606495', 'getBoardList', '1495610054');
INSERT INTO `log` VALUES ('895', '18124606495', 'getUser', '1495610115');
INSERT INTO `log` VALUES ('896', '18124606495', 'getShareEmployerList', '1495610115');
INSERT INTO `log` VALUES ('897', '18124606495', 'getShareAuntList', '1495610115');
INSERT INTO `log` VALUES ('898', '18124606495', 'getUnShareAuntList', '1495610116');
INSERT INTO `log` VALUES ('899', '18124606495', 'getAllShareEmployerList', '1495610116');
INSERT INTO `log` VALUES ('900', '18124606495', 'getArticleList', '1495610116');
INSERT INTO `log` VALUES ('901', '18124606495', 'getBoardList', '1495610116');
INSERT INTO `log` VALUES ('902', '18124606495', 'login', '1495610130');
INSERT INTO `log` VALUES ('903', '18124606495', 'getUser', '1495610130');
INSERT INTO `log` VALUES ('904', '18124606495', 'getShareEmployerList', '1495610130');
INSERT INTO `log` VALUES ('905', '18124606495', 'getShareAuntList', '1495610130');
INSERT INTO `log` VALUES ('906', '18124606495', 'getUnShareAuntList', '1495610131');
INSERT INTO `log` VALUES ('907', '18124606495', 'getAllShareEmployerList', '1495610131');
INSERT INTO `log` VALUES ('908', '18124606495', 'getArticleList', '1495610131');
INSERT INTO `log` VALUES ('909', '18124606495', 'getBoardList', '1495610131');
INSERT INTO `log` VALUES ('910', '18124606495', 'getUser', '1495610153');
INSERT INTO `log` VALUES ('911', '18124606495', 'getShareEmployerList', '1495610153');
INSERT INTO `log` VALUES ('912', '18124606495', 'getShareAuntList', '1495610153');
INSERT INTO `log` VALUES ('913', '18124606495', 'getUnShareAuntList', '1495610153');
INSERT INTO `log` VALUES ('914', '18124606495', 'getAllShareEmployerList', '1495610154');
INSERT INTO `log` VALUES ('915', '18124606495', 'getArticleList', '1495610154');
INSERT INTO `log` VALUES ('916', '18124606495', 'getBoardList', '1495610154');
INSERT INTO `log` VALUES ('917', '18124606495', 'getUser', '1495610163');
INSERT INTO `log` VALUES ('918', '18124606495', 'getShareEmployerList', '1495610163');
INSERT INTO `log` VALUES ('919', '18124606495', 'getShareAuntList', '1495610163');
INSERT INTO `log` VALUES ('920', '18124606495', 'getUnShareAuntList', '1495610163');
INSERT INTO `log` VALUES ('921', '18124606495', 'getAllShareEmployerList', '1495610163');
INSERT INTO `log` VALUES ('922', '18124606495', 'getArticleList', '1495610164');
INSERT INTO `log` VALUES ('923', '18124606495', 'getBoardList', '1495610164');
INSERT INTO `log` VALUES ('924', '18124606495', 'getUser', '1495610207');
INSERT INTO `log` VALUES ('925', '18124606495', 'getShareEmployerList', '1495610208');
INSERT INTO `log` VALUES ('926', '18124606495', 'getShareAuntList', '1495610208');
INSERT INTO `log` VALUES ('927', '18124606495', 'getUnShareAuntList', '1495610208');
INSERT INTO `log` VALUES ('928', '18124606495', 'getAllShareEmployerList', '1495610208');
INSERT INTO `log` VALUES ('929', '18124606495', 'getArticleList', '1495610208');
INSERT INTO `log` VALUES ('930', '18124606495', 'getBoardList', '1495610208');
INSERT INTO `log` VALUES ('931', '123', 'login', '1495611144');
INSERT INTO `log` VALUES ('932', '123', 'getUser', '1495611144');
INSERT INTO `log` VALUES ('933', '123', 'getShareEmployerList', '1495611144');
INSERT INTO `log` VALUES ('934', '123', 'getShareAuntList', '1495611145');
INSERT INTO `log` VALUES ('935', '123', 'getUnShareAuntList', '1495611145');
INSERT INTO `log` VALUES ('936', '123', 'getAllShareEmployerList', '1495611145');
INSERT INTO `log` VALUES ('937', '123', 'getArticleList', '1495611145');
INSERT INTO `log` VALUES ('938', '123', 'getBoardList', '1495611145');
INSERT INTO `log` VALUES ('939', '123', 'getShareEmployerList', '1495611150');
INSERT INTO `log` VALUES ('940', '123', 'getShareAuntList', '1495611151');
INSERT INTO `log` VALUES ('941', '123', 'getUnShareAuntList', '1495611151');
INSERT INTO `log` VALUES ('942', '123', 'getShareEmployerList', '1495611152');
INSERT INTO `log` VALUES ('943', '123', 'getShareAuntList', '1495611153');
INSERT INTO `log` VALUES ('944', '123', 'getUnShareAuntList', '1495611153');
INSERT INTO `log` VALUES ('945', '123', 'getEmployerList', '1495611161');
INSERT INTO `log` VALUES ('946', '123', 'getAllShareEmployerList', '1495611162');
INSERT INTO `log` VALUES ('947', '123', 'getArticleList', '1495611163');
INSERT INTO `log` VALUES ('948', '123', 'getBoardList', '1495611163');
INSERT INTO `log` VALUES ('949', '123', 'getAuntList', '1495611164');
INSERT INTO `log` VALUES ('950', '123', 'getLanguageList', '1495611164');
INSERT INTO `log` VALUES ('951', '123', 'getCookingList', '1495611164');
INSERT INTO `log` VALUES ('952', '123', 'getSkillList', '1495611164');
INSERT INTO `log` VALUES ('953', '123', 'getApplianceList', '1495611164');
INSERT INTO `log` VALUES ('954', '123', 'getJobList', '1495611165');
INSERT INTO `log` VALUES ('955', '123', 'getCertificateList', '1495611165');
INSERT INTO `log` VALUES ('956', '123', 'getEmployerList', '1495611165');
INSERT INTO `log` VALUES ('957', '123', 'getAllShareEmployerList', '1495611166');
INSERT INTO `log` VALUES ('958', '123', 'getArticleList', '1495611166');
INSERT INTO `log` VALUES ('959', '123', 'getBoardList', '1495611167');
INSERT INTO `log` VALUES ('960', '123', 'getEmployerList', '1495611168');
INSERT INTO `log` VALUES ('961', '123', 'getAuntList', '1495611170');
INSERT INTO `log` VALUES ('962', '123', 'getLanguageList', '1495611170');
INSERT INTO `log` VALUES ('963', '123', 'getCookingList', '1495611170');
INSERT INTO `log` VALUES ('964', '123', 'getSkillList', '1495611170');
INSERT INTO `log` VALUES ('965', '123', 'getApplianceList', '1495611170');
INSERT INTO `log` VALUES ('966', '123', 'getJobList', '1495611170');
INSERT INTO `log` VALUES ('967', '123', 'getCertificateList', '1495611170');
INSERT INTO `log` VALUES ('968', '18124606495', 'getSession', '1495611107');
INSERT INTO `log` VALUES ('969', '123', 'getEmployerList', '1495611262');
INSERT INTO `log` VALUES ('970', '123', 'login', '1495611437');
INSERT INTO `log` VALUES ('971', '123', 'getUser', '1495611437');
INSERT INTO `log` VALUES ('972', '123', 'getShareEmployerList', '1495611437');
INSERT INTO `log` VALUES ('973', '123', 'getShareAuntList', '1495611438');
INSERT INTO `log` VALUES ('974', '123', 'getUnShareAuntList', '1495611438');
INSERT INTO `log` VALUES ('975', '123', 'getAllShareEmployerList', '1495611438');
INSERT INTO `log` VALUES ('976', '123', 'getArticleList', '1495611438');
INSERT INTO `log` VALUES ('977', '123', 'getBoardList', '1495611438');
INSERT INTO `log` VALUES ('978', '123', 'login', '1495611604');
INSERT INTO `log` VALUES ('979', '123', 'getUser', '1495611604');
INSERT INTO `log` VALUES ('980', '123', 'getShareEmployerList', '1495611605');
INSERT INTO `log` VALUES ('981', '123', 'getShareAuntList', '1495611605');
INSERT INTO `log` VALUES ('982', '123', 'getUnShareAuntList', '1495611605');
INSERT INTO `log` VALUES ('983', '123', 'getAllShareEmployerList', '1495611605');
INSERT INTO `log` VALUES ('984', '123', 'getArticleList', '1495611605');
INSERT INTO `log` VALUES ('985', '123', 'getBoardList', '1495611606');
INSERT INTO `log` VALUES ('986', '123', 'login', '1495611631');
INSERT INTO `log` VALUES ('987', '123', 'getUser', '1495611632');
INSERT INTO `log` VALUES ('988', '123', 'getShareEmployerList', '1495611632');
INSERT INTO `log` VALUES ('989', '123', 'getShareAuntList', '1495611632');
INSERT INTO `log` VALUES ('990', '123', 'getUnShareAuntList', '1495611632');
INSERT INTO `log` VALUES ('991', '123', 'getAllShareEmployerList', '1495611632');
INSERT INTO `log` VALUES ('992', '123', 'getArticleList', '1495611632');
INSERT INTO `log` VALUES ('993', '123', 'getBoardList', '1495611632');
INSERT INTO `log` VALUES ('994', '123', 'logout', '1495611829');
INSERT INTO `log` VALUES ('995', '18124606495', 'getUser', '1495611753');
INSERT INTO `log` VALUES ('996', '18124606495', 'getShareEmployerList', '1495611753');
INSERT INTO `log` VALUES ('997', '18124606495', 'getShareAuntList', '1495611753');
INSERT INTO `log` VALUES ('998', '18124606495', 'getUnShareAuntList', '1495611753');
INSERT INTO `log` VALUES ('999', '18124606495', 'getAllShareEmployerList', '1495611754');
INSERT INTO `log` VALUES ('1000', '18124606495', 'getArticleList', '1495611754');
INSERT INTO `log` VALUES ('1001', '18124606495', 'getBoardList', '1495611754');
INSERT INTO `log` VALUES ('1002', '18124606495', 'logout', '1495611758');
INSERT INTO `log` VALUES ('1003', '18124606495', 'login', '1495611774');
INSERT INTO `log` VALUES ('1004', '18124606495', 'getUser', '1495611774');
INSERT INTO `log` VALUES ('1005', '18124606495', 'getShareEmployerList', '1495611774');
INSERT INTO `log` VALUES ('1006', '18124606495', 'getShareAuntList', '1495611774');
INSERT INTO `log` VALUES ('1007', '18124606495', 'getUnShareAuntList', '1495611774');
INSERT INTO `log` VALUES ('1008', '18124606495', 'getAllShareEmployerList', '1495611775');
INSERT INTO `log` VALUES ('1009', '18124606495', 'getArticleList', '1495611775');
INSERT INTO `log` VALUES ('1010', '18124606495', 'getBoardList', '1495611775');
INSERT INTO `log` VALUES ('1011', '18124606495', 'logout', '1495611780');
INSERT INTO `log` VALUES ('1012', '18124606495', 'login', '1495611917');
INSERT INTO `log` VALUES ('1013', '18124606495', 'getUser', '1495611917');
INSERT INTO `log` VALUES ('1014', '18124606495', 'getShareEmployerList', '1495611917');
INSERT INTO `log` VALUES ('1015', '18124606495', 'getShareAuntList', '1495611917');
INSERT INTO `log` VALUES ('1016', '18124606495', 'getUnShareAuntList', '1495611917');
INSERT INTO `log` VALUES ('1017', '18124606495', 'getAllShareEmployerList', '1495611918');
INSERT INTO `log` VALUES ('1018', '18124606495', 'getArticleList', '1495611918');
INSERT INTO `log` VALUES ('1019', '18124606495', 'getBoardList', '1495611918');
INSERT INTO `log` VALUES ('1020', '18124606495', 'getUser', '1495611923');
INSERT INTO `log` VALUES ('1021', '18124606495', 'getShareEmployerList', '1495611923');
INSERT INTO `log` VALUES ('1022', '18124606495', 'getShareAuntList', '1495611924');
INSERT INTO `log` VALUES ('1023', '18124606495', 'getUnShareAuntList', '1495611924');
INSERT INTO `log` VALUES ('1024', '18124606495', 'getAllShareEmployerList', '1495611924');
INSERT INTO `log` VALUES ('1025', '18124606495', 'getArticleList', '1495611924');
INSERT INTO `log` VALUES ('1026', '18124606495', 'getBoardList', '1495611924');
INSERT INTO `log` VALUES ('1027', '18124606495', 'logout', '1495611931');
INSERT INTO `log` VALUES ('1028', '18124606495', 'login', '1495611935');
INSERT INTO `log` VALUES ('1029', '18124606495', 'getUser', '1495611936');
INSERT INTO `log` VALUES ('1030', '18124606495', 'getShareEmployerList', '1495611936');
INSERT INTO `log` VALUES ('1031', '18124606495', 'getShareAuntList', '1495611936');
INSERT INTO `log` VALUES ('1032', '18124606495', 'getUnShareAuntList', '1495611936');
INSERT INTO `log` VALUES ('1033', '18124606495', 'getAllShareEmployerList', '1495611936');
INSERT INTO `log` VALUES ('1034', '18124606495', 'getArticleList', '1495611936');
INSERT INTO `log` VALUES ('1035', '18124606495', 'getBoardList', '1495611937');
INSERT INTO `log` VALUES ('1036', '123', 'login', '1495612344');
INSERT INTO `log` VALUES ('1037', '123', 'getUnShareAuntList', '1495612345');
INSERT INTO `log` VALUES ('1038', '18124606495', 'getSession', '1495612836');
INSERT INTO `log` VALUES ('1039', '123', 'login', '1495612956');
INSERT INTO `log` VALUES ('1040', '123', 'getUnShareAuntList', '1495612959');
INSERT INTO `log` VALUES ('1041', '18124606495', 'getUser', '1495613023');
INSERT INTO `log` VALUES ('1042', '18124606495', 'getShareEmployerList', '1495613024');
INSERT INTO `log` VALUES ('1043', '18124606495', 'getShareAuntList', '1495613024');
INSERT INTO `log` VALUES ('1044', '18124606495', 'getUnShareAuntList', '1495613024');
INSERT INTO `log` VALUES ('1045', '18124606495', 'getAllShareEmployerList', '1495613024');
INSERT INTO `log` VALUES ('1046', '18124606495', 'getArticleList', '1495613024');
INSERT INTO `log` VALUES ('1047', '18124606495', 'getBoardList', '1495613024');
INSERT INTO `log` VALUES ('1048', '18124606495', 'getUser', '1495613528');
INSERT INTO `log` VALUES ('1049', '18124606495', 'getShareEmployerList', '1495613529');
INSERT INTO `log` VALUES ('1050', '18124606495', 'getShareAuntList', '1495613529');
INSERT INTO `log` VALUES ('1051', '18124606495', 'getUnShareAuntList', '1495613529');
INSERT INTO `log` VALUES ('1052', '18124606495', 'getAllShareEmployerList', '1495613529');
INSERT INTO `log` VALUES ('1053', '18124606495', 'getArticleList', '1495613529');
INSERT INTO `log` VALUES ('1054', '18124606495', 'getBoardList', '1495613530');
INSERT INTO `log` VALUES ('1055', '18124606495', 'getUser', '1495613556');
INSERT INTO `log` VALUES ('1056', '18124606495', 'getShareEmployerList', '1495613556');
INSERT INTO `log` VALUES ('1057', '18124606495', 'getShareAuntList', '1495613556');
INSERT INTO `log` VALUES ('1058', '18124606495', 'getUnShareAuntList', '1495613556');
INSERT INTO `log` VALUES ('1059', '18124606495', 'getAllShareEmployerList', '1495613557');
INSERT INTO `log` VALUES ('1060', '18124606495', 'getArticleList', '1495613557');
INSERT INTO `log` VALUES ('1061', '18124606495', 'getBoardList', '1495613557');
INSERT INTO `log` VALUES ('1062', '18124606495', 'getUser', '1495613573');
INSERT INTO `log` VALUES ('1063', '18124606495', 'getShareEmployerList', '1495613573');
INSERT INTO `log` VALUES ('1064', '18124606495', 'getShareAuntList', '1495613574');
INSERT INTO `log` VALUES ('1065', '18124606495', 'getUnShareAuntList', '1495613574');
INSERT INTO `log` VALUES ('1066', '18124606495', 'getAllShareEmployerList', '1495613574');
INSERT INTO `log` VALUES ('1067', '18124606495', 'getArticleList', '1495613574');
INSERT INTO `log` VALUES ('1068', '18124606495', 'getBoardList', '1495613574');
INSERT INTO `log` VALUES ('1069', '18124606495', 'getUser', '1495613602');
INSERT INTO `log` VALUES ('1070', '18124606495', 'getShareEmployerList', '1495613602');
INSERT INTO `log` VALUES ('1071', '18124606495', 'getShareAuntList', '1495613602');
INSERT INTO `log` VALUES ('1072', '18124606495', 'getUnShareAuntList', '1495613602');
INSERT INTO `log` VALUES ('1073', '18124606495', 'getAllShareEmployerList', '1495613603');
INSERT INTO `log` VALUES ('1074', '18124606495', 'getArticleList', '1495613603');
INSERT INTO `log` VALUES ('1075', '18124606495', 'getBoardList', '1495613603');
INSERT INTO `log` VALUES ('1076', '18124606495', 'getUser', '1495613642');
INSERT INTO `log` VALUES ('1077', '18124606495', 'getShareEmployerList', '1495613642');
INSERT INTO `log` VALUES ('1078', '18124606495', 'getShareAuntList', '1495613642');
INSERT INTO `log` VALUES ('1079', '18124606495', 'getUnShareAuntList', '1495613642');
INSERT INTO `log` VALUES ('1080', '18124606495', 'getAllShareEmployerList', '1495613643');
INSERT INTO `log` VALUES ('1081', '18124606495', 'getArticleList', '1495613643');
INSERT INTO `log` VALUES ('1082', '18124606495', 'getBoardList', '1495613643');
INSERT INTO `log` VALUES ('1083', '18124606495', 'logout', '1495613655');
INSERT INTO `log` VALUES ('1084', '18124606495', 'login', '1495614176');
INSERT INTO `log` VALUES ('1085', '18124606495', 'login', '1495614187');
INSERT INTO `log` VALUES ('1086', '18124606495', 'login', '1495614199');
INSERT INTO `log` VALUES ('1087', '18124606495', 'login', '1495614216');
INSERT INTO `log` VALUES ('1088', '18124606495', 'login', '1495614469');
INSERT INTO `log` VALUES ('1089', '18124606495', 'getUnShareAuntList', '1495614516');
INSERT INTO `log` VALUES ('1090', '18124606495', 'getUnShareAuntList', '1495614639');
INSERT INTO `log` VALUES ('1091', '18124606495', 'addShareEmployer', '1495614668');
INSERT INTO `log` VALUES ('1092', '18124606495', 'getUnShareAuntList', '1495614671');
INSERT INTO `log` VALUES ('1093', '18124606495', 'getAuntList', '1495614893');
INSERT INTO `log` VALUES ('1094', '18124606495', 'getLanguageList', '1495614893');
INSERT INTO `log` VALUES ('1095', '18124606495', 'getCookingList', '1495614894');
INSERT INTO `log` VALUES ('1096', '18124606495', 'getSkillList', '1495614894');
INSERT INTO `log` VALUES ('1097', '18124606495', 'getApplianceList', '1495614894');
INSERT INTO `log` VALUES ('1098', '18124606495', 'getJobList', '1495614894');
INSERT INTO `log` VALUES ('1099', '18124606495', 'getCertificateList', '1495614894');
INSERT INTO `log` VALUES ('1100', '18124606495', 'getAuntList', '1495615088');
INSERT INTO `log` VALUES ('1101', '18124606495', 'getLanguageList', '1495615088');
INSERT INTO `log` VALUES ('1102', '18124606495', 'getCookingList', '1495615088');
INSERT INTO `log` VALUES ('1103', '18124606495', 'getSkillList', '1495615088');
INSERT INTO `log` VALUES ('1104', '18124606495', 'getApplianceList', '1495615088');
INSERT INTO `log` VALUES ('1105', '18124606495', 'getJobList', '1495615088');
INSERT INTO `log` VALUES ('1106', '18124606495', 'getCertificateList', '1495615088');
INSERT INTO `log` VALUES ('1107', '18124606495', 'getAuntList', '1495615093');
INSERT INTO `log` VALUES ('1108', '18124606495', 'getLanguageList', '1495615093');
INSERT INTO `log` VALUES ('1109', '18124606495', 'getCookingList', '1495615093');
INSERT INTO `log` VALUES ('1110', '18124606495', 'getSkillList', '1495615093');
INSERT INTO `log` VALUES ('1111', '18124606495', 'getApplianceList', '1495615093');
INSERT INTO `log` VALUES ('1112', '18124606495', 'getJobList', '1495615094');
INSERT INTO `log` VALUES ('1113', '18124606495', 'getCertificateList', '1495615094');
INSERT INTO `log` VALUES ('1114', '18124606495', 'getPactList', '1495615094');
INSERT INTO `log` VALUES ('1115', '18124606495', 'getUnShareAuntList', '1495615097');
INSERT INTO `log` VALUES ('1116', '18124606495', 'getEmployerList', '1495615407');
INSERT INTO `log` VALUES ('1117', '18124606495', 'getEmployerList', '1495615434');
INSERT INTO `log` VALUES ('1118', '18124606495', 'getAuntList', '1495615434');
INSERT INTO `log` VALUES ('1119', '18124606495', 'getLanguageList', '1495615435');
INSERT INTO `log` VALUES ('1120', '18124606495', 'getCookingList', '1495615435');
INSERT INTO `log` VALUES ('1121', '18124606495', 'getSkillList', '1495615435');
INSERT INTO `log` VALUES ('1122', '18124606495', 'getApplianceList', '1495615435');
INSERT INTO `log` VALUES ('1123', '18124606495', 'getJobList', '1495615435');
INSERT INTO `log` VALUES ('1124', '18124606495', 'getCertificateList', '1495615435');
INSERT INTO `log` VALUES ('1125', '18124606495', 'getEmployerList', '1495615435');
INSERT INTO `log` VALUES ('1126', '18124606495', 'getAuntList', '1495615440');
INSERT INTO `log` VALUES ('1127', '18124606495', 'getLanguageList', '1495615440');
INSERT INTO `log` VALUES ('1128', '18124606495', 'getCookingList', '1495615440');
INSERT INTO `log` VALUES ('1129', '18124606495', 'getSkillList', '1495615440');
INSERT INTO `log` VALUES ('1130', '18124606495', 'getApplianceList', '1495615440');
INSERT INTO `log` VALUES ('1131', '18124606495', 'getJobList', '1495615440');
INSERT INTO `log` VALUES ('1132', '18124606495', 'getCertificateList', '1495615441');
INSERT INTO `log` VALUES ('1133', '18124606495', 'getEmployerList', '1495615441');
INSERT INTO `log` VALUES ('1134', '18124606495', 'getEmployerList', '1495615551');
INSERT INTO `log` VALUES ('1135', '18124606495', 'getEmployerList', '1495615575');
INSERT INTO `log` VALUES ('1136', '18124606495', 'getAuntList', '1495615576');
INSERT INTO `log` VALUES ('1137', '18124606495', 'getLanguageList', '1495615576');
INSERT INTO `log` VALUES ('1138', '18124606495', 'getCookingList', '1495615576');
INSERT INTO `log` VALUES ('1139', '18124606495', 'getSkillList', '1495615576');
INSERT INTO `log` VALUES ('1140', '18124606495', 'getApplianceList', '1495615576');
INSERT INTO `log` VALUES ('1141', '18124606495', 'getJobList', '1495615576');
INSERT INTO `log` VALUES ('1142', '18124606495', 'getCertificateList', '1495615577');
INSERT INTO `log` VALUES ('1143', '18124606495', 'login', '1495615762');
INSERT INTO `log` VALUES ('1144', '18124606495', 'getEmployerList', '1495615765');
INSERT INTO `log` VALUES ('1145', '18124606495', 'getAuntList', '1495615766');
INSERT INTO `log` VALUES ('1146', '18124606495', 'getLanguageList', '1495615766');
INSERT INTO `log` VALUES ('1147', '18124606495', 'getCookingList', '1495615766');
INSERT INTO `log` VALUES ('1148', '18124606495', 'getSkillList', '1495615766');
INSERT INTO `log` VALUES ('1149', '18124606495', 'getApplianceList', '1495615766');
INSERT INTO `log` VALUES ('1150', '18124606495', 'getJobList', '1495615766');
INSERT INTO `log` VALUES ('1151', '18124606495', 'getCertificateList', '1495615766');
INSERT INTO `log` VALUES ('1152', '18124606495', 'getEmployerList', '1495615979');
INSERT INTO `log` VALUES ('1153', '18124606495', 'getAuntList', '1495615981');
INSERT INTO `log` VALUES ('1154', '18124606495', 'getLanguageList', '1495615981');
INSERT INTO `log` VALUES ('1155', '18124606495', 'getCookingList', '1495615981');
INSERT INTO `log` VALUES ('1156', '18124606495', 'getSkillList', '1495615981');
INSERT INTO `log` VALUES ('1157', '18124606495', 'getApplianceList', '1495615981');
INSERT INTO `log` VALUES ('1158', '18124606495', 'getJobList', '1495615981');
INSERT INTO `log` VALUES ('1159', '18124606495', 'getCertificateList', '1495615981');
INSERT INTO `log` VALUES ('1160', '18124606495', 'getPactList', '1495615984');
INSERT INTO `log` VALUES ('1161', '18124606495', 'getEmployerList', '1495616037');
INSERT INTO `log` VALUES ('1162', '18124606495', 'getAuntList', '1495616039');
INSERT INTO `log` VALUES ('1163', '18124606495', 'getLanguageList', '1495616039');
INSERT INTO `log` VALUES ('1164', '18124606495', 'getCookingList', '1495616039');
INSERT INTO `log` VALUES ('1165', '18124606495', 'getSkillList', '1495616039');
INSERT INTO `log` VALUES ('1166', '18124606495', 'getApplianceList', '1495616039');
INSERT INTO `log` VALUES ('1167', '18124606495', 'getJobList', '1495616039');
INSERT INTO `log` VALUES ('1168', '18124606495', 'getCertificateList', '1495616040');
INSERT INTO `log` VALUES ('1169', '18124606495', 'getPactList', '1495616041');
INSERT INTO `log` VALUES ('1170', '18124606495', 'getEmployerList', '1495616092');
INSERT INTO `log` VALUES ('1171', '18124606495', 'getAuntList', '1495616092');
INSERT INTO `log` VALUES ('1172', '18124606495', 'getLanguageList', '1495616092');
INSERT INTO `log` VALUES ('1173', '18124606495', 'getCookingList', '1495616092');
INSERT INTO `log` VALUES ('1174', '18124606495', 'getSkillList', '1495616093');
INSERT INTO `log` VALUES ('1175', '18124606495', 'getApplianceList', '1495616093');
INSERT INTO `log` VALUES ('1176', '18124606495', 'getJobList', '1495616093');
INSERT INTO `log` VALUES ('1177', '18124606495', 'getCertificateList', '1495616093');
INSERT INTO `log` VALUES ('1178', '18124606495', 'getPactList', '1495616096');
INSERT INTO `log` VALUES ('1179', '18124606495', 'getSession', '1495616935');
INSERT INTO `log` VALUES ('1180', '18124606495', 'getEmployerList', '1495616961');
INSERT INTO `log` VALUES ('1181', '18124606495', 'getAuntList', '1495616963');
INSERT INTO `log` VALUES ('1182', '18124606495', 'getLanguageList', '1495616963');
INSERT INTO `log` VALUES ('1183', '18124606495', 'getCookingList', '1495616963');
INSERT INTO `log` VALUES ('1184', '18124606495', 'getSkillList', '1495616963');
INSERT INTO `log` VALUES ('1185', '18124606495', 'getApplianceList', '1495616963');
INSERT INTO `log` VALUES ('1186', '18124606495', 'getJobList', '1495616963');
INSERT INTO `log` VALUES ('1187', '18124606495', 'getCertificateList', '1495616963');
INSERT INTO `log` VALUES ('1188', '18124606495', 'getPactList', '1495617015');
INSERT INTO `log` VALUES ('1189', '123', 'login', '1495618185');
INSERT INTO `log` VALUES ('1190', '123', 'getUnAckUserList', '1495618190');
INSERT INTO `log` VALUES ('1191', '123', 'getValidateCode', '1495618287');
INSERT INTO `log` VALUES ('1192', '13066803937', 'register', '1495618307');
INSERT INTO `log` VALUES ('1193', '123', 'getValidateCode', '1495618418');
INSERT INTO `log` VALUES ('1194', '13148700419', 'register', '1495618429');
INSERT INTO `log` VALUES ('1195', '13148700419', 'getSession', '1495618429');
INSERT INTO `log` VALUES ('1196', '13148700419', 'checkUserDetail', '1495618430');
INSERT INTO `log` VALUES ('1197', '13148700419', 'addUserDetail', '1495618490');
INSERT INTO `log` VALUES ('1198', '13148700419', 'checkUserDetail', '1495618650');
INSERT INTO `log` VALUES ('1199', '13148700419', 'login', '1495618696');
INSERT INTO `log` VALUES ('1200', '13148700419', 'checkUserDetail', '1495618698');
INSERT INTO `log` VALUES ('1201', '13148700419', 'checkUserDetail', '1495618749');
INSERT INTO `log` VALUES ('1202', '13148700419', 'checkUserDetail', '1495618792');
INSERT INTO `log` VALUES ('1203', '13148700419', 'login', '1495618902');
INSERT INTO `log` VALUES ('1204', '13148700419', 'checkUserDetail', '1495618909');
INSERT INTO `log` VALUES ('1205', '13148700419', 'checkUserDetail', '1495618850');
INSERT INTO `log` VALUES ('1206', '13148700419', 'checkUserDetail', '1495618921');
INSERT INTO `log` VALUES ('1207', '13148700419', 'checkUserDetail', '1495618963');
INSERT INTO `log` VALUES ('1208', '13148700419', 'checkUserDetail', '1495618973');
INSERT INTO `log` VALUES ('1209', '13148700419', 'addUserDetail', '1495618992');
INSERT INTO `log` VALUES ('1210', '13148700419', 'addUserDetail', '1495619000');
INSERT INTO `log` VALUES ('1211', '13148700419', 'checkUserDetail', '1495619001');
INSERT INTO `log` VALUES ('1212', '13148700419', 'getUserCheckById', '1495619001');
INSERT INTO `log` VALUES ('1213', '13148700419', 'updateUserDetail', '1495619054');
INSERT INTO `log` VALUES ('1214', '13148700419', 'checkUserDetail', '1495619058');
INSERT INTO `log` VALUES ('1215', '13148700419', 'getUserCheckById', '1495619058');
INSERT INTO `log` VALUES ('1216', '13148700419', 'checkUserDetail', '1495619164');
INSERT INTO `log` VALUES ('1217', '13148700419', 'getUserCheckById', '1495619164');
INSERT INTO `log` VALUES ('1218', '13148700419', 'updateUserDetail', '1495619180');
INSERT INTO `log` VALUES ('1219', '13148700419', 'checkUserDetail', '1495619181');
INSERT INTO `log` VALUES ('1220', '13148700419', 'getUserCheckById', '1495619181');
INSERT INTO `log` VALUES ('1221', '13148700419', 'checkUserDetail', '1495619216');
INSERT INTO `log` VALUES ('1222', '13148700419', 'getUserCheckById', '1495619219');
INSERT INTO `log` VALUES ('1223', '13148700419', 'updateUserDetail', '1495619239');
INSERT INTO `log` VALUES ('1224', '13148700419', 'checkUserDetail', '1495619239');
INSERT INTO `log` VALUES ('1225', '13148700419', 'getUserCheckById', '1495619239');
INSERT INTO `log` VALUES ('1226', '13148700419', 'checkUserDetail', '1495619282');
INSERT INTO `log` VALUES ('1227', '13148700419', 'getUserCheckById', '1495619282');
INSERT INTO `log` VALUES ('1228', '13148700419', 'checkUserDetail', '1495619293');
INSERT INTO `log` VALUES ('1229', '13148700419', 'getUserCheckById', '1495619293');
INSERT INTO `log` VALUES ('1230', '13148700419', 'checkUserDetail', '1495619296');
INSERT INTO `log` VALUES ('1231', '13148700419', 'getUserCheckById', '1495619296');
INSERT INTO `log` VALUES ('1232', '13148700419', 'checkUserDetail', '1495619298');
INSERT INTO `log` VALUES ('1233', '13148700419', 'getUserCheckById', '1495619298');
INSERT INTO `log` VALUES ('1234', '13148700419', 'checkUserDetail', '1495619298');
INSERT INTO `log` VALUES ('1235', '13148700419', 'getUserCheckById', '1495619299');
INSERT INTO `log` VALUES ('1236', '13148700419', 'checkUserDetail', '1495619299');
INSERT INTO `log` VALUES ('1237', '13148700419', 'getUserCheckById', '1495619299');
INSERT INTO `log` VALUES ('1238', '13148700419', 'checkUserDetail', '1495619299');
INSERT INTO `log` VALUES ('1239', '13148700419', 'getUserCheckById', '1495619300');
INSERT INTO `log` VALUES ('1240', '13148700419', 'login', '1495619325');
INSERT INTO `log` VALUES ('1241', '13148700419', 'checkUserDetail', '1495619326');
INSERT INTO `log` VALUES ('1242', '13148700419', 'getUserCheckById', '1495619327');
INSERT INTO `log` VALUES ('1243', '123', 'login', '1495619352');
INSERT INTO `log` VALUES ('1244', '123', 'getUnAckUserList', '1495619362');
INSERT INTO `log` VALUES ('1245', '123', 'getUnAckUserList', '1495619382');
INSERT INTO `log` VALUES ('1246', '123', 'getEmployerList', '1495619496');
INSERT INTO `log` VALUES ('1247', '123', 'getUnAckUserList', '1495619499');
INSERT INTO `log` VALUES ('1248', '13148700419', 'checkUserDetail', '1495619744');
INSERT INTO `log` VALUES ('1249', '13148700419', 'getUserCheckById', '1495619744');
INSERT INTO `log` VALUES ('1250', '18124606495', 'login', '1495620826');
INSERT INTO `log` VALUES ('1251', '18124606495', 'login', '1495621145');
INSERT INTO `log` VALUES ('1252', '123', 'login', '1495622996');
INSERT INTO `log` VALUES ('1253', '18124606495', 'getEmployerList', '1495625405');
INSERT INTO `log` VALUES ('1254', '123', 'login', '1495673621');
INSERT INTO `log` VALUES ('1255', '123', 'getUnAckUserList', '1495673625');
INSERT INTO `log` VALUES ('1256', '123', 'login', '1495676308');
INSERT INTO `log` VALUES ('1257', '123', 'getAllShareAuntList', '1495676315');
INSERT INTO `log` VALUES ('1258', '123', 'getAllShareEmployerList', '1495676315');
INSERT INTO `log` VALUES ('1259', '18124606495', 'login', '1495676296');
INSERT INTO `log` VALUES ('1260', '123', 'getEmployerCountByIdStatus', '1495676332');
INSERT INTO `log` VALUES ('1261', '123', 'getEmployerCountByIdStatus', '1495676353');
INSERT INTO `log` VALUES ('1262', '123', 'getEmployerCountByIdStatus', '1495676354');
INSERT INTO `log` VALUES ('1263', '123', 'getEmployerCountByIdStatus', '1495676355');
INSERT INTO `log` VALUES ('1264', '123', 'login', '1495676389');
INSERT INTO `log` VALUES ('1265', '123', 'getAllShareAuntList', '1495676396');
INSERT INTO `log` VALUES ('1266', '123', 'getAllShareEmployerList', '1495676396');
INSERT INTO `log` VALUES ('1267', '123', 'getEmployerCountByIdStatus', '1495676406');
INSERT INTO `log` VALUES ('1268', '18124606495', 'getEmployerList', '1495676373');
INSERT INTO `log` VALUES ('1269', '18124606495', 'getEmployerList', '1495676410');
INSERT INTO `log` VALUES ('1270', '18124606495', 'getAuntList', '1495676412');
INSERT INTO `log` VALUES ('1271', '18124606495', 'getLanguageList', '1495676413');
INSERT INTO `log` VALUES ('1272', '18124606495', 'getCookingList', '1495676413');
INSERT INTO `log` VALUES ('1273', '18124606495', 'getSkillList', '1495676413');
INSERT INTO `log` VALUES ('1274', '18124606495', 'getApplianceList', '1495676413');
INSERT INTO `log` VALUES ('1275', '18124606495', 'getJobList', '1495676413');
INSERT INTO `log` VALUES ('1276', '18124606495', 'getCertificateList', '1495676413');
INSERT INTO `log` VALUES ('1277', '18124606495', 'getEmployerList', '1495676415');
INSERT INTO `log` VALUES ('1278', '18124606495', 'getEmployerList', '1495676416');
INSERT INTO `log` VALUES ('1279', '18124606495', 'getAuntList', '1495676417');
INSERT INTO `log` VALUES ('1280', '18124606495', 'getLanguageList', '1495676417');
INSERT INTO `log` VALUES ('1281', '18124606495', 'getCookingList', '1495676417');
INSERT INTO `log` VALUES ('1282', '18124606495', 'getSkillList', '1495676417');
INSERT INTO `log` VALUES ('1283', '18124606495', 'getApplianceList', '1495676418');
INSERT INTO `log` VALUES ('1284', '18124606495', 'getJobList', '1495676418');
INSERT INTO `log` VALUES ('1285', '18124606495', 'getCertificateList', '1495676418');
INSERT INTO `log` VALUES ('1286', '18124606495', 'getEmployerList', '1495676418');
INSERT INTO `log` VALUES ('1287', '18124606495', 'getPactList', '1495676421');
INSERT INTO `log` VALUES ('1288', '18124606495', 'getEmployerList', '1495676456');
INSERT INTO `log` VALUES ('1289', '18124606495', 'getAuntList', '1495676457');
INSERT INTO `log` VALUES ('1290', '18124606495', 'getLanguageList', '1495676457');
INSERT INTO `log` VALUES ('1291', '18124606495', 'getCookingList', '1495676457');
INSERT INTO `log` VALUES ('1292', '18124606495', 'getSkillList', '1495676458');
INSERT INTO `log` VALUES ('1293', '18124606495', 'getApplianceList', '1495676458');
INSERT INTO `log` VALUES ('1294', '18124606495', 'getJobList', '1495676458');
INSERT INTO `log` VALUES ('1295', '18124606495', 'getCertificateList', '1495676458');
INSERT INTO `log` VALUES ('1296', '18124606495', 'login', '1495677007');
INSERT INTO `log` VALUES ('1297', '18124606495', 'getEmployerList', '1495677013');
INSERT INTO `log` VALUES ('1298', '18124606495', 'getEmployerList', '1495677043');
INSERT INTO `log` VALUES ('1299', '18124606495', 'getEmployerList', '1495677094');
INSERT INTO `log` VALUES ('1300', '18124606495', 'getEmployerList', '1495677101');
INSERT INTO `log` VALUES ('1301', '18124606495', 'getAuntList', '1495677103');
INSERT INTO `log` VALUES ('1302', '18124606495', 'getLanguageList', '1495677103');
INSERT INTO `log` VALUES ('1303', '18124606495', 'getCookingList', '1495677104');
INSERT INTO `log` VALUES ('1304', '18124606495', 'getSkillList', '1495677104');
INSERT INTO `log` VALUES ('1305', '18124606495', 'getApplianceList', '1495677104');
INSERT INTO `log` VALUES ('1306', '18124606495', 'getJobList', '1495677104');
INSERT INTO `log` VALUES ('1307', '18124606495', 'getCertificateList', '1495677104');
INSERT INTO `log` VALUES ('1308', '18124606495', 'getEmployerList', '1495677108');
INSERT INTO `log` VALUES ('1309', '18124606495', 'getAuntList', '1495677108');
INSERT INTO `log` VALUES ('1310', '18124606495', 'getLanguageList', '1495677109');
INSERT INTO `log` VALUES ('1311', '18124606495', 'getCookingList', '1495677109');
INSERT INTO `log` VALUES ('1312', '18124606495', 'getSkillList', '1495677109');
INSERT INTO `log` VALUES ('1313', '18124606495', 'getApplianceList', '1495677109');
INSERT INTO `log` VALUES ('1314', '18124606495', 'getJobList', '1495677109');
INSERT INTO `log` VALUES ('1315', '18124606495', 'getCertificateList', '1495677109');
INSERT INTO `log` VALUES ('1316', '18124606495', 'login', '1495677219');
INSERT INTO `log` VALUES ('1317', '123', 'getEmployerCountByIdStatus', '1495677375');
INSERT INTO `log` VALUES ('1318', '123', 'getEmployerCountByIdStatus', '1495677378');
INSERT INTO `log` VALUES ('1319', '18124606495', 'getUnAckUserList', '1495677367');
INSERT INTO `log` VALUES ('1320', '123', 'getEmployerCountByIdStatus', '1495677404');
INSERT INTO `log` VALUES ('1321', '18124606495', 'getUnAckUserList', '1495677429');
INSERT INTO `log` VALUES ('1322', '18124606495', 'login', '1495677511');
INSERT INTO `log` VALUES ('1323', '18124606495', 'getUnAckUserList', '1495677514');
INSERT INTO `log` VALUES ('1324', '18124606495', 'getUnAckUserList', '1495677822');
INSERT INTO `log` VALUES ('1325', '18124606495', 'getUnAckUserList', '1495677861');
INSERT INTO `log` VALUES ('1326', '18124606495', 'getUnAckUserList', '1495677874');
INSERT INTO `log` VALUES ('1327', '18124606495', 'getUnAckUserList', '1495678092');
INSERT INTO `log` VALUES ('1328', '18124606495', 'getUnAckUserList', '1495678256');
INSERT INTO `log` VALUES ('1329', '18124606495', 'getUnAckUserList', '1495678336');
INSERT INTO `log` VALUES ('1330', '18124606495', 'getUnAckUserList', '1495678476');
INSERT INTO `log` VALUES ('1331', '18124606495', 'getUnAckUserList', '1495678539');
INSERT INTO `log` VALUES ('1332', '18124606495', 'getUnAckUserList', '1495678566');
INSERT INTO `log` VALUES ('1333', '18124606495', 'getUnAckUserList', '1495678588');
INSERT INTO `log` VALUES ('1334', '18124606495', 'getUnAckUserList', '1495678617');
INSERT INTO `log` VALUES ('1335', '18124606495', 'getUnAckUserList', '1495678643');
INSERT INTO `log` VALUES ('1336', '18124606495', 'getUnAckUserList', '1495678684');
INSERT INTO `log` VALUES ('1337', '18124606495', 'getUnAckUserList', '1495679611');
INSERT INTO `log` VALUES ('1338', '18124606495', 'login', '1495680654');
INSERT INTO `log` VALUES ('1339', '18124606495', 'getUnAckUserList', '1495680657');
INSERT INTO `log` VALUES ('1340', '18124606495', 'getUnAckUserList', '1495680741');
INSERT INTO `log` VALUES ('1341', '18124606495', 'getEmployerList', '1495680767');
INSERT INTO `log` VALUES ('1342', '18124606495', 'getAuntList', '1495680768');
INSERT INTO `log` VALUES ('1343', '18124606495', 'getLanguageList', '1495680768');
INSERT INTO `log` VALUES ('1344', '18124606495', 'getCookingList', '1495680768');
INSERT INTO `log` VALUES ('1345', '18124606495', 'getSkillList', '1495680768');
INSERT INTO `log` VALUES ('1346', '18124606495', 'getApplianceList', '1495680769');
INSERT INTO `log` VALUES ('1347', '18124606495', 'getJobList', '1495680769');
INSERT INTO `log` VALUES ('1348', '18124606495', 'getCertificateList', '1495680769');
INSERT INTO `log` VALUES ('1349', '18124606495', 'getUnAckUserList', '1495681373');
INSERT INTO `log` VALUES ('1350', '18124606495', 'getUnAckUserList', '1495681459');
INSERT INTO `log` VALUES ('1351', '18124606495', 'getUnAckUserList', '1495681515');
INSERT INTO `log` VALUES ('1352', '18124606495', 'getUnAckUserList', '1495681529');
INSERT INTO `log` VALUES ('1353', '18124606495', 'getUnAckUserList', '1495681576');
INSERT INTO `log` VALUES ('1354', '18124606495', 'getUnAckUserList', '1495681589');
INSERT INTO `log` VALUES ('1355', '18124606495', 'getPactList', '1495681724');
INSERT INTO `log` VALUES ('1356', '18124606495', 'getPactList', '1495681729');
INSERT INTO `log` VALUES ('1357', '18124606495', 'getAuntList', '1495681736');
INSERT INTO `log` VALUES ('1358', '18124606495', 'getLanguageList', '1495681737');
INSERT INTO `log` VALUES ('1359', '18124606495', 'getCookingList', '1495681737');
INSERT INTO `log` VALUES ('1360', '18124606495', 'getSkillList', '1495681737');
INSERT INTO `log` VALUES ('1361', '18124606495', 'getApplianceList', '1495681737');
INSERT INTO `log` VALUES ('1362', '18124606495', 'getJobList', '1495681737');
INSERT INTO `log` VALUES ('1363', '18124606495', 'getCertificateList', '1495681737');
INSERT INTO `log` VALUES ('1364', '18124606495', 'getEmployerList', '1495681737');
INSERT INTO `log` VALUES ('1365', '18124606495', 'getAuntList', '1495681757');
INSERT INTO `log` VALUES ('1366', '18124606495', 'getLanguageList', '1495681758');
INSERT INTO `log` VALUES ('1367', '18124606495', 'getCookingList', '1495681758');
INSERT INTO `log` VALUES ('1368', '18124606495', 'getSkillList', '1495681758');
INSERT INTO `log` VALUES ('1369', '18124606495', 'getApplianceList', '1495681758');
INSERT INTO `log` VALUES ('1370', '18124606495', 'getJobList', '1495681759');
INSERT INTO `log` VALUES ('1371', '18124606495', 'getCertificateList', '1495681759');
INSERT INTO `log` VALUES ('1372', '18124606495', 'getEmployerList', '1495681759');
INSERT INTO `log` VALUES ('1373', '18124606495', 'getEmployerList', '1495681759');
INSERT INTO `log` VALUES ('1374', '18124606495', 'getUnShareAuntList', '1495681767');
INSERT INTO `log` VALUES ('1375', '18124606495', 'getUnShareAuntList', '1495681811');
INSERT INTO `log` VALUES ('1376', '18124606495', 'login', '1495681939');
INSERT INTO `log` VALUES ('1377', '18124606495', 'getUnShareAuntList', '1495681941');
INSERT INTO `log` VALUES ('1378', '18124606495', 'getUnShareAuntList', '1495681962');
INSERT INTO `log` VALUES ('1379', '18124606495', 'getUnShareAuntList', '1495682031');
INSERT INTO `log` VALUES ('1380', '18124606495', 'login', '1495682041');
INSERT INTO `log` VALUES ('1381', '18124606495', 'getUnShareAuntList', '1495682043');
INSERT INTO `log` VALUES ('1382', '18124606495', 'login', '1495682273');
INSERT INTO `log` VALUES ('1383', '18124606495', 'getEmployerList', '1495682277');
INSERT INTO `log` VALUES ('1384', '18124606495', 'getAuntList', '1495682278');
INSERT INTO `log` VALUES ('1385', '18124606495', 'getLanguageList', '1495682279');
INSERT INTO `log` VALUES ('1386', '18124606495', 'getCookingList', '1495682279');
INSERT INTO `log` VALUES ('1387', '18124606495', 'getSkillList', '1495682279');
INSERT INTO `log` VALUES ('1388', '18124606495', 'getApplianceList', '1495682279');
INSERT INTO `log` VALUES ('1389', '18124606495', 'getJobList', '1495682279');
INSERT INTO `log` VALUES ('1390', '18124606495', 'getCertificateList', '1495682279');
INSERT INTO `log` VALUES ('1391', '18124606495', 'getEmployerList', '1495682313');
INSERT INTO `log` VALUES ('1392', '18124606495', 'getAuntList', '1495682316');
INSERT INTO `log` VALUES ('1393', '18124606495', 'getLanguageList', '1495682316');
INSERT INTO `log` VALUES ('1394', '18124606495', 'getCookingList', '1495682316');
INSERT INTO `log` VALUES ('1395', '18124606495', 'getSkillList', '1495682316');
INSERT INTO `log` VALUES ('1396', '18124606495', 'getApplianceList', '1495682316');
INSERT INTO `log` VALUES ('1397', '18124606495', 'getJobList', '1495682316');
INSERT INTO `log` VALUES ('1398', '18124606495', 'getCertificateList', '1495682316');
INSERT INTO `log` VALUES ('1399', '18124606495', 'getPactList', '1495682320');
INSERT INTO `log` VALUES ('1400', '18124606495', 'getUnShareAuntList', '1495682322');
INSERT INTO `log` VALUES ('1401', '123', 'login', '1495682778');
INSERT INTO `log` VALUES ('1402', '123', 'getAllShareAuntList', '1495682782');
INSERT INTO `log` VALUES ('1403', '123', 'getAllShareEmployerList', '1495682782');
INSERT INTO `log` VALUES ('1404', '123', 'getEmployerCountByIdStatus', '1495682789');
INSERT INTO `log` VALUES ('1405', '123', 'getEmployerCountByIdStatus', '1495682826');
INSERT INTO `log` VALUES ('1406', '123', 'getEmployerCountByIdStatus', '1495682871');
INSERT INTO `log` VALUES ('1407', '123', 'getEmployerCountByIdStatus', '1495683016');
INSERT INTO `log` VALUES ('1408', '123', 'getEmployerCountByIdStatus', '1495683018');
INSERT INTO `log` VALUES ('1409', '123', 'getEmployerCountByIdStatus', '1495683019');
INSERT INTO `log` VALUES ('1410', '123', 'getEmployerCountByIdStatus', '1495683021');
INSERT INTO `log` VALUES ('1411', '123', 'getEmployerCountByIdStatus', '1495683022');
INSERT INTO `log` VALUES ('1412', '18124606495', 'getEmployerList', '1495683738');
INSERT INTO `log` VALUES ('1413', '18124606495', 'getAuntList', '1495683740');
INSERT INTO `log` VALUES ('1414', '18124606495', 'getLanguageList', '1495683740');
INSERT INTO `log` VALUES ('1415', '18124606495', 'getCookingList', '1495683740');
INSERT INTO `log` VALUES ('1416', '18124606495', 'getSkillList', '1495683741');
INSERT INTO `log` VALUES ('1417', '18124606495', 'getApplianceList', '1495683741');
INSERT INTO `log` VALUES ('1418', '18124606495', 'getJobList', '1495683741');
INSERT INTO `log` VALUES ('1419', '18124606495', 'getCertificateList', '1495683741');
INSERT INTO `log` VALUES ('1420', '123', 'login', '1495683974');
INSERT INTO `log` VALUES ('1421', '123', 'login', '1495684014');
INSERT INTO `log` VALUES ('1422', '123', 'getAllShareAuntList', '1495684018');
INSERT INTO `log` VALUES ('1423', '123', 'getAllShareEmployerList', '1495684018');
INSERT INTO `log` VALUES ('1424', '123', 'getEmployerCountByIdStatus', '1495684023');
INSERT INTO `log` VALUES ('1425', '123', 'getEmployerCountByIdStatus', '1495684049');
INSERT INTO `log` VALUES ('1426', '123', 'getEmployerCountByIdStatus', '1495684059');
INSERT INTO `log` VALUES ('1427', '123', 'getEmployerCountByIdStatus', '1495684067');
INSERT INTO `log` VALUES ('1428', '123', 'getEmployerCountByIdStatus', '1495684088');
INSERT INTO `log` VALUES ('1429', '123', 'getEmployerCountByIdStatus', '1495684097');
INSERT INTO `log` VALUES ('1430', '123', 'getEmployerCountByIdStatus', '1495684117');
INSERT INTO `log` VALUES ('1431', '18124606495', 'login', '1495684821');
INSERT INTO `log` VALUES ('1432', '18124606495', 'login', '1495685119');
INSERT INTO `log` VALUES ('1433', '18124606495', 'getUnShareAuntList', '1495685129');
INSERT INTO `log` VALUES ('1434', '18124606495', 'getUnShareAuntList', '1495685144');
INSERT INTO `log` VALUES ('1435', '18124606495', 'getEmployerList', '1495685149');
INSERT INTO `log` VALUES ('1436', '18124606495', 'getAuntList', '1495685166');
INSERT INTO `log` VALUES ('1437', '18124606495', 'getLanguageList', '1495685166');
INSERT INTO `log` VALUES ('1438', '18124606495', 'getCookingList', '1495685166');
INSERT INTO `log` VALUES ('1439', '18124606495', 'getSkillList', '1495685166');
INSERT INTO `log` VALUES ('1440', '18124606495', 'getApplianceList', '1495685166');
INSERT INTO `log` VALUES ('1441', '18124606495', 'getJobList', '1495685167');
INSERT INTO `log` VALUES ('1442', '18124606495', 'getCertificateList', '1495685167');
INSERT INTO `log` VALUES ('1443', '18124606495', 'getEmployerList', '1495685167');
INSERT INTO `log` VALUES ('1444', '18124606495', 'getPactList', '1495685168');
INSERT INTO `log` VALUES ('1445', '18124606495', 'getPactList', '1495685169');
INSERT INTO `log` VALUES ('1446', '18124606495', 'getAuntList', '1495685184');
INSERT INTO `log` VALUES ('1447', '18124606495', 'getLanguageList', '1495685184');
INSERT INTO `log` VALUES ('1448', '18124606495', 'getCookingList', '1495685184');
INSERT INTO `log` VALUES ('1449', '18124606495', 'getSkillList', '1495685184');
INSERT INTO `log` VALUES ('1450', '18124606495', 'getApplianceList', '1495685185');
INSERT INTO `log` VALUES ('1451', '18124606495', 'getJobList', '1495685185');
INSERT INTO `log` VALUES ('1452', '18124606495', 'getCertificateList', '1495685185');
INSERT INTO `log` VALUES ('1453', '18124606495', 'getUnShareAuntList', '1495685187');
INSERT INTO `log` VALUES ('1454', '18124606495', 'getPactList', '1495691867');
INSERT INTO `log` VALUES ('1455', '18124606495', 'getPactList', '1495691869');
INSERT INTO `log` VALUES ('1456', '18124606495', 'getAuntList', '1495691873');
INSERT INTO `log` VALUES ('1457', '18124606495', 'getLanguageList', '1495691873');
INSERT INTO `log` VALUES ('1458', '18124606495', 'getCookingList', '1495691873');
INSERT INTO `log` VALUES ('1459', '18124606495', 'getSkillList', '1495691873');
INSERT INTO `log` VALUES ('1460', '18124606495', 'getApplianceList', '1495691873');
INSERT INTO `log` VALUES ('1461', '18124606495', 'getJobList', '1495691873');
INSERT INTO `log` VALUES ('1462', '18124606495', 'getCertificateList', '1495691874');
INSERT INTO `log` VALUES ('1463', '18124606495', 'login', '1495691959');
INSERT INTO `log` VALUES ('1464', '18124606495', 'getUnAckUserList', '1495691974');
INSERT INTO `log` VALUES ('1465', '18124606495', 'getPactList', '1495691982');
INSERT INTO `log` VALUES ('1466', '18124606495', 'getPactList', '1495691985');
INSERT INTO `log` VALUES ('1467', '18124606495', 'getUnAckUserList', '1495691989');
INSERT INTO `log` VALUES ('1468', '18124606495', 'getUnAckUserList', '1495692010');
INSERT INTO `log` VALUES ('1469', '18124606495', 'login', '1495692027');
INSERT INTO `log` VALUES ('1470', '18124606495', 'getUnAckUserList', '1495692030');
INSERT INTO `log` VALUES ('1471', '123', 'login', '1495693224');
INSERT INTO `log` VALUES ('1472', '123', 'getEmployerList', '1495693318');
INSERT INTO `log` VALUES ('1473', '123', 'getAuntList', '1495693321');
INSERT INTO `log` VALUES ('1474', '123', 'getLanguageList', '1495693321');
INSERT INTO `log` VALUES ('1475', '123', 'getCookingList', '1495693321');
INSERT INTO `log` VALUES ('1476', '123', 'getSkillList', '1495693322');
INSERT INTO `log` VALUES ('1477', '123', 'getApplianceList', '1495693322');
INSERT INTO `log` VALUES ('1478', '123', 'getJobList', '1495693322');
INSERT INTO `log` VALUES ('1479', '123', 'getCertificateList', '1495693322');
INSERT INTO `log` VALUES ('1480', '123', 'getAuntList', '1495693330');
INSERT INTO `log` VALUES ('1481', '123', 'getLanguageList', '1495693330');
INSERT INTO `log` VALUES ('1482', '123', 'getCookingList', '1495693330');
INSERT INTO `log` VALUES ('1483', '123', 'getSkillList', '1495693330');
INSERT INTO `log` VALUES ('1484', '123', 'getApplianceList', '1495693331');
INSERT INTO `log` VALUES ('1485', '123', 'getJobList', '1495693331');
INSERT INTO `log` VALUES ('1486', '123', 'getCertificateList', '1495693331');
INSERT INTO `log` VALUES ('1487', '18124606495', 'login', '1495696637');
INSERT INTO `log` VALUES ('1488', '18124606495', 'login', '1495697226');
INSERT INTO `log` VALUES ('1489', '18124606495', 'getEmployerList', '1495697467');
INSERT INTO `log` VALUES ('1490', '18124606495', 'getAuntList', '1495697469');
INSERT INTO `log` VALUES ('1491', '18124606495', 'getLanguageList', '1495697469');
INSERT INTO `log` VALUES ('1492', '18124606495', 'getCookingList', '1495697469');
INSERT INTO `log` VALUES ('1493', '18124606495', 'getSkillList', '1495697469');
INSERT INTO `log` VALUES ('1494', '18124606495', 'getApplianceList', '1495697470');
INSERT INTO `log` VALUES ('1495', '18124606495', 'getJobList', '1495697470');
INSERT INTO `log` VALUES ('1496', '18124606495', 'getCertificateList', '1495697470');
INSERT INTO `log` VALUES ('1497', '18124606495', 'getEmployerList', '1495697471');
INSERT INTO `log` VALUES ('1498', '123', 'login', '1495697525');
INSERT INTO `log` VALUES ('1499', '123', 'getAllShareAuntList', '1495697529');
INSERT INTO `log` VALUES ('1500', '123', 'getAllShareEmployerList', '1495697529');
INSERT INTO `log` VALUES ('1501', '123', 'getEmployerCountByIdStatus', '1495697553');
INSERT INTO `log` VALUES ('1502', '123', 'getEmployerCountByIdStatus', '1495697629');
INSERT INTO `log` VALUES ('1503', '123', 'addEmployerTracking', '1495697783');
INSERT INTO `log` VALUES ('1504', '123', 'addEmployerTracking', '1495697883');
INSERT INTO `log` VALUES ('1505', '18124606495', 'getEmployerList', '1495698115');
INSERT INTO `log` VALUES ('1506', '18124606495', 'addEmployer', '1495698203');
INSERT INTO `log` VALUES ('1507', '18124606495', 'addEmployer', '1495698218');
INSERT INTO `log` VALUES ('1508', '18124606495', 'addEmployer', '1495698283');
INSERT INTO `log` VALUES ('1509', '18124606495', 'getEmployerList', '1495698391');
INSERT INTO `log` VALUES ('1510', '18124606495', 'getEmployerList', '1495698395');
INSERT INTO `log` VALUES ('1511', '18124606495', 'addEmployer', '1495698416');
INSERT INTO `log` VALUES ('1512', '18124606495', 'addEmployer', '1495698418');
INSERT INTO `log` VALUES ('1513', '18124606495', 'getAuntList', '1495698452');
INSERT INTO `log` VALUES ('1514', '18124606495', 'getLanguageList', '1495698452');
INSERT INTO `log` VALUES ('1515', '18124606495', 'getCookingList', '1495698452');
INSERT INTO `log` VALUES ('1516', '18124606495', 'getSkillList', '1495698452');
INSERT INTO `log` VALUES ('1517', '18124606495', 'getApplianceList', '1495698452');
INSERT INTO `log` VALUES ('1518', '18124606495', 'getJobList', '1495698452');
INSERT INTO `log` VALUES ('1519', '18124606495', 'getCertificateList', '1495698452');
INSERT INTO `log` VALUES ('1520', '18124606495', 'addAunt', '1495698570');
INSERT INTO `log` VALUES ('1521', '18124606495', 'getAuntList', '1495698577');
INSERT INTO `log` VALUES ('1522', '18124606495', 'getLanguageList', '1495698577');
INSERT INTO `log` VALUES ('1523', '18124606495', 'getCookingList', '1495698578');
INSERT INTO `log` VALUES ('1524', '18124606495', 'getSkillList', '1495698578');
INSERT INTO `log` VALUES ('1525', '18124606495', 'getApplianceList', '1495698578');
INSERT INTO `log` VALUES ('1526', '18124606495', 'getJobList', '1495698578');
INSERT INTO `log` VALUES ('1527', '18124606495', 'getCertificateList', '1495698578');
INSERT INTO `log` VALUES ('1528', '18124606495', 'getAuntList', '1495698586');
INSERT INTO `log` VALUES ('1529', '18124606495', 'getLanguageList', '1495698586');
INSERT INTO `log` VALUES ('1530', '18124606495', 'getCookingList', '1495698586');
INSERT INTO `log` VALUES ('1531', '18124606495', 'getSkillList', '1495698586');
INSERT INTO `log` VALUES ('1532', '18124606495', 'getApplianceList', '1495698586');
INSERT INTO `log` VALUES ('1533', '18124606495', 'getJobList', '1495698586');
INSERT INTO `log` VALUES ('1534', '18124606495', 'getCertificateList', '1495698586');
INSERT INTO `log` VALUES ('1535', '18124606495', 'getPactList', '1495698905');
INSERT INTO `log` VALUES ('1536', '18124606495', 'getPactList', '1495699011');
INSERT INTO `log` VALUES ('1537', '18124606495', 'login', '1495699030');
INSERT INTO `log` VALUES ('1538', '18124606495', 'getPactList', '1495699031');
INSERT INTO `log` VALUES ('1539', '18124606495', 'getPactList', '1495699052');
INSERT INTO `log` VALUES ('1540', '18124606495', 'getPactList', '1495699068');
INSERT INTO `log` VALUES ('1541', '18124606495', 'getPactList', '1495699080');
INSERT INTO `log` VALUES ('1542', '18124606495', 'getPactList', '1495699258');
INSERT INTO `log` VALUES ('1543', '18124606495', 'login', '1495699272');
INSERT INTO `log` VALUES ('1544', '18124606495', 'getPactList', '1495699274');
INSERT INTO `log` VALUES ('1545', '18124606495', 'getPactList', '1495699302');
INSERT INTO `log` VALUES ('1546', '18124606495', 'getPactList', '1495699337');
INSERT INTO `log` VALUES ('1547', '18124606495', 'login', '1495699423');
INSERT INTO `log` VALUES ('1548', '18124606495', 'getPactList', '1495699429');
INSERT INTO `log` VALUES ('1549', '18124606495', 'getPactList', '1495699449');
INSERT INTO `log` VALUES ('1550', '18124606495', 'getPactList', '1495699501');
INSERT INTO `log` VALUES ('1551', '18124606495', 'getPactList', '1495699727');
INSERT INTO `log` VALUES ('1552', '18124606495', 'addPact', '1495699774');
INSERT INTO `log` VALUES ('1553', '18124606495', 'addPact', '1495699790');
INSERT INTO `log` VALUES ('1554', '18124606495', 'getEmployerList', '1495700504');
INSERT INTO `log` VALUES ('1555', '18124606495', 'getEmployerList', '1495700533');
INSERT INTO `log` VALUES ('1556', '18124606495', 'getEmployerList', '1495700535');
INSERT INTO `log` VALUES ('1557', '18124606495', 'getEmployerList', '1495700632');
INSERT INTO `log` VALUES ('1558', '18124606495', 'getPactList', '1495700726');
INSERT INTO `log` VALUES ('1559', '18124606495', 'getEmployerList', '1495700911');
INSERT INTO `log` VALUES ('1560', '18124606495', 'getAuntList', '1495700914');
INSERT INTO `log` VALUES ('1561', '18124606495', 'getLanguageList', '1495700914');
INSERT INTO `log` VALUES ('1562', '18124606495', 'getCookingList', '1495700914');
INSERT INTO `log` VALUES ('1563', '18124606495', 'getSkillList', '1495700914');
INSERT INTO `log` VALUES ('1564', '18124606495', 'getApplianceList', '1495700914');
INSERT INTO `log` VALUES ('1565', '18124606495', 'getJobList', '1495700914');
INSERT INTO `log` VALUES ('1566', '18124606495', 'getCertificateList', '1495700915');
INSERT INTO `log` VALUES ('1567', '18124606495', 'getEmployerList', '1495700915');
INSERT INTO `log` VALUES ('1568', '18124606495', 'getAuntList', '1495700917');
INSERT INTO `log` VALUES ('1569', '18124606495', 'getLanguageList', '1495700917');
INSERT INTO `log` VALUES ('1570', '18124606495', 'getCookingList', '1495700918');
INSERT INTO `log` VALUES ('1571', '18124606495', 'getSkillList', '1495700918');
INSERT INTO `log` VALUES ('1572', '18124606495', 'getApplianceList', '1495700918');
INSERT INTO `log` VALUES ('1573', '18124606495', 'getJobList', '1495700918');
INSERT INTO `log` VALUES ('1574', '18124606495', 'getCertificateList', '1495700918');
INSERT INTO `log` VALUES ('1575', '18124606495', 'getEmployerList', '1495700918');
INSERT INTO `log` VALUES ('1576', '18124606495', 'getAuntList', '1495700919');
INSERT INTO `log` VALUES ('1577', '18124606495', 'getLanguageList', '1495700920');
INSERT INTO `log` VALUES ('1578', '18124606495', 'getCookingList', '1495700920');
INSERT INTO `log` VALUES ('1579', '18124606495', 'getSkillList', '1495700920');
INSERT INTO `log` VALUES ('1580', '18124606495', 'getApplianceList', '1495700920');
INSERT INTO `log` VALUES ('1581', '18124606495', 'getJobList', '1495700920');
INSERT INTO `log` VALUES ('1582', '18124606495', 'getCertificateList', '1495700920');
INSERT INTO `log` VALUES ('1583', '18124606495', 'getEmployerList', '1495700920');
INSERT INTO `log` VALUES ('1584', '18124606495', 'getAuntList', '1495700926');
INSERT INTO `log` VALUES ('1585', '18124606495', 'getLanguageList', '1495700926');
INSERT INTO `log` VALUES ('1586', '18124606495', 'getCookingList', '1495700926');
INSERT INTO `log` VALUES ('1587', '18124606495', 'getSkillList', '1495700926');
INSERT INTO `log` VALUES ('1588', '18124606495', 'getApplianceList', '1495700926');
INSERT INTO `log` VALUES ('1589', '18124606495', 'getJobList', '1495700926');
INSERT INTO `log` VALUES ('1590', '18124606495', 'getCertificateList', '1495700926');
INSERT INTO `log` VALUES ('1591', '18124606495', 'getEmployerList', '1495700928');
INSERT INTO `log` VALUES ('1592', '18124606495', 'getAuntList', '1495700929');
INSERT INTO `log` VALUES ('1593', '18124606495', 'getLanguageList', '1495700929');
INSERT INTO `log` VALUES ('1594', '18124606495', 'getCookingList', '1495700929');
INSERT INTO `log` VALUES ('1595', '18124606495', 'getSkillList', '1495700929');
INSERT INTO `log` VALUES ('1596', '18124606495', 'getApplianceList', '1495700929');
INSERT INTO `log` VALUES ('1597', '18124606495', 'getJobList', '1495700929');
INSERT INTO `log` VALUES ('1598', '18124606495', 'getCertificateList', '1495700930');
INSERT INTO `log` VALUES ('1599', '18124606495', 'getEmployerList', '1495700930');
INSERT INTO `log` VALUES ('1600', '18124606495', 'getAuntList', '1495700930');
INSERT INTO `log` VALUES ('1601', '18124606495', 'getLanguageList', '1495700931');
INSERT INTO `log` VALUES ('1602', '18124606495', 'getCookingList', '1495700931');
INSERT INTO `log` VALUES ('1603', '18124606495', 'getSkillList', '1495700931');
INSERT INTO `log` VALUES ('1604', '18124606495', 'getApplianceList', '1495700931');
INSERT INTO `log` VALUES ('1605', '18124606495', 'getJobList', '1495700931');
INSERT INTO `log` VALUES ('1606', '18124606495', 'getCertificateList', '1495700931');
INSERT INTO `log` VALUES ('1607', '18124606495', 'getEmployerList', '1495700931');
INSERT INTO `log` VALUES ('1608', '18124606495', 'getPactList', '1495700937');
INSERT INTO `log` VALUES ('1609', '18124606495', 'getPactList', '1495700941');
INSERT INTO `log` VALUES ('1610', '18124606495', 'getUnShareAuntList', '1495700945');
INSERT INTO `log` VALUES ('1611', '18124606495', 'getEmployerList', '1495700958');
INSERT INTO `log` VALUES ('1612', '18124606495', 'getAuntList', '1495700960');
INSERT INTO `log` VALUES ('1613', '18124606495', 'getLanguageList', '1495700960');
INSERT INTO `log` VALUES ('1614', '18124606495', 'getCookingList', '1495700960');
INSERT INTO `log` VALUES ('1615', '18124606495', 'getSkillList', '1495700960');
INSERT INTO `log` VALUES ('1616', '18124606495', 'getApplianceList', '1495700960');
INSERT INTO `log` VALUES ('1617', '18124606495', 'getJobList', '1495700960');
INSERT INTO `log` VALUES ('1618', '18124606495', 'getCertificateList', '1495700960');
INSERT INTO `log` VALUES ('1619', '18124606495', 'getEmployerList', '1495700961');
INSERT INTO `log` VALUES ('1620', '123', 'login', '1495702775');
INSERT INTO `log` VALUES ('1621', '123', 'getEmployerList', '1495702781');
INSERT INTO `log` VALUES ('1622', '123', 'getAuntList', '1495702782');
INSERT INTO `log` VALUES ('1623', '123', 'getLanguageList', '1495702782');
INSERT INTO `log` VALUES ('1624', '123', 'getCookingList', '1495702782');
INSERT INTO `log` VALUES ('1625', '123', 'getSkillList', '1495702783');
INSERT INTO `log` VALUES ('1626', '123', 'getApplianceList', '1495702783');
INSERT INTO `log` VALUES ('1627', '123', 'getJobList', '1495702783');
INSERT INTO `log` VALUES ('1628', '123', 'getCertificateList', '1495702783');
INSERT INTO `log` VALUES ('1629', '123', 'getPactList', '1495702785');
INSERT INTO `log` VALUES ('1630', '18124606495', 'getEmployerList', '1495702894');
INSERT INTO `log` VALUES ('1631', '123', 'login', '1495703186');
INSERT INTO `log` VALUES ('1632', '123', 'getTest', '1495703191');
INSERT INTO `log` VALUES ('1633', '18124606495', 'getEmployerList', '1495703137');
INSERT INTO `log` VALUES ('1634', '18124606495', 'getPactList', '1495703143');
INSERT INTO `log` VALUES ('1635', '18124606495', 'getPactList', '1495703234');
INSERT INTO `log` VALUES ('1636', '18124606495', 'getPactList', '1495703251');
INSERT INTO `log` VALUES ('1637', '18124606495', 'getPactList', '1495703267');
INSERT INTO `log` VALUES ('1638', '18124606495', 'login', '1495703278');
INSERT INTO `log` VALUES ('1639', '18124606495', 'getPactList', '1495703280');
INSERT INTO `log` VALUES ('1640', '18124606495', 'getPactList', '1495703293');
INSERT INTO `log` VALUES ('1641', '18124606495', 'getPactList', '1495703863');
INSERT INTO `log` VALUES ('1642', '18124606495', 'getPactList', '1495704073');
INSERT INTO `log` VALUES ('1643', '18124606495', 'getEmployerList', '1495709088');
INSERT INTO `log` VALUES ('1644', '18124606495', 'getEmployerList', '1495709183');
INSERT INTO `log` VALUES ('1645', '18124606495', 'getEmployerList', '1495709437');
INSERT INTO `log` VALUES ('1646', '18124606495', 'login', '1495709448');
INSERT INTO `log` VALUES ('1647', '18124606495', 'getEmployerList', '1495709449');
INSERT INTO `log` VALUES ('1648', '18124606495', 'getEmployerList', '1495709463');
INSERT INTO `log` VALUES ('1649', '18124606495', 'getEmployerList', '1495709480');
INSERT INTO `log` VALUES ('1650', '18124606495', 'getEmployerList', '1495709701');
INSERT INTO `log` VALUES ('1651', '18124606495', 'getEmployerList', '1495709715');
INSERT INTO `log` VALUES ('1652', '18124606495', 'getEmployerList', '1495709726');
INSERT INTO `log` VALUES ('1653', '18124606495', 'getEmployerList', '1495709776');
INSERT INTO `log` VALUES ('1654', '18124606495', 'getEmployerList', '1495709805');
INSERT INTO `log` VALUES ('1655', '18124606495', 'getEmployerList', '1495709822');
INSERT INTO `log` VALUES ('1656', '18124606495', 'getEmployerList', '1495709840');
INSERT INTO `log` VALUES ('1657', '18124606495', 'getEmployerList', '1495709872');
INSERT INTO `log` VALUES ('1658', '18124606495', 'getEmployerList', '1495709887');
INSERT INTO `log` VALUES ('1659', '18124606495', 'getEmployerList', '1495709911');
INSERT INTO `log` VALUES ('1660', '18124606495', 'getEmployerList', '1495710215');
INSERT INTO `log` VALUES ('1661', '18124606495', 'getEmployerList', '1495710267');
INSERT INTO `log` VALUES ('1662', '18124606495', 'getEmployerList', '1495710270');
INSERT INTO `log` VALUES ('1663', '18124606495', 'login', '1495711160');
INSERT INTO `log` VALUES ('1664', '18124606495', 'getAuntList', '1495711719');
INSERT INTO `log` VALUES ('1665', '18124606495', 'getLanguageList', '1495711719');
INSERT INTO `log` VALUES ('1666', '18124606495', 'getCookingList', '1495711720');
INSERT INTO `log` VALUES ('1667', '18124606495', 'getSkillList', '1495711720');
INSERT INTO `log` VALUES ('1668', '18124606495', 'getApplianceList', '1495711720');
INSERT INTO `log` VALUES ('1669', '18124606495', 'getJobList', '1495711720');
INSERT INTO `log` VALUES ('1670', '18124606495', 'getCertificateList', '1495711720');
INSERT INTO `log` VALUES ('1671', '18124606495', 'getAuntList', '1495711721');
INSERT INTO `log` VALUES ('1672', '18124606495', 'getLanguageList', '1495711721');
INSERT INTO `log` VALUES ('1673', '18124606495', 'getCookingList', '1495711721');
INSERT INTO `log` VALUES ('1674', '18124606495', 'getSkillList', '1495711722');
INSERT INTO `log` VALUES ('1675', '18124606495', 'getApplianceList', '1495711722');
INSERT INTO `log` VALUES ('1676', '18124606495', 'getJobList', '1495711722');
INSERT INTO `log` VALUES ('1677', '18124606495', 'getCertificateList', '1495711722');
INSERT INTO `log` VALUES ('1678', '18124606495', 'getEmployerList', '1495712861');
INSERT INTO `log` VALUES ('1679', '123', 'login', '1495712944');
INSERT INTO `log` VALUES ('1680', '123', 'getEmployerList', '1495712948');
INSERT INTO `log` VALUES ('1681', '123', 'login', '1495713157');
INSERT INTO `log` VALUES ('1682', '123', 'getEmployerList', '1495713159');
INSERT INTO `log` VALUES ('1683', '123', 'getEmployerList', '1495713215');
INSERT INTO `log` VALUES ('1684', '123', 'getEmployerList', '1495713230');
INSERT INTO `log` VALUES ('1685', '123', 'getAuntList', '1495713239');
INSERT INTO `log` VALUES ('1686', '123', 'getLanguageList', '1495713239');
INSERT INTO `log` VALUES ('1687', '123', 'getCookingList', '1495713239');
INSERT INTO `log` VALUES ('1688', '123', 'getSkillList', '1495713240');
INSERT INTO `log` VALUES ('1689', '123', 'getApplianceList', '1495713240');
INSERT INTO `log` VALUES ('1690', '123', 'getJobList', '1495713240');
INSERT INTO `log` VALUES ('1691', '123', 'getCertificateList', '1495713240');
INSERT INTO `log` VALUES ('1692', '123', 'getUnShareAuntList', '1495713245');
INSERT INTO `log` VALUES ('1693', '123', 'getUnShareAuntList', '1495713249');
INSERT INTO `log` VALUES ('1694', '123', 'getEmployerList', '1495713341');
INSERT INTO `log` VALUES ('1695', '123', 'login', '1495713398');
INSERT INTO `log` VALUES ('1696', '123', 'getAllShareAuntList', '1495713402');
INSERT INTO `log` VALUES ('1697', '123', 'getAllShareEmployerList', '1495713402');
INSERT INTO `log` VALUES ('1698', '123', 'getAllShareAuntList', '1495713408');
INSERT INTO `log` VALUES ('1699', '123', 'getAllShareEmployerList', '1495713408');
INSERT INTO `log` VALUES ('1700', '123', 'login', '1495713424');
INSERT INTO `log` VALUES ('1701', '123', 'getAllShareAuntList', '1495713425');
INSERT INTO `log` VALUES ('1702', '123', 'getAllShareEmployerList', '1495713425');
INSERT INTO `log` VALUES ('1703', '123', 'getEmployerCountByIdStatus', '1495713536');
INSERT INTO `log` VALUES ('1704', '123', 'getEmployerCountByIdStatus', '1495713561');
INSERT INTO `log` VALUES ('1705', '123', 'login', '1495762002');
INSERT INTO `log` VALUES ('1706', '123', 'login', '1495765555');
INSERT INTO `log` VALUES ('1707', '123', 'login', '1495765558');
INSERT INTO `log` VALUES ('1708', '123', 'getAllShareAuntList', '1495765559');
INSERT INTO `log` VALUES ('1709', '123', 'getAllShareEmployerList', '1495765560');
INSERT INTO `log` VALUES ('1710', '123', 'getEmployerListByStatus', '1495765580');
INSERT INTO `log` VALUES ('1711', '123', 'getEmployerList', '1495765619');
INSERT INTO `log` VALUES ('1712', '123', 'addEmployerTracking', '1495765776');
INSERT INTO `log` VALUES ('1713', '123', 'addEmployerTracking', '1495765794');
INSERT INTO `log` VALUES ('1714', '123', 'addEmployerTracking', '1495765796');
INSERT INTO `log` VALUES ('1715', '123', 'addEmployerTracking', '1495765797');
INSERT INTO `log` VALUES ('1716', '123', 'deleteEmployerTracking', '1495765854');
INSERT INTO `log` VALUES ('1717', '123', 'updateEmployerTracking', '1495765909');
INSERT INTO `log` VALUES ('1718', '123', 'updateEmployerTracking', '1495765975');
INSERT INTO `log` VALUES ('1719', '123', 'updateEmployerTracking', '1495766076');
INSERT INTO `log` VALUES ('1720', '123', 'updateEmployerTracking', '1495766236');
INSERT INTO `log` VALUES ('1721', '123', 'updateEmployerTracking', '1495766255');
INSERT INTO `log` VALUES ('1722', '123', 'updateEmployerTracking', '1495766343');
INSERT INTO `log` VALUES ('1723', '123', 'login', '1495766443');
INSERT INTO `log` VALUES ('1724', '123', 'getAllShareAuntList', '1495766447');
INSERT INTO `log` VALUES ('1725', '123', 'getAllShareEmployerList', '1495766447');
INSERT INTO `log` VALUES ('1726', '123', 'updateEmployerTracking', '1495766451');
INSERT INTO `log` VALUES ('1727', '123', 'updateEmployerTracking', '1495766471');
INSERT INTO `log` VALUES ('1728', '123', 'updateEmployerTracking', '1495766783');
INSERT INTO `log` VALUES ('1729', '123', 'login', '1495767255');
INSERT INTO `log` VALUES ('1730', '123', 'addStaff', '1495767260');
INSERT INTO `log` VALUES ('1731', '123', 'addStaff', '1495767286');
INSERT INTO `log` VALUES ('1732', '123', 'addStaff', '1495767295');
INSERT INTO `log` VALUES ('1733', '123', 'addStaff', '1495767320');
INSERT INTO `log` VALUES ('1734', '123', 'login', '1495767389');
INSERT INTO `log` VALUES ('1735', '123', 'getAllShareAuntList', '1495767393');
INSERT INTO `log` VALUES ('1736', '123', 'getAllShareEmployerList', '1495767393');
INSERT INTO `log` VALUES ('1737', '123', 'updateEmployerTracking', '1495767396');
INSERT INTO `log` VALUES ('1738', '123', 'login', '1495767509');
INSERT INTO `log` VALUES ('1739', '123', 'getAllShareAuntList', '1495767513');
INSERT INTO `log` VALUES ('1740', '123', 'getAllShareEmployerList', '1495767513');
INSERT INTO `log` VALUES ('1741', '123', 'updateEmployerTracking', '1495767517');
INSERT INTO `log` VALUES ('1742', '123', 'updateEmployerTracking', '1495767622');
INSERT INTO `log` VALUES ('1743', '123', 'updateEmployerTracking', '1495767644');
INSERT INTO `log` VALUES ('1744', '123', 'getStaffList', '1495767902');
INSERT INTO `log` VALUES ('1745', '123', 'getStaffList', '1495767909');
INSERT INTO `log` VALUES ('1746', '123', 'updateEmployerTracking', '1495767886');
INSERT INTO `log` VALUES ('1747', '123', 'updateEmployerTracking', '1495767888');
INSERT INTO `log` VALUES ('1748', '123', 'updateEmployerTracking', '1495767889');
INSERT INTO `log` VALUES ('1749', '123', 'updateEmployerTracking', '1495767890');
INSERT INTO `log` VALUES ('1750', '123', 'updateEmployerTracking', '1495767892');
INSERT INTO `log` VALUES ('1751', '123', 'updateEmployerTracking', '1495767893');
INSERT INTO `log` VALUES ('1752', '123', 'updateEmployerTracking', '1495767929');
INSERT INTO `log` VALUES ('1753', '123', 'getStaffList', '1495768117');
INSERT INTO `log` VALUES ('1754', '123', 'getStaffList', '1495768185');
INSERT INTO `log` VALUES ('1755', '123', 'getStaffList', '1495768194');
INSERT INTO `log` VALUES ('1756', '123', 'getStaffList', '1495768207');
INSERT INTO `log` VALUES ('1757', '123', 'getStaffList', '1495768208');
INSERT INTO `log` VALUES ('1758', '123', 'getStaffList', '1495768210');
INSERT INTO `log` VALUES ('1759', '123', 'getStaffList', '1495768238');
INSERT INTO `log` VALUES ('1760', '123', 'getStaffList', '1495768240');
INSERT INTO `log` VALUES ('1761', '123', 'getStaffList', '1495768241');
INSERT INTO `log` VALUES ('1762', '123', 'getStaffList', '1495768286');
INSERT INTO `log` VALUES ('1763', '123', 'getStaffList', '1495768292');
INSERT INTO `log` VALUES ('1764', '123', 'getStaffList', '1495768311');
INSERT INTO `log` VALUES ('1765', '123', 'addStaff', '1495768316');
INSERT INTO `log` VALUES ('1766', '123', 'addStaff', '1495768322');
INSERT INTO `log` VALUES ('1767', '123', 'getStaffList', '1495768323');
INSERT INTO `log` VALUES ('1768', '123', 'getStaffList', '1495768476');
INSERT INTO `log` VALUES ('1769', '123', 'addStaff', '1495768491');
INSERT INTO `log` VALUES ('1770', '123', 'addStaff', '1495768495');
INSERT INTO `log` VALUES ('1771', '123', 'getStaffList', '1495768496');
INSERT INTO `log` VALUES ('1772', '123', 'getStaffList', '1495768533');
INSERT INTO `log` VALUES ('1773', '123', 'getStaffList', '1495768540');
INSERT INTO `log` VALUES ('1774', '123', 'getStaffList', '1495768547');
INSERT INTO `log` VALUES ('1775', '123', 'addStaff', '1495768556');
INSERT INTO `log` VALUES ('1776', '123', 'addStaff', '1495768560');
INSERT INTO `log` VALUES ('1777', '123', 'getStaffList', '1495768561');
INSERT INTO `log` VALUES ('1778', '123', 'login', '1495768672');
INSERT INTO `log` VALUES ('1779', '123', 'getAllShareAuntList', '1495768676');
INSERT INTO `log` VALUES ('1780', '123', 'getAllShareEmployerList', '1495768677');
INSERT INTO `log` VALUES ('1781', '123', 'updateEmployerTracking', '1495768684');
INSERT INTO `log` VALUES ('1782', '123', 'getStaffList', '1495768796');
INSERT INTO `log` VALUES ('1783', '123', 'getStaffList', '1495768804');
INSERT INTO `log` VALUES ('1784', '123', 'getStaffList', '1495768806');
INSERT INTO `log` VALUES ('1785', '123', 'getStaffList', '1495768812');
INSERT INTO `log` VALUES ('1786', '123', 'getStaffList', '1495768844');
INSERT INTO `log` VALUES ('1787', '123', 'getStaffList', '1495768856');
INSERT INTO `log` VALUES ('1788', '123', 'getStaffList', '1495768926');
INSERT INTO `log` VALUES ('1789', '123', 'getStaffList', '1495768954');
INSERT INTO `log` VALUES ('1790', '123', 'getStaffList', '1495768959');
INSERT INTO `log` VALUES ('1791', '123', 'getStaffList', '1495768972');
INSERT INTO `log` VALUES ('1792', '123', 'updateEmployerTracking', '1495768927');
INSERT INTO `log` VALUES ('1793', '123', 'updateEmployerTracking', '1495768951');
INSERT INTO `log` VALUES ('1794', '123', 'getStaffList', '1495769100');
INSERT INTO `log` VALUES ('1795', '123', 'updateEmployerTracking', '1495769097');
INSERT INTO `log` VALUES ('1796', '123', 'getStaffList', '1495769179');
INSERT INTO `log` VALUES ('1797', '123', 'login', '1495769224');
INSERT INTO `log` VALUES ('1798', '123', 'getStaffList', '1495769228');
INSERT INTO `log` VALUES ('1799', '123', 'getStaffList', '1495769233');
INSERT INTO `log` VALUES ('1800', '123', 'getStaffList', '1495769234');
INSERT INTO `log` VALUES ('1801', '123', 'getStaffList', '1495769266');
INSERT INTO `log` VALUES ('1802', '123', 'getStaffList', '1495769270');
INSERT INTO `log` VALUES ('1803', '123', 'getStaffList', '1495769274');
INSERT INTO `log` VALUES ('1804', '123', 'getStaffList', '1495769275');
INSERT INTO `log` VALUES ('1805', '123', 'getStaffList', '1495769275');
INSERT INTO `log` VALUES ('1806', '123', 'getStaffList', '1495769306');
INSERT INTO `log` VALUES ('1807', '123', 'getStaffList', '1495769329');
INSERT INTO `log` VALUES ('1808', '123', 'deleteStaff', '1495769332');
INSERT INTO `log` VALUES ('1809', '123', 'getStaffList', '1495769332');
INSERT INTO `log` VALUES ('1810', '123', 'addStaff', '1495769350');
INSERT INTO `log` VALUES ('1811', '123', 'addStaff', '1495769353');
INSERT INTO `log` VALUES ('1812', '123', 'addStaff', '1495769356');
INSERT INTO `log` VALUES ('1813', '123', 'getStaffList', '1495769356');
INSERT INTO `log` VALUES ('1814', '123', 'getSession', '1495769313');
INSERT INTO `log` VALUES ('1815', '123', 'getStaffList', '1495769375');
INSERT INTO `log` VALUES ('1816', '123', 'deleteStaff', '1495769377');
INSERT INTO `log` VALUES ('1817', '123', 'updateEmployerTracking', '1495769705');
INSERT INTO `log` VALUES ('1818', '123', 'updateEmployerTracking', '1495769709');
INSERT INTO `log` VALUES ('1819', '123', 'updateEmployerTracking', '1495769710');
INSERT INTO `log` VALUES ('1820', '123', 'updateEmployerTracking', '1495769711');
INSERT INTO `log` VALUES ('1821', '123', 'updateEmployerTracking', '1495769711');
INSERT INTO `log` VALUES ('1822', '123', 'updateEmployerTracking', '1495769712');
INSERT INTO `log` VALUES ('1823', '123', 'updateEmployerTracking', '1495769713');
INSERT INTO `log` VALUES ('1824', '123', 'updateEmployerTracking', '1495769714');
INSERT INTO `log` VALUES ('1825', '123', 'updateEmployerTracking', '1495769716');
INSERT INTO `log` VALUES ('1826', '123', 'updateEmployerTracking', '1495769717');
INSERT INTO `log` VALUES ('1827', '123', 'updateEmployerTracking', '1495769718');
INSERT INTO `log` VALUES ('1828', '123', 'updateEmployerTracking', '1495769719');
INSERT INTO `log` VALUES ('1829', '123', 'updateEmployerTracking', '1495769720');
INSERT INTO `log` VALUES ('1830', '123', 'updateEmployerTracking', '1495769722');
INSERT INTO `log` VALUES ('1831', '123', 'updateEmployerTracking', '1495769723');
INSERT INTO `log` VALUES ('1832', '123', 'updateEmployerTracking', '1495769724');
INSERT INTO `log` VALUES ('1833', '123', 'updateEmployerTracking', '1495769725');
INSERT INTO `log` VALUES ('1834', '123', 'updateEmployerTracking', '1495769727');
INSERT INTO `log` VALUES ('1835', '123', 'login', '1495769811');
INSERT INTO `log` VALUES ('1836', '123', 'login', '1495769808');
INSERT INTO `log` VALUES ('1837', '123', 'getAllShareAuntList', '1495769812');
INSERT INTO `log` VALUES ('1838', '123', 'getAllShareEmployerList', '1495769812');
INSERT INTO `log` VALUES ('1839', '123', 'updateEmployerTracking', '1495769821');
INSERT INTO `log` VALUES ('1840', '123', 'updateEmployerTracking', '1495769983');
INSERT INTO `log` VALUES ('1841', '123', 'updateEmployerTracking', '1495769987');
INSERT INTO `log` VALUES ('1842', '123', 'updateEmployerTracking', '1495769988');
INSERT INTO `log` VALUES ('1843', '123', 'updateEmployerTracking', '1495769990');
INSERT INTO `log` VALUES ('1844', '123', 'updateEmployerTracking', '1495769992');
INSERT INTO `log` VALUES ('1845', '123', 'updateEmployerTracking', '1495769993');
INSERT INTO `log` VALUES ('1846', '123', 'updateEmployerTracking', '1495769994');
INSERT INTO `log` VALUES ('1847', '123', 'updateEmployerTracking', '1495769995');
INSERT INTO `log` VALUES ('1848', '123', 'updateEmployerTracking', '1495769996');
INSERT INTO `log` VALUES ('1849', '123', 'getStaffList', '1495770072');
INSERT INTO `log` VALUES ('1850', '123', 'deleteStaff', '1495770076');
INSERT INTO `log` VALUES ('1851', '123', 'getStaffList', '1495770077');
INSERT INTO `log` VALUES ('1852', '123', 'addStaff', '1495770084');
INSERT INTO `log` VALUES ('1853', '123', 'getStaffList', '1495770085');
INSERT INTO `log` VALUES ('1854', '123', 'getStaffList', '1495770114');
INSERT INTO `log` VALUES ('1855', '123', 'getStaffList', '1495770283');
INSERT INTO `log` VALUES ('1856', '123', 'getStaffList', '1495770295');
INSERT INTO `log` VALUES ('1857', '123', 'getStaffList', '1495770377');
INSERT INTO `log` VALUES ('1858', '123', 'deleteStaff', '1495770379');
INSERT INTO `log` VALUES ('1859', '123', 'getStaffList', '1495770379');
INSERT INTO `log` VALUES ('1860', '123', 'addStaff', '1495770387');
INSERT INTO `log` VALUES ('1861', '123', 'getStaffList', '1495770387');
INSERT INTO `log` VALUES ('1862', '123', 'getStaffList', '1495770598');
INSERT INTO `log` VALUES ('1863', '123', 'getStaffList', '1495770610');
INSERT INTO `log` VALUES ('1864', '123', 'login', '1495770670');
INSERT INTO `log` VALUES ('1865', '123', 'getAllShareAuntList', '1495770673');
INSERT INTO `log` VALUES ('1866', '123', 'getAllShareEmployerList', '1495770673');
INSERT INTO `log` VALUES ('1867', '123', 'getPactListByStatus', '1495770676');
INSERT INTO `log` VALUES ('1868', '123', 'getPactListByStatus', '1495770681');
INSERT INTO `log` VALUES ('1869', '123', 'getPactListByStatus', '1495770693');
INSERT INTO `log` VALUES ('1870', '123', 'getStaffList', '1495770790');
INSERT INTO `log` VALUES ('1871', '18124606495', 'login', '1495770695');
INSERT INTO `log` VALUES ('1872', '18124606495', 'getAuntList', '1495770716');
INSERT INTO `log` VALUES ('1873', '18124606495', 'getLanguageList', '1495770716');
INSERT INTO `log` VALUES ('1874', '18124606495', 'getCookingList', '1495770716');
INSERT INTO `log` VALUES ('1875', '18124606495', 'getSkillList', '1495770716');
INSERT INTO `log` VALUES ('1876', '18124606495', 'getApplianceList', '1495770716');
INSERT INTO `log` VALUES ('1877', '18124606495', 'getJobList', '1495770716');
INSERT INTO `log` VALUES ('1878', '18124606495', 'getCertificateList', '1495770716');
INSERT INTO `log` VALUES ('1879', '18124606495', 'getUnShareAuntList', '1495770720');
INSERT INTO `log` VALUES ('1880', '123', 'getStaffList', '1495770825');
INSERT INTO `log` VALUES ('1881', '123', 'getStaffList', '1495770847');
INSERT INTO `log` VALUES ('1882', '123', 'getPactListByStatus', '1495770796');
INSERT INTO `log` VALUES ('1883', '123', 'getStaffList', '1495770861');
INSERT INTO `log` VALUES ('1884', '123', 'getStaffList', '1495770865');
INSERT INTO `log` VALUES ('1885', '123', 'getStaffList', '1495770910');
INSERT INTO `log` VALUES ('1886', '123', 'getStaffList', '1495770915');
INSERT INTO `log` VALUES ('1887', '123', 'getStaffList', '1495770933');
INSERT INTO `log` VALUES ('1888', '123', 'getStaffList', '1495770942');
INSERT INTO `log` VALUES ('1889', '123', 'getPactListByStatus', '1495770885');
INSERT INTO `log` VALUES ('1890', '123', 'getPactListByStatus', '1495770889');
INSERT INTO `log` VALUES ('1891', '123', 'getStaffList', '1495771000');
INSERT INTO `log` VALUES ('1892', '123', 'getStaffList', '1495771021');
INSERT INTO `log` VALUES ('1893', '123', 'login', '1495771053');
INSERT INTO `log` VALUES ('1894', '123', 'getAllShareAuntList', '1495771056');
INSERT INTO `log` VALUES ('1895', '123', 'getAllShareEmployerList', '1495771057');
INSERT INTO `log` VALUES ('1896', '123', 'getPactListByStatus', '1495771058');
INSERT INTO `log` VALUES ('1897', '123', 'login', '1495771153');
INSERT INTO `log` VALUES ('1898', '123', 'getAllShareAuntList', '1495771157');
INSERT INTO `log` VALUES ('1899', '123', 'getAllShareEmployerList', '1495771157');
INSERT INTO `log` VALUES ('1900', '123', 'getPactListByStatus', '1495771159');
INSERT INTO `log` VALUES ('1901', '123', 'login', '1495777828');
INSERT INTO `log` VALUES ('1902', '123', 'getAllShareAuntList', '1495777832');
INSERT INTO `log` VALUES ('1903', '123', 'getAllShareEmployerList', '1495777832');
INSERT INTO `log` VALUES ('1904', '123', 'getPactListByStatus', '1495777837');
INSERT INTO `log` VALUES ('1905', '123', 'getPactListByStatus', '1495777848');
INSERT INTO `log` VALUES ('1906', '123', 'getPactListByStatus', '1495777851');
INSERT INTO `log` VALUES ('1907', '123', 'getPactListByStatus', '1495777853');
INSERT INTO `log` VALUES ('1908', '123', 'getPactListByStatus', '1495777854');
INSERT INTO `log` VALUES ('1909', '123', 'getPactListByStatus', '1495777905');
INSERT INTO `log` VALUES ('1910', '123', 'login', '1495778074');
INSERT INTO `log` VALUES ('1911', '123', 'getAllShareAuntList', '1495778081');
INSERT INTO `log` VALUES ('1912', '123', 'getAllShareEmployerList', '1495778081');
INSERT INTO `log` VALUES ('1913', '123', 'getPactListByStatus', '1495778085');
INSERT INTO `log` VALUES ('1914', '123', 'login', '1495778308');
INSERT INTO `log` VALUES ('1915', '123', 'getAllShareAuntList', '1495778315');
INSERT INTO `log` VALUES ('1916', '123', 'getAllShareEmployerList', '1495778315');
INSERT INTO `log` VALUES ('1917', '123', 'getPactListByStatus', '1495778319');
INSERT INTO `log` VALUES ('1918', '123', 'updateEmployerTracking', '1495778333');
INSERT INTO `log` VALUES ('1919', '123', 'updateEmployerTracking', '1495778392');
INSERT INTO `log` VALUES ('1920', '123', 'updateEmployerTracking', '1495778394');
INSERT INTO `log` VALUES ('1921', '123', 'updateEmployerTracking', '1495778395');
INSERT INTO `log` VALUES ('1922', '18124606495', 'login', '1495779049');
INSERT INTO `log` VALUES ('1923', '123', 'deleteStaff', '1495779149');
INSERT INTO `log` VALUES ('1924', '123', 'getStaffList', '1495779151');
INSERT INTO `log` VALUES ('1925', '18124606495', 'getUnAckUserList', '1495779054');
INSERT INTO `log` VALUES ('1926', '123', 'addStaff', '1495779161');
INSERT INTO `log` VALUES ('1927', '123', 'addStaff', '1495779166');
INSERT INTO `log` VALUES ('1928', '123', 'getStaffList', '1495779166');
INSERT INTO `log` VALUES ('1929', '18124606495', 'getUnAckUserList', '1495779097');
INSERT INTO `log` VALUES ('1930', '123', 'login', '1495779149');
INSERT INTO `log` VALUES ('1931', '123', 'getAllShareAuntList', '1495779153');
INSERT INTO `log` VALUES ('1932', '123', 'getAllShareEmployerList', '1495779153');
INSERT INTO `log` VALUES ('1933', '18124606495', 'getUnAckUserList', '1495779178');
INSERT INTO `log` VALUES ('1934', '123', 'updateEmployerTracking', '1495779347');
INSERT INTO `log` VALUES ('1935', '123', 'getStaffList', '1495779718');
INSERT INTO `log` VALUES ('1936', '123', 'getStaffList', '1495779741');
INSERT INTO `log` VALUES ('1937', '123', 'getStaffList', '1495779749');
INSERT INTO `log` VALUES ('1938', '123', 'updateEmployerTracking', '1495779695');
INSERT INTO `log` VALUES ('1939', '123', 'updateEmployerTracking', '1495779707');
INSERT INTO `log` VALUES ('1940', '123', 'getStaffList', '1495779832');
INSERT INTO `log` VALUES ('1941', '123', 'deleteStaff', '1495779839');
INSERT INTO `log` VALUES ('1942', '123', 'getStaffList', '1495779839');
INSERT INTO `log` VALUES ('1943', '123', 'getStaffList', '1495779913');
INSERT INTO `log` VALUES ('1944', '123', 'getStaffList', '1495779928');
INSERT INTO `log` VALUES ('1945', '123', 'getStaffList', '1495780003');
INSERT INTO `log` VALUES ('1946', '123', 'updateEmployerTracking', '1495780000');
INSERT INTO `log` VALUES ('1947', '123', 'updateEmployerTracking', '1495780002');
INSERT INTO `log` VALUES ('1948', '123', 'updateEmployerTracking', '1495780003');
INSERT INTO `log` VALUES ('1949', '123', 'updateEmployerTracking', '1495780004');
INSERT INTO `log` VALUES ('1950', '123', 'updateEmployerTracking', '1495780005');
INSERT INTO `log` VALUES ('1951', '123', 'updateEmployerTracking', '1495780006');
INSERT INTO `log` VALUES ('1952', '123', 'updateEmployerTracking', '1495780048');
INSERT INTO `log` VALUES ('1953', '123', 'updateEmployerTracking', '1495780049');
INSERT INTO `log` VALUES ('1954', '123', 'updateEmployerTracking', '1495780051');
INSERT INTO `log` VALUES ('1955', '123', 'getStaffList', '1495780124');
INSERT INTO `log` VALUES ('1956', '123', 'getStaffList', '1495780126');
INSERT INTO `log` VALUES ('1957', '123', 'getStaffList', '1495780126');
INSERT INTO `log` VALUES ('1958', '123', 'getStaffList', '1495780132');
INSERT INTO `log` VALUES ('1959', '123', 'getStaffList', '1495780146');
INSERT INTO `log` VALUES ('1960', '123', 'updateEmployerTracking', '1495780091');
INSERT INTO `log` VALUES ('1961', '123', 'updateEmployerTracking', '1495780092');
INSERT INTO `log` VALUES ('1962', '123', 'getStaffList', '1495780158');
INSERT INTO `log` VALUES ('1963', '123', 'updateEmployerTracking', '1495780106');
INSERT INTO `log` VALUES ('1964', '123', 'getStaffList', '1495780169');
INSERT INTO `log` VALUES ('1965', '123', 'getStaffList', '1495780170');
INSERT INTO `log` VALUES ('1966', '123', 'getStaffList', '1495780171');
INSERT INTO `log` VALUES ('1967', '123', 'getStaffList', '1495780171');
INSERT INTO `log` VALUES ('1968', '123', 'getStaffList', '1495780171');
INSERT INTO `log` VALUES ('1969', '123', 'getStaffList', '1495780172');
INSERT INTO `log` VALUES ('1970', '123', 'getStaffList', '1495780281');
INSERT INTO `log` VALUES ('1971', '123', 'getStaffList', '1495780306');
INSERT INTO `log` VALUES ('1972', '123', 'getStaffList', '1495780331');
INSERT INTO `log` VALUES ('1973', '123', 'getStaffList', '1495780360');
INSERT INTO `log` VALUES ('1974', '123', 'getStaffList', '1495780522');
INSERT INTO `log` VALUES ('1975', '123', 'addStaff', '1495780536');
INSERT INTO `log` VALUES ('1976', '123', 'getStaffList', '1495780537');
INSERT INTO `log` VALUES ('1977', '123', 'getStaffList', '1495780922');
INSERT INTO `log` VALUES ('1978', '123', 'addStaff', '1495780936');
INSERT INTO `log` VALUES ('1979', '123', 'addStaff', '1495781004');
INSERT INTO `log` VALUES ('1980', '123', 'getStaffList', '1495781004');
INSERT INTO `log` VALUES ('1981', '123', 'getStaffList', '1495781091');
INSERT INTO `log` VALUES ('1982', '123', 'login', '1495781302');
INSERT INTO `log` VALUES ('1983', '123', 'getAllShareAuntList', '1495781308');
INSERT INTO `log` VALUES ('1984', '123', 'getAllShareEmployerList', '1495781309');
INSERT INTO `log` VALUES ('1985', '123', 'updateEmployerTracking', '1495781451');
INSERT INTO `log` VALUES ('1986', '123', 'getStaffList', '1495782088');
INSERT INTO `log` VALUES ('1987', '123', 'getSession', '1495782207');
INSERT INTO `log` VALUES ('1988', '123', 'login', '1495782304');
INSERT INTO `log` VALUES ('1989', '123', 'getAllShareAuntList', '1495782311');
INSERT INTO `log` VALUES ('1990', '123', 'getAllShareEmployerList', '1495782311');
INSERT INTO `log` VALUES ('1991', '123', 'updateEmployerTracking', '1495782336');
INSERT INTO `log` VALUES ('1992', '123', 'updateEmployerTracking', '1495782363');
INSERT INTO `log` VALUES ('1993', '123', 'updateEmployerTracking', '1495782754');
INSERT INTO `log` VALUES ('1994', '123', 'login', '1495782982');
INSERT INTO `log` VALUES ('1995', '123', 'getAllShareAuntList', '1495782989');
INSERT INTO `log` VALUES ('1996', '123', 'getAllShareEmployerList', '1495782990');
INSERT INTO `log` VALUES ('1997', '123', 'updateEmployerTracking', '1495783008');
INSERT INTO `log` VALUES ('1998', '123', 'login', '1495784817');
INSERT INTO `log` VALUES ('1999', '123', 'getAllShareAuntList', '1495784818');
INSERT INTO `log` VALUES ('2000', '123', 'getAllShareEmployerList', '1495784818');
INSERT INTO `log` VALUES ('2001', '123', 'getAllShareAuntList', '1495784824');
INSERT INTO `log` VALUES ('2002', '123', 'getAllShareEmployerList', '1495784824');
INSERT INTO `log` VALUES ('2003', '18124606495', 'login', '1495785007');
INSERT INTO `log` VALUES ('2004', '123', 'getSession', '1495785724');
INSERT INTO `log` VALUES ('2005', '123', 'getSession', '1495785747');
INSERT INTO `log` VALUES ('2006', '18124606495', 'getUnShareAuntList', '1495786002');
INSERT INTO `log` VALUES ('2007', '18124606495', 'getUnShareAuntList', '1495786035');
INSERT INTO `log` VALUES ('2008', '18124606495', 'getUnShareAuntList', '1495786061');
INSERT INTO `log` VALUES ('2009', '123', 'getStaffList', '1495786297');
INSERT INTO `log` VALUES ('2010', '123', 'addStaff', '1495786313');
INSERT INTO `log` VALUES ('2011', '123', 'getStaffList', '1495786313');
INSERT INTO `log` VALUES ('2012', '123', 'deleteStaff', '1495786343');
INSERT INTO `log` VALUES ('2013', '123', 'getStaffList', '1495786344');
INSERT INTO `log` VALUES ('2014', '123', 'getSession', '1495786383');
INSERT INTO `log` VALUES ('2015', '123', 'getSession', '1495786384');
INSERT INTO `log` VALUES ('2016', '123', 'getSession', '1495786386');
INSERT INTO `log` VALUES ('2017', '18124606495', 'getPactList', '1495786362');
INSERT INTO `log` VALUES ('2018', '123', 'getSession', '1495786466');
INSERT INTO `log` VALUES ('2019', '123', 'getStaffList', '1495786539');
INSERT INTO `log` VALUES ('2020', '123', 'deleteStaff', '1495786541');
INSERT INTO `log` VALUES ('2021', '123', 'getStaffList', '1495786541');
INSERT INTO `log` VALUES ('2022', '123', 'login', '1495786572');
INSERT INTO `log` VALUES ('2023', '123', 'getStaffList', '1495786593');
INSERT INTO `log` VALUES ('2024', '123', 'getStaffList', '1495786608');
INSERT INTO `log` VALUES ('2025', '123', 'deleteStaff', '1495786612');
INSERT INTO `log` VALUES ('2026', '123', 'getStaffList', '1495786613');
INSERT INTO `log` VALUES ('2027', '123', 'getStaffList', '1495786622');
INSERT INTO `log` VALUES ('2028', '123', 'updateEmployerTracking', '1495786571');
INSERT INTO `log` VALUES ('2029', '123', 'updateEmployerTracking', '1495786577');
INSERT INTO `log` VALUES ('2030', '123', 'getSession', '1495786624');
INSERT INTO `log` VALUES ('2031', '123', 'updateEmployerTracking', '1495786628');
INSERT INTO `log` VALUES ('2032', '18124606495', 'login', '1495786639');
INSERT INTO `log` VALUES ('2033', '18124606495', 'getUnShareAuntList', '1495786662');
INSERT INTO `log` VALUES ('2034', '123', 'updateEmployerTracking', '1495786866');
INSERT INTO `log` VALUES ('2035', '18124606495', 'getPactList', '1495786864');
INSERT INTO `log` VALUES ('2036', '18124606495', 'getUnShareAuntList', '1495786880');
INSERT INTO `log` VALUES ('2037', '18124606495', 'getPactList', '1495786896');
INSERT INTO `log` VALUES ('2038', '18124606495', 'getUnShareAuntList', '1495786918');
INSERT INTO `log` VALUES ('2039', '123', 'updateEmployerTracking', '1495787070');
INSERT INTO `log` VALUES ('2040', '123', 'updateEmployerTracking', '1495787129');
INSERT INTO `log` VALUES ('2041', '123', 'updateEmployerTracking', '1495787286');
INSERT INTO `log` VALUES ('2042', '123', 'updateEmployerTracking', '1495787371');
INSERT INTO `log` VALUES ('2043', '123', 'getSession', '1495787524');
INSERT INTO `log` VALUES ('2044', '123', 'updateEmployerTracking', '1495787647');
INSERT INTO `log` VALUES ('2045', '123', 'updateEmployerTracking', '1495787890');
INSERT INTO `log` VALUES ('2046', '123', 'getStaffList', '1495787982');
INSERT INTO `log` VALUES ('2047', '123', 'updateEmployerTracking', '1495787935');
INSERT INTO `log` VALUES ('2048', '123', 'addStaff', '1495787996');
INSERT INTO `log` VALUES ('2049', '123', 'getStaffList', '1495787996');
INSERT INTO `log` VALUES ('2050', '123', 'updateEmployerTracking', '1495787985');
INSERT INTO `log` VALUES ('2051', '123', 'updateEmployerTracking', '1495788039');
INSERT INTO `log` VALUES ('2052', '123', 'getStaffList', '1495788111');
INSERT INTO `log` VALUES ('2053', '123', 'updateEmployerTracking', '1495788171');
INSERT INTO `log` VALUES ('2054', '18124606495', 'login', '1495788663');
INSERT INTO `log` VALUES ('2055', '123', 'login', '1495788875');
INSERT INTO `log` VALUES ('2056', '123', 'login', '1495788881');
INSERT INTO `log` VALUES ('2057', '123', 'getAllShareAuntList', '1495788882');
INSERT INTO `log` VALUES ('2058', '123', 'getAllShareEmployerList', '1495788883');
INSERT INTO `log` VALUES ('2059', '123', 'getEmployerListByStatus', '1495788893');
INSERT INTO `log` VALUES ('2060', '123', 'getEmployerListByStatus', '1495788919');
INSERT INTO `log` VALUES ('2061', '123', 'getEmployerListByStatus', '1495788927');
INSERT INTO `log` VALUES ('2062', '18124606495', 'getUnShareAuntList', '1495789821');
INSERT INTO `log` VALUES ('2063', '123', 'login', '1495790420');
INSERT INTO `log` VALUES ('2064', '123', 'login', '1495790422');
INSERT INTO `log` VALUES ('2065', '123', 'getAllShareAuntList', '1495790429');
INSERT INTO `log` VALUES ('2066', '123', 'getAllShareEmployerList', '1495790430');
INSERT INTO `log` VALUES ('2067', '123', 'updateEmployerTracking', '1495790440');
INSERT INTO `log` VALUES ('2068', '123', 'updateEmployerTracking', '1495790502');
INSERT INTO `log` VALUES ('2069', '123', 'login', '1495790572');
INSERT INTO `log` VALUES ('2070', '123', 'getAllShareAuntList', '1495790575');
INSERT INTO `log` VALUES ('2071', '123', 'getAllShareEmployerList', '1495790575');
INSERT INTO `log` VALUES ('2072', '123', 'updateEmployerTracking', '1495790581');
INSERT INTO `log` VALUES ('2073', '123', 'updateEmployerTracking', '1495790635');
INSERT INTO `log` VALUES ('2074', '123', 'updateEmployerTracking', '1495790682');
INSERT INTO `log` VALUES ('2075', '18124606495', 'login', '1495790674');
INSERT INTO `log` VALUES ('2076', '18124606495', 'getAuntList', '1495792657');
INSERT INTO `log` VALUES ('2077', '18124606495', 'getLanguageList', '1495792657');
INSERT INTO `log` VALUES ('2078', '18124606495', 'getCookingList', '1495792657');
INSERT INTO `log` VALUES ('2079', '18124606495', 'getSkillList', '1495792657');
INSERT INTO `log` VALUES ('2080', '18124606495', 'getApplianceList', '1495792657');
INSERT INTO `log` VALUES ('2081', '18124606495', 'getJobList', '1495792657');
INSERT INTO `log` VALUES ('2082', '18124606495', 'getCertificateList', '1495792657');
INSERT INTO `log` VALUES ('2083', '18124606495', 'login', '1495794790');
INSERT INTO `log` VALUES ('2084', '18124606495', 'getUnShareAuntList', '1495794792');
INSERT INTO `log` VALUES ('2085', '18124606495', 'addShareEmployer', '1495794944');
INSERT INTO `log` VALUES ('2086', '18124606495', 'getUnShareAuntList', '1495794946');
INSERT INTO `log` VALUES ('2087', '18124606495', 'getAuntList', '1495794995');
INSERT INTO `log` VALUES ('2088', '18124606495', 'getLanguageList', '1495794995');
INSERT INTO `log` VALUES ('2089', '18124606495', 'getCookingList', '1495794995');
INSERT INTO `log` VALUES ('2090', '18124606495', 'getSkillList', '1495794995');
INSERT INTO `log` VALUES ('2091', '18124606495', 'getApplianceList', '1495794995');
INSERT INTO `log` VALUES ('2092', '18124606495', 'getJobList', '1495794996');
INSERT INTO `log` VALUES ('2093', '18124606495', 'getCertificateList', '1495794996');
INSERT INTO `log` VALUES ('2094', '18124606495', 'login', '1495796325');
INSERT INTO `log` VALUES ('2095', '123', 'login', '1495797088');
INSERT INTO `log` VALUES ('2096', '123', 'getAllShareAuntList', '1495797093');
INSERT INTO `log` VALUES ('2097', '123', 'getAllShareEmployerList', '1495797093');
INSERT INTO `log` VALUES ('2098', '123', 'getEmployerTrackingByid', '1495797142');
INSERT INTO `log` VALUES ('2099', '123', 'getEmployerTrackingByid', '1495797155');
INSERT INTO `log` VALUES ('2100', '123', 'getEmployerTrackingByid', '1495797158');
INSERT INTO `log` VALUES ('2101', '123', 'getEmployerTrackingByid', '1495797170');
INSERT INTO `log` VALUES ('2102', '123', 'login', '1495797218');
INSERT INTO `log` VALUES ('2103', '123', 'getAllShareAuntList', '1495797227');
INSERT INTO `log` VALUES ('2104', '123', 'getAllShareEmployerList', '1495797228');
INSERT INTO `log` VALUES ('2105', '123', 'getEmployerTrackingByid', '1495797252');
INSERT INTO `log` VALUES ('2106', '123', 'login', '1495797419');
INSERT INTO `log` VALUES ('2107', '123', 'getAllShareAuntList', '1495797423');
INSERT INTO `log` VALUES ('2108', '123', 'getAllShareEmployerList', '1495797424');
INSERT INTO `log` VALUES ('2109', '123', 'getEmployerTrackingByemployerId', '1495797426');
INSERT INTO `log` VALUES ('2110', '123', 'getEmployerTrackingByemployerId', '1495797585');
INSERT INTO `log` VALUES ('2111', '123', 'login', '1495797593');
INSERT INTO `log` VALUES ('2112', '123', 'getAllShareAuntList', '1495797593');
INSERT INTO `log` VALUES ('2113', '123', 'getAllShareEmployerList', '1495797594');
INSERT INTO `log` VALUES ('2114', '123', 'getEmployerTrackingByemployerId', '1495797596');
INSERT INTO `log` VALUES ('2115', '123', 'getEmployerTrackingByemployerId', '1495797599');
INSERT INTO `log` VALUES ('2116', '123', 'getEmployerTrackingByemployerId', '1495797601');
INSERT INTO `log` VALUES ('2117', '123', 'getEmployerTrackingByemployerId', '1495797601');
INSERT INTO `log` VALUES ('2118', '123', 'login', '1495797676');
INSERT INTO `log` VALUES ('2119', '123', 'login', '1495797680');
INSERT INTO `log` VALUES ('2120', '123', 'getAllShareAuntList', '1495797681');
INSERT INTO `log` VALUES ('2121', '123', 'getAllShareEmployerList', '1495797681');
INSERT INTO `log` VALUES ('2122', '123', 'getEmployerTrackingByemployerId', '1495797684');
INSERT INTO `log` VALUES ('2123', '123', 'getEmployerTrackingByemployerId', '1495797692');
INSERT INTO `log` VALUES ('2124', '123', 'login', '1495797746');
INSERT INTO `log` VALUES ('2125', '123', 'getAllShareAuntList', '1495797750');
INSERT INTO `log` VALUES ('2126', '123', 'getAllShareEmployerList', '1495797750');
INSERT INTO `log` VALUES ('2127', '123', 'getEmployerTrackingByemployerId', '1495797755');
INSERT INTO `log` VALUES ('2128', '123', 'getEmployerTrackingByemployerId', '1495797759');
INSERT INTO `log` VALUES ('2129', '123', 'getEmployerTrackingByemployerId', '1495797769');
INSERT INTO `log` VALUES ('2130', '123', 'getEmployerTrackingByemployerId', '1495797779');
INSERT INTO `log` VALUES ('2131', '123', 'login', '1495797897');
INSERT INTO `log` VALUES ('2132', '123', 'getAllShareAuntList', '1495797901');
INSERT INTO `log` VALUES ('2133', '123', 'getAllShareEmployerList', '1495797901');
INSERT INTO `log` VALUES ('2134', '123', 'getEmployerTrackingByemployerId', '1495797903');
INSERT INTO `log` VALUES ('2135', '123', 'getEmployerTrackingByemployerId', '1495797905');
INSERT INTO `log` VALUES ('2136', '123', 'login', '1495797935');
INSERT INTO `log` VALUES ('2137', '123', 'login', '1495797941');
INSERT INTO `log` VALUES ('2138', '123', 'login', '1495797938');
INSERT INTO `log` VALUES ('2139', '123', 'getAllShareAuntList', '1495797942');
INSERT INTO `log` VALUES ('2140', '123', 'getAllShareEmployerList', '1495797943');
INSERT INTO `log` VALUES ('2141', '123', 'getEmployerTrackingByemployerId', '1495797947');
INSERT INTO `log` VALUES ('2142', '123', 'login', '1495797996');
INSERT INTO `log` VALUES ('2143', '123', 'getAllShareAuntList', '1495798000');
INSERT INTO `log` VALUES ('2144', '123', 'getAllShareEmployerList', '1495798000');
INSERT INTO `log` VALUES ('2145', '123', 'getEmployerTrackingByemployerId', '1495798003');
INSERT INTO `log` VALUES ('2146', '123', 'getSession', '1495798900');
INSERT INTO `log` VALUES ('2147', '123', 'getPactListByStatus', '1495799128');
INSERT INTO `log` VALUES ('2148', '123', 'getPactListByStatus', '1495799134');
INSERT INTO `log` VALUES ('2149', '123', 'getPactListByStatus', '1495799143');
INSERT INTO `log` VALUES ('2150', '123', 'getPactListByStatus', '1495799149');
INSERT INTO `log` VALUES ('2151', '123', 'getPactListByStatus', '1495799155');
INSERT INTO `log` VALUES ('2152', '123', 'getPactListByStatus', '1495799160');
INSERT INTO `log` VALUES ('2153', '123', 'getPactListByStatus', '1495799181');
INSERT INTO `log` VALUES ('2154', '123', 'getSession', '1495799800');
INSERT INTO `log` VALUES ('2155', '18124606495', 'login', '1495845689');
INSERT INTO `log` VALUES ('2156', '18124606495', 'getAuntList', '1495845741');
INSERT INTO `log` VALUES ('2157', '18124606495', 'getLanguageList', '1495845742');
INSERT INTO `log` VALUES ('2158', '18124606495', 'getCookingList', '1495845742');
INSERT INTO `log` VALUES ('2159', '18124606495', 'getSkillList', '1495845742');
INSERT INTO `log` VALUES ('2160', '18124606495', 'getApplianceList', '1495845742');
INSERT INTO `log` VALUES ('2161', '18124606495', 'getJobList', '1495845742');
INSERT INTO `log` VALUES ('2162', '18124606495', 'getCertificateList', '1495845742');
INSERT INTO `log` VALUES ('2163', '18124606495', 'getPactList', '1495845747');
INSERT INTO `log` VALUES ('2164', '18124606495', 'getShareEmployerList', '1495845751');
INSERT INTO `log` VALUES ('2165', '18124606495', 'getShareAuntList', '1495845752');
INSERT INTO `log` VALUES ('2166', '18124606495', 'getUnShareAuntList', '1495845752');
INSERT INTO `log` VALUES ('2167', '18124606495', 'getAuntList', '1495845779');
INSERT INTO `log` VALUES ('2168', '18124606495', 'getLanguageList', '1495845780');
INSERT INTO `log` VALUES ('2169', '18124606495', 'getCookingList', '1495845780');
INSERT INTO `log` VALUES ('2170', '18124606495', 'getSkillList', '1495845780');
INSERT INTO `log` VALUES ('2171', '18124606495', 'getApplianceList', '1495845780');
INSERT INTO `log` VALUES ('2172', '18124606495', 'getJobList', '1495845780');
INSERT INTO `log` VALUES ('2173', '18124606495', 'getCertificateList', '1495845780');
INSERT INTO `log` VALUES ('2174', '18124606495', 'getAuntList', '1495845805');
INSERT INTO `log` VALUES ('2175', '18124606495', 'getLanguageList', '1495845805');
INSERT INTO `log` VALUES ('2176', '18124606495', 'getCookingList', '1495845805');
INSERT INTO `log` VALUES ('2177', '18124606495', 'getSkillList', '1495845805');
INSERT INTO `log` VALUES ('2178', '18124606495', 'getApplianceList', '1495845805');
INSERT INTO `log` VALUES ('2179', '18124606495', 'getJobList', '1495845805');
INSERT INTO `log` VALUES ('2180', '18124606495', 'getCertificateList', '1495845806');
INSERT INTO `log` VALUES ('2181', '18124606495', 'getAuntList', '1495845809');
INSERT INTO `log` VALUES ('2182', '18124606495', 'getLanguageList', '1495845809');
INSERT INTO `log` VALUES ('2183', '18124606495', 'getCookingList', '1495845809');
INSERT INTO `log` VALUES ('2184', '18124606495', 'getSkillList', '1495845809');
INSERT INTO `log` VALUES ('2185', '18124606495', 'getApplianceList', '1495845809');
INSERT INTO `log` VALUES ('2186', '18124606495', 'getJobList', '1495845809');
INSERT INTO `log` VALUES ('2187', '18124606495', 'getCertificateList', '1495845809');
INSERT INTO `log` VALUES ('2188', '18124606495', 'getAuntList', '1495845813');
INSERT INTO `log` VALUES ('2189', '18124606495', 'getLanguageList', '1495845813');
INSERT INTO `log` VALUES ('2190', '18124606495', 'getCookingList', '1495845813');
INSERT INTO `log` VALUES ('2191', '18124606495', 'getSkillList', '1495845813');
INSERT INTO `log` VALUES ('2192', '18124606495', 'getApplianceList', '1495845813');
INSERT INTO `log` VALUES ('2193', '18124606495', 'getJobList', '1495845813');
INSERT INTO `log` VALUES ('2194', '18124606495', 'getCertificateList', '1495845813');
INSERT INTO `log` VALUES ('2195', '123', 'login', '1495849943');
INSERT INTO `log` VALUES ('2196', '123', 'login', '1495852901');
INSERT INTO `log` VALUES ('2197', '123', 'login', '1495853463');
INSERT INTO `log` VALUES ('2198', '123', 'getAuntList', '1495853475');
INSERT INTO `log` VALUES ('2199', '123', 'getLanguageList', '1495853475');
INSERT INTO `log` VALUES ('2200', '123', 'getCookingList', '1495853475');
INSERT INTO `log` VALUES ('2201', '123', 'getSkillList', '1495853475');
INSERT INTO `log` VALUES ('2202', '123', 'getApplianceList', '1495853476');
INSERT INTO `log` VALUES ('2203', '123', 'getJobList', '1495853476');
INSERT INTO `log` VALUES ('2204', '123', 'getCertificateList', '1495853476');
INSERT INTO `log` VALUES ('2205', '123', 'getAuntList', '1495853478');
INSERT INTO `log` VALUES ('2206', '123', 'getLanguageList', '1495853478');
INSERT INTO `log` VALUES ('2207', '123', 'getCookingList', '1495853479');
INSERT INTO `log` VALUES ('2208', '123', 'getSkillList', '1495853479');
INSERT INTO `log` VALUES ('2209', '123', 'getApplianceList', '1495853479');
INSERT INTO `log` VALUES ('2210', '123', 'getJobList', '1495853479');
INSERT INTO `log` VALUES ('2211', '123', 'getCertificateList', '1495853479');
INSERT INTO `log` VALUES ('2212', '123', 'getAuntList', '1495853481');
INSERT INTO `log` VALUES ('2213', '123', 'getLanguageList', '1495853481');
INSERT INTO `log` VALUES ('2214', '123', 'getCookingList', '1495853481');
INSERT INTO `log` VALUES ('2215', '123', 'getSkillList', '1495853482');
INSERT INTO `log` VALUES ('2216', '123', 'getApplianceList', '1495853482');
INSERT INTO `log` VALUES ('2217', '123', 'getJobList', '1495853482');
INSERT INTO `log` VALUES ('2218', '123', 'getCertificateList', '1495853482');
INSERT INTO `log` VALUES ('2219', '123', 'getAuntList', '1495853525');
INSERT INTO `log` VALUES ('2220', '123', 'getLanguageList', '1495853525');
INSERT INTO `log` VALUES ('2221', '123', 'getCookingList', '1495853526');
INSERT INTO `log` VALUES ('2222', '123', 'getSkillList', '1495853526');
INSERT INTO `log` VALUES ('2223', '123', 'getApplianceList', '1495853526');
INSERT INTO `log` VALUES ('2224', '123', 'getJobList', '1495853526');
INSERT INTO `log` VALUES ('2225', '123', 'getCertificateList', '1495853526');
INSERT INTO `log` VALUES ('2226', '123', 'getAuntList', '1495853534');
INSERT INTO `log` VALUES ('2227', '123', 'getLanguageList', '1495853534');
INSERT INTO `log` VALUES ('2228', '123', 'getCookingList', '1495853534');
INSERT INTO `log` VALUES ('2229', '123', 'getSkillList', '1495853534');
INSERT INTO `log` VALUES ('2230', '123', 'getApplianceList', '1495853534');
INSERT INTO `log` VALUES ('2231', '123', 'getJobList', '1495853534');
INSERT INTO `log` VALUES ('2232', '123', 'getCertificateList', '1495853534');
INSERT INTO `log` VALUES ('2233', '123', 'getAuntList', '1495853539');
INSERT INTO `log` VALUES ('2234', '123', 'login', '1495853530');
INSERT INTO `log` VALUES ('2235', '123', 'login', '1495853718');
INSERT INTO `log` VALUES ('2236', '123', 'getAuntList', '1495853805');
INSERT INTO `log` VALUES ('2237', '123', 'getLanguageList', '1495853805');
INSERT INTO `log` VALUES ('2238', '123', 'getCookingList', '1495853805');
INSERT INTO `log` VALUES ('2239', '123', 'getSkillList', '1495853805');
INSERT INTO `log` VALUES ('2240', '123', 'getApplianceList', '1495853805');
INSERT INTO `log` VALUES ('2241', '123', 'getJobList', '1495853806');
INSERT INTO `log` VALUES ('2242', '123', 'getCertificateList', '1495853806');
INSERT INTO `log` VALUES ('2243', '123', 'getAuntList', '1495853828');
INSERT INTO `log` VALUES ('2244', '123', 'getLanguageList', '1495853828');
INSERT INTO `log` VALUES ('2245', '123', 'getCookingList', '1495853828');
INSERT INTO `log` VALUES ('2246', '123', 'getSkillList', '1495853828');
INSERT INTO `log` VALUES ('2247', '123', 'getApplianceList', '1495853828');
INSERT INTO `log` VALUES ('2248', '123', 'getJobList', '1495853828');
INSERT INTO `log` VALUES ('2249', '123', 'getCertificateList', '1495853829');
INSERT INTO `log` VALUES ('2250', '123', 'getShareEmployerList', '1495853837');
INSERT INTO `log` VALUES ('2251', '123', 'getShareAuntList', '1495853838');
INSERT INTO `log` VALUES ('2252', '123', 'getUnShareAuntList', '1495853838');
INSERT INTO `log` VALUES ('2253', '123', 'login', '1495855148');
INSERT INTO `log` VALUES ('2254', '123', 'login', '1495855659');
INSERT INTO `log` VALUES ('2255', '123', 'login', '1495856085');
INSERT INTO `log` VALUES ('2256', '123', 'deleteStaff', '1495856089');
INSERT INTO `log` VALUES ('2257', '123', 'addStaff', '1495856091');
INSERT INTO `log` VALUES ('2258', '123', 'deleteStaff', '1495856095');
INSERT INTO `log` VALUES ('2259', '123', 'deleteStaff', '1495856096');
INSERT INTO `log` VALUES ('2260', '123', 'sLogin', '1495856122');
INSERT INTO `log` VALUES ('2261', '2', 'sLogin', '1495856336');
INSERT INTO `log` VALUES ('2262', '123', 'login', '1495856358');
INSERT INTO `log` VALUES ('2263', '123', 'getAuntList', '1495856500');
INSERT INTO `log` VALUES ('2264', '123', 'getLanguageList', '1495856500');
INSERT INTO `log` VALUES ('2265', '123', 'getCookingList', '1495856500');
INSERT INTO `log` VALUES ('2266', '123', 'getSkillList', '1495856500');
INSERT INTO `log` VALUES ('2267', '123', 'getApplianceList', '1495856500');
INSERT INTO `log` VALUES ('2268', '123', 'getJobList', '1495856500');
INSERT INTO `log` VALUES ('2269', '123', 'getCertificateList', '1495856500');
INSERT INTO `log` VALUES ('2270', '123', 'addStaff', '1495856831');
INSERT INTO `log` VALUES ('2271', '123', 'addStaff', '1495856837');
INSERT INTO `log` VALUES ('2272', '2', 'sLogin', '1495857526');
INSERT INTO `log` VALUES ('2273', '232', 'sLogin', '1495864287');
INSERT INTO `log` VALUES ('2274', '123', 'login', '1495865655');
INSERT INTO `log` VALUES ('2275', '123', 'getAllShareAuntList', '1495865659');
INSERT INTO `log` VALUES ('2276', '123', 'getAllShareEmployerList', '1495865659');
INSERT INTO `log` VALUES ('2277', '123', 'getSession', '1495865669');
INSERT INTO `log` VALUES ('2278', '123', 'login', '1495868933');
INSERT INTO `log` VALUES ('2279', '123', 'addStaff', '1495869257');
INSERT INTO `log` VALUES ('2280', '123', 'addStaff', '1495869260');
INSERT INTO `log` VALUES ('2281', '123', 'addStaff', '1495869275');
INSERT INTO `log` VALUES ('2282', '123', 'login', '1495869421');
INSERT INTO `log` VALUES ('2283', '123', 'addStaff', '1495869424');
INSERT INTO `log` VALUES ('2284', '123', 'addStaff', '1495869427');
INSERT INTO `log` VALUES ('2285', '123', 'login', '1495869485');
INSERT INTO `log` VALUES ('2286', '123', 'addStaff', '1495869495');
INSERT INTO `log` VALUES ('2287', '123', 'addStaff', '1495869497');
INSERT INTO `log` VALUES ('2288', '123', 'addStaff', '1495869501');
INSERT INTO `log` VALUES ('2289', '123', 'addStaff', '1495869503');
INSERT INTO `log` VALUES ('2290', '123', 'addStaff', '1495869506');
INSERT INTO `log` VALUES ('2291', '123', 'deleteStaff', '1495874298');
INSERT INTO `log` VALUES ('2292', '123', 'login', '1495874434');
INSERT INTO `log` VALUES ('2293', '123', 'deleteStaff', '1495874440');
INSERT INTO `log` VALUES ('2294', '123', 'deleteStaff', '1495874452');
INSERT INTO `log` VALUES ('2295', '123', 'login', '1495874591');
INSERT INTO `log` VALUES ('2296', '123', 'deleteStaff', '1495874609');
INSERT INTO `log` VALUES ('2297', '123', 'deleteStaff', '1495874636');
INSERT INTO `log` VALUES ('2298', '123', 'deleteStaff', '1495874645');
INSERT INTO `log` VALUES ('2299', '123', 'login', '1495874670');
INSERT INTO `log` VALUES ('2300', '123', 'deleteStaff', '1495874674');
INSERT INTO `log` VALUES ('2301', '123', 'login', '1495874992');
INSERT INTO `log` VALUES ('2302', '123', 'login', '1495875107');
INSERT INTO `log` VALUES ('2303', '123', 'addStaff', '1495875112');
INSERT INTO `log` VALUES ('2304', '123', 'deleteStaff', '1495875117');
INSERT INTO `log` VALUES ('2305', '123', 'addStaff', '1495875139');
INSERT INTO `log` VALUES ('2306', '123', 'deleteStaff', '1495875178');
INSERT INTO `log` VALUES ('2307', '123', 'login', '1495875343');
INSERT INTO `log` VALUES ('2308', '123', 'addStaff', '1495875357');
INSERT INTO `log` VALUES ('2309', '123', 'deleteStaff', '1495875365');
INSERT INTO `log` VALUES ('2310', '123', 'login', '1495875400');
INSERT INTO `log` VALUES ('2311', '123', 'addStaff', '1495875405');
INSERT INTO `log` VALUES ('2312', '123', 'addStaff', '1495875409');
INSERT INTO `log` VALUES ('2313', '123', 'deleteStaff', '1495875418');
INSERT INTO `log` VALUES ('2314', '2', 'sLogin', '1495876012');
INSERT INTO `log` VALUES ('2315', '2', 'sLogin', '1495876022');
INSERT INTO `log` VALUES ('2316', '123', 'login', '1495876236');
INSERT INTO `log` VALUES ('2317', '123', 'getAllShareAuntList', '1495876240');
INSERT INTO `log` VALUES ('2318', '123', 'getAllShareEmployerList', '1495876241');
INSERT INTO `log` VALUES ('2319', '123', 'addHelp', '1495876252');
INSERT INTO `log` VALUES ('2320', '123', 'login', '1495881745');
INSERT INTO `log` VALUES ('2321', '123', 'getAllShareAuntList', '1495881749');
INSERT INTO `log` VALUES ('2322', '123', 'getAllShareEmployerList', '1495881749');
INSERT INTO `log` VALUES ('2323', '123', 'addHelp', '1495881760');
INSERT INTO `log` VALUES ('2324', '123', 'addHelp', '1495881770');
INSERT INTO `log` VALUES ('2325', '123', 'login', '1495882091');
INSERT INTO `log` VALUES ('2326', '2', 'sLogin', '1495882324');
INSERT INTO `log` VALUES ('2327', '123', 'login', '1495882447');
INSERT INTO `log` VALUES ('2328', '123', 'getAuntList', '1495882619');
INSERT INTO `log` VALUES ('2329', '123', 'getLanguageList', '1495882619');
INSERT INTO `log` VALUES ('2330', '123', 'getCookingList', '1495882619');
INSERT INTO `log` VALUES ('2331', '123', 'getSkillList', '1495882619');
INSERT INTO `log` VALUES ('2332', '123', 'getApplianceList', '1495882619');
INSERT INTO `log` VALUES ('2333', '123', 'getJobList', '1495882619');
INSERT INTO `log` VALUES ('2334', '123', 'getCertificateList', '1495882620');
INSERT INTO `log` VALUES ('2335', '123', 'getAuntList', '1495882625');
INSERT INTO `log` VALUES ('2336', '123', 'getLanguageList', '1495882625');
INSERT INTO `log` VALUES ('2337', '123', 'getCookingList', '1495882625');
INSERT INTO `log` VALUES ('2338', '123', 'getSkillList', '1495882625');
INSERT INTO `log` VALUES ('2339', '123', 'getApplianceList', '1495882626');
INSERT INTO `log` VALUES ('2340', '123', 'getJobList', '1495882626');
INSERT INTO `log` VALUES ('2341', '123', 'getCertificateList', '1495882626');
INSERT INTO `log` VALUES ('2342', '123', 'getAuntList', '1495882628');
INSERT INTO `log` VALUES ('2343', '123', 'getLanguageList', '1495882629');
INSERT INTO `log` VALUES ('2344', '123', 'getCookingList', '1495882629');
INSERT INTO `log` VALUES ('2345', '123', 'getSkillList', '1495882629');
INSERT INTO `log` VALUES ('2346', '123', 'getApplianceList', '1495882629');
INSERT INTO `log` VALUES ('2347', '123', 'getJobList', '1495882629');
INSERT INTO `log` VALUES ('2348', '123', 'getCertificateList', '1495882629');
INSERT INTO `log` VALUES ('2349', '123', 'login', '1495883461');
INSERT INTO `log` VALUES ('2350', '123', 'getAllShareAuntList', '1495883466');
INSERT INTO `log` VALUES ('2351', '123', 'getAllShareEmployerList', '1495883466');
INSERT INTO `log` VALUES ('2352', '123', 'addHelp', '1495883533');
INSERT INTO `log` VALUES ('2353', '123', 'deleteHelp', '1495884528');
INSERT INTO `log` VALUES ('2354', '123', 'updateHelpStatus', '1495884835');
INSERT INTO `log` VALUES ('2355', '123', 'login', '1495885365');
INSERT INTO `log` VALUES ('2356', '123', 'getAllShareAuntList', '1495885370');
INSERT INTO `log` VALUES ('2357', '123', 'getAllShareEmployerList', '1495885370');
INSERT INTO `log` VALUES ('2358', '123', 'getAllHelpListByStatus', '1495885405');
INSERT INTO `log` VALUES ('2359', '123', 'getHelpListByStatus', '1495885442');
INSERT INTO `log` VALUES ('2360', '123', 'login', '1496192035');
INSERT INTO `log` VALUES ('2361', '123', 'login', '1496193219');
INSERT INTO `log` VALUES ('2362', '123', 'getAllShareAuntList', '1496193224');
INSERT INTO `log` VALUES ('2363', '123', 'getAllShareEmployerList', '1496193224');
INSERT INTO `log` VALUES ('2364', '123', 'getAllHelpListByStatus', '1496193229');
INSERT INTO `log` VALUES ('2365', '123', 'getHelpListByStatus', '1496193256');
INSERT INTO `log` VALUES ('2366', '123', 'getHelpListByStatus', '1496193302');
INSERT INTO `log` VALUES ('2367', '123', 'login', '1496193361');
INSERT INTO `log` VALUES ('2368', '123', 'getAllShareAuntList', '1496193365');
INSERT INTO `log` VALUES ('2369', '123', 'getAllShareEmployerList', '1496193365');
INSERT INTO `log` VALUES ('2370', '123', 'getHelpListByStatus', '1496193375');
INSERT INTO `log` VALUES ('2371', '123', 'login', '1496193560');
INSERT INTO `log` VALUES ('2372', '123', 'getAllShareAuntList', '1496193564');
INSERT INTO `log` VALUES ('2373', '123', 'getAllShareEmployerList', '1496193565');
INSERT INTO `log` VALUES ('2374', '123', 'getHelpListByStatus', '1496193692');
INSERT INTO `log` VALUES ('2375', '123', 'getHelpListByStatus', '1496193723');
INSERT INTO `log` VALUES ('2376', '123', 'login', '1496194259');
INSERT INTO `log` VALUES ('2377', '123', 'getAllShareAuntList', '1496194263');
INSERT INTO `log` VALUES ('2378', '123', 'getAllShareEmployerList', '1496194263');
INSERT INTO `log` VALUES ('2379', '123', 'getHelpListByStatus', '1496194270');
INSERT INTO `log` VALUES ('2380', '123', 'getHelpListByStatus', '1496194280');
INSERT INTO `log` VALUES ('2381', '123', 'getAllHelpListByStatus', '1496194313');
INSERT INTO `log` VALUES ('2382', '123', 'getAllHelpListByStatus', '1496194324');
INSERT INTO `log` VALUES ('2383', '123', 'login', '1496194481');
INSERT INTO `log` VALUES ('2384', '123', 'getAllShareAuntList', '1496194485');
INSERT INTO `log` VALUES ('2385', '123', 'getAllShareEmployerList', '1496194485');
INSERT INTO `log` VALUES ('2386', '123', 'getAllHelpListByStatus', '1496194491');
INSERT INTO `log` VALUES ('2387', '123', 'getHelpByIdentifier', '1496194653');
INSERT INTO `log` VALUES ('2388', '123', 'getHelpByIdentifier', '1496194679');
INSERT INTO `log` VALUES ('2389', '123', 'login', '1496194732');
INSERT INTO `log` VALUES ('2390', '123', 'getAllShareAuntList', '1496194739');
INSERT INTO `log` VALUES ('2391', '123', 'getAllShareEmployerList', '1496194740');
INSERT INTO `log` VALUES ('2392', '123', 'getHelpByIdentifier', '1496194745');
INSERT INTO `log` VALUES ('2393', '123', 'login', '1496194777');
INSERT INTO `log` VALUES ('2394', '123', 'getAllShareAuntList', '1496194785');
INSERT INTO `log` VALUES ('2395', '123', 'getAllShareEmployerList', '1496194785');
INSERT INTO `log` VALUES ('2396', '123', 'getHelpByIdentifier', '1496194791');
INSERT INTO `log` VALUES ('2397', '123', 'login', '1496197072');
INSERT INTO `log` VALUES ('2398', '123', 'getAllShareAuntList', '1496197079');
INSERT INTO `log` VALUES ('2399', '123', 'getAllShareEmployerList', '1496197080');
INSERT INTO `log` VALUES ('2400', '123', 'getAllHelpListByStatus', '1496197100');
INSERT INTO `log` VALUES ('2401', '123', 'getAllHelpListByStatus', '1496197108');
INSERT INTO `log` VALUES ('2402', '123', 'getHelpListByStatus', '1496197200');
INSERT INTO `log` VALUES ('2403', '123', 'login', '1496200979');
INSERT INTO `log` VALUES ('2404', '123', 'login', '1496200975');
INSERT INTO `log` VALUES ('2405', '123', 'getAllShareAuntList', '1496200982');
INSERT INTO `log` VALUES ('2406', '123', 'getAllShareEmployerList', '1496200982');
INSERT INTO `log` VALUES ('2407', '123', 'getSession', '1496200989');
INSERT INTO `log` VALUES ('2408', '123', 'login', '1496202054');
INSERT INTO `log` VALUES ('2409', '123', 'login', '1496210817');
INSERT INTO `log` VALUES ('2410', '123', 'addOrder', '1496210823');
INSERT INTO `log` VALUES ('2411', '123', 'getOrderList', '1496211444');
INSERT INTO `log` VALUES ('2412', '123', 'login', '1496211837');
INSERT INTO `log` VALUES ('2413', '123', 'getOrderList', '1496211842');
INSERT INTO `log` VALUES ('2414', '123', 'getOrderList', '1496213178');
INSERT INTO `log` VALUES ('2415', '123', 'login', '1496216428');
INSERT INTO `log` VALUES ('2416', '123', 'getTraineeList', '1496216457');
INSERT INTO `log` VALUES ('2417', '123', 'getTraineeList', '1496216480');
INSERT INTO `log` VALUES ('2418', '123', 'getTraineeList', '1496216487');
INSERT INTO `log` VALUES ('2419', '123', 'login', '1496216594');
INSERT INTO `log` VALUES ('2420', '123', 'getTraineeList', '1496216598');
INSERT INTO `log` VALUES ('2421', '123', 'login', '1496216709');
INSERT INTO `log` VALUES ('2422', '123', 'getTraineeList', '1496216713');
INSERT INTO `log` VALUES ('2423', '123', 'login', '1496216768');
INSERT INTO `log` VALUES ('2424', '123', 'getTraineeList', '1496216774');
INSERT INTO `log` VALUES ('2425', '123', 'login', '1496217046');
INSERT INTO `log` VALUES ('2426', '123', 'getTraineeList', '1496217048');
INSERT INTO `log` VALUES ('2427', '123', 'login', '1496217280');
INSERT INTO `log` VALUES ('2428', '123', 'getTraineeList', '1496217284');
INSERT INTO `log` VALUES ('2429', '123', 'getTraineeList', '1496217304');
INSERT INTO `log` VALUES ('2430', '123', 'login', '1496217417');
INSERT INTO `log` VALUES ('2431', '123', 'getTraineeList', '1496217421');
INSERT INTO `log` VALUES ('2432', '123', 'getTraineeList', '1496217426');
INSERT INTO `log` VALUES ('2433', '123', 'getOrderList', '1496217450');
INSERT INTO `log` VALUES ('2434', '123', 'getOrderList', '1496217976');
INSERT INTO `log` VALUES ('2435', '123', 'getTraineeListByOrderId', '1496217980');
INSERT INTO `log` VALUES ('2436', '123', 'getTraineeListByOrderId', '1496217983');
INSERT INTO `log` VALUES ('2437', '123', 'addTrainee', '1496218039');
INSERT INTO `log` VALUES ('2438', '123', 'addOrder', '1496218288');
INSERT INTO `log` VALUES ('2439', '123', 'getOrderList', '1496218288');
INSERT INTO `log` VALUES ('2440', '123', 'deleteOrder', '1496218314');
INSERT INTO `log` VALUES ('2441', '123', 'login', '1496218628');
INSERT INTO `log` VALUES ('2442', '123', 'getOrderList', '1496218631');
INSERT INTO `log` VALUES ('2443', '123', 'login', '1496218668');
INSERT INTO `log` VALUES ('2444', '123', 'getOrderList', '1496218674');
INSERT INTO `log` VALUES ('2445', '123', 'getOrderList', '1496218681');
INSERT INTO `log` VALUES ('2446', '123', 'getOrderList', '1496218696');
INSERT INTO `log` VALUES ('2447', '123', 'login', '1496218819');
INSERT INTO `log` VALUES ('2448', '123', 'getOrderList', '1496218822');
INSERT INTO `log` VALUES ('2449', '123', 'getOrderList', '1496218832');
INSERT INTO `log` VALUES ('2450', '123', 'getOrderList', '1496218912');
INSERT INTO `log` VALUES ('2451', '123', 'getOrderList', '1496218917');
INSERT INTO `log` VALUES ('2452', '123', 'getTraineeListByOrderId', '1496218921');
INSERT INTO `log` VALUES ('2453', '123', 'getOrderList', '1496219005');
INSERT INTO `log` VALUES ('2454', '123', 'getTraineeListByOrderId', '1496219006');
INSERT INTO `log` VALUES ('2455', '123', 'getTraineeListByOrderId', '1496219008');
INSERT INTO `log` VALUES ('2456', '123', 'getTraineeListByOrderId', '1496219011');
INSERT INTO `log` VALUES ('2457', '123', 'getTraineeListByOrderId', '1496219029');
INSERT INTO `log` VALUES ('2458', '123', 'getTraineeListByOrderId', '1496219031');
INSERT INTO `log` VALUES ('2459', '123', 'getOrderList', '1496219438');
INSERT INTO `log` VALUES ('2460', '123', 'getTraineeListByOrderId', '1496219439');
INSERT INTO `log` VALUES ('2461', '123', 'getTraineeListByOrderId', '1496219440');
INSERT INTO `log` VALUES ('2462', '123', 'getTraineeListByOrderId', '1496219442');
INSERT INTO `log` VALUES ('2463', '123', 'getTraineeListByOrderId', '1496219444');
INSERT INTO `log` VALUES ('2464', '123', 'getTraineeListByOrderId', '1496219446');
INSERT INTO `log` VALUES ('2465', '123', 'commitOrder', '1496219451');
INSERT INTO `log` VALUES ('2466', '123', 'getOrderList', '1496219453');
INSERT INTO `log` VALUES ('2467', '123', 'getOrderList', '1496219547');
INSERT INTO `log` VALUES ('2468', '123', 'login', '1496220116');
INSERT INTO `log` VALUES ('2469', '123', 'getOrderList', '1496220123');
INSERT INTO `log` VALUES ('2470', '123', 'deleteOrder', '1496220125');
INSERT INTO `log` VALUES ('2471', '123', 'getOrderList', '1496220126');
INSERT INTO `log` VALUES ('2472', '123', 'getOrderList', '1496220298');
INSERT INTO `log` VALUES ('2473', '123', 'getTraineeListByOrderId', '1496220303');
INSERT INTO `log` VALUES ('2474', '123', 'getTraineeListByOrderId', '1496220306');
INSERT INTO `log` VALUES ('2475', '123', 'getOrderList', '1496220340');
INSERT INTO `log` VALUES ('2476', '123', 'getTraineeListByOrderId', '1496220341');
INSERT INTO `log` VALUES ('2477', '123', 'getOrderList', '1496220349');
INSERT INTO `log` VALUES ('2478', '123', 'getTraineeListByOrderId', '1496220350');
INSERT INTO `log` VALUES ('2479', '123', 'getTraineeListByOrderId', '1496220353');
INSERT INTO `log` VALUES ('2480', '123', 'commitOrder', '1496220382');
INSERT INTO `log` VALUES ('2481', '123', 'getOrderList', '1496220384');
INSERT INTO `log` VALUES ('2482', '123', 'login', '1496220474');
INSERT INTO `log` VALUES ('2483', '123', 'addSupportType', '1496220569');
INSERT INTO `log` VALUES ('2484', '123', 'updateSupportType', '1496221445');
INSERT INTO `log` VALUES ('2485', '123', 'updateSupportType', '1496221471');
INSERT INTO `log` VALUES ('2486', '123', 'getSupportTypeList', '1496221528');
INSERT INTO `log` VALUES ('2487', '123', 'getSupportTypeList', '1496221553');
INSERT INTO `log` VALUES ('2488', '123', 'deleteSupportType', '1496221586');
INSERT INTO `log` VALUES ('2489', '123', 'getSupportTypeList', '1496222093');
INSERT INTO `log` VALUES ('2490', '123', 'getSupportTypeList', '1496222113');
INSERT INTO `log` VALUES ('2491', '123', 'getSupportTypeList', '1496222120');
INSERT INTO `log` VALUES ('2492', '123', 'getOrderList', '1496222217');
INSERT INTO `log` VALUES ('2493', '123', 'getOrderList', '1496222402');
INSERT INTO `log` VALUES ('2494', '123', 'getOrderList', '1496222409');
INSERT INTO `log` VALUES ('2495', '123', 'getOrderList', '1496225038');
INSERT INTO `log` VALUES ('2496', '123', 'login', '1496225573');
INSERT INTO `log` VALUES ('2497', '123', 'getOrderList', '1496225576');
INSERT INTO `log` VALUES ('2498', '123', 'getOrderList', '1496225577');
INSERT INTO `log` VALUES ('2499', '123', 'getOrderList', '1496225577');
INSERT INTO `log` VALUES ('2500', '123', 'getOrderList', '1496225599');
INSERT INTO `log` VALUES ('2501', '123', 'getOrderList', '1496225600');
INSERT INTO `log` VALUES ('2502', '123', 'getOrderList', '1496225605');
INSERT INTO `log` VALUES ('2503', '123', 'getOrderList', '1496225607');
INSERT INTO `log` VALUES ('2504', '123', 'getOrderList', '1496225626');
INSERT INTO `log` VALUES ('2505', '123', 'getOrderList', '1496225628');
INSERT INTO `log` VALUES ('2506', '123', 'getOrderList', '1496225633');
INSERT INTO `log` VALUES ('2507', '123', 'getOrderList', '1496225634');
INSERT INTO `log` VALUES ('2508', '123', 'getUnBindTraineeList', '1496225897');
INSERT INTO `log` VALUES ('2509', '123', 'getUnBindTraineeList', '1496226006');
INSERT INTO `log` VALUES ('2510', '123', 'getOrderList', '1496226057');
INSERT INTO `log` VALUES ('2511', '123', 'getOrderList', '1496226058');
INSERT INTO `log` VALUES ('2512', '123', 'getOrderList', '1496226098');
INSERT INTO `log` VALUES ('2513', '123', 'getOrderList', '1496226098');
INSERT INTO `log` VALUES ('2514', '123', 'getUnBindTraineeList', '1496226098');
INSERT INTO `log` VALUES ('2515', '123', 'getOrderList', '1496226174');
INSERT INTO `log` VALUES ('2516', '123', 'getOrderList', '1496226174');
INSERT INTO `log` VALUES ('2517', '123', 'getUnBindTraineeList', '1496226175');
INSERT INTO `log` VALUES ('2518', '123', 'getOrderList', '1496226181');
INSERT INTO `log` VALUES ('2519', '123', 'getOrderList', '1496226181');
INSERT INTO `log` VALUES ('2520', '123', 'getUnBindTraineeList', '1496226182');
INSERT INTO `log` VALUES ('2521', '123', 'getOrderList', '1496226228');
INSERT INTO `log` VALUES ('2522', '123', 'getOrderList', '1496226228');
INSERT INTO `log` VALUES ('2523', '123', 'getUnBindTraineeList', '1496226228');
INSERT INTO `log` VALUES ('2524', '123', 'getOrderList', '1496226318');
INSERT INTO `log` VALUES ('2525', '123', 'getOrderList', '1496226318');
INSERT INTO `log` VALUES ('2526', '123', 'getUnBindTraineeList', '1496226319');
INSERT INTO `log` VALUES ('2527', '123', 'getOrderList', '1496226348');
INSERT INTO `log` VALUES ('2528', '123', 'getOrderList', '1496226348');
INSERT INTO `log` VALUES ('2529', '123', 'getUnBindTraineeList', '1496226348');
INSERT INTO `log` VALUES ('2530', '123', 'getTraineeListByOrderId', '1496226364');
INSERT INTO `log` VALUES ('2531', '123', 'getTraineeListByOrderId', '1496226366');
INSERT INTO `log` VALUES ('2532', '123', 'getTraineeListByOrderId', '1496226367');
INSERT INTO `log` VALUES ('2533', '123', 'getTraineeListByOrderId', '1496226369');
INSERT INTO `log` VALUES ('2534', '123', 'getTraineeListByOrderId', '1496226370');
INSERT INTO `log` VALUES ('2535', '123', 'getOrderList', '1496226407');
INSERT INTO `log` VALUES ('2536', '123', 'getOrderList', '1496226407');
INSERT INTO `log` VALUES ('2537', '123', 'getUnBindTraineeList', '1496226407');
INSERT INTO `log` VALUES ('2538', '123', 'getTraineeListByOrderId', '1496226408');
INSERT INTO `log` VALUES ('2539', '123', 'getTraineeListByOrderId', '1496226410');
INSERT INTO `log` VALUES ('2540', '123', 'getTraineeListByOrderId', '1496226412');
INSERT INTO `log` VALUES ('2541', '123', 'getTraineeListByOrderId', '1496226414');
INSERT INTO `log` VALUES ('2542', '123', 'deleteOrder', '1496226457');
INSERT INTO `log` VALUES ('2543', '123', 'getOrderList', '1496226457');
INSERT INTO `log` VALUES ('2544', '123', 'getOrderList', '1496226458');
INSERT INTO `log` VALUES ('2545', '123', 'getUnBindTraineeList', '1496226458');
INSERT INTO `log` VALUES ('2546', '123', 'deleteOrder', '1496226459');
INSERT INTO `log` VALUES ('2547', '123', 'getOrderList', '1496226460');
INSERT INTO `log` VALUES ('2548', '123', 'getOrderList', '1496226460');
INSERT INTO `log` VALUES ('2549', '123', 'getUnBindTraineeList', '1496226460');
INSERT INTO `log` VALUES ('2550', '123', 'deleteOrder', '1496226461');
INSERT INTO `log` VALUES ('2551', '123', 'getOrderList', '1496226461');
INSERT INTO `log` VALUES ('2552', '123', 'getOrderList', '1496226461');
INSERT INTO `log` VALUES ('2553', '123', 'getUnBindTraineeList', '1496226462');
INSERT INTO `log` VALUES ('2554', '123', 'deleteOrder', '1496226463');
INSERT INTO `log` VALUES ('2555', '123', 'getOrderList', '1496226463');
INSERT INTO `log` VALUES ('2556', '123', 'getOrderList', '1496226463');
INSERT INTO `log` VALUES ('2557', '123', 'getUnBindTraineeList', '1496226463');
INSERT INTO `log` VALUES ('2558', '123', 'getOrderList', '1496226469');
INSERT INTO `log` VALUES ('2559', '123', 'getOrderList', '1496226469');
INSERT INTO `log` VALUES ('2560', '123', 'getUnBindTraineeList', '1496226469');
INSERT INTO `log` VALUES ('2561', '123', 'getOrderList', '1496226562');
INSERT INTO `log` VALUES ('2562', '123', 'getOrderList', '1496226562');
INSERT INTO `log` VALUES ('2563', '123', 'getUnBindTraineeList', '1496226562');
INSERT INTO `log` VALUES ('2564', '123', 'getOrderList', '1496226606');
INSERT INTO `log` VALUES ('2565', '123', 'getOrderList', '1496226606');
INSERT INTO `log` VALUES ('2566', '123', 'getUnBindTraineeList', '1496226606');
INSERT INTO `log` VALUES ('2567', '123', 'getOrderList', '1496226608');
INSERT INTO `log` VALUES ('2568', '123', 'getOrderList', '1496226608');
INSERT INTO `log` VALUES ('2569', '123', 'getUnBindTraineeList', '1496226608');
INSERT INTO `log` VALUES ('2570', '123', 'getOrderList', '1496226617');
INSERT INTO `log` VALUES ('2571', '123', 'getOrderList', '1496226617');
INSERT INTO `log` VALUES ('2572', '123', 'getUnBindTraineeList', '1496226618');
INSERT INTO `log` VALUES ('2573', '123', 'getOrderList', '1496226717');
INSERT INTO `log` VALUES ('2574', '123', 'getOrderList', '1496226717');
INSERT INTO `log` VALUES ('2575', '123', 'getUnBindTraineeList', '1496226718');
INSERT INTO `log` VALUES ('2576', '123', 'getOrderList', '1496226847');
INSERT INTO `log` VALUES ('2577', '123', 'getOrderList', '1496226848');
INSERT INTO `log` VALUES ('2578', '123', 'getUnBindTraineeList', '1496226848');
INSERT INTO `log` VALUES ('2579', '123', 'getOrderList', '1496226858');
INSERT INTO `log` VALUES ('2580', '123', 'getOrderList', '1496226858');
INSERT INTO `log` VALUES ('2581', '123', 'getUnBindTraineeList', '1496226858');
INSERT INTO `log` VALUES ('2582', '123', 'login', '1496279049');
INSERT INTO `log` VALUES ('2583', '123', 'getAuntList', '1496279161');
INSERT INTO `log` VALUES ('2584', '123', 'getLanguageList', '1496279161');
INSERT INTO `log` VALUES ('2585', '123', 'getCookingList', '1496279162');
INSERT INTO `log` VALUES ('2586', '123', 'getSkillList', '1496279162');
INSERT INTO `log` VALUES ('2587', '123', 'getApplianceList', '1496279162');
INSERT INTO `log` VALUES ('2588', '123', 'getJobList', '1496279162');
INSERT INTO `log` VALUES ('2589', '123', 'getCertificateList', '1496279162');
INSERT INTO `log` VALUES ('2590', '123', 'getPactList', '1496279170');
INSERT INTO `log` VALUES ('2591', '123', 'getShareEmployerList', '1496279172');
INSERT INTO `log` VALUES ('2592', '123', 'getShareAuntList', '1496279172');
INSERT INTO `log` VALUES ('2593', '123', 'getUnShareAuntList', '1496279172');
INSERT INTO `log` VALUES ('2594', '123', 'login', '1496280802');
INSERT INTO `log` VALUES ('2595', '123', 'login', '1496280821');
INSERT INTO `log` VALUES ('2596', '123', 'login', '1496280736');
INSERT INTO `log` VALUES ('2597', '123', 'getAuntList', '1496280749');
INSERT INTO `log` VALUES ('2598', '123', 'getLanguageList', '1496280749');
INSERT INTO `log` VALUES ('2599', '123', 'getCookingList', '1496280749');
INSERT INTO `log` VALUES ('2600', '123', 'getSkillList', '1496280749');
INSERT INTO `log` VALUES ('2601', '123', 'getApplianceList', '1496280750');
INSERT INTO `log` VALUES ('2602', '123', 'getJobList', '1496280750');
INSERT INTO `log` VALUES ('2603', '123', 'getCertificateList', '1496280750');
INSERT INTO `log` VALUES ('2604', '123', 'getAuntList', '1496280758');
INSERT INTO `log` VALUES ('2605', '123', 'getLanguageList', '1496280759');
INSERT INTO `log` VALUES ('2606', '123', 'getCookingList', '1496280759');
INSERT INTO `log` VALUES ('2607', '123', 'getSkillList', '1496280759');
INSERT INTO `log` VALUES ('2608', '123', 'getApplianceList', '1496280759');
INSERT INTO `log` VALUES ('2609', '123', 'getJobList', '1496280759');
INSERT INTO `log` VALUES ('2610', '123', 'getCertificateList', '1496280759');
INSERT INTO `log` VALUES ('2611', '123', 'getPactList', '1496280765');
INSERT INTO `log` VALUES ('2612', '123', 'getShareEmployerList', '1496280769');
INSERT INTO `log` VALUES ('2613', '123', 'getShareAuntList', '1496280769');
INSERT INTO `log` VALUES ('2614', '123', 'getUnShareAuntList', '1496280769');
INSERT INTO `log` VALUES ('2615', '123', 'getShareEmployerList', '1496280771');
INSERT INTO `log` VALUES ('2616', '123', 'getShareAuntList', '1496280771');
INSERT INTO `log` VALUES ('2617', '123', 'getUnShareAuntList', '1496280772');
INSERT INTO `log` VALUES ('2618', '123', 'getAuntList', '1496280804');
INSERT INTO `log` VALUES ('2619', '123', 'getLanguageList', '1496280804');
INSERT INTO `log` VALUES ('2620', '123', 'getCookingList', '1496280804');
INSERT INTO `log` VALUES ('2621', '123', 'getSkillList', '1496280804');
INSERT INTO `log` VALUES ('2622', '123', 'getApplianceList', '1496280804');
INSERT INTO `log` VALUES ('2623', '123', 'getJobList', '1496280805');
INSERT INTO `log` VALUES ('2624', '123', 'getCertificateList', '1496280805');
INSERT INTO `log` VALUES ('2625', '123', 'getPactList', '1496280811');
INSERT INTO `log` VALUES ('2626', '123', 'getAuntList', '1496281161');
INSERT INTO `log` VALUES ('2627', '123', 'getLanguageList', '1496281161');
INSERT INTO `log` VALUES ('2628', '123', 'getCookingList', '1496281161');
INSERT INTO `log` VALUES ('2629', '123', 'getSkillList', '1496281161');
INSERT INTO `log` VALUES ('2630', '123', 'getApplianceList', '1496281161');
INSERT INTO `log` VALUES ('2631', '123', 'getJobList', '1496281161');
INSERT INTO `log` VALUES ('2632', '123', 'getCertificateList', '1496281162');
INSERT INTO `log` VALUES ('2633', '123', 'login', '1496282149');
INSERT INTO `log` VALUES ('2634', '123', 'getOrderList', '1496282201');
INSERT INTO `log` VALUES ('2635', '123', 'getOrderList', '1496282201');
INSERT INTO `log` VALUES ('2636', '123', 'getUnBindTraineeList', '1496282201');
INSERT INTO `log` VALUES ('2637', '123', 'getOrderList', '1496282219');
INSERT INTO `log` VALUES ('2638', '123', 'getOrderList', '1496282219');
INSERT INTO `log` VALUES ('2639', '123', 'getUnBindTraineeList', '1496282219');
INSERT INTO `log` VALUES ('2640', '123', 'addOrder', '1496282223');
INSERT INTO `log` VALUES ('2641', '123', 'getOrderList', '1496282223');
INSERT INTO `log` VALUES ('2642', '123', 'getTraineeListByOrderId', '1496282227');
INSERT INTO `log` VALUES ('2643', '123', 'addTrainee', '1496282258');
INSERT INTO `log` VALUES ('2644', '123', 'addTrainee', '1496282310');
INSERT INTO `log` VALUES ('2645', '123', 'addTrainee', '1496282354');
INSERT INTO `log` VALUES ('2646', '123', 'getTraineeListByUserId', '1496282389');
INSERT INTO `log` VALUES ('2647', '123', 'getTraineeListByOrderId', '1496282400');
INSERT INTO `log` VALUES ('2648', '123', 'getTraineeListByUserId', '1496282428');
INSERT INTO `log` VALUES ('2649', '123', 'getOrderList', '1496282686');
INSERT INTO `log` VALUES ('2650', '123', 'getOrderList', '1496282686');
INSERT INTO `log` VALUES ('2651', '123', 'getTraineeListByUserId', '1496282686');
INSERT INTO `log` VALUES ('2652', '123', 'getUnBindTraineeList', '1496282687');
INSERT INTO `log` VALUES ('2653', '123', 'getOrderList', '1496282749');
INSERT INTO `log` VALUES ('2654', '123', 'getOrderList', '1496282749');
INSERT INTO `log` VALUES ('2655', '123', 'getTraineeListByUserId', '1496282749');
INSERT INTO `log` VALUES ('2656', '123', 'getUnBindTraineeList', '1496282749');
INSERT INTO `log` VALUES ('2657', '123', 'getOrderList', '1496282766');
INSERT INTO `log` VALUES ('2658', '123', 'getOrderList', '1496282766');
INSERT INTO `log` VALUES ('2659', '123', 'getTraineeListByUserId', '1496282766');
INSERT INTO `log` VALUES ('2660', '123', 'getUnBindTraineeList', '1496282766');
INSERT INTO `log` VALUES ('2661', '123', 'getOrderList', '1496282776');
INSERT INTO `log` VALUES ('2662', '123', 'getOrderList', '1496282776');
INSERT INTO `log` VALUES ('2663', '123', 'getTraineeListByUserId', '1496282776');
INSERT INTO `log` VALUES ('2664', '123', 'getUnBindTraineeList', '1496282776');
INSERT INTO `log` VALUES ('2665', '123', 'getOrderList', '1496282786');
INSERT INTO `log` VALUES ('2666', '123', 'getOrderList', '1496282786');
INSERT INTO `log` VALUES ('2667', '123', 'getTraineeListByUserId', '1496282787');
INSERT INTO `log` VALUES ('2668', '123', 'getUnBindTraineeList', '1496282787');
INSERT INTO `log` VALUES ('2669', '123', 'getOrderList', '1496282806');
INSERT INTO `log` VALUES ('2670', '123', 'getOrderList', '1496282806');
INSERT INTO `log` VALUES ('2671', '123', 'getTraineeListByUserId', '1496282807');
INSERT INTO `log` VALUES ('2672', '123', 'getUnBindTraineeList', '1496282807');
INSERT INTO `log` VALUES ('2673', '123', 'getOrderList', '1496282841');
INSERT INTO `log` VALUES ('2674', '123', 'getOrderList', '1496282842');
INSERT INTO `log` VALUES ('2675', '123', 'getTraineeListByUserId', '1496282842');
INSERT INTO `log` VALUES ('2676', '123', 'getUnBindTraineeList', '1496282842');
INSERT INTO `log` VALUES ('2677', '123', 'getOrderList', '1496282894');
INSERT INTO `log` VALUES ('2678', '123', 'getOrderList', '1496282895');
INSERT INTO `log` VALUES ('2679', '123', 'getTraineeListByUserId', '1496282895');
INSERT INTO `log` VALUES ('2680', '123', 'getUnBindTraineeList', '1496282895');
INSERT INTO `log` VALUES ('2681', '123', 'addOrder', '1496282922');
INSERT INTO `log` VALUES ('2682', '123', 'getOrderList', '1496282922');
INSERT INTO `log` VALUES ('2683', '123', 'getOrderList', '1496282927');
INSERT INTO `log` VALUES ('2684', '123', 'getOrderList', '1496282928');
INSERT INTO `log` VALUES ('2685', '123', 'getTraineeListByUserId', '1496282928');
INSERT INTO `log` VALUES ('2686', '123', 'getUnBindTraineeList', '1496282928');
INSERT INTO `log` VALUES ('2687', '123', 'getOrderList', '1496283095');
INSERT INTO `log` VALUES ('2688', '123', 'getOrderList', '1496283095');
INSERT INTO `log` VALUES ('2689', '123', 'getTraineeListByUserId', '1496283096');
INSERT INTO `log` VALUES ('2690', '123', 'getUnBindTraineeList', '1496283096');
INSERT INTO `log` VALUES ('2691', '123', 'getOrderList', '1496283104');
INSERT INTO `log` VALUES ('2692', '123', 'getOrderList', '1496283104');
INSERT INTO `log` VALUES ('2693', '123', 'getTraineeListByUserId', '1496283105');
INSERT INTO `log` VALUES ('2694', '123', 'getUnBindTraineeList', '1496283105');
INSERT INTO `log` VALUES ('2695', '123', 'getOrderList', '1496283111');
INSERT INTO `log` VALUES ('2696', '123', 'getOrderList', '1496283112');
INSERT INTO `log` VALUES ('2697', '123', 'getTraineeListByUserId', '1496283112');
INSERT INTO `log` VALUES ('2698', '123', 'getUnBindTraineeList', '1496283112');
INSERT INTO `log` VALUES ('2699', '123', 'getOrderList', '1496283127');
INSERT INTO `log` VALUES ('2700', '123', 'getOrderList', '1496283127');
INSERT INTO `log` VALUES ('2701', '123', 'getTraineeListByUserId', '1496283127');
INSERT INTO `log` VALUES ('2702', '123', 'getUnBindTraineeList', '1496283127');
INSERT INTO `log` VALUES ('2703', '123', 'getOrderList', '1496283171');
INSERT INTO `log` VALUES ('2704', '123', 'getOrderList', '1496283171');
INSERT INTO `log` VALUES ('2705', '123', 'getTraineeListByUserId', '1496283171');
INSERT INTO `log` VALUES ('2706', '123', 'getUnBindTraineeList', '1496283171');
INSERT INTO `log` VALUES ('2707', '123', 'getOrderList', '1496283178');
INSERT INTO `log` VALUES ('2708', '123', 'getOrderList', '1496283178');
INSERT INTO `log` VALUES ('2709', '123', 'getTraineeListByUserId', '1496283178');
INSERT INTO `log` VALUES ('2710', '123', 'getUnBindTraineeList', '1496283179');
INSERT INTO `log` VALUES ('2711', '123', 'getTraineeListByOrderId', '1496283182');
INSERT INTO `log` VALUES ('2712', '123', 'getOrderList', '1496283230');
INSERT INTO `log` VALUES ('2713', '123', 'getOrderList', '1496283230');
INSERT INTO `log` VALUES ('2714', '123', 'getTraineeListByUserId', '1496283230');
INSERT INTO `log` VALUES ('2715', '123', 'getUnBindTraineeList', '1496283231');
INSERT INTO `log` VALUES ('2716', '123', 'getOrderList', '1496283240');
INSERT INTO `log` VALUES ('2717', '123', 'getOrderList', '1496283240');
INSERT INTO `log` VALUES ('2718', '123', 'getTraineeListByUserId', '1496283240');
INSERT INTO `log` VALUES ('2719', '123', 'getUnBindTraineeList', '1496283240');
INSERT INTO `log` VALUES ('2720', '123', 'getOrderList', '1496283242');
INSERT INTO `log` VALUES ('2721', '123', 'getOrderList', '1496283243');
INSERT INTO `log` VALUES ('2722', '123', 'getTraineeListByUserId', '1496283243');
INSERT INTO `log` VALUES ('2723', '123', 'getUnBindTraineeList', '1496283243');
INSERT INTO `log` VALUES ('2724', '123', 'getOrderList', '1496283260');
INSERT INTO `log` VALUES ('2725', '123', 'getOrderList', '1496283260');
INSERT INTO `log` VALUES ('2726', '123', 'getTraineeListByUserId', '1496283260');
INSERT INTO `log` VALUES ('2727', '123', 'getUnBindTraineeList', '1496283260');
INSERT INTO `log` VALUES ('2728', '123', 'getOrderList', '1496283289');
INSERT INTO `log` VALUES ('2729', '123', 'getOrderList', '1496283289');
INSERT INTO `log` VALUES ('2730', '123', 'getTraineeListByUserId', '1496283289');
INSERT INTO `log` VALUES ('2731', '123', 'getUnBindTraineeList', '1496283289');
INSERT INTO `log` VALUES ('2732', '123', 'getOrderList', '1496283301');
INSERT INTO `log` VALUES ('2733', '123', 'getOrderList', '1496283301');
INSERT INTO `log` VALUES ('2734', '123', 'getTraineeListByUserId', '1496283302');
INSERT INTO `log` VALUES ('2735', '123', 'getUnBindTraineeList', '1496283302');
INSERT INTO `log` VALUES ('2736', '123', 'getOrderList', '1496283331');
INSERT INTO `log` VALUES ('2737', '123', 'getOrderList', '1496283331');
INSERT INTO `log` VALUES ('2738', '123', 'getTraineeListByUserId', '1496283332');
INSERT INTO `log` VALUES ('2739', '123', 'getUnBindTraineeList', '1496283332');
INSERT INTO `log` VALUES ('2740', '123', 'getOrderList', '1496283355');
INSERT INTO `log` VALUES ('2741', '123', 'getOrderList', '1496283355');
INSERT INTO `log` VALUES ('2742', '123', 'getTraineeListByUserId', '1496283356');
INSERT INTO `log` VALUES ('2743', '123', 'getUnBindTraineeList', '1496283356');
INSERT INTO `log` VALUES ('2744', '123', 'addTrainee', '1496283403');
INSERT INTO `log` VALUES ('2745', '123', 'getOrderList', '1496283408');
INSERT INTO `log` VALUES ('2746', '123', 'getOrderList', '1496283408');
INSERT INTO `log` VALUES ('2747', '123', 'getTraineeListByUserId', '1496283408');
INSERT INTO `log` VALUES ('2748', '123', 'getUnBindTraineeList', '1496283409');
INSERT INTO `log` VALUES ('2749', '123', 'getOrderList', '1496283437');
INSERT INTO `log` VALUES ('2750', '123', 'getOrderList', '1496283437');
INSERT INTO `log` VALUES ('2751', '123', 'getTraineeListByUserId', '1496283437');
INSERT INTO `log` VALUES ('2752', '123', 'getUnBindTraineeList', '1496283437');
INSERT INTO `log` VALUES ('2753', '123', 'getOrderList', '1496283479');
INSERT INTO `log` VALUES ('2754', '123', 'getOrderList', '1496283479');
INSERT INTO `log` VALUES ('2755', '123', 'getTraineeListByUserId', '1496283479');
INSERT INTO `log` VALUES ('2756', '123', 'getUnBindTraineeList', '1496283479');
INSERT INTO `log` VALUES ('2757', '123', 'getOrderList', '1496284157');
INSERT INTO `log` VALUES ('2758', '123', 'getOrderList', '1496284157');
INSERT INTO `log` VALUES ('2759', '123', 'getTraineeListByUserId', '1496284158');
INSERT INTO `log` VALUES ('2760', '123', 'getUnBindTraineeList', '1496284158');
INSERT INTO `log` VALUES ('2761', '123', 'getOrderList', '1496284171');
INSERT INTO `log` VALUES ('2762', '123', 'getOrderList', '1496284171');
INSERT INTO `log` VALUES ('2763', '123', 'getTraineeListByUserId', '1496284172');
INSERT INTO `log` VALUES ('2764', '123', 'getUnBindTraineeList', '1496284172');
INSERT INTO `log` VALUES ('2765', '123', 'getOrderList', '1496284182');
INSERT INTO `log` VALUES ('2766', '123', 'getOrderList', '1496284183');
INSERT INTO `log` VALUES ('2767', '123', 'getTraineeListByUserId', '1496284183');
INSERT INTO `log` VALUES ('2768', '123', 'getUnBindTraineeList', '1496284183');
INSERT INTO `log` VALUES ('2769', '123', 'getOrderList', '1496284269');
INSERT INTO `log` VALUES ('2770', '123', 'getOrderList', '1496284270');
INSERT INTO `log` VALUES ('2771', '123', 'getTraineeListByUserId', '1496284270');
INSERT INTO `log` VALUES ('2772', '123', 'getUnBindTraineeList', '1496284270');
INSERT INTO `log` VALUES ('2773', '123', 'getOrderList', '1496284281');
INSERT INTO `log` VALUES ('2774', '123', 'getOrderList', '1496284281');
INSERT INTO `log` VALUES ('2775', '123', 'getTraineeListByUserId', '1496284281');
INSERT INTO `log` VALUES ('2776', '123', 'getUnBindTraineeList', '1496284281');
INSERT INTO `log` VALUES ('2777', '123', 'getOrderList', '1496284310');
INSERT INTO `log` VALUES ('2778', '123', 'getOrderList', '1496284310');
INSERT INTO `log` VALUES ('2779', '123', 'getTraineeListByUserId', '1496284310');
INSERT INTO `log` VALUES ('2780', '123', 'getUnBindTraineeList', '1496284311');
INSERT INTO `log` VALUES ('2781', '123', 'getOrderList', '1496284323');
INSERT INTO `log` VALUES ('2782', '123', 'getOrderList', '1496284324');
INSERT INTO `log` VALUES ('2783', '123', 'getTraineeListByUserId', '1496284324');
INSERT INTO `log` VALUES ('2784', '123', 'getUnBindTraineeList', '1496284324');
INSERT INTO `log` VALUES ('2785', '123', 'getOrderList', '1496284331');
INSERT INTO `log` VALUES ('2786', '123', 'getOrderList', '1496284331');
INSERT INTO `log` VALUES ('2787', '123', 'getTraineeListByUserId', '1496284331');
INSERT INTO `log` VALUES ('2788', '123', 'getUnBindTraineeList', '1496284331');
INSERT INTO `log` VALUES ('2789', '123', 'getOrderList', '1496284343');
INSERT INTO `log` VALUES ('2790', '123', 'getOrderList', '1496284344');
INSERT INTO `log` VALUES ('2791', '123', 'getTraineeListByUserId', '1496284344');
INSERT INTO `log` VALUES ('2792', '123', 'getUnBindTraineeList', '1496284344');
INSERT INTO `log` VALUES ('2793', '123', 'getOrderList', '1496284354');
INSERT INTO `log` VALUES ('2794', '123', 'getOrderList', '1496284354');
INSERT INTO `log` VALUES ('2795', '123', 'getTraineeListByUserId', '1496284354');
INSERT INTO `log` VALUES ('2796', '123', 'getUnBindTraineeList', '1496284354');
INSERT INTO `log` VALUES ('2797', '123', 'login', '1496284719');
INSERT INTO `log` VALUES ('2798', '123', 'getOrderList', '1496284729');
INSERT INTO `log` VALUES ('2799', '123', 'getOrderList', '1496284729');
INSERT INTO `log` VALUES ('2800', '123', 'getTraineeListByUserId', '1496284729');
INSERT INTO `log` VALUES ('2801', '123', 'getUnBindTraineeList', '1496284729');
INSERT INTO `log` VALUES ('2802', '123', 'bindOrderAndTrainee', '1496284738');
INSERT INTO `log` VALUES ('2803', '123', 'bindOrderAndTrainee', '1496284749');
INSERT INTO `log` VALUES ('2804', '2', 'sLogin', '1496285585');
INSERT INTO `log` VALUES ('2805', '123', 'login', '1496285684');
INSERT INTO `log` VALUES ('2806', '123', 'login', '1496285693');
INSERT INTO `log` VALUES ('2807', '123', 'login', '1496309827');
INSERT INTO `log` VALUES ('2808', '123', 'getVUserListById', '1496309842');
INSERT INTO `log` VALUES ('2809', '123', 'login', '1496310113');
INSERT INTO `log` VALUES ('2810', '123', 'getVUserListById', '1496310144');
INSERT INTO `log` VALUES ('2811', '123', 'login', '1496310364');
INSERT INTO `log` VALUES ('2812', '123', 'getVUserListById', '1496310373');
INSERT INTO `log` VALUES ('2813', '123', 'login', '1496310585');
INSERT INTO `log` VALUES ('2814', '123', 'getVUserListById', '1496310598');
INSERT INTO `log` VALUES ('2815', '123', 'login', '1496310862');
INSERT INTO `log` VALUES ('2816', '123', 'getVUserListById', '1496310871');
INSERT INTO `log` VALUES ('2817', '2', 'sLogin', '1496311218');
INSERT INTO `log` VALUES ('2818', '2', 'sLogin', '1496314143');
INSERT INTO `log` VALUES ('2819', '2', 'sLogin', '1496314766');
INSERT INTO `log` VALUES ('2820', '2', 'sLogin', '1496315118');
INSERT INTO `log` VALUES ('2821', '2', 'getVUserListById', '1496315127');
INSERT INTO `log` VALUES ('2822', '2', 'sLogin', '1496315906');
INSERT INTO `log` VALUES ('2823', '2', 'getVUserListById', '1496315914');
INSERT INTO `log` VALUES ('2824', '2', 'sLogin', '1496316229');
INSERT INTO `log` VALUES ('2825', '2', 'getVUserListById', '1496316237');
INSERT INTO `log` VALUES ('2826', '2', 'sLogin', '1496376223');
INSERT INTO `log` VALUES ('2827', '2', 'getVUserListById', '1496376235');
INSERT INTO `log` VALUES ('2828', '123', 'login', '1496543025');
INSERT INTO `log` VALUES ('2829', '123', 'getAuntList', '1496543042');
INSERT INTO `log` VALUES ('2830', '123', 'getLanguageList', '1496543043');
INSERT INTO `log` VALUES ('2831', '123', 'getCookingList', '1496543043');
INSERT INTO `log` VALUES ('2832', '123', 'getSkillList', '1496543043');
INSERT INTO `log` VALUES ('2833', '123', 'getApplianceList', '1496543043');
INSERT INTO `log` VALUES ('2834', '123', 'getJobList', '1496543043');
INSERT INTO `log` VALUES ('2835', '123', 'getCertificateList', '1496543043');
INSERT INTO `log` VALUES ('2836', '123', 'getShareEmployerList', '1496543046');
INSERT INTO `log` VALUES ('2837', '123', 'getShareAuntList', '1496543046');
INSERT INTO `log` VALUES ('2838', '123', 'getUnShareAuntList', '1496543046');
INSERT INTO `log` VALUES ('2839', '123', 'getAuntList', '1496543047');
INSERT INTO `log` VALUES ('2840', '123', 'getLanguageList', '1496543047');
INSERT INTO `log` VALUES ('2841', '123', 'getCookingList', '1496543047');
INSERT INTO `log` VALUES ('2842', '123', 'getSkillList', '1496543048');
INSERT INTO `log` VALUES ('2843', '123', 'getApplianceList', '1496543048');
INSERT INTO `log` VALUES ('2844', '123', 'getJobList', '1496543048');
INSERT INTO `log` VALUES ('2845', '123', 'getCertificateList', '1496543048');
INSERT INTO `log` VALUES ('2846', '123', 'login', '1496543076');
INSERT INTO `log` VALUES ('2847', '123', 'getAuntList', '1496543087');
INSERT INTO `log` VALUES ('2848', '123', 'getLanguageList', '1496543087');
INSERT INTO `log` VALUES ('2849', '123', 'getCookingList', '1496543087');
INSERT INTO `log` VALUES ('2850', '123', 'getSkillList', '1496543087');
INSERT INTO `log` VALUES ('2851', '123', 'getApplianceList', '1496543088');
INSERT INTO `log` VALUES ('2852', '123', 'getJobList', '1496543088');
INSERT INTO `log` VALUES ('2853', '123', 'getCertificateList', '1496543088');
INSERT INTO `log` VALUES ('2854', '123', 'login', '1496545620');
INSERT INTO `log` VALUES ('2855', '123', 'getAuntList', '1496545626');
INSERT INTO `log` VALUES ('2856', '123', 'getLanguageList', '1496545626');
INSERT INTO `log` VALUES ('2857', '123', 'getCookingList', '1496545626');
INSERT INTO `log` VALUES ('2858', '123', 'getSkillList', '1496545626');
INSERT INTO `log` VALUES ('2859', '123', 'getApplianceList', '1496545626');
INSERT INTO `log` VALUES ('2860', '123', 'getJobList', '1496545626');
INSERT INTO `log` VALUES ('2861', '123', 'getCertificateList', '1496545626');
INSERT INTO `log` VALUES ('2862', '123', 'getAuntById', '1496545636');
INSERT INTO `log` VALUES ('2863', '123', 'login', '1496545807');
INSERT INTO `log` VALUES ('2864', '123', 'login', '1496546085');
INSERT INTO `log` VALUES ('2865', '123', 'login', '1496546159');
INSERT INTO `log` VALUES ('2866', '123', 'login', '1496546187');
INSERT INTO `log` VALUES ('2867', '123', 'login', '1496546227');
INSERT INTO `log` VALUES ('2868', '123', 'login', '1496546232');
INSERT INTO `log` VALUES ('2869', '123', 'login', '1496546266');
INSERT INTO `log` VALUES ('2870', '123', 'sLogin', '1496546268');
INSERT INTO `log` VALUES ('2871', '1', 'sLogin', '1496546420');
INSERT INTO `log` VALUES ('2872', '2', 'sLogin', '1496546435');
INSERT INTO `log` VALUES ('2873', '2', 'sLogin', '1496546507');
INSERT INTO `log` VALUES ('2874', '2', 'sLogin', '1496546549');
INSERT INTO `log` VALUES ('2875', '123', 'getAuntById', '1496547762');
INSERT INTO `log` VALUES ('2876', '123', 'getAuntById', '1496547774');
INSERT INTO `log` VALUES ('2877', '123', 'getAuntById', '1496547780');
INSERT INTO `log` VALUES ('2878', '123', 'getAuntById', '1496547786');
INSERT INTO `log` VALUES ('2879', '123', 'getPactList', '1496547796');
INSERT INTO `log` VALUES ('2880', '123', 'getPactList', '1496547798');
INSERT INTO `log` VALUES ('2881', '123', 'getPactList', '1496547799');
INSERT INTO `log` VALUES ('2882', '123', 'getShareEmployerList', '1496547800');
INSERT INTO `log` VALUES ('2883', '123', 'getShareAuntList', '1496547800');
INSERT INTO `log` VALUES ('2884', '123', 'getUnShareAuntList', '1496547800');
INSERT INTO `log` VALUES ('2885', '123', 'getShareEmployerList', '1496547803');
INSERT INTO `log` VALUES ('2886', '123', 'getShareAuntList', '1496547803');
INSERT INTO `log` VALUES ('2887', '123', 'getUnShareAuntList', '1496547804');
INSERT INTO `log` VALUES ('2888', '123', 'getAuntList', '1496547857');
INSERT INTO `log` VALUES ('2889', '123', 'getLanguageList', '1496547857');
INSERT INTO `log` VALUES ('2890', '123', 'getCookingList', '1496547857');
INSERT INTO `log` VALUES ('2891', '123', 'getSkillList', '1496547858');
INSERT INTO `log` VALUES ('2892', '123', 'getApplianceList', '1496547858');
INSERT INTO `log` VALUES ('2893', '123', 'getJobList', '1496547858');
INSERT INTO `log` VALUES ('2894', '123', 'getCertificateList', '1496547858');
INSERT INTO `log` VALUES ('2895', '123', 'getPactList', '1496547861');
INSERT INTO `log` VALUES ('2896', '123', 'getShareEmployerList', '1496547863');
INSERT INTO `log` VALUES ('2897', '123', 'getShareAuntList', '1496547863');
INSERT INTO `log` VALUES ('2898', '123', 'getUnShareAuntList', '1496547863');
INSERT INTO `log` VALUES ('2899', '123', 'getAuntList', '1496547874');
INSERT INTO `log` VALUES ('2900', '123', 'getLanguageList', '1496547874');
INSERT INTO `log` VALUES ('2901', '123', 'getCookingList', '1496547874');
INSERT INTO `log` VALUES ('2902', '123', 'getSkillList', '1496547874');
INSERT INTO `log` VALUES ('2903', '123', 'getApplianceList', '1496547875');
INSERT INTO `log` VALUES ('2904', '123', 'getJobList', '1496547875');
INSERT INTO `log` VALUES ('2905', '123', 'getCertificateList', '1496547875');
INSERT INTO `log` VALUES ('2906', '123', 'getAuntList', '1496547889');
INSERT INTO `log` VALUES ('2907', '123', 'getLanguageList', '1496547889');
INSERT INTO `log` VALUES ('2908', '123', 'getCookingList', '1496547890');
INSERT INTO `log` VALUES ('2909', '123', 'getSkillList', '1496547890');
INSERT INTO `log` VALUES ('2910', '123', 'getApplianceList', '1496547890');
INSERT INTO `log` VALUES ('2911', '123', 'getJobList', '1496547890');
INSERT INTO `log` VALUES ('2912', '123', 'getCertificateList', '1496547890');
INSERT INTO `log` VALUES ('2913', '123', 'getAuntList', '1496547899');
INSERT INTO `log` VALUES ('2914', '123', 'getLanguageList', '1496547899');
INSERT INTO `log` VALUES ('2915', '123', 'getCookingList', '1496547899');
INSERT INTO `log` VALUES ('2916', '123', 'getSkillList', '1496547899');
INSERT INTO `log` VALUES ('2917', '123', 'getApplianceList', '1496547899');
INSERT INTO `log` VALUES ('2918', '123', 'getJobList', '1496547899');
INSERT INTO `log` VALUES ('2919', '123', 'getCertificateList', '1496547899');
INSERT INTO `log` VALUES ('2920', '123', 'getAuntList', '1496547906');
INSERT INTO `log` VALUES ('2921', '123', 'getLanguageList', '1496547906');
INSERT INTO `log` VALUES ('2922', '123', 'getCookingList', '1496547906');
INSERT INTO `log` VALUES ('2923', '123', 'getSkillList', '1496547906');
INSERT INTO `log` VALUES ('2924', '123', 'getApplianceList', '1496547906');
INSERT INTO `log` VALUES ('2925', '123', 'getJobList', '1496547907');
INSERT INTO `log` VALUES ('2926', '123', 'getCertificateList', '1496547907');
INSERT INTO `log` VALUES ('2927', '123', 'getAuntList', '1496547935');
INSERT INTO `log` VALUES ('2928', '123', 'getLanguageList', '1496547935');
INSERT INTO `log` VALUES ('2929', '123', 'getCookingList', '1496547936');
INSERT INTO `log` VALUES ('2930', '123', 'getSkillList', '1496547936');
INSERT INTO `log` VALUES ('2931', '123', 'getApplianceList', '1496547936');
INSERT INTO `log` VALUES ('2932', '123', 'getJobList', '1496547936');
INSERT INTO `log` VALUES ('2933', '123', 'getCertificateList', '1496547936');
INSERT INTO `log` VALUES ('2934', '123', 'getPactList', '1496547939');
INSERT INTO `log` VALUES ('2935', '123', 'getShareEmployerList', '1496547941');
INSERT INTO `log` VALUES ('2936', '123', 'getShareAuntList', '1496547941');
INSERT INTO `log` VALUES ('2937', '123', 'getUnShareAuntList', '1496547941');
INSERT INTO `log` VALUES ('2938', '123', 'getAuntList', '1496547946');
INSERT INTO `log` VALUES ('2939', '123', 'getLanguageList', '1496547946');
INSERT INTO `log` VALUES ('2940', '123', 'getCookingList', '1496547946');
INSERT INTO `log` VALUES ('2941', '123', 'getSkillList', '1496547946');
INSERT INTO `log` VALUES ('2942', '123', 'getApplianceList', '1496547946');
INSERT INTO `log` VALUES ('2943', '123', 'getJobList', '1496547947');
INSERT INTO `log` VALUES ('2944', '123', 'getCertificateList', '1496547947');
INSERT INTO `log` VALUES ('2945', '2', 'sLogin', '1496548646');
INSERT INTO `log` VALUES ('2946', '2', 'updateStaff', '1496549499');
INSERT INTO `log` VALUES ('2947', '2', 'sLogin', '1496549529');
INSERT INTO `log` VALUES ('2948', '123', 'login', '1496557138');
INSERT INTO `log` VALUES ('2949', '2', 'sLogin', '1496557213');
INSERT INTO `log` VALUES ('2950', '2', 'updateStaff', '1496557225');
INSERT INTO `log` VALUES ('2951', '2', 'updateStaffPassword', '1496557237');
INSERT INTO `log` VALUES ('2952', '123', 'getAuntById', '1496557302');
INSERT INTO `log` VALUES ('2953', '123', 'getAuntListByStatus', '1496557347');
INSERT INTO `log` VALUES ('2954', '2', 'sLogin', '1496557335');
INSERT INTO `log` VALUES ('2955', '2', 'sLogin', '1496557341');
INSERT INTO `log` VALUES ('2956', '2', 'updateStaff', '1496557351');
INSERT INTO `log` VALUES ('2957', '2', 'updateStaffPassword', '1496557380');
INSERT INTO `log` VALUES ('2958', '2', 'sLogin', '1496557387');
INSERT INTO `log` VALUES ('2959', '123', 'getAuntList', '1496557534');
INSERT INTO `log` VALUES ('2960', '123', 'getCookingList', '1496557767');
INSERT INTO `log` VALUES ('2961', '2', 'sLogin', '1496558913');
INSERT INTO `log` VALUES ('2962', '2', 'sLogin', '1496560138');
INSERT INTO `log` VALUES ('2963', '123', 'login', '1496560231');
INSERT INTO `log` VALUES ('2964', '2', 'sLogin', '1496560244');
INSERT INTO `log` VALUES ('2965', '2', 'sLogin', '1496560425');
INSERT INTO `log` VALUES ('2966', '2', 'sLogin', '1496560479');
INSERT INTO `log` VALUES ('2967', '2', 'sLogin', '1496560588');
INSERT INTO `log` VALUES ('2968', '2', 'sLogin', '1496561273');
INSERT INTO `log` VALUES ('2969', '2', 'sLogin', '1496562949');
INSERT INTO `log` VALUES ('2970', '123', 'login', '1496563243');
INSERT INTO `log` VALUES ('2971', '2', 'sLogin', '1496563251');
INSERT INTO `log` VALUES ('2972', '2', 'updateStaff', '1496563258');
INSERT INTO `log` VALUES ('2973', '2', 'updateStaffPassword', '1496563267');
INSERT INTO `log` VALUES ('2974', '2', 'sLogin', '1496563274');
INSERT INTO `log` VALUES ('2975', '2', 'updateStaffPassword', '1496563292');
INSERT INTO `log` VALUES ('2976', '123', 'login', '1496563304');
INSERT INTO `log` VALUES ('2977', '123', 'updateUserPassword', '1496563319');
INSERT INTO `log` VALUES ('2978', '123', 'updateUserPassword', '1496563325');
INSERT INTO `log` VALUES ('2979', '123', 'getAuntList', '1496563903');
INSERT INTO `log` VALUES ('2980', '123', 'getLanguageList', '1496563904');
INSERT INTO `log` VALUES ('2981', '123', 'getCookingList', '1496563904');
INSERT INTO `log` VALUES ('2982', '123', 'getSkillList', '1496563904');
INSERT INTO `log` VALUES ('2983', '123', 'getApplianceList', '1496563904');
INSERT INTO `log` VALUES ('2984', '123', 'getJobList', '1496563904');
INSERT INTO `log` VALUES ('2985', '123', 'getCertificateList', '1496563904');
INSERT INTO `log` VALUES ('2986', '123', 'getAuntList', '1496563996');
INSERT INTO `log` VALUES ('2987', '123', 'getLanguageList', '1496563997');
INSERT INTO `log` VALUES ('2988', '123', 'getCookingList', '1496563997');
INSERT INTO `log` VALUES ('2989', '123', 'getSkillList', '1496563997');
INSERT INTO `log` VALUES ('2990', '123', 'getApplianceList', '1496563997');
INSERT INTO `log` VALUES ('2991', '123', 'getJobList', '1496563997');
INSERT INTO `log` VALUES ('2992', '123', 'getCertificateList', '1496563997');
INSERT INTO `log` VALUES ('2993', '123', 'getAuntList', '1496564078');
INSERT INTO `log` VALUES ('2994', '123', 'getLanguageList', '1496564079');
INSERT INTO `log` VALUES ('2995', '123', 'getCookingList', '1496564079');
INSERT INTO `log` VALUES ('2996', '123', 'getSkillList', '1496564079');
INSERT INTO `log` VALUES ('2997', '123', 'getApplianceList', '1496564079');
INSERT INTO `log` VALUES ('2998', '123', 'getJobList', '1496564079');
INSERT INTO `log` VALUES ('2999', '123', 'getCertificateList', '1496564079');
INSERT INTO `log` VALUES ('3000', '123', 'getPactList', '1496564081');
INSERT INTO `log` VALUES ('3001', '123', 'getShareEmployerList', '1496564082');
INSERT INTO `log` VALUES ('3002', '123', 'getShareAuntList', '1496564083');
INSERT INTO `log` VALUES ('3003', '123', 'getUnShareAuntList', '1496564083');
INSERT INTO `log` VALUES ('3004', '123', 'getAuntList', '1496564317');
INSERT INTO `log` VALUES ('3005', '123', 'getLanguageList', '1496564318');
INSERT INTO `log` VALUES ('3006', '123', 'getCookingList', '1496564318');
INSERT INTO `log` VALUES ('3007', '123', 'getSkillList', '1496564318');
INSERT INTO `log` VALUES ('3008', '123', 'getApplianceList', '1496564318');
INSERT INTO `log` VALUES ('3009', '123', 'getJobList', '1496564318');
INSERT INTO `log` VALUES ('3010', '123', 'getCertificateList', '1496564318');
INSERT INTO `log` VALUES ('3011', '2', 'sLogin', '1496564328');
INSERT INTO `log` VALUES ('3012', '123', 'login', '1496564442');
INSERT INTO `log` VALUES ('3013', '123', 'getAuntList', '1496564492');
INSERT INTO `log` VALUES ('3014', '123', 'getLanguageList', '1496564492');
INSERT INTO `log` VALUES ('3015', '123', 'getCookingList', '1496564492');
INSERT INTO `log` VALUES ('3016', '123', 'getSkillList', '1496564493');
INSERT INTO `log` VALUES ('3017', '123', 'getApplianceList', '1496564493');
INSERT INTO `log` VALUES ('3018', '123', 'getJobList', '1496564493');
INSERT INTO `log` VALUES ('3019', '123', 'getCertificateList', '1496564493');
INSERT INTO `log` VALUES ('3020', '123', 'getAuntList', '1496564498');
INSERT INTO `log` VALUES ('3021', '123', 'getLanguageList', '1496564498');
INSERT INTO `log` VALUES ('3022', '123', 'getCookingList', '1496564498');
INSERT INTO `log` VALUES ('3023', '123', 'getSkillList', '1496564498');
INSERT INTO `log` VALUES ('3024', '123', 'getApplianceList', '1496564498');
INSERT INTO `log` VALUES ('3025', '123', 'getJobList', '1496564499');
INSERT INTO `log` VALUES ('3026', '123', 'getCertificateList', '1496564499');
INSERT INTO `log` VALUES ('3027', '123', 'getAuntList', '1496564502');
INSERT INTO `log` VALUES ('3028', '123', 'getLanguageList', '1496564503');
INSERT INTO `log` VALUES ('3029', '123', 'getCookingList', '1496564503');
INSERT INTO `log` VALUES ('3030', '123', 'getSkillList', '1496564503');
INSERT INTO `log` VALUES ('3031', '123', 'getApplianceList', '1496564503');
INSERT INTO `log` VALUES ('3032', '123', 'getJobList', '1496564503');
INSERT INTO `log` VALUES ('3033', '123', 'getCertificateList', '1496564503');
INSERT INTO `log` VALUES ('3034', '2', 'sLogin', '1496565476');
INSERT INTO `log` VALUES ('3035', '2', 'sLogin', '1496565819');
INSERT INTO `log` VALUES ('3036', '123', 'login', '1496567425');
INSERT INTO `log` VALUES ('3037', '123', 'getEmployerList', '1496567673');
INSERT INTO `log` VALUES ('3038', '123', 'login', '1496568084');
INSERT INTO `log` VALUES ('3039', '123', 'getEmployerList', '1496568086');
INSERT INTO `log` VALUES ('3040', '123', 'getEmployerList', '1496568118');
INSERT INTO `log` VALUES ('3041', '123', 'getEmployerList', '1496568184');
INSERT INTO `log` VALUES ('3042', '123', 'getEmployerList', '1496568202');
INSERT INTO `log` VALUES ('3043', '123', 'getEmployerList', '1496568546');
INSERT INTO `log` VALUES ('3044', '123', 'login', '1496568713');
INSERT INTO `log` VALUES ('3045', '123', 'getEmployerList', '1496568715');
INSERT INTO `log` VALUES ('3046', '123', 'getEmployerList', '1496568721');
INSERT INTO `log` VALUES ('3047', '123', 'getEmployerList', '1496568724');
INSERT INTO `log` VALUES ('3048', '123', 'getEmployerList', '1496568727');
INSERT INTO `log` VALUES ('3049', '123', 'getEmployerList', '1496568728');
INSERT INTO `log` VALUES ('3050', '123', 'getEmployerList', '1496568735');
INSERT INTO `log` VALUES ('3051', '123', 'getEmployerList', '1496568737');
INSERT INTO `log` VALUES ('3052', '123', 'getEmployerList', '1496568769');
INSERT INTO `log` VALUES ('3053', '123', 'getEmployerList', '1496568775');
INSERT INTO `log` VALUES ('3054', '123', 'getEmployerList', '1496568785');
INSERT INTO `log` VALUES ('3055', '123', 'getEmployerList', '1496568787');
INSERT INTO `log` VALUES ('3056', '123', 'getEmployerList', '1496568791');
INSERT INTO `log` VALUES ('3057', '123', 'getEmployerList', '1496568884');
INSERT INTO `log` VALUES ('3058', '123', 'getEmployerList', '1496568951');
INSERT INTO `log` VALUES ('3059', '123', 'getEmployerList', '1496568990');
INSERT INTO `log` VALUES ('3060', '123', 'getEmployerList', '1496569517');
INSERT INTO `log` VALUES ('3061', '123', 'login', '1496569683');
INSERT INTO `log` VALUES ('3062', '123', 'getEmployerList', '1496569687');
INSERT INTO `log` VALUES ('3063', '123', 'getEmployerListByStatus', '1496569691');
INSERT INTO `log` VALUES ('3064', '123', 'getEmployerListByStatus', '1496569709');
INSERT INTO `log` VALUES ('3065', '123', 'getEmployerListByStatus', '1496569717');
INSERT INTO `log` VALUES ('3066', '123', 'getEmployerListByStatus', '1496569721');
INSERT INTO `log` VALUES ('3067', '123', 'getEmployerListByStatus', '1496569724');
INSERT INTO `log` VALUES ('3068', '123', 'getEmployerList', '1496570109');
INSERT INTO `log` VALUES ('3069', '123', 'getEmployerList', '1496571024');
INSERT INTO `log` VALUES ('3070', '123', 'getEmployerList', '1496571094');
INSERT INTO `log` VALUES ('3071', '123', 'login', '1496571106');
INSERT INTO `log` VALUES ('3072', '123', 'getEmployerList', '1496571108');
INSERT INTO `log` VALUES ('3073', '123', 'addEmployer', '1496571157');
INSERT INTO `log` VALUES ('3074', '123', 'getEmployerList', '1496571157');
INSERT INTO `log` VALUES ('3075', '123', 'addEmployer', '1496571277');
INSERT INTO `log` VALUES ('3076', '123', 'getEmployerList', '1496571278');
INSERT INTO `log` VALUES ('3077', '123', 'getEmployerList', '1496571390');
INSERT INTO `log` VALUES ('3078', '123', 'addEmployer', '1496571406');
INSERT INTO `log` VALUES ('3079', '123', 'getEmployerList', '1496571406');
INSERT INTO `log` VALUES ('3080', '123', 'getEmployerList', '1496571909');
INSERT INTO `log` VALUES ('3081', '123', 'getEmployerList', '1496571936');
INSERT INTO `log` VALUES ('3082', '123', 'getEmployerList', '1496572003');
INSERT INTO `log` VALUES ('3083', '123', 'getEmployerList', '1496572165');
INSERT INTO `log` VALUES ('3084', '123', 'getEmployerList', '1496572356');
INSERT INTO `log` VALUES ('3085', '123', 'getEmployerList', '1496572384');
INSERT INTO `log` VALUES ('3086', '123', 'getEmployerList', '1496572429');
INSERT INTO `log` VALUES ('3087', '123', 'updateEmployer', '1496572440');
INSERT INTO `log` VALUES ('3088', '123', 'getEmployerList', '1496572440');
INSERT INTO `log` VALUES ('3089', '123', 'getEmployerList', '1496572566');
INSERT INTO `log` VALUES ('3090', '123', 'deleteEmployer', '1496572570');
INSERT INTO `log` VALUES ('3091', '123', 'deleteEmployer', '1496572763');
INSERT INTO `log` VALUES ('3092', '123', 'login', '1496572959');
INSERT INTO `log` VALUES ('3093', '123', 'deleteEmployer', '1496572969');
INSERT INTO `log` VALUES ('3094', '123', 'getEmployerList', '1496572996');
INSERT INTO `log` VALUES ('3095', '123', 'login', '1496573108');
INSERT INTO `log` VALUES ('3096', '123', 'deleteEmployer', '1496573120');
INSERT INTO `log` VALUES ('3097', '123', 'login', '1496573260');
INSERT INTO `log` VALUES ('3098', '123', 'getEmployerList', '1496573263');
INSERT INTO `log` VALUES ('3099', '123', 'deleteEmployer', '1496573290');
INSERT INTO `log` VALUES ('3100', '123', 'getEmployerList', '1496573290');
INSERT INTO `log` VALUES ('3101', '123', 'deleteEmployer', '1496573298');
INSERT INTO `log` VALUES ('3102', '123', 'getEmployerList', '1496573299');
INSERT INTO `log` VALUES ('3103', '123', 'addEmployer', '1496573327');
INSERT INTO `log` VALUES ('3104', '123', 'getEmployerList', '1496573327');
INSERT INTO `log` VALUES ('3105', '123', 'deleteEmployer', '1496573333');
INSERT INTO `log` VALUES ('3106', '123', 'getEmployerList', '1496573333');
INSERT INTO `log` VALUES ('3107', '123', 'getEmployerListByStatus', '1496573421');
INSERT INTO `log` VALUES ('3108', '123', 'getEmployerListByStatus', '1496573422');
INSERT INTO `log` VALUES ('3109', '123', 'getEmployerListByStatus', '1496573423');
INSERT INTO `log` VALUES ('3110', '123', 'getEmployerListByStatus', '1496573423');
INSERT INTO `log` VALUES ('3111', '123', 'getEmployerListByStatus', '1496573425');
INSERT INTO `log` VALUES ('3112', '123', 'getEmployerListByStatus', '1496573425');
INSERT INTO `log` VALUES ('3113', '123', 'getEmployerListByStatus', '1496573425');
INSERT INTO `log` VALUES ('3114', '123', 'getEmployerListByStatus', '1496573427');
INSERT INTO `log` VALUES ('3115', '123', 'getEmployerListByStatus', '1496573429');
INSERT INTO `log` VALUES ('3116', '123', 'getEmployerListByStatus', '1496573430');
INSERT INTO `log` VALUES ('3117', '123', 'getEmployerListByStatus', '1496573431');
INSERT INTO `log` VALUES ('3118', '123', 'getEmployerListByStatus', '1496573432');
INSERT INTO `log` VALUES ('3119', '123', 'getEmployerListByStatus', '1496573433');
INSERT INTO `log` VALUES ('3120', '123', 'getEmployerListByStatus', '1496573440');
INSERT INTO `log` VALUES ('3121', '123', 'getEmployerList', '1496573563');
INSERT INTO `log` VALUES ('3122', '123', 'getEmployerList', '1496573588');
INSERT INTO `log` VALUES ('3123', '123', 'getEmployerList', '1496573802');
INSERT INTO `log` VALUES ('3124', '123', 'getEmployerList', '1496573819');
INSERT INTO `log` VALUES ('3125', '123', 'getEmployerList', '1496573993');
INSERT INTO `log` VALUES ('3126', '123', 'getEmployerList', '1496574196');
INSERT INTO `log` VALUES ('3127', '123', 'getEmployerList', '1496574385');
INSERT INTO `log` VALUES ('3128', '123', 'getEmployerList', '1496574392');
INSERT INTO `log` VALUES ('3129', '123', 'getPactList', '1496574742');
INSERT INTO `log` VALUES ('3130', '123', 'getPactList', '1496574742');
INSERT INTO `log` VALUES ('3131', '123', 'getPactList', '1496574804');
INSERT INTO `log` VALUES ('3132', '123', 'deletePact', '1496574814');
INSERT INTO `log` VALUES ('3133', '123', 'getPactList', '1496574818');
INSERT INTO `log` VALUES ('3134', '123', 'getPactList', '1496575129');
INSERT INTO `log` VALUES ('3135', '123', 'getPactList', '1496575129');
INSERT INTO `log` VALUES ('3136', '123', 'getEmployerList', '1496575132');
INSERT INTO `log` VALUES ('3137', '123', 'getEmployerList', '1496575133');
INSERT INTO `log` VALUES ('3138', '123', 'getEmployerList', '1496575164');
INSERT INTO `log` VALUES ('3139', '123', 'getEmployerList', '1496575165');
INSERT INTO `log` VALUES ('3140', '123', 'getEmployerList', '1496575191');
INSERT INTO `log` VALUES ('3141', '123', 'getEmployerList', '1496575197');
INSERT INTO `log` VALUES ('3142', '123', 'getEmployerList', '1496575208');
INSERT INTO `log` VALUES ('3143', '123', 'getEmployerList', '1496575229');
INSERT INTO `log` VALUES ('3144', '123', 'getEmployerList', '1496575251');
INSERT INTO `log` VALUES ('3145', '123', 'getEmployerList', '1496575276');
INSERT INTO `log` VALUES ('3146', '123', 'getPactList', '1496575276');
INSERT INTO `log` VALUES ('3147', '123', 'login', '1496575331');
INSERT INTO `log` VALUES ('3148', '123', 'getEmployerList', '1496575322');
INSERT INTO `log` VALUES ('3149', '123', 'getPactList', '1496575322');
INSERT INTO `log` VALUES ('3150', '123', 'getEmployerList', '1496575387');
INSERT INTO `log` VALUES ('3151', '123', 'getPactList', '1496575387');
INSERT INTO `log` VALUES ('3152', '123', 'getEmployerList', '1496575440');
INSERT INTO `log` VALUES ('3153', '123', 'getPactList', '1496575441');
INSERT INTO `log` VALUES ('3154', '123', 'getEmployerList', '1496575514');
INSERT INTO `log` VALUES ('3155', '123', 'getPactList', '1496575515');
INSERT INTO `log` VALUES ('3156', '123', 'getEmployerList', '1496575653');
INSERT INTO `log` VALUES ('3157', '123', 'getEmployerList', '1496575693');
INSERT INTO `log` VALUES ('3158', '123', 'getEmployerList', '1496575706');
INSERT INTO `log` VALUES ('3159', '123', 'getEmployerList', '1496575738');
INSERT INTO `log` VALUES ('3160', '123', 'getEmployerList', '1496575752');
INSERT INTO `log` VALUES ('3161', '123', 'getEmployerList', '1496575767');
INSERT INTO `log` VALUES ('3162', '123', 'getEmployerList', '1496575787');
INSERT INTO `log` VALUES ('3163', '123', 'getEmployerList', '1496575804');
INSERT INTO `log` VALUES ('3164', '123', 'getPactList', '1496575804');
INSERT INTO `log` VALUES ('3165', '123', 'getEmployerList', '1496575827');
INSERT INTO `log` VALUES ('3166', '123', 'getPactList', '1496575827');
INSERT INTO `log` VALUES ('3167', '123', 'getEmployerList', '1496575848');
INSERT INTO `log` VALUES ('3168', '123', 'getPactList', '1496575848');
INSERT INTO `log` VALUES ('3169', '123', 'getEmployerList', '1496575864');
INSERT INTO `log` VALUES ('3170', '123', 'getPactList', '1496575865');
INSERT INTO `log` VALUES ('3171', '2', 'login', '1496624050');
INSERT INTO `log` VALUES ('3172', '123', 'login', '1496624060');
INSERT INTO `log` VALUES ('3173', '123', 'getEmployerList', '1496624062');
INSERT INTO `log` VALUES ('3174', '123', 'getPactList', '1496624062');
INSERT INTO `log` VALUES ('3175', '123', 'getAuntList', '1496624149');
INSERT INTO `log` VALUES ('3176', '123', 'getLanguageList', '1496624149');
INSERT INTO `log` VALUES ('3177', '123', 'getCookingList', '1496624150');
INSERT INTO `log` VALUES ('3178', '123', 'getSkillList', '1496624150');
INSERT INTO `log` VALUES ('3179', '123', 'getApplianceList', '1496624150');
INSERT INTO `log` VALUES ('3180', '123', 'getJobList', '1496624150');
INSERT INTO `log` VALUES ('3181', '123', 'getCertificateList', '1496624150');
INSERT INTO `log` VALUES ('3182', '123', 'getEmployerList', '1496624294');
INSERT INTO `log` VALUES ('3183', '123', 'getPactList', '1496624294');
INSERT INTO `log` VALUES ('3184', '123', 'login', '1496624417');
INSERT INTO `log` VALUES ('3185', '123', 'login', '1496624462');
INSERT INTO `log` VALUES ('3186', '123', 'getAuntList', '1496624504');
INSERT INTO `log` VALUES ('3187', '123', 'getLanguageList', '1496624505');
INSERT INTO `log` VALUES ('3188', '123', 'getCookingList', '1496624505');
INSERT INTO `log` VALUES ('3189', '123', 'getSkillList', '1496624505');
INSERT INTO `log` VALUES ('3190', '123', 'getApplianceList', '1496624505');
INSERT INTO `log` VALUES ('3191', '123', 'getJobList', '1496624505');
INSERT INTO `log` VALUES ('3192', '123', 'getCertificateList', '1496624505');
INSERT INTO `log` VALUES ('3193', '123', 'getPactList', '1496624510');
INSERT INTO `log` VALUES ('3194', '123', 'addSupportTracking', '1496626619');
INSERT INTO `log` VALUES ('3195', '123', 'login', '1496626770');
INSERT INTO `log` VALUES ('3196', '123', 'addSupportTracking', '1496626792');
INSERT INTO `log` VALUES ('3197', '123', 'updateSupportTracking', '1496626981');
INSERT INTO `log` VALUES ('3198', '123', 'updateSupportTracking', '1496627730');
INSERT INTO `log` VALUES ('3199', '123', 'updateSupportTracking', '1496627886');
INSERT INTO `log` VALUES ('3200', '123', 'updateSupportTracking', '1496627922');
INSERT INTO `log` VALUES ('3201', '123', 'deleteSupportTacking', '1496628424');
INSERT INTO `log` VALUES ('3202', '123', 'deleteSupportTacking', '1496628541');
INSERT INTO `log` VALUES ('3203', '123', 'deleteSupportTacking', '1496628614');
INSERT INTO `log` VALUES ('3204', '123', 'deleteSupportTacking', '1496628677');
INSERT INTO `log` VALUES ('3205', '123', 'login', '1496628781');
INSERT INTO `log` VALUES ('3206', '123', 'deleteSupportTacking', '1496628801');
INSERT INTO `log` VALUES ('3207', '123', 'deleteSupportTacking', '1496629425');
INSERT INTO `log` VALUES ('3208', '123', 'deleteSupportTacking', '1496629523');
INSERT INTO `log` VALUES ('3209', '123', 'login', '1496629567');
INSERT INTO `log` VALUES ('3210', '123', 'deleteSupportTacking', '1496629582');
INSERT INTO `log` VALUES ('3211', '123', 'deleteSupportTacking', '1496629674');
INSERT INTO `log` VALUES ('3212', '123', 'deleteEmployerTracking', '1496629703');
INSERT INTO `log` VALUES ('3213', '123', 'deleteEmployerTracking', '1496629712');
INSERT INTO `log` VALUES ('3214', '123', 'deleteSupportTacking', '1496629774');
INSERT INTO `log` VALUES ('3215', '123', 'deleteSupportTacking', '1496629888');
INSERT INTO `log` VALUES ('3216', '123', 'deleteSupportTacking', '1496629916');
INSERT INTO `log` VALUES ('3217', '123', 'deleteSupportTacking', '1496629948');
INSERT INTO `log` VALUES ('3218', '123', 'deleteSupportTacking', '1496629975');
INSERT INTO `log` VALUES ('3219', '123', 'deleteSupportTacking', '1496630048');
INSERT INTO `log` VALUES ('3220', '123', 'deleteSupportTacking', '1496630086');
INSERT INTO `log` VALUES ('3221', '123', 'deleteSupportTacking', '1496630247');
INSERT INTO `log` VALUES ('3222', '123', 'deleteSupportTacking', '1496630267');
INSERT INTO `log` VALUES ('3223', '123', 'deleteSupportTacking', '1496630471');
INSERT INTO `log` VALUES ('3224', '123', 'deleteSupportTacking', '1496630603');
INSERT INTO `log` VALUES ('3225', '123', 'deleteSupportTacking', '1496630746');
INSERT INTO `log` VALUES ('3226', '123', 'deleteSupportTacking', '1496630779');
INSERT INTO `log` VALUES ('3227', '123', 'deleteSupportTacking', '1496630953');
INSERT INTO `log` VALUES ('3228', '123', 'deleteSupportTacking', '1496631011');
INSERT INTO `log` VALUES ('3229', '123', 'deleteSupportTacking', '1496631088');
INSERT INTO `log` VALUES ('3230', '123', 'deleteSupportTacking', '1496631282');
INSERT INTO `log` VALUES ('3231', '123', 'deleteSupportTacking', '1496631398');
INSERT INTO `log` VALUES ('3232', '123', 'deleteSupportTacking', '1496631410');
INSERT INTO `log` VALUES ('3233', '123', 'login', '1496632136');
INSERT INTO `log` VALUES ('3234', '123', 'getEmployerList', '1496632148');
INSERT INTO `log` VALUES ('3235', '123', 'getPactList', '1496632148');
INSERT INTO `log` VALUES ('3236', '123', 'getEmployerList', '1496632306');
INSERT INTO `log` VALUES ('3237', '123', 'getPactList', '1496632306');
INSERT INTO `log` VALUES ('3238', '123', 'getEmployerList', '1496632442');
INSERT INTO `log` VALUES ('3239', '123', 'getPactList', '1496632442');
INSERT INTO `log` VALUES ('3240', '22', 'login', '1496632456');
INSERT INTO `log` VALUES ('3241', '123', 'login', '1496632460');
INSERT INTO `log` VALUES ('3242', '123', 'getEmployerList', '1496632463');
INSERT INTO `log` VALUES ('3243', '123', 'getPactList', '1496632463');
INSERT INTO `log` VALUES ('3244', '123', 'getEmployerList', '1496632503');
INSERT INTO `log` VALUES ('3245', '123', 'getPactList', '1496632503');
INSERT INTO `log` VALUES ('3246', '123', 'getEmployerList', '1496632738');
INSERT INTO `log` VALUES ('3247', '123', 'getPactList', '1496632738');
INSERT INTO `log` VALUES ('3248', '123', 'getEmployerList', '1496632749');
INSERT INTO `log` VALUES ('3249', '123', 'getPactList', '1496632749');
INSERT INTO `log` VALUES ('3250', '123', 'getEmployerList', '1496632796');
INSERT INTO `log` VALUES ('3251', '123', 'getPactList', '1496632797');
INSERT INTO `log` VALUES ('3252', '123', 'getEmployerList', '1496633259');
INSERT INTO `log` VALUES ('3253', '123', 'getPactList', '1496633260');
INSERT INTO `log` VALUES ('3254', '123', 'deleteSupportTacking', '1496633308');
INSERT INTO `log` VALUES ('3255', '123', 'login', '1496633275');
INSERT INTO `log` VALUES ('3256', '123', 'getEmployerList', '1496633277');
INSERT INTO `log` VALUES ('3257', '123', 'getPactList', '1496633277');
INSERT INTO `log` VALUES ('3258', '123', 'getEmployerList', '1496633304');
INSERT INTO `log` VALUES ('3259', '123', 'getPactList', '1496633304');
INSERT INTO `log` VALUES ('3260', '123', 'getEmployerList', '1496633336');
INSERT INTO `log` VALUES ('3261', '123', 'getPactList', '1496633336');
INSERT INTO `log` VALUES ('3262', '123', 'getEmployerList', '1496633375');
INSERT INTO `log` VALUES ('3263', '123', 'getPactList', '1496633375');
INSERT INTO `log` VALUES ('3264', '123', 'getEmployerList', '1496633414');
INSERT INTO `log` VALUES ('3265', '123', 'getPactList', '1496633414');
INSERT INTO `log` VALUES ('3266', '123', 'getEmployerList', '1496633444');
INSERT INTO `log` VALUES ('3267', '123', 'getPactList', '1496633444');
INSERT INTO `log` VALUES ('3268', '123', 'addPact', '1496633518');
INSERT INTO `log` VALUES ('3269', '123', 'addPact', '1496633550');
INSERT INTO `log` VALUES ('3270', '123', 'deleteSupportTacking', '1496633983');
INSERT INTO `log` VALUES ('3271', '123', 'deleteSupportTacking', '1496634031');
INSERT INTO `log` VALUES ('3272', '123', 'login', '1496634078');
INSERT INTO `log` VALUES ('3273', '123', 'deleteSupportTacking', '1496634103');
INSERT INTO `log` VALUES ('3274', '123', 'getEmployerList', '1496634155');
INSERT INTO `log` VALUES ('3275', '123', 'getPactList', '1496634156');
INSERT INTO `log` VALUES ('3276', '123', 'getEmployerList', '1496634191');
INSERT INTO `log` VALUES ('3277', '123', 'getPactList', '1496634192');
INSERT INTO `log` VALUES ('3278', '123', 'login', '1496634500');
INSERT INTO `log` VALUES ('3279', '123', 'getEmployerList', '1496634488');
INSERT INTO `log` VALUES ('3280', '123', 'getPactList', '1496634488');
INSERT INTO `log` VALUES ('3281', '123', 'deleteSupportTacking', '1496634527');
INSERT INTO `log` VALUES ('3282', '123', 'addPact', '1496634534');
INSERT INTO `log` VALUES ('3283', '123', 'getEmployerList', '1496634708');
INSERT INTO `log` VALUES ('3284', '123', 'getPactList', '1496634708');
INSERT INTO `log` VALUES ('3285', '123', 'login', '1496635061');
INSERT INTO `log` VALUES ('3286', '123', 'getEmployerList', '1496635063');
INSERT INTO `log` VALUES ('3287', '123', 'getPactList', '1496635063');
INSERT INTO `log` VALUES ('3288', '123', 'addPact', '1496635116');
INSERT INTO `log` VALUES ('3289', '123', 'login', '1496640900');
INSERT INTO `log` VALUES ('3290', '123', 'deleteSupportTacking', '1496641009');
INSERT INTO `log` VALUES ('3291', '123', 'deleteSupportTacking', '1496641043');
INSERT INTO `log` VALUES ('3292', '123', 'deleteSupportTacking', '1496641116');
INSERT INTO `log` VALUES ('3293', '123', 'deleteSupportTacking', '1496641304');
INSERT INTO `log` VALUES ('3294', '123', 'deleteSupportTacking', '1496641554');
INSERT INTO `log` VALUES ('3295', '123', 'getEmployerList', '1496641548');
INSERT INTO `log` VALUES ('3296', '123', 'getPactList', '1496641548');
INSERT INTO `log` VALUES ('3297', '123', 'updatePact', '1496641571');
INSERT INTO `log` VALUES ('3298', '123', 'getEmployerList', '1496641663');
INSERT INTO `log` VALUES ('3299', '123', 'getPactList', '1496641664');
INSERT INTO `log` VALUES ('3300', '123', 'deletePact', '1496641674');
INSERT INTO `log` VALUES ('3301', '123', 'getEmployerList', '1496641700');
INSERT INTO `log` VALUES ('3302', '123', 'getPactList', '1496641701');
INSERT INTO `log` VALUES ('3303', '123', 'deletePact', '1496641712');
INSERT INTO `log` VALUES ('3304', '123', 'login', '1496641744');
INSERT INTO `log` VALUES ('3305', '123', 'getEmployerList', '1496641748');
INSERT INTO `log` VALUES ('3306', '123', 'getPactList', '1496641748');
INSERT INTO `log` VALUES ('3307', '123', 'deletePact', '1496641754');
INSERT INTO `log` VALUES ('3308', '123', 'getPactList', '1496641755');
INSERT INTO `log` VALUES ('3309', '123', 'login', '1496641874');
INSERT INTO `log` VALUES ('3310', '123', 'deleteSupportTacking', '1496642008');
INSERT INTO `log` VALUES ('3311', '123', 'deleteSupportTacking', '1496642042');
INSERT INTO `log` VALUES ('3312', '123', 'getEmployerList', '1496642077');
INSERT INTO `log` VALUES ('3313', '123', 'getPactList', '1496642077');
INSERT INTO `log` VALUES ('3314', '123', 'getEmployerList', '1496642093');
INSERT INTO `log` VALUES ('3315', '123', 'getPactList', '1496642093');
INSERT INTO `log` VALUES ('3316', '123', 'getEmployerList', '1496642119');
INSERT INTO `log` VALUES ('3317', '123', 'getPactList', '1496642119');
INSERT INTO `log` VALUES ('3318', '123', 'getEmployerList', '1496642134');
INSERT INTO `log` VALUES ('3319', '123', 'getPactList', '1496642134');
INSERT INTO `log` VALUES ('3320', '123', 'getEmployerList', '1496642145');
INSERT INTO `log` VALUES ('3321', '123', 'getPactList', '1496642146');
INSERT INTO `log` VALUES ('3322', '123', 'deleteSupportTacking', '1496642272');
INSERT INTO `log` VALUES ('3323', '123', 'deleteSupportTacking', '1496642287');
INSERT INTO `log` VALUES ('3324', '123', 'deleteSupportTacking', '1496642395');
INSERT INTO `log` VALUES ('3325', '123', 'deleteSupportTacking', '1496642408');
INSERT INTO `log` VALUES ('3326', '123', 'getEmployerList', '1496642648');
INSERT INTO `log` VALUES ('3327', '123', 'getPactList', '1496642648');
INSERT INTO `log` VALUES ('3328', '123', 'getPactList', '1496642658');
INSERT INTO `log` VALUES ('3329', '123', 'getPactListByStatus', '1496642660');
INSERT INTO `log` VALUES ('3330', '123', 'getPactListByStatus', '1496642661');
INSERT INTO `log` VALUES ('3331', '123', 'getPactListByStatus', '1496642662');
INSERT INTO `log` VALUES ('3332', '123', 'getPactListByStatus', '1496642677');
INSERT INTO `log` VALUES ('3333', '123', 'getPactListByStatus', '1496642677');
INSERT INTO `log` VALUES ('3334', '123', 'getPactList', '1496642679');
INSERT INTO `log` VALUES ('3335', '123', 'getPactListByStatus', '1496642680');
INSERT INTO `log` VALUES ('3336', '123', 'getPactList', '1496642682');
INSERT INTO `log` VALUES ('3337', '123', 'getAuntList', '1496642691');
INSERT INTO `log` VALUES ('3338', '123', 'getLanguageList', '1496642691');
INSERT INTO `log` VALUES ('3339', '123', 'getCookingList', '1496642691');
INSERT INTO `log` VALUES ('3340', '123', 'getSkillList', '1496642691');
INSERT INTO `log` VALUES ('3341', '123', 'getApplianceList', '1496642692');
INSERT INTO `log` VALUES ('3342', '123', 'getJobList', '1496642692');
INSERT INTO `log` VALUES ('3343', '123', 'getCertificateList', '1496642692');
INSERT INTO `log` VALUES ('3344', '123', 'getEmployerList', '1496642874');
INSERT INTO `log` VALUES ('3345', '123', 'getPactList', '1496642875');
INSERT INTO `log` VALUES ('3346', '123', 'getAuntList', '1496642875');
INSERT INTO `log` VALUES ('3347', '123', 'getLanguageList', '1496642875');
INSERT INTO `log` VALUES ('3348', '123', 'getCookingList', '1496642875');
INSERT INTO `log` VALUES ('3349', '123', 'getSkillList', '1496642875');
INSERT INTO `log` VALUES ('3350', '123', 'getApplianceList', '1496642875');
INSERT INTO `log` VALUES ('3351', '123', 'getJobList', '1496642875');
INSERT INTO `log` VALUES ('3352', '123', 'getCertificateList', '1496642876');
INSERT INTO `log` VALUES ('3353', '123', 'getAuntList', '1496642880');
INSERT INTO `log` VALUES ('3354', '123', 'getLanguageList', '1496642880');
INSERT INTO `log` VALUES ('3355', '123', 'getCookingList', '1496642880');
INSERT INTO `log` VALUES ('3356', '123', 'getSkillList', '1496642880');
INSERT INTO `log` VALUES ('3357', '123', 'getApplianceList', '1496642881');
INSERT INTO `log` VALUES ('3358', '123', 'getJobList', '1496642881');
INSERT INTO `log` VALUES ('3359', '123', 'getCertificateList', '1496642881');
INSERT INTO `log` VALUES ('3360', '123', 'getAuntList', '1496643000');
INSERT INTO `log` VALUES ('3361', '123', 'getLanguageList', '1496643000');
INSERT INTO `log` VALUES ('3362', '123', 'getCookingList', '1496643000');
INSERT INTO `log` VALUES ('3363', '123', 'getSkillList', '1496643000');
INSERT INTO `log` VALUES ('3364', '123', 'getApplianceList', '1496643000');
INSERT INTO `log` VALUES ('3365', '123', 'getJobList', '1496643001');
INSERT INTO `log` VALUES ('3366', '123', 'getCertificateList', '1496643001');
INSERT INTO `log` VALUES ('3367', '123', 'login', '1496643035');
INSERT INTO `log` VALUES ('3368', '123', 'getEmployerList', '1496643036');
INSERT INTO `log` VALUES ('3369', '123', 'getPactList', '1496643037');
INSERT INTO `log` VALUES ('3370', '123', 'getAuntList', '1496643039');
INSERT INTO `log` VALUES ('3371', '123', 'getLanguageList', '1496643039');
INSERT INTO `log` VALUES ('3372', '123', 'getCookingList', '1496643039');
INSERT INTO `log` VALUES ('3373', '123', 'getSkillList', '1496643039');
INSERT INTO `log` VALUES ('3374', '123', 'getApplianceList', '1496643039');
INSERT INTO `log` VALUES ('3375', '123', 'getJobList', '1496643039');
INSERT INTO `log` VALUES ('3376', '123', 'getCertificateList', '1496643040');
INSERT INTO `log` VALUES ('3377', '123', 'getAuntList', '1496643075');
INSERT INTO `log` VALUES ('3378', '123', 'getLanguageList', '1496643075');
INSERT INTO `log` VALUES ('3379', '123', 'getCookingList', '1496643075');
INSERT INTO `log` VALUES ('3380', '123', 'getSkillList', '1496643076');
INSERT INTO `log` VALUES ('3381', '123', 'getApplianceList', '1496643076');
INSERT INTO `log` VALUES ('3382', '123', 'getJobList', '1496643076');
INSERT INTO `log` VALUES ('3383', '123', 'getCertificateList', '1496643076');
INSERT INTO `log` VALUES ('3384', '123', 'getAuntList', '1496643167');
INSERT INTO `log` VALUES ('3385', '123', 'getLanguageList', '1496643168');
INSERT INTO `log` VALUES ('3386', '123', 'getCookingList', '1496643168');
INSERT INTO `log` VALUES ('3387', '123', 'getSkillList', '1496643168');
INSERT INTO `log` VALUES ('3388', '123', 'getApplianceList', '1496643168');
INSERT INTO `log` VALUES ('3389', '123', 'getJobList', '1496643168');
INSERT INTO `log` VALUES ('3390', '123', 'getCertificateList', '1496643168');
INSERT INTO `log` VALUES ('3391', '123', 'getAuntList', '1496643220');
INSERT INTO `log` VALUES ('3392', '123', 'getLanguageList', '1496643220');
INSERT INTO `log` VALUES ('3393', '123', 'getCookingList', '1496643221');
INSERT INTO `log` VALUES ('3394', '123', 'getSkillList', '1496643221');
INSERT INTO `log` VALUES ('3395', '123', 'getApplianceList', '1496643221');
INSERT INTO `log` VALUES ('3396', '123', 'getJobList', '1496643221');
INSERT INTO `log` VALUES ('3397', '123', 'getCertificateList', '1496643221');
INSERT INTO `log` VALUES ('3398', '123', 'getAuntList', '1496643351');
INSERT INTO `log` VALUES ('3399', '123', 'getLanguageList', '1496643352');
INSERT INTO `log` VALUES ('3400', '123', 'getCookingList', '1496643352');
INSERT INTO `log` VALUES ('3401', '123', 'getSkillList', '1496643352');
INSERT INTO `log` VALUES ('3402', '123', 'getApplianceList', '1496643352');
INSERT INTO `log` VALUES ('3403', '123', 'getJobList', '1496643352');
INSERT INTO `log` VALUES ('3404', '123', 'getCertificateList', '1496643352');
INSERT INTO `log` VALUES ('3405', '123', 'getAuntList', '1496643396');
INSERT INTO `log` VALUES ('3406', '123', 'getLanguageList', '1496643396');
INSERT INTO `log` VALUES ('3407', '123', 'getCookingList', '1496643396');
INSERT INTO `log` VALUES ('3408', '123', 'getSkillList', '1496643396');
INSERT INTO `log` VALUES ('3409', '123', 'getApplianceList', '1496643396');
INSERT INTO `log` VALUES ('3410', '123', 'getJobList', '1496643397');
INSERT INTO `log` VALUES ('3411', '123', 'getCertificateList', '1496643397');
INSERT INTO `log` VALUES ('3412', '123', 'getAuntList', '1496643416');
INSERT INTO `log` VALUES ('3413', '123', 'getLanguageList', '1496643416');
INSERT INTO `log` VALUES ('3414', '123', 'getCookingList', '1496643416');
INSERT INTO `log` VALUES ('3415', '123', 'getSkillList', '1496643416');
INSERT INTO `log` VALUES ('3416', '123', 'getApplianceList', '1496643417');
INSERT INTO `log` VALUES ('3417', '123', 'getJobList', '1496643417');
INSERT INTO `log` VALUES ('3418', '123', 'getCertificateList', '1496643417');
INSERT INTO `log` VALUES ('3419', '123', 'getAuntList', '1496643475');
INSERT INTO `log` VALUES ('3420', '123', 'getLanguageList', '1496643475');
INSERT INTO `log` VALUES ('3421', '123', 'getCookingList', '1496643475');
INSERT INTO `log` VALUES ('3422', '123', 'getSkillList', '1496643475');
INSERT INTO `log` VALUES ('3423', '123', 'getApplianceList', '1496643475');
INSERT INTO `log` VALUES ('3424', '123', 'getJobList', '1496643475');
INSERT INTO `log` VALUES ('3425', '123', 'getCertificateList', '1496643476');
INSERT INTO `log` VALUES ('3426', '123', 'addAunt', '1496643545');
INSERT INTO `log` VALUES ('3427', '123', 'addAunt', '1496643622');
INSERT INTO `log` VALUES ('3428', '123', 'getAuntList', '1496643624');
INSERT INTO `log` VALUES ('3429', '123', 'getLanguageList', '1496643625');
INSERT INTO `log` VALUES ('3430', '123', 'getCookingList', '1496643625');
INSERT INTO `log` VALUES ('3431', '123', 'getSkillList', '1496643625');
INSERT INTO `log` VALUES ('3432', '123', 'getApplianceList', '1496643625');
INSERT INTO `log` VALUES ('3433', '123', 'getJobList', '1496643625');
INSERT INTO `log` VALUES ('3434', '123', 'getCertificateList', '1496643625');
INSERT INTO `log` VALUES ('3435', '123', 'getAuntById', '1496643630');
INSERT INTO `log` VALUES ('3436', '123', 'updateAunt', '1496643637');
INSERT INTO `log` VALUES ('3437', '123', 'updateAunt', '1496643654');
INSERT INTO `log` VALUES ('3438', '123', 'updateAuntPhoto', '1496643662');
INSERT INTO `log` VALUES ('3439', '123', 'updateAunt', '1496643664');
INSERT INTO `log` VALUES ('3440', '123', 'updateAuntLanguage', '1496643685');
INSERT INTO `log` VALUES ('3441', '123', 'updateAuntCooking', '1496643686');
INSERT INTO `log` VALUES ('3442', '123', 'updateAuntSkill', '1496643688');
INSERT INTO `log` VALUES ('3443', '123', 'updateAuntAppliance', '1496643690');
INSERT INTO `log` VALUES ('3444', '123', 'updateAuntJob', '1496643691');
INSERT INTO `log` VALUES ('3445', '123', 'updateAuntCertificate', '1496643693');
INSERT INTO `log` VALUES ('3446', '123', 'updateAunt', '1496643695');
INSERT INTO `log` VALUES ('3447', '123', 'deleteAunt', '1496643703');
INSERT INTO `log` VALUES ('3448', '123', 'getAuntList', '1496643704');
INSERT INTO `log` VALUES ('3449', '123', 'getLanguageList', '1496643704');
INSERT INTO `log` VALUES ('3450', '123', 'getCookingList', '1496643704');
INSERT INTO `log` VALUES ('3451', '123', 'getSkillList', '1496643704');
INSERT INTO `log` VALUES ('3452', '123', 'getApplianceList', '1496643704');
INSERT INTO `log` VALUES ('3453', '123', 'getJobList', '1496643705');
INSERT INTO `log` VALUES ('3454', '123', 'getCertificateList', '1496643705');
INSERT INTO `log` VALUES ('3455', '123', 'login', '1496648241');
INSERT INTO `log` VALUES ('3456', '123', 'deleteSupportTacking', '1496648259');
INSERT INTO `log` VALUES ('3457', '123', 'getUnAckUserList', '1496649256');
INSERT INTO `log` VALUES ('3458', '123', 'getShareEmployerList', '1496649551');
INSERT INTO `log` VALUES ('3459', '123', 'getShareAuntList', '1496649551');
INSERT INTO `log` VALUES ('3460', '123', 'getUnShareAuntList', '1496649551');
INSERT INTO `log` VALUES ('3461', '123', 'login', '1496651339');
INSERT INTO `log` VALUES ('3462', '123', 'login', '1496652866');
INSERT INTO `log` VALUES ('3463', '123', 'getEmployerList', '1496652867');
INSERT INTO `log` VALUES ('3464', '123', 'getPactList', '1496652867');
INSERT INTO `log` VALUES ('3465', '123', 'getAuntList', '1496652868');
INSERT INTO `log` VALUES ('3466', '123', 'getLanguageList', '1496652868');
INSERT INTO `log` VALUES ('3467', '123', 'getCookingList', '1496652868');
INSERT INTO `log` VALUES ('3468', '123', 'getSkillList', '1496652869');
INSERT INTO `log` VALUES ('3469', '123', 'getApplianceList', '1496652869');
INSERT INTO `log` VALUES ('3470', '123', 'getJobList', '1496652869');
INSERT INTO `log` VALUES ('3471', '123', 'getCertificateList', '1496652869');
INSERT INTO `log` VALUES ('3472', '123', 'login', '1496654224');
INSERT INTO `log` VALUES ('3473', '123', 'getPactList', '1496654270');
INSERT INTO `log` VALUES ('3474', '123', 'getAuntList', '1496654281');
INSERT INTO `log` VALUES ('3475', '123', 'getLanguageList', '1496654281');
INSERT INTO `log` VALUES ('3476', '123', 'getCookingList', '1496654281');
INSERT INTO `log` VALUES ('3477', '123', 'getSkillList', '1496654281');
INSERT INTO `log` VALUES ('3478', '123', 'getApplianceList', '1496654282');
INSERT INTO `log` VALUES ('3479', '123', 'getJobList', '1496654282');
INSERT INTO `log` VALUES ('3480', '123', 'getCertificateList', '1496654282');
INSERT INTO `log` VALUES ('3481', '123', 'getEmployerList', '1496654285');
INSERT INTO `log` VALUES ('3482', '123', 'getPactList', '1496654285');
INSERT INTO `log` VALUES ('3483', '123', 'getHelpListByStatus', '1496654436');
INSERT INTO `log` VALUES ('3484', '123', 'login', '1496654539');
INSERT INTO `log` VALUES ('3485', '123', 'getHelpListByStatus', '1496654546');
INSERT INTO `log` VALUES ('3486', '123', 'login', '1496655723');
INSERT INTO `log` VALUES ('3487', '123', 'getHelpListByStatus', '1496655735');
INSERT INTO `log` VALUES ('3488', '123', 'getHelpListByStatus', '1496656498');
INSERT INTO `log` VALUES ('3489', '123', 'getHelpListByStatus', '1496656612');
INSERT INTO `log` VALUES ('3490', '123', 'getHelpListByStatus', '1496656665');
INSERT INTO `log` VALUES ('3491', '123', 'getHelpListByStatus', '1496656692');
INSERT INTO `log` VALUES ('3492', '123', 'getHelpListByStatus', '1496656711');
INSERT INTO `log` VALUES ('3493', '123', 'login', '1496656723');
INSERT INTO `log` VALUES ('3494', '123', 'getPactList', '1496656726');
INSERT INTO `log` VALUES ('3495', '123', 'getHelpListByStatus', '1496656728');
INSERT INTO `log` VALUES ('3496', '123', 'getHelpListByStatus', '1496656779');
INSERT INTO `log` VALUES ('3497', '2', 'sLogin', '1496657807');
INSERT INTO `log` VALUES ('3498', '2', 'getStaffAuthorityBySid', '1496657836');
INSERT INTO `log` VALUES ('3499', '2', 'getStaffAuthorityBySid', '1496657843');
INSERT INTO `log` VALUES ('3500', '2', 'getStaffAuthorityBySid', '1496657847');
INSERT INTO `log` VALUES ('3501', '2', 'getStaffAuthorityBySid', '1496657849');
INSERT INTO `log` VALUES ('3502', '2', 'getStaffAuthorityBySid', '1496657850');
INSERT INTO `log` VALUES ('3503', '2', 'getStaffAuthorityBySid', '1496657851');
INSERT INTO `log` VALUES ('3504', '2', 'getStaffAuthorityBySid', '1496657855');
INSERT INTO `log` VALUES ('3505', '2', 'getStaffAuthorityBySid', '1496657860');
INSERT INTO `log` VALUES ('3506', '2', 'getStaffAuthorityBySid', '1496657876');
INSERT INTO `log` VALUES ('3507', '2', 'getStaffAuthorityBySid', '1496657879');
INSERT INTO `log` VALUES ('3508', '2', 'sLogin', '1496658032');
INSERT INTO `log` VALUES ('3509', '123', 'getHelpListByStatus', '1496658061');
INSERT INTO `log` VALUES ('3510', '123', 'getHelpListByStatus', '1496658069');
INSERT INTO `log` VALUES ('3511', '123', 'addHelp', '1496658141');
INSERT INTO `log` VALUES ('3512', '2', 'sLogin', '1496658179');
INSERT INTO `log` VALUES ('3513', '123', 'getHelpListByStatus', '1496658143');
INSERT INTO `log` VALUES ('3514', '2', 'sLogin', '1496658425');
INSERT INTO `log` VALUES ('3515', '2', 'getStaffAuthorityById', '1496658487');
INSERT INTO `log` VALUES ('3516', '2', 'sLogin', '1496658643');
INSERT INTO `log` VALUES ('3517', '2', 'getStaffAuthorityById', '1496658653');
INSERT INTO `log` VALUES ('3518', '2', 'sLogin', '1496658737');
INSERT INTO `log` VALUES ('3519', '2', 'getStaffAuthorityById', '1496658745');
INSERT INTO `log` VALUES ('3520', '123', 'getHelpListByStatus', '1496658801');
INSERT INTO `log` VALUES ('3521', '123', 'getHelpListByStatus', '1496658802');
INSERT INTO `log` VALUES ('3522', '2', 'getStaffAuthorityById', '1496658889');
INSERT INTO `log` VALUES ('3523', '2', 'getStaffAuthorityById', '1496659099');
INSERT INTO `log` VALUES ('3524', '123', 'getHelpListByStatus', '1496659116');
INSERT INTO `log` VALUES ('3525', '123', 'getHelpListByStatus', '1496659133');
INSERT INTO `log` VALUES ('3526', '123', 'getHelpListByStatus', '1496659135');
INSERT INTO `log` VALUES ('3527', '123', 'getHelpListByStatus', '1496659136');
INSERT INTO `log` VALUES ('3528', '123', 'getHelpListByStatus', '1496659137');
INSERT INTO `log` VALUES ('3529', '123', 'getHelpListByStatus', '1496659137');
INSERT INTO `log` VALUES ('3530', '123', 'getHelpListByStatus', '1496659138');
INSERT INTO `log` VALUES ('3531', '123', 'getHelpListByStatus', '1496659138');
INSERT INTO `log` VALUES ('3532', '123', 'getHelpListByStatus', '1496659139');
INSERT INTO `log` VALUES ('3533', '123', 'getHelpListByStatus', '1496659141');
INSERT INTO `log` VALUES ('3534', '123', 'getHelpListByStatus', '1496659142');
INSERT INTO `log` VALUES ('3535', '123', 'getHelpListByStatus', '1496659143');
INSERT INTO `log` VALUES ('3536', '123', 'getHelpListByStatus', '1496659144');
INSERT INTO `log` VALUES ('3537', '2', 'sLogin', '1496660050');
INSERT INTO `log` VALUES ('3538', '2', 'getStaffAuthorityById', '1496660058');
INSERT INTO `log` VALUES ('3539', '2', 'getStaffAuthorityById', '1496660074');
INSERT INTO `log` VALUES ('3540', '2', 'sLogin', '1496660204');
INSERT INTO `log` VALUES ('3541', '2', 'getStaffAuthorityById', '1496660213');
INSERT INTO `log` VALUES ('3542', '2', 'sLogin', '1496660256');
INSERT INTO `log` VALUES ('3543', '2', 'getStaffAuthorityById', '1496660269');
INSERT INTO `log` VALUES ('3544', '2', 'sLogin', '1496660373');
INSERT INTO `log` VALUES ('3545', '2', 'getStaffAuthorityById', '1496660381');
INSERT INTO `log` VALUES ('3546', '2', 'sLogin', '1496660465');
INSERT INTO `log` VALUES ('3547', '2', 'getStaffAuthorityById', '1496660472');
INSERT INTO `log` VALUES ('3548', '2', 'sLogin', '1496660664');
INSERT INTO `log` VALUES ('3549', '2', 'getStaffAuthorityById', '1496660671');
INSERT INTO `log` VALUES ('3550', '2', 'sLogin', '1496660859');
INSERT INTO `log` VALUES ('3551', '2', 'getStaffAuthorityById', '1496660868');
INSERT INTO `log` VALUES ('3552', '123', 'login', '1496660895');
INSERT INTO `log` VALUES ('3553', '123', 'getStaffList', '1496660897');
INSERT INTO `log` VALUES ('3554', '123', 'getStaffList', '1496661202');
INSERT INTO `log` VALUES ('3555', '2', 'sLogin', '1496661575');
INSERT INTO `log` VALUES ('3556', '2', 'getStaffAuthorityById', '1496661584');
INSERT INTO `log` VALUES ('3557', '123', 'getShareEmployerList', '1496661590');
INSERT INTO `log` VALUES ('3558', '123', 'getShareAuntList', '1496661590');
INSERT INTO `log` VALUES ('3559', '123', 'getUnShareAuntList', '1496661590');
INSERT INTO `log` VALUES ('3560', '123', 'getStaffList', '1496661592');
INSERT INTO `log` VALUES ('3561', '2', 'sLogin', '1496662754');
INSERT INTO `log` VALUES ('3562', '2', 'getStaffAuthorityById', '1496662763');
INSERT INTO `log` VALUES ('3563', '2', 'sLogin', '1496662861');
INSERT INTO `log` VALUES ('3564', '2', 'getStaffAuthorityById', '1496662871');
INSERT INTO `log` VALUES ('3565', '2', 'sLogin', '1496663014');
INSERT INTO `log` VALUES ('3566', '2', 'getStaffAuthorityById', '1496663022');
INSERT INTO `log` VALUES ('3567', '2', 'sLogin', '1496663067');
INSERT INTO `log` VALUES ('3568', '2', 'getStaffAuthorityById', '1496663077');
INSERT INTO `log` VALUES ('3569', '2', 'sLogin', '1496663442');
INSERT INTO `log` VALUES ('3570', '2', 'getStaffAuthorityById', '1496663451');
INSERT INTO `log` VALUES ('3571', '123', 'login', '1496710702');
INSERT INTO `log` VALUES ('3572', '123', 'getEmployerList', '1496710710');
INSERT INTO `log` VALUES ('3573', '123', 'getPactList', '1496710710');
INSERT INTO `log` VALUES ('3574', '123', 'getAuntList', '1496710728');
INSERT INTO `log` VALUES ('3575', '123', 'getLanguageList', '1496710728');
INSERT INTO `log` VALUES ('3576', '123', 'getCookingList', '1496710728');
INSERT INTO `log` VALUES ('3577', '123', 'getSkillList', '1496710729');
INSERT INTO `log` VALUES ('3578', '123', 'getApplianceList', '1496710729');
INSERT INTO `log` VALUES ('3579', '123', 'getJobList', '1496710729');
INSERT INTO `log` VALUES ('3580', '123', 'getCertificateList', '1496710729');
INSERT INTO `log` VALUES ('3581', '123', 'getAuntList', '1496710921');
INSERT INTO `log` VALUES ('3582', '123', 'getLanguageList', '1496710921');
INSERT INTO `log` VALUES ('3583', '123', 'getCookingList', '1496710921');
INSERT INTO `log` VALUES ('3584', '123', 'getSkillList', '1496710922');
INSERT INTO `log` VALUES ('3585', '123', 'getApplianceList', '1496710922');
INSERT INTO `log` VALUES ('3586', '123', 'getJobList', '1496710922');
INSERT INTO `log` VALUES ('3587', '123', 'getCertificateList', '1496710922');
INSERT INTO `log` VALUES ('3588', '123', 'getEmployerList', '1496710922');
INSERT INTO `log` VALUES ('3589', '123', 'getPactList', '1496710922');
INSERT INTO `log` VALUES ('3590', '123', 'getEmployerList', '1496710928');
INSERT INTO `log` VALUES ('3591', '123', 'getPactList', '1496710929');
INSERT INTO `log` VALUES ('3592', '123', 'getEmployerList', '1496710930');
INSERT INTO `log` VALUES ('3593', '123', 'getPactList', '1496710930');
INSERT INTO `log` VALUES ('3594', '123', 'getStaffList', '1496710944');
INSERT INTO `log` VALUES ('3595', '123', 'login', '1496711240');
INSERT INTO `log` VALUES ('3596', '123', 'getStaffList', '1496711242');
INSERT INTO `log` VALUES ('3597', '123', 'getStaffList', '1496711264');
INSERT INTO `log` VALUES ('3598', '123', 'getStaffList', '1496711287');
INSERT INTO `log` VALUES ('3599', '123', 'getStaffList', '1496711300');
INSERT INTO `log` VALUES ('3600', '123', 'getStaffList', '1496711323');
INSERT INTO `log` VALUES ('3601', '123', 'getStaffList', '1496711347');
INSERT INTO `log` VALUES ('3602', '123', 'getStaffList', '1496711396');
INSERT INTO `log` VALUES ('3603', '123', 'getStaffList', '1496711407');
INSERT INTO `log` VALUES ('3604', '123', 'getStaffList', '1496711473');
INSERT INTO `log` VALUES ('3605', '123', 'getStaffList', '1496711486');
INSERT INTO `log` VALUES ('3606', '123', 'getStaffList', '1496711498');
INSERT INTO `log` VALUES ('3607', '123', 'getStaffList', '1496711562');
INSERT INTO `log` VALUES ('3608', '123', 'login', '1496711649');
INSERT INTO `log` VALUES ('3609', '123', 'getStaffList', '1496711651');
INSERT INTO `log` VALUES ('3610', '123', 'getStaffList', '1496711675');
INSERT INTO `log` VALUES ('3611', '123', 'getStaffList', '1496711689');
INSERT INTO `log` VALUES ('3612', '123', 'getStaffList', '1496711714');
INSERT INTO `log` VALUES ('3613', '123', 'getStaffList', '1496711735');
INSERT INTO `log` VALUES ('3614', '123', 'getStaffList', '1496711755');
INSERT INTO `log` VALUES ('3615', '123', 'getStaffList', '1496711768');
INSERT INTO `log` VALUES ('3616', '123', 'getStaffList', '1496711783');
INSERT INTO `log` VALUES ('3617', '123', 'getStaffList', '1496711798');
INSERT INTO `log` VALUES ('3618', '123', 'getStaffList', '1496711813');
INSERT INTO `log` VALUES ('3619', '123', 'getStaffList', '1496711831');
INSERT INTO `log` VALUES ('3620', '123', 'getStaffList', '1496711857');
INSERT INTO `log` VALUES ('3621', '123', 'getStaffList', '1496711874');
INSERT INTO `log` VALUES ('3622', '123', 'getStaffList', '1496711891');
INSERT INTO `log` VALUES ('3623', '123', 'getStaffList', '1496711916');
INSERT INTO `log` VALUES ('3624', '123', 'getStaffList', '1496711916');
INSERT INTO `log` VALUES ('3625', '123', 'getStaffList', '1496711929');
INSERT INTO `log` VALUES ('3626', '123', 'getStaffList', '1496711943');
INSERT INTO `log` VALUES ('3627', '123', 'getStaffList', '1496711961');
INSERT INTO `log` VALUES ('3628', '123', 'getStaffList', '1496711977');
INSERT INTO `log` VALUES ('3629', '123', 'getStaffList', '1496711989');
INSERT INTO `log` VALUES ('3630', '123', 'getEmployerList', '1496712002');
INSERT INTO `log` VALUES ('3631', '123', 'getPactList', '1496712002');
INSERT INTO `log` VALUES ('3632', '123', 'getStaffList', '1496712022');
INSERT INTO `log` VALUES ('3633', '123', 'getStaffList', '1496712037');
INSERT INTO `log` VALUES ('3634', '123', 'getStaffList', '1496712057');
INSERT INTO `log` VALUES ('3635', '123', 'getStaffList', '1496712072');
INSERT INTO `log` VALUES ('3636', '123', 'getStaffList', '1496712129');
INSERT INTO `log` VALUES ('3637', '123', 'getStaffList', '1496712152');
INSERT INTO `log` VALUES ('3638', '123', 'getStaffList', '1496712266');
INSERT INTO `log` VALUES ('3639', '123', 'getStaffList', '1496712351');
INSERT INTO `log` VALUES ('3640', '123', 'getStaffList', '1496712361');
INSERT INTO `log` VALUES ('3641', '123', 'getStaffList', '1496712385');
INSERT INTO `log` VALUES ('3642', '123', 'getStaffList', '1496712385');
INSERT INTO `log` VALUES ('3643', '123', 'getStaffList', '1496712386');
INSERT INTO `log` VALUES ('3644', '123', 'getShareEmployerList', '1496713064');
INSERT INTO `log` VALUES ('3645', '123', 'getShareAuntList', '1496713064');
INSERT INTO `log` VALUES ('3646', '123', 'getUnShareAuntList', '1496713064');
INSERT INTO `log` VALUES ('3647', '123', 'getShareEmployerList', '1496713397');
INSERT INTO `log` VALUES ('3648', '123', 'getShareAuntList', '1496713397');
INSERT INTO `log` VALUES ('3649', '123', 'getUnShareAuntList', '1496713397');
INSERT INTO `log` VALUES ('3650', '123', 'login', '1496713411');
INSERT INTO `log` VALUES ('3651', '123', 'getStaffList', '1496713416');
INSERT INTO `log` VALUES ('3652', '123', 'getShareEmployerList', '1496713417');
INSERT INTO `log` VALUES ('3653', '123', 'getShareAuntList', '1496713418');
INSERT INTO `log` VALUES ('3654', '123', 'getUnShareAuntList', '1496713418');
INSERT INTO `log` VALUES ('3655', '123', 'getStaffList', '1496713981');
INSERT INTO `log` VALUES ('3656', '123', 'getShareEmployerList', '1496713983');
INSERT INTO `log` VALUES ('3657', '123', 'getShareAuntList', '1496713983');
INSERT INTO `log` VALUES ('3658', '123', 'getUnShareAuntList', '1496713983');
INSERT INTO `log` VALUES ('3659', '123', 'getShareEmployerList', '1496713994');
INSERT INTO `log` VALUES ('3660', '123', 'getShareAuntList', '1496713994');
INSERT INTO `log` VALUES ('3661', '123', 'getUnShareAuntList', '1496713995');
INSERT INTO `log` VALUES ('3662', '123', 'getShareEmployerList', '1496714114');
INSERT INTO `log` VALUES ('3663', '123', 'getShareAuntList', '1496714114');
INSERT INTO `log` VALUES ('3664', '123', 'getUnShareAuntList', '1496714114');
INSERT INTO `log` VALUES ('3665', '123', 'getShareEmployerList', '1496714768');
INSERT INTO `log` VALUES ('3666', '123', 'getShareAuntList', '1496714768');
INSERT INTO `log` VALUES ('3667', '123', 'getUnShareAuntList', '1496714768');
INSERT INTO `log` VALUES ('3668', '123', 'login', '1496715689');
INSERT INTO `log` VALUES ('3669', '123', 'getStaffList', '1496715691');
INSERT INTO `log` VALUES ('3670', '123', 'getStaffList', '1496715767');
INSERT INTO `log` VALUES ('3671', '123', 'getStaffList', '1496715940');
INSERT INTO `log` VALUES ('3672', '123', 'getStaffList', '1496715974');
INSERT INTO `log` VALUES ('3673', '123', 'getStaffList', '1496715975');
INSERT INTO `log` VALUES ('3674', '123', 'getStaffList', '1496716149');
INSERT INTO `log` VALUES ('3675', '123', 'login', '1496717163');
INSERT INTO `log` VALUES ('3676', '123', 'getEmployerList', '1496717302');
INSERT INTO `log` VALUES ('3677', '123', 'getPactList', '1496717302');
INSERT INTO `log` VALUES ('3678', '123', 'getAuntList', '1496717310');
INSERT INTO `log` VALUES ('3679', '123', 'getLanguageList', '1496717310');
INSERT INTO `log` VALUES ('3680', '123', 'getCookingList', '1496717310');
INSERT INTO `log` VALUES ('3681', '123', 'getSkillList', '1496717310');
INSERT INTO `log` VALUES ('3682', '123', 'getApplianceList', '1496717311');
INSERT INTO `log` VALUES ('3683', '123', 'getJobList', '1496717311');
INSERT INTO `log` VALUES ('3684', '123', 'getCertificateList', '1496717311');
INSERT INTO `log` VALUES ('3685', '123', 'getAuntList', '1496717314');
INSERT INTO `log` VALUES ('3686', '123', 'getLanguageList', '1496717314');
INSERT INTO `log` VALUES ('3687', '123', 'getCookingList', '1496717314');
INSERT INTO `log` VALUES ('3688', '123', 'getSkillList', '1496717314');
INSERT INTO `log` VALUES ('3689', '123', 'getApplianceList', '1496717314');
INSERT INTO `log` VALUES ('3690', '123', 'getJobList', '1496717315');
INSERT INTO `log` VALUES ('3691', '123', 'getCertificateList', '1496717315');
INSERT INTO `log` VALUES ('3692', '123', 'getHelpListByStatus', '1496717345');
INSERT INTO `log` VALUES ('3693', '123', 'getStaffList', '1496717347');
INSERT INTO `log` VALUES ('3694', '123', 'getHelpListByStatus', '1496717546');
INSERT INTO `log` VALUES ('3695', '123', 'getStaffList', '1496717548');
INSERT INTO `log` VALUES ('3696', '123', 'getStaffList', '1496717551');
INSERT INTO `log` VALUES ('3697', '123', 'getStaffList', '1496717554');
INSERT INTO `log` VALUES ('3698', '123', 'getStaffList', '1496717557');
INSERT INTO `log` VALUES ('3699', '123', 'getStaffList', '1496717559');
INSERT INTO `log` VALUES ('3700', '123', 'getShareEmployerList', '1496717986');
INSERT INTO `log` VALUES ('3701', '123', 'getShareEmployerList', '1496718006');
INSERT INTO `log` VALUES ('3702', '123', 'getUnShareEmployerList', '1496718008');
INSERT INTO `log` VALUES ('3703', '123', 'getShareAuntList', '1496718012');
INSERT INTO `log` VALUES ('3704', '123', 'getUnShareAuntList', '1496718015');
INSERT INTO `log` VALUES ('3705', '123', 'getShareAuntList', '1496718025');
INSERT INTO `log` VALUES ('3706', '123', 'getUnShareAuntList', '1496718027');
INSERT INTO `log` VALUES ('3707', '123', 'getShareEmployerList', '1496718029');
INSERT INTO `log` VALUES ('3708', '123', 'getUnShareEmployerList', '1496718031');
INSERT INTO `log` VALUES ('3709', '123', 'getShareAuntList', '1496718036');
INSERT INTO `log` VALUES ('3710', '123', 'getShareEmployerList', '1496719411');
INSERT INTO `log` VALUES ('3711', '123', 'getShareEmployerList', '1496719466');
INSERT INTO `log` VALUES ('3712', '123', 'getStaffList', '1496719502');
INSERT INTO `log` VALUES ('3713', '123', 'getShareEmployerList', '1496719505');
INSERT INTO `log` VALUES ('3714', '2', 'sLogin', '1496719578');
INSERT INTO `log` VALUES ('3715', '2', 'getStaffAuthorityById', '1496719591');
INSERT INTO `log` VALUES ('3716', '123', 'getShareEmployerList', '1496719559');
INSERT INTO `log` VALUES ('3717', '123', 'getStaffList', '1496719563');
INSERT INTO `log` VALUES ('3718', '123', 'getShareEmployerList', '1496719565');
INSERT INTO `log` VALUES ('3719', '123', 'getShareEmployerList', '1496719571');
INSERT INTO `log` VALUES ('3720', '123', 'getShareEmployerList', '1496719573');
INSERT INTO `log` VALUES ('3721', '123', 'getShareEmployerList', '1496719577');
INSERT INTO `log` VALUES ('3722', '123', 'getShareEmployerList', '1496719629');
INSERT INTO `log` VALUES ('3723', '123', 'getUnShareEmployerList', '1496719638');
INSERT INTO `log` VALUES ('3724', '123', 'getShareEmployerList', '1496719648');
INSERT INTO `log` VALUES ('3725', '123', 'getUnShareEmployerList', '1496719650');
INSERT INTO `log` VALUES ('3726', '123', 'getShareEmployerList', '1496719723');
INSERT INTO `log` VALUES ('3727', '123', 'getUnShareEmployerList', '1496719728');
INSERT INTO `log` VALUES ('3728', '123', 'getShareEmployerList', '1496719735');
INSERT INTO `log` VALUES ('3729', '2', 'sLogin', '1496719774');
INSERT INTO `log` VALUES ('3730', '2', 'getStaffAuthorityById', '1496719780');
INSERT INTO `log` VALUES ('3731', '123', 'getShareAuntList', '1496719742');
INSERT INTO `log` VALUES ('3732', '123', 'getUnShareAuntList', '1496719749');
INSERT INTO `log` VALUES ('3733', '2', 'sLogin', '1496719879');
INSERT INTO `log` VALUES ('3734', '2', 'getStaffAuthorityById', '1496719890');
INSERT INTO `log` VALUES ('3735', '123', 'getShareEmployerList', '1496719863');
INSERT INTO `log` VALUES ('3736', '123', 'getShareAuntList', '1496719865');
INSERT INTO `log` VALUES ('3737', '123', 'getUnShareEmployerList', '1496719866');
INSERT INTO `log` VALUES ('3738', '123', 'getShareAuntList', '1496719868');
INSERT INTO `log` VALUES ('3739', '2', 'sLogin', '1496720011');
INSERT INTO `log` VALUES ('3740', '2', 'getStaffAuthorityById', '1496720022');
INSERT INTO `log` VALUES ('3741', '123', 'getShareEmployerList', '1496720030');
INSERT INTO `log` VALUES ('3742', '123', 'getShareAuntList', '1496720034');
INSERT INTO `log` VALUES ('3743', '123', 'getUnShareEmployerList', '1496720036');
INSERT INTO `log` VALUES ('3744', '123', 'getShareAuntList', '1496720037');
INSERT INTO `log` VALUES ('3745', '123', 'getUnShareEmployerList', '1496720039');
INSERT INTO `log` VALUES ('3746', '123', 'getShareAuntList', '1496720041');
INSERT INTO `log` VALUES ('3747', '123', 'getShareEmployerList', '1496720043');
INSERT INTO `log` VALUES ('3748', '123', 'getUnShareAuntList', '1496720044');
INSERT INTO `log` VALUES ('3749', '123', 'getShareEmployerList', '1496720179');
INSERT INTO `log` VALUES ('3750', '123', 'getShareEmployerList', '1496720246');
INSERT INTO `log` VALUES ('3751', '123', 'getShareEmployerList', '1496720506');
INSERT INTO `log` VALUES ('3752', '123', 'getShareEmployerList', '1496720513');
INSERT INTO `log` VALUES ('3753', '123', 'getUnShareEmployerList', '1496720515');
INSERT INTO `log` VALUES ('3754', '123', 'getShareAuntList', '1496720518');
INSERT INTO `log` VALUES ('3755', '123', 'getUnShareAuntList', '1496720519');
INSERT INTO `log` VALUES ('3756', '123', 'getShareEmployerList', '1496720554');
INSERT INTO `log` VALUES ('3757', '123', 'getShareEmployerList', '1496720555');
INSERT INTO `log` VALUES ('3758', '123', 'getShareEmployerList', '1496720573');
INSERT INTO `log` VALUES ('3759', '123', 'getShareEmployerList', '1496720595');
INSERT INTO `log` VALUES ('3760', '123', 'getShareEmployerList', '1496720606');
INSERT INTO `log` VALUES ('3761', '123', 'getUnShareEmployerList', '1496720620');
INSERT INTO `log` VALUES ('3762', '123', 'getShareAuntList', '1496720622');
INSERT INTO `log` VALUES ('3763', '123', 'getUnShareAuntList', '1496720623');
INSERT INTO `log` VALUES ('3764', '2', 'getStaffAuthorityById', '1496720688');
INSERT INTO `log` VALUES ('3765', '123', 'getShareEmployerList', '1496720648');
INSERT INTO `log` VALUES ('3766', '123', 'getShareEmployerList', '1496720685');
INSERT INTO `log` VALUES ('3767', '2', 'sLogin', '1496720736');
INSERT INTO `log` VALUES ('3768', '2', 'getStaffAuthorityById', '1496720745');
INSERT INTO `log` VALUES ('3769', '123', 'getShareEmployerList', '1496720721');
INSERT INTO `log` VALUES ('3770', '2', 'getStaffAuthorityById', '1496720764');
INSERT INTO `log` VALUES ('3771', '123', 'getShareEmployerList', '1496720734');
INSERT INTO `log` VALUES ('3772', '123', 'getUnShareEmployerList', '1496720736');
INSERT INTO `log` VALUES ('3773', '2', 'getStaffAuthorityById', '1496720775');
INSERT INTO `log` VALUES ('3774', '123', 'getShareAuntList', '1496720738');
INSERT INTO `log` VALUES ('3775', '123', 'getUnShareAuntList', '1496720739');
INSERT INTO `log` VALUES ('3776', '123', 'getShareEmployerList', '1496720743');
INSERT INTO `log` VALUES ('3777', '123', 'getShareEmployerList', '1496721029');
INSERT INTO `log` VALUES ('3778', '123', 'getShareAuntList', '1496721034');
INSERT INTO `log` VALUES ('3779', '123', 'getShareEmployerList', '1496721442');
INSERT INTO `log` VALUES ('3780', '123', 'getShareAuntList', '1496721445');
INSERT INTO `log` VALUES ('3781', '123', 'getShareEmployerList', '1496721523');
INSERT INTO `log` VALUES ('3782', '123', 'getUnShareEmployerList', '1496721540');
INSERT INTO `log` VALUES ('3783', '123', 'getShareAuntList', '1496721543');
INSERT INTO `log` VALUES ('3784', '123', 'getShareAuntList', '1496721549');
INSERT INTO `log` VALUES ('3785', '123', 'getShareAuntList', '1496721550');
INSERT INTO `log` VALUES ('3786', '123', 'getUnShareAuntList', '1496721564');
INSERT INTO `log` VALUES ('3787', '123', 'getShareAuntList', '1496721573');
INSERT INTO `log` VALUES ('3788', '123', 'getShareEmployerList', '1496729090');
INSERT INTO `log` VALUES ('3789', '123', 'deleteShareEmployer', '1496729100');
INSERT INTO `log` VALUES ('3790', '123', 'getShareEmployerList', '1496729103');
INSERT INTO `log` VALUES ('3791', '123', 'getShareEmployerList', '1496729197');
INSERT INTO `log` VALUES ('3792', '123', 'getShareAuntList', '1496729199');
INSERT INTO `log` VALUES ('3793', '123', 'deleteShareAunt', '1496729209');
INSERT INTO `log` VALUES ('3794', '123', 'getShareEmployerList', '1496729210');
INSERT INTO `log` VALUES ('3795', '123', 'getShareAuntList', '1496729219');
INSERT INTO `log` VALUES ('3796', '123', 'getUnShareAuntList', '1496729324');
INSERT INTO `log` VALUES ('3797', '123', 'getShareAuntList', '1496729349');
INSERT INTO `log` VALUES ('3798', '123', 'getShareEmployerList', '1496729958');
INSERT INTO `log` VALUES ('3799', '123', 'getShareAuntList', '1496729961');
INSERT INTO `log` VALUES ('3800', '123', 'deleteShareAunt', '1496729964');
INSERT INTO `log` VALUES ('3801', '123', 'getShareEmployerList', '1496729966');
INSERT INTO `log` VALUES ('3802', '123', 'getShareEmployerList', '1496730445');
INSERT INTO `log` VALUES ('3803', '123', 'getShareEmployerList', '1496730526');
INSERT INTO `log` VALUES ('3804', '123', 'getShareEmployerList', '1496730678');
INSERT INTO `log` VALUES ('3805', '2', 'sLogin', '1496730896');
INSERT INTO `log` VALUES ('3806', '2', 'getSupportTrackingByStatus', '1496730910');
INSERT INTO `log` VALUES ('3807', '123', 'getShareEmployerList', '1496730956');
INSERT INTO `log` VALUES ('3808', '2', 'sLogin', '1496731029');
INSERT INTO `log` VALUES ('3809', '2', 'getChildByParent', '1496731048');
INSERT INTO `log` VALUES ('3810', '2', 'getChildByParent', '1496731062');
INSERT INTO `log` VALUES ('3811', '123', 'getShareEmployerList', '1496731171');
INSERT INTO `log` VALUES ('3812', '123', 'getShareEmployerList', '1496731295');
INSERT INTO `log` VALUES ('3813', '123', 'getShareEmployerList', '1496731486');
INSERT INTO `log` VALUES ('3814', '123', 'getShareEmployerList', '1496731505');
INSERT INTO `log` VALUES ('3815', '123', 'updateShareEmployer', '1496731516');
INSERT INTO `log` VALUES ('3816', '123', 'getShareEmployerList', '1496731653');
INSERT INTO `log` VALUES ('3817', '123', 'updateShareEmployer', '1496731675');
INSERT INTO `log` VALUES ('3818', '123', 'getShareEmployerList', '1496731858');
INSERT INTO `log` VALUES ('3819', '123', 'getStaffList', '1496731961');
INSERT INTO `log` VALUES ('3820', '123', 'getShareEmployerList', '1496731962');
INSERT INTO `log` VALUES ('3821', '123', 'updateShareEmployer', '1496731984');
INSERT INTO `log` VALUES ('3822', '123', 'getShareEmployerList', '1496731985');
INSERT INTO `log` VALUES ('3823', '123', 'login', '1496732579');
INSERT INTO `log` VALUES ('3824', '123', 'getEmployerList', '1496732581');
INSERT INTO `log` VALUES ('3825', '123', 'getPactList', '1496732581');
INSERT INTO `log` VALUES ('3826', '123', 'getShareEmployerList', '1496732583');
INSERT INTO `log` VALUES ('3827', '123', 'getHelpListByStatus', '1496732651');
INSERT INTO `log` VALUES ('3828', '123', 'getShareEmployerList', '1496732652');
INSERT INTO `log` VALUES ('3829', '123', 'addShareEmployer', '1496732718');
INSERT INTO `log` VALUES ('3830', '123', 'getShareEmployerList', '1496732720');
INSERT INTO `log` VALUES ('3831', '123', 'getShareAuntList', '1496732902');
INSERT INTO `log` VALUES ('3832', '123', 'getShareEmployerList', '1496733344');
INSERT INTO `log` VALUES ('3833', '123', 'getShareAuntList', '1496733347');
INSERT INTO `log` VALUES ('3834', '123', 'addShareAunt', '1496733393');
INSERT INTO `log` VALUES ('3835', '123', 'getShareEmployerList', '1496733394');
INSERT INTO `log` VALUES ('3836', '123', 'getShareAuntList', '1496733396');
INSERT INTO `log` VALUES ('3837', '123', 'getShareEmployerList', '1496733465');
INSERT INTO `log` VALUES ('3838', '123', 'getShareAuntList', '1496733468');
INSERT INTO `log` VALUES ('3839', '123', 'getShareEmployerList', '1496733572');
INSERT INTO `log` VALUES ('3840', '123', 'getShareAuntList', '1496733574');
INSERT INTO `log` VALUES ('3841', '123', 'getShareEmployerList', '1496733689');
INSERT INTO `log` VALUES ('3842', '123', 'getShareAuntList', '1496733694');
INSERT INTO `log` VALUES ('3843', '123', 'getHelpListByStatus', '1496733739');
INSERT INTO `log` VALUES ('3844', '123', 'getShareEmployerList', '1496733740');
INSERT INTO `log` VALUES ('3845', '123', 'getShareAuntList', '1496733742');
INSERT INTO `log` VALUES ('3846', '123', 'updateShareAunt', '1496733752');
INSERT INTO `log` VALUES ('3847', '123', 'getShareEmployerList', '1496733753');
INSERT INTO `log` VALUES ('3848', '123', 'getShareAuntList', '1496733756');
INSERT INTO `log` VALUES ('3849', '123', 'getShareEmployerList', '1496734245');
INSERT INTO `log` VALUES ('3850', '123', 'getShareEmployerList', '1496734333');
INSERT INTO `log` VALUES ('3851', '123', 'getShareEmployerList', '1496734957');
INSERT INTO `log` VALUES ('3852', '123', 'login', '1496734972');
INSERT INTO `log` VALUES ('3853', '123', 'getShareEmployerList', '1496734975');
INSERT INTO `log` VALUES ('3854', '123', 'getShareEmployerList', '1496735197');
INSERT INTO `log` VALUES ('3855', '123', 'getShareEmployerList', '1496735209');
INSERT INTO `log` VALUES ('3856', '123', 'login', '1496735294');
INSERT INTO `log` VALUES ('3857', '123', 'getPactList', '1496735296');
INSERT INTO `log` VALUES ('3858', '123', 'getShareEmployerList', '1496735300');
INSERT INTO `log` VALUES ('3859', '123', 'getShareEmployerList', '1496735860');
INSERT INTO `log` VALUES ('3860', '123', 'getStaffList', '1496735861');
INSERT INTO `log` VALUES ('3861', '123', 'getShareEmployerList', '1496735862');
INSERT INTO `log` VALUES ('3862', '123', 'login', '1496735876');
INSERT INTO `log` VALUES ('3863', '123', 'getShareEmployerList', '1496735879');
INSERT INTO `log` VALUES ('3864', '123', 'login', '1496735972');
INSERT INTO `log` VALUES ('3865', '123', 'getShareEmployerList', '1496735974');
INSERT INTO `log` VALUES ('3866', '123', 'getShareEmployerList', '1496735978');
INSERT INTO `log` VALUES ('3867', '123', 'getUnShareEmployerList', '1496735979');
INSERT INTO `log` VALUES ('3868', '123', 'getShareAuntList', '1496735982');
INSERT INTO `log` VALUES ('3869', '123', 'login', '1496737791');
INSERT INTO `log` VALUES ('3870', '123', 'getStaffList', '1496737794');
INSERT INTO `log` VALUES ('3871', '123', 'getShareEmployerList', '1496737795');
INSERT INTO `log` VALUES ('3872', '123', 'getShareEmployerList', '1496738231');
INSERT INTO `log` VALUES ('3873', '123', 'getShareEmployerList', '1496738483');
INSERT INTO `log` VALUES ('3874', '123', 'getShareEmployerList', '1496738561');
INSERT INTO `log` VALUES ('3875', '123', 'getShareEmployerList', '1496738587');
INSERT INTO `log` VALUES ('3876', '123', 'getShareEmployerList', '1496738687');
INSERT INTO `log` VALUES ('3877', '123', 'login', '1496738708');
INSERT INTO `log` VALUES ('3878', '123', 'getShareEmployerList', '1496738709');
INSERT INTO `log` VALUES ('3879', '123', 'getShareEmployerList', '1496738990');
INSERT INTO `log` VALUES ('3880', '123', 'login', '1496739147');
INSERT INTO `log` VALUES ('3881', '123', 'getShareEmployerList', '1496739149');
INSERT INTO `log` VALUES ('3882', '123', 'login', '1496739265');
INSERT INTO `log` VALUES ('3883', '123', 'getShareEmployerList', '1496739268');
INSERT INTO `log` VALUES ('3884', '123', 'getShareEmployerList', '1496739300');
INSERT INTO `log` VALUES ('3885', '123', 'getShareEmployerList', '1496739337');
INSERT INTO `log` VALUES ('3886', '123', 'getHelpListByStatus', '1496739791');
INSERT INTO `log` VALUES ('3887', '123', 'getShareEmployerList', '1496739875');
INSERT INTO `log` VALUES ('3888', '123', 'getShareEmployerList', '1496739892');
INSERT INTO `log` VALUES ('3889', '123', 'getUnShareEmployerList', '1496739898');
INSERT INTO `log` VALUES ('3890', '123', 'getShareEmployerList', '1496739900');
INSERT INTO `log` VALUES ('3891', '123', 'getShareEmployerList', '1496739911');
INSERT INTO `log` VALUES ('3892', '123', 'getUnShareEmployerList', '1496739919');
INSERT INTO `log` VALUES ('3893', '123', 'getShareEmployerList', '1496739921');
INSERT INTO `log` VALUES ('3894', '123', 'login', '1496739967');
INSERT INTO `log` VALUES ('3895', '123', 'getShareEmployerList', '1496739971');
INSERT INTO `log` VALUES ('3896', '123', 'getShareEmployerList', '1496739998');
INSERT INTO `log` VALUES ('3897', '123', 'getUnShareEmployerList', '1496740001');
INSERT INTO `log` VALUES ('3898', '123', 'getShareEmployerList', '1496740003');
INSERT INTO `log` VALUES ('3899', '123', 'getUnShareEmployerList', '1496740984');
INSERT INTO `log` VALUES ('3900', '123', 'getShareEmployerList', '1496740989');
INSERT INTO `log` VALUES ('3901', '123', 'getUnShareEmployerList', '1496740990');
INSERT INTO `log` VALUES ('3902', '123', 'getShareEmployerList', '1496740992');
INSERT INTO `log` VALUES ('3903', '123', 'getShareAuntList', '1496741006');
INSERT INTO `log` VALUES ('3904', '123', 'getUnShareAuntList', '1496741008');
INSERT INTO `log` VALUES ('3905', '123', 'getShareEmployerList', '1496741009');
INSERT INTO `log` VALUES ('3906', '123', 'getShareEmployerList', '1496741080');
INSERT INTO `log` VALUES ('3907', '123', 'getShareEmployerList', '1496741087');
INSERT INTO `log` VALUES ('3908', '123', 'getUnShareEmployerList', '1496741088');
INSERT INTO `log` VALUES ('3909', '123', 'getShareAuntList', '1496741089');
INSERT INTO `log` VALUES ('3910', '123', 'getShareEmployerList', '1496741164');
INSERT INTO `log` VALUES ('3911', '123', 'getShareEmployerList', '1496741167');
INSERT INTO `log` VALUES ('3912', '123', 'getUnShareEmployerList', '1496741169');
INSERT INTO `log` VALUES ('3913', '123', 'getShareEmployerList', '1496741171');
INSERT INTO `log` VALUES ('3914', '123', 'getShareEmployerList', '1496741174');
INSERT INTO `log` VALUES ('3915', '123', 'getShareEmployerList', '1496741175');
INSERT INTO `log` VALUES ('3916', '123', 'getShareEmployerList', '1496741178');
INSERT INTO `log` VALUES ('3917', '123', 'getShareEmployerList', '1496741180');
INSERT INTO `log` VALUES ('3918', '123', 'getStaffList', '1496741324');
INSERT INTO `log` VALUES ('3919', '123', 'getShareEmployerList', '1496741327');
INSERT INTO `log` VALUES ('3920', '123', 'getShareEmployerList', '1496741480');
INSERT INTO `log` VALUES ('3921', '123', 'getShareEmployerList', '1496741482');
INSERT INTO `log` VALUES ('3922', '123', 'getUnShareEmployerList', '1496741484');
INSERT INTO `log` VALUES ('3923', '123', 'getShareEmployerList', '1496741486');
INSERT INTO `log` VALUES ('3924', '123', 'getShareEmployerList', '1496742693');
INSERT INTO `log` VALUES ('3925', '123', 'getShareEmployerList', '1496742805');
INSERT INTO `log` VALUES ('3926', '123', 'getShareEmployerList', '1496742851');
INSERT INTO `log` VALUES ('3927', '123', 'getShareEmployerList', '1496743181');
INSERT INTO `log` VALUES ('3928', '123', 'getShareEmployerList', '1496743210');
INSERT INTO `log` VALUES ('3929', '123', 'getShareEmployerList', '1496743276');
INSERT INTO `log` VALUES ('3930', '123', 'getShareEmployerList', '1496743309');
INSERT INTO `log` VALUES ('3931', '123', 'getShareEmployerList', '1496743388');
INSERT INTO `log` VALUES ('3932', '123', 'getShareEmployerList', '1496743406');
INSERT INTO `log` VALUES ('3933', '123', 'getShareEmployerList', '1496743421');
INSERT INTO `log` VALUES ('3934', '123', 'getShareEmployerList', '1496743423');
INSERT INTO `log` VALUES ('3935', '123', 'getStaffList', '1496743482');
INSERT INTO `log` VALUES ('3936', '123', 'getShareEmployerList', '1496743484');
INSERT INTO `log` VALUES ('3937', '123', 'getShareEmployerList', '1496743492');
INSERT INTO `log` VALUES ('3938', '123', 'getUnShareEmployerList', '1496743495');
INSERT INTO `log` VALUES ('3939', '123', 'getShareEmployerList', '1496743497');
INSERT INTO `log` VALUES ('3940', '123', 'getShareEmployerList', '1496744243');
INSERT INTO `log` VALUES ('3941', '123', 'getShareEmployerList', '1496744365');
INSERT INTO `log` VALUES ('3942', '123', 'getShareEmployerList', '1496744694');
INSERT INTO `log` VALUES ('3943', '123', 'getShareEmployerList', '1496744954');
INSERT INTO `log` VALUES ('3944', '123', 'setShareEmployer', '1496744958');
INSERT INTO `log` VALUES ('3945', '123', 'getShareEmployerList', '1496744959');
INSERT INTO `log` VALUES ('3946', '123', 'setShareEmployer', '1496744963');
INSERT INTO `log` VALUES ('3947', '123', 'getShareEmployerList', '1496744963');
INSERT INTO `log` VALUES ('3948', '123', 'getUnShareEmployerList', '1496744969');
INSERT INTO `log` VALUES ('3949', '123', 'getShareEmployerList', '1496744971');
INSERT INTO `log` VALUES ('3950', '123', 'getShareEmployerList', '1496744981');
INSERT INTO `log` VALUES ('3951', '123', 'setShareEmployer', '1496744983');
INSERT INTO `log` VALUES ('3952', '123', 'getShareEmployerList', '1496745055');
INSERT INTO `log` VALUES ('3953', '123', 'getShareEmployerList', '1496747882');
INSERT INTO `log` VALUES ('3954', '123', 'getShareEmployerList', '1496747983');
INSERT INTO `log` VALUES ('3955', '123', 'getShareEmployerList', '1496748013');
INSERT INTO `log` VALUES ('3956', '123', 'getShareEmployerList', '1496748049');
INSERT INTO `log` VALUES ('3957', '123', 'getShareEmployerList', '1496748120');
INSERT INTO `log` VALUES ('3958', '123', 'setUnShareEmployer', '1496748125');
INSERT INTO `log` VALUES ('3959', '123', 'getShareEmployerList', '1496748137');
INSERT INTO `log` VALUES ('3960', '123', 'getUnShareEmployerList', '1496748141');
INSERT INTO `log` VALUES ('3961', '123', 'getShareEmployerList', '1496748195');
INSERT INTO `log` VALUES ('3962', '123', 'getShareEmployerList', '1496748716');
INSERT INTO `log` VALUES ('3963', '123', 'setShareEmployer', '1496748720');
INSERT INTO `log` VALUES ('3964', '123', 'setUnShareEmployer', '1496748727');
INSERT INTO `log` VALUES ('3965', '123', 'getShareEmployerList', '1496748745');
INSERT INTO `log` VALUES ('3966', '123', 'setShareEmployer', '1496748746');
INSERT INTO `log` VALUES ('3967', '123', 'getShareEmployerList', '1496748747');
INSERT INTO `log` VALUES ('3968', '123', 'setShareEmployer', '1496748752');
INSERT INTO `log` VALUES ('3969', '123', 'getShareEmployerList', '1496748753');
INSERT INTO `log` VALUES ('3970', '123', 'setShareEmployer', '1496748755');
INSERT INTO `log` VALUES ('3971', '123', 'getShareEmployerList', '1496748756');
INSERT INTO `log` VALUES ('3972', '123', 'setShareEmployer', '1496748763');
INSERT INTO `log` VALUES ('3973', '123', 'getShareEmployerList', '1496748764');
INSERT INTO `log` VALUES ('3974', '123', 'getShareEmployerList', '1496748862');
INSERT INTO `log` VALUES ('3975', '123', 'getShareEmployerList', '1496748913');
INSERT INTO `log` VALUES ('3976', '123', 'setUnShareEmployer', '1496748922');
INSERT INTO `log` VALUES ('3977', '123', 'getShareEmployerList', '1496748923');
INSERT INTO `log` VALUES ('3978', '123', 'setUnShareEmployer', '1496748925');
INSERT INTO `log` VALUES ('3979', '123', 'getShareEmployerList', '1496748925');
INSERT INTO `log` VALUES ('3980', '123', 'setUnShareEmployer', '1496748928');
INSERT INTO `log` VALUES ('3981', '123', 'getShareEmployerList', '1496748929');
INSERT INTO `log` VALUES ('3982', '123', 'getUnShareEmployerList', '1496748933');
INSERT INTO `log` VALUES ('3983', '123', 'setShareEmployer', '1496748936');
INSERT INTO `log` VALUES ('3984', '123', 'getShareEmployerList', '1496748937');
INSERT INTO `log` VALUES ('3985', '123', 'getShareEmployerList', '1496749372');
INSERT INTO `log` VALUES ('3986', '123', 'getShareAuntList', '1496749376');
INSERT INTO `log` VALUES ('3987', '123', 'setUnShareEmployer', '1496749380');
INSERT INTO `log` VALUES ('3988', '123', 'getShareEmployerList', '1496749380');
INSERT INTO `log` VALUES ('3989', '123', 'getShareAuntList', '1496749383');
INSERT INTO `log` VALUES ('3990', '123', 'getUnShareAuntList', '1496749389');
INSERT INTO `log` VALUES ('3991', '123', 'getShareAuntList', '1496749410');
INSERT INTO `log` VALUES ('3992', '123', 'setUnShareEmployer', '1496749416');
INSERT INTO `log` VALUES ('3993', '123', 'getShareEmployerList', '1496749416');
INSERT INTO `log` VALUES ('3994', '123', 'getHelpListByStatus', '1496749505');
INSERT INTO `log` VALUES ('3995', '123', 'getShareEmployerList', '1496749506');
INSERT INTO `log` VALUES ('3996', '123', 'getShareAuntList', '1496749510');
INSERT INTO `log` VALUES ('3997', '123', 'setUnShareAunt', '1496749513');
INSERT INTO `log` VALUES ('3998', '123', 'getShareEmployerList', '1496749513');
INSERT INTO `log` VALUES ('3999', '123', 'getShareAuntList', '1496749516');
INSERT INTO `log` VALUES ('4000', '123', 'getUnShareAuntList', '1496749518');
INSERT INTO `log` VALUES ('4001', '123', 'setShareAunt', '1496749522');
INSERT INTO `log` VALUES ('4002', '123', 'getShareEmployerList', '1496749522');
INSERT INTO `log` VALUES ('4003', '123', 'getShareAuntList', '1496749525');
INSERT INTO `log` VALUES ('4004', '123', 'getShareEmployerList', '1496749528');
INSERT INTO `log` VALUES ('4005', '123', 'getUnShareEmployerList', '1496749530');
INSERT INTO `log` VALUES ('4006', '123', 'setShareEmployer', '1496749538');
INSERT INTO `log` VALUES ('4007', '123', 'getShareEmployerList', '1496749539');
INSERT INTO `log` VALUES ('4008', '123', 'getShareEmployerList', '1496749542');
INSERT INTO `log` VALUES ('4009', '123', 'getShareAuntList', '1496749545');
INSERT INTO `log` VALUES ('4010', '123', 'getUnShareEmployerList', '1496749549');
INSERT INTO `log` VALUES ('4011', '123', 'setShareEmployer', '1496749553');
INSERT INTO `log` VALUES ('4012', '123', 'getShareEmployerList', '1496749553');
INSERT INTO `log` VALUES ('4013', '123', 'getShareAuntList', '1496749558');
INSERT INTO `log` VALUES ('4014', '123', 'getUnShareEmployerList', '1496749560');
INSERT INTO `log` VALUES ('4015', '123', 'setShareEmployer', '1496749563');
INSERT INTO `log` VALUES ('4016', '123', 'getShareEmployerList', '1496749564');
INSERT INTO `log` VALUES ('4017', '123', 'getShareEmployerList', '1496749578');
INSERT INTO `log` VALUES ('4018', '123', 'setUnShareEmployer', '1496749580');
INSERT INTO `log` VALUES ('4019', '123', 'getShareEmployerList', '1496749581');
INSERT INTO `log` VALUES ('4020', '123', 'setUnShareEmployer', '1496749581');
INSERT INTO `log` VALUES ('4021', '123', 'getShareEmployerList', '1496749581');
INSERT INTO `log` VALUES ('4022', '123', 'setUnShareEmployer', '1496749582');
INSERT INTO `log` VALUES ('4023', '123', 'getShareEmployerList', '1496749582');
INSERT INTO `log` VALUES ('4024', '123', 'setUnShareEmployer', '1496749583');
INSERT INTO `log` VALUES ('4025', '123', 'getShareEmployerList', '1496749583');
INSERT INTO `log` VALUES ('4026', '123', 'setUnShareEmployer', '1496749584');
INSERT INTO `log` VALUES ('4027', '123', 'getShareEmployerList', '1496749585');
INSERT INTO `log` VALUES ('4028', '123', 'setUnShareEmployer', '1496749585');
INSERT INTO `log` VALUES ('4029', '123', 'getShareEmployerList', '1496749585');
INSERT INTO `log` VALUES ('4030', '123', 'setUnShareEmployer', '1496749586');
INSERT INTO `log` VALUES ('4031', '123', 'getShareEmployerList', '1496749586');
INSERT INTO `log` VALUES ('4032', '123', 'setUnShareEmployer', '1496749587');
INSERT INTO `log` VALUES ('4033', '123', 'getShareEmployerList', '1496749588');
INSERT INTO `log` VALUES ('4034', '123', 'setUnShareEmployer', '1496749588');
INSERT INTO `log` VALUES ('4035', '123', 'getShareEmployerList', '1496749588');
INSERT INTO `log` VALUES ('4036', '123', 'setUnShareEmployer', '1496749589');
INSERT INTO `log` VALUES ('4037', '123', 'getShareEmployerList', '1496749589');
INSERT INTO `log` VALUES ('4038', '123', 'setUnShareEmployer', '1496749590');
INSERT INTO `log` VALUES ('4039', '123', 'getShareEmployerList', '1496749590');
INSERT INTO `log` VALUES ('4040', '123', 'getUnShareEmployerList', '1496749593');
INSERT INTO `log` VALUES ('4041', '123', 'getShareEmployerList', '1496749610');
INSERT INTO `log` VALUES ('4042', '123', 'getUnShareEmployerList', '1496749613');
INSERT INTO `log` VALUES ('4043', '123', 'getShareAuntList', '1496749615');
INSERT INTO `log` VALUES ('4044', '123', 'getUnShareAuntList', '1496749618');
INSERT INTO `log` VALUES ('4045', '123', 'getShareEmployerList', '1496749633');
INSERT INTO `log` VALUES ('4046', '123', 'getUnShareEmployerList', '1496749637');
INSERT INTO `log` VALUES ('4047', '123', 'setShareEmployer', '1496749640');
INSERT INTO `log` VALUES ('4048', '123', 'getShareEmployerList', '1496749640');
INSERT INTO `log` VALUES ('4049', '123', 'getShareEmployerList', '1496749656');
INSERT INTO `log` VALUES ('4050', '123', 'login', '1496797397');
INSERT INTO `log` VALUES ('4051', '123', 'getShareEmployerList', '1496797401');
INSERT INTO `log` VALUES ('4052', '123', 'getUnShareEmployerList', '1496797406');
INSERT INTO `log` VALUES ('4053', '123', 'getShareEmployerList', '1496797408');
INSERT INTO `log` VALUES ('4054', '123', 'getUnShareEmployerList', '1496797410');
INSERT INTO `log` VALUES ('4055', '123', 'getShareAuntList', '1496797412');
INSERT INTO `log` VALUES ('4056', '123', 'getUnShareAuntList', '1496797421');
INSERT INTO `log` VALUES ('4057', '123', 'getUnShareEmployerList', '1496797424');
INSERT INTO `log` VALUES ('4058', '123', 'setShareEmployer', '1496797427');
INSERT INTO `log` VALUES ('4059', '123', 'getShareEmployerList', '1496797428');
INSERT INTO `log` VALUES ('4060', '123', 'getUnShareEmployerList', '1496797431');
INSERT INTO `log` VALUES ('4061', '123', 'setShareEmployer', '1496797432');
INSERT INTO `log` VALUES ('4062', '123', 'getShareEmployerList', '1496797433');
INSERT INTO `log` VALUES ('4063', '123', 'getStaffList', '1496797440');
INSERT INTO `log` VALUES ('4064', '123', 'getAuntList', '1496797484');
INSERT INTO `log` VALUES ('4065', '123', 'getLanguageList', '1496797484');
INSERT INTO `log` VALUES ('4066', '123', 'getCookingList', '1496797484');
INSERT INTO `log` VALUES ('4067', '123', 'getSkillList', '1496797484');
INSERT INTO `log` VALUES ('4068', '123', 'getApplianceList', '1496797484');
INSERT INTO `log` VALUES ('4069', '123', 'getJobList', '1496797484');
INSERT INTO `log` VALUES ('4070', '123', 'getCertificateList', '1496797484');
INSERT INTO `log` VALUES ('4071', '123', 'getStaffList', '1496797503');
INSERT INTO `log` VALUES ('4072', '2', 'login', '1496798243');
INSERT INTO `log` VALUES ('4073', '2', 'login', '1496798248');
INSERT INTO `log` VALUES ('4074', '2', 'sLogin', '1496798258');
INSERT INTO `log` VALUES ('4075', '2', 'updateStaff', '1496798282');
INSERT INTO `log` VALUES ('4076', '2', 'sLogin', '1496798297');
INSERT INTO `log` VALUES ('4077', '2', 'getStaffList', '1496798348');
INSERT INTO `log` VALUES ('4078', '2', 'sLogin', '1496798359');
INSERT INTO `log` VALUES ('4079', '2', 'getStaffList', '1496798366');
INSERT INTO `log` VALUES ('4080', '2', 'sLogin', '1496798402');
INSERT INTO `log` VALUES ('4081', '2', 'getStaffList', '1496798408');
INSERT INTO `log` VALUES ('4082', '2', 'getStaffList', '1496798655');
INSERT INTO `log` VALUES ('4083', '2', 'getStaffList', '1496798658');
INSERT INTO `log` VALUES ('4084', '2', 'getStaffList', '1496798661');
INSERT INTO `log` VALUES ('4085', '123', 'login', '1496885090');
INSERT INTO `log` VALUES ('4086', '123', 'login', '1496969936');
INSERT INTO `log` VALUES ('4087', '123', 'login', '1496969950');
INSERT INTO `log` VALUES ('4088', '123', 'getEmployerList', '1496969970');
INSERT INTO `log` VALUES ('4089', '123', 'getPactList', '1496969970');
INSERT INTO `log` VALUES ('4090', '123', 'getPactListByStatus', '1496969992');
INSERT INTO `log` VALUES ('4091', '123', 'getPactListByStatus', '1496969993');
INSERT INTO `log` VALUES ('4092', '123', 'getPactListByStatus', '1496969995');
INSERT INTO `log` VALUES ('4093', '123', 'getPactListByStatus', '1496969995');
INSERT INTO `log` VALUES ('4094', '123', 'getPactListByStatus', '1496969997');
INSERT INTO `log` VALUES ('4095', '123', 'getPactList', '1496969998');
INSERT INTO `log` VALUES ('4096', '123', 'getAuntList', '1496970002');
INSERT INTO `log` VALUES ('4097', '123', 'getLanguageList', '1496970002');
INSERT INTO `log` VALUES ('4098', '123', 'getCookingList', '1496970002');
INSERT INTO `log` VALUES ('4099', '123', 'getSkillList', '1496970002');
INSERT INTO `log` VALUES ('4100', '123', 'getApplianceList', '1496970002');
INSERT INTO `log` VALUES ('4101', '123', 'getJobList', '1496970002');
INSERT INTO `log` VALUES ('4102', '123', 'getCertificateList', '1496970002');
INSERT INTO `log` VALUES ('4103', '123', 'getHelpListByStatus', '1496970031');
INSERT INTO `log` VALUES ('4104', '123', 'getShareEmployerList', '1496970041');
INSERT INTO `log` VALUES ('4105', '123', 'getStaffList', '1496970047');
INSERT INTO `log` VALUES ('4106', '123', 'getEmployerList', '1496971257');
INSERT INTO `log` VALUES ('4107', '123', 'getPactList', '1496971257');
INSERT INTO `log` VALUES ('4108', '123', 'getAuntList', '1496971258');
INSERT INTO `log` VALUES ('4109', '123', 'getLanguageList', '1496971259');
INSERT INTO `log` VALUES ('4110', '123', 'getCookingList', '1496971259');
INSERT INTO `log` VALUES ('4111', '123', 'getSkillList', '1496971259');
INSERT INTO `log` VALUES ('4112', '123', 'getApplianceList', '1496971259');
INSERT INTO `log` VALUES ('4113', '123', 'getJobList', '1496971259');
INSERT INTO `log` VALUES ('4114', '123', 'getCertificateList', '1496971259');
INSERT INTO `log` VALUES ('4115', '123', 'getPactList', '1496971264');
INSERT INTO `log` VALUES ('4116', '123', 'getPactList', '1496971267');
INSERT INTO `log` VALUES ('4117', '123', 'getHelpListByStatus', '1496971268');
INSERT INTO `log` VALUES ('4118', '123', 'getShareEmployerList', '1496971269');
INSERT INTO `log` VALUES ('4119', '123', 'getStaffList', '1496971270');
INSERT INTO `log` VALUES ('4120', '123', 'getEmployerList', '1496971272');
INSERT INTO `log` VALUES ('4121', '123', 'getPactList', '1496971273');
INSERT INTO `log` VALUES ('4122', '123', 'getAuntList', '1496971274');
INSERT INTO `log` VALUES ('4123', '123', 'getLanguageList', '1496971274');
INSERT INTO `log` VALUES ('4124', '123', 'getCookingList', '1496971274');
INSERT INTO `log` VALUES ('4125', '123', 'getSkillList', '1496971274');
INSERT INTO `log` VALUES ('4126', '123', 'getApplianceList', '1496971274');
INSERT INTO `log` VALUES ('4127', '123', 'getJobList', '1496971274');
INSERT INTO `log` VALUES ('4128', '123', 'getCertificateList', '1496971275');
INSERT INTO `log` VALUES ('4129', '123', 'getEmployerList', '1496971275');
INSERT INTO `log` VALUES ('4130', '123', 'getPactList', '1496971275');
INSERT INTO `log` VALUES ('4131', '123', 'getAuntList', '1496971276');
INSERT INTO `log` VALUES ('4132', '123', 'getLanguageList', '1496971276');
INSERT INTO `log` VALUES ('4133', '123', 'getCookingList', '1496971276');
INSERT INTO `log` VALUES ('4134', '123', 'getSkillList', '1496971276');
INSERT INTO `log` VALUES ('4135', '123', 'getApplianceList', '1496971277');
INSERT INTO `log` VALUES ('4136', '123', 'getJobList', '1496971277');
INSERT INTO `log` VALUES ('4137', '123', 'getCertificateList', '1496971277');
INSERT INTO `log` VALUES ('4138', '123', 'getAuntList', '1496971284');
INSERT INTO `log` VALUES ('4139', '123', 'getLanguageList', '1496971285');
INSERT INTO `log` VALUES ('4140', '123', 'getCookingList', '1496971285');
INSERT INTO `log` VALUES ('4141', '123', 'getSkillList', '1496971285');
INSERT INTO `log` VALUES ('4142', '123', 'getApplianceList', '1496971285');
INSERT INTO `log` VALUES ('4143', '123', 'getJobList', '1496971285');
INSERT INTO `log` VALUES ('4144', '123', 'getCertificateList', '1496971285');
INSERT INTO `log` VALUES ('4145', '123', 'getEmployerList', '1496971286');
INSERT INTO `log` VALUES ('4146', '123', 'getPactList', '1496971286');
INSERT INTO `log` VALUES ('4147', '123', 'getAuntList', '1496971287');
INSERT INTO `log` VALUES ('4148', '123', 'getLanguageList', '1496971287');
INSERT INTO `log` VALUES ('4149', '123', 'getCookingList', '1496971287');
INSERT INTO `log` VALUES ('4150', '123', 'getSkillList', '1496971287');
INSERT INTO `log` VALUES ('4151', '123', 'getApplianceList', '1496971287');
INSERT INTO `log` VALUES ('4152', '123', 'getJobList', '1496971288');
INSERT INTO `log` VALUES ('4153', '123', 'getCertificateList', '1496971288');
INSERT INTO `log` VALUES ('4154', '123', 'getEmployerList', '1496971288');
INSERT INTO `log` VALUES ('4155', '123', 'getPactList', '1496971288');
INSERT INTO `log` VALUES ('4156', '123', 'getAuntList', '1496971292');
INSERT INTO `log` VALUES ('4157', '123', 'getLanguageList', '1496971292');
INSERT INTO `log` VALUES ('4158', '123', 'getCookingList', '1496971292');
INSERT INTO `log` VALUES ('4159', '123', 'getSkillList', '1496971292');
INSERT INTO `log` VALUES ('4160', '123', 'getApplianceList', '1496971293');
INSERT INTO `log` VALUES ('4161', '123', 'getJobList', '1496971293');
INSERT INTO `log` VALUES ('4162', '123', 'getCertificateList', '1496971293');
INSERT INTO `log` VALUES ('4163', '123', 'getAuntList', '1496971583');
INSERT INTO `log` VALUES ('4164', '123', 'getLanguageList', '1496971584');
INSERT INTO `log` VALUES ('4165', '123', 'getCookingList', '1496971584');
INSERT INTO `log` VALUES ('4166', '123', 'getSkillList', '1496971584');
INSERT INTO `log` VALUES ('4167', '123', 'getApplianceList', '1496971584');
INSERT INTO `log` VALUES ('4168', '123', 'getJobList', '1496971584');
INSERT INTO `log` VALUES ('4169', '123', 'getCertificateList', '1496971584');
INSERT INTO `log` VALUES ('4170', '123', 'login', '1496971607');
INSERT INTO `log` VALUES ('4171', '123', 'login', '1496971725');
INSERT INTO `log` VALUES ('4172', '123', 'getEmployerList', '1496971728');
INSERT INTO `log` VALUES ('4173', '123', 'getPactList', '1496971728');
INSERT INTO `log` VALUES ('4174', '123', 'login', '1496971757');
INSERT INTO `log` VALUES ('4175', '123', 'getEmployerList', '1496971758');
INSERT INTO `log` VALUES ('4176', '123', 'getPactList', '1496971758');
INSERT INTO `log` VALUES ('4177', '123', 'getAuntList', '1496971760');
INSERT INTO `log` VALUES ('4178', '123', 'getLanguageList', '1496971760');
INSERT INTO `log` VALUES ('4179', '123', 'getCookingList', '1496971760');
INSERT INTO `log` VALUES ('4180', '123', 'getSkillList', '1496971760');
INSERT INTO `log` VALUES ('4181', '123', 'getApplianceList', '1496971760');
INSERT INTO `log` VALUES ('4182', '123', 'getJobList', '1496971760');
INSERT INTO `log` VALUES ('4183', '123', 'getCertificateList', '1496971760');
INSERT INTO `log` VALUES ('4184', '123', 'getAuntList', '1496971855');
INSERT INTO `log` VALUES ('4185', '123', 'getLanguageList', '1496971855');
INSERT INTO `log` VALUES ('4186', '123', 'getCookingList', '1496971855');
INSERT INTO `log` VALUES ('4187', '123', 'getSkillList', '1496971855');
INSERT INTO `log` VALUES ('4188', '123', 'getApplianceList', '1496971855');
INSERT INTO `log` VALUES ('4189', '123', 'getJobList', '1496971856');
INSERT INTO `log` VALUES ('4190', '123', 'getCertificateList', '1496971856');
INSERT INTO `log` VALUES ('4191', '123', 'getShareEmployerList', '1496972096');
INSERT INTO `log` VALUES ('4192', '123', 'getHelpListByStatus', '1496972098');
INSERT INTO `log` VALUES ('4193', '123', 'addHelp', '1496972133');
INSERT INTO `log` VALUES ('4194', '123', 'getHelpListByStatus', '1496972135');
INSERT INTO `log` VALUES ('4195', '123', 'getStaffList', '1496972177');
INSERT INTO `log` VALUES ('4196', '123', 'getEmployerList', '1496972226');
INSERT INTO `log` VALUES ('4197', '123', 'getPactList', '1496972226');
INSERT INTO `log` VALUES ('4198', '2', 'sLogin', '1496973469');
INSERT INTO `log` VALUES ('4199', '2', 'getAllJoinOrderById', '1496973490');
INSERT INTO `log` VALUES ('4200', '2', 'getJoinOrderDetailByJoinorderid', '1496973636');
INSERT INTO `log` VALUES ('4201', '2', 'getJoinOrderDetailByJoinorderid', '1496973682');
INSERT INTO `log` VALUES ('4202', '2', 'getJoinOrderByStatus', '1496973724');
INSERT INTO `log` VALUES ('4203', '2', 'getJoinOrderByStatus', '1496973731');
INSERT INTO `log` VALUES ('4204', '2', 'sLogin', '1496974526');
INSERT INTO `log` VALUES ('4205', '2', 'getJoinOrderDetailByJoinorderid', '1496974571');
INSERT INTO `log` VALUES ('4206', '2', 'getJoinOrderDetailByJoinorderid', '1496974706');
INSERT INTO `log` VALUES ('4207', '2', 'getJoinOrderListById', '1496974772');
INSERT INTO `log` VALUES ('4208', '2', 'getJoinOrderByStatus', '1496974896');
INSERT INTO `log` VALUES ('4209', '2', 'updateJoinOrderStatus', '1496975338');
INSERT INTO `log` VALUES ('4210', '2', 'updateJoinOrderStatus', '1496975389');
INSERT INTO `log` VALUES ('4211', '2', 'getJoinOrderByStatus', '1496975429');
INSERT INTO `log` VALUES ('4212', '2', 'addJoinOrder', '1496976449');
INSERT INTO `log` VALUES ('4213', '2', 'addJoinOrder', '1496976515');
INSERT INTO `log` VALUES ('4214', '2', 'addJoinOrder', '1496976589');
INSERT INTO `log` VALUES ('4215', '2', 'addJoinOrder', '1496976729');
INSERT INTO `log` VALUES ('4216', '2', 'addJoinOrder', '1496976762');
INSERT INTO `log` VALUES ('4217', '2', 'addJoinOrder', '1496976836');
INSERT INTO `log` VALUES ('4218', '2', 'addJoinOrder', '1496977196');
INSERT INTO `log` VALUES ('4219', '2', 'sLogin', '1496977265');
INSERT INTO `log` VALUES ('4220', '2', 'addJoinOrder', '1496977306');
INSERT INTO `log` VALUES ('4221', '2', 'addJoinOrder', '1496977414');
INSERT INTO `log` VALUES ('4222', '2', 'addJoinOrder', '1496977539');
INSERT INTO `log` VALUES ('4223', '2', 'addJoinOrder', '1496977684');
INSERT INTO `log` VALUES ('4224', '2', 'addJoinOrder', '1496977697');
INSERT INTO `log` VALUES ('4225', '2', 'addJoinOrder', '1496977717');
INSERT INTO `log` VALUES ('4226', '2', 'addJoinOrder', '1496977879');
INSERT INTO `log` VALUES ('4227', '2', 'addJoinOrder', '1496977929');
INSERT INTO `log` VALUES ('4228', '2', 'addJoinOrder', '1496977937');
INSERT INTO `log` VALUES ('4229', '2', 'addJoinOrder', '1496977978');
INSERT INTO `log` VALUES ('4230', '2', 'addJoinOrder', '1496978031');
INSERT INTO `log` VALUES ('4231', '2', 'addJoinOrder', '1496978095');
INSERT INTO `log` VALUES ('4232', '2', 'sLogin', '1496978270');
INSERT INTO `log` VALUES ('4233', '2', 'addJoinOrder', '1496978279');
INSERT INTO `log` VALUES ('4234', '2', 'deleteJoinOrder', '1496978773');
INSERT INTO `log` VALUES ('4235', '2', 'sLogin', '1496978878');
INSERT INTO `log` VALUES ('4236', '2', 'deleteJoinOrder', '1496978886');
INSERT INTO `log` VALUES ('4237', '2', 'deleteJoinOrder', '1496979006');
INSERT INTO `log` VALUES ('4238', '2', 'deleteJoinOrder', '1496979008');
INSERT INTO `log` VALUES ('4239', '2', 'deleteJoinOrder', '1496979018');
INSERT INTO `log` VALUES ('4240', '2', 'deleteJoinOrder', '1496979141');
INSERT INTO `log` VALUES ('4241', '2', 'sLogin', '1496992435');
INSERT INTO `log` VALUES ('4242', '2', 'getAuntList', '1496992460');
INSERT INTO `log` VALUES ('4243', '2', 'sLogin', '1496992885');
INSERT INTO `log` VALUES ('4244', '2', 'getAuntList', '1496992907');
INSERT INTO `log` VALUES ('4245', '2', 'getLanguageList', '1496992907');
INSERT INTO `log` VALUES ('4246', '2', 'getCookingList', '1496992907');
INSERT INTO `log` VALUES ('4247', '2', 'getSkillList', '1496992907');
INSERT INTO `log` VALUES ('4248', '2', 'getApplianceList', '1496992907');
INSERT INTO `log` VALUES ('4249', '2', 'getJobList', '1496992907');
INSERT INTO `log` VALUES ('4250', '2', 'getCertificateList', '1496992908');
INSERT INTO `log` VALUES ('4251', '2', 'addAunt', '1496993100');
INSERT INTO `log` VALUES ('4252', '2', 'getAuntList', '1496993102');
INSERT INTO `log` VALUES ('4253', '2', 'getLanguageList', '1496993102');
INSERT INTO `log` VALUES ('4254', '2', 'getCookingList', '1496993102');
INSERT INTO `log` VALUES ('4255', '2', 'getSkillList', '1496993102');
INSERT INTO `log` VALUES ('4256', '2', 'getApplianceList', '1496993102');
INSERT INTO `log` VALUES ('4257', '2', 'getJobList', '1496993103');
INSERT INTO `log` VALUES ('4258', '2', 'getCertificateList', '1496993103');
INSERT INTO `log` VALUES ('4259', '2', 'getAuntListByStatus', '1496993145');
INSERT INTO `log` VALUES ('4260', '2', 'getAuntListByStatus', '1496993155');
INSERT INTO `log` VALUES ('4261', '2', 'sLogin', '1496993465');
INSERT INTO `log` VALUES ('4262', '2', 'sLogin', '1496994571');
INSERT INTO `log` VALUES ('4263', '2', 'getEmployerList', '1496994810');
INSERT INTO `log` VALUES ('4264', '2', 'getEmployerListByStatus', '1496994826');
INSERT INTO `log` VALUES ('4265', '2', 'sLogin', '1496996864');
INSERT INTO `log` VALUES ('4266', '2', 'getEmployerList', '1496996871');
INSERT INTO `log` VALUES ('4267', '2', 'getPactList', '1496996873');
INSERT INTO `log` VALUES ('4268', '123', 'login', '1496996886');
INSERT INTO `log` VALUES ('4269', '123', 'getEmployerList', '1496996891');
INSERT INTO `log` VALUES ('4270', '123', 'getPactList', '1496996892');
INSERT INTO `log` VALUES ('4271', '123', 'getEmployerListByStatus', '1496996894');
INSERT INTO `log` VALUES ('4272', '123', 'getEmployerListByStatus', '1496996895');
INSERT INTO `log` VALUES ('4273', '123', 'getEmployerListByStatus', '1496996897');
INSERT INTO `log` VALUES ('4274', '123', 'getEmployerListByStatus', '1496996898');
INSERT INTO `log` VALUES ('4275', '123', 'getEmployerList', '1496996899');
INSERT INTO `log` VALUES ('4276', '2', 'sLogin', '1496997062');
INSERT INTO `log` VALUES ('4277', '2', 'addEmployer', '1496997072');
INSERT INTO `log` VALUES ('4278', '2', 'addEmployer', '1496997098');
INSERT INTO `log` VALUES ('4279', '2', 'addEmployerTracking', '1496997248');
INSERT INTO `log` VALUES ('4280', '2', 'sLogin', '1496997923');
INSERT INTO `log` VALUES ('4281', '2', 'addHelp', '1496997990');
INSERT INTO `log` VALUES ('4282', '2', 'getHelpListByStatus', '1496998068');
INSERT INTO `log` VALUES ('4283', '123', 'getEmployerList', '1496998544');
INSERT INTO `log` VALUES ('4284', '123', 'getPactList', '1496998544');
INSERT INTO `log` VALUES ('4285', '123', 'getAuntList', '1496998563');
INSERT INTO `log` VALUES ('4286', '123', 'getLanguageList', '1496998563');
INSERT INTO `log` VALUES ('4287', '123', 'getCookingList', '1496998563');
INSERT INTO `log` VALUES ('4288', '123', 'getSkillList', '1496998563');
INSERT INTO `log` VALUES ('4289', '123', 'getApplianceList', '1496998563');
INSERT INTO `log` VALUES ('4290', '123', 'getJobList', '1496998564');
INSERT INTO `log` VALUES ('4291', '123', 'getCertificateList', '1496998564');
INSERT INTO `log` VALUES ('4292', '123', 'getPactList', '1496998575');
INSERT INTO `log` VALUES ('4293', '123', 'getHelpListByStatus', '1496998584');
INSERT INTO `log` VALUES ('4294', '123', 'getShareEmployerList', '1496998586');
INSERT INTO `log` VALUES ('4295', '123', 'getStaffList', '1496998587');
INSERT INTO `log` VALUES ('4296', '123', 'getShareEmployerList', '1496998589');
INSERT INTO `log` VALUES ('4297', '2', 'sLogin', '1496998651');
INSERT INTO `log` VALUES ('4298', '2', 'getPactList', '1496998665');
INSERT INTO `log` VALUES ('4299', '2', 'getPactListByStatus', '1496998678');
INSERT INTO `log` VALUES ('4300', '2', 'getPactListByStatus', '1496998692');
INSERT INTO `log` VALUES ('4301', '2', 'getPactListByStatus', '1496998794');
INSERT INTO `log` VALUES ('4302', '123', 'login', '1496998916');
INSERT INTO `log` VALUES ('4303', '123', 'getEmployerList', '1496998926');
INSERT INTO `log` VALUES ('4304', '123', 'getPactList', '1496998927');
INSERT INTO `log` VALUES ('4305', '123', 'getEmployerList', '1496998943');
INSERT INTO `log` VALUES ('4306', '123', 'getEmployerList', '1496998944');
INSERT INTO `log` VALUES ('4307', '123', 'getEmployerList', '1496998950');
INSERT INTO `log` VALUES ('4308', '123', 'login', '1496998986');
INSERT INTO `log` VALUES ('4309', '2', 'sLogin', '1496999170');
INSERT INTO `log` VALUES ('4310', '2', 'addPact', '1496999420');
INSERT INTO `log` VALUES ('4311', '2', 'sLogin', '1496999883');
INSERT INTO `log` VALUES ('4312', '2', 'addPact', '1496999894');
INSERT INTO `log` VALUES ('4313', '2', 'addPact', '1497000071');
INSERT INTO `log` VALUES ('4314', '2', 'addPact', '1497000481');
INSERT INTO `log` VALUES ('4315', '2', 'addPact', '1497000527');
INSERT INTO `log` VALUES ('4316', '2', 'addPact', '1497001173');
INSERT INTO `log` VALUES ('4317', '2', 'sLogin', '1497001637');
INSERT INTO `log` VALUES ('4318', '2', 'addPact', '1497001647');
INSERT INTO `log` VALUES ('4319', '2', 'addPact', '1497001937');
INSERT INTO `log` VALUES ('4320', '2', 'addPact', '1497001958');
INSERT INTO `log` VALUES ('4321', '2', 'addPact', '1497002111');
INSERT INTO `log` VALUES ('4322', '2', 'addPact', '1497002195');
INSERT INTO `log` VALUES ('4323', '2', 'addPact', '1497002335');
INSERT INTO `log` VALUES ('4324', '2', 'addPact', '1497002368');
INSERT INTO `log` VALUES ('4325', '2', 'addPact', '1497002445');
INSERT INTO `log` VALUES ('4326', '2', 'addPact', '1497002577');
INSERT INTO `log` VALUES ('4327', '2', 'sLogin', '1497003200');
INSERT INTO `log` VALUES ('4328', '2', 'getShareAuntList', '1497003278');
INSERT INTO `log` VALUES ('4329', '2', 'getUnShareAuntList', '1497003288');
INSERT INTO `log` VALUES ('4330', '2', 'getShareEmployerList', '1497003357');
INSERT INTO `log` VALUES ('4331', '2', 'getUnShareEmployerList', '1497003382');
INSERT INTO `log` VALUES ('4332', '2', 'addShareAunt', '1497003558');
INSERT INTO `log` VALUES ('4333', '2', 'addShareAunt', '1497003572');
INSERT INTO `log` VALUES ('4334', '2', 'addShareAunt', '1497003595');
INSERT INTO `log` VALUES ('4335', '2', 'addEmployer', '1497003651');
INSERT INTO `log` VALUES ('4336', '2', 'addEmployer', '1497003705');
INSERT INTO `log` VALUES ('4337', '2', 'addShareEmployer', '1497003749');
INSERT INTO `log` VALUES ('4338', '2', 'addShareEmployer', '1497003772');
INSERT INTO `log` VALUES ('4339', '123', 'login', '1497004924');
INSERT INTO `log` VALUES ('4340', '2', 'sLogin', '1497005142');
INSERT INTO `log` VALUES ('4341', '2', 'getEmployerList', '1497005150');
INSERT INTO `log` VALUES ('4342', '2', 'getPactList', '1497005150');
INSERT INTO `log` VALUES ('4343', '2', 'getAuntList', '1497005154');
INSERT INTO `log` VALUES ('4344', '2', 'getLanguageList', '1497005154');
INSERT INTO `log` VALUES ('4345', '2', 'getCookingList', '1497005154');
INSERT INTO `log` VALUES ('4346', '2', 'getSkillList', '1497005154');
INSERT INTO `log` VALUES ('4347', '2', 'getApplianceList', '1497005154');
INSERT INTO `log` VALUES ('4348', '2', 'getJobList', '1497005154');
INSERT INTO `log` VALUES ('4349', '2', 'getCertificateList', '1497005155');
INSERT INTO `log` VALUES ('4350', '2', 'getPactList', '1497005158');
INSERT INTO `log` VALUES ('4351', '2', 'getPactList', '1497005163');
INSERT INTO `log` VALUES ('4352', '2', 'getPactListByStatus', '1497005164');
INSERT INTO `log` VALUES ('4353', '2', 'getPactListByStatus', '1497005165');
INSERT INTO `log` VALUES ('4354', '2', 'getPactListByStatus', '1497005166');
INSERT INTO `log` VALUES ('4355', '2', 'getPactList', '1497005167');
INSERT INTO `log` VALUES ('4356', '2', 'getHelpListByStatus', '1497005170');
INSERT INTO `log` VALUES ('4357', '2', 'getShareEmployerList', '1497005172');
INSERT INTO `log` VALUES ('4358', '2', 'getStaffList', '1497005174');
INSERT INTO `log` VALUES ('4359', '2', 'sLogin', '1497005647');
INSERT INTO `log` VALUES ('4360', '2', 'getEmployerList', '1497005650');
INSERT INTO `log` VALUES ('4361', '2', 'getPactList', '1497005651');
INSERT INTO `log` VALUES ('4362', '2', 'getAuntList', '1497005652');
INSERT INTO `log` VALUES ('4363', '2', 'getLanguageList', '1497005652');
INSERT INTO `log` VALUES ('4364', '2', 'getCookingList', '1497005652');
INSERT INTO `log` VALUES ('4365', '2', 'getSkillList', '1497005652');
INSERT INTO `log` VALUES ('4366', '2', 'getApplianceList', '1497005652');
INSERT INTO `log` VALUES ('4367', '2', 'getJobList', '1497005652');
INSERT INTO `log` VALUES ('4368', '2', 'getCertificateList', '1497005653');
INSERT INTO `log` VALUES ('4369', '2', 'getPactList', '1497005656');
INSERT INTO `log` VALUES ('4370', '2', 'getHelpListByStatus', '1497005658');
INSERT INTO `log` VALUES ('4371', '2', 'getShareEmployerList', '1497005659');
INSERT INTO `log` VALUES ('4372', '2', 'getStaffList', '1497005662');
INSERT INTO `log` VALUES ('4373', '2', 'getEmployerList', '1497005670');
INSERT INTO `log` VALUES ('4374', '2', 'getPactList', '1497005670');
INSERT INTO `log` VALUES ('4375', '2', 'sLogin', '1497005688');
INSERT INTO `log` VALUES ('4376', '2', 'getEmployerList', '1497005692');
INSERT INTO `log` VALUES ('4377', '2', 'getPactList', '1497005693');
INSERT INTO `log` VALUES ('4378', '2', 'getAuntList', '1497005694');
INSERT INTO `log` VALUES ('4379', '2', 'getLanguageList', '1497005695');
INSERT INTO `log` VALUES ('4380', '2', 'getCookingList', '1497005695');
INSERT INTO `log` VALUES ('4381', '2', 'getSkillList', '1497005695');
INSERT INTO `log` VALUES ('4382', '2', 'getApplianceList', '1497005695');
INSERT INTO `log` VALUES ('4383', '2', 'getJobList', '1497005695');
INSERT INTO `log` VALUES ('4384', '2', 'getCertificateList', '1497005695');
INSERT INTO `log` VALUES ('4385', '2', 'getPactList', '1497005700');
INSERT INTO `log` VALUES ('4386', '2', 'getHelpListByStatus', '1497005701');
INSERT INTO `log` VALUES ('4387', '2', 'getShareEmployerList', '1497005702');
INSERT INTO `log` VALUES ('4388', '2', 'getStaffList', '1497005706');
INSERT INTO `log` VALUES ('4389', '2', 'sLogin', '1497005861');
INSERT INTO `log` VALUES ('4390', '2', 'getStaffList', '1497005869');
INSERT INTO `log` VALUES ('4391', '2', 'sLogin', '1497005887');
INSERT INTO `log` VALUES ('4392', '2', 'getEmployerList', '1497005891');
INSERT INTO `log` VALUES ('4393', '2', 'getPactList', '1497005891');
INSERT INTO `log` VALUES ('4394', '2', 'getAuntList', '1497005893');
INSERT INTO `log` VALUES ('4395', '2', 'getLanguageList', '1497005893');
INSERT INTO `log` VALUES ('4396', '2', 'getCookingList', '1497005893');
INSERT INTO `log` VALUES ('4397', '2', 'getSkillList', '1497005893');
INSERT INTO `log` VALUES ('4398', '2', 'getApplianceList', '1497005893');
INSERT INTO `log` VALUES ('4399', '2', 'getJobList', '1497005893');
INSERT INTO `log` VALUES ('4400', '2', 'getCertificateList', '1497005893');
INSERT INTO `log` VALUES ('4401', '2', 'getStaffList', '1497005896');
INSERT INTO `log` VALUES ('4402', '2', 'getPactList', '1497005905');
INSERT INTO `log` VALUES ('4403', '2', 'getPactList', '1497005909');
INSERT INTO `log` VALUES ('4404', '2', 'getPactList', '1497005910');
INSERT INTO `log` VALUES ('4405', '2', 'getPactList', '1497005911');
INSERT INTO `log` VALUES ('4406', '2', 'getEmployerList', '1497005918');
INSERT INTO `log` VALUES ('4407', '2', 'getPactList', '1497005918');
INSERT INTO `log` VALUES ('4408', '2', 'getStaffList', '1497005956');
INSERT INTO `log` VALUES ('4409', '2', 'sLogin', '1497006679');
INSERT INTO `log` VALUES ('4410', '2', 'getEmployerList', '1497006689');
INSERT INTO `log` VALUES ('4411', '2', 'getPactList', '1497006689');
INSERT INTO `log` VALUES ('4412', '2', 'getEmployerListByStatus', '1497006690');
INSERT INTO `log` VALUES ('4413', '2', 'getEmployerListByStatus', '1497006690');
INSERT INTO `log` VALUES ('4414', '2', 'getEmployerListByStatus', '1497006692');
INSERT INTO `log` VALUES ('4415', '2', 'getEmployerListByStatus', '1497006693');
INSERT INTO `log` VALUES ('4416', '2', 'getEmployerList', '1497006694');
INSERT INTO `log` VALUES ('4417', '2', 'getEmployerListByStatus', '1497006695');
INSERT INTO `log` VALUES ('4418', '2', 'getAuntList', '1497006696');
INSERT INTO `log` VALUES ('4419', '2', 'getLanguageList', '1497006696');
INSERT INTO `log` VALUES ('4420', '2', 'getCookingList', '1497006697');
INSERT INTO `log` VALUES ('4421', '2', 'getSkillList', '1497006697');
INSERT INTO `log` VALUES ('4422', '2', 'getApplianceList', '1497006697');
INSERT INTO `log` VALUES ('4423', '2', 'getJobList', '1497006697');
INSERT INTO `log` VALUES ('4424', '2', 'getCertificateList', '1497006697');
INSERT INTO `log` VALUES ('4425', '2', 'getPactList', '1497006709');
INSERT INTO `log` VALUES ('4426', '2', 'getPactList', '1497006713');
INSERT INTO `log` VALUES ('4427', '2', 'getHelpListByStatus', '1497006715');
INSERT INTO `log` VALUES ('4428', '2', 'getShareEmployerList', '1497006717');
INSERT INTO `log` VALUES ('4429', '2', 'getStaffList', '1497006718');
INSERT INTO `log` VALUES ('4430', '2', 'getEmployerList', '1497006720');
INSERT INTO `log` VALUES ('4431', '2', 'getPactList', '1497006720');
INSERT INTO `log` VALUES ('4432', '2', 'getEmployerListByStatus', '1497006726');
INSERT INTO `log` VALUES ('4433', '2', 'getPactList', '1497006729');
INSERT INTO `log` VALUES ('4434', '2', 'getPactListByStatus', '1497006729');
INSERT INTO `log` VALUES ('4435', '2', 'getPactListByStatus', '1497006730');
INSERT INTO `log` VALUES ('4436', '2', 'getPactListByStatus', '1497006730');
INSERT INTO `log` VALUES ('4437', '2', 'getPactList', '1497006731');
INSERT INTO `log` VALUES ('4438', '2', 'sLogin', '1497006751');
INSERT INTO `log` VALUES ('4439', '2', 'getAuntList', '1497006756');
INSERT INTO `log` VALUES ('4440', '2', 'getLanguageList', '1497006757');
INSERT INTO `log` VALUES ('4441', '2', 'getCookingList', '1497006757');
INSERT INTO `log` VALUES ('4442', '2', 'getSkillList', '1497006757');
INSERT INTO `log` VALUES ('4443', '2', 'getApplianceList', '1497006757');
INSERT INTO `log` VALUES ('4444', '2', 'getJobList', '1497006757');
INSERT INTO `log` VALUES ('4445', '2', 'getCertificateList', '1497006757');
INSERT INTO `log` VALUES ('4446', '2', 'getPactList', '1497006770');
INSERT INTO `log` VALUES ('4447', '2', 'getHelpListByStatus', '1497006775');
INSERT INTO `log` VALUES ('4448', '2', 'getShareEmployerList', '1497006776');
INSERT INTO `log` VALUES ('4449', '2', 'sLogin', '1497006835');
INSERT INTO `log` VALUES ('4450', '2', 'getEmployerList', '1497006859');
INSERT INTO `log` VALUES ('4451', '2', 'getPactList', '1497006860');
INSERT INTO `log` VALUES ('4452', '2', 'getAuntList', '1497006861');
INSERT INTO `log` VALUES ('4453', '2', 'getLanguageList', '1497006861');
INSERT INTO `log` VALUES ('4454', '2', 'getCookingList', '1497006861');
INSERT INTO `log` VALUES ('4455', '2', 'getSkillList', '1497006861');
INSERT INTO `log` VALUES ('4456', '2', 'getApplianceList', '1497006861');
INSERT INTO `log` VALUES ('4457', '2', 'getJobList', '1497006861');
INSERT INTO `log` VALUES ('4458', '2', 'getCertificateList', '1497006861');
INSERT INTO `log` VALUES ('4459', '2', 'getEmployerList', '1497006880');
INSERT INTO `log` VALUES ('4460', '2', 'getPactList', '1497006880');
INSERT INTO `log` VALUES ('4461', '2', 'getAuntList', '1497006881');
INSERT INTO `log` VALUES ('4462', '2', 'getLanguageList', '1497006881');
INSERT INTO `log` VALUES ('4463', '2', 'getCookingList', '1497006881');
INSERT INTO `log` VALUES ('4464', '2', 'getSkillList', '1497006881');
INSERT INTO `log` VALUES ('4465', '2', 'getApplianceList', '1497006882');
INSERT INTO `log` VALUES ('4466', '2', 'getJobList', '1497006882');
INSERT INTO `log` VALUES ('4467', '2', 'getCertificateList', '1497006882');
INSERT INTO `log` VALUES ('4468', '2', 'getEmployerList', '1497006882');
INSERT INTO `log` VALUES ('4469', '2', 'getPactList', '1497006882');
INSERT INTO `log` VALUES ('4470', '2', 'getAuntList', '1497006883');
INSERT INTO `log` VALUES ('4471', '2', 'getLanguageList', '1497006883');
INSERT INTO `log` VALUES ('4472', '2', 'getCookingList', '1497006883');
INSERT INTO `log` VALUES ('4473', '2', 'getSkillList', '1497006884');
INSERT INTO `log` VALUES ('4474', '2', 'getApplianceList', '1497006884');
INSERT INTO `log` VALUES ('4475', '2', 'getJobList', '1497006884');
INSERT INTO `log` VALUES ('4476', '2', 'getCertificateList', '1497006884');
INSERT INTO `log` VALUES ('4477', '2', 'getPactList', '1497006888');
INSERT INTO `log` VALUES ('4478', '2', 'getHelpListByStatus', '1497006889');
INSERT INTO `log` VALUES ('4479', '2', 'getShareEmployerList', '1497006890');
INSERT INTO `log` VALUES ('4480', '2', 'getStaffList', '1497006891');
INSERT INTO `log` VALUES ('4481', '2', 'getShareEmployerList', '1497006893');
INSERT INTO `log` VALUES ('4482', '2', 'setUnShareEmployer', '1497006894');
INSERT INTO `log` VALUES ('4483', '2', 'getShareEmployerList', '1497006894');
INSERT INTO `log` VALUES ('4484', '2', 'getStaffList', '1497006899');
INSERT INTO `log` VALUES ('4485', '123', 'sLogin', '1497007128');
INSERT INTO `log` VALUES ('4486', '2', 'sLogin', '1497007163');
INSERT INTO `log` VALUES ('4487', '2', 'getEmployerList', '1497007286');
INSERT INTO `log` VALUES ('4488', '2', 'getPactList', '1497007286');
INSERT INTO `log` VALUES ('4489', '2', 'getAuntList', '1497007287');
INSERT INTO `log` VALUES ('4490', '2', 'getLanguageList', '1497007288');
INSERT INTO `log` VALUES ('4491', '2', 'getCookingList', '1497007288');
INSERT INTO `log` VALUES ('4492', '2', 'getSkillList', '1497007288');
INSERT INTO `log` VALUES ('4493', '2', 'getApplianceList', '1497007288');
INSERT INTO `log` VALUES ('4494', '2', 'getJobList', '1497007288');
INSERT INTO `log` VALUES ('4495', '2', 'getCertificateList', '1497007288');
INSERT INTO `log` VALUES ('4496', '2', 'getEmployerList', '1497007291');
INSERT INTO `log` VALUES ('4497', '2', 'getPactList', '1497007291');
INSERT INTO `log` VALUES ('4498', '123', 'login', '1497007262');
INSERT INTO `log` VALUES ('4499', '123', 'getShareEmployerList', '1497007266');
INSERT INTO `log` VALUES ('4500', '123', 'addShareEmployer', '1497007297');
INSERT INTO `log` VALUES ('4501', '123', 'getShareEmployerList', '1497007299');
INSERT INTO `log` VALUES ('4502', '2', 'getEmployerList', '1497007974');
INSERT INTO `log` VALUES ('4503', '2', 'getPactList', '1497007974');
INSERT INTO `log` VALUES ('4504', '2', 'getAuntList', '1497007978');
INSERT INTO `log` VALUES ('4505', '2', 'getLanguageList', '1497007979');
INSERT INTO `log` VALUES ('4506', '2', 'getCookingList', '1497007979');
INSERT INTO `log` VALUES ('4507', '2', 'getSkillList', '1497007979');
INSERT INTO `log` VALUES ('4508', '2', 'getApplianceList', '1497007979');
INSERT INTO `log` VALUES ('4509', '2', 'getJobList', '1497007979');
INSERT INTO `log` VALUES ('4510', '2', 'getCertificateList', '1497007979');
INSERT INTO `log` VALUES ('4511', '2', 'getPactList', '1497007986');
INSERT INTO `log` VALUES ('4512', '2', 'getHelpListByStatus', '1497007990');
INSERT INTO `log` VALUES ('4513', '2', 'getShareEmployerList', '1497007992');
INSERT INTO `log` VALUES ('4514', '2', 'getEmployerList', '1497007995');
INSERT INTO `log` VALUES ('4515', '2', 'getPactList', '1497007995');
INSERT INTO `log` VALUES ('4516', '2', 'getAuntList', '1497008132');
INSERT INTO `log` VALUES ('4517', '2', 'getLanguageList', '1497008132');
INSERT INTO `log` VALUES ('4518', '2', 'getCookingList', '1497008132');
INSERT INTO `log` VALUES ('4519', '2', 'getSkillList', '1497008132');
INSERT INTO `log` VALUES ('4520', '2', 'getApplianceList', '1497008132');
INSERT INTO `log` VALUES ('4521', '2', 'getJobList', '1497008133');
INSERT INTO `log` VALUES ('4522', '2', 'getCertificateList', '1497008133');
INSERT INTO `log` VALUES ('4523', '2', 'getPactList', '1497008137');
INSERT INTO `log` VALUES ('4524', '2', 'getHelpListByStatus', '1497008140');
INSERT INTO `log` VALUES ('4525', '2', 'getShareEmployerList', '1497008141');
INSERT INTO `log` VALUES ('4526', '2', 'getStaffList', '1497008143');
INSERT INTO `log` VALUES ('4527', '2', 'sLogin', '1497009105');
INSERT INTO `log` VALUES ('4528', '2', 'getEmployerList', '1497009117');
INSERT INTO `log` VALUES ('4529', '2', 'getPactList', '1497009117');
INSERT INTO `log` VALUES ('4530', '2', 'getAuntList', '1497009118');
INSERT INTO `log` VALUES ('4531', '2', 'getLanguageList', '1497009118');
INSERT INTO `log` VALUES ('4532', '2', 'getCookingList', '1497009118');
INSERT INTO `log` VALUES ('4533', '2', 'getSkillList', '1497009119');
INSERT INTO `log` VALUES ('4534', '2', 'getApplianceList', '1497009119');
INSERT INTO `log` VALUES ('4535', '2', 'getJobList', '1497009119');
INSERT INTO `log` VALUES ('4536', '2', 'getCertificateList', '1497009119');
INSERT INTO `log` VALUES ('4537', '2', 'getPactList', '1497009122');
INSERT INTO `log` VALUES ('4538', '2', 'getHelpListByStatus', '1497009124');
INSERT INTO `log` VALUES ('4539', '2', 'getShareEmployerList', '1497009125');
INSERT INTO `log` VALUES ('4540', '2', 'getStaffList', '1497009126');
INSERT INTO `log` VALUES ('4541', '2', 'sLogin', '1497010578');
INSERT INTO `log` VALUES ('4542', '2', 'login', '1497010645');
INSERT INTO `log` VALUES ('4543', '2', 'sLogin', '1497010744');
INSERT INTO `log` VALUES ('4544', '2', 'getEmployerList', '1497010750');
INSERT INTO `log` VALUES ('4545', '2', 'getPactList', '1497010750');
INSERT INTO `log` VALUES ('4546', '2', 'getAuntList', '1497010751');
INSERT INTO `log` VALUES ('4547', '2', 'getLanguageList', '1497010751');
INSERT INTO `log` VALUES ('4548', '2', 'getCookingList', '1497010752');
INSERT INTO `log` VALUES ('4549', '2', 'getSkillList', '1497010752');
INSERT INTO `log` VALUES ('4550', '2', 'getApplianceList', '1497010752');
INSERT INTO `log` VALUES ('4551', '2', 'getJobList', '1497010752');
INSERT INTO `log` VALUES ('4552', '2', 'getCertificateList', '1497010752');
INSERT INTO `log` VALUES ('4553', '2', 'getHelpListByStatus', '1497010755');
INSERT INTO `log` VALUES ('4554', '2', 'getShareEmployerList', '1497010757');
INSERT INTO `log` VALUES ('4555', '2', 'getStaffList', '1497010758');
INSERT INTO `log` VALUES ('4556', '2', 'getEmployerList', '1497010797');
INSERT INTO `log` VALUES ('4557', '2', 'getPactList', '1497010797');
INSERT INTO `log` VALUES ('4558', '2', 'getAuntList', '1497010812');
INSERT INTO `log` VALUES ('4559', '2', 'getLanguageList', '1497010813');
INSERT INTO `log` VALUES ('4560', '2', 'getCookingList', '1497010813');
INSERT INTO `log` VALUES ('4561', '2', 'getSkillList', '1497010813');
INSERT INTO `log` VALUES ('4562', '2', 'getApplianceList', '1497010813');
INSERT INTO `log` VALUES ('4563', '2', 'getJobList', '1497010813');
INSERT INTO `log` VALUES ('4564', '2', 'getCertificateList', '1497010813');
INSERT INTO `log` VALUES ('4565', '2', 'getPactList', '1497010820');
INSERT INTO `log` VALUES ('4566', '2', 'getHelpListByStatus', '1497010828');
INSERT INTO `log` VALUES ('4567', '2', 'getShareEmployerList', '1497010832');
INSERT INTO `log` VALUES ('4568', '2', 'getHelpListByStatus', '1497010834');
INSERT INTO `log` VALUES ('4569', '2', 'getStaffList', '1497010850');
INSERT INTO `log` VALUES ('4570', '123', 'login', '1497062804');
INSERT INTO `log` VALUES ('4571', '123', 'login', '1497062812');
INSERT INTO `log` VALUES ('4572', '123', 'getStaffList', '1497062816');
INSERT INTO `log` VALUES ('4573', '123', 'getShareEmployerList', '1497062823');
INSERT INTO `log` VALUES ('4574', '123', 'getHelpListByStatus', '1497062830');
INSERT INTO `log` VALUES ('4575', '123', 'getPactList', '1497062840');
INSERT INTO `log` VALUES ('4576', '123', 'getAuntList', '1497062854');
INSERT INTO `log` VALUES ('4577', '123', 'getLanguageList', '1497062854');
INSERT INTO `log` VALUES ('4578', '123', 'getCookingList', '1497062854');
INSERT INTO `log` VALUES ('4579', '123', 'getSkillList', '1497062854');
INSERT INTO `log` VALUES ('4580', '123', 'getApplianceList', '1497062854');
INSERT INTO `log` VALUES ('4581', '123', 'getJobList', '1497062854');
INSERT INTO `log` VALUES ('4582', '123', 'getCertificateList', '1497062854');
INSERT INTO `log` VALUES ('4583', '123', 'getEmployerList', '1497062855');
INSERT INTO `log` VALUES ('4584', '123', 'getPactList', '1497062855');
INSERT INTO `log` VALUES ('4585', '123', 'getEmployerList', '1497062954');
INSERT INTO `log` VALUES ('4586', '123', 'getPactList', '1497062954');
INSERT INTO `log` VALUES ('4587', '123', 'login', '1497063225');
INSERT INTO `log` VALUES ('4588', '123', 'getEmployerList', '1497063226');
INSERT INTO `log` VALUES ('4589', '123', 'getPactList', '1497063227');
INSERT INTO `log` VALUES ('4590', '123', 'getEmployerList', '1497063233');
INSERT INTO `log` VALUES ('4591', '123', 'getEmployerListByStatus', '1497063234');
INSERT INTO `log` VALUES ('4592', '123', 'getEmployerListByStatus', '1497063235');
INSERT INTO `log` VALUES ('4593', '123', 'getEmployerListByStatus', '1497063236');
INSERT INTO `log` VALUES ('4594', '123', 'getEmployerListByStatus', '1497063236');
INSERT INTO `log` VALUES ('4595', '123', 'getEmployerListByStatus', '1497063238');
INSERT INTO `log` VALUES ('4596', '123', 'getAuntList', '1497063256');
INSERT INTO `log` VALUES ('4597', '123', 'getLanguageList', '1497063256');
INSERT INTO `log` VALUES ('4598', '123', 'getCookingList', '1497063256');
INSERT INTO `log` VALUES ('4599', '123', 'getSkillList', '1497063256');
INSERT INTO `log` VALUES ('4600', '123', 'getApplianceList', '1497063256');
INSERT INTO `log` VALUES ('4601', '123', 'getJobList', '1497063256');
INSERT INTO `log` VALUES ('4602', '123', 'getCertificateList', '1497063256');
INSERT INTO `log` VALUES ('4603', '123', 'addAunt', '1497063602');
INSERT INTO `log` VALUES ('4604', '123', 'getAuntList', '1497063604');
INSERT INTO `log` VALUES ('4605', '123', 'getLanguageList', '1497063604');
INSERT INTO `log` VALUES ('4606', '123', 'getCookingList', '1497063605');
INSERT INTO `log` VALUES ('4607', '123', 'getSkillList', '1497063605');
INSERT INTO `log` VALUES ('4608', '123', 'getApplianceList', '1497063605');
INSERT INTO `log` VALUES ('4609', '123', 'getJobList', '1497063605');
INSERT INTO `log` VALUES ('4610', '123', 'getCertificateList', '1497063605');
INSERT INTO `log` VALUES ('4611', '123', 'login', '1497064333');
INSERT INTO `log` VALUES ('4612', '123', 'getStaffList', '1497064334');
INSERT INTO `log` VALUES ('4613', '123', 'getStaffList', '1497064370');
INSERT INTO `log` VALUES ('4614', '123', 'getPactList', '1497064373');
INSERT INTO `log` VALUES ('4615', '123', 'getEmployerList', '1497064375');
INSERT INTO `log` VALUES ('4616', '123', 'getPactList', '1497064375');
INSERT INTO `log` VALUES ('4617', '123', 'getAuntList', '1497064376');
INSERT INTO `log` VALUES ('4618', '123', 'getLanguageList', '1497064377');
INSERT INTO `log` VALUES ('4619', '123', 'getCookingList', '1497064377');
INSERT INTO `log` VALUES ('4620', '123', 'getSkillList', '1497064377');
INSERT INTO `log` VALUES ('4621', '123', 'getApplianceList', '1497064377');
INSERT INTO `log` VALUES ('4622', '123', 'getJobList', '1497064377');
INSERT INTO `log` VALUES ('4623', '123', 'getCertificateList', '1497064377');
INSERT INTO `log` VALUES ('4624', '123', 'getAuntList', '1497064403');
INSERT INTO `log` VALUES ('4625', '123', 'getLanguageList', '1497064403');
INSERT INTO `log` VALUES ('4626', '123', 'getCookingList', '1497064404');
INSERT INTO `log` VALUES ('4627', '123', 'getSkillList', '1497064404');
INSERT INTO `log` VALUES ('4628', '123', 'getApplianceList', '1497064404');
INSERT INTO `log` VALUES ('4629', '123', 'getJobList', '1497064404');
INSERT INTO `log` VALUES ('4630', '123', 'getCertificateList', '1497064404');
INSERT INTO `log` VALUES ('4631', '123', 'getEmployerList', '1497064651');
INSERT INTO `log` VALUES ('4632', '123', 'getPactList', '1497064651');
INSERT INTO `log` VALUES ('4633', '123', 'getAuntList', '1497064652');
INSERT INTO `log` VALUES ('4634', '123', 'getLanguageList', '1497064652');
INSERT INTO `log` VALUES ('4635', '123', 'getCookingList', '1497064652');
INSERT INTO `log` VALUES ('4636', '123', 'getSkillList', '1497064652');
INSERT INTO `log` VALUES ('4637', '123', 'getApplianceList', '1497064652');
INSERT INTO `log` VALUES ('4638', '123', 'getJobList', '1497064653');
INSERT INTO `log` VALUES ('4639', '123', 'getCertificateList', '1497064653');
INSERT INTO `log` VALUES ('4640', '123', 'getEmployerList', '1497064654');
INSERT INTO `log` VALUES ('4641', '123', 'getPactList', '1497064654');
INSERT INTO `log` VALUES ('4642', '123', 'getEmployerList', '1497064764');
INSERT INTO `log` VALUES ('4643', '123', 'getPactList', '1497064764');
INSERT INTO `log` VALUES ('4644', '123', 'getAuntList', '1497064765');
INSERT INTO `log` VALUES ('4645', '123', 'getLanguageList', '1497064765');
INSERT INTO `log` VALUES ('4646', '123', 'getCookingList', '1497064766');
INSERT INTO `log` VALUES ('4647', '123', 'getSkillList', '1497064766');
INSERT INTO `log` VALUES ('4648', '123', 'getApplianceList', '1497064766');
INSERT INTO `log` VALUES ('4649', '123', 'getJobList', '1497064766');
INSERT INTO `log` VALUES ('4650', '123', 'getCertificateList', '1497064766');
INSERT INTO `log` VALUES ('4651', '123', 'getEmployerList', '1497064766');
INSERT INTO `log` VALUES ('4652', '123', 'getPactList', '1497064766');
INSERT INTO `log` VALUES ('4653', '123', 'getEmployerList', '1497064917');
INSERT INTO `log` VALUES ('4654', '123', 'getPactList', '1497064917');
INSERT INTO `log` VALUES ('4655', '123', 'getAuntList', '1497065123');
INSERT INTO `log` VALUES ('4656', '123', 'getLanguageList', '1497065123');
INSERT INTO `log` VALUES ('4657', '123', 'getCookingList', '1497065123');
INSERT INTO `log` VALUES ('4658', '123', 'getSkillList', '1497065123');
INSERT INTO `log` VALUES ('4659', '123', 'getApplianceList', '1497065123');
INSERT INTO `log` VALUES ('4660', '123', 'getJobList', '1497065124');
INSERT INTO `log` VALUES ('4661', '123', 'getCertificateList', '1497065124');
INSERT INTO `log` VALUES ('4662', '123', 'getAuntList', '1497065125');
INSERT INTO `log` VALUES ('4663', '123', 'getLanguageList', '1497065125');
INSERT INTO `log` VALUES ('4664', '123', 'getCookingList', '1497065126');
INSERT INTO `log` VALUES ('4665', '123', 'getSkillList', '1497065126');
INSERT INTO `log` VALUES ('4666', '123', 'getApplianceList', '1497065126');
INSERT INTO `log` VALUES ('4667', '123', 'getJobList', '1497065126');
INSERT INTO `log` VALUES ('4668', '123', 'getCertificateList', '1497065126');
INSERT INTO `log` VALUES ('4669', '123', 'getAuntList', '1497065128');
INSERT INTO `log` VALUES ('4670', '123', 'getLanguageList', '1497065128');
INSERT INTO `log` VALUES ('4671', '123', 'getCookingList', '1497065128');
INSERT INTO `log` VALUES ('4672', '123', 'getSkillList', '1497065128');
INSERT INTO `log` VALUES ('4673', '123', 'getApplianceList', '1497065129');
INSERT INTO `log` VALUES ('4674', '123', 'getJobList', '1497065129');
INSERT INTO `log` VALUES ('4675', '123', 'getCertificateList', '1497065129');
INSERT INTO `log` VALUES ('4676', '123', 'getAuntList', '1497065223');
INSERT INTO `log` VALUES ('4677', '123', 'getLanguageList', '1497065223');
INSERT INTO `log` VALUES ('4678', '123', 'getCookingList', '1497065223');
INSERT INTO `log` VALUES ('4679', '123', 'getSkillList', '1497065223');
INSERT INTO `log` VALUES ('4680', '123', 'getApplianceList', '1497065223');
INSERT INTO `log` VALUES ('4681', '123', 'getJobList', '1497065223');
INSERT INTO `log` VALUES ('4682', '123', 'getCertificateList', '1497065223');
INSERT INTO `log` VALUES ('4683', '123', 'getEmployerList', '1497065224');
INSERT INTO `log` VALUES ('4684', '123', 'getPactList', '1497065224');
INSERT INTO `log` VALUES ('4685', '123', 'getAuntList', '1497065225');
INSERT INTO `log` VALUES ('4686', '123', 'getLanguageList', '1497065226');
INSERT INTO `log` VALUES ('4687', '123', 'getCookingList', '1497065226');
INSERT INTO `log` VALUES ('4688', '123', 'getSkillList', '1497065226');
INSERT INTO `log` VALUES ('4689', '123', 'getApplianceList', '1497065226');
INSERT INTO `log` VALUES ('4690', '123', 'getJobList', '1497065227');
INSERT INTO `log` VALUES ('4691', '123', 'getCertificateList', '1497065227');
INSERT INTO `log` VALUES ('4692', '123', 'getEmployerList', '1497065228');
INSERT INTO `log` VALUES ('4693', '123', 'getPactList', '1497065228');
INSERT INTO `log` VALUES ('4694', '123', 'getEmployerList', '1497065230');
INSERT INTO `log` VALUES ('4695', '123', 'getPactList', '1497065231');
INSERT INTO `log` VALUES ('4696', '123', 'getAuntList', '1497065232');
INSERT INTO `log` VALUES ('4697', '123', 'getLanguageList', '1497065232');
INSERT INTO `log` VALUES ('4698', '123', 'getCookingList', '1497065232');
INSERT INTO `log` VALUES ('4699', '123', 'getSkillList', '1497065233');
INSERT INTO `log` VALUES ('4700', '123', 'getApplianceList', '1497065233');
INSERT INTO `log` VALUES ('4701', '123', 'getJobList', '1497065233');
INSERT INTO `log` VALUES ('4702', '123', 'getCertificateList', '1497065233');
INSERT INTO `log` VALUES ('4703', '123', 'getEmployerList', '1497065237');
INSERT INTO `log` VALUES ('4704', '123', 'getPactList', '1497065237');
INSERT INTO `log` VALUES ('4705', '123', 'getEmployerList', '1497065239');
INSERT INTO `log` VALUES ('4706', '123', 'getPactList', '1497065239');
INSERT INTO `log` VALUES ('4707', '123', 'getEmployerList', '1497065275');
INSERT INTO `log` VALUES ('4708', '123', 'getPactList', '1497065276');
INSERT INTO `log` VALUES ('4709', '123', 'getAuntList', '1497065277');
INSERT INTO `log` VALUES ('4710', '123', 'getLanguageList', '1497065277');
INSERT INTO `log` VALUES ('4711', '123', 'getCookingList', '1497065277');
INSERT INTO `log` VALUES ('4712', '123', 'getSkillList', '1497065277');
INSERT INTO `log` VALUES ('4713', '123', 'getApplianceList', '1497065277');
INSERT INTO `log` VALUES ('4714', '123', 'getJobList', '1497065277');
INSERT INTO `log` VALUES ('4715', '123', 'getCertificateList', '1497065277');
INSERT INTO `log` VALUES ('4716', '123', 'getEmployerList', '1497065278');
INSERT INTO `log` VALUES ('4717', '123', 'getPactList', '1497065278');
INSERT INTO `log` VALUES ('4718', '123', 'getEmployerList', '1497065320');
INSERT INTO `log` VALUES ('4719', '123', 'getPactList', '1497065320');
INSERT INTO `log` VALUES ('4720', '123', 'getAuntList', '1497065360');
INSERT INTO `log` VALUES ('4721', '123', 'getLanguageList', '1497065360');
INSERT INTO `log` VALUES ('4722', '123', 'getCookingList', '1497065360');
INSERT INTO `log` VALUES ('4723', '123', 'getSkillList', '1497065360');
INSERT INTO `log` VALUES ('4724', '123', 'getApplianceList', '1497065360');
INSERT INTO `log` VALUES ('4725', '123', 'getJobList', '1497065360');
INSERT INTO `log` VALUES ('4726', '123', 'getCertificateList', '1497065361');
INSERT INTO `log` VALUES ('4727', '123', 'getAuntList', '1497065376');
INSERT INTO `log` VALUES ('4728', '123', 'getLanguageList', '1497065376');
INSERT INTO `log` VALUES ('4729', '123', 'getCookingList', '1497065376');
INSERT INTO `log` VALUES ('4730', '123', 'getSkillList', '1497065376');
INSERT INTO `log` VALUES ('4731', '123', 'getApplianceList', '1497065376');
INSERT INTO `log` VALUES ('4732', '123', 'getJobList', '1497065376');
INSERT INTO `log` VALUES ('4733', '123', 'getCertificateList', '1497065377');
INSERT INTO `log` VALUES ('4734', '123', 'getAuntList', '1497065381');
INSERT INTO `log` VALUES ('4735', '123', 'getLanguageList', '1497065381');
INSERT INTO `log` VALUES ('4736', '123', 'getCookingList', '1497065381');
INSERT INTO `log` VALUES ('4737', '123', 'getSkillList', '1497065381');
INSERT INTO `log` VALUES ('4738', '123', 'getApplianceList', '1497065381');
INSERT INTO `log` VALUES ('4739', '123', 'getJobList', '1497065381');
INSERT INTO `log` VALUES ('4740', '123', 'getCertificateList', '1497065381');
INSERT INTO `log` VALUES ('4741', '123', 'getAuntList', '1497065383');
INSERT INTO `log` VALUES ('4742', '123', 'getLanguageList', '1497065383');
INSERT INTO `log` VALUES ('4743', '123', 'getCookingList', '1497065383');
INSERT INTO `log` VALUES ('4744', '123', 'getSkillList', '1497065383');
INSERT INTO `log` VALUES ('4745', '123', 'getApplianceList', '1497065383');
INSERT INTO `log` VALUES ('4746', '123', 'getJobList', '1497065383');
INSERT INTO `log` VALUES ('4747', '123', 'getCertificateList', '1497065384');
INSERT INTO `log` VALUES ('4748', '123', 'getEmployerList', '1497065918');
INSERT INTO `log` VALUES ('4749', '123', 'getPactList', '1497065918');
INSERT INTO `log` VALUES ('4750', '123', 'getAuntList', '1497065919');
INSERT INTO `log` VALUES ('4751', '123', 'getLanguageList', '1497065919');
INSERT INTO `log` VALUES ('4752', '123', 'getCookingList', '1497065920');
INSERT INTO `log` VALUES ('4753', '123', 'getSkillList', '1497065920');
INSERT INTO `log` VALUES ('4754', '123', 'getApplianceList', '1497065920');
INSERT INTO `log` VALUES ('4755', '123', 'getJobList', '1497065920');
INSERT INTO `log` VALUES ('4756', '123', 'getCertificateList', '1497065920');
INSERT INTO `log` VALUES ('4757', '123', 'getEmployerList', '1497066319');
INSERT INTO `log` VALUES ('4758', '123', 'getPactList', '1497066319');
INSERT INTO `log` VALUES ('4759', '123', 'getHelpListByStatus', '1497066603');
INSERT INTO `log` VALUES ('4760', '123', 'getUnAckUserList', '1497066611');
INSERT INTO `log` VALUES ('4761', '123', 'getEmployerList', '1497066655');
INSERT INTO `log` VALUES ('4762', '123', 'getPactList', '1497066655');
INSERT INTO `log` VALUES ('4763', '123', 'getAuntList', '1497066657');
INSERT INTO `log` VALUES ('4764', '123', 'getLanguageList', '1497066657');
INSERT INTO `log` VALUES ('4765', '123', 'getCookingList', '1497066657');
INSERT INTO `log` VALUES ('4766', '123', 'getSkillList', '1497066658');
INSERT INTO `log` VALUES ('4767', '123', 'getApplianceList', '1497066658');
INSERT INTO `log` VALUES ('4768', '123', 'getJobList', '1497066658');
INSERT INTO `log` VALUES ('4769', '123', 'getCertificateList', '1497066658');
INSERT INTO `log` VALUES ('4770', '123', 'getStaffList', '1497066661');
INSERT INTO `log` VALUES ('4771', '123', 'login', '1497073585');
INSERT INTO `log` VALUES ('4772', '123', 'getAuntList', '1497073588');
INSERT INTO `log` VALUES ('4773', '123', 'getLanguageList', '1497073588');
INSERT INTO `log` VALUES ('4774', '123', 'getCookingList', '1497073589');
INSERT INTO `log` VALUES ('4775', '123', 'getSkillList', '1497073589');
INSERT INTO `log` VALUES ('4776', '123', 'getApplianceList', '1497073589');
INSERT INTO `log` VALUES ('4777', '123', 'getJobList', '1497073589');
INSERT INTO `log` VALUES ('4778', '123', 'getCertificateList', '1497073589');
INSERT INTO `log` VALUES ('4779', '123', 'getShareEmployerList', '1497073598');
INSERT INTO `log` VALUES ('4780', '123', 'getShareAuntList', '1497073604');
INSERT INTO `log` VALUES ('4781', '123', 'getShareEmployerList', '1497073820');
INSERT INTO `log` VALUES ('4782', '123', 'getShareAuntList', '1497073822');
INSERT INTO `log` VALUES ('4783', '123', 'deleteShareAunt', '1497073835');
INSERT INTO `log` VALUES ('4784', '123', 'getShareEmployerList', '1497073837');
INSERT INTO `log` VALUES ('4785', '123', 'getShareAuntList', '1497073844');
INSERT INTO `log` VALUES ('4786', '123', 'login', '1497073992');
INSERT INTO `log` VALUES ('4787', '123', 'getShareEmployerList', '1497073998');
INSERT INTO `log` VALUES ('4788', '123', 'getShareAuntList', '1497074000');
INSERT INTO `log` VALUES ('4789', '123', 'getEmployerList', '1497074020');
INSERT INTO `log` VALUES ('4790', '123', 'getPactList', '1497074020');
INSERT INTO `log` VALUES ('4791', '123', 'getEmployerList', '1497074158');
INSERT INTO `log` VALUES ('4792', '123', 'getPactList', '1497074158');
INSERT INTO `log` VALUES ('4793', '123', 'getAuntList', '1497074162');
INSERT INTO `log` VALUES ('4794', '123', 'getLanguageList', '1497074162');
INSERT INTO `log` VALUES ('4795', '123', 'getCookingList', '1497074162');
INSERT INTO `log` VALUES ('4796', '123', 'getSkillList', '1497074163');
INSERT INTO `log` VALUES ('4797', '123', 'getApplianceList', '1497074163');
INSERT INTO `log` VALUES ('4798', '123', 'getJobList', '1497074163');
INSERT INTO `log` VALUES ('4799', '123', 'getCertificateList', '1497074164');
INSERT INTO `log` VALUES ('4800', '123', 'getEmployerList', '1497074166');
INSERT INTO `log` VALUES ('4801', '123', 'getPactList', '1497074166');
INSERT INTO `log` VALUES ('4802', '123', 'getAuntList', '1497074167');
INSERT INTO `log` VALUES ('4803', '123', 'getLanguageList', '1497074168');
INSERT INTO `log` VALUES ('4804', '123', 'getCookingList', '1497074169');
INSERT INTO `log` VALUES ('4805', '123', 'getSkillList', '1497074169');
INSERT INTO `log` VALUES ('4806', '123', 'getApplianceList', '1497074169');
INSERT INTO `log` VALUES ('4807', '123', 'getJobList', '1497074169');
INSERT INTO `log` VALUES ('4808', '123', 'getCertificateList', '1497074169');
INSERT INTO `log` VALUES ('4809', '123', 'getAuntList', '1497074170');
INSERT INTO `log` VALUES ('4810', '123', 'getLanguageList', '1497074170');
INSERT INTO `log` VALUES ('4811', '123', 'getCookingList', '1497074170');
INSERT INTO `log` VALUES ('4812', '123', 'getSkillList', '1497074170');
INSERT INTO `log` VALUES ('4813', '123', 'getApplianceList', '1497074170');
INSERT INTO `log` VALUES ('4814', '123', 'getJobList', '1497074171');
INSERT INTO `log` VALUES ('4815', '123', 'getCertificateList', '1497074171');
INSERT INTO `log` VALUES ('4816', '123', 'getPactList', '1497074174');
INSERT INTO `log` VALUES ('4817', '123', 'getShareEmployerList', '1497074176');
INSERT INTO `log` VALUES ('4818', '123', 'getStaffList', '1497074177');
INSERT INTO `log` VALUES ('4819', '123', 'getShareEmployerList', '1497074179');
INSERT INTO `log` VALUES ('4820', '123', 'getShareEmployerList', '1497074510');
INSERT INTO `log` VALUES ('4821', '123', 'getPactList', '1497074514');
INSERT INTO `log` VALUES ('4822', '123', 'getShareEmployerList', '1497074520');
INSERT INTO `log` VALUES ('4823', '123', 'login', '1497074747');
INSERT INTO `log` VALUES ('4824', '123', 'getStaffList', '1497074751');
INSERT INTO `log` VALUES ('4825', '123', 'getShareEmployerList', '1497074752');
INSERT INTO `log` VALUES ('4826', '123', 'getPactList', '1497074753');
INSERT INTO `log` VALUES ('4827', '123', 'getAuntList', '1497074753');
INSERT INTO `log` VALUES ('4828', '123', 'getLanguageList', '1497074754');
INSERT INTO `log` VALUES ('4829', '123', 'getCookingList', '1497074754');
INSERT INTO `log` VALUES ('4830', '123', 'getSkillList', '1497074754');
INSERT INTO `log` VALUES ('4831', '123', 'getApplianceList', '1497074754');
INSERT INTO `log` VALUES ('4832', '123', 'getJobList', '1497074754');
INSERT INTO `log` VALUES ('4833', '123', 'getCertificateList', '1497074754');
INSERT INTO `log` VALUES ('4834', '123', 'getEmployerList', '1497074754');
INSERT INTO `log` VALUES ('4835', '123', 'getPactList', '1497074755');
INSERT INTO `log` VALUES ('4836', '123', 'getEmployerList', '1497074775');
INSERT INTO `log` VALUES ('4837', '123', 'getPactList', '1497074775');
INSERT INTO `log` VALUES ('4838', '123', 'getAuntList', '1497074779');
INSERT INTO `log` VALUES ('4839', '123', 'getLanguageList', '1497074779');
INSERT INTO `log` VALUES ('4840', '123', 'getCookingList', '1497074779');
INSERT INTO `log` VALUES ('4841', '123', 'getSkillList', '1497074779');
INSERT INTO `log` VALUES ('4842', '123', 'getApplianceList', '1497074779');
INSERT INTO `log` VALUES ('4843', '123', 'getJobList', '1497074780');
INSERT INTO `log` VALUES ('4844', '123', 'getCertificateList', '1497074780');
INSERT INTO `log` VALUES ('4845', '123', 'getPactList', '1497074781');
INSERT INTO `log` VALUES ('4846', '123', 'getShareEmployerList', '1497074783');
INSERT INTO `log` VALUES ('4847', '123', 'getPactList', '1497074784');
INSERT INTO `log` VALUES ('4848', '123', 'getShareEmployerList', '1497074789');
INSERT INTO `log` VALUES ('4849', '123', 'getPactList', '1497074792');
INSERT INTO `log` VALUES ('4850', '123', 'getShareEmployerList', '1497074793');
INSERT INTO `log` VALUES ('4851', '123', 'getPactList', '1497074793');
INSERT INTO `log` VALUES ('4852', '123', 'getAuntList', '1497074794');
INSERT INTO `log` VALUES ('4853', '123', 'getLanguageList', '1497074794');
INSERT INTO `log` VALUES ('4854', '123', 'getCookingList', '1497074794');
INSERT INTO `log` VALUES ('4855', '123', 'getSkillList', '1497074794');
INSERT INTO `log` VALUES ('4856', '123', 'getApplianceList', '1497074794');
INSERT INTO `log` VALUES ('4857', '123', 'getJobList', '1497074795');
INSERT INTO `log` VALUES ('4858', '123', 'getCertificateList', '1497074795');
INSERT INTO `log` VALUES ('4859', '123', 'getPactList', '1497074796');
INSERT INTO `log` VALUES ('4860', '123', 'getPactList', '1497074876');
INSERT INTO `log` VALUES ('4861', '123', 'getPactList', '1497074915');
INSERT INTO `log` VALUES ('4862', '123', 'login', '1497074928');
INSERT INTO `log` VALUES ('4863', '123', 'getPactList', '1497074930');
INSERT INTO `log` VALUES ('4864', '123', 'getShareEmployerList', '1497074934');
INSERT INTO `log` VALUES ('4865', '123', 'getStaffList', '1497074937');
INSERT INTO `log` VALUES ('4866', '123', 'getPactList', '1497074939');
INSERT INTO `log` VALUES ('4867', '123', 'getAuntList', '1497074940');
INSERT INTO `log` VALUES ('4868', '123', 'getLanguageList', '1497074940');
INSERT INTO `log` VALUES ('4869', '123', 'getCookingList', '1497074940');
INSERT INTO `log` VALUES ('4870', '123', 'getSkillList', '1497074940');
INSERT INTO `log` VALUES ('4871', '123', 'getApplianceList', '1497074940');
INSERT INTO `log` VALUES ('4872', '123', 'getJobList', '1497074940');
INSERT INTO `log` VALUES ('4873', '123', 'getCertificateList', '1497074940');
INSERT INTO `log` VALUES ('4874', '123', 'getEmployerList', '1497074941');
INSERT INTO `log` VALUES ('4875', '123', 'getPactList', '1497074941');
INSERT INTO `log` VALUES ('4876', '123', 'getPactList', '1497074943');
INSERT INTO `log` VALUES ('4877', '123', 'getShareEmployerList', '1497074944');
INSERT INTO `log` VALUES ('4878', '123', 'getStaffList', '1497074951');
INSERT INTO `log` VALUES ('4879', '123', 'getPactList', '1497074953');
INSERT INTO `log` VALUES ('4880', '123', 'getPactListByStatus', '1497074956');
INSERT INTO `log` VALUES ('4881', '123', 'getPactListByStatus', '1497074957');
INSERT INTO `log` VALUES ('4882', '123', 'getPactListByStatus', '1497074958');
INSERT INTO `log` VALUES ('4883', '123', 'getPactList', '1497074959');
INSERT INTO `log` VALUES ('4884', '123', 'getShareEmployerList', '1497074980');
INSERT INTO `log` VALUES ('4885', '123', 'getStaffList', '1497074982');
INSERT INTO `log` VALUES ('4886', '123', 'getStaffList', '1497074984');
INSERT INTO `log` VALUES ('4887', '123', 'getShareEmployerList', '1497074986');
INSERT INTO `log` VALUES ('4888', '123', 'getPactList', '1497074992');
INSERT INTO `log` VALUES ('4889', '123', 'getAuntList', '1497074993');
INSERT INTO `log` VALUES ('4890', '123', 'getLanguageList', '1497074993');
INSERT INTO `log` VALUES ('4891', '123', 'getCookingList', '1497074993');
INSERT INTO `log` VALUES ('4892', '123', 'getSkillList', '1497074993');
INSERT INTO `log` VALUES ('4893', '123', 'getApplianceList', '1497074994');
INSERT INTO `log` VALUES ('4894', '123', 'getJobList', '1497074994');
INSERT INTO `log` VALUES ('4895', '123', 'getCertificateList', '1497074994');
INSERT INTO `log` VALUES ('4896', '123', 'getEmployerList', '1497074997');
INSERT INTO `log` VALUES ('4897', '123', 'getPactList', '1497074997');
INSERT INTO `log` VALUES ('4898', '123', 'getEmployerList', '1497075000');
INSERT INTO `log` VALUES ('4899', '123', 'getPactList', '1497075000');
INSERT INTO `log` VALUES ('4900', '123', 'getPactList', '1497075001');
INSERT INTO `log` VALUES ('4901', '123', 'getStaffList', '1497075118');
INSERT INTO `log` VALUES ('4902', '123', 'getPactList', '1497075123');
INSERT INTO `log` VALUES ('4903', '123', 'login', '1497075168');
INSERT INTO `log` VALUES ('4904', '123', 'getEmployerList', '1497075169');
INSERT INTO `log` VALUES ('4905', '123', 'getPactList', '1497075170');
INSERT INTO `log` VALUES ('4906', '123', 'getAuntList', '1497075172');
INSERT INTO `log` VALUES ('4907', '123', 'getLanguageList', '1497075173');
INSERT INTO `log` VALUES ('4908', '123', 'getCookingList', '1497075173');
INSERT INTO `log` VALUES ('4909', '123', 'getSkillList', '1497075173');
INSERT INTO `log` VALUES ('4910', '123', 'getApplianceList', '1497075173');
INSERT INTO `log` VALUES ('4911', '123', 'getJobList', '1497075173');
INSERT INTO `log` VALUES ('4912', '123', 'getCertificateList', '1497075173');
INSERT INTO `log` VALUES ('4913', '123', 'getPactList', '1497075182');
INSERT INTO `log` VALUES ('4914', '123', 'getShareEmployerList', '1497075185');
INSERT INTO `log` VALUES ('4915', '123', 'getStaffList', '1497075190');
INSERT INTO `log` VALUES ('4916', '123', 'getAuntList', '1497075254');
INSERT INTO `log` VALUES ('4917', '123', 'getLanguageList', '1497075254');
INSERT INTO `log` VALUES ('4918', '123', 'getCookingList', '1497075254');
INSERT INTO `log` VALUES ('4919', '123', 'getSkillList', '1497075254');
INSERT INTO `log` VALUES ('4920', '123', 'getApplianceList', '1497075254');
INSERT INTO `log` VALUES ('4921', '123', 'getJobList', '1497075255');
INSERT INTO `log` VALUES ('4922', '123', 'getCertificateList', '1497075255');
INSERT INTO `log` VALUES ('4923', '123', 'getAuntList', '1497075273');
INSERT INTO `log` VALUES ('4924', '123', 'getLanguageList', '1497075274');
INSERT INTO `log` VALUES ('4925', '123', 'getCookingList', '1497075274');
INSERT INTO `log` VALUES ('4926', '123', 'getSkillList', '1497075274');
INSERT INTO `log` VALUES ('4927', '123', 'getApplianceList', '1497075274');
INSERT INTO `log` VALUES ('4928', '123', 'getJobList', '1497075274');
INSERT INTO `log` VALUES ('4929', '123', 'getCertificateList', '1497075274');
INSERT INTO `log` VALUES ('4930', '123', 'getEmployerList', '1497075301');
INSERT INTO `log` VALUES ('4931', '123', 'getPactList', '1497075301');
INSERT INTO `log` VALUES ('4932', '123', 'getEmployerList', '1497075322');
INSERT INTO `log` VALUES ('4933', '123', 'getPactList', '1497075322');
INSERT INTO `log` VALUES ('4934', '123', 'getAuntList', '1497075328');
INSERT INTO `log` VALUES ('4935', '123', 'getLanguageList', '1497075328');
INSERT INTO `log` VALUES ('4936', '123', 'getCookingList', '1497075329');
INSERT INTO `log` VALUES ('4937', '123', 'getSkillList', '1497075329');
INSERT INTO `log` VALUES ('4938', '123', 'getApplianceList', '1497075329');
INSERT INTO `log` VALUES ('4939', '123', 'getJobList', '1497075329');
INSERT INTO `log` VALUES ('4940', '123', 'getCertificateList', '1497075329');
INSERT INTO `log` VALUES ('4941', '123', 'getPactList', '1497075331');
INSERT INTO `log` VALUES ('4942', '123', 'getEmployerList', '1497075440');
INSERT INTO `log` VALUES ('4943', '123', 'getPactList', '1497075440');
INSERT INTO `log` VALUES ('4944', '123', 'getAuntList', '1497075441');
INSERT INTO `log` VALUES ('4945', '123', 'getLanguageList', '1497075442');
INSERT INTO `log` VALUES ('4946', '123', 'getCookingList', '1497075442');
INSERT INTO `log` VALUES ('4947', '123', 'getSkillList', '1497075442');
INSERT INTO `log` VALUES ('4948', '123', 'getApplianceList', '1497075442');
INSERT INTO `log` VALUES ('4949', '123', 'getJobList', '1497075442');
INSERT INTO `log` VALUES ('4950', '123', 'getCertificateList', '1497075442');
INSERT INTO `log` VALUES ('4951', '123', 'getPactList', '1497075443');
INSERT INTO `log` VALUES ('4952', '123', 'getShareEmployerList', '1497075444');
INSERT INTO `log` VALUES ('4953', '123', 'getEmployerList', '1497075697');
INSERT INTO `log` VALUES ('4954', '123', 'getPactList', '1497075698');
INSERT INTO `log` VALUES ('4955', '123', 'getEmployerList', '1497075920');
INSERT INTO `log` VALUES ('4956', '123', 'getPactList', '1497075920');
INSERT INTO `log` VALUES ('4957', '123', 'getEmployerList', '1497075952');
INSERT INTO `log` VALUES ('4958', '123', 'getPactList', '1497075952');
INSERT INTO `log` VALUES ('4959', '123', 'getEmployerList', '1497075989');
INSERT INTO `log` VALUES ('4960', '123', 'getPactList', '1497075990');
INSERT INTO `log` VALUES ('4961', '123', 'getEmployerList', '1497076031');
INSERT INTO `log` VALUES ('4962', '123', 'getPactList', '1497076031');
INSERT INTO `log` VALUES ('4963', '123', 'getEmployerList', '1497076064');
INSERT INTO `log` VALUES ('4964', '123', 'getPactList', '1497076064');
INSERT INTO `log` VALUES ('4965', '123', 'login', '1497076085');
INSERT INTO `log` VALUES ('4966', '123', 'getEmployerList', '1497076087');
INSERT INTO `log` VALUES ('4967', '123', 'getPactList', '1497076087');
INSERT INTO `log` VALUES ('4968', '123', 'getEmployerList', '1497076104');
INSERT INTO `log` VALUES ('4969', '123', 'getPactList', '1497076104');
INSERT INTO `log` VALUES ('4970', '123', 'getEmployerList', '1497076114');
INSERT INTO `log` VALUES ('4971', '123', 'getPactList', '1497076114');
INSERT INTO `log` VALUES ('4972', '123', 'getEmployerList', '1497076128');
INSERT INTO `log` VALUES ('4973', '123', 'getPactList', '1497076128');
INSERT INTO `log` VALUES ('4974', '123', 'getAuntList', '1497076136');
INSERT INTO `log` VALUES ('4975', '123', 'getLanguageList', '1497076136');
INSERT INTO `log` VALUES ('4976', '123', 'getCookingList', '1497076136');
INSERT INTO `log` VALUES ('4977', '123', 'getSkillList', '1497076136');
INSERT INTO `log` VALUES ('4978', '123', 'getApplianceList', '1497076136');
INSERT INTO `log` VALUES ('4979', '123', 'getJobList', '1497076137');
INSERT INTO `log` VALUES ('4980', '123', 'getCertificateList', '1497076137');
INSERT INTO `log` VALUES ('4981', '123', 'getAuntList', '1497076185');
INSERT INTO `log` VALUES ('4982', '123', 'getLanguageList', '1497076185');
INSERT INTO `log` VALUES ('4983', '123', 'getCookingList', '1497076185');
INSERT INTO `log` VALUES ('4984', '123', 'getSkillList', '1497076186');
INSERT INTO `log` VALUES ('4985', '123', 'getApplianceList', '1497076186');
INSERT INTO `log` VALUES ('4986', '123', 'getJobList', '1497076186');
INSERT INTO `log` VALUES ('4987', '123', 'getCertificateList', '1497076186');
INSERT INTO `log` VALUES ('4988', '123', 'login', '1497076198');
INSERT INTO `log` VALUES ('4989', '123', 'getAuntList', '1497076199');
INSERT INTO `log` VALUES ('4990', '123', 'getLanguageList', '1497076199');
INSERT INTO `log` VALUES ('4991', '123', 'getCookingList', '1497076199');
INSERT INTO `log` VALUES ('4992', '123', 'getSkillList', '1497076200');
INSERT INTO `log` VALUES ('4993', '123', 'getApplianceList', '1497076200');
INSERT INTO `log` VALUES ('4994', '123', 'getJobList', '1497076200');
INSERT INTO `log` VALUES ('4995', '123', 'getCertificateList', '1497076200');
INSERT INTO `log` VALUES ('4996', '123', 'getPactList', '1497076264');
INSERT INTO `log` VALUES ('4997', '123', 'getShareEmployerList', '1497076340');
INSERT INTO `log` VALUES ('4998', '123', 'getStaffList', '1497076347');
INSERT INTO `log` VALUES ('4999', '123', 'getStaffList', '1497076357');
INSERT INTO `log` VALUES ('5000', '123', 'getStaffList', '1497076413');
INSERT INTO `log` VALUES ('5001', '123', 'login', '1497076426');
INSERT INTO `log` VALUES ('5002', '123', 'getStaffList', '1497076430');
INSERT INTO `log` VALUES ('5003', '123', 'getStaffList', '1497076491');
INSERT INTO `log` VALUES ('5004', '123', 'getStaffList', '1497076539');
INSERT INTO `log` VALUES ('5005', '123', 'login', '1497076674');
INSERT INTO `log` VALUES ('5006', '123', 'getStaffList', '1497076676');
INSERT INTO `log` VALUES ('5007', '123', 'login', '1497076693');
INSERT INTO `log` VALUES ('5008', '123', 'getEmployerList', '1497076702');
INSERT INTO `log` VALUES ('5009', '123', 'getPactList', '1497076702');
INSERT INTO `log` VALUES ('5010', '123', 'getAuntList', '1497076704');
INSERT INTO `log` VALUES ('5011', '123', 'getLanguageList', '1497076704');
INSERT INTO `log` VALUES ('5012', '123', 'getCookingList', '1497076704');
INSERT INTO `log` VALUES ('5013', '123', 'getSkillList', '1497076704');
INSERT INTO `log` VALUES ('5014', '123', 'getApplianceList', '1497076704');
INSERT INTO `log` VALUES ('5015', '123', 'getJobList', '1497076705');
INSERT INTO `log` VALUES ('5016', '123', 'getCertificateList', '1497076705');
INSERT INTO `log` VALUES ('5017', '123', 'getPactList', '1497076706');
INSERT INTO `log` VALUES ('5018', '123', 'getShareEmployerList', '1497076707');
INSERT INTO `log` VALUES ('5019', '123', 'getStaffList', '1497076708');
INSERT INTO `log` VALUES ('5020', '123', 'getStaffList', '1497076718');
INSERT INTO `log` VALUES ('5021', '123', 'getPactList', '1497076722');
INSERT INTO `log` VALUES ('5022', '123', 'getAuntList', '1497076725');
INSERT INTO `log` VALUES ('5023', '123', 'getLanguageList', '1497076725');
INSERT INTO `log` VALUES ('5024', '123', 'getCookingList', '1497076725');
INSERT INTO `log` VALUES ('5025', '123', 'getSkillList', '1497076725');
INSERT INTO `log` VALUES ('5026', '123', 'getApplianceList', '1497076726');
INSERT INTO `log` VALUES ('5027', '123', 'getJobList', '1497076726');
INSERT INTO `log` VALUES ('5028', '123', 'getCertificateList', '1497076726');
INSERT INTO `log` VALUES ('5029', '123', 'getEmployerList', '1497076727');
INSERT INTO `log` VALUES ('5030', '123', 'getPactList', '1497076727');
INSERT INTO `log` VALUES ('5031', '123', 'getPactList', '1497076729');
INSERT INTO `log` VALUES ('5032', '123', 'getPactListByStatus', '1497077997');
INSERT INTO `log` VALUES ('5033', '123', 'getPactListByStatus', '1497077998');
INSERT INTO `log` VALUES ('5034', '123', 'getPactListByStatus', '1497077999');
INSERT INTO `log` VALUES ('5035', '123', 'getPactList', '1497078007');
INSERT INTO `log` VALUES ('5036', '123', 'getAuntList', '1497078017');
INSERT INTO `log` VALUES ('5037', '123', 'getLanguageList', '1497078018');
INSERT INTO `log` VALUES ('5038', '123', 'getCookingList', '1497078018');
INSERT INTO `log` VALUES ('5039', '123', 'getSkillList', '1497078018');
INSERT INTO `log` VALUES ('5040', '123', 'getApplianceList', '1497078018');
INSERT INTO `log` VALUES ('5041', '123', 'getJobList', '1497078018');
INSERT INTO `log` VALUES ('5042', '123', 'getCertificateList', '1497078018');
INSERT INTO `log` VALUES ('5043', '123', 'getEmployerList', '1497078018');
INSERT INTO `log` VALUES ('5044', '123', 'getPactList', '1497078019');
INSERT INTO `log` VALUES ('5045', '123', 'getPactList', '1497078025');
INSERT INTO `log` VALUES ('5046', '123', 'getEmployerList', '1497078810');
INSERT INTO `log` VALUES ('5047', '123', 'getPactList', '1497078810');
INSERT INTO `log` VALUES ('5048', '123', 'login', '1497078935');
INSERT INTO `log` VALUES ('5049', '123', 'getEmployerList', '1497078937');
INSERT INTO `log` VALUES ('5050', '123', 'getAuntList', '1497078939');
INSERT INTO `log` VALUES ('5051', '123', 'getLanguageList', '1497078940');
INSERT INTO `log` VALUES ('5052', '123', 'getCookingList', '1497078940');
INSERT INTO `log` VALUES ('5053', '123', 'getSkillList', '1497078940');
INSERT INTO `log` VALUES ('5054', '123', 'getApplianceList', '1497078940');
INSERT INTO `log` VALUES ('5055', '123', 'getJobList', '1497078940');
INSERT INTO `log` VALUES ('5056', '123', 'getCertificateList', '1497078940');
INSERT INTO `log` VALUES ('5057', '123', 'getAuntList', '1497078944');
INSERT INTO `log` VALUES ('5058', '123', 'getLanguageList', '1497078944');
INSERT INTO `log` VALUES ('5059', '123', 'getCookingList', '1497078944');
INSERT INTO `log` VALUES ('5060', '123', 'getSkillList', '1497078944');
INSERT INTO `log` VALUES ('5061', '123', 'getApplianceList', '1497078944');
INSERT INTO `log` VALUES ('5062', '123', 'getJobList', '1497078944');
INSERT INTO `log` VALUES ('5063', '123', 'getCertificateList', '1497078944');
INSERT INTO `log` VALUES ('5064', '123', 'getShareEmployerList', '1497078946');
INSERT INTO `log` VALUES ('5065', '123', 'getStaffList', '1497078948');
INSERT INTO `log` VALUES ('5066', '123', 'getStaffList', '1497078951');
INSERT INTO `log` VALUES ('5067', '123', 'getEmployerList', '1497078955');
INSERT INTO `log` VALUES ('5068', '123', 'getAuntList', '1497078958');
INSERT INTO `log` VALUES ('5069', '123', 'getLanguageList', '1497078958');
INSERT INTO `log` VALUES ('5070', '123', 'getCookingList', '1497078958');
INSERT INTO `log` VALUES ('5071', '123', 'getSkillList', '1497078958');
INSERT INTO `log` VALUES ('5072', '123', 'getApplianceList', '1497078959');
INSERT INTO `log` VALUES ('5073', '123', 'getJobList', '1497078959');
INSERT INTO `log` VALUES ('5074', '123', 'getCertificateList', '1497078959');
INSERT INTO `log` VALUES ('5075', '123', 'getShareEmployerList', '1497078969');
INSERT INTO `log` VALUES ('5076', '123', 'getStaffList', '1497078971');
INSERT INTO `log` VALUES ('5077', '123', 'getEmployerList', '1497078973');
INSERT INTO `log` VALUES ('5078', '123', 'getEmployerList', '1497079021');
INSERT INTO `log` VALUES ('5079', '123', 'getAuntList', '1497079024');
INSERT INTO `log` VALUES ('5080', '123', 'getLanguageList', '1497079024');
INSERT INTO `log` VALUES ('5081', '123', 'getCookingList', '1497079024');
INSERT INTO `log` VALUES ('5082', '123', 'getSkillList', '1497079025');
INSERT INTO `log` VALUES ('5083', '123', 'getApplianceList', '1497079025');
INSERT INTO `log` VALUES ('5084', '123', 'getJobList', '1497079025');
INSERT INTO `log` VALUES ('5085', '123', 'getCertificateList', '1497079025');
INSERT INTO `log` VALUES ('5086', '123', 'getAuntList', '1497079025');
INSERT INTO `log` VALUES ('5087', '123', 'getLanguageList', '1497079025');
INSERT INTO `log` VALUES ('5088', '123', 'getCookingList', '1497079026');
INSERT INTO `log` VALUES ('5089', '123', 'getSkillList', '1497079026');
INSERT INTO `log` VALUES ('5090', '123', 'getApplianceList', '1497079026');
INSERT INTO `log` VALUES ('5091', '123', 'getJobList', '1497079026');
INSERT INTO `log` VALUES ('5092', '123', 'getCertificateList', '1497079026');
INSERT INTO `log` VALUES ('5093', '123', 'getEmployerList', '1497079029');
INSERT INTO `log` VALUES ('5094', '123', 'getAuntList', '1497079032');
INSERT INTO `log` VALUES ('5095', '123', 'getLanguageList', '1497079032');
INSERT INTO `log` VALUES ('5096', '123', 'getCookingList', '1497079032');
INSERT INTO `log` VALUES ('5097', '123', 'getSkillList', '1497079032');
INSERT INTO `log` VALUES ('5098', '123', 'getApplianceList', '1497079032');
INSERT INTO `log` VALUES ('5099', '123', 'getJobList', '1497079033');
INSERT INTO `log` VALUES ('5100', '123', 'getCertificateList', '1497079033');
INSERT INTO `log` VALUES ('5101', '123', 'getAuntList', '1497079048');
INSERT INTO `log` VALUES ('5102', '123', 'getLanguageList', '1497079048');
INSERT INTO `log` VALUES ('5103', '123', 'getCookingList', '1497079049');
INSERT INTO `log` VALUES ('5104', '123', 'getSkillList', '1497079049');
INSERT INTO `log` VALUES ('5105', '123', 'getApplianceList', '1497079049');
INSERT INTO `log` VALUES ('5106', '123', 'getJobList', '1497079049');
INSERT INTO `log` VALUES ('5107', '123', 'getCertificateList', '1497079049');
INSERT INTO `log` VALUES ('5108', '123', 'getEmployerList', '1497079050');
INSERT INTO `log` VALUES ('5109', '123', 'getShareEmployerList', '1497079052');
INSERT INTO `log` VALUES ('5110', '123', 'getStaffList', '1497079053');
INSERT INTO `log` VALUES ('5111', '123', 'getStaffList', '1497079056');
INSERT INTO `log` VALUES ('5112', '123', 'getShareEmployerList', '1497079056');
INSERT INTO `log` VALUES ('5113', '123', 'getAuntList', '1497079057');
INSERT INTO `log` VALUES ('5114', '123', 'getLanguageList', '1497079058');
INSERT INTO `log` VALUES ('5115', '123', 'getCookingList', '1497079058');
INSERT INTO `log` VALUES ('5116', '123', 'getSkillList', '1497079058');
INSERT INTO `log` VALUES ('5117', '123', 'getApplianceList', '1497079058');
INSERT INTO `log` VALUES ('5118', '123', 'getJobList', '1497079058');
INSERT INTO `log` VALUES ('5119', '123', 'getCertificateList', '1497079058');
INSERT INTO `log` VALUES ('5120', '123', 'getEmployerList', '1497079058');
INSERT INTO `log` VALUES ('5121', '123', 'getEmployerList', '1497079059');
INSERT INTO `log` VALUES ('5122', '123', 'getAuntList', '1497079109');
INSERT INTO `log` VALUES ('5123', '123', 'getLanguageList', '1497079109');
INSERT INTO `log` VALUES ('5124', '123', 'getCookingList', '1497079109');
INSERT INTO `log` VALUES ('5125', '123', 'getSkillList', '1497079110');
INSERT INTO `log` VALUES ('5126', '123', 'getApplianceList', '1497079110');
INSERT INTO `log` VALUES ('5127', '123', 'getJobList', '1497079110');
INSERT INTO `log` VALUES ('5128', '123', 'getCertificateList', '1497079110');
INSERT INTO `log` VALUES ('5129', '123', 'getAuntList', '1497079112');
INSERT INTO `log` VALUES ('5130', '123', 'getLanguageList', '1497079112');
INSERT INTO `log` VALUES ('5131', '123', 'getCookingList', '1497079112');
INSERT INTO `log` VALUES ('5132', '123', 'getSkillList', '1497079112');
INSERT INTO `log` VALUES ('5133', '123', 'getApplianceList', '1497079112');
INSERT INTO `log` VALUES ('5134', '123', 'getJobList', '1497079112');
INSERT INTO `log` VALUES ('5135', '123', 'getCertificateList', '1497079112');
INSERT INTO `log` VALUES ('5136', '123', 'getShareEmployerList', '1497079117');
INSERT INTO `log` VALUES ('5137', '123', 'login', '1497079698');
INSERT INTO `log` VALUES ('5138', '123', 'login', '1497079911');
INSERT INTO `log` VALUES ('5139', '2', 'login', '1497080061');
INSERT INTO `log` VALUES ('5140', '2', 'sLogin', '1497080063');
INSERT INTO `log` VALUES ('5141', '2', 'getChildByParent', '1497080137');
INSERT INTO `log` VALUES ('5142', '123', 'login', '1497080145');
INSERT INTO `log` VALUES ('5143', '123', 'getEmployerList', '1497080148');
INSERT INTO `log` VALUES ('5144', '123', 'getChildByParent', '1497080149');
INSERT INTO `log` VALUES ('5145', '123', 'getAuntList', '1497080150');
INSERT INTO `log` VALUES ('5146', '123', 'getLanguageList', '1497080150');
INSERT INTO `log` VALUES ('5147', '123', 'getCookingList', '1497080150');
INSERT INTO `log` VALUES ('5148', '123', 'getSkillList', '1497080151');
INSERT INTO `log` VALUES ('5149', '123', 'getApplianceList', '1497080151');
INSERT INTO `log` VALUES ('5150', '123', 'getJobList', '1497080151');
INSERT INTO `log` VALUES ('5151', '123', 'getCertificateList', '1497080151');
INSERT INTO `log` VALUES ('5152', '123', 'getChildByParent', '1497080153');
INSERT INTO `log` VALUES ('5153', '123', 'getShareEmployerList', '1497080155');
INSERT INTO `log` VALUES ('5154', '123', 'getStaffList', '1497080155');
INSERT INTO `log` VALUES ('5155', '123', 'getChildByParent', '1497080171');
INSERT INTO `log` VALUES ('5156', '123', 'getChildByParent', '1497081333');
INSERT INTO `log` VALUES ('5157', '123', 'getStaffList', '1497081955');
INSERT INTO `log` VALUES ('5158', '123', 'getStaffList', '1497081957');
INSERT INTO `log` VALUES ('5159', '123', 'getEmployerList', '1497081959');
INSERT INTO `log` VALUES ('5160', '123', 'getChildByParent', '1497081959');
INSERT INTO `log` VALUES ('5161', '123', 'getUnAckUserList', '1497081966');
INSERT INTO `log` VALUES ('5162', '123', 'login', '1497082060');
INSERT INTO `log` VALUES ('5163', '123', 'getHelpListByStatus', '1497082065');
INSERT INTO `log` VALUES ('5164', '123', 'getAuntList', '1497082204');
INSERT INTO `log` VALUES ('5165', '123', 'getLanguageList', '1497082205');
INSERT INTO `log` VALUES ('5166', '123', 'getCookingList', '1497082205');
INSERT INTO `log` VALUES ('5167', '123', 'getSkillList', '1497082205');
INSERT INTO `log` VALUES ('5168', '123', 'getApplianceList', '1497082205');
INSERT INTO `log` VALUES ('5169', '123', 'getJobList', '1497082205');
INSERT INTO `log` VALUES ('5170', '123', 'getCertificateList', '1497082205');
INSERT INTO `log` VALUES ('5171', '123', 'getChildByParent', '1497082205');
INSERT INTO `log` VALUES ('5172', '123', 'getEmployerList', '1497082207');
INSERT INTO `log` VALUES ('5173', '123', 'getChildByParent', '1497082207');
INSERT INTO `log` VALUES ('5174', '123', 'getAuntList', '1497082219');
INSERT INTO `log` VALUES ('5175', '123', 'getLanguageList', '1497082219');
INSERT INTO `log` VALUES ('5176', '123', 'getCookingList', '1497082219');
INSERT INTO `log` VALUES ('5177', '123', 'getSkillList', '1497082219');
INSERT INTO `log` VALUES ('5178', '123', 'getApplianceList', '1497082219');
INSERT INTO `log` VALUES ('5179', '123', 'getJobList', '1497082219');
INSERT INTO `log` VALUES ('5180', '123', 'getCertificateList', '1497082220');
INSERT INTO `log` VALUES ('5181', '123', 'getChildByParent', '1497082224');
INSERT INTO `log` VALUES ('5182', '123', 'getStaffList', '1497082227');
INSERT INTO `log` VALUES ('5183', '123', 'getShareEmployerList', '1497082229');
INSERT INTO `log` VALUES ('5184', '123', 'getShareEmployerList', '1497082260');
INSERT INTO `log` VALUES ('5185', '123', 'getShareAuntList', '1497082262');
INSERT INTO `log` VALUES ('5186', '123', 'deleteShareAunt', '1497082271');
INSERT INTO `log` VALUES ('5187', '123', 'getShareEmployerList', '1497082273');
INSERT INTO `log` VALUES ('5188', '123', 'getShareAuntList', '1497082281');
INSERT INTO `log` VALUES ('5189', '123', 'login', '1497082895');
INSERT INTO `log` VALUES ('5190', '123', 'getAuntList', '1497082898');
INSERT INTO `log` VALUES ('5191', '123', 'getLanguageList', '1497082898');
INSERT INTO `log` VALUES ('5192', '123', 'getCookingList', '1497082898');
INSERT INTO `log` VALUES ('5193', '123', 'getSkillList', '1497082898');
INSERT INTO `log` VALUES ('5194', '123', 'getApplianceList', '1497082898');
INSERT INTO `log` VALUES ('5195', '123', 'getJobList', '1497082898');
INSERT INTO `log` VALUES ('5196', '123', 'getCertificateList', '1497082899');
INSERT INTO `log` VALUES ('5197', '123', 'getChildByParent', '1497082899');
INSERT INTO `log` VALUES ('5198', '123', 'getShareEmployerList', '1497083229');
INSERT INTO `log` VALUES ('5199', '123', 'getChildByParent', '1497083230');
INSERT INTO `log` VALUES ('5200', '123', 'login', '1497083241');
INSERT INTO `log` VALUES ('5201', '123', 'getShareEmployerList', '1497083245');
INSERT INTO `log` VALUES ('5202', '123', 'getStaffList', '1497083245');
INSERT INTO `log` VALUES ('5203', '123', 'getChildByParent', '1497083246');
INSERT INTO `log` VALUES ('5204', '123', 'getChildByParent', '1497083373');
INSERT INTO `log` VALUES ('5205', '123', 'getStaffList', '1497083495');
INSERT INTO `log` VALUES ('5206', '123', 'getShareEmployerList', '1497083495');
INSERT INTO `log` VALUES ('5207', '123', 'getChildByParent', '1497083497');
INSERT INTO `log` VALUES ('5208', '123', 'login', '1497083543');
INSERT INTO `log` VALUES ('5209', '123', 'getAuntList', '1497083551');
INSERT INTO `log` VALUES ('5210', '123', 'getLanguageList', '1497083551');
INSERT INTO `log` VALUES ('5211', '123', 'getCookingList', '1497083552');
INSERT INTO `log` VALUES ('5212', '123', 'getSkillList', '1497083552');
INSERT INTO `log` VALUES ('5213', '123', 'getApplianceList', '1497083552');
INSERT INTO `log` VALUES ('5214', '123', 'getJobList', '1497083552');
INSERT INTO `log` VALUES ('5215', '123', 'getCertificateList', '1497083552');
INSERT INTO `log` VALUES ('5216', '123', 'getChildByParent', '1497083553');
INSERT INTO `log` VALUES ('5217', '123', 'login', '1497083676');
INSERT INTO `log` VALUES ('5218', '123', 'getAuntList', '1497083679');
INSERT INTO `log` VALUES ('5219', '123', 'getLanguageList', '1497083679');
INSERT INTO `log` VALUES ('5220', '123', 'getCookingList', '1497083679');
INSERT INTO `log` VALUES ('5221', '123', 'getSkillList', '1497083679');
INSERT INTO `log` VALUES ('5222', '123', 'getApplianceList', '1497083680');
INSERT INTO `log` VALUES ('5223', '123', 'getJobList', '1497083680');
INSERT INTO `log` VALUES ('5224', '123', 'getCertificateList', '1497083680');
INSERT INTO `log` VALUES ('5225', '123', 'getChildByParent', '1497083680');
INSERT INTO `log` VALUES ('5226', '123', 'getChildByParent', '1497084007');
INSERT INTO `log` VALUES ('5227', '123', 'getAuntList', '1497084036');
INSERT INTO `log` VALUES ('5228', '123', 'getLanguageList', '1497084037');
INSERT INTO `log` VALUES ('5229', '123', 'getCookingList', '1497084037');
INSERT INTO `log` VALUES ('5230', '123', 'getSkillList', '1497084037');
INSERT INTO `log` VALUES ('5231', '123', 'getApplianceList', '1497084037');
INSERT INTO `log` VALUES ('5232', '123', 'getJobList', '1497084037');
INSERT INTO `log` VALUES ('5233', '123', 'getCertificateList', '1497084037');
INSERT INTO `log` VALUES ('5234', '123', 'getChildByParent', '1497084039');
INSERT INTO `log` VALUES ('5235', '123', 'getChildByParent', '1497084102');
INSERT INTO `log` VALUES ('5236', '123', 'getChildByParent', '1497084180');
INSERT INTO `log` VALUES ('5237', '123', 'getChildByParent', '1497084221');
INSERT INTO `log` VALUES ('5238', '123', 'getChildByParent', '1497084268');
INSERT INTO `log` VALUES ('5239', '123', 'getAuntList', '1497084304');
INSERT INTO `log` VALUES ('5240', '123', 'getLanguageList', '1497084305');
INSERT INTO `log` VALUES ('5241', '123', 'getCookingList', '1497084305');
INSERT INTO `log` VALUES ('5242', '123', 'getSkillList', '1497084305');
INSERT INTO `log` VALUES ('5243', '123', 'getApplianceList', '1497084305');
INSERT INTO `log` VALUES ('5244', '123', 'getJobList', '1497084305');
INSERT INTO `log` VALUES ('5245', '123', 'getCertificateList', '1497084305');
INSERT INTO `log` VALUES ('5246', '123', 'getChildByParent', '1497084305');
INSERT INTO `log` VALUES ('5247', '123', 'getChildByParent', '1497084332');
INSERT INTO `log` VALUES ('5248', '123', 'getAuntList', '1497084342');
INSERT INTO `log` VALUES ('5249', '123', 'getLanguageList', '1497084342');
INSERT INTO `log` VALUES ('5250', '123', 'getCookingList', '1497084343');
INSERT INTO `log` VALUES ('5251', '123', 'getSkillList', '1497084343');
INSERT INTO `log` VALUES ('5252', '123', 'getApplianceList', '1497084343');
INSERT INTO `log` VALUES ('5253', '123', 'getJobList', '1497084343');
INSERT INTO `log` VALUES ('5254', '123', 'getCertificateList', '1497084343');
INSERT INTO `log` VALUES ('5255', '123', 'getChildByParent', '1497084343');
INSERT INTO `log` VALUES ('5256', '123', 'getChildByParent', '1497084388');
INSERT INTO `log` VALUES ('5257', '123', 'getChildByParent', '1497084401');
INSERT INTO `log` VALUES ('5258', '123', 'getChildByParent', '1497084530');
INSERT INTO `log` VALUES ('5259', '123', 'getAuntList', '1497084700');
INSERT INTO `log` VALUES ('5260', '123', 'getLanguageList', '1497084700');
INSERT INTO `log` VALUES ('5261', '123', 'getCookingList', '1497084700');
INSERT INTO `log` VALUES ('5262', '123', 'getSkillList', '1497084700');
INSERT INTO `log` VALUES ('5263', '123', 'getApplianceList', '1497084701');
INSERT INTO `log` VALUES ('5264', '123', 'getJobList', '1497084701');
INSERT INTO `log` VALUES ('5265', '123', 'getCertificateList', '1497084701');
INSERT INTO `log` VALUES ('5266', '123', 'getChildByParent', '1497084707');
INSERT INTO `log` VALUES ('5267', '123', 'getChildByParent', '1497084837');
INSERT INTO `log` VALUES ('5268', '123', 'getChildByParent', '1497084862');
INSERT INTO `log` VALUES ('5269', '123', 'login', '1497084875');
INSERT INTO `log` VALUES ('5270', '123', 'getChildByParent', '1497084877');
INSERT INTO `log` VALUES ('5271', '123', 'getChildByParent', '1497084908');
INSERT INTO `log` VALUES ('5272', '123', 'getChildByParent', '1497084909');
INSERT INTO `log` VALUES ('5273', '123', 'getChildByParent', '1497084909');
INSERT INTO `log` VALUES ('5274', '123', 'getChildByParent', '1497084972');
INSERT INTO `log` VALUES ('5275', '123', 'getChildByParent', '1497085043');
INSERT INTO `log` VALUES ('5276', '123', 'getShareEmployerList', '1497085575');
INSERT INTO `log` VALUES ('5277', '123', 'getStaffList', '1497085576');
INSERT INTO `log` VALUES ('5278', '123', 'getChildByParent', '1497085577');
INSERT INTO `log` VALUES ('5279', '123', 'login', '1497085603');
INSERT INTO `log` VALUES ('5280', '123', 'login', '1497085695');
INSERT INTO `log` VALUES ('5281', '123', 'getChildByParent', '1497085697');
INSERT INTO `log` VALUES ('5282', '123', 'getChildByParent', '1497085729');
INSERT INTO `log` VALUES ('5283', '123', 'getChildByParent', '1497085900');
INSERT INTO `log` VALUES ('5284', '123', 'getChildByParent', '1497085967');
INSERT INTO `log` VALUES ('5285', '123', 'getChildByParent', '1497086011');
INSERT INTO `log` VALUES ('5286', '123', 'getChildByParent', '1497086025');
INSERT INTO `log` VALUES ('5287', '123', 'getChildByParent', '1497086045');
INSERT INTO `log` VALUES ('5288', '123', 'getChildByParent', '1497086073');
INSERT INTO `log` VALUES ('5289', '123', 'getChildByParent', '1497086074');
INSERT INTO `log` VALUES ('5290', '123', 'getChildByParent', '1497086074');
INSERT INTO `log` VALUES ('5291', '123', 'getChildByParent', '1497086112');
INSERT INTO `log` VALUES ('5292', '123', 'getChildByParent', '1497086164');
INSERT INTO `log` VALUES ('5293', '123', 'login', '1497086363');
INSERT INTO `log` VALUES ('5294', '123', 'getChildByParent', '1497086365');
INSERT INTO `log` VALUES ('5295', '123', 'getChildByParent', '1497086403');
INSERT INTO `log` VALUES ('5296', '123', 'getChildByParent', '1497086676');
INSERT INTO `log` VALUES ('5297', '123', 'getChildByParent', '1497087021');
INSERT INTO `log` VALUES ('5298', '123', 'getChildByParent', '1497087106');
INSERT INTO `log` VALUES ('5299', '123', 'getChildByParent', '1497087126');
INSERT INTO `log` VALUES ('5300', '123', 'getChildByParent', '1497087180');
INSERT INTO `log` VALUES ('5301', '123', 'getChildByParent', '1497087215');
INSERT INTO `log` VALUES ('5302', '123', 'getChildByParent', '1497087230');
INSERT INTO `log` VALUES ('5303', '123', 'getChildByParent', '1497087271');
INSERT INTO `log` VALUES ('5304', '123', 'getChildByParent', '1497087309');
INSERT INTO `log` VALUES ('5305', '123', 'getChildByParent', '1497087337');
INSERT INTO `log` VALUES ('5306', '123', 'getChildByParent', '1497087407');
INSERT INTO `log` VALUES ('5307', '123', 'getChildByParent', '1497087485');
INSERT INTO `log` VALUES ('5308', '123', 'getChildByParent', '1497087485');
INSERT INTO `log` VALUES ('5309', '123', 'getChildByParent', '1497087523');
INSERT INTO `log` VALUES ('5310', '123', 'getChildByParent', '1497087774');
INSERT INTO `log` VALUES ('5311', '123', 'getChildByParent', '1497087805');
INSERT INTO `log` VALUES ('5312', '123', 'getChildByParent', '1497087850');
INSERT INTO `log` VALUES ('5313', '123', 'getChildByParent', '1497087881');
INSERT INTO `log` VALUES ('5314', '123', 'getChildByParent', '1497087926');
INSERT INTO `log` VALUES ('5315', '123', 'getChildByParent', '1497087943');
INSERT INTO `log` VALUES ('5316', '123', 'getAuntList', '1497088001');
INSERT INTO `log` VALUES ('5317', '123', 'getLanguageList', '1497088001');
INSERT INTO `log` VALUES ('5318', '123', 'getCookingList', '1497088001');
INSERT INTO `log` VALUES ('5319', '123', 'getSkillList', '1497088001');
INSERT INTO `log` VALUES ('5320', '123', 'getApplianceList', '1497088001');
INSERT INTO `log` VALUES ('5321', '123', 'getJobList', '1497088001');
INSERT INTO `log` VALUES ('5322', '123', 'getCertificateList', '1497088001');
INSERT INTO `log` VALUES ('5323', '123', 'getChildByParent', '1497088003');

-- ----------------------------
-- Table structure for `module`
-- ----------------------------
DROP TABLE IF EXISTS `module`;
CREATE TABLE `module` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of module
-- ----------------------------
INSERT INTO `module` VALUES ('1', '雇主');
INSERT INTO `module` VALUES ('2', '阿姨');
INSERT INTO `module` VALUES ('3', '学员');
INSERT INTO `module` VALUES ('4', '保险');
INSERT INTO `module` VALUES ('5', '加盟');
INSERT INTO `module` VALUES ('6', '财务');
INSERT INTO `module` VALUES ('7', '共享');
INSERT INTO `module` VALUES ('8', '员工');

-- ----------------------------
-- Table structure for `module_authority`
-- ----------------------------
DROP TABLE IF EXISTS `module_authority`;
CREATE TABLE `module_authority` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `module_id` bigint(20) NOT NULL,
  `authority` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of module_authority
-- ----------------------------

-- ----------------------------
-- Table structure for `order_account`
-- ----------------------------
DROP TABLE IF EXISTS `order_account`;
CREATE TABLE `order_account` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `prepare` varchar(255) NOT NULL,
  `quantity` double NOT NULL,
  `cityprice` double NOT NULL,
  `provinceprice` double NOT NULL,
  `atime` bigint(20) NOT NULL,
  `order_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_account
-- ----------------------------

-- ----------------------------
-- Table structure for `order_check`
-- ----------------------------
DROP TABLE IF EXISTS `order_check`;
CREATE TABLE `order_check` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `status` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `order_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_check
-- ----------------------------
INSERT INTO `order_check` VALUES ('10', '-1', '未提交', '54');
INSERT INTO `order_check` VALUES ('11', '-1', '未提交', '55');

-- ----------------------------
-- Table structure for `order_trainee`
-- ----------------------------
DROP TABLE IF EXISTS `order_trainee`;
CREATE TABLE `order_trainee` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `order_id` bigint(20) NOT NULL,
  `trainee_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_trainee
-- ----------------------------
INSERT INTO `order_trainee` VALUES ('3', '48', '47');

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `preparer` varchar(255) NOT NULL,
  `time` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('54', 'w', '1496282223', '1');
INSERT INTO `orders` VALUES ('55', '李白', '1496282922', '1');

-- ----------------------------
-- Table structure for `pact`
-- ----------------------------
DROP TABLE IF EXISTS `pact`;
CREATE TABLE `pact` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ptime` bigint(20) NOT NULL,
  `code` varchar(20) NOT NULL,
  `ename` varchar(20) NOT NULL,
  `ephone` varchar(255) NOT NULL,
  `eaddress` varchar(255) NOT NULL,
  `econtent` varchar(255) NOT NULL,
  `duration` varchar(20) NOT NULL,
  `cost` double(20,0) NOT NULL,
  `aname` varchar(20) NOT NULL,
  `aphone` varchar(20) NOT NULL,
  `time` varchar(11) NOT NULL,
  `salary` varchar(20) NOT NULL,
  `remark` varchar(255) DEFAULT '',
  `status` int(11) NOT NULL COMMENT '0正常 -1暂停 -2退单',
  `user_id` bigint(20) NOT NULL,
  `employer_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pact
-- ----------------------------
INSERT INTO `pact` VALUES ('4', '1494518400', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '-1', '1', '26');
INSERT INTO `pact` VALUES ('5', '1494518400', '12', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '26');
INSERT INTO `pact` VALUES ('10', '1496937600', '11', 'yiyi', '18975364259', 'lhhuhjuhh', 'JFDJGH', '1year', '1500', 'hahha', '189708536954', '2017-06-09', '400', 'sdfdf', '0', '1', '83');

-- ----------------------------
-- Table structure for `pact_tracking`
-- ----------------------------
DROP TABLE IF EXISTS `pact_tracking`;
CREATE TABLE `pact_tracking` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ttime` bigint(20) NOT NULL,
  `content` varchar(255) NOT NULL,
  `pact_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pact_tracking
-- ----------------------------

-- ----------------------------
-- Table structure for `rank`
-- ----------------------------
DROP TABLE IF EXISTS `rank`;
CREATE TABLE `rank` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rank
-- ----------------------------
INSERT INTO `rank` VALUES ('1', '总部');
INSERT INTO `rank` VALUES ('2', '省级代理');
INSERT INTO `rank` VALUES ('3', '市级代理');
INSERT INTO `rank` VALUES ('4', '区域加盟商');

-- ----------------------------
-- Table structure for `share_aunt`
-- ----------------------------
DROP TABLE IF EXISTS `share_aunt`;
CREATE TABLE `share_aunt` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `skill` varchar(10000) NOT NULL,
  `address` varchar(10000) NOT NULL DEFAULT '',
  `contact` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `time` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `share` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of share_aunt
-- ----------------------------
INSERT INTO `share_aunt` VALUES ('1', '2e', 'dmsfkmdskf', '1', '123', '1494571882', '1', '1');
INSERT INTO `share_aunt` VALUES ('3', '个', 'erg', '2', '3', '1494572497', '1', '0');
INSERT INTO `share_aunt` VALUES ('4', 'reger', 'regf', '4', '', '1494844149', '1', '1');
INSERT INTO `share_aunt` VALUES ('5', 'i', 'erg', '2', '', '1494844151', '1', '1');
INSERT INTO `share_aunt` VALUES ('6', '人', '2', '3', '', '1494844154', '1', '1');
INSERT INTO `share_aunt` VALUES ('7', '饿', 'fdg', '89', '18975642356', '1494844163', '1', '0');
INSERT INTO `share_aunt` VALUES ('8', '饿了2', '', '2', '', '1494844190', '1', '1');
INSERT INTO `share_aunt` VALUES ('9', '带小孩', '饿', '2', '', '1495169313', '1', '1');
INSERT INTO `share_aunt` VALUES ('10', '煮饭', '2', '2', '13066903837', '1494844404', '1', '0');
INSERT INTO `share_aunt` VALUES ('11', '做饭', '', 'aa', '123', '1494930477', '1', '1');
INSERT INTO `share_aunt` VALUES ('12', '做菜', '啊啊啊', 'aabb', '13066903734', '1495074627', '1', '1');
INSERT INTO `share_aunt` VALUES ('13', '去', '深圳市', 'q', '1', '1495075012', '1', '1');
INSERT INTO `share_aunt` VALUES ('31', 'tb', 'tb', 'tb', '123', '1495262422', '20', '1');
INSERT INTO `share_aunt` VALUES ('32', '照顾老人', '11111111111', '小小', '16266853937', '1495262695', '20', '1');
INSERT INTO `share_aunt` VALUES ('36', '333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333', '44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444', '1111111111111111111111111111111111111', '2222222222222222222222222222222222222222222222222', '1495421220', '20', '1');
INSERT INTO `share_aunt` VALUES ('37', '打扫卫生1', '龙岗1', '阿翠1', '13066703432', '1496749522', '1', '1');

-- ----------------------------
-- Table structure for `share_employer`
-- ----------------------------
DROP TABLE IF EXISTS `share_employer`;
CREATE TABLE `share_employer` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `content` varchar(10000) NOT NULL,
  `address` varchar(10000) NOT NULL DEFAULT '',
  `contact` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `time` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `share` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of share_employer
-- ----------------------------
INSERT INTO `share_employer` VALUES ('1', '2e', '23', '1', '123', '1496749590', '1', '0');
INSERT INTO `share_employer` VALUES ('3', '2e', '', '1', '123', '1496749589', '1', '0');
INSERT INTO `share_employer` VALUES ('4', '啊啊', '', '啊', '222', '1496749588', '1', '0');
INSERT INTO `share_employer` VALUES ('5', '123', '', '123', '123', '1496749587', '1', '0');
INSERT INTO `share_employer` VALUES ('6', '1234', '', '1234', '1234', '1496749586', '1', '0');
INSERT INTO `share_employer` VALUES ('7', '带小孩', '张的漂亮', '小胡', '13566498648', '1496749585', '1', '0');
INSERT INTO `share_employer` VALUES ('8', 'W', '', 'E', 'R', '1496749584', '1', '0');
INSERT INTO `share_employer` VALUES ('9', '带小孩', '', '小胡', '1352264654', '1496748928', '1', '0');
INSERT INTO `share_employer` VALUES ('10', '照顾老人', '', '啊一', '13522684679', '1496749583', '1', '0');
INSERT INTO `share_employer` VALUES ('24', '会做饭，带小孩', '年龄在30到40岁之间', '张小晓', '15874267878', '1496797432', '1', '1');
INSERT INTO `share_employer` VALUES ('25', '会做饭，带小孩1', '1', '小翠1', '13512125454', '1496797427', '1', '1');
INSERT INTO `share_employer` VALUES ('29', '住家，照顾老人', '广东省深圳市南山区西丽街道180号', '陈程', '15874686562', '1495605148', '20', '1');
INSERT INTO `share_employer` VALUES ('30', '凄凄切切', '请问', '凄凄切切', '212', '1495614668', '20', '1');
INSERT INTO `share_employer` VALUES ('31', '南湾公园里找钟点工，周一到周六，2点半到6点，要求做事麻利，做饭好吃的广东阿姨，工资2300.', '龙岗', '李欣', '15975457744', '1495794944', '20', '1');
INSERT INTO `share_employer` VALUES ('32', '带孩子', '龙岗', '陈欣', '13065204516', '1496749640', '1', '1');
INSERT INTO `share_employer` VALUES ('33', 'ljlgagdagf', 'lsjhflshklgfh', 'ï¼èç³»äººï¼', '18975364987', '1497006894', '1', '0');
INSERT INTO `share_employer` VALUES ('34', 'qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq', 'q', '1', '13066903734', '1497007297', '1', '1');

-- ----------------------------
-- Table structure for `skill`
-- ----------------------------
DROP TABLE IF EXISTS `skill`;
CREATE TABLE `skill` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of skill
-- ----------------------------
INSERT INTO `skill` VALUES ('1', '做饭');
INSERT INTO `skill` VALUES ('2', '搞卫生');
INSERT INTO `skill` VALUES ('3', '带小孩');
INSERT INTO `skill` VALUES ('4', '月子餐');
INSERT INTO `skill` VALUES ('5', '辅食添加');
INSERT INTO `skill` VALUES ('6', '手洗衣服');
INSERT INTO `skill` VALUES ('7', '烫衣服');
INSERT INTO `skill` VALUES ('8', '手擦地板');
INSERT INTO `skill` VALUES ('9', '喜欢动物');
INSERT INTO `skill` VALUES ('10', '辅导小孩功课');
INSERT INTO `skill` VALUES ('11', '自行车');

-- ----------------------------
-- Table structure for `staff`
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `phone` bigint(20) NOT NULL COMMENT '电话用于登录',
  `password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT '',
  `photourl` varchar(255) NOT NULL,
  `job` varchar(255) NOT NULL,
  `time` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES ('24', '2', '11', '2', '2', 'http://192.168.1.115:8080/nzj/upload/staff_photo/1495875409_3.png', '2', '1495875409', '1');

-- ----------------------------
-- Table structure for `staff_module`
-- ----------------------------
DROP TABLE IF EXISTS `staff_module`;
CREATE TABLE `staff_module` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `staff_id` bigint(20) NOT NULL,
  `module_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff_module
-- ----------------------------
INSERT INTO `staff_module` VALUES ('21', '24', '2');
INSERT INTO `staff_module` VALUES ('22', '24', '3');

-- ----------------------------
-- Table structure for `support`
-- ----------------------------
DROP TABLE IF EXISTS `support`;
CREATE TABLE `support` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `position` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `time` bigint(255) NOT NULL,
  `open` varchar(20) NOT NULL,
  `area` varchar(255) NOT NULL,
  `awarding` varchar(255) DEFAULT '',
  `training` varchar(255) DEFAULT '',
  `location` varchar(255) DEFAULT '',
  `account` varchar(255) DEFAULT '',
  `decorate` varchar(255) DEFAULT '',
  `brand` varchar(255) DEFAULT '',
  `purchasing` varchar(255) DEFAULT '',
  `propaganda` varchar(255) DEFAULT '',
  `others` varchar(255) DEFAULT '',
  `supporturl` varchar(255) DEFAULT '',
  `identifier` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of support
-- ----------------------------
INSERT INTO `support` VALUES ('3', '王二麻子', '扫厕所', '13870854689', '4', '2017-08-18', '深圳龙岗', '授牌仪式完成了哦', '我要培训你们这帮吊死', '我是大叔啊', '阿萨京东方垃圾', '杰克', '打广告', '我事发后杀', '我想杀人', '其他的什么东明县', 'localhost', '1495087774536338');
INSERT INTO `support` VALUES ('4', '王小二', '扫厕所', '13870854689', '4', '2017-08-18', '深圳龙岗', '授牌仪式完成了哦', '我要培训你们这帮吊死', '我是大叔啊', '阿萨京东方垃圾', '杰克', '打广告', '我事发后杀', '我想杀人', '其他的什么东明县', 'D:\\Tomcat7.0\\webapps\\nzj\\upload\\support_photo\\1495160410_6.png', '1495160410797327');
INSERT INTO `support` VALUES ('5', '王小二', '扫厕所', '13870854689', '4', '2017-08-18', '深圳龙岗', '授牌仪式完成了哦', '我要培训你们这帮吊死', '我是大叔啊', '阿萨京东方垃圾', '杰克', '打广告', '我事发后杀', '我想杀人', '其他的什么东明县', 'D:\\Tomcat7.0\\webapps\\nzj\\upload\\support_photo\\1495161087_5.jpeg', '1495161087951455');

-- ----------------------------
-- Table structure for `support_tracking`
-- ----------------------------
DROP TABLE IF EXISTS `support_tracking`;
CREATE TABLE `support_tracking` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ttime` bigint(20) NOT NULL,
  `content` varchar(1000) NOT NULL,
  `status` int(20) NOT NULL COMMENT '-1开业前 1开业后',
  `type_id` int(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of support_tracking
-- ----------------------------
INSERT INTO `support_tracking` VALUES ('1', '1496332800', '今天的天气很好，你说是不是啊。', '1', '1', '1');
INSERT INTO `support_tracking` VALUES ('2', '1496246400', '我就是最帅的帅哥，你知道么，你就是个渣渣', '-1', '5', '1');
INSERT INTO `support_tracking` VALUES ('3', '1496160000', '这个世界没有做不成的事情只有坚持不了的人', '-1', '4', '1');
INSERT INTO `support_tracking` VALUES ('10', '1496332800', '今天的天气很好，你说是不是啊。', '1', '1', '1');
INSERT INTO `support_tracking` VALUES ('11', '1496246400', '我就是最帅的帅哥，你知道么，你就是个渣渣', '-1', '5', '1');

-- ----------------------------
-- Table structure for `support_type`
-- ----------------------------
DROP TABLE IF EXISTS `support_type`;
CREATE TABLE `support_type` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of support_type
-- ----------------------------
INSERT INTO `support_type` VALUES ('1', '品牌支持');
INSERT INTO `support_type` VALUES ('2', '客服咨询');
INSERT INTO `support_type` VALUES ('3', '管理培训');
INSERT INTO `support_type` VALUES ('4', '学校培训');
INSERT INTO `support_type` VALUES ('5', '选址指导');
INSERT INTO `support_type` VALUES ('6', '装修指导');
INSERT INTO `support_type` VALUES ('7', '物资支持');
INSERT INTO `support_type` VALUES ('8', '指导采购');
INSERT INTO `support_type` VALUES ('9', '营销宣传');
INSERT INTO `support_type` VALUES ('10', '上门指导');

-- ----------------------------
-- Table structure for `trainee`
-- ----------------------------
DROP TABLE IF EXISTS `trainee`;
CREATE TABLE `trainee` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `sex` int(11) NOT NULL,
  `birthday` bigint(20) NOT NULL,
  `address` varchar(255) NOT NULL,
  `idnumber` varchar(255) NOT NULL,
  `idcardurl1` varchar(255) NOT NULL,
  `idcardurl2` varchar(255) NOT NULL,
  `infourl` varchar(255) NOT NULL,
  `photourl` varchar(255) NOT NULL,
  `pay` int(11) NOT NULL COMMENT '是否缴费的标志',
  `bind` int(11) NOT NULL COMMENT '是否绑定订单标志，初始化未0,0：未绑定订单 1：已绑定订单',
  `user_id` bigint(20) NOT NULL COMMENT '学员所属的用户的id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trainee
-- ----------------------------
INSERT INTO `trainee` VALUES ('54', '小明', '1', '1', '1', '1', 'http://192.168.1.115:8080/nzj/upload/order_trainee/1496282354_8.png', 'http://192.168.1.115:8080/nzj/upload/order_trainee/1496282354_9.png', 'http://192.168.1.115:8080/nzj/upload/order_trainee/1496282354_6.png', 'http://192.168.1.115:8080/nzj/upload/order_trainee/1496282354_5.png', '1', '0', '1');
INSERT INTO `trainee` VALUES ('55', '令狐冲', '1', '1', '1', '1', 'http://192.168.1.115:8080/nzj/upload/order_trainee/1496283403_6.png', 'http://192.168.1.115:8080/nzj/upload/order_trainee/1496283403_8.png', 'http://192.168.1.115:8080/nzj/upload/order_trainee/1496283403_7.png', 'http://192.168.1.115:8080/nzj/upload/order_trainee/1496283403_7.png', '1', '0', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `phone` bigint(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `clock` bigint(20) NOT NULL,
  `rank` int(11) NOT NULL COMMENT '-1未审核，1总，2,省，3，市，4，区',
  `ack` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', 'ead35231a044e412eb83ae8f9e25aedf', '1493374897', '1', '1');
INSERT INTO `user` VALUES ('6', '1', '1', '1493454720', '2', '1');
INSERT INTO `user` VALUES ('12', '55', '1', '1494388238', '2', '1');
INSERT INTO `user` VALUES ('15', '119', '123', '1494483873', '-1', '1');
INSERT INTO `user` VALUES ('16', '13714515160', '1', '1494488535', '3', '1');
INSERT INTO `user` VALUES ('17', '13066802', 'asd', '1494489490', '3', '1');
INSERT INTO `user` VALUES ('18', '13066803937', '8376a230c906d7a11030162817fc8e2d', '1494575845', '2', '1');
INSERT INTO `user` VALUES ('19', '777', '953776a4d2de21e8b6f8db06014c075c', '1494931547', '3', '1');
INSERT INTO `user` VALUES ('20', '18124606495', '6acd1fe536ee80e72799ae441efca12b', '1495173723', '4', '1');
INSERT INTO `user` VALUES ('21', '6666', '6666', '1494931548', '4', '1');
INSERT INTO `user` VALUES ('22', '13148700419', '6acd1fe536ee80e72799ae441efca12b', '1495618429', '-1', '0');

-- ----------------------------
-- Table structure for `user_check`
-- ----------------------------
DROP TABLE IF EXISTS `user_check`;
CREATE TABLE `user_check` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `status` int(11) NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_check
-- ----------------------------
INSERT INTO `user_check` VALUES ('4', '14', '0', '不通过');
INSERT INTO `user_check` VALUES ('5', '12', '0', '还是不完整');
INSERT INTO `user_check` VALUES ('7', '15', '0', '信息填写不到位');
INSERT INTO `user_check` VALUES ('8', '16', '0', '营业执照没有传');
INSERT INTO `user_check` VALUES ('9', '17', '0', 'aa');
INSERT INTO `user_check` VALUES ('10', '18', '-1', '未审核');
INSERT INTO `user_check` VALUES ('11', '19', '0', '信息不完整');
INSERT INTO `user_check` VALUES ('12', '20', '-1', '未审核');
INSERT INTO `user_check` VALUES ('13', '22', '-1', '未审核');

-- ----------------------------
-- Table structure for `user_detail`
-- ----------------------------
DROP TABLE IF EXISTS `user_detail`;
CREATE TABLE `user_detail` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `username` varchar(255) NOT NULL,
  `company` varchar(255) NOT NULL,
  `contact` varchar(255) NOT NULL,
  `telephone` bigint(20) NOT NULL,
  `dphone` bigint(20) NOT NULL,
  `address` varchar(255) NOT NULL,
  `charterurl` varchar(255) DEFAULT '',
  `idcardurl` varchar(255) DEFAULT '',
  `support` int(11) NOT NULL COMMENT '是否需要加盟支持的标志',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_detail
-- ----------------------------
INSERT INTO `user_detail` VALUES ('1', '1', '会飞的鱼', '南山娘子军', '小明', '75584559949', '13895467546', '广东省-深圳市-罗湖区', '', '', '0');
INSERT INTO `user_detail` VALUES ('2', '6', '肥肉', '东莞娘子军', '23', '1239', '13350403698', 'g3', 'http23', 'http23', '0');
INSERT INTO `user_detail` VALUES ('21', '12', '寂静', '广西娘子军', '3', '4', '13546875246', '1', 'http://192.168.1.115:8080/nzj/upload/user_idcard/1494472773_7.png', '', '0');
INSERT INTO `user_detail` VALUES ('22', '15', '大虾上路', '山东娘子军', 'zgj', '13714515160', '13715348975', '广东省深圳市龙岗区 XXXX', 'http://192.168.1.115:8080/nzj/upload/user_idcard/1494488457_5.png', 'http://192.168.1.115:8080/nzj/upload/user_charter/1494488457_8.png', '0');
INSERT INTO `user_detail` VALUES ('23', '16', '天明', '苏州娘子军', 'tim', '12345', '13158974652', '深圳', 'http://192.168.1.115:8080/nzj/upload/user_idcard/1494488748_9.png', 'http://192.168.1.115:8080/nzj/upload/user_charter/1494488748_8.png', '0');
INSERT INTO `user_detail` VALUES ('24', '17', '晴天', '北京娘子军', 'aa', '123', '13916584756', 'aa', 'http://192.168.1.115:8080/nzj/upload/user_idcard/1494489520_5.png', 'http://192.168.1.115:8080/nzj/upload/user_charter/1494489520_4.png', '0');
INSERT INTO `user_detail` VALUES ('25', '18', '点灯的瞎子', '陕西娘子军', 'sad', '123', '18975642687', 'asd', 'http://192.168.1.226:8080/nzj/upload/user_idcard/1494818060_4.png', 'http://192.168.1.226:8080/nzj/upload/user_charter/1494818060_0.png', '0');
INSERT INTO `user_detail` VALUES ('26', '19', '往事随风', '江西娘子军', '4', '5', '15346874562', '7', 'http://192.168.1.115:8080/nzj/upload/user_idcard/1494931830_5.png', '', '0');
INSERT INTO `user_detail` VALUES ('27', '20', '心凉...', '海南娘子军', 'asdasd', '135655', '18846875648', '广东省深圳市凄凄切切', '', '', '0');
INSERT INTO `user_detail` VALUES ('28', '22', '清风徐来', '西藏娘子军', 'aa', '123', '17795846248', 'aa', 'http://192.168.1.226:8080/nzj/upload/user_idcard/1495619239_6.png', 'http://192.168.1.226:8080/nzj/upload/user_charter/1495619239_3.png', '0');

-- ----------------------------
-- Table structure for `user_link`
-- ----------------------------
DROP TABLE IF EXISTS `user_link`;
CREATE TABLE `user_link` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `parent` bigint(20) NOT NULL,
  `child` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_link
-- ----------------------------
INSERT INTO `user_link` VALUES ('1', '0', '1');
INSERT INTO `user_link` VALUES ('2', '1', '6');
INSERT INTO `user_link` VALUES ('4', '1', '12');
INSERT INTO `user_link` VALUES ('5', '6', '16');
INSERT INTO `user_link` VALUES ('6', '12', '17');
INSERT INTO `user_link` VALUES ('7', '17', '18');
INSERT INTO `user_link` VALUES ('8', '12', '19');
INSERT INTO `user_link` VALUES ('9', '19', '20');

-- ----------------------------
-- View structure for `v_account_order_user`
-- ----------------------------
DROP VIEW IF EXISTS `v_account_order_user`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_account_order_user` AS select `o`.`id` AS `id`,`o`.`preparer` AS `preparer`,`o`.`user_id` AS `user_id`,date_format(from_unixtime(`o`.`time`),'%Y-%m-%d %H:%i:%S') AS `time`,count(`ot`.`id`) AS `quantity`,`u`.`rank` AS `rank`,`ud`.`company` AS `company`,`oc`.`status` AS `status`,`oc`.`description` AS `description` from ((((`orders` `o` left join `order_trainee` `ot` on((`o`.`id` = `ot`.`order_id`))) left join `user` `u` on((`o`.`user_id` = `u`.`id`))) left join `user_detail` `ud` on((`u`.`id` = `ud`.`user_id`))) left join `order_check` `oc` on((`o`.`id` = `oc`.`order_id`))) group by `o`.`id`;

-- ----------------------------
-- View structure for `v_appliance`
-- ----------------------------
DROP VIEW IF EXISTS `v_appliance`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_appliance` AS select `aa`.`id` AS `id`,`aa`.`aunt_id` AS `aunt_id`,`aa`.`appliance_id` AS `appliance_id`,`a`.`name` AS `name` from (`aunt_appliance` `aa` join `appliance` `a`) where (`aa`.`appliance_id` = `a`.`id`);

-- ----------------------------
-- View structure for `v_aunt`
-- ----------------------------
DROP VIEW IF EXISTS `v_aunt`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_aunt` AS select `a`.`id` AS `id`,`a`.`name` AS `name`,`a`.`age` AS `age`,`a`.`sign` AS `sign`,`a`.`native` AS `native`,`a`.`sex` AS `sex`,`a`.`education` AS `education`,`a`.`marriage` AS `marriage`,`a`.`nation` AS `nation`,`a`.`height` AS `height`,`a`.`weight` AS `weight`,`a`.`sigh` AS `sigh`,`a`.`idnumber` AS `idnumber`,`a`.`phone` AS `phone`,`a`.`address` AS `address`,`a`.`user_id` AS `user_id`,`ap`.`url` AS `url`,`a`.`status` AS `status` from (`aunt` `a` join `aunt_photo` `ap`) where (`a`.`id` = `ap`.`aunt_id`);

-- ----------------------------
-- View structure for `v_certificate`
-- ----------------------------
DROP VIEW IF EXISTS `v_certificate`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_certificate` AS select `ac`.`id` AS `id`,`ac`.`aunt_id` AS `aunt_id`,`ac`.`certificate_id` AS `certificate_id`,`c`.`name` AS `name` from (`aunt_certificate` `ac` join `certificate` `c`) where (`ac`.`certificate_id` = `c`.`id`);

-- ----------------------------
-- View structure for `v_cooking`
-- ----------------------------
DROP VIEW IF EXISTS `v_cooking`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_cooking` AS select `ac`.`id` AS `id`,`ac`.`aunt_id` AS `aunt_id`,`ac`.`cooking_id` AS `cooking_id`,`c`.`name` AS `name` from (`aunt_cooking` `ac` join `cooking` `c`) where (`ac`.`cooking_id` = `c`.`id`);

-- ----------------------------
-- View structure for `v_count_aunt`
-- ----------------------------
DROP VIEW IF EXISTS `v_count_aunt`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_count_aunt` AS select count(`a`.`id`) AS `a_count`,`a`.`user_id` AS `user_id` from `aunt` `a` group by `a`.`user_id`;

-- ----------------------------
-- View structure for `v_count_employer`
-- ----------------------------
DROP VIEW IF EXISTS `v_count_employer`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_count_employer` AS select count(`e`.`id`) AS `e_count`,`e`.`user_id` AS `user_id` from `employer` `e` group by `e`.`user_id`;

-- ----------------------------
-- View structure for `v_job`
-- ----------------------------
DROP VIEW IF EXISTS `v_job`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_job` AS select `aj`.`id` AS `id`,`aj`.`aunt_id` AS `aunt_id`,`aj`.`job_id` AS `job_id`,`j`.`name` AS `name` from (`aunt_job` `aj` join `job` `j`) where (`aj`.`job_id` = `j`.`id`);

-- ----------------------------
-- View structure for `v_join_userdetail`
-- ----------------------------
DROP VIEW IF EXISTS `v_join_userdetail`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_join_userdetail` AS select `j`.`id` AS `id`,`j`.`joinorder_id` AS `joinorder_id`,`u`.`username` AS `username`,`u`.`company` AS `company`,`u`.`contact` AS `contact`,`u`.`telephone` AS `telephone`,`u`.`dphone` AS `dphone`,`u`.`address` AS `address`,`u`.`charterurl` AS `charterurl`,`u`.`idcardurl` AS `idcardurl` from (`join_userdetail` `j` join `user_detail` `u`) where (`j`.`userdetail_id` = `u`.`user_id`);

-- ----------------------------
-- View structure for `v_language`
-- ----------------------------
DROP VIEW IF EXISTS `v_language`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_language` AS select `al`.`id` AS `id`,`al`.`aunt_id` AS `aunt_id`,`al`.`language_id` AS `language_id`,`l`.`name` AS `name` from (`aunt_language` `al` join `language` `l`) where (`al`.`language_id` = `l`.`id`);

-- ----------------------------
-- View structure for `v_log`
-- ----------------------------
DROP VIEW IF EXISTS `v_log`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_log` AS select `l`.`id` AS `id`,`l`.`phone` AS `phone`,coalesce(`ud`.`username`,'') AS `username`,`l`.`operation` AS `operation`,date_format(from_unixtime(`l`.`time`),'%Y-%m-%d %H:%i:%S') AS `time` from ((`log` `l` left join `user` `u` on((`l`.`phone` = `u`.`phone`))) left join `user_detail` `ud` on((`u`.`id` = `ud`.`user_id`)));

-- ----------------------------
-- View structure for `v_order_check`
-- ----------------------------
DROP VIEW IF EXISTS `v_order_check`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_order_check` AS select `o`.`id` AS `id`,`o`.`preparer` AS `preparer`,date_format(from_unixtime(`o`.`time`),'%Y-%m-%d %H:%i:%S') AS `time`,`o`.`user_id` AS `user_id`,`oc`.`status` AS `status`,`oc`.`description` AS `description` from (`orders` `o` left join `order_check` `oc` on((`o`.`id` = `oc`.`order_id`)));

-- ----------------------------
-- View structure for `v_order_trainee`
-- ----------------------------
DROP VIEW IF EXISTS `v_order_trainee`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_order_trainee` AS select `o`.`id` AS `oid`,`o`.`preparer` AS `preparer`,date_format(from_unixtime(`o`.`time`),'%Y-%m-%d %H:%i:%S') AS `time`,`o`.`user_id` AS `ouid`,`oc`.`status` AS `status`,`oc`.`description` AS `description`,`t`.`id` AS `id`,`t`.`name` AS `name`,`t`.`sex` AS `sex`,`t`.`birthday` AS `birthday`,`t`.`address` AS `address`,`t`.`idnumber` AS `idnumber`,`t`.`idcardurl1` AS `idcardurl1`,`t`.`idcardurl2` AS `idcardurl2`,`t`.`infourl` AS `infourl`,`t`.`photourl` AS `photourl`,`t`.`pay` AS `pay`,`t`.`bind` AS `bind`,`t`.`user_id` AS `user_id` from (((`orders` `o` left join `order_trainee` `ot` on((`o`.`id` = `ot`.`order_id`))) left join `trainee` `t` on((`ot`.`trainee_id` = `t`.`id`))) left join `order_check` `oc` on((`o`.`id` = `oc`.`order_id`)));

-- ----------------------------
-- View structure for `v_order_trainee_link`
-- ----------------------------
DROP VIEW IF EXISTS `v_order_trainee_link`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_order_trainee_link` AS select `ot`.`id` AS `id`,`ot`.`order_id` AS `order_id`,`ot`.`trainee_id` AS `trainee_id`,`t`.`name` AS `name`,`t`.`sex` AS `sex`,`t`.`birthday` AS `birthday`,`t`.`address` AS `address`,`t`.`idnumber` AS `idnumber`,`t`.`idcardurl1` AS `idcardurl1`,`t`.`idcardurl2` AS `idcardurl2`,`t`.`infourl` AS `infourl`,`t`.`photourl` AS `photourl`,`t`.`pay` AS `pay`,`t`.`bind` AS `bind`,`t`.`user_id` AS `tuid` from (`order_trainee` `ot` left join `trainee` `t` on((`ot`.`trainee_id` = `t`.`id`)));

-- ----------------------------
-- View structure for `v_skill`
-- ----------------------------
DROP VIEW IF EXISTS `v_skill`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_skill` AS select `ask`.`id` AS `id`,`ask`.`aunt_id` AS `aunt_id`,`ask`.`skill_id` AS `skill_id`,`s`.`name` AS `name` from (`aunt_skill` `ask` join `skill` `s`) where (`ask`.`skill_id` = `s`.`id`);

-- ----------------------------
-- View structure for `v_staff_module`
-- ----------------------------
DROP VIEW IF EXISTS `v_staff_module`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_staff_module` AS select `staff_module`.`id` AS `id`,`staff_module`.`staff_id` AS `staff_id`,`staff_module`.`module_id` AS `module_id`,`module`.`name` AS `name` from (`staff_module` join `module`) where (`staff_module`.`module_id` = `module`.`id`);

-- ----------------------------
-- View structure for `v_support`
-- ----------------------------
DROP VIEW IF EXISTS `v_support`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_support` AS select `st`.`id` AS `id`,`st`.`ttime` AS `ttime`,`st`.`content` AS `content`,`st`.`status` AS `status`,`stp`.`name` AS `name`,`st`.`user_id` AS `user_id` from (`support_tracking` `st` join `support_type` `stp`) where (`st`.`type_id` = `stp`.`id`);

-- ----------------------------
-- View structure for `v_user`
-- ----------------------------
DROP VIEW IF EXISTS `v_user`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_user` AS select `u`.`id` AS `id`,`u`.`phone` AS `phone`,date_format(from_unixtime(`u`.`clock`),'%Y-%m-%d %H:%i:%S') AS `time`,`u`.`rank` AS `rank`,`u`.`ack` AS `ack`,`ud`.`username` AS `username`,`ud`.`company` AS `company`,`ud`.`contact` AS `contact`,`ud`.`telephone` AS `telephone`,`ud`.`dphone` AS `dphone`,`ud`.`address` AS `address`,`ud`.`charterurl` AS `charterurl`,`ud`.`idcardurl` AS `idcardurl`,`ud`.`id` AS `did`,`ud`.`support` AS `support`,`u`.`clock` AS `clock` from (`user` `u` join `user_detail` `ud`) where (`u`.`id` = `ud`.`user_id`);
