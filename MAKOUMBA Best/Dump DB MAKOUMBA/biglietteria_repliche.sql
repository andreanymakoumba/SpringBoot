-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: biglietteria
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `repliche`
--

DROP TABLE IF EXISTS `repliche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `repliche` (
  `cod_replica` varchar(255) NOT NULL,
  `data_replica` date DEFAULT NULL,
  `cod_spettacolo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cod_replica`),
  KEY `FK8exk5i6dd4ownkpbyv5xw1tsj` (`cod_spettacolo`),
  CONSTRAINT `FK8exk5i6dd4ownkpbyv5xw1tsj` FOREIGN KEY (`cod_spettacolo`) REFERENCES `spettacoli` (`cod_spettacolo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repliche`
--

LOCK TABLES `repliche` WRITE;
/*!40000 ALTER TABLE `repliche` DISABLE KEYS */;
INSERT INTO `repliche` VALUES ('R001','2018-10-05','S001'),('R002','2018-10-06','S001'),('R003','2018-10-07','S001'),('R004','2018-10-08','S001'),('R005','2018-10-09','S001'),('R006','2018-11-12','S002'),('R007','2018-11-13','S002'),('R008','2018-11-14','S002'),('R009','2018-11-15','S002'),('R010','2018-11-16','S002'),('R011','2019-01-05','S003'),('R012','2019-01-06','S003'),('R013','2019-01-07','S003'),('R014','2019-01-08','S003'),('R015','2019-01-09','S003'),('R016','2019-01-12','S004'),('R017','2019-01-13','S004'),('R018','2019-01-14','S004'),('R019','2019-01-15','S004'),('R020','2019-01-16','S004'),('R021','2018-11-05','S005'),('R022','2018-11-06','S005'),('R023','2018-11-07','S005'),('R024','2018-11-18','S005'),('R025','2018-11-19','S005'),('R026','2018-12-12','S006'),('R027','2018-12-13','S006'),('R028','2018-12-14','S006'),('R029','2018-12-15','S006'),('R030','2018-12-16','S006');
/*!40000 ALTER TABLE `repliche` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-01 13:24:17
