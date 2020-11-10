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
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurant` (
                              `id` bigint(20) NOT NULL AUTO_INCREMENT,
                              `image` varchar(255) DEFAULT NULL,
                              `title` varchar(255) DEFAULT NULL,
                              `description` varchar(255) DEFAULT NULL,
                              PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (1,'https://pancook.fr/wp-content/uploads/2018/05/pancook-lille.jpg','PANCOOK Lille','Cadre contemporain tamisé, mets traditionnels soignés et spécialité de pancook (pain fourré au poulet).');
INSERT INTO `restaurant` VALUES (2,'https://ugc.zenchef.com/3/4/3/5/0/3/9/6/4/2/1416562423_153/48db3abb4e64d9c25cfc93be038128f0.clandscape_hd.jpg','Chiba','Ce restaurant japonais au cadre traditionnel sert des menus, des formules à volonté et des plats à emporter.');
INSERT INTO `restaurant` VALUES (3,'https://media.lyon-france.com/1280x993/205511/675641.jpg','Les Terrasses de Lyon','Gastronomie fine et vue panoramique sur la ville pour le chic restaurant de l''hôtel la Villa Florentine.');
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
                            `id` bigint(20) NOT NULL,
                            `city` varchar(255) DEFAULT NULL,
                            `country` varchar(255) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,'Lille','France'),(2,'Lyon','France');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;



--
-- Table structure for table `restaurant_location`
--

DROP TABLE IF EXISTS `restaurant_location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurant_location` (
                                       `idrestaurant` bigint(20) NOT NULL,
                                       `idlocation` bigint(20) NOT NULL,
                                       KEY (`idrestaurant`),
                                       KEY (`idlocation`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant_location`
--

LOCK TABLES `restaurant_location` WRITE;
/*!40000 ALTER TABLE `restaurant_location` DISABLE KEYS */;
INSERT INTO `restaurant_location` VALUES (1,1),(2,1),(3,2);
/*!40000 ALTER TABLE `restaurant_location` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `review` (
                        `id` bigint(20) NOT NULL,
                        `score` int(11) NOT NULL,
                        `comment` varchar(255) DEFAULT NULL,
                        `dateOfReview` datetime DEFAULT NULL,
                        `restaurant_id` bigint(20) DEFAULT NULL,
                        PRIMARY KEY (`id`),
                        KEY (`restaurant_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,4,'Génial !','2020-10-06 18:38:48', 2);
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (358),(358),(358);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;



--
-- Dumping events for database 'yheilp'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

