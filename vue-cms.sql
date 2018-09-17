/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : localhost:3306
 Source Schema         : vue-cms

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 17/09/2018 17:45:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `add_time` datetime(0) NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Id` int(255) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('junye', '2018-09-04 15:31:23', 'DSAAS AS', 1);
INSERT INTO `comment` VALUES ('SADAS ', '2018-09-26 15:31:36', 'DASDADAD', 1);
INSERT INTO `comment` VALUES ('XCVZV', '2018-09-21 15:32:06', 'XZCVXCV', 1);
INSERT INTO `comment` VALUES ('DSSADQEB', '2018-09-14 15:32:20', 'XZVFSAFSDF', 1);
INSERT INTO `comment` VALUES ('DSAFS', '2018-09-20 15:32:31', 'ASFDSAFAWEF', 1);
INSERT INTO `comment` VALUES ('SARER2', '2018-09-19 15:32:41', 'EWRSDV', 1);
INSERT INTO `comment` VALUES ('FSDAF', '2018-09-13 15:32:53', '', 1);
INSERT INTO `comment` VALUES ('SDAF', '2018-09-26 15:33:08', 'SAFAWFSAFD', 1);
INSERT INTO `comment` VALUES ('FSDFASF', '2018-09-19 15:33:17', 'BCVBFG', 1);
INSERT INTO `comment` VALUES ('FSDAFASF', '2018-09-21 15:33:25', 'WERSFVSDAG', 1);
INSERT INTO `comment` VALUES ('11', '2018-09-25 15:33:46', 'FASDFASFSAFS', 1);
INSERT INTO `comment` VALUES ('12', '2018-09-27 15:33:59', 'FSAFSFXCVVFD', 1);
INSERT INTO `comment` VALUES ('junye', '2018-09-04 15:31:23', '', 1);
INSERT INTO `comment` VALUES ('junye', '2018-09-04 15:31:23', 'DSAAS AS', 2);
INSERT INTO `comment` VALUES ('SADAS ', '2018-09-26 15:31:36', 'DASDADAD', 2);
INSERT INTO `comment` VALUES ('XCVZV', '2018-09-21 15:32:06', 'XZCVXCV', 2);
INSERT INTO `comment` VALUES ('DSSADQEB', '2018-09-14 15:32:20', 'XZVFSAFSDF', 2);
INSERT INTO `comment` VALUES ('DSAFS', '2018-09-20 15:32:31', 'ASFDSAFAWEF', 2);
INSERT INTO `comment` VALUES ('SARER2', '2018-09-19 15:32:41', 'EWRSDV', 2);
INSERT INTO `comment` VALUES ('FSDAF', '2018-09-13 15:32:53', '', 2);
INSERT INTO `comment` VALUES ('SDAF', '2018-09-26 15:33:08', 'SAFAWFSAFD', 2);
INSERT INTO `comment` VALUES ('FSDFASF', '2018-09-19 15:33:17', 'BCVBFG', 2);
INSERT INTO `comment` VALUES ('FSDAFASF', '2018-09-21 15:33:25', 'WERSFVSDAG', 2);
INSERT INTO `comment` VALUES ('11', '2018-09-25 15:33:46', 'FASDFASFSAFS', 2);
INSERT INTO `comment` VALUES ('12', '2018-09-27 15:33:59', 'FSAFSFXCVVFD', 2);
INSERT INTO `comment` VALUES ('junye', '2018-09-04 15:31:23', '', 2);

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` int(11) NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `add_time` datetime(6) NULL DEFAULT NULL,
  `zhaiyao` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `click` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sell_price` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `market_price` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stock_quantity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `goods_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (2, '大丰收', '2018-09-20 20:34:45.000000', '啥打法是否', '3', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '7777777777', '33990', '80', '是阿道夫', '2');
