/*
Navicat MySQL Data Transfer

Source Server         : renYun
Source Server Version : 80022
Source Host           : 150.158.188.102:3306
Source Database       : wll

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2021-03-11 09:58:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `score_academy_admin`
-- ----------------------------
DROP TABLE IF EXISTS `score_academy_admin`;
CREATE TABLE `score_academy_admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `academy_admin_username` varchar(255) DEFAULT NULL,
  `academy_admin_password` varchar(255) DEFAULT NULL,
  `academy_admin_name` varchar(255) DEFAULT NULL,
  `academy_id` int DEFAULT NULL,
  `academy_admin_role` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score_academy_admin
-- ----------------------------
INSERT INTO `score_academy_admin` VALUES ('1', 'xingong_admin1', '123456', '信息1', '1001', '2');
INSERT INTO `score_academy_admin` VALUES ('2', 'ruanjian_admin1', '123456', '软件1', '1002', '2');

-- ----------------------------
-- Table structure for `score_academy_list`
-- ----------------------------
DROP TABLE IF EXISTS `score_academy_list`;
CREATE TABLE `score_academy_list` (
  `academy_id` int NOT NULL AUTO_INCREMENT,
  `academy_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`academy_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score_academy_list
-- ----------------------------
INSERT INTO `score_academy_list` VALUES ('1001', '信息工程学院');
INSERT INTO `score_academy_list` VALUES ('1002', '软件学院');

-- ----------------------------
-- Table structure for `score_class_admin`
-- ----------------------------
DROP TABLE IF EXISTS `score_class_admin`;
CREATE TABLE `score_class_admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `class_admin_username` varchar(255) DEFAULT NULL,
  `class_admin_password` varchar(255) DEFAULT NULL,
  `class_admin_name` varchar(255) DEFAULT NULL,
  `class_id` int DEFAULT NULL,
  `class_amin_role` int DEFAULT NULL,
  `academy_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score_class_admin
-- ----------------------------
INSERT INTO `score_class_admin` VALUES ('1', '2017jsj21', '123456', '计算机2班管理员1号', '1002', '3', '1001');
INSERT INTO `score_class_admin` VALUES ('2', '2017wlgc11', '123456', '网络1班管理员1号', '1005', '3', '1001');

-- ----------------------------
-- Table structure for `score_class_list`
-- ----------------------------
DROP TABLE IF EXISTS `score_class_list`;
CREATE TABLE `score_class_list` (
  `class_id` int NOT NULL AUTO_INCREMENT,
  `class_list_name` varchar(255) DEFAULT NULL,
  `class_students_count` int DEFAULT NULL,
  `academy_id` int DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score_class_list
-- ----------------------------
INSERT INTO `score_class_list` VALUES ('1001', '2017级计算机科学与技术1班', '15', '1001');
INSERT INTO `score_class_list` VALUES ('1002', '2017级计算机科学与技术2班', '15', '1001');
INSERT INTO `score_class_list` VALUES ('1003', '2017级物流工程1班', '16', '1001');

-- ----------------------------
-- Table structure for `score_input_time`
-- ----------------------------
DROP TABLE IF EXISTS `score_input_time`;
CREATE TABLE `score_input_time` (
  `term_id` int NOT NULL AUTO_INCREMENT,
  `term_name` varchar(255) DEFAULT NULL,
  `term_start_time` datetime DEFAULT NULL,
  `term_end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`term_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20203 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score_input_time
-- ----------------------------
INSERT INTO `score_input_time` VALUES ('20201', '2020-2021第一学期', '2021-03-03 19:00:00', '2020-03-10 19:00:00');
INSERT INTO `score_input_time` VALUES ('20202', '2020-2021第二学期', '2021-09-03 19:00:00', '2021-09-10 19:00:00');

-- ----------------------------
-- Table structure for `score_role`
-- ----------------------------
DROP TABLE IF EXISTS `score_role`;
CREATE TABLE `score_role` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score_role
-- ----------------------------
INSERT INTO `score_role` VALUES ('1', '系统管理员');
INSERT INTO `score_role` VALUES ('2', '学院负责人');
INSERT INTO `score_role` VALUES ('3', '班级负责人');
INSERT INTO `score_role` VALUES ('4', '普通学生');

-- ----------------------------
-- Table structure for `score_students_list`
-- ----------------------------
DROP TABLE IF EXISTS `score_students_list`;
CREATE TABLE `score_students_list` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_username` varchar(255) DEFAULT NULL,
  `student_password` varchar(255) DEFAULT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  `student_role` int DEFAULT NULL,
  `class_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score_students_list
-- ----------------------------
INSERT INTO `score_students_list` VALUES ('1', '20170406101023', '123456', '王玲玲', '4', '1002');
INSERT INTO `score_students_list` VALUES ('2', '20170405102035', '123456', '刘文潇', '4', '1002');
INSERT INTO `score_students_list` VALUES ('3', '20170405102018', '123456', '林盛', '4', '1002');

-- ----------------------------
-- Table structure for `score_system_admin`
-- ----------------------------
DROP TABLE IF EXISTS `score_system_admin`;
CREATE TABLE `score_system_admin` (
  `sys_admin_id` int NOT NULL AUTO_INCREMENT,
  `sys_admin_username` varchar(255) DEFAULT NULL,
  `sys_admin_password` varchar(255) DEFAULT NULL,
  `sys_admin_name` varchar(255) DEFAULT NULL,
  `sys_admin_role` int DEFAULT NULL,
  PRIMARY KEY (`sys_admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score_system_admin
-- ----------------------------
INSERT INTO `score_system_admin` VALUES ('1', 'admin1', '123456', '系统管理员1', '1');
INSERT INTO `score_system_admin` VALUES ('2', 'admin2', '123456', '系统管理员2', '1');
