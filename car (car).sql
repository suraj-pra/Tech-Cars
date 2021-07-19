-- MySQL dump 10.13  Distrib 5.1.33, for Win32 (ia32)
--
-- Host: localhost    Database: car
-- ------------------------------------------------------
-- Server version	5.1.33-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `adminid` varchar(20) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('umang@gmail.com','upjaipur');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `design`
--

DROP TABLE IF EXISTS `design`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `design` (
  `u_id` varchar(50) DEFAULT NULL,
  `car` varchar(50) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `design`
--

LOCK TABLES `design` WRITE;
/*!40000 ALTER TABLE `design` DISABLE KEYS */;
/*!40000 ALTER TABLE `design` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `frontview`
--

DROP TABLE IF EXISTS `frontview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `frontview` (
  `s_no` int(4) DEFAULT NULL,
  `part` varchar(20) DEFAULT NULL,
  `subpart` varchar(20) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frontview`
--

LOCK TABLES `frontview` WRITE;
/*!40000 ALTER TABLE `frontview` DISABLE KEYS */;
INSERT INTO `frontview` VALUES (1,'VEHICLE_COLOUR','CRYSTAL_RED','300.00'),(2,'VEHICLE_COLOUR','CRUSH','350.00'),(3,'VEHICLE_COLOUR','SILVER_ICE','400.00'),(4,'VEHICLE_COLOUR','BILLET_BLUE','400.00'),(5,'VEHICLE_COLOUR','BROWNSTONE_METALLIC','400.00'),(6,'VEHICLE_COLOUR','RALLY_YELLOW','300.00'),(7,'BODY_ARMOR','BUSHWACKER','1400.00'),(8,'BODY_ARMOR','DV8_OFFROAD','1450.00'),(9,'BODY_ARMOR','NEMISIS','1350.00'),(10,'BODY_ARMOR','POISION_SPIDER','1500.00'),(11,'BODY_ARMOR','TERAFLEX','1450.00'),(12,'HOOD_PROTECTION','HOOD_SHIELD','1550.00'),(13,'HOOD_PROTECTION','AEROSKIN-CHROME','1650.00'),(14,'HOOD_PROTECTION','AEROSKIN-SMOKE','1600.00'),(15,'HOOD_PROTECTION','BUGFLECTOR_I','1610.00'),(16,'HOOD_PROTECTION','BUGFLECTOR_II','1650.00'),(17,'BUMPERS','HCR_RACING','1710.00'),(18,'BUMPERS','BESTOP','1750.00'),(19,'BUMPERS','JCR_OFFROAD','1700.00'),(20,'BUMPERS','FAB_LIFESTYLE','1790.00'),(21,'BUMPERS','MOPAR','1690.00');
/*!40000 ALTER TABLE `frontview` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interior`
--

DROP TABLE IF EXISTS `interior`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `interior` (
  `s_no` int(4) DEFAULT NULL,
  `part` varchar(20) DEFAULT NULL,
  `subpart` varchar(20) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interior`
--

LOCK TABLES `interior` WRITE;
/*!40000 ALTER TABLE `interior` DISABLE KEYS */;
INSERT INTO `interior` VALUES (1,'CARGO','BASEPLATE','1200.50'),(2,'CARGO','SLIDE','1250.50'),(3,'CARGO','SURROUND','1350.50'),(4,'CARGO','FREEZER_FRIDGE','1300.50'),(5,'FLOOR_LINERS','BLACK_CARPET','1500.00'),(6,'FLOOR_LINERS','GREY_CARPET','1550.00'),(7,'FLOOR_LINERS','GREY_VINYL','1650.00'),(8,'FLOOR_LINERS','BLACK_VINYL','1600.00'),(9,'FLOOR_LINERS','TAN_VINYL','1500.00'),(10,'STORAGE','BESTOP','1550.00'),(11,'STORAGE','MOPAR','1650.00'),(12,'STORAGE','SMITTY_BILT','1600.00'),(13,'STORAGE','TUFFY_SECURITY','1690.00');
/*!40000 ALTER TABLE `interior` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `performance`
--

DROP TABLE IF EXISTS `performance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `performance` (
  `name` varchar(30) DEFAULT NULL,
  `value` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `performance`
--

LOCK TABLES `performance` WRITE;
/*!40000 ALTER TABLE `performance` DISABLE KEYS */;
INSERT INTO `performance` VALUES ('exhaust',100),('intake filter',100),('oil filter',100);
/*!40000 ALTER TABLE `performance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usercart`
--

DROP TABLE IF EXISTS `usercart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usercart` (
  `u_id` varchar(50) NOT NULL,
  `partsel` varchar(20) DEFAULT NULL,
  `subpartsel` varchar(20) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usercart`
--

LOCK TABLES `usercart` WRITE;
/*!40000 ALTER TABLE `usercart` DISABLE KEYS */;
/*!40000 ALTER TABLE `usercart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wheels`
--

DROP TABLE IF EXISTS `wheels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wheels` (
  `type` varchar(7) DEFAULT NULL,
  `value` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wheels`
--

LOCK TABLES `wheels` WRITE;
/*!40000 ALTER TABLE `wheels` DISABLE KEYS */;
INSERT INTO `wheels` VALUES ('wheel',20),('tires',20);
/*!40000 ALTER TABLE `wheels` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-29  8:38:07
