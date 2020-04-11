/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50642
Source Host           : localhost:3306
Source Database       : myoffice

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2019-01-22 14:46:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `activity`
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日活动主键，自动增长',
  `name` varchar(500) DEFAULT NULL COMMENT '日程名称',
  `category` smallint(1) DEFAULT NULL COMMENT '活动类别',
  `priority` smallint(1) DEFAULT NULL COMMENT '活动优先级',
  `create_day` date DEFAULT NULL COMMENT '任务日期',
  `start_time` time DEFAULT NULL COMMENT '开始时间',
  `end_time` time DEFAULT NULL COMMENT '结束时间',
  `implement_rate` double DEFAULT NULL COMMENT '任务的执行率',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  `status` bit(1) DEFAULT NULL COMMENT '活动状态',
  `_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity
-- ----------------------------
INSERT INTO `activity` VALUES ('1', 'bbbbbb', '1', '1', '2019-01-08', '10:00:00', '11:00:00', '0.34', 'aabbbbbbbbbbbbbbbbbbbbbbb', '', '2019-01-22 14:30:16');
INSERT INTO `activity` VALUES ('2', 'myoffice前端', '1', '1', '2019-01-01', '16:56:19', '16:56:22', '0.86', '备注', '', '2019-01-17 15:09:54');
INSERT INTO `activity` VALUES ('3', 'myoffice后端设计', '2', '1', '2019-01-01', '16:56:19', '16:56:22', '0.86', '备注', '', '2019-01-17 15:09:54');
INSERT INTO `activity` VALUES ('4', 'myoffice后端设计', '1', '1', '2019-01-01', '16:56:19', '16:56:22', '0.81', '备注', '', '2019-01-17 15:09:54');
INSERT INTO `activity` VALUES ('5', 'myoffice后端设计', '3', '2', '2019-01-01', '16:56:19', '16:56:22', '0.81', '备注', '', '2019-01-17 15:09:54');
INSERT INTO `activity` VALUES ('6', 'myoffice后端设计', '1', '1', '2019-01-02', '16:56:19', '16:56:22', '0.66', '备注', '', '2019-01-17 15:10:08');
INSERT INTO `activity` VALUES ('7', 'myoffice后端设计', '1', '2', '2019-01-02', '16:56:19', '16:56:22', '0.86', '备注', '', '2019-01-17 15:10:08');
INSERT INTO `activity` VALUES ('8', 'myoffice后端设计', '1', '1', '2019-01-02', '16:56:19', '16:56:00', '0.66', '备注', '', '2019-01-22 13:37:46');
INSERT INTO `activity` VALUES ('9', 'myoffice后端设计', '2', '1', '2019-01-02', '16:56:19', '16:56:22', '0.56', '备注', '', '2019-01-17 15:10:08');
INSERT INTO `activity` VALUES ('10', 'myoffice后端设计', '2', '2', '2019-01-02', '16:56:19', '16:56:22', '0.98', '备注', '', '2019-01-17 15:10:08');
INSERT INTO `activity` VALUES ('11', 'myoffice后端设计', '1', '1', '2019-01-03', '16:56:19', '16:56:22', '1', '备注', '', '2019-01-17 15:10:16');
INSERT INTO `activity` VALUES ('12', 'myoffice后端设计', '2', '4', '2019-01-03', '16:56:00', '16:56:00', '0.86', '备注', '', '2019-01-22 14:14:26');
INSERT INTO `activity` VALUES ('13', 'myoffice后端设计', '4', '3', '2019-01-04', '16:56:19', '16:56:22', '0.86', '备注', '', '2019-01-17 15:10:24');
INSERT INTO `activity` VALUES ('14', 'myoffice后端设计', '1', '1', '2019-01-04', '16:56:19', '16:56:22', '1', '备注', '', '2019-01-17 15:10:24');
INSERT INTO `activity` VALUES ('15', 'myoffice后端设计', '2', '3', '2019-01-04', '16:56:19', '16:56:22', '0.86', '备注', '', '2019-01-17 15:10:24');
INSERT INTO `activity` VALUES ('16', 'myoffice后端设计', '2', '3', '2019-01-05', '16:56:19', '16:56:22', '0.45', '备注', '', '2019-01-17 15:10:36');
INSERT INTO `activity` VALUES ('17', 'myoffice后端设计', '3', '3', '2019-01-05', '16:56:19', '16:56:22', '0.23', '备注', '', '2019-01-17 15:10:36');
INSERT INTO `activity` VALUES ('18', 'myoffice后端设计', '3', '1', '2019-01-05', '16:56:19', '16:56:22', '0.86', '备注', '', '2019-01-17 15:10:36');
INSERT INTO `activity` VALUES ('19', 'myoffice后端设计', '3', '4', '2019-01-05', '16:56:19', '16:56:22', '0.86', '备注', '', '2019-01-17 15:10:36');
INSERT INTO `activity` VALUES ('20', 'myoffice后端设计', '3', '4', '2019-01-05', '16:56:19', '16:56:22', '0.86', '备注', '', '2019-01-17 15:10:36');
INSERT INTO `activity` VALUES ('21', 'myoffice后端设计', '1', '4', '2019-01-05', '16:56:19', '16:56:22', '0.86', '备注', '', '2019-01-17 15:10:36');
INSERT INTO `activity` VALUES ('22', 'aaadasdasdsdsdasdasdasdasdsd', '1', '1', '2019-01-23', '13:58:00', '13:57:00', '0', null, '', '2019-01-22 13:57:13');
INSERT INTO `activity` VALUES ('23', 'zzzzz', '1', '1', '2019-01-23', '14:30:00', '14:30:00', '0', null, '', '2019-01-22 14:31:03');
INSERT INTO `activity` VALUES ('24', 'bbbbbbb', '2', '2', '2019-01-21', '14:30:00', '14:30:00', '0', null, '', '2019-01-22 14:31:03');

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '活动类别主键',
  `name` varchar(100) DEFAULT NULL COMMENT '活动类别名称',
  `code` tinyint(4) DEFAULT NULL COMMENT '活动类别编码',
  `status` smallint(6) DEFAULT NULL,
  `_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '工作', '1', '0', '2019-01-18 11:19:32');
