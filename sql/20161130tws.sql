/*
MySQL Data Transfer
Source Host: 192.168.33.15
Source Database: tws
Target Host: 192.168.33.15
Target Database: tws
Date: 2016/11/3 11:23:32
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for history_job
-- ----------------------------
DROP TABLE IF EXISTS `history_job`;
CREATE TABLE `history_job` (
  `id` varchar(50) NOT NULL,
  `jobdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `description` varchar(100) DEFAULT NULL,
  `started` decimal(50,0) NOT NULL,
  `error` decimal(50,0) NOT NULL,
  `completed` decimal(50,0) NOT NULL,
  `waiting` decimal(50,0) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for job_config
-- ----------------------------
DROP TABLE IF EXISTS `job_config`;
CREATE TABLE `job_config` (
  `id` varchar(255) NOT NULL DEFAULT '',
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `systemName` varchar(255) DEFAULT NULL,
  `phaseInSystem` varchar(255) DEFAULT NULL,
  `planStartTime` varchar(255) DEFAULT NULL,
  `duration` int(2) DEFAULT NULL,
  `serial` int(1) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_department
-- ----------------------------
DROP TABLE IF EXISTS `sys_department`;
CREATE TABLE `sys_department` (
  `id` varchar(36) NOT NULL,
  `name` varchar(50) NOT NULL,
  `status` int(1) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(36) NOT NULL,
  `name` varchar(50) NOT NULL,
  `account` varchar(50) NOT NULL,
  `password` varchar(32) NOT NULL,
  `email` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  `departmentId` varchar(36) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `history_job` VALUES ('15cc8cf5-2f06-4193-92c6-82e40fe6b023', '2016-11-03 11:20:59', null, '0', '0', '13', '88');
INSERT INTO `history_job` VALUES ('48eb4471-b8dd-425b-85b4-5a56288286ec', '2016-11-03 11:17:59', null, '2', '0', '7', '91');
INSERT INTO `history_job` VALUES ('fde2eacc-3886-452b-95cc-b2fe4eb92d8b', '2016-11-03 11:14:58', null, '7', '0', '2', '91');
INSERT INTO `history_job` VALUES ('5c1bb393-4342-4657-a175-9e85ecfcfb39', '2016-11-03 11:11:58', null, '0', '0', '0', '0');
INSERT INTO `history_job` VALUES ('992ca830-3739-488b-a416-fde9a584143f', '2016-11-03 11:08:59', null, '7', '0', '2', '91');
INSERT INTO `history_job` VALUES ('1b7ba9fc-9f6a-46e8-9a08-32440b06fa32', '2016-11-03 11:05:58', null, '7', '0', '2', '91');
INSERT INTO `history_job` VALUES ('78b02380-502d-457e-90d8-13ecab2dd20a', '2016-11-03 11:02:59', null, '7', '0', '2', '91');
INSERT INTO `history_job` VALUES ('45106af7-4253-4166-8369-22d45e18b8bb', '2016-11-03 10:59:59', null, '7', '0', '2', '91');
INSERT INTO `history_job` VALUES ('96bfa122-5821-45de-b2b0-a69ee4cbf709', '2016-11-03 10:08:59', null, '7', '0', '2', '91');
INSERT INTO `history_job` VALUES ('e3e6e6ed-4878-4709-93eb-db389a99d05e', '2016-11-03 10:53:59', null, '7', '0', '2', '91');
INSERT INTO `history_job` VALUES ('8109f014-8135-4ab2-87ba-192038ded3aa', '2016-11-03 10:56:59', null, '7', '0', '2', '91');
INSERT INTO `job_config` VALUES ('a1', '场景一介绍', '2016-11-25 21:59:00', 'ALL 3', '演练开始', '1480082340000', '1', '1', '农信领导');
INSERT INTO `job_config` VALUES ('a2', '发现告警值班员报告', '2016-11-25 22:00:00', 'ALL 3', '切换前检查', '1480082400000', '30', '-1', '周猛军、曹畅、钱小强');
INSERT INTO `job_config` VALUES ('a3', '网络管理员响应', '2016-11-25 22:00:00', 'ALL 3', '切换前检查', '1480082400000', '30', '-1', '王军');
INSERT INTO `job_config` VALUES ('a4', '应用管理员响应', '2016-11-25 22:00:00', 'ALL 3', '切换前检查', '1480082400000', '30', '-1', '刘军、桑晓东、胡鹏');
INSERT INTO `job_config` VALUES ('a5', '系统管理员响应', '2016-11-25 22:30:00', 'ALL 3', '切换前检查', '1480084200000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('a6', '运行支持部门经理响应', '2016-11-25 23:50:00', 'ALL 3', '过度', '1480089000000', '10', '0', '王漫');
INSERT INTO `job_config` VALUES ('a7', '网络检查结果', '2016-11-26 00:10:00', '指纹登录', '存储切换', '1480090200000', '40', '0', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('a8', '应用检查结果', '2016-11-26 00:50:00', '核心', '存储切换', '1480092600000', '0', '-1', '钱小强、周猛军');
INSERT INTO `job_config` VALUES ('a9', '系统检查结果', '2016-11-26 00:50:00', 'ALL 3', '网络切换', '1480092600000', '10', '1', '王军');
INSERT INTO `job_config` VALUES ('a10', '检查结果汇总分析', '2016-11-26 01:00:00', 'ALL 3', '网络切换', '1480093200000', '10', '-1', '王军');
INSERT INTO `job_config` VALUES ('a11', '网络紧急处置结果', '2016-11-26 01:10:00', 'ALL 3', '存储切换', '1480093800000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('a12', '应用紧急处置结果', '2016-11-26 01:10:00', 'ALL 3', '存储切换', '1480093800000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('a13', '系统紧急处置结果', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('a14', '生产运行应急分析会议', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('a15', '突发事件上报信息中心总经理', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('a16', '场景二介绍', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('a17', '应用管理部问题排查及应急处', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('a18', '资源保障部问题排查及应急处', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('a19', '处置结果汇总分析', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('a20', '突发事件上报省联社分管领导', '2016-11-26 01:10:00', '指纹登录', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('a21', '安排事件上报', '2016-11-26 01:20:00', 'ALL 3', '存储切换', '1480094400000', '0', '1', '农信执行组');
INSERT INTO `job_config` VALUES ('a22', '突发事件上报安徽银监会', '2016-11-26 01:20:00', 'ALL 3', '灾备系统启动', '1480094400000', '0', '1', '农信执行组');
INSERT INTO `job_config` VALUES ('a23', '场景三介绍', '2016-11-26 01:20:00', '柜面前置', '灾备系统启动', '1480094400000', '20', '0', '刘军、涂兵');
INSERT INTO `job_config` VALUES ('a24', '下达组建联合应急小组命令', '2016-11-26 01:20:00', '核心', '灾备系统启动', '1480094400000', '20', '0', '桑晓东、曹信');
INSERT INTO `job_config` VALUES ('a25', '上报组件联合应急小组', '2016-11-26 01:20:00', '指纹登录', '灾备系统启动', '1480094400000', '20', '0', '胡鹏、李丹');
INSERT INTO `job_config` VALUES ('a26', '上报组件联合应急小组2', '2016-11-26 01:40:00', 'ALL 3', '灾备系统启动', '1480095600000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('a27', '汇报问题原因及暂定措施', '2016-11-26 01:40:00', 'ALL 3', '灾备系统启动', '1480095600000', '10', '-1', '周猛军、陈天舒');
INSERT INTO `job_config` VALUES ('a28', '场景四介绍', '2016-11-26 01:50:00', 'ALL 3', '灾备业务验证', '1480096200000', '5', '1', '王漫');
INSERT INTO `job_config` VALUES ('a29', '汇报问题原因及暂定措施2', '2016-11-26 01:55:00', 'ALL 3', '灾备业务验证', '1480096500000', '25', '1', '龚本清');
INSERT INTO `job_config` VALUES ('a30', '场景五介绍', '2016-11-26 02:20:00', 'ALL 3', '网络回切', '1480098000000', '5', '-1', '王军');
INSERT INTO `job_config` VALUES ('a31', '汇报问题分析原因', '2016-11-26 02:25:00', 'ALL 3', '网络回切', '1480098300000', '15', '1', '王军');
INSERT INTO `job_config` VALUES ('a32', '场景六介绍', '2016-11-26 02:40:00', 'ALL 3', '  生产系统启动', '1480099200000', '0', '1', '农信执行组');
INSERT INTO `job_config` VALUES ('a33', '网络管理员报告测试结果', '2016-11-26 02:40:00', 'ALL 3', '  生产系统启动', '1480099200000', '10', '0', '桑晓东、蔡慧芬');
INSERT INTO `job_config` VALUES ('a34', '应用管理员报告测试结果', '2016-11-26 02:40:00', '柜面前置', '  生产系统启动', '1480099200000', '10', '0', '刘军、涂兵');
INSERT INTO `job_config` VALUES ('a35', '汇报测试结果', '2016-11-26 02:40:00', '指纹登录', '  生产系统启动', '1480099200000', '10', '0', '胡鹏、李丹');
INSERT INTO `job_config` VALUES ('a36', '汇报测试结果2', '2016-11-26 02:50:00', 'ALL 3', '生产系统启动', '1480099800000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('a37', '场景七介绍', '2016-11-26 02:50:00', 'ALL 3', '生产业务验证', '1480099800000', '5', '1', '王漫');

INSERT INTO `sys_department` VALUES ('1', '灾备中心ECC', '1', '灾备中心ECC');

INSERT INTO `sys_user` VALUES ('1', '孙旭东', '孙旭东', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('2', '曹碧云', '曹碧云', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('3', '曹玉蓉', '曹玉蓉', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('4', '杨明', '杨明', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('5', '周存浩', '周存浩', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('6', '戴智勇', '戴智勇', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('7', '王勇', '王勇', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('8', '巫明', '巫明', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('9', '周猛军', '周猛军', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('10', '曹畅', '曹畅', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('11', '钱小强', '钱小强', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('12', '蔡强', '蔡强', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('13', '王漫', '王漫', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('14', '桑晓东', '桑晓东', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('15', '胡鹏', '胡鹏', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('16', '刘军', '刘军', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('17', '昝丽红', '昝丽红', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('18', '杨明', '杨明', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('19', '张振华', '张振华', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('20', '王军', '王军', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('21', '曹信', '曹信', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('22', '涂兵', '涂兵', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('23', '蔡慧芬', '蔡慧芬', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('24', '李丹', '李丹', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('25', '龚本清', '龚本清', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('26', '黄睿', '黄睿', '111111', '', '已上线', null, '1');
INSERT INTO `sys_user` VALUES ('27', '陆艳', '陆艳', '111111', '', '已上线', null, '1');