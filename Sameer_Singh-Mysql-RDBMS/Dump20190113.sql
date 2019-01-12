CREATE DATABASE  IF NOT EXISTS `taxi_now` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `taxi_now`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: taxi_now
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bill` (
  `bill_id` int(11) NOT NULL,
  `payment_date` date DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  `cust_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`bill_id`),
  KEY `cust_id` (`cust_id`),
  CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (66,'1996-12-02',56.02,1),(67,'1996-12-01',56.02,2),(68,'1996-12-01',56.02,3),(69,'1996-12-01',56.02,4),(70,'1996-12-01',56.02,5);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cab`
--

DROP TABLE IF EXISTS `cab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cab` (
  `booking_id` int(11) NOT NULL,
  `cab_no` int(11) DEFAULT NULL,
  `drop_location` varchar(20) DEFAULT NULL,
  `pickup` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`booking_id`),
  KEY `Cab` (`cab_no`),
  CONSTRAINT `Cab` FOREIGN KEY (`cab_no`) REFERENCES `cab_details` (`cab_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cab`
--

LOCK TABLES `cab` WRITE;
/*!40000 ALTER TABLE `cab` DISABLE KEYS */;
INSERT INTO `cab` VALUES (68,43,'gjgj','gjhgjh'),(69,43,'gjgj','gjhgjh'),(70,45,'gjgj','gjhgjh'),(71,44,'gjgj','gjhgjh');
/*!40000 ALTER TABLE `cab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cab_details`
--

DROP TABLE IF EXISTS `cab_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cab_details` (
  `cab_no` int(11) NOT NULL,
  `Model` varchar(10) DEFAULT NULL,
  `Model_Type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cab_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cab_details`
--

LOCK TABLES `cab_details` WRITE;
/*!40000 ALTER TABLE `cab_details` DISABLE KEYS */;
INSERT INTO `cab_details` VALUES (43,'ggj','fdfs'),(44,'ggj','fdfs'),(45,'ggj','fdfs'),(46,'ggj','fdfs');
/*!40000 ALTER TABLE `cab_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `customer` (
  `cust_id` int(11) NOT NULL,
  `Nam` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `ph_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'ram','ram12@gmail.com','rajaji nagar',9775674),(2,'shyam','shyam12@gmail.com','rajaji nagar',97757984),(3,'rat','rat12@gmail.com','rajaji nagar',977578674),(4,'sam','sam12@gmail.com','rajaji nagar',977566674),(5,'yam','shyam12@gmail.com','rajaji nagar',97757984),(6,'roshan','ros12@gmail.com','rajaji nagar',977578674),(8,'amar','amar12@gmail.com','rajaji nagar',97786674);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `driver` (
  `driver_name` varchar(15) DEFAULT NULL,
  `driver_id` int(11) NOT NULL,
  `address` varchar(20) DEFAULT NULL,
  `phone_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`driver_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
INSERT INTO `driver` VALUES ('manjunath',234,'yfhfjy',8990),('manjunath',235,'yfhfjy',8990),('man',236,'yfhfj6ry',8990),('nath',237,'yfhfjy',8990),('manju',238,'yfhfjy',8990);
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-13  0:21:34