INSERT INTO `category` VALUES ('2', '学习', '2', '0', '2019-01-18 11:19:33');
INSERT INTO `category` VALUES ('3', '文化', '3', '0', '2019-01-18 11:19:36');
INSERT INTO `category` VALUES ('4', '恋爱', '4', '0', '2019-01-18 11:19:37');
INSERT INTO `category` VALUES ('5', '运动', '5', '0', '2019-01-18 11:19:39');
INSERT INTO `category` VALUES ('6', '其他', '6', '0', '2019-01-18 11:19:40');

-- ----------------------------
-- Table structure for `priority`
-- ----------------------------
DROP TABLE IF EXISTS `priority`;
CREATE TABLE `priority` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '活动优先级主键',
  `code` tinyint(6) DEFAULT NULL COMMENT '活动类别编码',
  `name` varchar(100) DEFAULT NULL COMMENT '活动类别名称',
  `status` bit(1) DEFAULT NULL COMMENT '活动类别状态',
  `remark` varchar(200) DEFAULT NULL,
  `_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of priority
-- ----------------------------
INSERT INTO `priority` VALUES ('1', '1', '重要紧急', '', '', '2019-01-10 17:07:33');
INSERT INTO `priority` VALUES ('2', '2', '重要不紧急', '', '', '2019-01-10 17:07:32');
INSERT INTO `priority` VALUES ('3', '3', '不重要紧急', '', null, '2019-01-10 17:07:30');
INSERT INTO `priority` VALUES ('4', '4', '不重要不紧急', '', null, '2019-01-10 17:07:45');

-- ----------------------------
-- Table structure for `status`
-- ----------------------------
DROP TABLE IF EXISTS `status`;
CREATE TABLE `status` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT COMMENT '状态码表',
  `name` varchar(100) DEFAULT NULL COMMENT '状态名称',
  `code` tinyint(4) DEFAULT NULL COMMENT '状态编码',
  `_timestamp` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of status
-- ----------------------------
INSERT INTO `status` VALUES ('1', '正常', '0', '2019-01-10 17:04:33');
INSERT INTO `status` VALUES ('2', '删除', '1', '2019-01-10 17:04:37');
