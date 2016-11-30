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
INSERT INTO `job_config` VALUES ('2744676e-7c01-39c0-9bb6-975bf5fdb994', '演练开始', '2016-11-25 21:59:00', 'ALL 3', '演练开始', '1480082340000', '1', '1', '农信领导');
INSERT INTO `job_config` VALUES ('c9a6f828-8870-334e-b7fc-ed454465de11', '主机及存储健康检查_周猛军30M', '2016-11-25 22:00:00', 'ALL 3', '切换前检查', '1480082400000', '30', '-1', '周猛军、曹畅、钱小强');
INSERT INTO `job_config` VALUES ('afac8122-0937-31a9-acac-dd521e3d9729', '网络状态健康检查_王军30M', '2016-11-25 22:00:00', 'ALL 3', '切换前检查', '1480082400000', '30', '-1', '王军');
INSERT INTO `job_config` VALUES ('5f235871-531e-3a2a-9072-15fee8c895de', '灾备应用版本检查_桑晓东30M', '2016-11-25 22:00:00', 'ALL 3', '切换前检查', '1480082400000', '30', '-1', '刘军、桑晓东、胡鹏');
INSERT INTO `job_config` VALUES ('59a567fe-59dc-3ae6-bdee-587627900043', '完成检查工作', '2016-11-25 22:30:00', 'ALL 3', '切换前检查', '1480084200000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('c8336301-76ff-38d2-ae91-d6e758424244', '短信通知零时开始切换_王漫10M', '2016-11-25 23:50:00', 'ALL 3', '过度', '1480089000000', '10', '0', '王漫');
INSERT INTO `job_config` VALUES ('e9f7ae24-95ac-3a13-9ea1-af5597b9a839', '停生产ATMP应用_桑晓东10M', '2016-11-26 00:00:00', 'ALL 3', '生产系统关闭', '1480089600000', '10', '0', '桑晓东、蔡慧芬');
INSERT INTO `job_config` VALUES ('dc547eb5-5ae4-3ed1-b285-2c9a44978fec', '开始暂停存储复制', '2016-11-26 00:10:00', 'ALL 3', '存储切换', '1480090200000', '0', '1', '农信执行组');
INSERT INTO `job_config` VALUES ('aaddb75a-7e1a-3ea7-8e78-afa10527b517', '暂停柜面存储复制_钱小强40M', '2016-11-26 00:10:00', '柜面前置', '存储切换', '1480090200000', '40', '0', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('b7c8e0f5-b9c8-3ace-9856-c7cde3ec2e2d', '暂停核心存储复制_周猛军40M', '2016-11-26 00:10:00', '核心', '存储切换', '1480090200000', '40', '0', '周猛军、陈天舒');
INSERT INTO `job_config` VALUES ('1ae814c3-e510-301a-b24b-3c16cf9f0c16', '暂停指纹存储复制_钱小强40M', '2016-11-26 00:10:00', '指纹登录', '存储切换', '1480090200000', '40', '0', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('273b826c-cbca-37e4-bd8e-f5c02aaef059', '完成暂停存储复制', '2016-11-26 00:50:00', '核心', '存储切换', '1480092600000', '0', '-1', '钱小强、周猛军');
INSERT INTO `job_config` VALUES ('5fa67ece-244c-36e5-8fb6-60c701195f60', '切断生产广域网_王军10M', '2016-11-26 00:50:00', 'ALL 3', '网络切换', '1480092600000', '10', '1', '王军');
INSERT INTO `job_config` VALUES ('61493515-84fa-3915-acc3-0f0a42ef5031', '激活灾备网络设置_王军10M', '2016-11-26 01:00:00', 'ALL 3', '网络切换', '1480093200000', '10', '-1', '王军');
INSERT INTO `job_config` VALUES ('ba1fcab3-f385-35b8-8cb2-1412abffb057', '开始挂载存储盘', '2016-11-26 01:10:00', 'ALL 3', '存储切换', '1480093800000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('9c807ee3-d71d-308e-8b71-9a2b6ea9ffed', '灾备柜面挂载存储盘', '2016-11-26 01:10:00', 'ALL 3', '存储切换', '1480093800000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('052fb1c2-8316-3653-9f01-a98619a76d4b', '挂载灾备柜面前置4存储盘', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('847a8c99-424d-3636-b385-223706f8e1fa', '挂载灾备柜面前置8存储盘', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('9f2fac0a-52dd-3772-86e9-accb5560574c', '挂载灾备柜面前置7存储盘', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('c86c4293-7ca9-301e-9318-142925917511', '挂载灾备柜面前置1存储盘', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('d5df12ba-002f-3ab0-836e-6d010f4a4382', '挂载灾备柜面前置5存储盘', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('f4b6dacb-397f-3de7-8217-4851ece920d6', '挂载灾备柜面前置9存储盘', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('360a5d80-4aaa-3fbe-9c72-bdca4467dafc', '挂载灾备柜面前置10存储盘', '2016-11-26 01:10:00', '柜面前置', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('9d12ea6e-922d-3bc8-a02d-fb95504e97ec', '灾备指纹挂存储盘_钱小强10M', '2016-11-26 01:10:00', '指纹登录', '存储切换', '1480093800000', '10', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('09853ce3-0f53-35e2-896f-66794dcdb80b', '完成挂载并人工核查_钱小强5M', '2016-11-26 01:20:00', 'ALL 3', '存储切换', '1480094400000', '0', '1', '农信执行组');
INSERT INTO `job_config` VALUES ('ea8bc61a-b49b-3329-a6e8-672b86cf9a99', '开始启动灾备应用', '2016-11-26 01:20:00', 'ALL 3', '灾备系统启动', '1480094400000', '0', '1', '农信执行组');
INSERT INTO `job_config` VALUES ('6d6675cb-2c27-3777-aecc-db71cccff7c1', '启动灾备柜面前置应用_刘军20M', '2016-11-26 01:20:00', '柜面前置', '灾备系统启动', '1480094400000', '20', '0', '刘军、涂兵');
INSERT INTO `job_config` VALUES ('048c5bcf-fb8e-3ff5-9948-9fcc6bd1a053', '启动灾备核心应用_桑晓东20M', '2016-11-26 01:20:00', '核心', '灾备系统启动', '1480094400000', '20', '0', '桑晓东、曹信');
INSERT INTO `job_config` VALUES ('d563b0f4-9b5f-321e-9a77-a851c1cb6077', '启动灾备指纹登录应用_胡鹏20M', '2016-11-26 01:20:00', '指纹登录', '灾备系统启动', '1480094400000', '20', '0', '胡鹏、李丹');
INSERT INTO `job_config` VALUES ('1c8a5639-8d21-3cd1-9d2c-fc069d015b19', '完成启动灾备应用', '2016-11-26 01:40:00', 'ALL 3', '灾备系统启动', '1480095600000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('bed9df19-4306-3c57-b9a8-7a742b7bc676', '发布灾备核心服务IP_周猛军10M', '2016-11-26 01:40:00', 'ALL 3', '灾备系统启动', '1480095600000', '10', '-1', '周猛军、陈天舒');
INSERT INTO `job_config` VALUES ('4f4beb4c-1dc1-36f6-91b6-0811182d8efa', '短信通知灾备业务验证_王漫5M', '2016-11-26 01:50:00', 'ALL 3', '灾备业务验证', '1480096200000', '5', '1', '王漫');
INSERT INTO `job_config` VALUES ('ea8c947d-b8c8-3adb-b26c-2ccd5dbd899b', '灾备业务验证_龚本清25M', '2016-11-26 01:55:00', 'ALL 3', '灾备业务验证', '1480096500000', '25', '1', '龚本清');
INSERT INTO `job_config` VALUES ('3f0995f9-3377-383f-b1e3-883ead5d29b4', '启动3G_王军5M', '2016-11-26 02:20:00', 'ALL 3', '网络回切', '1480098000000', '5', '-1', '王军');
INSERT INTO `job_config` VALUES ('6f0d0f61-88c4-3e76-8f98-a892e11c1f5e', '灾备到生产网络回切_王军20M', '2016-11-26 02:25:00', 'ALL 3', '网络回切', '1480098300000', '15', '1', '王军');
INSERT INTO `job_config` VALUES ('02ea6574-9692-3b28-8faa-7775fd529ee6', '开始启动生产应用', '2016-11-26 02:40:00', 'ALL 3', '  生产系统启动', '1480099200000', '0', '1', '农信执行组');
INSERT INTO `job_config` VALUES ('e704c94e-94a8-3776-b3fc-73103343422b', '启动生产ATMP应用_桑晓东10M', '2016-11-26 02:40:00', 'ALL 3', '  生产系统启动', '1480099200000', '10', '0', '桑晓东、蔡慧芬');
INSERT INTO `job_config` VALUES ('b1ad45c1-d148-394d-8702-fd267d531f47', '启动生产柜面前置应用_刘军10M', '2016-11-26 02:40:00', '柜面前置', '  生产系统启动', '1480099200000', '10', '0', '刘军、涂兵');
INSERT INTO `job_config` VALUES ('9182f658-deca-3711-86c1-87819fa79662', '启动生产指纹登录应用_胡鹏10M', '2016-11-26 02:40:00', '指纹登录', '  生产系统启动', '1480099200000', '10', '0', '胡鹏、李丹');
INSERT INTO `job_config` VALUES ('c7828541-57dd-3fa6-bc6e-74c1941afb05', '完成启动生产应用', '2016-11-26 02:50:00', 'ALL 3', '生产系统启动', '1480099800000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('15e7d733-3dcf-3058-8f6e-273cf1ae5930', '短信通知生产业务验证_王漫5M', '2016-11-26 02:50:00', 'ALL 3', '生产业务验证', '1480099800000', '5', '1', '王漫');
INSERT INTO `job_config` VALUES ('681b6af1-b1d7-3e19-84fa-5080afd83706', '生产业务验证_龚本清25M', '2016-11-26 02:55:00', 'ALL 3', '生产业务验证', '1480100100000', '25', '1', '龚本清');
INSERT INTO `job_config` VALUES ('3a6b1d79-3a6b-38fd-a094-047f6c0bff5f', '短信通知演练结束_王漫5M', '2016-11-26 03:20:00', 'ALL 3', '生产业务验证', '1480101600000', '5', '1', '王漫');
INSERT INTO `job_config` VALUES ('49f829ac-f08b-301e-a10c-69fc07c8a3ae', '开始停止灾备应用', '2016-11-26 03:25:00', 'ALL 3', '灾备系统关闭', '1480101900000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('19c656d5-6c8a-3258-a62f-2f97ea1fd478', '停止灾备柜面前置应用_刘军15M', '2016-11-26 03:25:00', 'ALL 3', '灾备系统关闭', '1480101900000', '5', '-1', '刘军、涂兵');
INSERT INTO `job_config` VALUES ('09fbfcb9-12d8-373a-ac7e-ec86eca6328f', '停止灾备核心应用_桑晓东15M', '2016-11-26 03:25:00', 'ALL 3', '灾备系统关闭', '1480101900000', '5', '-1', '桑晓东、刘军');
INSERT INTO `job_config` VALUES ('b86a1346-77c6-356a-b334-461234c14173', '停止灾备指纹登录应用_胡鹏15M', '2016-11-26 03:25:00', 'ALL 3', '灾备系统关闭', '1480101900000', '5', '-1', '胡鹏、李丹');
INSERT INTO `job_config` VALUES ('5d87ed26-6612-3643-bde9-13b302216053', '完成停止灾备应用', '2016-11-26 03:40:00', 'ALL 3', '灾备系统关闭', '1480102800000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('a109484b-c1be-3e26-a70f-8bccca7b3bb5', '卸载灾备柜面前置存储盘', '2016-11-26 03:40:00', '柜面前置', '存储回切', '1480102800000', '0', '-1', 'TWS自动执行');
INSERT INTO `job_config` VALUES ('1a467a59-52e1-33c4-b3b8-8e3d47b86ea2', '卸载灾备柜面前置1存储盘', '2016-11-26 03:40:00', '柜面前置', '存储回切', '1480102800000', '10', '0', 'TWS自动执行');
INSERT INTO `job_config` VALUES ('99d4d881-67e8-348f-a281-a714d5b17e4f', '卸载灾备柜面前置4存储盘', '2016-11-26 03:40:00', '柜面前置', '存储回切', '1480102800000', '10', '0', 'TWS自动执行');
INSERT INTO `job_config` VALUES ('f43e6257-b460-393e-9c6b-aec5cba4803a', '卸载灾备柜面前置5存储盘', '2016-11-26 03:40:00', '柜面前置', '存储回切', '1480102800000', '10', '0', 'TWS自动执行');
INSERT INTO `job_config` VALUES ('546c8655-3124-3a4a-8686-66c2436d7dee', '卸载灾备柜面前置7存储盘', '2016-11-26 03:40:00', '柜面前置', '存储回切', '1480102800000', '10', '0', 'TWS自动执行');
INSERT INTO `job_config` VALUES ('df5587f6-4f4c-3281-9737-effe25abb348', '卸载灾备柜面前置8存储盘', '2016-11-26 03:40:00', '柜面前置', '存储回切', '1480102800000', '10', '0', 'TWS自动执行');
INSERT INTO `job_config` VALUES ('a756e029-2e7f-33d0-b91f-793ee246a2dd', '卸载灾备柜面前置9存储盘', '2016-11-26 03:40:00', '柜面前置', '存储回切', '1480102800000', '10', '0', 'TWS自动执行');
INSERT INTO `job_config` VALUES ('0ab0a437-1798-3318-a274-6fd6a2f416bf', '卸载灾备柜面前置10存储盘', '2016-11-26 03:40:00', '柜面前置', '存储回切', '1480102800000', '10', '0', 'TWS自动执行');
INSERT INTO `job_config` VALUES ('5f7d52e9-93aa-3ee5-b4c3-0bd5a89f8c86', '卸载灾备指纹登录存储盘', '2016-11-26 03:40:00', '指纹登录', '存储回切', '1480102800000', '10', '0', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('eef78bfb-f621-37ab-8c0e-5a40f7ba713b', '完成卸载并人工核查_钱小强5M', '2016-11-26 03:50:00', 'ALL 3', '存储回切', '1480103400000', '0', '-1', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('11641bb7-fb71-3a69-8859-f582036c58a6', '开始恢复存储复制', '2016-11-26 03:50:00', 'ALL 3', '存储回切', '1480103400000', '0', '1', '农信执行组');
INSERT INTO `job_config` VALUES ('2339050d-6d52-3800-89d3-b34cdd527124', '恢复柜面存储复制_钱小强10M', '2016-11-26 03:50:00', '柜面前置', '存储回切', '1480103400000', '10', '0', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('8f780c3f-0912-3afa-a4dc-8864a5c17979', '恢复核心存储复制_周猛军10M', '2016-11-26 03:50:00', '核心', '存储回切', '1480103400000', '10', '0', '周猛军、陈天舒');
INSERT INTO `job_config` VALUES ('cfbb54ed-52ee-3210-90a1-1b9919cf7913', '恢复指纹存储复制_钱小强10M', '2016-11-26 03:50:00', '指纹登录', '存储回切', '1480103400000', '10', '0', '钱小强、闵涵');
INSERT INTO `job_config` VALUES ('c1c1a39c-89a7-3c48-9b2b-17976cbc3d81', '完成恢复存储复制', '2016-11-26 04:00:00', 'ALL 3', '存储回切', '1480104000000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('5b6c17b5-f6dd-3074-9495-7ffd8d646662', '开始备份灾备系统数据', '2016-11-26 04:00:00', 'ALL 3', '灾备数据备份', '1480104000000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('f106915a-11c3-3fcd-b163-2e7333e9f5cf', '备份灾备柜面前置数据_刘军10M', '2016-11-26 04:00:00', '柜面前置', '灾备数据备份', '1480104000000', '10', '0', '刘军、涂兵');
INSERT INTO `job_config` VALUES ('45f5ce2d-31e9-3f30-8b1d-78d0881afbff', '备份灾备核心数据_桑晓东10M', '2016-11-26 04:00:00', '核心', '灾备数据备份', '1480104000000', '10', '0', '桑晓东、曹信');
INSERT INTO `job_config` VALUES ('6b767f80-9757-3745-a832-247f99aa04ae', '完成备份灾备系统数据', '2016-11-26 04:10:00', 'ALL 3', '灾备数据备份', '1480104600000', '0', '-1', '农信执行组');
INSERT INTO `job_config` VALUES ('27caa7f1-2984-3f2b-a7dd-8fbc0873d8a8', '演练结束', '2016-11-26 04:10:00', 'ALL 3', '演练结束', '1480104600000', '0', '-1', '农信领导');

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