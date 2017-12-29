/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-12-29 16:32:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mp_module
-- ----------------------------
CREATE TABLE `mp_module` (
`mid`  int(11) NOT NULL AUTO_INCREMENT ,
`mname`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`mid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=5

;

-- ----------------------------
-- Records of mp_module
-- ----------------------------
INSERT INTO `mp_module` VALUES ('1', 'add');
INSERT INTO `mp_module` VALUES ('2', 'delete');
INSERT INTO `mp_module` VALUES ('3', 'query');
INSERT INTO `mp_module` VALUES ('4', 'update');

-- ----------------------------
-- Table structure for mp_module_role
-- ----------------------------
CREATE TABLE `mp_module_role` (
`rid`  int(11) NULL DEFAULT NULL ,
`mid`  int(11) NULL DEFAULT NULL 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Records of mp_module_role
-- ----------------------------
INSERT INTO `mp_module_role` VALUES ('1', '1');
INSERT INTO `mp_module_role` VALUES ('1', '2');
INSERT INTO `mp_module_role` VALUES ('1', '3');
INSERT INTO `mp_module_role` VALUES ('1', '4');
INSERT INTO `mp_module_role` VALUES ('2', '1');
INSERT INTO `mp_module_role` VALUES ('2', '3');

-- ----------------------------
-- Table structure for mp_role
-- ----------------------------
CREATE TABLE `mp_role` (
`rid`  int(11) NOT NULL AUTO_INCREMENT ,
`rname`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`rid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=3

;

-- ----------------------------
-- Records of mp_role
-- ----------------------------
INSERT INTO `mp_role` VALUES ('1', 'admin');
INSERT INTO `mp_role` VALUES ('2', 'customer');

-- ----------------------------
-- Table structure for mp_user
-- ----------------------------
CREATE TABLE `mp_user` (
`uid`  int(11) NOT NULL AUTO_INCREMENT ,
`username`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`password`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`uid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=3

;

-- ----------------------------
-- Records of mp_user
-- ----------------------------
INSERT INTO `mp_user` VALUES ('1', 'admin', '123');
INSERT INTO `mp_user` VALUES ('2', 'wyf', '123');

-- ----------------------------
-- Table structure for mp_user_role
-- ----------------------------
CREATE TABLE `mp_user_role` (
`uid`  int(11) NULL DEFAULT NULL ,
`rid`  int(11) NULL DEFAULT NULL 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Records of mp_user_role
-- ----------------------------
INSERT INTO `mp_user_role` VALUES ('1', '1');
INSERT INTO `mp_user_role` VALUES ('2', '2');

-- ----------------------------
-- Table structure for schoole
-- ----------------------------
CREATE TABLE `schoole` (
`ID`  bigint(12) NOT NULL AUTO_INCREMENT ,
`NAME`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`AGE`  int(11) NULL DEFAULT NULL ,
`SCORE`  int(10) NULL DEFAULT NULL ,
PRIMARY KEY (`ID`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=14789712

;

-- ----------------------------
-- Records of schoole
-- ----------------------------
INSERT INTO `schoole` VALUES ('14789633', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789634', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789635', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789636', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789637', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789638', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789639', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789640', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789641', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789642', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789643', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789644', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789645', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789646', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789647', '王二小', '10', '98');
INSERT INTO `schoole` VALUES ('14789648', '/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789649', '/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789650', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789651', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789652', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789653', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789654', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789655', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789656', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789657', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789658', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789659', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789660', '/WEB-INF/decorators/index.jsp', '10', '98');
INSERT INTO `schoole` VALUES ('14789661', '王延斐', '10', '98');
INSERT INTO `schoole` VALUES ('14789662', '王延斐a', '10', '98');
INSERT INTO `schoole` VALUES ('14789663', '王延斐a', '10', '98');
INSERT INTO `schoole` VALUES ('14789664', '王延斐a', '10', '98');
INSERT INTO `schoole` VALUES ('14789665', '王延斐b2', '10', '98');
INSERT INTO `schoole` VALUES ('14789666', '王延斐b2', '10', '98');
INSERT INTO `schoole` VALUES ('14789667', '王延斐b2', '10', '98');
INSERT INTO `schoole` VALUES ('14789668', '王延斐b2', '10', '98');
INSERT INTO `schoole` VALUES ('14789669', '王延斐b2', '10', '98');
INSERT INTO `schoole` VALUES ('14789670', '王延斐b2', '10', '98');
INSERT INTO `schoole` VALUES ('14789671', '王延斐b2', '10', '98');
INSERT INTO `schoole` VALUES ('14789672', '王延斐b1', '10', '98');
INSERT INTO `schoole` VALUES ('14789673', '王延斐b2', '10', '98');
INSERT INTO `schoole` VALUES ('14789674', '王延斐b2', '10', '98');
INSERT INTO `schoole` VALUES ('14789675', '王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789676', '王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789677', '啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789678', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789679', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789680', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789681', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789682', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789683', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789684', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789685', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789686', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789687', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789688', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789689', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789690', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789691', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789692', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789693', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789694', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789695', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789696', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789697', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789698', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789699', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789700', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789701', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789702', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789703', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789704', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789705', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789706', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789707', '腌吖啊啊啊王延斐b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789708', '古古怪怪王延斐b5', '10', '98');
INSERT INTO `schoole` VALUES ('14789709', '腌吖啊啊啊b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789710', '腌吖啊啊啊b4', '10', '98');
INSERT INTO `schoole` VALUES ('14789711', '古古怪怪b5', '10', '98');

-- ----------------------------
-- Auto increment value for mp_module
-- ----------------------------
ALTER TABLE `mp_module` AUTO_INCREMENT=5;

-- ----------------------------
-- Auto increment value for mp_role
-- ----------------------------
ALTER TABLE `mp_role` AUTO_INCREMENT=3;

-- ----------------------------
-- Auto increment value for mp_user
-- ----------------------------
ALTER TABLE `mp_user` AUTO_INCREMENT=3;

-- ----------------------------
-- Auto increment value for schoole
-- ----------------------------
ALTER TABLE `schoole` AUTO_INCREMENT=14789712;
