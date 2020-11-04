CREATE DATABASE  IF NOT EXISTS `yheilp` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `yheilp`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: yheilp
-- ------------------------------------------------------
-- Server version	5.6.20

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
-- Table structure for table `lieux`
--

DROP TABLE IF EXISTS `lieux`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lieux` (
  `idlieux` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idlieux`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lieux`
--

LOCK TABLES `lieux` WRITE;
/*!40000 ALTER TABLE `lieux` DISABLE KEYS */;
INSERT INTO `lieux` VALUES (58,'Lille','France','Wow'),(59,'Lyon','France','Double Wow');
/*!40000 ALTER TABLE `lieux` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurant` (
  `idrestaurant` bigint(20) NOT NULL,
  `idlieux` bigint(20) NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idrestaurant`),
  FOREIGN KEY (`idlieux`) REFERENCES lieux(`idlieux`) ON DELETE CASCADE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (165,58,'https://pancook.fr/wp-content/uploads/2018/05/pancook-lille.jpg','PANCOOK Lille','Cadre contemporain tamisé, mets traditionnels soignés et spécialité de pancook (pain fourré au poulet).');
INSERT INTO `restaurant` VALUES (166,58,'https://ugc.zenchef.com/3/4/3/5/0/3/9/6/4/2/1416562423_153/48db3abb4e64d9c25cfc93be038128f0.clandscape_hd.jpg','Chiba','Ce restaurant japonais au cadre traditionnel sert des menus, des formules à volonté et des plats à emporter.');
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `note`
--

DROP TABLE IF EXISTS `note`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `note` (
  `idnote` bigint(20) NOT NULL,
  `idrestaurant` bigint(20) NOT NULL,
  /*`dateOfReview` datetime DEFAULT NULL,*/
  `score` int(11) NOT NULL,
  PRIMARY KEY (`idnote`),
  FOREIGN KEY (`idrestaurant`) REFERENCES restaurant(`idrestaurant`) ON DELETE CASCADE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `note`
--

LOCK TABLES `note` WRITE;
/*!40000 ALTER TABLE `note` DISABLE KEYS */;
INSERT INTO `note` VALUES (245,165,4);
/*!40000 ALTER TABLE `note` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commentaire`
--

DROP TABLE IF EXISTS `commentaire`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `commentaire` (
  `idcommentaire` bigint(20) NOT NULL,
  `idrestaurant` bigint(20) NOT NULL,
  /*`dateOfReview` datetime DEFAULT NULL,*/
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idcommentaire`),
  FOREIGN KEY (`idrestaurant`) REFERENCES restaurant(`idrestaurant`) ON DELETE CASCADE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commentaire`
--

LOCK TABLES `commentaire` WRITE;
/*!40000 ALTER TABLE `commentaire` DISABLE KEYS */;
INSERT INTO `commentaire` VALUES (34,165,'Quel bel endroit, je recommande !');
/*!40000 ALTER TABLE `commentaire` ENABLE KEYS */;
UNLOCK TABLES;