INSERT INTO `goods` VALUES (3, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (4, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (5, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (6, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (7, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (8, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (9, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (10, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (11, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (12, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (13, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (14, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (15, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (16, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (17, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (18, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (19, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (20, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');
INSERT INTO `goods` VALUES (21, '阿斯顿发顺丰', '2018-09-05 20:31:15.000000', '防守打法是否', '2', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1999', '2200', '80', '阿斯顿发生法撒旦法第三方', '1');

-- ----------------------------
-- Table structure for images
-- ----------------------------
DROP TABLE IF EXISTS `images`;
CREATE TABLE `images`  (
  `id` int(11) NOT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `zhaiyao` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `click` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cateid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `add_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of images
-- ----------------------------
INSERT INTO `images` VALUES (1, '发送到发放风高放火', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '爱对方答复大萨达阿萨德阿萨德阿达奥数大萨达萨达所大所多阿萨德奥术大师的阿萨德阿萨德撒自行车第三士大夫是', '2', '是打发士大夫士大夫撒旦法沙发撒旦法速度发顺丰速度富士达', '1', '2018-09-12 20:11:43');
INSERT INTO `images` VALUES (2, '打法是否对发的说法速度啊速度富士达范德萨sad发送', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '是否打算德萨范德萨法师打发第三方士大夫撒放沙发我去额地方萨芬是', '1', '士大夫速度发顺丰士大夫是大V胜多负少的', '1', '2018-09-20 20:11:48');
INSERT INTO `images` VALUES (3, '德萨鞍山市大奥数奥数', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '21312312312地方萨芬地方所得税富士达是11111111111111111111111111111111111111111111111111111111111111111111', '2', '阿法士大夫', '1', '2018-09-29 20:11:51');

-- ----------------------------
-- Table structure for img
-- ----------------------------
DROP TABLE IF EXISTS `img`;
CREATE TABLE `img`  (
  `src` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'vue-cms项目的轮播图地址',
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of img
-- ----------------------------
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');
INSERT INTO `img` VALUES ('http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2');

-- ----------------------------
-- Table structure for imgcategory
-- ----------------------------
DROP TABLE IF EXISTS `imgcategory`;
CREATE TABLE `imgcategory`  (
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of imgcategory
-- ----------------------------
INSERT INTO `imgcategory` VALUES ('家具生活', '1');
INSERT INTO `imgcategory` VALUES ('家具生活', '2');
INSERT INTO `imgcategory` VALUES ('摄影设计', '3');
INSERT INTO `imgcategory` VALUES ('摄影设计', '4');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` int(11) NOT NULL COMMENT '新闻id',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新闻的标题',
  `add_time` datetime(0) NOT NULL COMMENT '添加时间',
  `zhaiyao` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新闻的摘要\r\n',
  `img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片路径',
  `click` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '点击次数',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新闻内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (1, '留发顺丰', '2018-09-03 22:29:13', '刘强东被捕', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '1', '大叔大婶大所多');
INSERT INTO `news` VALUES (2, '哈哈哈', '2018-09-07 22:51:42', '达大厦', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2', '达大厦大所大所多');
INSERT INTO `news` VALUES (3, '哈哈哈', '2018-09-07 22:51:42', '达大厦', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2', '大萨达撒所');
INSERT INTO `news` VALUES (4, '哈哈哈', '2018-09-07 22:51:42', '达大厦', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2', '法发顺丰大市场支付水电费');
INSERT INTO `news` VALUES (5, '哈哈哈', '2018-09-07 22:51:42', '达大厦', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2', '是发送到发送到发斯蒂芬');
INSERT INTO `news` VALUES (6, '哈哈哈', '2018-09-07 22:51:42', '达大厦', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2', '范德萨发sea服务而分析称V型从是十大歌手根深蒂固');
INSERT INTO `news` VALUES (7, '哈哈哈', '2018-09-07 22:51:42', '达大厦', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2', '分公司发送发送到发送到感受到法国各方');
INSERT INTO `news` VALUES (8, '哈哈哈', '2018-09-07 22:51:42', '达大厦', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2', '噶十分高大上发的42他如何规定符合人体任意');
INSERT INTO `news` VALUES (9, '哈哈哈', '2018-09-07 22:51:42', '达大厦', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2', '进房间风格经济体已经符合国家法规华润既然已经覆盖和法规及人员九月份就法规及');
INSERT INTO `news` VALUES (10, '哈哈哈', '2018-09-07 22:51:42', '达大厦', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg', '2', NULL);

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ctime` datetime(6) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for shopcar
-- ----------------------------
DROP TABLE IF EXISTS `shopcar`;
CREATE TABLE `shopcar`  (
  `cou` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `id` int(11) NOT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sell_price` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `thumb_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of shopcar
-- ----------------------------
INSERT INTO `shopcar` VALUES ('2', 1, '大萨达', '大萨达', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg');
INSERT INTO `shopcar` VALUES ('1', 2, '市场的飞洒的', '士大夫', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg');
INSERT INTO `shopcar` VALUES ('3', 3, '市场的飞洒的', '士大夫', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg');
INSERT INTO `shopcar` VALUES ('3', 4, '市场的飞洒的', '士大夫', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg');
INSERT INTO `shopcar` VALUES ('3', 5, '市场的飞洒的', '士大夫', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg');
INSERT INTO `shopcar` VALUES ('3', 6, '市场的飞洒的', '士大夫', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg');
INSERT INTO `shopcar` VALUES ('3', 7, '市场的飞洒的', '士大夫', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg');
INSERT INTO `shopcar` VALUES ('3', 8, '市场的飞洒的', '士大夫', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg');
INSERT INTO `shopcar` VALUES ('3', 9, '市场的飞洒的', '士大夫', 'http://bpic.588ku.com/back_pic/05/64/16/725b62c3c589882.jpg');

SET FOREIGN_KEY_CHECKS = 1;
