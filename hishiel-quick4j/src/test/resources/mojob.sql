/*
Navicat MySQL Data Transfer

Source Server         : hansuo
Source Server Version : 50549
Source Host           : 172.20.19.121:3306
Source Database       : mojob

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2016-11-18 17:49:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for basic_attendance
-- ----------------------------
DROP TABLE IF EXISTS `basic_attendance`;
CREATE TABLE `basic_attendance` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `ATT_DATE` date DEFAULT NULL COMMENT '考勤日期',
  `EMP_NO` int(11) DEFAULT NULL COMMENT '关联员工ID',
  `START_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '开始工作时间',
  `START_LONGITUDE` double DEFAULT NULL COMMENT '开始工作经度',
  `START_LATITUDE` double DEFAULT NULL COMMENT '开始工作纬度',
  `END_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '结束工作时间',
  `END_LONGITUDE` double DEFAULT NULL COMMENT '结束工作经度',
  `END_LATITUDE` double DEFAULT NULL COMMENT '结束工作纬度',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  `RSV01` varchar(50) DEFAULT NULL,
  `RSV02` varchar(50) DEFAULT NULL,
  `RSV03` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_attendance
-- ----------------------------

-- ----------------------------
-- Table structure for basic_department
-- ----------------------------
DROP TABLE IF EXISTS `basic_department`;
CREATE TABLE `basic_department` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `DEPT_ID` varchar(20) DEFAULT NULL COMMENT '部门编号',
  `DEPT_NAME` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `PARENT_ID` int(11) DEFAULT NULL COMMENT '父级部门ID',
  `RANK` varchar(20) DEFAULT NULL COMMENT '部门层级',
  `STATUS` varchar(20) DEFAULT NULL COMMENT '状态;0无效 1有效',
  `DEPT_PHONE` varchar(20) DEFAULT NULL COMMENT '部门电话',
  `DEPT_ADDRESS` varchar(150) DEFAULT NULL COMMENT '部门地址',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `RSV01` varchar(50) DEFAULT NULL,
  `RSV02` varchar(50) DEFAULT NULL,
  `RSV03` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_department
-- ----------------------------
INSERT INTO `basic_department` VALUES ('1', '01', '上海铁路局', '0', '1', '1', null, null, 'HishielTest', '2016-11-18 17:12:18', null, null, null);

-- ----------------------------
-- Table structure for basic_duty
-- ----------------------------
DROP TABLE IF EXISTS `basic_duty`;
CREATE TABLE `basic_duty` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `DUTY_ID` varchar(20) DEFAULT NULL COMMENT '岗位ID',
  `DUTY_NAME` varchar(50) DEFAULT NULL COMMENT '岗位名称',
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  `RSV01` varchar(50) DEFAULT NULL,
  `RSV02` varchar(50) DEFAULT NULL,
  `RSV03` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_duty
-- ----------------------------

-- ----------------------------
-- Table structure for basic_employee
-- ----------------------------
DROP TABLE IF EXISTS `basic_employee`;
CREATE TABLE `basic_employee` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `EMP_ID` varchar(20) DEFAULT NULL COMMENT '员工ID，登录名',
  `EMP_NAME` varchar(50) DEFAULT NULL COMMENT '姓名',
  `PASSWORD` varchar(32) DEFAULT NULL COMMENT '用户密码',
  `DEPT_NO` int(11) DEFAULT NULL COMMENT '所属单位编号',
  `DUTY_NO` int(11) DEFAULT NULL COMMENT '岗位编号;1班组 2作业人员',
  `JOB` varchar(20) DEFAULT NULL COMMENT '工种',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态;0无效 1有效',
  `MOBILE_PHONE` varchar(20) DEFAULT NULL COMMENT '手机号',
  `ADDRESS` varchar(150) DEFAULT NULL COMMENT '地址',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  `ENTRY_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '入职时间',
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `RSV01` varchar(50) DEFAULT NULL,
  `RSV02` varchar(50) DEFAULT NULL,
  `RSV03` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_employee
-- ----------------------------
INSERT INTO `basic_employee` VALUES ('1', 'A0001', 'Tom', '123456', '12', '2', '1', '1', '13916584582', 'shanghai', 'test', '2008-05-12 09:15:21', '2016-11-18 15:39:07', null, null, null);

-- ----------------------------
-- Table structure for equip_mgr_m
-- ----------------------------
DROP TABLE IF EXISTS `equip_mgr_m`;
CREATE TABLE `equip_mgr_m` (
  `id` int(11) NOT NULL DEFAULT '0' COMMENT '设备ID',
  `mac` varchar(30) DEFAULT NULL COMMENT 'MAC',
  `type` int(11) DEFAULT NULL COMMENT '设备类型',
  `status` int(11) DEFAULT NULL COMMENT '设备状态',
  `phone` varchar(20) DEFAULT NULL COMMENT '关联电话',
  `deptId` int(11) DEFAULT NULL COMMENT '部门编号',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '使用时间',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `back1` varchar(50) DEFAULT NULL,
  `back2` varchar(50) DEFAULT NULL,
  `back3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equip_mgr_m
-- ----------------------------
INSERT INTO `equip_mgr_m` VALUES ('19999971', '12-44-75-89-65-45', null, '1', '12322233344', '15', '2016-11-18 11:06:08', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999972', '14-78-36-56-43-21', null, '1', '11122453322', '15', '2016-11-18 11:06:34', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999973', '78-46-16-37-19-85', null, '1', '11122233328', '15', '2016-11-18 11:07:02', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999974', '13-49-68-79-16-77', null, '1', '13916901123', '14', '2016-11-18 11:08:25', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999975', '19-49-76-16-85-67', null, '1', '13916905422', '17', '2016-11-18 11:08:54', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999976', '19-78-68-19-53-78', null, '1', '13322233345', '17', '2016-11-18 11:09:24', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999977', '14-54-86-91-37-82', null, '1', '11122288844', '16', '2016-11-18 11:09:59', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999978', '64-79-91-83-82-64', null, '0', '13916906628', '16', '2016-11-18 11:10:31', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999979', '37-19-56-76-18-85', null, '0', '13916905597', '16', '2016-11-18 11:11:04', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999980', '16-76-94-82-35-75', null, '0', '18822233345', '16', '2016-11-18 11:11:35', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999981', '72-91-86-48-46-83', null, '1', '18922453322', '15', '2016-11-18 11:07:36', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999982', '13-46-79-82-93-71', null, '0', '11122233357', '12', '2016-11-18 11:13:24', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999983', '13-45-78-85-69-42', null, '0', '13722233345', '11', '2016-11-18 11:13:53', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999984', '74-85-96-14-25-33', null, '0', '11122233311', '11', '2016-11-18 11:14:19', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999985', '97-86-68-52-36-74', null, '0', '18922233358', '11', '2016-11-18 11:14:59', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999986', '25-75-86-45-96-85', null, '0', '13916905023', '11', '2016-11-18 11:15:28', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999987', '75-42-85-96-42-38', null, '1', '13916905592', '15', '2016-11-18 11:15:54', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999988', '42-78-85-96-42-63', null, '1', '13916905777', '11', '2016-11-18 11:16:19', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999989', '66-72-85-96-72-88', null, '1', '13916905558', '11', '2016-11-18 11:16:47', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999990', '00-11-22-33-44-55', null, '1', '13916905578', '12', '2016-11-18 10:21:44', '测试数据', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999991', '12-32-65-96-52-88', '1', '1', '19656879625', '13', '2016-11-17 11:52:23', '测试数据', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999992', '12-33-66-95-55-88', null, '0', '12345678999', '14', '2016-11-18 10:32:49', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999993', '22-66-99-55-88-45', null, '0', '11122233344', '12', '2016-11-18 11:02:56', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999995', '15-98-99-66-44-75', null, '1', '11122233345', '12', '2016-11-18 11:03:26', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999996', '14-36-78-99-44-56', null, '1', '13916905579', '14', '2016-11-18 11:04:04', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999997', '15-65-66-33-12-48', null, '1', '11122453345', '13', '2016-11-18 11:04:31', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999998', '33-78-89-42-75-89', null, '1', '13916905237', '13', '2016-11-18 11:05:33', 'test', null, null, null);
INSERT INTO `equip_mgr_m` VALUES ('19999999', '11-77-88-25-68-99', null, '1', '13322233333', '11', '2016-11-18 11:17:21', 'test', null, null, null);

-- ----------------------------
-- Table structure for equip_mgr_v
-- ----------------------------
DROP TABLE IF EXISTS `equip_mgr_v`;
CREATE TABLE `equip_mgr_v` (
  `id` int(11) NOT NULL DEFAULT '0' COMMENT '设备ID',
  `mac` varchar(20) DEFAULT NULL COMMENT 'MAC',
  `type` int(11) DEFAULT NULL COMMENT '设备类型',
  `status` int(11) DEFAULT NULL COMMENT '设备状态',
  `vehicleId` varchar(30) DEFAULT NULL COMMENT '车辆编号',
  `deptId` int(11) DEFAULT NULL COMMENT '部门编号',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '使用时间',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `back1` varchar(50) DEFAULT NULL,
  `back2` varchar(50) DEFAULT NULL,
  `back3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equip_mgr_v
-- ----------------------------

-- ----------------------------
-- Table structure for equip_server
-- ----------------------------
DROP TABLE IF EXISTS `equip_server`;
CREATE TABLE `equip_server` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '服务区ID',
  `name` varchar(30) DEFAULT NULL COMMENT '服务区名;可以是处或段或车间',
  `ip` varchar(20) DEFAULT NULL COMMENT '服务区地址',
  `port` int(11) DEFAULT NULL COMMENT '服务区端口',
  `deptIds` varchar(200) DEFAULT NULL COMMENT '部门编号集合',
  `status` int(11) DEFAULT NULL COMMENT '使用状态',
  `userId` varchar(20) DEFAULT NULL COMMENT '操作人',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '使用时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `back1` varchar(50) DEFAULT NULL,
  `back2` varchar(50) DEFAULT NULL,
  `back3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equip_server
-- ----------------------------
INSERT INTO `equip_server` VALUES ('1', 't1', '172.20.19.11', '8888', '12,13', '1', null, '2016-11-18 13:59:23', 'test', null, null, null);
INSERT INTO `equip_server` VALUES ('2', 't2', '172.20.19.15', '3456', '15', '1', null, '2016-11-18 15:18:37', 'test', null, null, null);

-- ----------------------------
-- Table structure for f_limit
-- ----------------------------
DROP TABLE IF EXISTS `f_limit`;
CREATE TABLE `f_limit` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `LIMIT_ID` varchar(20) DEFAULT NULL COMMENT '权限ID',
  `LIMIT_NAME` varchar(50) DEFAULT NULL COMMENT '权限名字',
  `LIMIT_DESC` varchar(150) DEFAULT NULL COMMENT '权限描述',
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  `RSV01` varchar(50) DEFAULT NULL,
  `RSV02` varchar(50) DEFAULT NULL,
  `RSV03` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of f_limit
-- ----------------------------

-- ----------------------------
-- Table structure for f_role
-- ----------------------------
DROP TABLE IF EXISTS `f_role`;
CREATE TABLE `f_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `ROLE_ID` varchar(20) DEFAULT NULL COMMENT '角色ID',
  `ROLE_NAME` varchar(50) DEFAULT NULL COMMENT '角色名字',
  `ROLE_DESC` varchar(150) DEFAULT NULL COMMENT '角色描述',
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  `RSV01` varchar(50) DEFAULT NULL,
  `RSV02` varchar(50) DEFAULT NULL,
  `RSV03` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of f_role
-- ----------------------------

-- ----------------------------
-- Table structure for f_role_limit
-- ----------------------------
DROP TABLE IF EXISTS `f_role_limit`;
CREATE TABLE `f_role_limit` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `RID` int(11) DEFAULT NULL COMMENT '角色序列号',
  `LID` int(11) DEFAULT NULL COMMENT '功能序列号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of f_role_limit
-- ----------------------------

-- ----------------------------
-- Table structure for f_user
-- ----------------------------
DROP TABLE IF EXISTS `f_user`;
CREATE TABLE `f_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `USER_ID` varchar(20) DEFAULT NULL COMMENT '用户ID;关联员工表员工ID',
  `PASSWORD` varchar(32) DEFAULT NULL COMMENT '用户密码',
  `CREATE_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注',
  `RSV01` varchar(50) DEFAULT NULL,
  `RSV02` varchar(50) DEFAULT NULL,
  `RSV03` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of f_user
-- ----------------------------
INSERT INTO `f_user` VALUES ('1', 'A0001', '666666', '2016-11-18 15:41:37', 'test', null, null, null);
INSERT INTO `f_user` VALUES ('2', 'H0001', '111111', '2016-11-18 17:09:31', 'Hisheil Test', null, null, null);

-- ----------------------------
-- Table structure for f_user_role
-- ----------------------------
DROP TABLE IF EXISTS `f_user_role`;
CREATE TABLE `f_user_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `UID` int(11) DEFAULT NULL COMMENT '用户序列号',
  `RID` int(11) DEFAULT NULL COMMENT '角色序列号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of f_user_role
-- ----------------------------

-- ----------------------------
-- Table structure for site_m
-- ----------------------------
DROP TABLE IF EXISTS `site_m`;
CREATE TABLE `site_m` (
  `id` int(11) DEFAULT NULL COMMENT '标识',
  `empId` varchar(20) DEFAULT NULL COMMENT '员工ID',
  `intension` int(11) DEFAULT NULL COMMENT '信号强度',
  `errorCode` int(11) DEFAULT NULL COMMENT '信号误码率',
  `temperature` int(11) DEFAULT NULL COMMENT '温度',
  `sendControl` int(11) DEFAULT NULL COMMENT '发送控制',
  `satellites` int(11) DEFAULT NULL COMMENT '可见卫星数量',
  `thresholdSatellites` int(11) DEFAULT NULL COMMENT '阙值卫星数量',
  `longitude` double DEFAULT NULL COMMENT 'GPS经度',
  `latitude` double DEFAULT NULL COMMENT 'GPS纬度',
  `rate` float DEFAULT NULL COMMENT 'GPS速率',
  `course` float DEFAULT NULL COMMENT 'GPS航向',
  `location_mode` float DEFAULT NULL COMMENT 'GPS定位模式',
  `status` int(11) DEFAULT NULL COMMENT 'GPS定位状态',
  `capTime` int(11) DEFAULT NULL COMMENT '采集时间',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `back1` varchar(50) DEFAULT NULL,
  `back2` varchar(50) DEFAULT NULL,
  `back3` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of site_m
-- ----------------------------

-- ----------------------------
-- Table structure for site_v
-- ----------------------------
DROP TABLE IF EXISTS `site_v`;
CREATE TABLE `site_v` (
  `id` int(11) DEFAULT NULL COMMENT '标识',
  `vehicleId` varchar(30) DEFAULT NULL COMMENT '车辆ID',
  `intension` int(11) DEFAULT NULL COMMENT '信号强度',
  `errorCode` int(11) DEFAULT NULL COMMENT '信号误码率',
  `temperature` int(11) DEFAULT NULL COMMENT '温度',
  `sendControl` int(11) DEFAULT NULL COMMENT '发送控制',
  `satellites` int(11) DEFAULT NULL COMMENT '可见卫星数量',
  `thresholdSatellites` int(11) DEFAULT NULL COMMENT '阙值卫星数量',
  `longitude` double DEFAULT NULL COMMENT 'GPS经度',
  `latitude` double DEFAULT NULL COMMENT 'GPS纬度',
  `rate` float DEFAULT NULL COMMENT 'GPS速率',
  `course` float DEFAULT NULL COMMENT 'GPS航向',
  `location_mode` float DEFAULT NULL COMMENT 'GPS定位模式',
  `status` int(11) DEFAULT NULL COMMENT 'GPS定位状态',
  `capTime` int(11) DEFAULT NULL COMMENT '采集时间',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `back1` varchar(50) DEFAULT NULL,
  `back2` varchar(50) DEFAULT NULL,
  `back3` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of site_v
-- ----------------------------

-- ----------------------------
-- Table structure for site_warn
-- ----------------------------
DROP TABLE IF EXISTS `site_warn`;
CREATE TABLE `site_warn` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `emId` varchar(20) DEFAULT NULL COMMENT '员工ID',
  `vehicleId` varchar(30) DEFAULT NULL COMMENT '车辆ID',
  `warnStatus` int(11) DEFAULT NULL COMMENT '警告状态',
  `warnTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '警告时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `back1` varchar(50) DEFAULT NULL,
  `back2` varchar(50) DEFAULT NULL,
  `back3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of site_warn
-- ----------------------------

-- ----------------------------
-- Table structure for task_assign
-- ----------------------------
DROP TABLE IF EXISTS `task_assign`;
CREATE TABLE `task_assign` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '任务ID',
  `sysType` int(11) DEFAULT NULL COMMENT '体系类型;1.工务系统；2.电务系统；3.动车系统；4.供电系统；5.安全科系统；6.监理部系统',
  `name` varchar(30) DEFAULT NULL COMMENT '任务名称',
  `type` int(11) DEFAULT NULL COMMENT '任务类别;1计划，2临时',
  `groupId` int(11) DEFAULT NULL COMMENT '任务集来源编号;关联task_group_*表；',
  `taskId` int(11) DEFAULT NULL COMMENT '任务来源编号;任务类型转置时，关联本表',
  `isGroup` int(11) DEFAULT NULL COMMENT '是否群体作业',
  `groupMember` varchar(150) DEFAULT NULL COMMENT '群体人员ID集合',
  `isTool` int(11) DEFAULT NULL COMMENT '是否携带工具',
  `toolMember` varchar(150) DEFAULT NULL COMMENT '工具ID集合',
  `assigner` int(11) DEFAULT NULL COMMENT '分配者ID;登陆用户或班长',
  `adtId` int(11) DEFAULT NULL COMMENT '分配者部门ID',
  `executor` int(11) DEFAULT NULL COMMENT '执行者ID;APP用户',
  `edtId` int(11) DEFAULT NULL COMMENT '执行者部门ID',
  `dateBegin` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '计划开始时间',
  `dateEnd` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '计划结束时间',
  `content` varchar(200) DEFAULT NULL COMMENT '任务内容;由分配者填写',
  `picNames` varchar(200) DEFAULT NULL COMMENT '图片名集合;由分配者填写',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `status` int(11) DEFAULT NULL COMMENT '任务状态;1分配中，2执行中，3争议中，4报检中，5已完成，6已解除，7已报备，8已转置，9中止中，10已中止',
  `back1` varchar(50) DEFAULT NULL,
  `back2` varchar(50) DEFAULT NULL,
  `back3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_assign
-- ----------------------------

-- ----------------------------
-- Table structure for task_deal
-- ----------------------------
DROP TABLE IF EXISTS `task_deal`;
CREATE TABLE `task_deal` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `sysType` int(11) DEFAULT NULL COMMENT '体系类型;1.工务系统；2.电务系统；3.动车系统；4.供电系统；5.安全科系统；6.监理部系统',
  `taskId` int(11) DEFAULT NULL COMMENT '任务ID',
  `requestStatus` int(11) DEFAULT NULL COMMENT '反馈的任务状态;2执行中，3争议中，4报检中，5已完成，10已中止',
  `requestor` int(11) DEFAULT NULL COMMENT '反馈人ID',
  `requestDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '实际开始时间或实际结束时间或提出异议时间或报检时间',
  `requestTxt` varchar(200) DEFAULT NULL COMMENT '反馈内容',
  `requestPic` varchar(200) DEFAULT NULL COMMENT '反馈图片名集合',
  `dealer` int(11) DEFAULT NULL COMMENT '处理人ID',
  `dealDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '处理异议时间或处理报检时间',
  `dealTxt` varchar(200) DEFAULT NULL COMMENT '处理意见',
  `dealPic` varchar(200) DEFAULT NULL COMMENT '处理图片名集合',
  `dealStatus` int(11) DEFAULT NULL COMMENT '处理后的任务状态;1分配中，2执行中，6已解除，7已报备，8已转置，9中止中',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `back1` varchar(50) DEFAULT NULL,
  `back2` varchar(50) DEFAULT NULL,
  `back3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_deal
-- ----------------------------

-- ----------------------------
-- Table structure for task_file
-- ----------------------------
DROP TABLE IF EXISTS `task_file`;
CREATE TABLE `task_file` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `sysType` int(11) DEFAULT NULL COMMENT '体系类型;1.工务系统；2.电务系统；3.动车系统；4.供电系统；5.安全科系统；6.监理部系统',
  `name` varchar(20) DEFAULT NULL COMMENT '名称;任务ID+类型+拍摄时间+经度+纬度+序号，如“133_1_20161110170509_121.43263733_31.19199979_0004”',
  `path` varchar(200) DEFAULT NULL COMMENT '路径',
  `type` int(11) DEFAULT NULL COMMENT '类型;1图片，2音频，3视频',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `back1` varchar(50) DEFAULT NULL,
  `back2` varchar(50) DEFAULT NULL,
  `back3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_file
-- ----------------------------

-- ----------------------------
-- Table structure for task_group
-- ----------------------------
DROP TABLE IF EXISTS `task_group`;
CREATE TABLE `task_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '任务ID',
  `sysType` int(11) DEFAULT NULL COMMENT '体系类型;1.工务系统；2.电务系统；3.动车系统；4.供电系统；5.安全科系统；6.监理部系统',
  `name` varchar(30) DEFAULT NULL COMMENT '任务名称',
  `type` int(11) DEFAULT NULL COMMENT '任务类别;1计划，2临时',
  `groupId` int(11) DEFAULT NULL COMMENT '任务集来源编号;关联本表；',
  `taskId` int(11) DEFAULT NULL COMMENT '任务来源编号;任务类型转置时，关联task_*表',
  `isGroup` int(11) DEFAULT NULL COMMENT '是否群体作业',
  `groupMember` varchar(150) DEFAULT NULL COMMENT '群体人员ID集合',
  `isTool` int(11) DEFAULT NULL COMMENT '是否携带工具',
  `toolMember` varchar(150) DEFAULT NULL COMMENT '工具ID集合',
  `assigner` int(11) DEFAULT NULL COMMENT '分配者ID;处或段登陆用户',
  `adtId` int(11) DEFAULT NULL COMMENT '分配者部门ID',
  `executor` int(11) DEFAULT NULL COMMENT '执行者ID;下级登陆用户',
  `edtId` int(11) DEFAULT NULL COMMENT '执行者部门ID',
  `dateBegin` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '计划开始时间',
  `dateEnd` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '计划结束时间',
  `content` varchar(200) DEFAULT NULL COMMENT '任务内容;由分配者填写',
  `picNames` varchar(200) DEFAULT NULL COMMENT '图片名集合;由分配者填写',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `status` int(11) DEFAULT NULL COMMENT '任务状态;1分配中，2已分配',
  `back1` varchar(50) DEFAULT NULL,
  `back2` varchar(50) DEFAULT NULL,
  `back3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_group
-- ----------------------------
SET FOREIGN_KEY_CHECKS=1;
