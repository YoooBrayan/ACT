-- MySQL dump 10.13  Distrib 5.7.18, for Win64 (x86_64)
--
-- Host: localhost    Database: act
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrador` (
  `Administrador_Id` int(11) NOT NULL,
  `Administrador_Nombre` varchar(40) NOT NULL,
  `Administrador_Usuario` int(11) NOT NULL DEFAULT '1',
  `administrador_clave` varchar(45) NOT NULL,
  `Administrador_Correo` varchar(50) NOT NULL,
  PRIMARY KEY (`Administrador_Id`),
  KEY `Administrador_Usuario` (`Administrador_Usuario`),
  CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`Administrador_Usuario`) REFERENCES `usuario` (`Usuario_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (280795,'Jessica',1,'40bd001563085fc35165329ea1ff5c5ecbdbbeef','admin@gmail.com');
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `color`
--

DROP TABLE IF EXISTS `color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `color` (
  `Color_Id` int(11) NOT NULL,
  `Color_Nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`Color_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color`
--

LOCK TABLES `color` WRITE;
/*!40000 ALTER TABLE `color` DISABLE KEYS */;
INSERT INTO `color` VALUES (1,'Azul'),(2,'Negro'),(3,'Rojo'),(4,'Vinotinto'),(5,'Blanco'),(6,'Rosado'),(7,'Marfil'),(8,'Verde'),(9,'Fucsia'),(10,'Amarillo');
/*!40000 ALTER TABLE `color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `corte`
--

DROP TABLE IF EXISTS `corte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `corte` (
  `Corte_Id` int(11) NOT NULL,
  `Corte_Fecha_Envio` date NOT NULL,
  `Corte_Fecha_Entrega` date NOT NULL,
  `Corte_Observacion_Prov` varchar(100) DEFAULT NULL,
  `Corte_Representante` int(11) NOT NULL,
  `Corte_Modelo` int(11) NOT NULL,
  PRIMARY KEY (`Corte_Id`),
  KEY `Corte_Representante` (`Corte_Representante`),
  KEY `Corte_Modelo` (`Corte_Modelo`),
  CONSTRAINT `corte_ibfk_1` FOREIGN KEY (`Corte_Representante`) REFERENCES `representante` (`Representante_Id`),
  CONSTRAINT `corte_ibfk_2` FOREIGN KEY (`Corte_Modelo`) REFERENCES `modelo` (`Modelo_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corte`
--

LOCK TABLES `corte` WRITE;
/*!40000 ALTER TABLE `corte` DISABLE KEYS */;
INSERT INTO `corte` VALUES (152,'2019-05-07','2019-05-11','',1,3),(153,'2019-05-26','2019-05-29','',1,22),(154,'2019-05-26','2019-05-29','',1,11),(155,'2019-05-26','2019-05-29','',1,21),(156,'2019-05-26','2019-05-01','',1,22),(157,'2019-06-02','2019-01-01','',1,13),(158,'2019-06-02','2019-01-01','',1,10),(159,'2019-01-01','2019-01-01','',1,18),(160,'2019-05-31','2019-06-07','',1,19),(162,'2019-05-31','2019-06-07','',1,12),(163,'2019-05-31','2019-06-07','',1,23),(164,'2019-05-01','2019-06-01','',1,20),(165,'2019-06-16','2019-06-16','',1,3),(166,'2019-06-10','2019-06-16','',1,2),(167,'2019-06-10','2019-06-16','',1,24),(168,'2019-06-18','2019-06-21','',1,2),(169,'2019-06-18','2019-06-21','',1,13),(170,'2019-06-18','2019-06-21','',1,3),(171,'2019-06-24','2019-07-01','',1,24),(172,'2019-06-24','2019-07-01','',1,3),(173,'2019-07-01','2019-07-08','',1,19),(174,'2019-07-01','2019-07-08','',1,8),(175,'2019-07-08','2019-07-15','',1,13),(176,'2019-07-08','2019-07-15','',1,12),(178,'2019-07-01','2019-07-01','',1,23),(179,'2019-07-01','2019-07-01','',1,20),(180,'2019-07-16','2019-07-22','',1,10),(181,'2019-07-16','2019-07-22','',1,14),(182,'2019-07-16','2019-07-22','',1,13),(183,'2019-07-23','2019-07-29','',1,12),(184,'2019-07-23','2019-07-29','',1,20),(185,'2019-07-30','2019-08-05','',1,3),(186,'2019-07-30','2019-08-05','',1,6),(187,'2019-07-30','2019-08-05','',1,13),(188,'2019-08-06','2019-08-12','',1,4),(189,'2019-08-06','2019-08-12','',1,10),(190,'2019-08-09','2019-08-10','',1,1),(191,'2019-08-09','2019-08-23','',1,1),(192,'2019-08-12','2019-08-20','',1,13),(193,'2019-08-12','2019-08-20','',1,20),(194,'2019-08-12','2019-08-20','',1,11),(195,'2019-08-19','2019-08-26','',1,3),(196,'2019-08-19','2019-08-26','',1,12),(197,'2019-09-02','2019-09-09','',1,6),(198,'2019-09-02','2019-09-09','',1,20),(199,'2019-09-09','2019-09-23','',1,25),(200,'2019-09-09','2019-09-23','',1,12),(201,'2019-09-09','2019-09-23','',1,3),(202,'2019-09-16','2019-09-23','',1,3),(203,'2019-09-16','2019-09-23','',1,24),(204,'2019-09-16','2019-09-23','',1,26),(205,'2019-09-16','2019-09-23','',1,27),(206,'2019-09-23','2019-09-30','',1,2),(207,'2019-09-23','2019-09-30','',1,13),(208,'2019-09-23','2019-09-30','',1,11),(209,'2019-09-23','2019-09-30','',1,12),(210,'2019-09-23','2019-09-30','',1,19),(211,'2019-09-23','2019-09-30','',1,28),(212,'2019-10-01','2019-10-07','',1,11),(213,'2019-10-01','2019-10-07','',1,6),(214,'2019-10-01','2019-10-07','',1,28),(215,'2019-10-01','2019-10-07','',1,20),(216,'2019-10-09','2019-10-15','',1,3),(217,'2019-10-09','2019-10-15','',1,13),(218,'2019-10-09','2019-10-15','',1,24),(219,'2019-10-09','2019-10-15','',1,26),(220,'2019-10-15','2019-10-22','',1,10),(221,'2019-10-15','2019-10-22','',1,13),(222,'2019-10-15','2019-10-22','',1,4),(223,'2019-10-15','2019-10-22','',1,28),(224,'2019-10-22','2019-10-28','',1,3),(225,'2019-10-22','2019-10-28','',1,11),(226,'2019-10-22','2019-10-28','',1,12),(227,'2019-10-22','2019-10-28','',1,16),(228,'2019-10-22','2019-10-28','',1,19),(229,'2019-10-22','2019-10-28','',1,23),(230,'2019-10-29','2019-11-04','',1,27),(231,'2019-10-29','2019-11-04','',1,28),(232,'2019-10-29','2019-11-04','',1,12),(233,'2019-10-29','2019-11-04','',1,16),(234,'2019-10-29','2019-11-04','',1,25),(235,'2019-11-05','2019-11-12','',1,3),(236,'2019-11-05','2019-11-12','',1,19),(237,'2019-11-05','2019-11-12','',1,13),(238,'2019-11-05','2019-11-12','',1,29),(239,'2019-11-12','2019-11-19','',1,6),(240,'2019-11-12','2019-11-19','',1,12),(241,'2019-11-12','2019-11-19','',1,18),(242,'2019-11-12','2019-11-19','',1,20),(243,'2019-11-19','2019-11-25','',1,6),(244,'2019-11-19','2019-11-25','',1,12),(245,'2019-11-19','2019-11-25','',1,24),(246,'2019-11-19','2019-11-25','',1,27),(247,'2019-11-19','2019-11-25','',1,28),(248,'2019-11-26','2019-12-02','',1,28),(249,'2019-11-26','2019-12-02','',1,29),(250,'2019-11-26','2019-12-02','',1,12),(251,'2019-11-26','2019-12-02','',1,20),(252,'2019-11-26','2019-12-02','',1,3),(253,'2019-12-02','2019-12-09','',1,10),(254,'2019-12-02','2019-12-09','',1,19),(255,'2019-12-02','2019-12-09','',1,4),(256,'2019-12-02','2019-12-09','',1,13),(257,'2019-12-02','2019-12-09','',1,22),(258,'2019-12-02','2019-12-09','',1,27),(259,'2019-12-09','2019-12-16','',1,3),(260,'2019-12-09','2019-12-16','',1,6),(261,'2019-12-09','2019-12-16','',1,12),(262,'2019-12-09','2019-12-16','',1,28),(263,'2019-12-09','2019-12-16','',1,27),(264,'2019-12-09','2019-12-16','',1,20),(265,'2019-12-14','2019-12-23','',1,3),(266,'2019-12-14','2019-12-23','',1,12),(267,'2019-12-14','2019-12-23','',1,19),(268,'2019-12-14','2019-12-23','',1,28),(269,'2019-12-14','2019-12-23','',1,27),(270,'2019-12-20','2019-12-27','',1,3),(271,'2020-01-20','2020-01-27','',1,6),(272,'2020-01-20','2020-01-27','',1,12),(273,'2020-01-20','2020-01-27','',1,13),(274,'2020-01-27','2020-02-03','',1,20),(275,'2020-01-27','2020-02-03','',1,13),(276,'2020-01-27','2020-02-03','',1,30),(277,'2020-02-03','2020-02-10','',1,31),(278,'2020-02-03','2020-02-10','',1,11),(279,'2020-02-03','2020-02-10','',1,19),(280,'2020-02-03','2020-02-10','',1,24),(281,'2020-02-10','2020-02-17','',1,3),(282,'2020-02-10','2020-02-17','',1,11),(284,'2020-02-10','2020-02-17','',1,25),(285,'2020-02-10','2020-02-17','',1,29),(286,'2020-02-10','2020-02-17','',1,28),(287,'2020-02-17','2020-02-24','',1,4),(288,'2020-02-17','2020-02-24','',1,10),(289,'2020-02-17','2020-02-24','',1,19),(290,'2020-02-17','2020-02-24','',1,22),(291,'2020-02-24','2020-03-01','',1,3),(292,'2020-02-24','2020-03-01','',1,12),(293,'2020-02-24','2020-03-01','',1,20),(294,'2020-02-24','2020-03-01','',1,28),(295,'2020-02-24','2020-03-01','',1,22),(296,'2020-02-24','2020-03-01','',1,19),(298,'2020-03-02','2020-03-08','',1,6),(299,'2020-03-02','2020-03-08','',1,12),(300,'2020-03-02','2020-03-08','',1,27),(301,'2020-03-02','2020-03-08','',1,20),(302,'2020-03-09','2020-03-16','',1,22),(303,'2020-03-09','2020-03-16','',1,18),(304,'2020-03-09','2020-03-16','',1,20),(305,'2020-03-01','2020-03-29','Completo',1,3),(306,'2020-03-08','2020-03-15','Completo',1,3),(307,'2020-03-08','2020-03-22','completitisimo',1,3),(308,'2020-03-01','2020-03-02','Falta',1,6),(309,'2020-03-10','2020-03-19','Falta',1,1),(310,'2020-03-03','2020-03-19','Falta',1,1),(311,'2020-03-17','2020-03-24','Falta',1,2),(313,'2020-03-04','2020-03-17','asdasd',1,1),(314,'2020-03-04','2020-03-17','',1,1),(315,'2020-04-08','2020-04-15','',1,7),(316,'2020-04-15','2020-04-16','dasdasdsad',1,21),(317,'2020-04-08','2020-04-15','erter',1,6),(318,'2020-04-15','2020-04-17','Todo',1,6),(319,'2020-04-15','2020-04-23','qwerty',1,13),(320,'2020-05-19','2020-05-26','',1,32),(321,'2020-05-19','2020-05-26','',1,19),(322,'2020-05-19','2020-05-26','',1,6),(323,'2020-05-19','2020-05-26','',1,33),(324,'2020-05-19','2020-05-26','',1,13),(325,'2020-05-19','2020-05-26','',1,3),(326,'2020-05-19','2020-05-26','',1,12),(327,'2020-06-01','2020-06-05','',1,34),(328,'2020-06-01','2020-06-05','',1,13),(329,'2020-06-01','2020-06-05','',1,12),(330,'2020-06-05','2020-06-12','',1,10),(331,'2020-06-05','2020-06-12','',1,24),(332,'2020-06-10','2020-06-17','',1,20),(333,'2020-06-10','2020-06-17','',1,6),(334,'2020-06-10','2020-06-17','',1,12),(335,'2020-06-10','2020-06-17','',1,10),(336,'2020-06-10','2020-06-17','',1,25),(337,'2020-06-25','2020-07-01','',1,28),(338,'2020-06-25','2020-07-01','',1,31),(339,'2020-07-01','2020-07-06','',1,3),(340,'2020-07-01','2020-07-06','',1,24),(341,'2020-07-01','2020-07-06','',1,29),(342,'2020-07-02','2020-07-09','',1,35),(343,'2020-07-02','2020-07-09','',1,36),(344,'2020-07-06','2020-07-13','',1,20),(345,'2020-07-06','2020-07-13','',1,6),(346,'2020-07-06','2020-07-13','',1,12),(347,'2020-07-06','2020-07-13','',1,25),(348,'2020-07-06','2020-07-13','',1,13),(349,'2020-07-06','2020-07-13','',1,22),(350,'2020-07-06','2020-07-13','',1,22),(351,'2020-07-16','2020-07-23','',1,31),(352,'2020-07-16','2020-07-23','',1,29),(353,'2020-07-16','2020-07-23','',1,4),(354,'2020-07-16','2020-07-23','',1,28),(355,'2020-07-25','2020-07-29','',1,12),(356,'2020-07-25','2020-07-29','',1,20);
/*!40000 ALTER TABLE `corte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `corte_color`
--

DROP TABLE IF EXISTS `corte_color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `corte_color` (
  `Corte_Color_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Corte_Id` int(11) NOT NULL,
  `Color_Id` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  PRIMARY KEY (`Corte_Color_Id`),
  KEY `Color_Id` (`Color_Id`),
  KEY `Corte_Id` (`Corte_Id`),
  CONSTRAINT `corte_color_ibfk_1` FOREIGN KEY (`Color_Id`) REFERENCES `color` (`Color_Id`),
  CONSTRAINT `corte_color_ibfk_2` FOREIGN KEY (`Corte_Id`) REFERENCES `corte` (`Corte_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corte_color`
--

LOCK TABLES `corte_color` WRITE;
/*!40000 ALTER TABLE `corte_color` DISABLE KEYS */;
INSERT INTO `corte_color` VALUES (1,318,1,35),(2,318,2,35),(3,318,5,35),(4,319,1,456),(5,319,4,456),(6,319,9,456);
/*!40000 ALTER TABLE `corte_color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `corte_entregado`
--

DROP TABLE IF EXISTS `corte_entregado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `corte_entregado` (
  `Corte_ID` int(11) NOT NULL,
  `Corte_Fecha_Entrega` date NOT NULL,
  `Corte_Fecha_Pago` date DEFAULT NULL,
  `Corte_Estado` int(11) NOT NULL,
  `Corte_Observaciones` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`Corte_ID`),
  KEY `Corte_Estado` (`Corte_Estado`),
  CONSTRAINT `corte_entregado_ibfk_1` FOREIGN KEY (`Corte_Estado`) REFERENCES `estado` (`Estado_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corte_entregado`
--

LOCK TABLES `corte_entregado` WRITE;
/*!40000 ALTER TABLE `corte_entregado` DISABLE KEYS */;
INSERT INTO `corte_entregado` VALUES (152,'2019-05-12','2019-05-12',1,NULL),(153,'2019-05-26','2019-05-26',1,NULL),(154,'2019-05-26','2019-05-26',1,NULL),(155,'2019-05-26','2019-05-26',1,NULL),(156,'2019-05-26','2019-05-26',1,NULL),(157,'2019-06-02','2019-06-02',1,NULL),(158,'2019-06-02','2019-06-02',1,NULL),(159,'2019-06-02','2019-06-02',1,NULL),(160,'2019-06-09','2019-06-09',1,NULL),(162,'2019-06-09','2019-06-09',1,NULL),(163,'2019-06-09','2019-06-09',1,NULL),(164,'2019-06-09','2019-06-09',1,NULL),(165,'2019-06-16','2019-06-16',1,NULL),(166,'2019-06-16','2019-06-16',1,NULL),(167,'2019-06-16','2019-06-16',1,NULL),(168,'2019-06-23','2019-06-23',1,NULL),(169,'2019-06-23','2019-06-23',1,NULL),(170,'2019-06-23','2019-06-23',1,NULL),(171,'2019-06-30','2019-06-30',1,NULL),(172,'2019-06-30','2019-06-30',1,NULL),(173,'2019-07-07','2019-07-07',1,NULL),(174,'2019-07-07','2019-07-07',1,NULL),(175,'2019-07-14','2019-07-14',1,NULL),(176,'2019-07-14','2019-07-14',1,NULL),(178,'2019-07-14','2019-07-14',1,NULL),(179,'2019-07-14','2019-07-14',1,NULL),(180,'2019-07-22','2019-07-22',1,NULL),(181,'2019-07-22','2019-07-22',1,NULL),(182,'2019-07-22','2019-07-22',1,NULL),(183,'2019-07-29','2019-07-29',1,NULL),(184,'2019-07-29','2019-07-29',1,NULL),(185,'2019-08-05','2019-08-05',1,NULL),(186,'2019-08-05','2019-08-05',1,NULL),(187,'2019-08-05','2019-08-05',1,NULL),(188,'2019-08-12','2019-08-12',1,NULL),(189,'2019-08-12','2019-08-12',1,NULL),(190,'2019-08-09',NULL,3,NULL),(191,'2019-08-09','2019-08-09',1,NULL),(192,'2019-08-19','2019-08-19',1,NULL),(193,'2019-08-19','2019-08-19',1,NULL),(194,'2019-08-19','2019-08-19',1,NULL),(195,'2019-08-26','2019-08-26',1,NULL),(196,'2019-08-26','2019-08-26',1,NULL),(197,'2019-09-09','2019-09-09',1,NULL),(198,'2019-09-09','2019-09-09',1,NULL),(199,'2019-09-16','2019-09-16',1,NULL),(200,'2019-09-16','2019-09-16',1,NULL),(201,'2019-09-16','2019-09-16',1,NULL),(202,'2019-09-23','2019-09-23',1,NULL),(203,'2019-09-23','2019-09-23',1,NULL),(204,'2019-09-23','2019-09-23',1,NULL),(205,'2019-09-23','2019-09-23',1,NULL),(206,'2019-09-30','2019-09-30',1,NULL),(207,'2019-09-30','2019-09-30',1,NULL),(208,'2019-09-30','2019-09-30',1,NULL),(209,'2019-09-30','2019-09-30',1,NULL),(210,'2019-09-30','2019-09-30',1,NULL),(211,'2019-09-30','2019-09-30',1,NULL),(212,'2019-10-08','2019-10-08',1,NULL),(213,'2019-10-08','2019-10-08',1,NULL),(214,'2019-10-08','2019-10-08',1,NULL),(215,'2019-10-08','2019-10-08',1,NULL),(216,'2019-10-15','2019-10-15',1,NULL),(217,'2019-10-15','2019-10-15',1,NULL),(218,'2019-10-15','2019-10-15',1,NULL),(219,'2019-10-15','2019-10-15',1,NULL),(220,'2019-10-22','2019-10-22',1,NULL),(221,'2019-10-22','2019-10-22',1,NULL),(222,'2019-10-22','2019-10-22',1,NULL),(223,'2019-10-22','2019-10-22',1,NULL),(224,'2019-10-28','2019-10-28',1,NULL),(225,'2019-10-28','2019-10-28',1,NULL),(226,'2019-10-28','2019-10-28',1,NULL),(227,'2019-10-28','2019-10-28',1,NULL),(228,'2019-10-28','2019-10-28',1,NULL),(229,'2019-10-28','2019-10-28',1,NULL),(230,'2019-11-04','2019-11-04',1,NULL),(231,'2019-11-04','2019-11-04',1,NULL),(232,'2019-11-04','2019-11-04',1,NULL),(233,'2019-11-04','2019-11-04',1,NULL),(234,'2019-11-04','2019-11-04',1,NULL),(235,'2019-11-12','2019-11-12',1,NULL),(236,'2019-11-12','2019-11-12',1,NULL),(237,'2019-11-12','2019-11-12',1,NULL),(238,'2019-11-12','2019-11-12',1,NULL),(239,'2019-11-18','2019-11-18',1,NULL),(240,'2019-11-18','2019-11-18',1,NULL),(241,'2019-11-18','2019-11-18',1,NULL),(242,'2019-11-18','2019-11-18',1,NULL),(243,'2019-11-25','2019-11-25',1,NULL),(244,'2019-11-25','2019-11-25',1,NULL),(245,'2019-11-25','2019-11-25',1,NULL),(246,'2019-11-25','2019-11-25',1,NULL),(247,'2019-11-25','2019-11-25',1,NULL),(248,'2019-12-02','2019-12-02',1,NULL),(249,'2019-12-02','2019-12-02',1,NULL),(250,'2019-12-02','2019-12-02',1,NULL),(251,'2019-12-02','2019-12-02',1,NULL),(252,'2019-12-02','2019-12-02',1,NULL),(253,'2019-12-09','2019-12-09',1,NULL),(254,'2019-12-09','2019-12-09',1,NULL),(255,'2019-12-09','2019-12-09',1,NULL),(256,'2019-12-09','2019-12-09',1,NULL),(257,'2019-12-09','2019-12-09',1,NULL),(258,'2019-12-09','2019-12-09',1,NULL),(259,'2019-12-16','2019-12-16',1,NULL),(260,'2019-12-16','2019-12-16',1,NULL),(261,'2019-12-16','2019-12-16',1,NULL),(262,'2019-12-16','2019-12-16',1,NULL),(263,'2019-12-16','2019-12-16',1,NULL),(264,'2019-12-16','2019-12-16',1,NULL),(265,'2019-12-23','2019-12-23',1,NULL),(266,'2019-12-23','2019-12-23',1,NULL),(267,'2019-12-23','2019-12-23',1,NULL),(268,'2019-12-23','2019-12-23',1,NULL),(269,'2019-12-23','2019-12-23',1,NULL),(270,'2019-12-28','2019-12-28',1,NULL),(271,'2020-01-27','2020-01-27',1,NULL),(272,'2020-01-27','2020-01-27',1,NULL),(273,'2020-01-27','2020-01-27',1,NULL),(274,'2020-02-03','2020-02-03',1,NULL),(275,'2020-02-03','2020-02-03',1,NULL),(276,'2020-02-03','2020-02-03',1,NULL),(277,'2020-02-10','2020-02-10',1,NULL),(278,'2020-02-10','2020-02-10',1,NULL),(279,'2020-02-10','2020-02-10',1,NULL),(280,'2020-02-10','2020-02-10',1,NULL),(281,'2020-02-17','2020-02-17',1,NULL),(282,'2020-02-17','2020-02-17',1,NULL),(284,'2020-02-17','2020-02-17',1,NULL),(285,'2020-02-17','2020-02-17',1,NULL),(286,'2020-02-17','2020-02-17',1,NULL),(287,'2020-02-24','2020-02-24',1,NULL),(288,'2020-02-24','2020-02-24',1,NULL),(289,'2020-02-24','2020-02-24',1,NULL),(290,'2020-02-24','2020-02-24',1,NULL),(291,'2020-03-01','2020-03-01',1,NULL),(292,'2020-03-01','2020-03-01',1,NULL),(293,'2020-03-01','2020-03-01',1,NULL),(294,'2020-03-01','2020-03-01',1,NULL),(295,'2020-03-01','2020-03-01',1,NULL),(296,'2020-03-01','2020-03-01',1,NULL),(298,'2020-03-08','2020-03-08',1,NULL),(299,'2020-03-08','2020-03-08',1,NULL),(300,'2020-03-08','2020-03-08',1,NULL),(301,'2020-03-08','2020-03-08',1,NULL),(302,'2020-03-16','2020-03-16',1,NULL),(303,'2020-03-16','2020-03-16',1,NULL),(304,'2020-03-16','2020-03-16',1,NULL),(308,'2020-04-14','2020-04-14',1,NULL),(311,'2020-04-15',NULL,3,NULL),(320,'2020-05-26','2020-05-26',1,NULL),(321,'2020-05-26','2020-05-26',1,NULL),(322,'2020-05-26','2020-05-26',1,NULL),(323,'2020-05-26','2020-05-26',1,NULL),(324,'2020-05-26','2020-05-26',1,NULL),(325,'2020-05-26','2020-05-26',1,NULL),(326,'2020-05-26','2020-05-26',1,NULL),(327,'2020-06-05','2020-06-05',1,NULL),(328,'2020-06-05','2020-06-05',1,NULL),(329,'2020-06-05','2020-06-05',1,NULL),(330,'2020-06-12','2020-06-12',1,NULL),(331,'2020-06-12','2020-06-12',1,NULL),(332,'2020-06-17','2020-06-17',1,NULL),(333,'2020-06-17','2020-06-17',1,NULL),(334,'2020-06-17','2020-06-17',1,NULL),(335,'2020-06-17','2020-06-17',1,NULL),(336,'2020-06-17','2020-06-17',1,NULL),(337,'2020-07-01','2020-07-01',1,NULL),(338,'2020-07-01','2020-07-01',1,NULL),(339,'2020-07-06','2020-07-06',1,NULL),(340,'2020-07-06','2020-07-06',1,NULL),(341,'2020-07-06','2020-07-06',1,NULL),(342,'2020-07-09','2020-07-09',1,NULL),(343,'2020-07-09','2020-07-09',1,NULL),(344,'2020-07-13','2020-07-13',1,NULL),(345,'2020-07-13','2020-07-13',1,NULL),(346,'2020-07-13','2020-07-13',1,NULL),(347,'2020-07-13','2020-07-13',1,NULL),(348,'2020-07-13','2020-07-13',1,NULL),(350,'2020-07-13','2020-07-13',1,NULL),(351,'2020-07-23','2020-07-23',1,NULL),(352,'2020-07-23','2020-07-23',1,NULL),(353,'2020-07-23','2020-07-23',1,NULL),(354,'2020-07-23','2020-07-23',1,NULL),(355,'2020-07-29','2020-07-29',1,NULL),(356,'2020-07-29','2020-07-29',1,NULL);
/*!40000 ALTER TABLE `corte_entregado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `corte_insumo`
--

DROP TABLE IF EXISTS `corte_insumo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `corte_insumo` (
  `Corte_Insumo_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Corte_Id` int(11) NOT NULL,
  `Insumo_Id` int(11) NOT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`Corte_Insumo_Id`),
  KEY `Insumo_Id` (`Insumo_Id`),
  KEY `Corte_Id` (`Corte_Id`),
  CONSTRAINT `corte_insumo_ibfk_1` FOREIGN KEY (`Insumo_Id`) REFERENCES `insumo` (`Insumo_Id`),
  CONSTRAINT `corte_insumo_ibfk_2` FOREIGN KEY (`Corte_Id`) REFERENCES `corte` (`Corte_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corte_insumo`
--

LOCK TABLES `corte_insumo` WRITE;
/*!40000 ALTER TABLE `corte_insumo` DISABLE KEYS */;
/*!40000 ALTER TABLE `corte_insumo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `corte_pendiente`
--

DROP TABLE IF EXISTS `corte_pendiente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `corte_pendiente` (
  `Corte_ID` int(11) NOT NULL,
  `Corte_Cantidad_Entregada` int(11) NOT NULL,
  `Corte_Fecha_Entrega` date NOT NULL,
  `Corte_Estado` int(11) NOT NULL,
  `Corte_Observaciones` varchar(60) DEFAULT NULL,
  KEY `Corte_ID` (`Corte_ID`),
  KEY `Corte_Estado` (`Corte_Estado`),
  CONSTRAINT `corte_pendiente_ibfk_1` FOREIGN KEY (`Corte_ID`) REFERENCES `corte` (`Corte_Id`),
  CONSTRAINT `corte_pendiente_ibfk_2` FOREIGN KEY (`Corte_Estado`) REFERENCES `estado` (`Estado_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corte_pendiente`
--

LOCK TABLES `corte_pendiente` WRITE;
/*!40000 ALTER TABLE `corte_pendiente` DISABLE KEYS */;
INSERT INTO `corte_pendiente` VALUES (318,240,'2020-04-15',4,NULL),(313,43,'2020-04-16',4,NULL);
/*!40000 ALTER TABLE `corte_pendiente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `corte_talla`
--

DROP TABLE IF EXISTS `corte_talla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `corte_talla` (
  `Corte_Talla_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Corte_Id` int(11) NOT NULL,
  `Talla_Id` varchar(4) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  PRIMARY KEY (`Corte_Talla_Id`),
  KEY `Talla_Id` (`Talla_Id`),
  KEY `Corte_Id` (`Corte_Id`),
  CONSTRAINT `corte_talla_ibfk_1` FOREIGN KEY (`Talla_Id`) REFERENCES `talla` (`Talla_Id`),
  CONSTRAINT `corte_talla_ibfk_2` FOREIGN KEY (`Corte_Id`) REFERENCES `corte` (`Corte_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=534 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corte_talla`
--

LOCK TABLES `corte_talla` WRITE;
/*!40000 ALTER TABLE `corte_talla` DISABLE KEYS */;
INSERT INTO `corte_talla` VALUES (197,152,'G',106),(198,152,'P',106),(199,153,'CT',89),(200,154,'G',89),(201,154,'P',89),(202,155,'G',81),(203,155,'P',81),(204,156,'P',89),(211,157,'CT',95),(212,157,'G',95),(213,158,'G',95),(214,158,'P',95),(215,159,'CT',95),(216,159,'P',95),(217,160,'CT',95),(220,162,'G',105),(221,162,'P',105),(222,163,'G',105),(223,164,'P',105),(224,164,'G',105),(226,165,'G',105),(227,165,'P',105),(228,166,'G',94),(229,166,'P',94),(230,167,'P',105),(232,167,'CT',105),(233,168,'CT',94),(234,169,'P',94),(235,170,'G',95),(236,170,'P',95),(237,171,'P',190),(238,172,'P',190),(239,172,'G',95),(240,173,'CT',101),(241,174,'G',101),(242,174,'P',101),(243,175,'G',104),(244,176,'G',104),(246,178,'G',104),(247,179,'G',104),(248,180,'G',108),(249,180,'P',108),(250,181,'G',108),(251,182,'G',108),(252,183,'G',100),(253,183,'P',100),(254,184,'G',100),(255,184,'P',100),(256,185,'G',107),(257,185,'P',107),(258,186,'P',100),(259,187,'P',107),(260,188,'G',104),(261,188,'P',104),(262,189,'G',104),(263,189,'P',104),(264,190,'CT',100),(265,191,'G',100),(266,191,'P',100),(267,192,'G',104),(268,192,'P',104),(269,193,'G',100),(270,194,'G',100),(271,195,'G',177),(272,195,'P',87),(273,196,'G',87),(274,196,'P',87),(275,197,'G',87),(276,197,'P',87),(277,198,'G',87),(278,198,'P',87),(279,199,'G',87),(280,199,'P',87),(281,200,'G',100),(282,201,'G',125),(283,202,'G',72),(284,202,'P',72),(285,203,'CT',72),(286,204,'G',72),(287,204,'P',72),(288,205,'G',72),(289,205,'P',72),(290,206,'P',94),(291,207,'G',94),(292,207,'P',94),(293,208,'P',94),(294,209,'CT',94),(295,210,'CT',94),(296,211,'CT',94),(297,212,'P',87),(298,213,'CT',87),(299,213,'G',87),(300,213,'P',87),(301,214,'CT',87),(303,215,'P',87),(304,215,'G',87),(305,216,'G',329),(306,216,'P',188),(307,217,'CT',87),(308,218,'P',87),(309,219,'P',94),(310,219,'G',94),(311,220,'G',90),(312,220,'P',90),(313,221,'G',90),(314,221,'P',90),(315,222,'G',90),(316,222,'P',90),(317,223,'CT',180),(318,224,'G',109),(319,224,'P',109),(320,225,'G',109),(321,226,'G',109),(322,226,'P',109),(323,227,'G',90),(324,228,'CT',109),(325,229,'G',109),(326,229,'P',109),(327,230,'G',114),(328,230,'P',114),(329,231,'CT',109),(330,232,'G',114),(331,232,'P',114),(332,233,'P',100),(333,234,'G',109),(334,234,'P',109),(335,235,'G',136),(336,235,'P',136),(337,236,'CT',136),(338,237,'CT',136),(339,237,'G',136),(340,237,'P',136),(341,238,'CT',136),(342,239,'G',142),(343,239,'P',142),(344,240,'G',142),(345,240,'P',142),(346,241,'P',136),(347,242,'P',142),(348,242,'G',142),(349,243,'G',142),(350,244,'G',142),(351,245,'CT',136),(352,245,'P',136),(353,246,'G',114),(354,246,'P',114),(355,247,'CT',136),(356,248,'CT',119),(357,249,'CT',119),(358,250,'CT',119),(359,251,'G',142),(360,252,'G',476),(361,252,'P',238),(362,253,'G',111),(363,253,'P',111),(364,254,'CT',111),(365,255,'G',111),(366,255,'P',111),(367,256,'G',111),(368,256,'P',111),(369,257,'CT',111),(370,257,'P',111),(371,258,'CT',114),(372,259,'G',126),(373,259,'P',126),(374,260,'G',126),(375,260,'P',126),(376,261,'CT',126),(377,261,'P',126),(378,261,'G',126),(379,262,'CT',121),(380,263,'G',114),(381,264,'G',126),(382,264,'P',126),(383,265,'G',194),(384,265,'P',194),(385,266,'G',124),(386,266,'P',124),(387,267,'CT',124),(388,268,'CT',124),(389,269,'G',114),(390,269,'P',114),(391,270,'G',218),(392,270,'P',218),(393,271,'G',124),(394,271,'P',124),(397,272,'P',104),(398,272,'G',104),(399,273,'G',124),(400,274,'G',124),(401,274,'P',124),(402,275,'CT',124),(403,275,'G',129),(404,276,'G',129),(405,276,'P',129),(406,277,'G',129),(407,277,'P',129),(408,278,'G',129),(409,279,'CT',129),(410,280,'CT',129),(411,280,'P',129),(429,281,'G',194),(430,282,'G',129),(432,284,'CT',129),(433,285,'CT',129),(435,284,'P',129),(437,286,'CT',129),(438,287,'G',136),(439,288,'G',136),(440,288,'P',136),(441,289,'P',136),(442,290,'P',136),(443,291,'G',69),(444,291,'P',69),(445,292,'G',69),(446,292,'P',69),(447,293,'G',69),(448,294,'CT',136),(449,295,'G',136),(450,296,'CT',136),(453,298,'G',86),(454,299,'CT',86),(455,299,'G',86),(456,299,'P',86),(457,300,'G',66),(458,300,'P',66),(459,301,'G',86),(460,302,'CT',136),(461,303,'CT',136),(462,303,'P',136),(463,304,'P',86),(464,306,'CT',123),(465,306,'G',123),(466,307,'G',129),(467,307,'P',129),(468,307,'CT',129),(469,308,'CT',39),(470,309,'CT',45),(471,310,'CT',34),(472,311,'CT',45),(474,313,'CT',23),(475,314,'CT',23),(476,315,'CT',26),(477,316,'G',23),(478,317,'G',34),(479,318,'CT',145),(480,318,'P',145),(481,319,'CT',67),(482,320,'P',550),(483,321,'CT',126),(484,321,'P',126),(485,322,'CT',69),(486,322,'G',69),(487,322,'P',86),(488,323,'P',133),(489,324,'G',126),(490,325,'G',45),(491,325,'P',45),(492,326,'CT',69),(493,327,'CT',98),(494,328,'CT',126),(495,328,'P',126),(496,329,'CT',222),(497,330,'G',126),(498,331,'P',126),(499,332,'G',55),(500,332,'P',55),(501,333,'G',55),(502,334,'G',55),(503,334,'P',55),(504,335,'P',126),(507,336,'G',55),(508,336,'P',55),(509,337,'CT',126),(510,338,'CT',133),(511,338,'G',133),(512,339,'G',74),(513,339,'P',74),(514,340,'CT',126),(515,341,'CT',126),(516,342,'CT',108),(517,343,'CT',108),(518,344,'G',74),(519,345,'G',74),(520,345,'P',74),(521,346,'P',74),(522,347,'G',58),(523,347,'P',58),(524,348,'CT',58),(525,350,'CT',58),(526,351,'G',58),(527,352,'G',58),(528,353,'P',58),(529,354,'CT',58),(530,355,'CT',123),(531,355,'G',123),(532,355,'P',123),(533,356,'G',123);
/*!40000 ALTER TABLE `corte_talla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `cortesadmi`
--

DROP TABLE IF EXISTS `cortesadmi`;
/*!50001 DROP VIEW IF EXISTS `cortesadmi`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `cortesadmi` AS SELECT 
 1 AS `ID`,
 1 AS `Representante`,
 1 AS `Proveedor`,
 1 AS `Modelo`,
 1 AS `Fecha`,
 1 AS `Cantidad`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `cortesentregados`
--

DROP TABLE IF EXISTS `cortesentregados`;
/*!50001 DROP VIEW IF EXISTS `cortesentregados`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `cortesentregados` AS SELECT 
 1 AS `ID`,
 1 AS `Modelo`,
 1 AS `Realizadas`,
 1 AS `Fecha de Envio`,
 1 AS `Fecha de Entrega`,
 1 AS `Fecha de Pago`,
 1 AS `Total Pago`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `cortesentregadospagados`
--

DROP TABLE IF EXISTS `cortesentregadospagados`;
/*!50001 DROP VIEW IF EXISTS `cortesentregadospagados`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `cortesentregadospagados` AS SELECT 
 1 AS `ID`,
 1 AS `Modelo`,
 1 AS `Realizadas`,
 1 AS `Fecha de Entrega`,
 1 AS `Pago`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `cortesentregadossinpagar`
--

DROP TABLE IF EXISTS `cortesentregadossinpagar`;
/*!50001 DROP VIEW IF EXISTS `cortesentregadossinpagar`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `cortesentregadossinpagar` AS SELECT 
 1 AS `ID`,
 1 AS `Modelo`,
 1 AS `Precio`,
 1 AS `Cantidad`,
 1 AS `Fecha de Entrega`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `cortespendientes`
--

DROP TABLE IF EXISTS `cortespendientes`;
/*!50001 DROP VIEW IF EXISTS `cortespendientes`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `cortespendientes` AS SELECT 
 1 AS `ID`,
 1 AS `Modelo`,
 1 AS `Fecha de Envio`,
 1 AS `Estado`,
 1 AS `Pago`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `cortesporasignar`
--

DROP TABLE IF EXISTS `cortesporasignar`;
/*!50001 DROP VIEW IF EXISTS `cortesporasignar`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `cortesporasignar` AS SELECT 
 1 AS `ID`,
 1 AS `Modelo`,
 1 AS `Fecha`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `cortesporentregar`
--

DROP TABLE IF EXISTS `cortesporentregar`;
/*!50001 DROP VIEW IF EXISTS `cortesporentregar`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `cortesporentregar` AS SELECT 
 1 AS `ID`,
 1 AS `Modelo`,
 1 AS `Fecha de Envio`,
 1 AS `Cantidad`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `especializacion`
--

DROP TABLE IF EXISTS `especializacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `especializacion` (
  `Especial_Id` int(11) NOT NULL,
  `Especial_Descripcion` varchar(60) NOT NULL,
  PRIMARY KEY (`Especial_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especializacion`
--

LOCK TABLES `especializacion` WRITE;
/*!40000 ALTER TABLE `especializacion` DISABLE KEYS */;
INSERT INTO `especializacion` VALUES (1,'Operario en Maquina Fileteadora'),(2,'Operario en Maquina Plana'),(3,'Operario en Maquina Collarin'),(4,'Operario Multi Tarea');
/*!40000 ALTER TABLE `especializacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado` (
  `Estado_Id` int(11) NOT NULL,
  `Estado_Descripcion` varchar(30) NOT NULL,
  PRIMARY KEY (`Estado_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,'Entregado y Pagado'),(2,'Incompleto y Pagado'),(3,'Entregado y Sin Pagar'),(4,'Incompleto y Sin Pagar');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insumo`
--

DROP TABLE IF EXISTS `insumo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `insumo` (
  `Insumo_Id` int(11) NOT NULL,
  `Insumo_Descripcion` varchar(50) NOT NULL,
  `Insumo_Valor_Unitario` double NOT NULL,
  PRIMARY KEY (`Insumo_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insumo`
--

LOCK TABLES `insumo` WRITE;
/*!40000 ALTER TABLE `insumo` DISABLE KEYS */;
/*!40000 ALTER TABLE `insumo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modelo`
--

DROP TABLE IF EXISTS `modelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modelo` (
  `Modelo_Id` int(11) NOT NULL,
  `Modelo_Nombre` varchar(30) NOT NULL,
  `Modelo_Valor` int(11) NOT NULL,
  `Modelo_Proveedor` int(11) NOT NULL,
  PRIMARY KEY (`Modelo_Id`),
  KEY `Modelo_Proveedor` (`Modelo_Proveedor`),
  CONSTRAINT `modelo_ibfk_1` FOREIGN KEY (`Modelo_Proveedor`) REFERENCES `proveedor` (`Proveedor_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modelo`
--

LOCK TABLES `modelo` WRITE;
/*!40000 ALTER TABLE `modelo` DISABLE KEYS */;
INSERT INTO `modelo` VALUES (1,'Cuello',1900,1000),(2,'Tiras Chimbas',1900,1000),(3,'Moño Nuevo',2000,1000),(4,'Tira Ancha',1900,1000),(6,'Manga Blonda',2100,1000),(7,'Malla',1900,1000),(8,'Evilla ',1900,1000),(9,'Triangulo #2',1900,1000),(10,'Mariposa Manga',2100,1000),(11,'V sisa',1900,1000),(12,'V Manga',1900,1000),(13,'Tiras 2',2100,1000),(14,'Triangulo',2100,1000),(15,'C-1',1900,1000),(16,'Mariposa',1900,1000),(18,'Escalera',1900,1000),(19,'Flecos',1900,1000),(20,'MANGA NUEVA ',2100,1000),(21,'manga e',2100,1000),(22,'c-2',1900,1000),(23,'Cuello Malla',1900,1000),(24,'Doble Malla',1900,1000),(25,'malla V',1900,1000),(26,'Gotica Cisa',1900,1000),(27,'Gotica Manga',1900,1000),(28,'Escalera Malla',1900,1000),(29,'Evilla pretina',1900,1000),(30,'cola de pato',1900,1000),(31,'Replay',2100,1000),(32,'Solo Malla',1000,1000),(33,'Bolero',2100,1000),(34,'Flecos Tiras',1000,1000),(35,'Body top',1900,1000),(36,'Body Tetas',1900,1000),(37,'Blusa Cuello',1900,1000),(38,'Blusa Cesgo',1900,1000),(39,'Body Cuello',1900,1000),(40,'Body Cesgo',1900,1000),(41,'Blusa Falso Malla',1900,1000),(42,'Blusa Falso',1900,1000);
/*!40000 ALTER TABLE `modelo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modelo_operacion`
--

DROP TABLE IF EXISTS `modelo_operacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modelo_operacion` (
  `Modelo_Operacion_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Modelo_Id` int(11) NOT NULL,
  `Operacion_Id` int(11) NOT NULL,
  PRIMARY KEY (`Modelo_Operacion_Id`),
  KEY `Modelo_Id` (`Modelo_Id`),
  KEY `Operacion_Id` (`Operacion_Id`),
  CONSTRAINT `modelo_operacion_ibfk_1` FOREIGN KEY (`Modelo_Id`) REFERENCES `modelo` (`Modelo_Id`),
  CONSTRAINT `modelo_operacion_ibfk_2` FOREIGN KEY (`Operacion_Id`) REFERENCES `operacion` (`Operacion_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=551 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modelo_operacion`
--

LOCK TABLES `modelo_operacion` WRITE;
/*!40000 ALTER TABLE `modelo_operacion` DISABLE KEYS */;
INSERT INTO `modelo_operacion` VALUES (1,2,1),(2,2,2),(3,2,3),(4,2,4),(5,2,5),(6,2,6),(7,2,7),(8,2,8),(9,2,9),(10,2,10),(11,2,11),(12,2,12),(13,2,13),(14,3,11),(15,3,14),(16,3,15),(17,3,16),(18,3,9),(19,3,17),(20,3,18),(21,3,19),(22,3,20),(23,3,21),(24,3,22),(25,3,23),(26,3,24),(28,4,9),(29,4,8),(30,4,11),(31,4,26),(32,4,27),(33,4,28),(34,4,29),(35,4,30),(36,4,31),(37,4,7),(38,4,17),(39,4,32),(40,4,33),(56,6,33),(57,6,44),(58,6,26),(59,6,45),(60,6,43),(61,6,46),(62,6,40),(63,6,22),(64,6,47),(65,6,21),(66,6,11),(68,7,32),(69,7,48),(70,7,49),(71,7,50),(72,7,51),(73,7,52),(74,7,20),(75,7,53),(76,7,54),(77,7,6),(78,7,55),(79,7,11),(80,8,34),(81,8,56),(82,8,57),(85,8,60),(86,8,37),(87,8,43),(88,8,61),(89,8,11),(90,8,2),(91,9,62),(92,9,63),(93,9,64),(94,9,65),(95,9,66),(96,9,67),(97,9,68),(98,9,69),(99,9,7),(100,9,37),(101,9,9),(102,9,70),(103,9,11),(105,10,26),(106,10,71),(107,10,72),(108,10,43),(109,10,73),(110,10,74),(112,10,34),(113,10,21),(114,10,11),(115,10,76),(116,11,16),(117,11,9),(118,11,77),(119,11,78),(120,11,74),(121,11,22),(122,11,79),(123,11,11),(124,12,16),(125,12,19),(126,12,17),(127,12,22),(128,12,80),(129,12,11),(130,12,46),(131,12,40),(132,12,43),(133,12,77),(134,13,34),(137,13,81),(138,13,82),(139,13,83),(140,13,26),(141,13,61),(142,13,62),(143,13,9),(144,13,31),(145,13,7),(146,13,11),(147,13,32),(148,13,84),(152,13,85),(154,13,86),(155,12,87),(156,12,74),(157,10,42),(158,10,32),(159,10,62),(160,14,69),(161,14,8),(162,14,37),(163,14,64),(164,14,88),(165,14,62),(166,14,34),(167,14,82),(168,14,86),(169,14,89),(170,14,32),(171,14,90),(172,14,9),(173,14,22),(174,14,91),(175,3,92),(176,3,93),(177,14,94),(178,1,31),(179,1,43),(180,1,27),(191,1,80),(192,1,85),(193,1,20),(194,1,95),(195,15,27),(196,15,28),(197,15,96),(198,15,56),(199,15,2),(200,15,6),(201,15,8),(202,15,9),(203,15,97),(204,15,98),(205,15,91),(206,15,55),(207,15,32),(208,15,11),(214,16,56),(215,16,100),(216,16,101),(217,16,9),(218,16,61),(219,16,102),(221,16,22),(222,16,25),(223,16,11),(224,16,103),(225,16,104),(226,16,105),(227,16,76),(228,16,106),(229,18,32),(230,18,107),(231,18,49),(232,18,61),(233,18,56),(234,18,51),(235,18,108),(236,18,102),(237,18,27),(238,18,28),(239,18,54),(240,18,6),(241,18,55),(242,18,11),(243,18,8),(244,19,107),(245,19,6),(246,19,27),(247,19,28),(248,19,96),(249,19,91),(250,19,55),(251,19,9),(252,19,29),(253,19,100),(256,19,11),(257,19,32),(258,19,8),(259,19,110),(260,18,9),(261,20,111),(266,20,113),(267,20,114),(268,20,2),(269,20,19),(270,20,43),(271,20,46),(273,20,40),(274,20,11),(275,20,115),(276,20,22),(277,20,90),(278,6,116),(279,13,8),(280,13,90),(281,21,47),(282,21,115),(284,21,35),(285,21,117),(286,21,37),(287,21,38),(288,21,16),(289,21,45),(290,21,118),(291,21,87),(292,21,40),(293,21,22),(294,21,41),(295,21,11),(296,21,42),(297,21,43),(298,21,90),(299,22,6),(300,22,9),(301,22,27),(302,22,28),(303,22,96),(304,22,119),(305,22,120),(306,22,32),(307,22,121),(308,22,22),(309,22,91),(310,22,8),(311,22,11),(312,22,26),(313,23,122),(314,23,9),(315,23,61),(316,23,123),(317,23,102),(318,23,82),(319,23,25),(320,23,22),(321,23,11),(322,24,124),(323,24,125),(324,24,126),(325,24,9),(326,24,61),(327,24,102),(329,24,86),(330,24,22),(331,24,11),(332,8,127),(333,8,7),(334,8,16),(335,8,99),(336,8,128),(337,10,90),(338,10,112),(339,10,22),(340,10,25),(341,20,112),(343,6,90),(344,4,132),(345,6,16),(346,25,133),(347,25,9),(348,25,74),(349,25,22),(350,25,11),(351,25,134),(352,25,128),(353,26,135),(354,26,9),(355,26,134),(356,26,79),(357,26,22),(358,26,11),(359,26,74),(360,27,22),(361,27,74),(362,27,135),(363,27,43),(365,27,40),(366,27,19),(367,27,13),(368,27,11),(369,27,80),(370,26,16),(372,27,16),(373,28,137),(374,28,138),(375,28,9),(376,28,6),(377,28,62),(378,28,32),(379,28,112),(381,28,97),(382,28,140),(383,28,141),(384,28,11),(385,28,2),(386,28,8),(387,28,7),(388,16,83),(389,28,142),(390,28,143),(391,29,112),(392,29,144),(393,29,69),(394,29,8),(395,29,9),(396,29,51),(397,29,91),(398,29,145),(399,29,61),(400,29,146),(401,29,32),(402,29,11),(403,29,56),(404,6,87),(406,20,16),(407,20,87),(408,24,103),(409,24,105),(410,24,104),(411,27,46),(412,27,87),(413,30,9),(414,30,147),(415,30,145),(416,30,22),(417,30,11),(418,30,6),(419,30,148),(420,30,149),(421,31,20),(422,31,22),(423,31,9),(424,31,150),(425,31,151),(426,31,115),(427,31,152),(428,31,153),(429,31,11),(430,31,90),(431,32,16),(432,32,19),(433,32,43),(434,32,80),(435,32,42),(436,32,22),(437,32,17),(438,32,74),(439,32,11),(440,33,11),(441,33,20),(442,33,74),(443,33,22),(444,33,154),(445,33,155),(446,33,9),(447,33,156),(448,33,157),(449,33,115),(450,33,158),(451,33,159),(452,33,160),(453,33,161),(454,33,90),(455,33,25),(457,34,163),(458,34,164),(459,34,165),(460,34,11),(461,35,16),(462,35,45),(463,35,43),(464,35,46),(465,35,166),(466,35,13),(467,35,80),(468,35,167),(469,35,168),(470,35,169),(471,35,99),(473,35,171),(474,35,172),(475,35,173),(476,35,174),(477,36,175),(478,36,176),(479,36,177),(480,36,166),(481,36,178),(482,36,9),(483,36,173),(484,36,174),(485,36,179),(486,36,32),(487,36,180),(488,36,11),(489,37,16),(490,37,19),(491,37,43),(492,37,181),(493,37,42),(494,37,22),(495,37,182),(496,37,74),(497,37,183),(498,38,16),(499,38,19),(500,38,43),(501,38,42),(502,38,22),(503,38,17),(504,38,80),(505,38,11),(506,38,74),(507,37,11),(508,38,181),(509,39,16),(510,39,19),(511,39,43),(512,39,11),(513,39,74),(514,39,182),(515,39,183),(516,39,181),(517,39,42),(518,39,7),(519,39,174),(520,40,16),(521,40,19),(522,40,43),(523,40,11),(524,40,74),(525,40,174),(526,40,42),(527,40,7),(528,40,17),(529,40,80),(530,40,181),(531,41,74),(532,41,11),(533,41,16),(534,41,50),(535,41,33),(536,41,181),(537,41,19),(538,41,18),(539,41,43),(540,41,22),(541,42,22),(542,42,42),(543,42,74),(544,42,11),(545,42,16),(546,42,50),(547,42,33),(548,42,19),(549,42,43),(550,42,181);
/*!40000 ALTER TABLE `modelo_operacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operacion`
--

DROP TABLE IF EXISTS `operacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operacion` (
  `Operacion_Id` int(11) NOT NULL,
  `Operacion_Descripcion` varchar(80) NOT NULL,
  `Operacion_Valor` int(11) NOT NULL,
  PRIMARY KEY (`Operacion_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operacion`
--

LOCK TABLES `operacion` WRITE;
/*!40000 ALTER TABLE `operacion` DISABLE KEYS */;
INSERT INTO `operacion` VALUES (1,'Cesgo Tiras',200),(2,'Falsos',50),(3,'Encaje',200),(4,'Ruedo Delantero',100),(5,'Delanteros',400),(6,'Cauchos',100),(7,'Dobladillos',150),(8,'Marquillas',100),(9,'Cerrada Laterales',150),(10,'Pegada Tiras Espalda',150),(11,'Rematada',50),(12,'Cortada Tiras',100),(13,'Cesgo Cuello',100),(14,'Pegada Malla Delantero',150),(15,'Pegada Malla Tracero',150),(16,'Hombros',50),(17,'Cesgo',100),(18,'Pegada Resorte Manga',100),(19,'Pegada Mangas',200),(20,'Cuello',150),(21,'Pegada Cuello',200),(22,'Dobladillo',100),(23,'Dobladillo Malla',100),(24,'Unida Malla Tracero',50),(25,'Volteada Cuello',50),(26,'Falso',50),(27,'Cerrada Tiras',100),(28,'Volteada Tiras',100),(29,'Ruedo Delantero ',50),(30,'Pegada Tiras',200),(31,'Caucho',100),(32,'Pegada Tiras Espalda',50),(33,'Delantero',200),(34,'Cuello',150),(35,'Pegada Malla Delantero',100),(36,'Pegada Malla Tracero',100),(37,'Fileteada Delantero ',150),(38,'Fileteada Espalda',100),(39,'puños y Volteada Ruedo',200),(40,'Empuñada',200),(41,'Cesgada Malla Espalda',100),(42,'Dobladillo Mangas',100),(43,'Cerrada Laterales',200),(44,'Unida Volteada y Despunte Malla',200),(45,'Mangas',200),(46,'Puños',100),(47,'Cuellos',150),(48,'Delanteros',100),(49,'Fileteada Malla',100),(50,'Cesgo',150),(51,'Pretina',200),(52,'Tiras Malla',100),(53,'Tiras',200),(54,'Encuellada',350),(55,'Dobladillo',50),(56,'Cesgo Tiras',50),(57,'Delanteros ',350),(58,'Falso Inferior',200),(59,'Espalda Inferior',100),(60,'Espalda Superior',100),(61,'Cesgo cisa',150),(62,'Cesgo Tiras',100),(63,'Cisa',150),(64,'Cesgo Delantero',100),(65,'Triangulo',100),(66,'Pegada Triangulo',150),(67,'Pegada Triangulo a la Tira',100),(68,'Tiras Espalda',50),(69,'Pegada Cauchos',100),(70,'Cortada Tiras',50),(71,'Pegada Delanteros',100),(72,'Pegada Espaldas',100),(73,'Cesgo Espaldas',150),(74,'Marquillas',50),(75,'Dobladillos ',200),(76,'Mariposa',100),(77,'Fileteada de Malla',200),(78,'Cesgos',300),(79,'Cabeceada',150),(80,'Cabeceada',50),(81,'Pegada de Tiras Delantero',100),(82,'Encuellada',300),(83,'Pegada de Falso',100),(84,'Refilada de Tiras',50),(85,'Despuntar',100),(86,'Volteada de Cuello',50),(87,'Volteada de Puños',50),(88,'Despunte de Delantero',150),(89,'Triangulo',300),(90,'Pegada de Boton',200),(91,'Dobladillo de Espalda',50),(92,'Ruedo Malla',50),(93,'Pegada de boton',100),(94,'Pegada de Triangulo',50),(95,'Operacion',100),(96,'Despunte de Tiras',100),(97,'Delantero Inferior',300),(98,'Delantero Superior',200),(99,'Pegada Tiras Espalda',100),(100,'Despunte de Delantero',100),(101,'Ruedo Falso',50),(102,'Cerrada de Cuello',100),(103,'Pegada de Cuello',100),(104,'Despunte de Cuello',100),(105,'Embolsada de Cuello',100),(106,'Pegada de Tiras Delantero',100),(107,'Fileteada de Delantero ',150),(108,'Pegada de Tiras Malla',150),(109,'delanteros',250),(110,'Delantero',400),(111,'CESGO MALLAS Y TIRAS',150),(112,'DELANTERO ',300),(113,'ESPALDAS ',200),(114,'cUELLOS',150),(115,'ENCUELLADA',200),(116,'CESGO DE ESPALDA',50),(117,'Pegada malla tracero',50),(118,'puños y ruedo',150),(119,'cesgo',50),(120,'pegada de tiras falso y despunte',400),(121,'pegada de malla',200),(122,'Pegada de Malla',100),(123,'Despunte de Delantero',100),(124,'Pegada de Malla Superior',100),(125,'Pegada Malla Inferior',100),(126,'Despunte de Delantero ',200),(127,'Ruedo',100),(128,'Cabeceada',100),(129,'Cortada de Mallas',50),(130,'sdfsd',0),(131,'dfsd',100),(132,'Unida de Puntas',50),(133,'Pegada Malla Delantero',200),(134,'Cesgos',300),(135,'Fileteada de Delantero',500),(136,'Puños',150),(137,'fileteada Delantero y Malla',200),(138,'unida delantero',50),(139,'despunte delantero Completo',100),(140,'tiras inferiores',100),(141,'despunte Lateral',100),(142,'Despunte Delantero',50),(143,'Despunte Mitad',50),(144,'Evilla',50),(145,'Ruedo de Falso',100),(146,'Despunte',50),(147,'cesgos tiras',100),(148,'pegada de malla y falso',400),(149,'despunte',200),(150,'Cesgo cisa',200),(151,'Cesgo espalda',50),(152,'delantero inferior',300),(153,'delantero superior',300),(154,'Dobladillo Espalda',100),(155,'Cesgo cisa',100),(156,'Fileteada de Delantero ',100),(157,'Cesgo Malla',100),(158,'Pegada Malla y Bolero',150),(159,'PEgada de Bolero y Espalda',100),(160,'Cortada y Pegada de Caucho',150),(161,'unida de Bolero',100),(162,'Cesgo hueco',50),(163,'CEsgo',550),(164,'Ruedo',50),(165,'Pegada de Flecos',100),(166,'Pegada Calzon',100),(167,'Fileteada top',100),(168,'Pegada pretina',150),(169,'CEsgo top',200),(170,'Rematada',100),(171,'Rematada Body',50),(172,'Rematada Top',50),(173,'Dobladillo Calzon',150),(174,'Pegada Gancho',100),(175,'Despunte tetas',100),(176,'Fileteada Tetas',200),(177,'Filete Calzon',50),(178,'Unida Tetas y Calzon',100),(179,'Cesgo',200),(180,'Pegada Tiras Delantero',150),(181,'Prences Mangas',200),(182,'Pegada de Cuello',150),(183,'CErrada de Cuello',50);
/*!40000 ALTER TABLE `operacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operario`
--

DROP TABLE IF EXISTS `operario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operario` (
  `Operario_Id` int(11) NOT NULL,
  `Operario_Nombre` varchar(40) NOT NULL,
  `Operario_Usuario` int(11) NOT NULL DEFAULT '3',
  `Operario_Correo` varchar(50) DEFAULT 'No tiene',
  `Operario_Contraseña` varchar(40) NOT NULL,
  PRIMARY KEY (`Operario_Id`),
  KEY `Operario_Usuario` (`Operario_Usuario`),
  CONSTRAINT `operario_ibfk_1` FOREIGN KEY (`Operario_Usuario`) REFERENCES `usuario` (`Usuario_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operario`
--

LOCK TABLES `operario` WRITE;
/*!40000 ALTER TABLE `operario` DISABLE KEYS */;
INSERT INTO `operario` VALUES (1000,'Giseht',3,'Giseht','78b2cf3ee2c57cf9c5f01576eb5728a8eb23b92f'),(1001,'Enrique',3,'Enrique@gmail.com','e2ffc78328e9efc47a97e0bf637ef3d9c5bc2ffc'),(1008,'Jessica',3,'jesica@gmail.com','3cad98d4138929a3555215b8ab635b73d77f8825'),(2000,'Samaris',3,'samarias@hotmail.com','40bd001563085fc35165329ea1ff5c5ecbdbbeef'),(2099,'paola',3,'jesi@hotmail.com','0472d6252c3da5d4ab0409b41766ed978a179e7f'),(52374111,'Blanca',3,'blanca@gmail.com','72edddb407d8e214d94993f629994474c3337a66'),(1024589319,'Brayan',3,'brayanguitar000@gmail.com','fc6621793d7eda86d65fddedf290e26085403c31');
/*!40000 ALTER TABLE `operario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operario_especializacion`
--

DROP TABLE IF EXISTS `operario_especializacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operario_especializacion` (
  `Operacion_Especializacion_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Operario_Id` int(11) NOT NULL,
  `Especializacion_Id` int(11) NOT NULL,
  PRIMARY KEY (`Operacion_Especializacion_Id`),
  KEY `Operario_Id` (`Operario_Id`),
  KEY `Especializacion_Id` (`Especializacion_Id`),
  CONSTRAINT `operario_especializacion_ibfk_1` FOREIGN KEY (`Operario_Id`) REFERENCES `operario` (`Operario_Id`),
  CONSTRAINT `operario_especializacion_ibfk_2` FOREIGN KEY (`Especializacion_Id`) REFERENCES `especializacion` (`Especial_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operario_especializacion`
--

LOCK TABLES `operario_especializacion` WRITE;
/*!40000 ALTER TABLE `operario_especializacion` DISABLE KEYS */;
INSERT INTO `operario_especializacion` VALUES (3,1024589319,1),(4,1024589319,3),(5,1024589319,4),(6,52374111,2),(7,52374111,1),(8,52374111,3),(9,52374111,4),(10,1000,2),(11,1000,3),(12,1001,1),(13,1001,3),(14,1008,2),(15,1008,3),(16,2000,4);
/*!40000 ALTER TABLE `operario_especializacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `operarios`
--

DROP TABLE IF EXISTS `operarios`;
/*!50001 DROP VIEW IF EXISTS `operarios`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `operarios` AS SELECT 
 1 AS `ID`,
 1 AS `Nombre`,
 1 AS `Correo`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedor` (
  `Proveedor_Id` int(11) NOT NULL,
  `Proveedor_Nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`Proveedor_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1000,'Mathis'),(2000,'Don Carlos');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `representante`
--

DROP TABLE IF EXISTS `representante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `representante` (
  `Representante_Id` int(11) NOT NULL,
  `Representante_Nombre` varchar(50) NOT NULL,
  `Representante_Usuario` int(11) NOT NULL DEFAULT '2',
  `clave` varchar(45) DEFAULT NULL,
  `Representante_Proveedor` int(11) NOT NULL,
  `Representante_Correo` varchar(50) NOT NULL,
  PRIMARY KEY (`Representante_Id`),
  KEY `Representante_Proveedor` (`Representante_Proveedor`),
  CONSTRAINT `representante_ibfk_1` FOREIGN KEY (`Representante_Proveedor`) REFERENCES `proveedor` (`Proveedor_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `representante`
--

LOCK TABLES `representante` WRITE;
/*!40000 ALTER TABLE `representante` DISABLE KEYS */;
INSERT INTO `representante` VALUES (1,'Drucy',2,'40bd001563085fc35165329ea1ff5c5ecbdbbeef',1000,'r@gmail.com'),(2,'Carlos',2,'40bd001563085fc35165329ea1ff5c5ecbdbbeef',2000,'re');
/*!40000 ALTER TABLE `representante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `super`
--

DROP TABLE IF EXISTS `super`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `super` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `correo` varchar(65) NOT NULL,
  `clave` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `super`
--

LOCK TABLES `super` WRITE;
/*!40000 ALTER TABLE `super` DISABLE KEYS */;
INSERT INTO `super` VALUES (1,'Yo','yo@gmail.com','40bd001563085fc35165329ea1ff5c5ecbdbbeef');
/*!40000 ALTER TABLE `super` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `talla`
--

DROP TABLE IF EXISTS `talla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `talla` (
  `Talla_Id` varchar(4) NOT NULL,
  `Talla_Descripcion` varchar(50) NOT NULL,
  PRIMARY KEY (`Talla_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `talla`
--

LOCK TABLES `talla` WRITE;
/*!40000 ALTER TABLE `talla` DISABLE KEYS */;
INSERT INTO `talla` VALUES ('CT','Talla Crop Top'),('G','Talla Grande'),('P','Talla Pequeña');
/*!40000 ALTER TABLE `talla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarea`
--

DROP TABLE IF EXISTS `tarea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tarea` (
  `Tarea_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Tarea_Corte` int(11) NOT NULL,
  `Tarea_Operacion` int(11) NOT NULL,
  PRIMARY KEY (`Tarea_Id`),
  KEY `Tarea_Corte` (`Tarea_Corte`),
  KEY `Tarea_Operacion` (`Tarea_Operacion`),
  CONSTRAINT `tarea_ibfk_1` FOREIGN KEY (`Tarea_Corte`) REFERENCES `corte` (`Corte_Id`),
  CONSTRAINT `tarea_ibfk_2` FOREIGN KEY (`Tarea_Operacion`) REFERENCES `operacion` (`Operacion_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6808 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarea`
--

LOCK TABLES `tarea` WRITE;
/*!40000 ALTER TABLE `tarea` DISABLE KEYS */;
INSERT INTO `tarea` VALUES (2779,152,11),(2780,152,14),(2781,152,15),(2782,152,16),(2783,152,9),(2784,152,17),(2785,152,18),(2786,152,19),(2787,152,20),(2788,152,21),(2789,152,22),(2790,152,23),(2791,152,24),(2792,152,92),(2793,152,93),(2812,153,6),(2813,153,9),(2814,153,27),(2815,153,28),(2816,153,96),(2817,153,119),(2818,153,120),(2819,153,32),(2820,153,121),(2821,153,22),(2822,153,91),(2823,153,8),(2824,153,11),(2827,154,16),(2828,154,9),(2829,154,77),(2830,154,78),(2831,154,74),(2832,154,22),(2833,154,79),(2834,154,11),(2842,155,47),(2843,155,115),(2844,155,35),(2845,155,117),(2846,155,37),(2847,155,38),(2848,155,16),(2849,155,45),(2850,155,118),(2851,155,87),(2852,155,40),(2853,155,22),(2854,155,41),(2855,155,11),(2856,155,42),(2857,155,43),(2858,155,90),(2873,156,6),(2874,156,9),(2875,156,27),(2876,156,28),(2877,156,96),(2878,156,119),(2879,156,120),(2880,156,32),(2881,156,121),(2882,156,22),(2883,156,91),(2884,156,8),(2885,156,11),(2888,153,26),(2889,156,26),(2967,157,34),(2968,157,81),(2969,157,82),(2970,157,83),(2971,157,26),(2972,157,61),(2973,157,62),(2974,157,9),(2975,157,31),(2976,157,7),(2977,157,11),(2978,157,32),(2979,157,84),(2980,157,85),(2981,157,86),(2982,157,8),(2983,157,90),(2998,158,5),(2999,158,26),(3000,158,71),(3001,158,72),(3002,158,43),(3003,158,73),(3004,158,74),(3005,158,75),(3006,158,34),(3007,158,21),(3008,158,11),(3009,158,76),(3010,158,42),(3011,158,32),(3012,158,62),(3013,159,32),(3014,159,107),(3015,159,49),(3016,159,61),(3017,159,56),(3018,159,51),(3019,159,108),(3020,159,102),(3021,159,27),(3022,159,28),(3023,159,54),(3024,159,6),(3025,159,55),(3026,159,11),(3027,159,8),(3028,159,9),(3029,160,107),(3030,160,6),(3031,160,27),(3032,160,28),(3033,160,96),(3034,160,91),(3035,160,55),(3036,160,9),(3037,160,29),(3038,160,100),(3039,160,11),(3040,160,32),(3041,160,8),(3042,160,110),(3059,162,16),(3060,162,19),(3061,162,17),(3062,162,22),(3063,162,80),(3064,162,11),(3065,162,46),(3066,162,40),(3067,162,43),(3068,162,77),(3069,162,87),(3070,162,74),(3074,163,122),(3075,163,9),(3076,163,61),(3077,163,123),(3078,163,102),(3079,163,82),(3080,163,25),(3081,163,22),(3082,163,11),(3089,164,111),(3090,164,5),(3091,164,113),(3092,164,114),(3093,164,2),(3094,164,19),(3095,164,43),(3096,164,46),(3097,164,40),(3098,164,11),(3099,164,115),(3100,164,22),(3101,164,90),(3117,165,11),(3118,165,14),(3119,165,15),(3120,165,16),(3121,165,9),(3122,165,17),(3123,165,18),(3124,165,19),(3125,165,20),(3126,165,21),(3127,165,22),(3128,165,23),(3129,165,24),(3130,165,92),(3131,165,93),(3132,166,1),(3133,166,2),(3134,166,3),(3135,166,4),(3136,166,5),(3137,166,6),(3138,166,7),(3139,166,8),(3140,166,9),(3141,166,10),(3142,166,11),(3143,166,12),(3144,166,13),(3147,167,124),(3148,167,125),(3149,167,126),(3150,167,9),(3151,167,61),(3152,167,102),(3153,167,82),(3154,167,86),(3155,167,22),(3156,167,11),(3157,168,1),(3158,168,2),(3159,168,3),(3160,168,4),(3161,168,5),(3162,168,6),(3163,168,7),(3164,168,8),(3165,168,9),(3166,168,10),(3167,168,11),(3168,168,12),(3169,168,13),(3172,169,34),(3173,169,81),(3174,169,82),(3175,169,83),(3176,169,26),(3177,169,61),(3178,169,62),(3179,169,9),(3180,169,31),(3181,169,7),(3182,169,11),(3183,169,32),(3184,169,84),(3185,169,85),(3186,169,86),(3187,169,8),(3188,169,90),(3203,170,11),(3204,170,14),(3205,170,15),(3206,170,16),(3207,170,9),(3208,170,17),(3209,170,18),(3210,170,19),(3211,170,20),(3212,170,21),(3213,170,22),(3214,170,23),(3215,170,24),(3216,170,92),(3217,170,93),(3218,171,124),(3219,171,125),(3220,171,126),(3221,171,9),(3222,171,61),(3223,171,102),(3224,171,82),(3225,171,86),(3226,171,22),(3227,171,11),(3233,172,11),(3234,172,14),(3235,172,15),(3236,172,16),(3237,172,9),(3238,172,17),(3239,172,18),(3240,172,19),(3241,172,20),(3242,172,21),(3243,172,22),(3244,172,23),(3245,172,24),(3246,172,92),(3247,172,93),(3248,173,107),(3249,173,6),(3250,173,27),(3251,173,28),(3252,173,96),(3253,173,91),(3254,173,55),(3255,173,9),(3256,173,29),(3257,173,100),(3258,173,11),(3259,173,32),(3260,173,8),(3261,173,110),(3263,174,34),(3264,174,56),(3265,174,57),(3266,174,58),(3267,174,59),(3268,174,60),(3269,174,37),(3270,174,43),(3271,174,61),(3272,174,11),(3273,174,2),(3279,174,127),(3281,174,7),(3283,174,16),(3285,174,99),(3287,174,128),(3288,175,34),(3289,175,81),(3290,175,82),(3291,175,83),(3292,175,26),(3293,175,61),(3294,175,62),(3295,175,9),(3296,175,31),(3297,175,7),(3298,175,11),(3299,175,32),(3300,175,84),(3301,175,85),(3302,175,86),(3303,175,8),(3304,175,90),(3319,176,16),(3320,176,19),(3321,176,17),(3322,176,22),(3323,176,80),(3324,176,11),(3325,176,46),(3326,176,40),(3327,176,43),(3328,176,77),(3329,176,87),(3330,176,74),(3349,178,122),(3350,178,9),(3351,178,61),(3352,178,123),(3353,178,102),(3354,178,82),(3355,178,25),(3356,178,22),(3357,178,11),(3364,179,111),(3365,179,5),(3366,179,113),(3367,179,114),(3368,179,2),(3369,179,19),(3370,179,43),(3371,179,46),(3372,179,40),(3373,179,11),(3374,179,115),(3375,179,22),(3376,179,90),(3380,158,90),(3384,158,112),(3388,158,22),(3392,158,25),(3393,180,26),(3394,180,71),(3395,180,72),(3396,180,43),(3397,180,73),(3398,180,74),(3399,180,34),(3400,180,21),(3401,180,11),(3402,180,76),(3403,180,42),(3404,180,32),(3405,180,62),(3406,180,90),(3407,180,112),(3408,180,22),(3409,180,25),(3424,181,69),(3425,181,8),(3426,181,37),(3427,181,64),(3428,181,88),(3429,181,62),(3430,181,34),(3431,181,82),(3432,181,86),(3433,181,89),(3434,181,32),(3435,181,90),(3436,181,9),(3437,181,22),(3438,181,91),(3439,181,94),(3455,182,34),(3456,182,81),(3457,182,82),(3458,182,83),(3459,182,26),(3460,182,61),(3461,182,62),(3462,182,9),(3463,182,31),(3464,182,7),(3465,182,11),(3466,182,32),(3467,182,84),(3468,182,85),(3469,182,86),(3470,182,8),(3471,182,90),(3473,164,112),(3474,179,112),(3476,164,129),(3477,179,129),(3478,183,16),(3479,183,19),(3480,183,17),(3481,183,22),(3482,183,80),(3483,183,11),(3484,183,46),(3485,183,40),(3486,183,43),(3487,183,77),(3488,183,87),(3489,183,74),(3493,184,111),(3494,184,113),(3495,184,114),(3496,184,2),(3497,184,19),(3498,184,43),(3499,184,46),(3500,184,40),(3501,184,11),(3502,184,115),(3503,184,22),(3504,184,90),(3505,184,112),(3506,184,129),(3511,185,11),(3512,185,14),(3513,185,15),(3514,185,16),(3515,185,9),(3516,185,17),(3517,185,18),(3518,185,19),(3519,185,20),(3520,185,21),(3521,185,22),(3522,185,23),(3523,185,24),(3524,185,92),(3525,185,93),(3526,186,33),(3527,186,44),(3528,186,26),(3529,186,45),(3530,186,43),(3531,186,46),(3532,186,40),(3533,186,22),(3534,186,47),(3535,186,21),(3536,186,11),(3537,186,116),(3541,187,34),(3542,187,81),(3543,187,82),(3544,187,83),(3545,187,26),(3546,187,61),(3547,187,62),(3548,187,9),(3549,187,31),(3550,187,7),(3551,187,11),(3552,187,32),(3553,187,84),(3554,187,85),(3555,187,86),(3556,187,8),(3557,187,90),(3590,186,90),(3591,188,9),(3592,188,8),(3593,188,11),(3594,188,26),(3595,188,27),(3596,188,28),(3597,188,29),(3598,188,30),(3599,188,31),(3600,188,7),(3601,188,17),(3602,188,32),(3603,188,33),(3606,189,26),(3607,189,71),(3608,189,72),(3609,189,43),(3610,189,73),(3611,189,74),(3612,189,34),(3613,189,21),(3614,189,11),(3615,189,76),(3616,189,42),(3617,189,32),(3618,189,62),(3619,189,90),(3620,189,112),(3621,189,22),(3622,189,25),(3623,190,31),(3624,190,43),(3625,190,27),(3626,190,80),(3627,190,85),(3628,190,20),(3629,190,95),(3630,191,31),(3631,191,43),(3632,191,27),(3633,191,80),(3634,191,85),(3635,191,20),(3636,191,95),(3637,188,132),(3638,192,34),(3639,192,81),(3640,192,82),(3641,192,83),(3642,192,26),(3643,192,61),(3644,192,62),(3645,192,9),(3646,192,31),(3647,192,7),(3648,192,11),(3649,192,32),(3650,192,84),(3651,192,85),(3652,192,86),(3653,192,8),(3654,192,90),(3669,193,111),(3670,193,113),(3671,193,114),(3672,193,2),(3673,193,19),(3674,193,43),(3675,193,46),(3676,193,40),(3677,193,11),(3678,193,115),(3679,193,22),(3680,193,90),(3681,193,112),(3682,193,129),(3684,194,16),(3685,194,9),(3686,194,77),(3687,194,78),(3688,194,74),(3689,194,22),(3690,194,79),(3691,194,11),(3692,195,11),(3693,195,14),(3694,195,15),(3695,195,16),(3696,195,9),(3697,195,17),(3698,195,18),(3699,195,19),(3700,195,20),(3701,195,21),(3702,195,22),(3703,195,23),(3704,195,24),(3705,195,92),(3706,195,93),(3707,196,16),(3708,196,19),(3709,196,17),(3710,196,22),(3711,196,80),(3712,196,11),(3713,196,46),(3714,196,40),(3715,196,43),(3716,196,77),(3717,196,87),(3718,196,74),(3719,197,33),(3720,197,44),(3721,197,26),(3722,197,45),(3723,197,43),(3724,197,46),(3725,197,40),(3726,197,22),(3727,197,47),(3728,197,21),(3729,197,11),(3730,197,116),(3731,197,90),(3734,198,111),(3735,198,113),(3736,198,114),(3737,198,2),(3738,198,19),(3739,198,43),(3740,198,46),(3741,198,40),(3742,198,11),(3743,198,115),(3744,198,22),(3745,198,90),(3746,198,112),(3749,186,16),(3750,197,16),(3751,199,133),(3752,199,9),(3753,199,74),(3754,199,22),(3755,199,11),(3756,199,134),(3757,199,128),(3758,200,16),(3759,200,19),(3760,200,17),(3761,200,22),(3762,200,80),(3763,200,11),(3764,200,46),(3765,200,40),(3766,200,43),(3767,200,77),(3768,200,87),(3769,200,74),(3773,201,11),(3774,201,14),(3775,201,15),(3776,201,16),(3777,201,9),(3778,201,17),(3779,201,18),(3780,201,19),(3781,201,20),(3782,201,21),(3783,201,22),(3784,201,23),(3785,201,24),(3786,201,92),(3787,201,93),(3788,202,11),(3789,202,14),(3790,202,15),(3791,202,16),(3792,202,9),(3793,202,17),(3794,202,18),(3795,202,19),(3796,202,20),(3797,202,21),(3798,202,22),(3799,202,23),(3800,202,24),(3801,202,92),(3802,202,93),(3803,203,124),(3804,203,125),(3805,203,126),(3806,203,9),(3807,203,61),(3808,203,102),(3809,203,82),(3810,203,86),(3811,203,22),(3812,203,11),(3818,204,135),(3819,204,9),(3820,204,134),(3821,204,79),(3822,204,22),(3823,204,11),(3824,204,74),(3825,205,22),(3826,205,74),(3827,205,135),(3828,205,43),(3829,205,136),(3830,205,40),(3831,205,19),(3832,205,13),(3833,205,11),(3834,205,80),(3840,204,16),(3841,205,79),(3842,205,16),(3843,206,1),(3844,206,2),(3845,206,3),(3846,206,4),(3847,206,5),(3848,206,6),(3849,206,7),(3850,206,8),(3851,206,9),(3852,206,10),(3853,206,11),(3854,206,12),(3855,206,13),(3858,207,34),(3859,207,81),(3860,207,82),(3861,207,83),(3862,207,26),(3863,207,61),(3864,207,62),(3865,207,9),(3866,207,31),(3867,207,7),(3868,207,11),(3869,207,32),(3870,207,84),(3871,207,85),(3872,207,86),(3873,207,8),(3874,207,90),(3889,208,16),(3890,208,9),(3891,208,77),(3892,208,78),(3893,208,74),(3894,208,22),(3895,208,79),(3896,208,11),(3904,209,16),(3905,209,19),(3906,209,17),(3907,209,22),(3908,209,80),(3909,209,11),(3910,209,46),(3911,209,40),(3912,209,43),(3913,209,77),(3914,209,87),(3915,209,74),(3919,210,107),(3920,210,6),(3921,210,27),(3922,210,28),(3923,210,96),(3924,210,91),(3925,210,55),(3926,210,9),(3927,210,29),(3928,210,100),(3929,210,11),(3930,210,32),(3931,210,8),(3932,210,110),(3934,211,137),(3935,211,138),(3936,211,9),(3937,211,6),(3938,211,62),(3939,211,32),(3940,211,112),(3941,211,139),(3942,211,97),(3943,211,140),(3944,211,141),(3945,211,11),(3946,211,2),(3947,211,8),(3948,211,7),(3949,212,16),(3950,212,9),(3951,212,77),(3952,212,78),(3953,212,74),(3954,212,22),(3955,212,79),(3956,212,11),(3964,213,33),(3965,213,44),(3966,213,26),(3967,213,45),(3968,213,43),(3969,213,46),(3970,213,40),(3971,213,22),(3972,213,47),(3973,213,21),(3974,213,11),(3975,213,116),(3976,213,90),(3977,213,16),(3979,214,137),(3980,214,138),(3981,214,9),(3982,214,6),(3983,214,62),(3984,214,32),(3985,214,112),(3986,214,139),(3987,214,97),(3988,214,140),(3989,214,141),(3990,214,11),(3991,214,2),(3992,214,8),(3993,214,7),(3994,215,111),(3995,215,113),(3996,215,114),(3997,215,2),(3998,215,19),(3999,215,43),(4000,215,46),(4001,215,40),(4002,215,11),(4003,215,115),(4004,215,22),(4005,215,90),(4006,215,112),(4007,216,11),(4008,216,14),(4009,216,15),(4010,216,16),(4011,216,9),(4012,216,17),(4013,216,18),(4014,216,19),(4015,216,20),(4016,216,21),(4017,216,22),(4018,216,23),(4019,216,24),(4020,216,92),(4021,216,93),(4022,217,34),(4023,217,81),(4024,217,82),(4025,217,83),(4026,217,26),(4027,217,61),(4028,217,62),(4029,217,9),(4030,217,31),(4031,217,7),(4032,217,11),(4033,217,32),(4034,217,84),(4035,217,85),(4036,217,86),(4037,217,8),(4038,217,90),(4053,218,124),(4054,218,125),(4055,218,126),(4056,218,9),(4057,218,61),(4058,218,102),(4059,218,82),(4060,218,86),(4061,218,22),(4062,218,11),(4068,219,135),(4069,219,9),(4070,219,134),(4071,219,79),(4072,219,22),(4073,219,11),(4074,219,74),(4075,219,16),(4076,220,26),(4077,220,71),(4078,220,72),(4079,220,43),(4080,220,73),(4081,220,74),(4082,220,34),(4083,220,21),(4084,220,11),(4085,220,76),(4086,220,42),(4087,220,32),(4088,220,62),(4089,220,90),(4090,220,112),(4091,220,22),(4092,220,25),(4107,221,34),(4108,221,81),(4109,221,82),(4110,221,83),(4111,221,26),(4112,221,61),(4113,221,62),(4114,221,9),(4115,221,31),(4116,221,7),(4117,221,11),(4118,221,32),(4119,221,84),(4120,221,85),(4121,221,86),(4122,221,8),(4123,221,90),(4138,222,9),(4139,222,8),(4140,222,11),(4141,222,26),(4142,222,27),(4143,222,28),(4144,222,29),(4145,222,30),(4146,222,31),(4147,222,7),(4148,222,17),(4149,222,32),(4150,222,33),(4151,222,132),(4153,223,137),(4154,223,138),(4155,223,9),(4156,223,6),(4157,223,62),(4158,223,32),(4159,223,112),(4160,223,139),(4161,223,97),(4162,223,140),(4163,223,141),(4164,223,11),(4165,223,2),(4166,223,8),(4167,223,7),(4168,224,11),(4169,224,14),(4170,224,15),(4171,224,16),(4172,224,9),(4173,224,17),(4174,224,18),(4175,224,19),(4176,224,20),(4177,224,21),(4178,224,22),(4179,224,23),(4180,224,24),(4181,224,92),(4182,224,93),(4183,225,16),(4184,225,9),(4185,225,77),(4186,225,78),(4187,225,74),(4188,225,22),(4189,225,79),(4190,225,11),(4198,226,16),(4199,226,19),(4200,226,17),(4201,226,22),(4202,226,80),(4203,226,11),(4204,226,46),(4205,226,40),(4206,226,43),(4207,226,77),(4208,226,87),(4209,226,74),(4213,227,2),(4214,227,56),(4215,227,100),(4216,227,101),(4217,227,9),(4218,227,61),(4219,227,102),(4220,227,22),(4221,227,25),(4222,227,11),(4223,227,103),(4224,227,104),(4225,227,105),(4226,227,76),(4227,227,106),(4228,228,107),(4229,228,6),(4230,228,27),(4231,228,28),(4232,228,96),(4233,228,91),(4234,228,55),(4235,228,9),(4236,228,29),(4237,228,100),(4238,228,11),(4239,228,32),(4240,228,8),(4241,228,110),(4243,229,122),(4244,229,9),(4245,229,61),(4246,229,123),(4247,229,102),(4248,229,82),(4249,229,25),(4250,229,22),(4251,229,11),(4252,227,83),(4253,230,22),(4254,230,74),(4255,230,135),(4256,230,43),(4257,230,136),(4258,230,40),(4259,230,19),(4260,230,13),(4261,230,11),(4262,230,80),(4263,230,16),(4268,231,137),(4269,231,138),(4270,231,9),(4271,231,6),(4272,231,62),(4273,231,32),(4274,231,112),(4275,231,139),(4276,231,97),(4277,231,140),(4278,231,141),(4279,231,11),(4280,231,2),(4281,231,8),(4282,231,7),(4283,232,16),(4284,232,19),(4285,232,17),(4286,232,22),(4287,232,80),(4288,232,11),(4289,232,46),(4290,232,40),(4291,232,43),(4292,232,77),(4293,232,87),(4294,232,74),(4298,233,56),(4299,233,100),(4300,233,101),(4301,233,9),(4302,233,61),(4303,233,102),(4304,233,22),(4305,233,25),(4306,233,11),(4307,233,103),(4308,233,104),(4309,233,105),(4310,233,76),(4311,233,106),(4312,233,83),(4313,234,133),(4314,234,9),(4315,234,74),(4316,234,22),(4317,234,11),(4318,234,134),(4319,234,128),(4320,211,142),(4321,214,142),(4322,223,142),(4323,231,142),(4324,211,143),(4325,214,143),(4326,223,143),(4327,231,143),(4328,235,11),(4329,235,14),(4330,235,15),(4331,235,16),(4332,235,9),(4333,235,17),(4334,235,18),(4335,235,19),(4336,235,20),(4337,235,21),(4338,235,22),(4339,235,23),(4340,235,24),(4341,235,92),(4342,235,93),(4343,236,107),(4344,236,6),(4345,236,27),(4346,236,28),(4347,236,96),(4348,236,91),(4349,236,55),(4350,236,9),(4351,236,29),(4352,236,100),(4353,236,11),(4354,236,32),(4355,236,8),(4356,236,110),(4358,237,34),(4359,237,81),(4360,237,82),(4361,237,83),(4362,237,26),(4363,237,61),(4364,237,62),(4365,237,9),(4366,237,31),(4367,237,7),(4368,237,11),(4369,237,32),(4370,237,84),(4371,237,85),(4372,237,86),(4373,237,8),(4374,237,90),(4389,238,112),(4390,238,144),(4391,238,69),(4392,238,8),(4393,238,9),(4394,238,51),(4395,238,91),(4396,238,145),(4397,238,61),(4398,238,146),(4399,238,32),(4400,238,11),(4401,238,56),(4402,239,33),(4403,239,44),(4404,239,26),(4405,239,45),(4406,239,43),(4407,239,46),(4408,239,40),(4409,239,22),(4410,239,47),(4411,239,21),(4412,239,11),(4413,239,116),(4414,239,90),(4415,239,16),(4417,240,16),(4418,240,19),(4419,240,17),(4420,240,22),(4421,240,80),(4422,240,11),(4423,240,46),(4424,240,40),(4425,240,43),(4426,240,77),(4427,240,87),(4428,240,74),(4432,241,32),(4433,241,107),(4434,241,49),(4435,241,61),(4436,241,56),(4437,241,51),(4438,241,108),(4439,241,102),(4440,241,27),(4441,241,28),(4442,241,54),(4443,241,6),(4444,241,55),(4445,241,11),(4446,241,8),(4447,241,9),(4463,242,111),(4464,242,113),(4465,242,114),(4466,242,2),(4467,242,19),(4468,242,43),(4469,242,46),(4470,242,40),(4471,242,11),(4472,242,115),(4473,242,22),(4474,242,90),(4475,242,112),(4478,186,87),(4479,197,87),(4480,213,87),(4481,239,87),(4482,164,16),(4483,179,16),(4484,184,16),(4485,193,16),(4486,198,16),(4487,215,16),(4488,242,16),(4489,164,87),(4490,179,87),(4491,184,87),(4492,193,87),(4493,198,87),(4494,215,87),(4495,242,87),(4496,243,33),(4497,243,44),(4498,243,26),(4499,243,45),(4500,243,43),(4501,243,46),(4502,243,40),(4503,243,22),(4504,243,47),(4505,243,21),(4506,243,11),(4507,243,116),(4508,243,90),(4509,243,16),(4510,243,87),(4511,244,16),(4512,244,19),(4513,244,17),(4514,244,22),(4515,244,80),(4516,244,11),(4517,244,46),(4518,244,40),(4519,244,43),(4520,244,77),(4521,244,87),(4522,244,74),(4526,245,124),(4527,245,125),(4528,245,126),(4529,245,9),(4530,245,61),(4531,245,102),(4532,245,82),(4533,245,86),(4534,245,22),(4535,245,11),(4541,246,22),(4542,246,74),(4543,246,135),(4544,246,43),(4545,246,136),(4546,246,40),(4547,246,19),(4548,246,13),(4549,246,11),(4550,246,80),(4551,246,16),(4556,247,137),(4557,247,138),(4558,247,9),(4559,247,6),(4560,247,62),(4561,247,32),(4562,247,112),(4563,247,97),(4564,247,140),(4565,247,141),(4566,247,11),(4567,247,2),(4568,247,8),(4569,247,7),(4570,247,142),(4571,247,143),(4587,167,103),(4588,171,103),(4589,203,103),(4590,218,103),(4591,245,103),(4592,167,105),(4593,171,105),(4594,203,105),(4595,218,105),(4596,245,105),(4597,167,104),(4598,171,104),(4599,203,104),(4600,218,104),(4601,245,104),(4602,205,46),(4603,230,46),(4604,246,46),(4605,205,87),(4606,230,87),(4607,246,87),(4608,248,137),(4609,248,138),(4610,248,9),(4611,248,6),(4612,248,62),(4613,248,32),(4614,248,112),(4615,248,97),(4616,248,140),(4617,248,141),(4618,248,11),(4619,248,2),(4620,248,8),(4621,248,7),(4622,248,142),(4623,248,143),(4639,249,112),(4640,249,144),(4641,249,69),(4642,249,8),(4643,249,9),(4644,249,51),(4645,249,91),(4646,249,145),(4647,249,61),(4648,249,146),(4649,249,32),(4650,249,11),(4651,249,56),(4654,250,16),(4655,250,19),(4656,250,17),(4657,250,22),(4658,250,80),(4659,250,11),(4660,250,46),(4661,250,40),(4662,250,43),(4663,250,77),(4664,250,87),(4665,250,74),(4669,251,111),(4670,251,113),(4671,251,114),(4672,251,2),(4673,251,19),(4674,251,43),(4675,251,46),(4676,251,40),(4677,251,11),(4678,251,115),(4679,251,22),(4680,251,90),(4681,251,112),(4682,251,16),(4683,251,87),(4684,252,11),(4685,252,14),(4686,252,15),(4687,252,16),(4688,252,9),(4689,252,17),(4690,252,18),(4691,252,19),(4692,252,20),(4693,252,21),(4694,252,22),(4695,252,23),(4696,252,24),(4697,252,92),(4698,252,93),(4699,253,26),(4700,253,71),(4701,253,72),(4702,253,43),(4703,253,73),(4704,253,74),(4705,253,34),(4706,253,21),(4707,253,11),(4708,253,76),(4709,253,42),(4710,253,32),(4711,253,62),(4712,253,90),(4713,253,112),(4714,253,22),(4715,253,25),(4730,254,107),(4731,254,6),(4732,254,27),(4733,254,28),(4734,254,96),(4735,254,91),(4736,254,55),(4737,254,9),(4738,254,29),(4739,254,100),(4740,254,11),(4741,254,32),(4742,254,8),(4743,254,110),(4745,255,9),(4746,255,8),(4747,255,11),(4748,255,26),(4749,255,27),(4750,255,28),(4751,255,29),(4752,255,30),(4753,255,31),(4754,255,7),(4755,255,17),(4756,255,32),(4757,255,33),(4758,255,132),(4760,256,34),(4761,256,81),(4762,256,82),(4763,256,83),(4764,256,26),(4765,256,61),(4766,256,62),(4767,256,9),(4768,256,31),(4769,256,7),(4770,256,11),(4771,256,32),(4772,256,84),(4773,256,85),(4774,256,86),(4775,256,8),(4776,256,90),(4791,257,6),(4792,257,9),(4793,257,27),(4794,257,28),(4795,257,96),(4796,257,119),(4797,257,120),(4798,257,32),(4799,257,121),(4800,257,22),(4801,257,91),(4802,257,8),(4803,257,11),(4804,257,26),(4806,258,22),(4807,258,74),(4808,258,135),(4809,258,43),(4810,258,40),(4811,258,19),(4812,258,13),(4813,258,11),(4814,258,80),(4815,258,16),(4816,258,46),(4817,258,87),(4818,259,11),(4819,259,14),(4820,259,15),(4821,259,16),(4822,259,9),(4823,259,17),(4824,259,18),(4825,259,19),(4826,259,20),(4827,259,21),(4828,259,22),(4829,259,23),(4830,259,24),(4831,259,92),(4832,259,93),(4833,260,33),(4834,260,44),(4835,260,26),(4836,260,45),(4837,260,43),(4838,260,46),(4839,260,40),(4840,260,22),(4841,260,47),(4842,260,21),(4843,260,11),(4844,260,116),(4845,260,90),(4846,260,16),(4847,260,87),(4848,261,16),(4849,261,19),(4850,261,17),(4851,261,22),(4852,261,80),(4853,261,11),(4854,261,46),(4855,261,40),(4856,261,43),(4857,261,77),(4858,261,87),(4859,261,74),(4863,262,137),(4864,262,138),(4865,262,9),(4866,262,6),(4867,262,62),(4868,262,32),(4869,262,112),(4870,262,97),(4871,262,140),(4872,262,141),(4873,262,11),(4874,262,2),(4875,262,8),(4876,262,7),(4877,262,142),(4878,262,143),(4894,263,22),(4895,263,74),(4896,263,135),(4897,263,43),(4898,263,40),(4899,263,19),(4900,263,13),(4901,263,11),(4902,263,80),(4903,263,16),(4904,263,46),(4905,263,87),(4909,264,111),(4910,264,113),(4911,264,114),(4912,264,2),(4913,264,19),(4914,264,43),(4915,264,46),(4916,264,40),(4917,264,11),(4918,264,115),(4919,264,22),(4920,264,90),(4921,264,112),(4922,264,16),(4923,264,87),(4924,265,11),(4925,265,14),(4926,265,15),(4927,265,16),(4928,265,9),(4929,265,17),(4930,265,18),(4931,265,19),(4932,265,20),(4933,265,21),(4934,265,22),(4935,265,23),(4936,265,24),(4937,265,92),(4938,265,93),(4939,266,16),(4940,266,19),(4941,266,17),(4942,266,22),(4943,266,80),(4944,266,11),(4945,266,46),(4946,266,40),(4947,266,43),(4948,266,77),(4949,266,87),(4950,266,74),(4954,267,107),(4955,267,6),(4956,267,27),(4957,267,28),(4958,267,96),(4959,267,91),(4960,267,55),(4961,267,9),(4962,267,29),(4963,267,100),(4964,267,11),(4965,267,32),(4966,267,8),(4967,267,110),(4969,268,137),(4970,268,138),(4971,268,9),(4972,268,6),(4973,268,62),(4974,268,32),(4975,268,112),(4976,268,97),(4977,268,140),(4978,268,141),(4979,268,11),(4980,268,2),(4981,268,8),(4982,268,7),(4983,268,142),(4984,268,143),(5000,269,22),(5001,269,74),(5002,269,135),(5003,269,43),(5004,269,40),(5005,269,19),(5006,269,13),(5007,269,11),(5008,269,80),(5009,269,16),(5010,269,46),(5011,269,87),(5012,270,11),(5013,270,14),(5014,270,15),(5015,270,16),(5016,270,9),(5017,270,17),(5018,270,18),(5019,270,19),(5020,270,20),(5021,270,21),(5022,270,22),(5023,270,23),(5024,270,24),(5025,270,92),(5026,270,93),(5027,271,33),(5028,271,44),(5029,271,26),(5030,271,45),(5031,271,43),(5032,271,46),(5033,271,40),(5034,271,22),(5035,271,47),(5036,271,21),(5037,271,11),(5038,271,116),(5039,271,90),(5040,271,16),(5041,271,87),(5119,272,16),(5120,272,19),(5121,272,17),(5122,272,22),(5123,272,80),(5124,272,11),(5125,272,46),(5126,272,40),(5127,272,43),(5128,272,77),(5129,272,87),(5130,272,74),(5134,273,34),(5135,273,81),(5136,273,82),(5137,273,83),(5138,273,26),(5139,273,61),(5140,273,62),(5141,273,9),(5142,273,31),(5143,273,7),(5144,273,11),(5145,273,32),(5146,273,84),(5147,273,85),(5148,273,86),(5149,273,8),(5150,273,90),(5151,274,111),(5152,274,113),(5153,274,114),(5154,274,2),(5155,274,19),(5156,274,43),(5157,274,46),(5158,274,40),(5159,274,11),(5160,274,115),(5161,274,22),(5162,274,90),(5163,274,112),(5164,274,16),(5165,274,87),(5166,275,34),(5167,275,81),(5168,275,82),(5169,275,83),(5170,275,26),(5171,275,61),(5172,275,62),(5173,275,9),(5174,275,31),(5175,275,7),(5176,275,11),(5177,275,32),(5178,275,84),(5179,275,85),(5180,275,86),(5181,275,8),(5182,275,90),(5197,276,9),(5198,276,147),(5199,276,145),(5200,276,22),(5201,276,11),(5202,276,6),(5203,276,148),(5204,276,149),(5205,277,20),(5206,277,22),(5207,277,9),(5208,277,150),(5209,277,151),(5210,277,115),(5211,277,152),(5212,277,153),(5213,277,11),(5214,277,90),(5220,278,16),(5221,278,9),(5222,278,77),(5223,278,78),(5224,278,74),(5225,278,22),(5226,278,79),(5227,278,11),(5235,279,107),(5236,279,6),(5237,279,27),(5238,279,28),(5239,279,96),(5240,279,91),(5241,279,55),(5242,279,9),(5243,279,29),(5244,279,100),(5245,279,11),(5246,279,32),(5247,279,8),(5248,279,110),(5250,280,124),(5251,280,125),(5252,280,126),(5253,280,9),(5254,280,61),(5255,280,102),(5256,280,86),(5257,280,22),(5258,280,11),(5259,280,103),(5260,280,105),(5261,280,104),(5480,281,11),(5481,281,14),(5482,281,15),(5483,281,16),(5484,281,9),(5485,281,17),(5486,281,18),(5487,281,19),(5488,281,20),(5489,281,21),(5490,281,22),(5491,281,23),(5492,281,24),(5493,281,92),(5494,281,93),(5495,282,16),(5496,282,9),(5497,282,77),(5498,282,78),(5499,282,74),(5500,282,22),(5501,282,79),(5502,282,11),(5541,284,133),(5542,284,9),(5543,284,74),(5544,284,22),(5545,284,11),(5546,284,134),(5547,284,128),(5548,285,112),(5549,285,144),(5550,285,69),(5551,285,8),(5552,285,9),(5553,285,51),(5554,285,91),(5555,285,145),(5556,285,61),(5557,285,146),(5558,285,32),(5559,285,11),(5560,285,56),(5601,286,137),(5602,286,138),(5603,286,9),(5604,286,6),(5605,286,62),(5606,286,32),(5607,286,112),(5608,286,97),(5609,286,140),(5610,286,141),(5611,286,11),(5612,286,2),(5613,286,8),(5614,286,7),(5615,286,142),(5616,286,143),(5632,287,9),(5633,287,8),(5634,287,11),(5635,287,26),(5636,287,27),(5637,287,28),(5638,287,29),(5639,287,30),(5640,287,31),(5641,287,7),(5642,287,17),(5643,287,32),(5644,287,33),(5645,287,132),(5647,288,26),(5648,288,71),(5649,288,72),(5650,288,43),(5651,288,73),(5652,288,74),(5653,288,34),(5654,288,21),(5655,288,11),(5656,288,76),(5657,288,42),(5658,288,32),(5659,288,62),(5660,288,90),(5661,288,112),(5662,288,22),(5663,288,25),(5678,289,107),(5679,289,6),(5680,289,27),(5681,289,28),(5682,289,96),(5683,289,91),(5684,289,55),(5685,289,9),(5686,289,29),(5687,289,100),(5688,289,11),(5689,289,32),(5690,289,8),(5691,289,110),(5693,290,6),(5694,290,9),(5695,290,27),(5696,290,28),(5697,290,96),(5698,290,119),(5699,290,120),(5700,290,32),(5701,290,121),(5702,290,22),(5703,290,91),(5704,290,8),(5705,290,11),(5706,290,26),(5707,291,11),(5708,291,14),(5709,291,15),(5710,291,16),(5711,291,9),(5712,291,17),(5713,291,18),(5714,291,19),(5715,291,20),(5716,291,21),(5717,291,22),(5718,291,23),(5719,291,24),(5720,291,92),(5721,291,93),(5722,292,16),(5723,292,19),(5724,292,17),(5725,292,22),(5726,292,80),(5727,292,11),(5728,292,46),(5729,292,40),(5730,292,43),(5731,292,77),(5732,292,87),(5733,292,74),(5737,293,111),(5738,293,113),(5739,293,114),(5740,293,2),(5741,293,19),(5742,293,43),(5743,293,46),(5744,293,40),(5745,293,11),(5746,293,115),(5747,293,22),(5748,293,90),(5749,293,112),(5750,293,16),(5751,293,87),(5752,294,137),(5753,294,138),(5754,294,9),(5755,294,6),(5756,294,62),(5757,294,32),(5758,294,112),(5759,294,97),(5760,294,140),(5761,294,141),(5762,294,11),(5763,294,2),(5764,294,8),(5765,294,7),(5766,294,142),(5767,294,143),(5783,295,6),(5784,295,9),(5785,295,27),(5786,295,28),(5787,295,96),(5788,295,119),(5789,295,120),(5790,295,32),(5791,295,121),(5792,295,22),(5793,295,91),(5794,295,8),(5795,295,11),(5796,295,26),(5798,296,107),(5799,296,6),(5800,296,27),(5801,296,28),(5802,296,96),(5803,296,91),(5804,296,55),(5805,296,9),(5806,296,29),(5807,296,100),(5808,296,11),(5809,296,32),(5810,296,8),(5811,296,110),(5827,298,33),(5828,298,44),(5829,298,26),(5830,298,45),(5831,298,43),(5832,298,46),(5833,298,40),(5834,298,22),(5835,298,47),(5836,298,21),(5837,298,11),(5838,298,116),(5839,298,90),(5840,298,16),(5841,298,87),(5842,299,16),(5843,299,19),(5844,299,17),(5845,299,22),(5846,299,80),(5847,299,11),(5848,299,46),(5849,299,40),(5850,299,43),(5851,299,77),(5852,299,87),(5853,299,74),(5857,300,22),(5858,300,74),(5859,300,135),(5860,300,43),(5861,300,40),(5862,300,19),(5863,300,13),(5864,300,11),(5865,300,80),(5866,300,16),(5867,300,46),(5868,300,87),(5872,301,111),(5873,301,113),(5874,301,114),(5875,301,2),(5876,301,19),(5877,301,43),(5878,301,46),(5879,301,40),(5880,301,11),(5881,301,115),(5882,301,22),(5883,301,90),(5884,301,112),(5885,301,16),(5886,301,87),(5887,302,6),(5888,302,9),(5889,302,27),(5890,302,28),(5891,302,96),(5892,302,119),(5893,302,120),(5894,302,32),(5895,302,121),(5896,302,22),(5897,302,91),(5898,302,8),(5899,302,11),(5900,302,26),(5902,303,32),(5903,303,107),(5904,303,49),(5905,303,61),(5906,303,56),(5907,303,51),(5908,303,108),(5909,303,102),(5910,303,27),(5911,303,28),(5912,303,54),(5913,303,6),(5914,303,55),(5915,303,11),(5916,303,8),(5917,303,9),(5933,304,111),(5934,304,113),(5935,304,114),(5936,304,2),(5937,304,19),(5938,304,43),(5939,304,46),(5940,304,40),(5941,304,11),(5942,304,115),(5943,304,22),(5944,304,90),(5945,304,112),(5946,304,16),(5947,304,87),(5948,305,11),(5949,305,14),(5950,305,15),(5951,305,16),(5952,305,9),(5953,305,17),(5954,305,18),(5955,305,19),(5956,305,20),(5957,305,21),(5958,305,22),(5959,305,23),(5960,305,24),(5961,305,92),(5962,305,93),(5963,306,11),(5964,306,14),(5965,306,15),(5966,306,16),(5967,306,9),(5968,306,17),(5969,306,18),(5970,306,19),(5971,306,20),(5972,306,21),(5973,306,22),(5974,306,23),(5975,306,24),(5976,306,92),(5977,306,93),(5978,307,11),(5979,307,14),(5980,307,15),(5981,307,16),(5982,307,9),(5983,307,17),(5984,307,18),(5985,307,19),(5986,307,20),(5987,307,21),(5988,307,22),(5989,307,23),(5990,307,24),(5991,307,92),(5992,307,93),(5993,308,33),(5994,308,44),(5995,308,26),(5996,308,45),(5997,308,43),(5998,308,46),(5999,308,40),(6000,308,22),(6001,308,47),(6002,308,21),(6003,308,11),(6004,308,116),(6005,308,90),(6006,308,16),(6007,308,87),(6008,309,31),(6009,309,43),(6010,309,27),(6011,309,80),(6012,309,85),(6013,309,20),(6014,309,95),(6015,310,31),(6016,310,43),(6017,310,27),(6018,310,80),(6019,310,85),(6020,310,20),(6021,310,95),(6022,311,1),(6023,311,2),(6024,311,3),(6025,311,4),(6026,311,5),(6027,311,6),(6028,311,7),(6029,311,8),(6030,311,9),(6031,311,10),(6032,311,11),(6033,311,12),(6034,311,13),(6044,313,31),(6045,313,43),(6046,313,27),(6047,313,80),(6048,313,85),(6049,313,20),(6050,313,95),(6051,314,31),(6052,314,43),(6053,314,27),(6054,314,80),(6055,314,85),(6056,314,20),(6057,314,95),(6058,315,32),(6059,315,48),(6060,315,49),(6061,315,50),(6062,315,51),(6063,315,52),(6064,315,20),(6065,315,53),(6066,315,54),(6067,315,6),(6068,315,55),(6069,315,11),(6073,316,47),(6074,316,115),(6075,316,35),(6076,316,117),(6077,316,37),(6078,316,38),(6079,316,16),(6080,316,45),(6081,316,118),(6082,316,87),(6083,316,40),(6084,316,22),(6085,316,41),(6086,316,11),(6087,316,42),(6088,316,43),(6089,316,90),(6104,317,33),(6105,317,44),(6106,317,26),(6107,317,45),(6108,317,43),(6109,317,46),(6110,317,40),(6111,317,22),(6112,317,47),(6113,317,21),(6114,317,11),(6115,317,116),(6116,317,90),(6117,317,16),(6118,317,87),(6119,318,33),(6120,318,44),(6121,318,26),(6122,318,45),(6123,318,43),(6124,318,46),(6125,318,40),(6126,318,22),(6127,318,47),(6128,318,21),(6129,318,11),(6130,318,116),(6131,318,90),(6132,318,16),(6133,318,87),(6134,319,34),(6135,319,81),(6136,319,82),(6137,319,83),(6138,319,26),(6139,319,61),(6140,319,62),(6141,319,9),(6142,319,31),(6143,319,7),(6144,319,11),(6145,319,32),(6146,319,84),(6147,319,85),(6148,319,86),(6149,319,8),(6150,319,90),(6151,320,16),(6152,320,19),(6153,320,43),(6154,320,80),(6155,320,42),(6156,320,22),(6157,320,17),(6158,320,74),(6159,320,11),(6166,321,107),(6167,321,6),(6168,321,27),(6169,321,28),(6170,321,96),(6171,321,91),(6172,321,55),(6173,321,9),(6174,321,29),(6175,321,100),(6176,321,11),(6177,321,32),(6178,321,8),(6179,321,110),(6181,322,33),(6182,322,44),(6183,322,26),(6184,322,45),(6185,322,43),(6186,322,46),(6187,322,40),(6188,322,22),(6189,322,47),(6190,322,21),(6191,322,11),(6192,322,116),(6193,322,90),(6194,322,16),(6195,322,87),(6196,323,11),(6197,323,20),(6198,323,74),(6199,323,22),(6200,323,154),(6201,323,155),(6202,323,9),(6203,323,156),(6204,323,157),(6205,323,115),(6206,323,158),(6207,323,159),(6208,323,160),(6209,323,161),(6210,323,90),(6211,323,25),(6227,324,34),(6228,324,81),(6229,324,82),(6230,324,83),(6231,324,26),(6232,324,61),(6233,324,62),(6234,324,9),(6235,324,31),(6236,324,7),(6237,324,11),(6238,324,32),(6239,324,84),(6240,324,85),(6241,324,86),(6242,324,8),(6243,324,90),(6258,325,11),(6259,325,14),(6260,325,15),(6261,325,16),(6262,325,9),(6263,325,17),(6264,325,18),(6265,325,19),(6266,325,20),(6267,325,21),(6268,325,22),(6269,325,23),(6270,325,24),(6271,325,92),(6272,325,93),(6273,326,16),(6274,326,19),(6275,326,17),(6276,326,22),(6277,326,80),(6278,326,11),(6279,326,46),(6280,326,40),(6281,326,43),(6282,326,77),(6283,326,87),(6284,326,74),(6288,327,163),(6289,327,164),(6290,327,165),(6291,327,11),(6295,328,34),(6296,328,81),(6297,328,82),(6298,328,83),(6299,328,26),(6300,328,61),(6301,328,62),(6302,328,9),(6303,328,31),(6304,328,7),(6305,328,11),(6306,328,32),(6307,328,84),(6308,328,85),(6309,328,86),(6310,328,8),(6311,328,90),(6326,329,16),(6327,329,19),(6328,329,17),(6329,329,22),(6330,329,80),(6331,329,11),(6332,329,46),(6333,329,40),(6334,329,43),(6335,329,77),(6336,329,87),(6337,329,74),(6338,330,26),(6339,330,71),(6340,330,72),(6341,330,43),(6342,330,73),(6343,330,74),(6344,330,34),(6345,330,21),(6346,330,11),(6347,330,76),(6348,330,42),(6349,330,32),(6350,330,62),(6351,330,90),(6352,330,112),(6353,330,22),(6354,330,25),(6369,331,124),(6370,331,125),(6371,331,126),(6372,331,9),(6373,331,61),(6374,331,102),(6375,331,86),(6376,331,22),(6377,331,11),(6378,331,103),(6379,331,105),(6380,331,104),(6381,332,111),(6382,332,113),(6383,332,114),(6384,332,2),(6385,332,19),(6386,332,43),(6387,332,46),(6388,332,40),(6389,332,11),(6390,332,115),(6391,332,22),(6392,332,90),(6393,332,112),(6394,332,16),(6395,332,87),(6396,333,33),(6397,333,44),(6398,333,26),(6399,333,45),(6400,333,43),(6401,333,46),(6402,333,40),(6403,333,22),(6404,333,47),(6405,333,21),(6406,333,11),(6407,333,116),(6408,333,90),(6409,333,16),(6410,333,87),(6411,334,16),(6412,334,19),(6413,334,17),(6414,334,22),(6415,334,80),(6416,334,11),(6417,334,46),(6418,334,40),(6419,334,43),(6420,334,77),(6421,334,87),(6422,334,74),(6426,335,26),(6427,335,71),(6428,335,72),(6429,335,43),(6430,335,73),(6431,335,74),(6432,335,34),(6433,335,21),(6434,335,11),(6435,335,76),(6436,335,42),(6437,335,32),(6438,335,62),(6439,335,90),(6440,335,112),(6441,335,22),(6442,335,25),(6487,336,133),(6488,336,9),(6489,336,74),(6490,336,22),(6491,336,11),(6492,336,134),(6493,336,128),(6494,337,137),(6495,337,138),(6496,337,9),(6497,337,6),(6498,337,62),(6499,337,32),(6500,337,112),(6501,337,97),(6502,337,140),(6503,337,141),(6504,337,11),(6505,337,2),(6506,337,8),(6507,337,7),(6508,337,142),(6509,337,143),(6525,338,20),(6526,338,22),(6527,338,9),(6528,338,150),(6529,338,151),(6530,338,115),(6531,338,152),(6532,338,153),(6533,338,11),(6534,338,90),(6535,339,11),(6536,339,14),(6537,339,15),(6538,339,16),(6539,339,9),(6540,339,17),(6541,339,18),(6542,339,19),(6543,339,20),(6544,339,21),(6545,339,22),(6546,339,23),(6547,339,24),(6548,339,92),(6549,339,93),(6550,340,124),(6551,340,125),(6552,340,126),(6553,340,9),(6554,340,61),(6555,340,102),(6556,340,86),(6557,340,22),(6558,340,11),(6559,340,103),(6560,340,105),(6561,340,104),(6565,341,112),(6566,341,144),(6567,341,69),(6568,341,8),(6569,341,9),(6570,341,51),(6571,341,91),(6572,341,145),(6573,341,61),(6574,341,146),(6575,341,32),(6576,341,11),(6577,341,56),(6578,342,16),(6579,342,45),(6580,342,43),(6581,342,46),(6582,342,166),(6583,342,13),(6584,342,80),(6585,342,167),(6586,342,168),(6587,342,169),(6588,342,99),(6589,342,171),(6590,342,172),(6591,342,173),(6592,342,174),(6593,343,175),(6594,343,176),(6595,343,177),(6596,343,166),(6597,343,178),(6598,343,9),(6599,343,173),(6600,343,174),(6601,343,179),(6602,343,32),(6603,343,180),(6604,343,11),(6605,344,111),(6606,344,113),(6607,344,114),(6608,344,2),(6609,344,19),(6610,344,43),(6611,344,46),(6612,344,40),(6613,344,11),(6614,344,115),(6615,344,22),(6616,344,90),(6617,344,112),(6618,344,16),(6619,344,87),(6620,345,33),(6621,345,44),(6622,345,26),(6623,345,45),(6624,345,43),(6625,345,46),(6626,345,40),(6627,345,22),(6628,345,47),(6629,345,21),(6630,345,11),(6631,345,116),(6632,345,90),(6633,345,16),(6634,345,87),(6635,346,16),(6636,346,19),(6637,346,17),(6638,346,22),(6639,346,80),(6640,346,11),(6641,346,46),(6642,346,40),(6643,346,43),(6644,346,77),(6645,346,87),(6646,346,74),(6650,347,133),(6651,347,9),(6652,347,74),(6653,347,22),(6654,347,11),(6655,347,134),(6656,347,128),(6657,348,34),(6658,348,81),(6659,348,82),(6660,348,83),(6661,348,26),(6662,348,61),(6663,348,62),(6664,348,9),(6665,348,31),(6666,348,7),(6667,348,11),(6668,348,32),(6669,348,84),(6670,348,85),(6671,348,86),(6672,348,8),(6673,348,90),(6688,349,6),(6689,349,9),(6690,349,27),(6691,349,28),(6692,349,96),(6693,349,119),(6694,349,120),(6695,349,32),(6696,349,121),(6697,349,22),(6698,349,91),(6699,349,8),(6700,349,11),(6701,349,26),(6703,350,6),(6704,350,9),(6705,350,27),(6706,350,28),(6707,350,96),(6708,350,119),(6709,350,120),(6710,350,32),(6711,350,121),(6712,350,22),(6713,350,91),(6714,350,8),(6715,350,11),(6716,350,26),(6717,351,20),(6718,351,22),(6719,351,9),(6720,351,150),(6721,351,151),(6722,351,115),(6723,351,152),(6724,351,153),(6725,351,11),(6726,351,90),(6732,352,112),(6733,352,144),(6734,352,69),(6735,352,8),(6736,352,9),(6737,352,51),(6738,352,91),(6739,352,145),(6740,352,61),(6741,352,146),(6742,352,32),(6743,352,11),(6744,352,56),(6747,353,9),(6748,353,8),(6749,353,11),(6750,353,26),(6751,353,27),(6752,353,28),(6753,353,29),(6754,353,30),(6755,353,31),(6756,353,7),(6757,353,17),(6758,353,32),(6759,353,33),(6760,353,132),(6762,354,137),(6763,354,138),(6764,354,9),(6765,354,6),(6766,354,62),(6767,354,32),(6768,354,112),(6769,354,97),(6770,354,140),(6771,354,141),(6772,354,11),(6773,354,2),(6774,354,8),(6775,354,7),(6776,354,142),(6777,354,143),(6778,355,16),(6779,355,19),(6780,355,17),(6781,355,22),(6782,355,80),(6783,355,11),(6784,355,46),(6785,355,40),(6786,355,43),(6787,355,77),(6788,355,87),(6789,355,74),(6793,356,111),(6794,356,113),(6795,356,114),(6796,356,2),(6797,356,19),(6798,356,43),(6799,356,46),(6800,356,40),(6801,356,11),(6802,356,115),(6803,356,22),(6804,356,90),(6805,356,112),(6806,356,16),(6807,356,87);
/*!40000 ALTER TABLE `tarea` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarea_operario`
--

DROP TABLE IF EXISTS `tarea_operario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tarea_operario` (
  `Tarea_Operario_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Tarea_Id` int(11) NOT NULL,
  `Operario_Id` int(11) NOT NULL,
  `Tarea_Cantidad` int(11) NOT NULL,
  PRIMARY KEY (`Tarea_Operario_Id`),
  KEY `Tarea_Id` (`Tarea_Id`),
  KEY `Operario_Id` (`Operario_Id`),
  CONSTRAINT `tarea_operario_ibfk_1` FOREIGN KEY (`Tarea_Id`) REFERENCES `tarea` (`Tarea_Id`),
  CONSTRAINT `tarea_operario_ibfk_2` FOREIGN KEY (`Operario_Id`) REFERENCES `operario` (`Operario_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3035 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarea_operario`
--

LOCK TABLES `tarea_operario` WRITE;
/*!40000 ALTER TABLE `tarea_operario` DISABLE KEYS */;
INSERT INTO `tarea_operario` VALUES (311,2783,1001,212),(312,2785,1001,212),(313,2786,1001,212),(314,2792,1001,212),(315,2784,1008,212),(316,2790,1008,80),(317,2791,1008,80),(318,2793,2000,212),(319,2791,52374111,132),(320,2790,52374111,132),(321,2780,52374111,212),(322,2781,52374111,212),(323,2782,52374111,212),(324,2787,52374111,212),(325,2788,52374111,212),(326,2779,52374111,212),(327,2789,1024589319,212),(329,2815,1000,89),(330,2888,1001,89),(331,2813,1001,89),(332,2820,1001,89),(333,2812,1001,89),(334,2818,1008,89),(335,2817,1008,89),(336,2816,52374111,89),(337,2814,1001,89),(338,2819,52374111,89),(339,2823,52374111,89),(340,2822,52374111,89),(341,2821,1024589319,89),(342,2824,52374111,89),(343,2827,1001,178),(344,2828,1001,178),(345,2833,1001,178),(346,2831,1008,178),(347,2829,52374111,178),(348,2830,52374111,178),(349,2834,52374111,178),(350,2832,1024589319,178),(351,2849,1001,162),(352,2857,1001,162),(353,2847,1001,162),(354,2850,1001,162),(355,2855,1001,81),(356,2855,1008,81),(357,2844,1008,162),(358,2854,1008,162),(359,2845,1008,162),(360,2843,1008,162),(361,2842,52374111,162),(362,2846,52374111,162),(363,2848,52374111,162),(364,2851,52374111,162),(365,2852,52374111,162),(366,2856,52374111,162),(367,2858,52374111,162),(368,2853,1024589319,162),(369,2876,1000,51),(370,2876,1008,38),(373,2877,1008,38),(374,2879,1008,89),(375,2880,1008,89),(376,2885,1008,89),(377,2874,1001,89),(378,2875,1001,89),(379,2881,1001,89),(380,2873,1001,89),(381,2877,52374111,51),(382,2878,1008,89),(383,2884,52374111,89),(384,2889,1001,89),(385,2883,1024589319,89),(386,2882,1024589319,89),(387,2971,1001,190),(388,2974,1001,190),(389,2975,1001,190),(390,2981,1001,95),(391,2977,1001,95),(392,2968,1008,95),(393,2970,1008,95),(394,2980,1008,95),(395,2979,1008,190),(396,2978,1008,190),(397,2969,1008,190),(398,2983,2000,190),(399,2973,52374111,190),(400,2967,52374111,190),(401,2968,52374111,95),(402,2970,52374111,95),(403,2972,52374111,95),(404,2980,52374111,95),(405,2982,52374111,190),(406,2976,1024589319,190),(407,3000,1001,190),(408,2999,1001,190),(409,3001,1001,190),(410,3004,1001,190),(411,3002,1001,190),(412,2998,1008,190),(413,3007,1008,190),(414,3011,1008,190),(415,3009,2000,190),(416,3003,52374111,190),(417,3006,52374111,190),(418,3012,52374111,190),(419,3010,1024589319,190),(420,3005,1024589319,190),(421,3008,2000,190),(422,3022,1000,190),(423,3014,1001,190),(424,3020,1001,190),(425,3028,1001,190),(426,3018,1001,60),(431,3013,1008,190),(432,3019,1008,190),(433,3023,1008,190),(434,3015,52374111,190),(435,3016,52374111,190),(436,3017,52374111,190),(437,3024,52374111,190),(438,3021,52374111,190),(439,3027,52374111,190),(440,3026,52374111,95),(441,3018,52374111,130),(442,3025,1024589319,130),(443,3026,1001,95),(444,3032,1000,95),(445,3030,1001,95),(446,3031,1001,95),(447,3029,1001,95),(449,3033,52374111,95),(450,3038,52374111,95),(451,3034,52374111,95),(452,3035,52374111,95),(453,3036,52374111,95),(454,3037,52374111,95),(455,3039,52374111,95),(456,3040,52374111,95),(457,3041,52374111,95),(458,3042,52374111,95),(461,3094,1001,210),(462,3095,1001,210),(463,3093,1001,210),(464,3100,1001,210),(465,3092,1008,210),(466,3099,1008,210),(467,3090,1008,210),(468,3091,1008,210),(469,3101,2000,210),(470,3089,52374111,210),(471,3096,52374111,210),(472,3097,52374111,210),(473,3098,1001,210),(474,3059,1001,210),(475,3060,1001,210),(476,3067,1001,210),(477,3063,1001,210),(479,3070,1008,210),(480,3065,1008,210),(481,3061,52374111,210),(482,3066,52374111,210),(483,3068,52374111,210),(485,3069,52374111,210),(486,3064,1001,210),(487,3080,1000,105),(488,3078,1001,105),(489,3075,1001,105),(490,3077,1008,105),(491,3079,1008,105),(492,3074,52374111,105),(493,3076,52374111,105),(494,3081,1024589319,105),(495,3082,1008,105),(496,3062,1024589319,210),(497,3121,1001,210),(498,3124,1001,210),(499,3123,1001,210),(500,3130,1001,210),(501,3125,1008,210),(502,3129,1008,210),(503,3128,1008,210),(504,3131,2000,210),(505,3120,52374111,210),(506,3118,52374111,210),(507,3119,52374111,210),(508,3126,52374111,210),(509,3122,52374111,210),(510,3127,1024589319,210),(511,3117,1001,210),(512,3139,1000,188),(513,3140,1001,188),(514,3133,1001,188),(515,3137,1001,188),(516,3135,1001,188),(517,3142,1001,94),(518,3142,1024589319,94),(519,3136,1008,188),(520,3143,1008,188),(521,3141,1008,188),(522,3132,52374111,188),(523,3134,52374111,188),(524,3144,52374111,188),(525,3138,1024589319,188),(526,3150,1001,210),(527,3148,1001,210),(528,3149,1008,210),(529,3152,1008,210),(530,3153,1008,210),(531,3154,1001,210),(532,3156,1001,210),(533,3147,52374111,210),(534,3151,52374111,210),(535,3155,1024589319,210),(536,3158,1001,94),(537,3165,1001,94),(538,3160,1001,94),(539,3161,1008,94),(540,3157,1008,94),(541,3168,1008,94),(542,3167,1008,94),(543,3166,1008,94),(544,3159,52374111,94),(545,3164,52374111,94),(546,3169,52374111,94),(547,3163,1024589319,94),(548,3162,1024589319,94),(549,3179,1001,94),(550,3176,1001,94),(551,3173,1008,94),(552,3175,1008,94),(553,3185,1008,94),(554,3183,1008,94),(555,3174,1008,94),(556,3182,1008,94),(557,3178,1008,94),(558,3184,1008,94),(559,3188,2000,94),(560,3187,52374111,94),(561,3172,52374111,94),(562,3177,52374111,94),(563,3180,1024589319,94),(564,3181,1024589319,94),(565,3186,1024589319,94),(566,3207,1001,190),(567,3216,1001,190),(568,3209,1001,190),(569,3210,1001,190),(570,3214,1008,190),(571,3215,1008,190),(572,3211,1008,190),(573,3217,2000,190),(574,3203,1001,190),(575,3204,52374111,190),(576,3205,52374111,190),(577,3206,52374111,190),(578,3208,52374111,190),(579,3212,52374111,190),(580,3213,1024589319,190),(581,3221,1001,190),(583,3218,1008,62),(584,3219,1008,62),(585,3220,1008,190),(586,3223,1008,95),(587,3224,1008,190),(588,3225,1001,190),(589,3218,52374111,128),(590,3219,52374111,128),(591,3222,52374111,190),(592,3223,1001,95),(593,3226,1024589319,190),(594,3227,1000,95),(595,3227,1001,95),(596,3247,2000,234),(597,3247,1000,51),(598,3237,1001,285),(599,3239,1001,285),(600,3240,1001,285),(601,3241,1008,285),(602,3244,1008,285),(603,3245,1008,285),(604,3233,1008,142),(605,3234,52374111,285),(606,3235,52374111,285),(607,3242,52374111,285),(608,3236,52374111,285),(609,3238,52374111,285),(610,3246,1001,285),(611,3233,1024589319,143),(613,3243,1024589319,285),(614,3255,1001,101),(615,3256,1001,101),(616,3248,52374111,101),(617,3249,52374111,51),(618,3250,52374111,51),(619,3251,52374111,101),(620,3252,52374111,101),(621,3257,52374111,101),(622,3259,52374111,101),(623,3260,52374111,101),(624,3261,52374111,101),(625,3258,1000,101),(626,3254,1024589319,101),(627,3253,1024589319,101),(628,3250,1024589319,50),(629,3249,1024589319,50),(630,3269,1001,202),(631,3279,1001,202),(632,3270,1001,202),(633,3287,1001,202),(634,3283,1001,202),(635,3263,1008,202),(636,3264,1008,101),(637,3268,1008,101),(638,3265,1008,202),(639,3272,1008,101),(640,3272,1001,101),(641,3264,52374111,101),(642,3268,52374111,101),(643,3271,52374111,202),(644,3285,1008,202),(645,3281,1024589319,202),(646,3296,1001,104),(647,3295,1001,104),(648,3292,1001,104),(649,3289,1008,104),(650,3291,1008,104),(651,3299,1008,104),(652,3301,1008,104),(653,3290,1008,104),(654,3300,1008,104),(655,3302,1008,104),(656,3304,2000,104),(657,3298,2000,104),(658,3288,52374111,104),(659,3293,52374111,104),(660,3294,52374111,104),(661,3303,52374111,104),(662,3297,1024589319,104),(663,3330,1001,104),(664,3325,1001,104),(665,3327,1001,104),(666,3319,1001,104),(667,3320,1001,104),(668,3324,1008,104),(669,3321,52374111,104),(670,3322,1024589319,104),(671,3323,1001,104),(672,3326,52374111,104),(673,3328,52374111,104),(674,3329,52374111,104),(677,3370,1001,104),(678,3368,1001,104),(679,3369,1001,104),(680,3365,1008,104),(681,3366,1008,104),(682,3374,1008,104),(683,3373,1008,52),(684,3373,52374111,52),(686,3364,52374111,104),(687,3367,52374111,104),(688,3371,1001,104),(689,3372,52374111,104),(690,3375,52374111,104),(691,3376,52374111,104),(692,3350,1001,104),(693,3353,1001,104),(694,3356,1001,104),(695,3354,1008,104),(696,3352,1008,104),(697,3357,1001,104),(698,3349,52374111,104),(699,3351,52374111,104),(700,3355,1001,104),(701,3393,1001,216),(702,3396,1001,216),(703,3394,1001,216),(704,3395,1001,216),(705,3398,1001,216),(706,3401,1001,108),(707,3401,1024589319,108),(708,3409,1001,216),(709,3407,1008,216),(710,3400,1008,216),(711,3404,1008,216),(712,3406,2000,216),(713,3405,52374111,216),(714,3399,52374111,216),(715,3397,52374111,216),(716,3402,2000,216),(717,3403,1024589319,216),(718,3408,1024589319,216),(719,3424,1001,108),(720,3436,1001,108),(721,3426,1001,108),(722,3432,1001,108),(723,3431,1008,108),(724,3433,1008,108),(725,3439,1008,108),(726,3434,1008,108),(727,3428,1008,108),(728,3435,2000,108),(729,3430,52374111,108),(730,3429,52374111,108),(731,3427,1024589319,108),(732,3425,1024589319,108),(733,3437,1024589319,108),(734,3438,1024589319,108),(735,3462,1001,108),(736,3463,1001,108),(737,3459,1001,108),(738,3469,1001,108),(739,3468,1008,108),(740,3467,1008,108),(741,3466,1008,108),(742,3457,1008,108),(743,3456,1008,108),(744,3458,1008,108),(745,3460,1008,108),(746,3471,2000,108),(747,3455,52374111,108),(748,3461,52374111,108),(749,3464,1024589319,108),(750,3470,1024589319,108),(751,3465,1024589319,54),(752,3465,1001,54),(753,3478,1001,200),(754,3486,1001,200),(755,3482,1001,200),(756,3479,1001,200),(757,3483,1001,100),(758,3487,1008,200),(759,3485,1008,200),(760,3480,1008,200),(761,3488,1008,200),(762,3484,1024589319,200),(763,3483,1024589319,100),(765,3481,1024589319,200),(766,3489,1024589319,200),(767,3498,1001,200),(768,3496,1001,200),(769,3500,1001,200),(770,3499,1001,200),(771,3505,1008,200),(772,3494,1008,200),(773,3493,1008,200),(774,3502,1008,200),(775,3506,1001,200),(776,3504,2000,200),(777,3495,1024589319,200),(778,3497,1024589319,200),(779,3501,1024589319,100),(780,3501,1001,100),(781,3503,1024589319,200),(782,3515,1001,214),(783,3514,1001,214),(784,3517,1001,214),(785,3518,1001,214),(786,3520,1001,60),(787,3524,1001,214),(788,3522,1008,214),(789,3523,1008,214),(790,3512,1008,214),(791,3513,1008,214),(792,3516,1008,214),(793,3520,1008,154),(794,3511,1008,107),(795,3511,1024589319,107),(796,3525,2000,214),(797,3519,1024589319,214),(798,3521,1024589319,214),(799,3528,1001,100),(800,3530,1001,100),(801,3529,1001,100),(802,3531,1001,100),(803,3532,1001,100),(804,3526,1008,100),(805,3527,1008,100),(806,3535,1008,100),(807,3536,1008,50),(808,3536,1024589319,50),(809,3533,1024589319,100),(810,3534,1024589319,100),(811,3537,1024589319,100),(812,3590,2000,100),(813,3549,1001,107),(814,3545,1001,107),(815,3548,1001,107),(816,3551,1001,107),(817,3542,1008,107),(818,3543,1008,107),(819,3544,1008,107),(820,3546,1008,107),(821,3547,1008,107),(822,3553,1008,107),(823,3554,1008,107),(824,3555,1008,107),(825,3557,2000,107),(826,3556,1024589319,107),(827,3552,1024589319,107),(828,3550,1024589319,107),(829,3541,1024589319,107),(830,3591,1001,208),(831,3599,1001,208),(832,3594,1001,208),(833,3596,1008,208),(834,3598,1008,208),(835,3602,1008,208),(836,3597,1001,208),(837,3601,1008,208),(838,3603,1008,208),(839,3637,1008,208),(840,3593,1008,104),(841,3593,1001,104),(842,3592,1024589319,208),(843,3595,1024589319,208),(844,3600,1024589319,208),(845,3606,1001,208),(846,3607,1001,208),(847,3608,1001,208),(848,3609,1001,208),(849,3611,1001,208),(850,3610,1008,208),(851,3613,1008,208),(852,3617,1008,208),(853,3618,1008,208),(854,3620,1008,208),(855,3622,1001,60),(856,3622,1008,148),(857,3614,1008,104),(858,3614,1001,104),(859,3615,2000,208),(860,3619,2000,208),(861,3616,1024589319,208),(862,3612,1024589319,208),(863,3621,1024589319,208),(864,3642,1001,208),(865,3646,1001,208),(866,3645,1001,208),(867,3648,1001,104),(868,3648,1024589319,104),(869,3644,1008,208),(870,3639,1008,208),(871,3649,1008,208),(872,3650,1008,208),(873,3640,1008,208),(874,3641,1008,208),(875,3643,1008,208),(876,3651,1008,208),(877,3652,1008,104),(878,3652,1001,104),(879,3654,2000,208),(880,3647,1024589319,208),(881,3638,1024589319,208),(882,3653,1024589319,208),(883,3672,1001,100),(884,3673,1001,100),(885,3674,1001,100),(886,3675,1001,100),(887,3676,1001,100),(888,3671,1008,100),(889,3670,1008,100),(890,3669,1008,100),(891,3677,1008,100),(892,3678,1008,100),(893,3681,1008,100),(894,3682,1008,100),(895,3680,2000,100),(896,3679,1024589319,100),(897,3684,1001,100),(898,3685,1001,100),(899,3690,1001,100),(900,3688,1001,100),(901,3686,1008,100),(902,3687,1008,100),(903,3691,1008,50),(904,3691,1001,50),(906,3689,1024589319,100),(907,3696,1001,264),(908,3698,1001,264),(909,3699,1001,264),(910,3692,1001,264),(911,3705,1008,264),(912,3703,1008,264),(913,3704,1008,264),(914,3700,1008,90),(915,3700,1024589319,174),(916,3706,2000,264),(917,3693,52374111,264),(918,3694,52374111,264),(919,3695,52374111,264),(920,3697,1008,264),(921,3701,52374111,264),(922,3702,1024589319,264),(923,3707,1001,174),(924,3708,1001,174),(925,3713,1001,174),(926,3714,1001,174),(927,3715,1001,174),(928,3711,1001,174),(929,3717,1001,174),(930,3718,1001,174),(931,3716,1008,174),(932,3709,1008,174),(933,3712,2000,174),(934,3710,1024589319,174),(935,3727,1000,174),(936,3723,1001,174),(937,3722,1001,174),(938,3721,1001,174),(939,3750,1001,174),(940,3724,1001,174),(941,3725,1001,174),(942,3719,1008,174),(943,3728,1008,174),(944,3730,52374111,174),(945,3720,52374111,174),(946,3729,2000,130),(947,3731,52374111,84),(948,3731,2000,90),(949,3726,1024589319,174),(950,3729,52374111,44),(951,3736,52374111,174),(952,3742,1001,100),(953,3742,52374111,74),(954,3745,2000,174),(955,3739,1001,174),(956,3737,1001,174),(957,3738,1001,174),(958,3740,1001,174),(959,3741,1001,174),(960,3735,1008,174),(961,3746,1008,174),(962,3743,1008,174),(963,3734,1008,174),(965,3744,1024589319,174),(966,3752,1001,174),(967,3757,1001,174),(968,3753,1001,174),(969,3756,1008,174),(970,3751,52374111,174),(971,3754,1024589319,174),(972,3755,1008,174),(973,3758,1001,100),(974,3759,1001,100),(975,3766,1001,100),(976,3764,1001,100),(977,3765,1001,100),(978,3762,1001,100),(979,3768,1001,100),(980,3769,1001,100),(981,3767,1008,100),(982,3760,1008,100),(983,3761,1024589319,100),(984,3763,1001,100),(985,3777,1001,125),(986,3779,1001,125),(987,3780,1001,125),(989,3782,1001,125),(990,3786,1001,125),(991,3776,52374111,125),(992,3774,52374111,125),(993,3775,52374111,125),(994,3778,1008,125),(995,3785,1008,125),(996,3784,1008,125),(997,3781,1024589319,125),(998,3783,1024589319,125),(999,3787,2000,125),(1000,3773,1008,125),(1001,3792,1001,144),(1002,3794,1001,144),(1003,3795,1001,144),(1004,3797,1001,144),(1005,3801,1001,144),(1006,3800,1008,144),(1007,3793,1008,144),(1008,3802,2000,144),(1009,3788,52374111,144),(1010,3791,52374111,144),(1011,3789,52374111,144),(1012,3790,52374111,144),(1013,3796,1024589319,144),(1014,3798,1024589319,144),(1015,3799,1008,144),(1017,3805,1008,72),(1018,3810,1001,72),(1019,3803,52374111,72),(1020,3804,52374111,72),(1021,3806,52374111,72),(1022,3807,52374111,72),(1023,3808,52374111,72),(1024,3809,52374111,72),(1025,3811,52374111,72),(1026,3812,1008,72),(1027,3819,1001,144),(1028,3840,1001,144),(1029,3821,1001,144),(1030,3823,1001,24),(1031,3823,2000,120),(1032,3818,1008,144),(1033,3820,1008,144),(1034,3822,52374111,144),(1035,3824,1001,144),(1037,3828,1001,24),(1038,3831,1001,24),(1039,3842,1001,24),(1040,3842,52374111,120),(1041,3831,52374111,120),(1042,3828,52374111,120),(1043,3833,1001,72),(1044,3833,1024589319,72),(1045,3827,1008,144),(1046,3832,1008,144),(1047,3830,1001,144),(1048,3829,1001,144),(1049,3834,1001,144),(1050,3826,1001,144),(1051,3825,52374111,144),(1052,3848,1001,94),(1053,3844,1001,94),(1054,3851,1001,94),(1055,3846,1001,94),(1056,3852,1008,94),(1057,3843,52374111,94),(1058,3845,52374111,94),(1059,3847,52374111,94),(1060,3854,1008,94),(1061,3855,52374111,94),(1062,3853,1024589319,94),(1063,3850,1024589319,94),(1064,3849,1024589319,94),(1065,3866,1001,188),(1066,3862,1001,188),(1067,3865,1001,188),(1068,3859,1008,188),(1069,3861,1008,188),(1070,3869,1008,188),(1071,3871,1008,188),(1072,3860,1008,188),(1073,3868,1008,188),(1074,3874,2000,188),(1075,3863,1008,188),(1076,3870,1008,188),(1077,3858,52374111,188),(1078,3864,52374111,188),(1079,3872,52374111,188),(1080,3867,1024589319,188),(1081,3873,1024589319,188),(1082,3889,1001,94),(1083,3890,1001,94),(1084,3893,1001,94),(1085,3895,1001,94),(1086,3891,52374111,94),(1087,3892,52374111,94),(1088,3894,1024589319,94),(1089,3896,1024589319,94),(1090,3904,1001,94),(1091,3905,1001,94),(1092,3908,1001,94),(1093,3910,1001,94),(1094,3911,1001,94),(1095,3912,1001,94),(1096,3914,1001,94),(1097,3909,1001,94),(1098,3915,1001,94),(1099,3913,52374111,94),(1100,3906,52374111,94),(1101,3907,1024589319,94),(1102,3919,1001,94),(1103,3920,1001,94),(1104,3921,1001,94),(1105,3926,1001,94),(1106,3927,1001,94),(1107,3929,1001,94),(1108,3922,2000,94),(1109,3923,52374111,94),(1110,3928,52374111,94),(1111,3930,1008,94),(1112,3932,52374111,94),(1113,3931,1024589319,94),(1114,3925,1024589319,94),(1115,3924,1024589319,94),(1116,3934,1001,94),(1117,3935,1001,94),(1118,3936,1001,94),(1119,3937,1001,94),(1120,3946,1001,94),(1121,3940,1008,94),(1122,3941,1008,94),(1123,3942,1008,94),(1124,3944,1008,94),(1125,3945,1008,94),(1126,3939,1008,94),(1127,3943,1008,94),(1128,3938,52374111,94),(1129,3947,1024589319,94),(1130,3948,1024589319,94),(1131,3949,1001,87),(1132,3950,1001,87),(1133,3953,1001,87),(1134,3955,1001,87),(1135,3956,1001,87),(1136,3951,52374111,87),(1137,3952,52374111,87),(1138,3954,1024589319,87),(1139,3965,52374111,261),(1140,3975,52374111,261),(1141,3968,52374111,130),(1142,3977,52374111,130),(1143,3967,52374111,130),(1144,3967,1001,131),(1145,3968,1001,131),(1146,3977,1001,131),(1147,3969,1001,261),(1148,3970,1001,261),(1149,3966,1001,261),(1150,3964,1008,261),(1151,3971,1024589319,261),(1152,3972,1024589319,261),(1153,3974,52374111,261),(1154,3973,1008,261),(1155,3976,2000,180),(1156,3976,52374111,81),(1157,3980,1001,87),(1158,3979,1001,87),(1159,3981,1001,87),(1160,3982,1001,87),(1161,3987,1008,87),(1163,3989,1008,87),(1164,3984,1008,87),(1165,3983,52374111,87),(1166,3985,52374111,87),(1167,3986,52374111,87),(1168,3988,52374111,87),(1169,3990,52374111,87),(1170,3991,1001,87),(1171,3992,52374111,87),(1172,3993,1024589319,87),(1173,3998,1001,174),(1174,3997,1001,174),(1175,3999,1001,174),(1176,4000,1001,174),(1177,4001,1001,174),(1178,3995,1008,174),(1179,4006,1008,174),(1180,4003,1008,174),(1181,3994,52374111,174),(1182,4002,52374111,174),(1183,3996,1024589319,174),(1184,4004,1024589319,174),(1185,4005,2000,174),(1186,4011,1001,517),(1187,4013,1001,517),(1188,4014,1001,517),(1189,4020,1001,517),(1190,4016,1001,140),(1191,4019,1008,517),(1192,4018,1008,517),(1193,4012,1008,517),(1194,4021,2000,517),(1195,4010,52374111,517),(1196,4008,52374111,517),(1197,4009,52374111,517),(1198,4016,52374111,377),(1199,4015,52374111,259),(1200,4015,1024589319,258),(1201,4017,1024589319,517),(1202,4007,2000,170),(1203,4007,1024589319,110),(1204,4007,1008,118),(1205,4007,52374111,119),(1206,4026,1001,87),(1207,4029,1001,87),(1208,4030,1001,87),(1209,4023,1008,87),(1210,4025,1008,87),(1211,4035,1008,87),(1212,4027,1008,87),(1213,4034,1008,87),(1214,4024,1008,87),(1215,4036,1008,87),(1216,4033,1008,87),(1217,4038,2000,87),(1218,4032,2000,87),(1219,4022,52374111,87),(1220,4028,52374111,87),(1223,4031,1024589319,87),(1225,4037,52374111,87),(1226,4056,1001,87),(1227,4058,1001,87),(1228,4055,1008,87),(1229,4059,1008,87),(1230,4060,1008,87),(1231,4057,52374111,87),(1232,4053,52374111,87),(1233,4054,52374111,87),(1234,4061,1024589319,87),(1235,4062,1008,87),(1236,4075,1001,188),(1237,4069,1001,188),(1238,4071,1001,188),(1239,4068,1008,188),(1240,4070,52374111,188),(1241,4074,1001,188),(1242,4072,1024589319,188),(1243,4073,1024589319,47),(1244,4073,1008,47),(1245,4073,52374111,47),(1246,4073,1001,47),(1247,4076,1001,180),(1248,4079,1001,180),(1249,4086,1001,180),(1250,4077,1001,180),(1251,4078,1001,180),(1252,4081,1001,180),(1253,4090,1008,180),(1254,4088,1008,90),(1255,4088,52374111,90),(1256,4083,1008,180),(1257,4092,1008,180),(1258,4080,52374111,180),(1259,4082,52374111,180),(1260,4087,52374111,180),(1261,4085,2000,180),(1262,4089,2000,180),(1263,4091,1024589319,180),(1264,4084,1024589319,90),(1265,4084,52374111,90),(1266,4111,1001,180),(1267,4114,1001,180),(1268,4115,1001,180),(1269,4117,1001,180),(1270,4109,1008,180),(1271,4119,1008,180),(1272,4121,1008,180),(1273,4123,2000,180),(1275,4107,52374111,180),(1276,4108,52374111,180),(1277,4110,52374111,180),(1278,4112,52374111,180),(1279,4113,52374111,180),(1280,4118,52374111,180),(1281,4120,52374111,180),(1282,4122,1024589319,180),(1283,4138,1001,180),(1284,4142,1001,180),(1285,4141,1001,180),(1286,4143,1008,180),(1287,4144,1001,180),(1288,4150,1008,180),(1289,4148,52374111,180),(1290,4145,52374111,180),(1291,4140,52374111,180),(1292,4146,1001,180),(1293,4149,52374111,180),(1294,4147,1024589319,180),(1295,4139,1024589319,180),(1296,4151,52374111,180),(1297,4155,1001,180),(1298,4153,1001,180),(1299,4154,1001,180),(1300,4165,1001,180),(1301,4163,1008,180),(1302,4158,1008,180),(1303,4162,1008,180),(1304,4157,1008,90),(1305,4157,52374111,90),(1306,4161,52374111,70),(1307,4161,1008,110),(1308,4159,52374111,180),(1309,4160,52374111,180),(1310,4156,1024589319,180),(1311,4167,1024589319,180),(1312,4166,1024589319,180),(1313,4164,1008,36),(1314,4164,52374111,144),(1315,4116,1024589319,180),(1316,4181,1001,218),(1317,4172,1001,218),(1318,4174,1001,218),(1319,4175,1001,218),(1320,4168,1001,109),(1321,4168,1024589319,109),(1322,4176,1008,218),(1323,4180,1008,218),(1324,4179,1008,218),(1325,4182,2000,218),(1326,4169,52374111,218),(1327,4170,52374111,218),(1328,4171,52374111,218),(1329,4173,52374111,218),(1330,4177,52374111,218),(1331,4178,1024589319,218),(1332,4184,1001,109),(1333,4183,1001,109),(1334,4187,1001,109),(1335,4189,1001,109),(1336,4185,52374111,109),(1337,4186,52374111,109),(1338,4190,52374111,109),(1339,4188,1024589319,109),(1340,4209,1001,218),(1341,4198,1001,218),(1342,4199,1001,218),(1343,4202,1001,218),(1345,4206,1001,218),(1347,4205,1001,132),(1348,4205,52374111,86),(1350,4200,52374111,218),(1351,4203,52374111,218),(1352,4207,52374111,218),(1353,4208,2000,218),(1354,4201,1024589319,218),(1356,4217,1008,90),(1357,4215,1008,90),(1358,4227,1008,90),(1359,4213,1008,90),(1360,4216,1001,90),(1361,4219,1008,90),(1362,4223,1008,90),(1363,4221,2000,90),(1364,4226,2000,90),(1365,4222,2000,90),(1366,4214,52374111,90),(1367,4218,52374111,90),(1368,4220,1024589319,90),(1369,4224,1008,90),(1370,4225,1008,90),(1371,4228,1001,109),(1372,4235,1001,109),(1373,4236,1001,109),(1374,4239,1008,109),(1375,4238,1008,109),(1376,4231,2000,109),(1377,4230,1024589319,109),(1378,4229,1024589319,109),(1379,4233,1024589319,109),(1380,4234,1024589319,109),(1381,4240,1024589319,109),(1382,4237,52374111,109),(1383,4232,52374111,109),(1384,4241,52374111,109),(1385,4244,1008,218),(1386,4247,1008,218),(1387,4248,1008,218),(1388,4246,1008,218),(1389,4249,2000,218),(1390,4251,2000,218),(1391,4243,52374111,218),(1392,4245,52374111,218),(1393,4250,1024589319,218),(1394,4252,1008,90),(1395,4259,1001,57),(1396,4263,52374111,57),(1397,4259,52374111,171),(1398,4263,1001,171),(1399,4256,1001,228),(1400,4258,1001,114),(1401,4258,52374111,114),(1402,4257,1001,228),(1403,4262,1001,228),(1404,4261,1008,228),(1405,4255,1008,228),(1406,4253,1024589319,228),(1407,4254,1001,228),(1408,4260,52374111,228),(1409,4268,1001,109),(1410,4280,1001,109),(1411,4269,1008,109),(1412,4327,1008,109),(1413,4270,1008,109),(1414,4278,1008,109),(1415,4273,1008,109),(1416,4279,1008,109),(1417,4272,52374111,109),(1418,4323,52374111,109),(1419,4276,1008,109),(1420,4277,1008,109),(1421,4274,52374111,109),(1422,4271,1024589319,109),(1423,4281,1024589319,109),(1424,4282,1024589319,109),(1425,4283,1001,228),(1426,4284,1001,114),(1427,4284,1008,114),(1428,4291,1001,228),(1429,4290,1001,228),(1430,4289,1001,228),(1431,4287,1001,228),(1432,4294,1001,228),(1433,4288,2000,110),(1434,4288,52374111,118),(1435,4292,52374111,228),(1436,4285,52374111,228),(1437,4293,1024589319,228),(1438,4286,1024589319,228),(1439,4300,1001,100),(1440,4299,1008,100),(1441,4311,1008,100),(1442,4312,1008,100),(1443,4307,1008,100),(1444,4305,1008,100),(1445,4309,1008,100),(1446,4308,1008,100),(1447,4301,1008,100),(1448,4303,1008,100),(1449,4298,1008,100),(1450,4302,52374111,100),(1451,4310,2000,100),(1452,4306,52374111,100),(1453,4304,1024589319,100),(1454,4315,1001,114),(1457,4319,1001,218),(1458,4314,1001,218),(1459,4317,1008,109),(1460,4317,52374111,109),(1461,4313,52374111,218),(1462,4318,52374111,218),(1463,4316,1024589319,218),(1464,4315,1024589319,104),(1465,4332,1001,272),(1466,4335,1001,272),(1467,4334,1001,272),(1468,4341,1001,272),(1469,4340,1008,272),(1470,4339,1008,272),(1471,4342,2000,272),(1472,4328,52374111,272),(1473,4329,52374111,272),(1474,4330,52374111,272),(1475,4331,52374111,272),(1476,4337,52374111,272),(1477,4333,1008,272),(1478,4336,1024589319,272),(1479,4338,1024589319,272),(1480,4344,1001,136),(1481,4350,1001,136),(1482,4351,1001,136),(1483,4343,1001,136),(1484,4345,1001,136),(1485,4354,1008,136),(1486,4347,52374111,136),(1487,4346,52374111,136),(1488,4352,52374111,136),(1489,4355,52374111,136),(1490,4356,52374111,136),(1491,4353,52374111,136),(1492,4349,1024589319,136),(1493,4348,1024589319,136),(1494,4365,1001,408),(1495,4366,1001,408),(1496,4362,1001,408),(1497,4359,1008,408),(1498,4361,1008,408),(1499,4371,1008,136),(1500,4371,52374111,272),(1501,4360,1008,408),(1502,4369,1008,408),(1503,4370,1008,408),(1504,4368,1008,136),(1505,4368,1001,136),(1506,4368,1024589319,136),(1507,4374,2000,408),(1508,4372,52374111,408),(1509,4364,52374111,408),(1510,4363,52374111,408),(1511,4373,52374111,408),(1512,4358,52374111,136),(1513,4358,1024589319,272),(1514,4367,1024589319,408),(1515,4396,1001,136),(1516,4393,1001,136),(1517,4391,1001,68),(1518,4391,52374111,68),(1519,4394,1001,20),(1520,4394,52374111,116),(1521,4389,1008,136),(1522,4390,1008,136),(1523,4399,1008,136),(1524,4398,1008,136),(1525,4397,1008,136),(1526,4400,52374111,136),(1527,4392,52374111,136),(1528,4401,1008,136),(1529,4395,1024589319,136),(1530,4415,1001,284),(1531,4406,1001,284),(1532,4404,1001,284),(1533,4407,1001,284),(1534,4402,1008,284),(1535,4411,1008,284),(1536,4414,2000,284),(1537,4481,2000,284),(1538,4408,52374111,284),(1539,4403,52374111,284),(1540,4413,52374111,284),(1541,4405,52374111,284),(1542,4409,1024589319,284),(1543,4410,1024589319,284),(1544,4412,1008,284),(1545,4417,1001,284),(1546,4425,1001,284),(1547,4421,1001,284),(1548,4423,1001,284),(1549,4427,2000,284),(1550,4424,1001,204),(1551,4424,52374111,80),(1552,4418,52374111,284),(1553,4419,52374111,284),(1554,4426,52374111,284),(1555,4428,1024589319,284),(1556,4422,1008,284),(1557,4420,1024589319,284),(1558,4443,1001,136),(1559,4433,1001,136),(1560,4447,1001,136),(1561,4440,1001,136),(1562,4439,1001,136),(1563,4437,1001,136),(1564,4438,1008,136),(1565,4432,1008,136),(1566,4442,1008,136),(1567,4441,2000,136),(1568,4434,52374111,136),(1569,4435,52374111,136),(1570,4436,52374111,136),(1571,4445,52374111,136),(1572,4444,1024589319,136),(1573,4446,1024589319,136),(1574,4488,1001,284),(1575,4469,1001,284),(1576,4470,1001,204),(1577,4470,52374111,80),(1578,4466,1001,284),(1579,4468,1001,284),(1580,4475,1008,284),(1581,4464,1008,284),(1582,4472,1008,284),(1583,4471,1008,71),(1584,4471,1001,71),(1585,4471,52374111,71),(1586,4471,1024589319,71),(1587,4463,52374111,284),(1588,4467,52374111,284),(1589,4465,1024589319,284),(1590,4473,1024589319,284),(1591,4474,2000,284),(1592,4495,2000,284),(1593,4498,1001,142),(1594,4500,1001,142),(1595,4499,1001,142),(1596,4502,1001,142),(1597,4501,1000,142),(1598,4509,1008,142),(1599,4505,1008,142),(1600,4496,1008,142),(1601,4497,1008,142),(1602,4510,2000,142),(1603,4508,2000,142),(1604,4507,52374111,142),(1605,4506,52374111,142),(1606,4504,1024589319,142),(1607,4503,1024589319,142),(1608,4522,1000,142),(1609,4517,1000,142),(1610,4511,1001,142),(1611,4512,1001,71),(1612,4512,1024589319,71),(1613,4519,1001,142),(1614,4518,1001,142),(1615,4515,1001,142),(1616,4521,2000,142),(1617,4520,52374111,142),(1618,4513,52374111,142),(1619,4516,52374111,142),(1620,4514,1024589319,142),(1621,4531,1000,272),(1622,4591,1000,48),(1623,4591,1008,224),(1624,4529,1001,272),(1625,4528,1008,272),(1626,4601,1008,272),(1627,4596,1008,272),(1628,4533,52374111,272),(1629,4530,52374111,272),(1630,4526,52374111,272),(1631,4527,52374111,272),(1632,4535,52374111,272),(1633,4534,1024589319,272),(1634,4542,1000,228),(1636,4546,1001,228),(1637,4547,1001,114),(1638,4551,1001,114),(1639,4544,1001,114),(1640,4544,52374111,114),(1641,4551,52374111,114),(1642,4547,52374111,114),(1643,4550,1001,228),(1644,4545,1001,228),(1645,4607,2000,228),(1646,4543,52374111,228),(1647,4548,52374111,228),(1648,4549,1008,228),(1649,4541,1024589319,228),(1650,4559,1000,136),(1651,4568,1000,136),(1652,4556,1001,136),(1653,4557,1001,136),(1654,4558,1001,136),(1655,4562,1008,136),(1656,4563,1008,136),(1657,4564,1008,136),(1658,4567,1001,136),(1659,4561,1008,136),(1660,4565,1008,136),(1661,4566,1001,136),(1662,4570,1008,136),(1663,4571,1008,136),(1664,4560,1024589319,136),(1665,4569,1024589319,136),(1666,4604,1001,228),(1667,4608,1001,119),(1668,4609,1001,119),(1669,4610,1008,119),(1670,4614,1008,119),(1671,4615,1008,119),(1672,4622,1008,119),(1673,4612,1008,119),(1674,4613,1008,119),(1675,4616,1008,119),(1676,4618,1008,119),(1677,4617,1008,119),(1678,4623,1008,119),(1679,4619,1001,119),(1680,4611,1024589319,119),(1681,4620,1024589319,119),(1682,4621,1024589319,119),(1683,4641,1000,119),(1684,4642,1000,119),(1685,4644,1001,119),(1686,4643,1008,119),(1687,4639,1008,119),(1688,4640,1008,119),(1689,4649,1008,119),(1690,4651,1008,119),(1691,4648,1008,119),(1692,4647,1008,119),(1693,4646,52374111,119),(1694,4645,1024589319,119),(1695,4650,1024589319,119),(1696,4665,1000,119),(1697,4660,1000,119),(1698,4661,1001,119),(1699,4658,1008,119),(1700,4654,52374111,119),(1701,4655,52374111,119),(1702,4656,52374111,119),(1703,4663,52374111,119),(1704,4662,52374111,119),(1705,4664,2000,119),(1706,4657,1024589319,119),(1707,4659,1008,59),(1708,4659,1001,60),(1709,4675,1000,142),(1710,4682,1001,142),(1711,4673,1001,142),(1712,4674,1001,142),(1713,4676,1001,142),(1714,4672,1001,142),(1715,4681,1008,142),(1716,4670,1008,142),(1717,4678,1008,142),(1718,4671,1008,142),(1719,4680,2000,142),(1720,4677,2000,142),(1721,4669,52374111,142),(1722,4683,2000,142),(1723,4679,1024589319,142),(1724,4689,1000,714),(1725,4688,1001,476),(1726,4688,52374111,238),(1727,4690,1001,714),(1728,4691,1001,714),(1729,4697,1001,714),(1730,4696,1008,714),(1731,4695,1008,714),(1732,4698,2000,714),(1733,4687,52374111,714),(1734,4685,52374111,714),(1735,4686,52374111,714),(1736,4693,52374111,714),(1737,4692,1024589319,714),(1738,4694,1024589319,714),(1740,4684,52374111,400),(1741,4684,1024589319,314),(1742,4699,1001,222),(1743,4700,1001,222),(1744,4701,1001,222),(1745,4702,1001,222),(1746,4704,1001,222),(1747,4706,1008,222),(1748,4710,1008,222),(1749,4713,1008,222),(1750,4715,1008,222),(1751,4708,2000,222),(1752,4712,2000,222),(1753,4711,52374111,222),(1754,4709,52374111,111),(1755,4709,1024589319,111),(1756,4703,52374111,222),(1757,4714,1024589319,222),(1758,4707,1024589319,111),(1759,4707,1001,111),(1760,4705,2099,222),(1761,4737,1001,111),(1762,4738,1001,111),(1763,4741,1008,111),(1764,4730,52374111,111),(1765,4732,52374111,111),(1766,4734,52374111,111),(1767,4731,1024589319,111),(1768,4735,1024589319,111),(1769,4736,1024589319,111),(1770,4742,1000,111),(1771,4740,1001,111),(1772,4739,52374111,111),(1773,4743,52374111,111),(1774,4733,2000,111),(1775,4746,1000,222),(1776,4745,1001,222),(1777,4749,1001,222),(1778,4751,1001,222),(1779,4752,1008,222),(1780,4756,1008,222),(1781,4757,1008,222),(1782,4758,1008,222),(1783,4750,2000,222),(1784,4748,1008,222),(1785,4747,1008,222),(1786,4755,52374111,222),(1787,4754,1024589319,222),(1788,4753,1024589319,222),(1789,4768,1000,222),(1790,4764,1001,222),(1791,4767,1001,222),(1792,4772,1008,222),(1793,4771,1008,222),(1794,4770,1008,222),(1795,4762,1008,222),(1797,4761,52374111,222),(1798,4763,52374111,222),(1799,4765,52374111,222),(1800,4766,52374111,222),(1801,4773,52374111,222),(1802,4774,52374111,222),(1803,4769,1024589319,222),(1804,4760,1024589319,222),(1805,4775,1024589319,222),(1806,4791,1000,222),(1807,4792,1001,222),(1808,4793,1000,222),(1809,4799,1001,222),(1810,4798,1008,222),(1811,4797,1008,222),(1812,4795,1008,222),(1813,4804,1001,222),(1814,4794,2000,222),(1815,4796,52374111,222),(1816,4803,52374111,222),(1817,4802,1024589319,222),(1818,4801,1024589319,222),(1819,4800,1024589319,222),(1820,4807,1001,114),(1821,4813,1001,114),(1822,4814,1001,114),(1823,4816,1001,114),(1824,4817,2000,114),(1825,4815,52374111,114),(1826,4812,52374111,114),(1827,4811,52374111,114),(1828,4810,52374111,114),(1829,4809,52374111,114),(1830,4808,52374111,114),(1831,4806,1024589319,114),(1832,4776,2000,156),(1833,4776,52374111,66),(1834,4822,1001,252),(1835,4831,1001,252),(1836,4824,1001,252),(1837,4825,1001,252),(1838,4830,1008,252),(1839,4829,1008,252),(1840,4832,2000,252),(1841,4819,52374111,252),(1842,4820,52374111,252),(1843,4821,52374111,252),(1844,4827,52374111,252),(1845,4818,52374111,252),(1846,4823,1024589319,252),(1847,4826,1024589319,252),(1848,4828,1024589319,252),(1849,4835,1001,252),(1850,4838,1001,252),(1851,4846,1001,252),(1852,4839,1001,252),(1853,4833,1008,252),(1854,4834,1008,126),(1855,4834,52374111,126),(1856,4836,52374111,252),(1857,4837,52374111,252),(1858,4844,52374111,252),(1859,4842,1008,252),(1860,4843,1008,126),(1861,4843,1001,126),(1863,4840,1024589319,252),(1865,4841,2099,252),(1866,4845,2000,252),(1867,4847,2000,252),(1868,4848,1001,378),(1869,4852,1001,378),(1870,4854,1001,378),(1871,4855,1001,378),(1872,4859,2099,126),(1873,4859,1001,252),(1875,4856,52374111,252),(1876,4849,52374111,378),(1877,4850,52374111,252),(1878,4850,1008,126),(1879,4857,52374111,378),(1880,4858,2000,378),(1881,4851,1024589319,378),(1882,4853,52374111,252),(1883,4853,2000,126),(1884,4866,1000,111),(1885,4875,1000,111),(1886,4863,1001,111),(1887,4864,1001,111),(1888,4865,1001,111),(1889,4874,1001,111),(1890,4868,1008,111),(1891,4872,1008,111),(1892,4873,1008,111),(1893,4871,2099,111),(1894,4870,2099,111),(1895,4869,2099,111),(1896,4877,2099,111),(1897,4878,2099,111),(1898,4876,1024589319,111),(1899,4867,52374111,111),(1900,4897,1001,114),(1901,4895,1001,114),(1902,4898,1001,114),(1903,4904,1001,114),(1904,4902,1001,114),(1905,4903,1001,114),(1906,4905,2000,114),(1907,4901,52374111,114),(1908,4900,52374111,114),(1909,4899,52374111,114),(1910,4896,52374111,114),(1911,4894,1024589319,114),(1912,4856,1001,126),(1913,4914,1001,252),(1914,4912,1001,252),(1915,4916,1001,252),(1916,4922,1001,252),(1917,4909,1008,252),(1918,4921,1008,252),(1919,4910,1008,252),(1920,4918,1008,252),(1922,4923,2000,252),(1923,4920,52374111,70),(1924,4920,2000,182),(1925,4913,52374111,252),(1926,4911,1024589319,252),(1927,4919,1024589319,252),(1928,4917,1001,126),(1929,4917,1008,126),(1930,4915,1024589319,252),(1931,4928,1001,388),(1932,4937,1001,388),(1933,4930,1001,388),(1934,4931,1001,244),(1935,4931,1008,144),(1936,4935,1008,388),(1937,4932,1008,388),(1938,4936,1008,388),(1939,4924,1008,194),(1940,4924,52374111,194),(1941,4925,52374111,388),(1942,4926,52374111,388),(1943,4927,52374111,388),(1944,4929,1008,388),(1945,4933,52374111,388),(1946,4938,2000,388),(1947,4934,1024589319,388),(1948,4945,1001,248),(1949,4947,1001,248),(1950,4943,1001,248),(1951,4946,1001,80),(1953,4946,1008,168),(1954,4941,1008,248),(1955,4939,52374111,248),(1956,4940,52374111,248),(1957,4948,52374111,248),(1958,4949,2000,248),(1959,4942,1024589319,248),(1960,4950,1024589319,248),(1961,4944,1024589319,130),(1962,4944,2000,118),(1963,4954,1001,124),(1964,4962,1001,124),(1965,4956,1001,124),(1966,4965,1008,124),(1967,4957,2000,124),(1968,4958,2099,124),(1969,4967,2099,124),(1970,4963,2099,124),(1971,4964,52374111,124),(1972,4955,1024589319,124),(1973,4959,1024589319,124),(1974,4960,1024589319,124),(1975,4961,1024589319,124),(1976,4966,1024589319,124),(1977,4971,1001,124),(1978,4976,1008,124),(1979,4973,1008,124),(1980,4977,1008,124),(1981,4978,1008,124),(1982,4983,1008,124),(1983,4984,1008,124),(1984,4980,52374111,124),(1985,4969,52374111,124),(1986,4974,1008,124),(1987,4979,52374111,124),(1988,4970,1008,124),(1989,4975,1008,124),(1990,4972,1024589319,124),(1991,4981,1024589319,124),(1992,4982,1024589319,124),(1993,5001,1001,228),(1994,5010,1001,228),(1995,5009,1001,228),(1996,5004,1001,228),(1997,5011,2000,228),(1998,5007,1001,228),(1999,5003,52374111,228),(2000,5005,52374111,228),(2001,5002,52374111,228),(2002,5006,52374111,228),(2003,5008,1001,228),(2004,5000,1024589319,228),(2005,3380,1000,190),(2006,5018,1001,208),(2007,5019,1001,208),(2008,5012,1001,104),(2009,5012,1008,104),(2010,5020,1008,208),(2011,5024,1008,208),(2012,5023,1008,208),(2013,5026,2000,208),(2014,5017,52374111,208),(2015,5013,52374111,208),(2016,5014,52374111,208),(2017,5015,52374111,208),(2018,5021,52374111,208),(2019,5025,1001,208),(2020,5016,1024589319,208),(2021,5022,1024589319,208),(2022,5040,1001,248),(2023,5032,1001,248),(2024,5030,1001,248),(2025,5031,1001,74),(2026,5033,1001,74),(2027,5029,1001,248),(2028,5037,1001,124),(2029,5037,1024589319,124),(2030,5027,1008,248),(2031,5036,1008,248),(2032,5039,2000,248),(2033,5041,52374111,248),(2034,5038,52374111,248),(2035,5028,52374111,248),(2036,5031,52374111,174),(2037,5033,52374111,174),(2038,5035,1024589319,248),(2039,5034,1024589319,248),(2062,5141,1001,124),(2063,5142,1001,124),(2064,5138,1001,124),(2065,5144,1001,62),(2066,5144,1008,62),(2067,5135,1008,124),(2068,5137,1008,124),(2069,5145,1008,124),(2070,5139,1008,124),(2071,5136,1008,124),(2072,5147,1008,124),(2073,5150,52374111,56),(2074,5150,2000,68),(2075,5140,1008,124),(2076,5134,52374111,124),(2077,5146,52374111,124),(2078,5148,1001,40),(2079,5148,52374111,84),(2081,5143,1024589319,124),(2082,5149,1024589319,124),(2083,5125,1001,208),(2084,5126,1001,208),(2085,5127,1001,148),(2086,5119,1001,60),(2087,5127,1008,60),(2088,5120,1008,208),(2089,5130,1008,208),(2090,5119,1008,148),(2091,5121,52374111,208),(2092,5123,1001,208),(2093,5128,52374111,208),(2094,5129,2000,208),(2095,5122,1024589319,208),(2097,5124,1001,60),(2098,5124,1008,108),(2099,5124,1024589319,40),(2100,5154,1001,248),(2101,5156,1001,248),(2102,5157,1001,248),(2103,5158,1001,248),(2104,5164,1001,124),(2105,5164,52374111,124),(2106,5155,1001,85),(2107,5155,52374111,163),(2108,5159,1001,248),(2109,5160,1008,248),(2110,5163,1008,248),(2111,5152,1008,248),(2112,5162,2000,248),(2113,5165,2000,248),(2114,5151,52374111,248),(2115,5153,1024589319,248),(2116,5161,1024589319,248),(2117,5170,1001,253),(2118,5174,1001,124),(2119,5174,52374111,129),(2120,5173,1001,253),(2121,5180,1001,129),(2122,5180,52374111,124),(2123,5167,1008,253),(2124,5169,1008,253),(2126,5177,1008,124),(2127,5177,52374111,129),(2128,5182,2000,253),(2129,5171,52374111,253),(2130,5178,52374111,253),(2131,5168,52374111,253),(2132,5172,52374111,253),(2133,5179,52374111,253),(2134,5181,52374111,129),(2135,5181,1024589319,124),(2136,5166,1024589319,253),(2137,5175,1024589319,253),(2138,5176,1024589319,129),(2139,5176,1008,124),(2140,5199,1001,258),(2141,5197,1001,258),(2142,5201,1001,258),(2143,5203,1008,258),(2144,5198,52374111,258),(2145,5204,52374111,258),(2146,5200,1024589319,258),(2147,5202,1024589319,258),(2148,5207,52374111,134),(2149,5207,1001,124),(2150,5213,1001,258),(2151,5212,1008,258),(2152,5210,1008,258),(2153,5214,2000,258),(2154,5211,2099,124),(2155,5211,52374111,134),(2156,5208,52374111,258),(2157,5209,52374111,258),(2158,5205,1024589319,258),(2159,5206,1024589319,258),(2160,5221,1001,129),(2161,5226,1001,129),(2162,5227,1001,129),(2163,5220,52374111,129),(2164,5222,52374111,129),(2165,5223,52374111,129),(2166,5224,1024589319,129),(2167,5225,1024589319,129),(2168,5235,1001,129),(2170,5237,1001,129),(2171,5238,1001,129),(2172,5245,1001,129),(2173,5247,2099,129),(2174,5248,2099,129),(2175,5239,2099,129),(2176,5242,52374111,129),(2177,5236,52374111,129),(2178,5244,2099,129),(2179,5243,52374111,129),(2180,5246,52374111,129),(2181,5240,1024589319,129),(2182,5241,1024589319,129),(2183,5255,1001,258),(2184,5253,1001,258),(2185,5252,1008,258),(2186,5260,1008,68),(2187,5260,52374111,190),(2190,5261,2099,48),(2191,5261,1008,210),(2192,5259,2099,258),(2193,5258,1001,258),(2194,5250,52374111,258),(2195,5251,52374111,258),(2196,5254,52374111,258),(2197,5256,52374111,258),(2198,5257,1024589319,258),(2199,5484,1001,194),(2200,5493,1001,194),(2201,5487,1001,194),(2202,5486,1001,194),(2203,5492,1008,194),(2204,5491,1008,194),(2205,5485,1008,194),(2206,5494,2000,194),(2207,5480,52374111,194),(2208,5481,52374111,194),(2209,5482,52374111,194),(2210,5483,52374111,194),(2211,5489,52374111,194),(2212,5488,1024589319,194),(2213,5490,1024589319,194),(2214,5496,1001,129),(2215,5501,1001,129),(2216,5502,2000,129),(2217,5495,52374111,129),(2218,5497,52374111,129),(2219,5498,52374111,129),(2220,5499,1024589319,129),(2221,5500,1024589319,129),(2224,5601,1001,129),(2225,5602,1001,129),(2226,5603,1001,129),(2227,5604,1001,129),(2228,5612,1001,129),(2229,5607,1008,129),(2230,5605,1008,129),(2231,5606,1008,129),(2232,5613,1008,129),(2233,5610,1008,129),(2234,5615,1008,129),(2235,5611,1008,64),(2236,5611,52374111,65),(2237,5608,2099,129),(2238,5609,2099,129),(2239,5616,1008,129),(2240,5614,1024589319,129),(2241,5542,1001,258),(2242,5547,1001,258),(2243,5541,52374111,258),(2244,5546,52374111,258),(2245,5545,52374111,129),(2246,5545,1001,129),(2247,5543,1024589319,258),(2248,5544,1024589319,258),(2249,5555,1001,129),(2250,5552,1001,129),(2251,5548,1008,129),(2252,5551,1008,129),(2253,5549,1008,129),(2254,5559,1008,129),(2255,5550,52374111,129),(2256,5553,52374111,129),(2257,5554,1024589319,129),(2258,5556,52374111,129),(2259,5557,1008,129),(2260,5558,1008,129),(2261,5560,1008,129),(2262,5640,1000,136),(2263,5633,1000,136),(2264,5632,1001,136),(2265,5636,1001,136),(2266,5639,52374111,55),(2267,5639,1008,81),(2269,5635,1001,136),(2270,5643,1008,136),(2271,5644,1008,136),(2272,5645,1008,81),(2273,5645,52374111,55),(2274,5637,2000,136),(2275,5638,1001,136),(2276,5642,52374111,136),(2277,5641,52374111,136),(2278,5634,1008,136),(2279,5649,1001,272),(2280,5650,1001,272),(2281,5655,1001,272),(2282,5652,1001,272),(2283,5647,1001,272),(2284,5661,1008,272),(2285,5654,1008,272),(2286,5658,1008,272),(2287,5660,2000,272),(2288,5651,52374111,272),(2289,5659,1008,272),(2290,5648,1001,272),(2291,5662,52374111,272),(2292,5656,2000,272),(2293,5653,1024589319,272),(2294,5657,1024589319,272),(2295,5663,1008,272),(2296,5679,1000,136),(2297,5690,1000,136),(2298,5682,1000,136),(2300,5685,1001,136),(2301,5678,52374111,136),(2302,5686,1001,136),(2303,5681,2000,136),(2304,5680,52374111,136),(2305,5687,52374111,136),(2306,5689,52374111,136),(2307,5691,52374111,136),(2308,5683,1024589319,136),(2309,5684,1024589319,136),(2310,5688,1001,136),(2311,5695,1000,136),(2312,5697,1000,136),(2313,5693,1000,136),(2314,5704,1000,136),(2315,5694,1001,68),(2316,5694,52374111,68),(2317,5706,1001,136),(2318,5705,1001,136),(2319,5699,1008,136),(2320,5700,1008,136),(2321,5701,52374111,136),(2322,5698,1008,136),(2323,5696,2000,136),(2324,5702,1024589319,136),(2325,5703,1024589319,136),(2326,5711,1001,138),(2327,5713,1001,138),(2328,5714,1001,138),(2329,5707,1001,138),(2330,5719,1008,138),(2331,5718,1008,138),(2332,5712,1008,138),(2333,5721,2000,138),(2334,5708,52374111,138),(2335,5709,52374111,138),(2336,5710,52374111,138),(2337,5716,52374111,138),(2338,5715,1024589319,138),(2339,5717,1024589319,138),(2340,5720,1001,138),(2341,5728,1001,138),(2342,5729,1001,138),(2343,5732,1001,138),(2344,5726,1001,138),(2345,5733,1008,138),(2346,5722,52374111,138),(2347,5723,52374111,138),(2348,5724,52374111,138),(2349,5725,1024589319,138),(2350,5727,2000,138),(2351,5730,52374111,138),(2352,5731,52374111,138),(2353,5750,1001,69),(2354,5742,1001,69),(2355,5741,1001,69),(2356,5743,1001,69),(2357,5751,1001,69),(2358,5744,1001,69),(2359,5740,1001,69),(2360,5749,1008,69),(2361,5738,1008,69),(2362,5746,1008,69),(2363,5737,52374111,69),(2364,5739,1024589319,69),(2365,5747,1024589319,69),(2366,5745,1008,69),(2367,5748,2000,69),(2368,5755,1000,136),(2369,5764,1000,136),(2370,5752,1001,136),(2371,5754,1001,136),(2372,5763,1001,136),(2373,5753,1001,136),(2374,5766,1008,136),(2375,5759,1008,136),(2376,5760,1008,136),(2377,5761,1008,136),(2378,5767,1008,136),(2379,5757,1008,136),(2380,5758,52374111,136),(2381,5756,52374111,136),(2382,5762,1001,68),(2383,5762,1008,68),(2384,5765,1024589319,136),(2385,5785,1000,136),(2386,5787,1000,136),(2387,5783,1000,136),(2388,5794,1000,136),(2389,5796,1001,136),(2390,5784,1001,136),(2391,5789,1008,136),(2392,5786,2000,136),(2393,5791,52374111,136),(2394,5790,52374111,136),(2395,5795,52374111,136),(2396,5788,1008,136),(2397,5792,1024589319,136),(2398,5793,1024589319,136),(2399,5799,1000,136),(2400,5810,1000,136),(2401,5800,1001,136),(2402,5805,1001,136),(2403,5806,1001,136),(2404,5808,1001,136),(2405,5811,1008,136),(2406,5798,52374111,136),(2407,5801,2000,136),(2408,5802,1000,136),(2409,5803,1024589319,136),(2410,5804,1024589319,136),(2411,5807,1008,136),(2412,5809,1008,136),(2429,5835,1000,86),(2430,5832,1000,86),(2431,5831,1001,86),(2432,5840,1001,86),(2433,5827,1008,86),(2434,5828,1008,86),(2435,5836,1008,86),(2436,5839,2000,86),(2437,5841,2000,86),(2438,5830,52374111,86),(2439,5833,1001,86),(2440,5829,1001,86),(2441,5838,1008,86),(2442,5834,1024589319,86),(2443,5837,1001,86),(2444,5842,1001,258),(2445,5850,1001,258),(2446,5849,1001,258),(2447,5846,1001,258),(2448,5843,52374111,258),(2449,5844,52374111,258),(2450,5851,52374111,258),(2451,5845,1024589319,258),(2452,5847,2000,44),(2453,5847,1008,214),(2454,5848,1000,258),(2455,5852,2000,258),(2456,5853,1000,258),(2457,5858,1000,132),(2458,5867,1000,132),(2459,5866,1001,132),(2460,5860,1001,132),(2461,5859,1008,66),(2462,5859,52374111,66),(2463,5857,1024589319,132),(2464,5861,1001,132),(2465,5862,52374111,132),(2466,5865,1001,132),(2467,5868,1000,132),(2468,5863,52374111,132),(2469,5864,52374111,132),(2470,5877,1001,86),(2471,5885,1001,86),(2472,5879,1001,86),(2473,5875,1001,86),(2474,5872,1008,86),(2475,5873,1008,86),(2476,5874,1008,86),(2477,5876,1001,86),(2478,5878,1000,86),(2479,5880,52374111,86),(2480,5881,1008,86),(2481,5882,1024589319,86),(2482,5883,2000,86),(2483,5884,1008,86),(2484,5886,2000,86),(2485,5887,1000,136),(2486,5898,1000,136),(2487,5888,1001,136),(2488,5900,1001,136),(2489,5889,1001,136),(2490,5890,1001,136),(2491,5893,1008,136),(2492,5891,52374111,136),(2493,5899,52374111,136),(2494,5892,1024589319,136),(2495,5896,1024589319,136),(2496,5894,52374111,136),(2497,5895,52374111,136),(2498,5897,1024589319,136),(2499,5913,1000,272),(2500,5916,1000,272),(2501,5903,1001,136),(2502,5903,52374111,136),(2503,5917,1001,272),(2504,5909,1001,272),(2505,5910,1001,272),(2506,5912,1008,272),(2507,5908,1008,272),(2508,5915,1008,136),(2510,5915,1001,136),(2511,5902,52374111,272),(2512,5907,52374111,272),(2513,5904,52374111,272),(2514,5905,52374111,272),(2515,5906,52374111,272),(2516,5911,2000,272),(2517,5914,1024589319,272),(2518,5935,1000,86),(2519,5939,1001,86),(2520,5940,1001,86),(2521,5938,1001,86),(2522,5937,1001,86),(2523,5946,1001,86),(2524,5936,1001,86),(2525,5934,1008,86),(2526,5945,1008,86),(2527,5933,1008,86),(2528,5942,1008,86),(2529,5941,1008,86),(2530,5944,2000,86),(2531,5943,1024589319,86),(2532,5947,1001,86),(2533,6104,1008,34),(2534,6151,1001,550),(2535,6152,1001,550),(2536,6153,1001,550),(2537,6154,1001,550),(2538,6158,1008,550),(2539,6157,52374111,550),(2540,6155,52374111,550),(2541,6156,52374111,550),(2542,6159,1001,100),(2543,6159,1008,225),(2544,6159,52374111,225),(2545,6174,1001,252),(2546,6173,1001,252),(2547,6167,1001,252),(2548,6168,1001,142),(2549,6168,1008,110),(2550,6179,1008,252),(2551,6177,52374111,142),(2552,6177,1008,110),(2553,6169,1008,252),(2554,6170,1008,252),(2555,6175,1008,252),(2556,6178,1008,142),(2557,6178,52374111,110),(2558,6166,52374111,252),(2559,6171,1024589319,252),(2560,6172,52374111,252),(2561,6176,2000,110),(2562,6176,1008,71),(2563,6176,1001,71),(2564,6194,1001,224),(2565,6185,1001,224),(2566,6187,1001,224),(2567,6182,1008,224),(2568,6181,1008,224),(2569,6190,1008,224),(2570,6193,2000,224),(2571,6189,1024589319,224),(2572,6188,1024589319,224),(2573,6192,1024589319,224),(2574,6195,52374111,224),(2575,6186,52374111,224),(2576,6184,52374111,224),(2577,6191,52374111,224),(2578,6203,1001,133),(2579,6202,1001,133),(2581,6209,1001,133),(2582,6205,1008,133),(2583,6210,2000,133),(2584,6197,52374111,133),(2585,6198,1024589319,133),(2586,6201,52374111,133),(2587,6204,52374111,133),(2588,6206,52374111,133),(2589,6207,52374111,133),(2590,6208,52374111,133),(2591,6211,1008,133),(2592,6199,1024589319,133),(2593,6200,1024589319,133),(2594,6196,1008,133),(2595,6234,1001,71),(2596,6234,52374111,55),(2597,6235,52374111,55),(2599,6227,1008,126),(2600,6232,1008,126),(2601,6228,1008,126),(2602,6230,1008,126),(2603,6240,1008,126),(2604,6229,1008,126),(2605,6233,1008,126),(2606,6238,1008,126),(2607,6241,1008,126),(2608,6242,1008,55),(2609,6242,1024589319,71),(2610,6236,52374111,126),(2611,6239,1008,126),(2612,6243,2000,126),(2613,6237,2000,55),(2614,6237,1008,71),(2615,6271,1001,90),(2616,6264,1001,90),(2617,6265,1001,90),(2618,6262,1001,90),(2619,6270,1008,90),(2620,6269,1008,90),(2621,6272,2000,90),(2622,6261,52374111,90),(2623,6259,52374111,90),(2624,6260,52374111,90),(2625,6267,52374111,90),(2626,6258,52374111,90),(2627,6263,1024589319,90),(2628,6266,1024589319,90),(2629,6268,1024589319,90),(2630,6277,1001,69),(2631,6273,52374111,69),(2632,6274,52374111,69),(2633,6275,52374111,69),(2634,6276,1024589319,69),(2635,6278,2000,69),(2636,6279,52374111,69),(2637,6280,52374111,69),(2638,6281,52374111,69),(2639,6282,52374111,69),(2640,6283,52374111,69),(2641,6284,1024589319,69),(2642,6231,1000,126),(2643,6183,1000,224),(2644,6290,1008,98),(2645,6291,1008,98),(2646,6288,52374111,98),(2647,6289,52374111,98),(2648,6303,1001,252),(2649,6302,1001,252),(2651,6301,1008,252),(2652,6300,1008,252),(2653,6297,1008,252),(2654,6305,1008,126),(2655,6305,52374111,126),(2656,6306,1008,252),(2657,6296,1008,252),(2658,6298,1008,252),(2659,6308,1008,252),(2660,6295,1024589319,252),(2661,6304,1024589319,252),(2662,6307,1008,252),(2663,6309,1001,252),(2664,6310,1024589319,252),(2665,6311,2000,252),(2667,6327,52374111,74),(2668,6335,52374111,216),(2669,6326,52374111,216),(2670,6328,52374111,216),(2671,6331,52374111,216),(2672,6334,1001,216),(2673,6330,1001,216),(2674,6332,1001,216),(2675,6333,1001,216),(2676,6336,1001,216),(2677,6337,1001,216),(2678,6327,1001,142),(2679,6329,1024589319,216),(2680,6340,1001,126),(2681,6341,1001,126),(2682,6343,1001,126),(2683,6339,1001,126),(2684,6352,1008,126),(2685,6345,1008,126),(2686,6354,1008,126),(2687,6349,52374111,126),(2688,6346,52374111,126),(2689,6342,52374111,126),(2690,6350,52374111,126),(2691,6351,2000,126),(2692,6347,2000,126),(2693,6344,1024589319,126),(2694,6348,1024589319,126),(2695,6353,1024589319,126),(2696,6377,1001,63),(2697,6377,1008,63),(2698,6375,1001,126),(2699,6371,1008,126),(2700,6378,1008,126),(2701,6369,52374111,126),(2702,6370,52374111,126),(2703,6372,52374111,126),(2704,6373,52374111,126),(2705,6374,52374111,126),(2706,6376,1024589319,126),(2707,6379,1008,126),(2708,6380,1008,126),(2709,6394,1001,110),(2710,6385,1001,110),(2711,6386,1001,110),(2712,6388,1001,110),(2713,6393,1008,110),(2714,6390,1008,110),(2715,6382,1008,110),(2716,6392,2000,110),(2717,6381,52374111,110),(2718,6395,1001,110),(2719,6383,1024589319,110),(2720,6387,1024589319,110),(2721,6391,1024589319,110),(2722,6389,1024589319,110),(2723,6400,1001,55),(2724,6409,1001,55),(2725,6399,1001,55),(2726,6402,1001,55),(2727,6396,1008,55),(2728,6397,1008,55),(2729,6405,1008,55),(2730,6408,2000,55),(2731,6407,52374111,55),(2732,6410,1001,55),(2733,6403,1024589319,55),(2734,6401,1024589319,55),(2735,6404,1024589319,55),(2736,6406,1024589319,55),(2737,6411,1001,110),(2738,6412,1001,110),(2739,6419,1001,110),(2740,6418,1001,110),(2741,6415,1001,110),(2742,6421,1001,110),(2743,6422,1001,110),(2744,6413,52374111,110),(2745,6420,52374111,110),(2746,6414,1024589319,110),(2747,6417,1024589319,110),(2748,6416,1001,110),(2749,6428,1001,126),(2750,6431,1001,126),(2751,6429,1001,126),(2752,6427,1001,126),(2753,6440,1008,126),(2754,6433,1008,126),(2755,6437,52374111,126),(2756,6430,52374111,126),(2757,6438,52374111,126),(2758,6442,1008,126),(2759,6439,2000,126),(2760,6435,2000,126),(2761,6436,1024589319,126),(2762,6441,1024589319,126),(2763,6432,1024589319,126),(2764,6434,1001,126),(2765,6488,1001,78),(2766,6488,52374111,32),(2767,6493,1001,110),(2768,6491,1001,110),(2769,6487,52374111,110),(2770,6489,52374111,110),(2771,6492,52374111,110),(2772,6490,1024589319,110),(2773,6494,1001,126),(2774,6501,1008,126),(2775,6500,1008,126),(2776,6502,1008,126),(2777,6508,1008,126),(2778,6495,52374111,126),(2779,6496,52374111,126),(2780,6498,52374111,126),(2781,6499,52374111,126),(2782,6503,52374111,126),(2783,6504,52374111,126),(2784,6509,52374111,126),(2785,6507,52374111,126),(2786,6497,1024589319,126),(2787,6506,1024589319,126),(2788,6527,1001,266),(2789,6533,1001,266),(2790,6532,1008,266),(2791,6530,1008,266),(2792,6534,2000,196),(2793,6534,52374111,70),(2794,6528,52374111,266),(2795,6529,52374111,266),(2796,6531,52374111,266),(2797,6525,1024589319,266),(2798,6526,52374111,70),(2799,6526,1024589319,196),(2800,6539,1001,148),(2801,6542,1001,148),(2802,6541,1001,148),(2803,6548,1001,148),(2804,6544,1001,148),(2805,6546,1008,148),(2806,6547,1008,148),(2807,6549,2000,148),(2808,6536,52374111,148),(2809,6537,52374111,148),(2810,6538,52374111,148),(2811,6540,52374111,148),(2812,6543,1024589319,148),(2813,6545,1024589319,148),(2814,6535,1024589319,148),(2815,6553,1001,126),(2816,6555,1008,126),(2817,6561,1008,126),(2818,6550,52374111,126),(2819,6551,52374111,126),(2820,6552,52374111,126),(2821,6559,52374111,126),(2822,6554,52374111,126),(2823,6556,1001,126),(2824,6557,1024589319,126),(2825,6558,2000,126),(2826,6560,1008,126),(2827,6567,1001,126),(2828,6569,1001,126),(2829,6565,1008,126),(2830,6576,2000,126),(2831,6566,1008,126),(2832,6570,52374111,126),(2833,6575,52374111,126),(2834,6574,52374111,126),(2835,6573,52374111,126),(2836,6577,1008,126),(2837,6568,1024589319,126),(2838,6571,1024589319,126),(2842,6578,1001,91),(2843,6582,1001,91),(2844,6579,1001,91),(2845,6580,1001,91),(2846,6581,1001,91),(2847,6584,1001,91),(2848,6589,1001,108),(2849,6590,52374111,108),(2850,6578,1008,17),(2851,6580,1008,17),(2852,6582,1008,17),(2853,6579,1008,17),(2854,6581,1008,17),(2855,6584,1008,17),(2856,6591,1024589319,48),(2857,6591,1008,60),(2858,6592,1008,108),(2859,6588,52374111,108),(2860,6583,52374111,108),(2861,6587,52374111,108),(2862,6585,52374111,108),(2863,6586,52374111,108),(2864,6604,1001,108),(2865,6601,52374111,108),(2866,6593,1008,108),(2867,6594,1008,108),(2868,6595,1008,108),(2869,6596,1008,108),(2870,6597,1008,108),(2871,6598,1008,108),(2872,6599,1008,108),(2873,6600,1008,108),(2874,6602,52374111,108),(2875,6603,1008,108),(2876,6618,1001,74),(2877,6609,1001,74),(2878,6610,1001,74),(2879,6611,1001,74),(2880,6612,1001,74),(2881,6619,1001,74),(2882,6617,1008,74),(2883,6614,1008,74),(2884,6606,1008,74),(2885,6616,2000,74),(2886,6605,52374111,74),(2887,6607,1024589319,74),(2888,6615,1024589319,74),(2889,6613,52374111,74),(2890,6633,1001,148),(2891,6623,1001,148),(2892,6624,1001,148),(2894,6626,1001,148),(2895,6634,1001,148),(2896,6621,1008,148),(2897,6620,1008,148),(2898,6629,1008,148),(2899,6632,2000,148),(2900,6628,52374111,148),(2901,6627,1024589319,148),(2902,6631,52374111,148),(2903,6630,52374111,148),(2904,6635,1001,74),(2905,6636,1001,74),(2906,6643,1001,74),(2908,6642,1001,74),(2909,6645,1001,74),(2910,6639,1001,74),(2911,6646,1001,74),(2912,6637,52374111,74),(2913,6644,52374111,74),(2914,6638,52374111,74),(2915,6640,1001,74),(2916,6625,52374111,148),(2917,6641,1001,74),(2920,6656,1001,116),(2921,6650,52374111,116),(2922,6651,52374111,116),(2923,6652,1024589319,116),(2924,6653,1024589319,116),(2925,6654,1001,116),(2926,6655,52374111,116),(2927,6665,1001,58),(2928,6664,1001,58),(2929,6669,1008,58),(2930,6659,1008,58),(2931,6668,1008,58),(2932,6673,2000,58),(2933,6662,52374111,58),(2934,6663,52374111,58),(2935,6658,52374111,58),(2936,6660,52374111,58),(2937,6670,52374111,58),(2938,6657,52374111,58),(2939,6671,1008,58),(2940,6672,52374111,28),(2941,6666,52374111,58),(2942,6667,1008,58),(2943,6703,1001,58),(2944,6704,1001,58),(2945,6711,1001,58),(2946,6705,1008,58),(2947,6706,1008,58),(2948,6709,1008,58),(2949,6707,1008,58),(2950,6710,1008,58),(2951,6715,1008,58),(2952,6708,1008,58),(2953,6712,52374111,58),(2954,6713,52374111,58),(2955,6714,52374111,28),(2956,6719,1001,58),(2957,6724,1008,58),(2958,6722,1008,58),(2959,6726,2000,58),(2960,6723,52374111,58),(2961,6720,52374111,58),(2962,6721,52374111,58),(2963,6717,1024589319,58),(2964,6718,1024589319,58),(2965,6725,1024589319,58),(2966,6738,1024589319,58),(2967,6740,52374111,58),(2968,6737,52374111,58),(2969,6744,1008,58),(2970,6732,1008,58),(2971,6733,1008,58),(2972,6741,1008,58),(2973,6742,1008,58),(2974,6734,1001,58),(2975,6735,1024589319,58),(2976,6736,1001,58),(2977,6743,1024589319,58),(2978,6756,1024589319,58),(2979,6748,1024589319,58),(2980,6757,52374111,58),(2981,6759,1008,58),(2982,6752,1008,58),(2983,6754,1008,58),(2984,6758,1008,58),(2985,6760,1008,58),(2986,6747,1001,58),(2987,6755,1001,58),(2988,6753,1001,58),(2989,6749,1001,58),(2990,6751,1024589319,58),(2991,6775,1024589319,58),(2992,6774,1024589319,58),(2993,6768,52374111,58),(2994,6776,52374111,58),(2995,6766,52374111,58),(2996,6769,1008,58),(2997,6771,1008,58),(2998,6777,1008,58),(2999,6770,1008,58),(3000,6767,1008,58),(3001,6762,1001,58),(3002,6763,1001,58),(3003,6764,1001,58),(3004,6765,1001,58),(3005,6772,1008,58),(3006,6778,1001,369),(3007,6779,1001,369),(3008,6782,1001,369),(3009,6784,1001,369),(3010,6785,1001,369),(3011,6788,1001,369),(3012,6786,1008,369),(3013,6780,52374111,369),(3014,6787,52374111,369),(3015,6783,2000,36),(3016,6783,1008,166),(3017,6783,1001,167),(3018,6781,1024589319,369),(3019,6789,1024589319,369),(3020,6806,1001,123),(3021,6798,1001,123),(3022,6797,52374111,123),(3023,6799,1001,123),(3024,6800,1001,123),(3025,6807,1001,123),(3026,6805,1008,123),(3027,6794,1008,123),(3028,6802,1008,123),(3029,6793,1008,123),(3030,6804,2000,123),(3031,6801,1008,62),(3032,6801,1001,61),(3033,6795,1024589319,123),(3034,6803,52374111,123);
/*!40000 ALTER TABLE `tarea_operario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `Usuario_Id` int(11) NOT NULL,
  `Usuario_Nombre` varchar(60) NOT NULL,
  `Usuario_Descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Usuario_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Administrador de Taller','Persona que Administra Corte una vez aceptado'),(2,'Representante','Persona que intermedia entre la empresa proveedora y el satelite'),(3,'Operario','Persona especializada en Operaciones Textiles');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `cortesadmi`
--

/*!50001 DROP VIEW IF EXISTS `cortesadmi`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `cortesadmi` AS select `corte`.`Corte_Id` AS `ID`,`representante`.`Representante_Nombre` AS `Representante`,`proveedor`.`Proveedor_Nombre` AS `Proveedor`,`modelo`.`Modelo_Nombre` AS `Modelo`,`corte`.`Corte_Fecha_Envio` AS `Fecha`,sum(`corte_talla`.`Cantidad`) AS `Cantidad` from (((((`corte` join `representante`) join `proveedor`) join `modelo`) join `talla`) join `corte_talla`) where ((`corte`.`Corte_Representante` = `representante`.`Representante_Id`) and (`representante`.`Representante_Proveedor` = `proveedor`.`Proveedor_Id`) and (`corte`.`Corte_Modelo` = `modelo`.`Modelo_Id`) and (`corte`.`Corte_Id` = `corte_talla`.`Corte_Id`) and (`corte_talla`.`Talla_Id` = `talla`.`Talla_Id`)) group by `corte`.`Corte_Id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `cortesentregados`
--

/*!50001 DROP VIEW IF EXISTS `cortesentregados`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `cortesentregados` AS select `corte`.`Corte_Id` AS `ID`,`modelo`.`Modelo_Nombre` AS `Modelo`,sum(`corte_talla`.`Cantidad`) AS `Realizadas`,`corte`.`Corte_Fecha_Envio` AS `Fecha de Envio`,`corte_entregado`.`Corte_Fecha_Entrega` AS `Fecha de Entrega`,`corte_entregado`.`Corte_Fecha_Pago` AS `Fecha de Pago`,sum((`corte_talla`.`Cantidad` * `modelo`.`Modelo_Valor`)) AS `Total Pago` from (((`corte` join `corte_talla`) join `corte_entregado`) join `modelo`) where ((`corte`.`Corte_Id` = `corte_talla`.`Corte_Id`) and (`corte`.`Corte_Id` = `corte_entregado`.`Corte_ID`) and (`corte`.`Corte_Modelo` = `modelo`.`Modelo_Id`) and (`corte_entregado`.`Corte_Estado` = 1)) group by `corte`.`Corte_Id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `cortesentregadospagados`
--

/*!50001 DROP VIEW IF EXISTS `cortesentregadospagados`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `cortesentregadospagados` AS select `corte_entregado`.`Corte_ID` AS `ID`,`modelo`.`Modelo_Nombre` AS `Modelo`,sum(`corte_talla`.`Cantidad`) AS `Realizadas`,`corte_entregado`.`Corte_Fecha_Entrega` AS `Fecha de Entrega`,sum((`corte_talla`.`Cantidad` * `modelo`.`Modelo_Valor`)) AS `Pago` from (((`corte` join `corte_entregado`) join `modelo`) join `corte_talla`) where ((`corte`.`Corte_Id` = `corte_entregado`.`Corte_ID`) and (`corte`.`Corte_Modelo` = `modelo`.`Modelo_Id`) and (`corte`.`Corte_Id` = `corte_talla`.`Corte_Id`) and (`corte_entregado`.`Corte_Estado` = 1)) group by `corte_entregado`.`Corte_ID` union select `corte_pendiente`.`Corte_ID` AS `ID`,`modelo`.`Modelo_Nombre` AS `Modelo`,sum(`corte_pendiente`.`Corte_Cantidad_Entregada`) AS `Realizadas`,`corte_pendiente`.`Corte_Fecha_Entrega` AS `Fecha de Entrega`,sum((`corte_pendiente`.`Corte_Cantidad_Entregada` * `modelo`.`Modelo_Valor`)) AS `Pago` from (((`corte_pendiente` join `modelo`) join `corte_talla`) join `corte`) where ((not(`corte_pendiente`.`Corte_ID` in (select `corte_entregado`.`Corte_ID` from `corte_entregado`))) and (`corte`.`Corte_Id` = `corte_pendiente`.`Corte_ID`) and (`corte`.`Corte_Modelo` = `modelo`.`Modelo_Id`) and (`corte`.`Corte_Id` = `corte_talla`.`Corte_Id`) and (`corte_pendiente`.`Corte_Estado` <> 3) and (`corte_pendiente`.`Corte_Estado` <> 4)) group by `corte_pendiente`.`Corte_ID` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `cortesentregadossinpagar`
--

/*!50001 DROP VIEW IF EXISTS `cortesentregadossinpagar`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `cortesentregadossinpagar` AS select `act`.`corte`.`Corte_Id` AS `ID`,`act`.`modelo`.`Modelo_Nombre` AS `Modelo`,`act`.`modelo`.`Modelo_Valor` AS `Precio`,sum(`act`.`corte_talla`.`Cantidad`) AS `Cantidad`,`act`.`corte_entregado`.`Corte_Fecha_Entrega` AS `Fecha de Entrega` from (((`act`.`corte` join `act`.`corte_entregado`) join `act`.`modelo`) join `act`.`corte_talla`) where ((`act`.`corte`.`Corte_Id` = `act`.`corte_entregado`.`Corte_ID`) and (`act`.`corte`.`Corte_Modelo` = `act`.`modelo`.`Modelo_Id`) and (`act`.`corte`.`Corte_Id` = `act`.`corte_talla`.`Corte_Id`) and (`act`.`corte_entregado`.`Corte_Estado` = 3)) group by `act`.`corte`.`Corte_Id` union select `act`.`corte`.`Corte_Id` AS `corte_Id`,`m`.`Modelo_Nombre` AS `Modelo`,`m`.`Modelo_Valor` AS `Precio`,sum(`ct`.`Cantidad`) AS `Cantidad`,`cp`.`Fecha` AS `Fecha` from (((`act`.`corte` join (select `act`.`corte_pendiente`.`Corte_ID` AS `Corte_ID`,max(`act`.`corte_pendiente`.`Corte_Fecha_Entrega`) AS `Fecha` from `act`.`corte_pendiente` where (`act`.`corte_pendiente`.`Corte_Estado` = 3) group by `act`.`corte_pendiente`.`Corte_ID`) `cp` on((`act`.`corte`.`Corte_Id` = `cp`.`Corte_ID`))) join `act`.`modelo` `m` on((`act`.`corte`.`Corte_Modelo` = `m`.`Modelo_Id`))) join `act`.`corte_talla` `ct` on((`ct`.`Corte_Id` = `act`.`corte`.`Corte_Id`))) group by `act`.`corte`.`Corte_Id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `cortespendientes`
--

/*!50001 DROP VIEW IF EXISTS `cortespendientes`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `cortespendientes` AS select `corte`.`Corte_Id` AS `ID`,`modelo`.`Modelo_Nombre` AS `Modelo`,`corte`.`Corte_Fecha_Envio` AS `Fecha de Envio`,`estado`.`Estado_Descripcion` AS `Estado`,sum((`corte_pendiente`.`Corte_Cantidad_Entregada` * `modelo`.`Modelo_Valor`)) AS `Pago` from (((`corte` join `corte_pendiente`) join `modelo`) join `estado`) where ((`corte`.`Corte_Id` = `corte_pendiente`.`Corte_ID`) and (`corte`.`Corte_Modelo` = `modelo`.`Modelo_Id`) and (`corte_pendiente`.`Corte_Estado` = `estado`.`Estado_Id`) and (`corte_pendiente`.`Corte_Estado` <> 1) and (`corte_pendiente`.`Corte_Estado` = 2)) group by `corte_pendiente`.`Corte_ID` union select `corte`.`Corte_Id` AS `ID`,`modelo`.`Modelo_Nombre` AS `Modelo`,`corte`.`Corte_Fecha_Envio` AS `Fecha de Envio`,`estado`.`Estado_Descripcion` AS `Estado`,0 AS `Pago` from (((`corte` join `corte_pendiente`) join `modelo`) join `estado`) where ((`corte`.`Corte_Id` = `corte_pendiente`.`Corte_ID`) and (`corte`.`Corte_Modelo` = `modelo`.`Modelo_Id`) and (`corte_pendiente`.`Corte_Estado` = `estado`.`Estado_Id`) and (`corte_pendiente`.`Corte_Estado` <> 1) and (`corte_pendiente`.`Corte_Estado` = 4)) group by `corte_pendiente`.`Corte_ID` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `cortesporasignar`
--

/*!50001 DROP VIEW IF EXISTS `cortesporasignar`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `cortesporasignar` AS select `corte`.`Corte_Id` AS `ID`,`modelo`.`Modelo_Nombre` AS `Modelo`,`corte`.`Corte_Fecha_Envio` AS `Fecha` from (`corte` join `modelo`) where (`corte`.`Corte_Modelo` = `modelo`.`Modelo_Id`) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `cortesporentregar`
--

/*!50001 DROP VIEW IF EXISTS `cortesporentregar`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `cortesporentregar` AS select `corte`.`Corte_Id` AS `ID`,`modelo`.`Modelo_Nombre` AS `Modelo`,`corte`.`Corte_Fecha_Envio` AS `Fecha de Envio`,sum(`corte_talla`.`Cantidad`) AS `Cantidad` from ((`corte` join `modelo`) join `corte_talla`) where ((not(`corte`.`Corte_Id` in (select `corte_entregado`.`Corte_ID` from `corte_entregado` union select `corte_pendiente`.`Corte_ID` from `corte_pendiente`))) and (`corte`.`Corte_Modelo` = `modelo`.`Modelo_Id`) and (`corte_talla`.`Corte_Id` = `corte`.`Corte_Id`)) group by `corte`.`Corte_Id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `operarios`
--

/*!50001 DROP VIEW IF EXISTS `operarios`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `operarios` AS select `operario`.`Operario_Id` AS `ID`,`operario`.`Operario_Nombre` AS `Nombre`,`operario`.`Operario_Correo` AS `Correo` from `operario` order by `operario`.`Operario_Id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-04 20:52:56
