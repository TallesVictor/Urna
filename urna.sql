/*
SQLyog Community v13.0.0 (32 bit)
MySQL - 5.5.20-log : Database - urna
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`urna` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `urna`;

/*Table structure for table `candidato` */

DROP TABLE IF EXISTS `candidato`;

CREATE TABLE `candidato` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `numero` int(11) NOT NULL,
  `partido` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=latin1;

/*Data for the table `candidato` */

insert  into `candidato`(`id`,`nome`,`numero`,`partido`) values 
(1,'Juliana',1,'PCO'),
(2,'Dilma',2,'PT'),
(3,'Lula',3,'PT'),
(4,'Zema',4,'NOVO'),
(5,'Anastasia',5,'PSC'),
(6,'Aécio Neves',6,'PP'),
(7,'Marina Silva',7,'PCO'),
(8,'Bolsonaro ',8,'AVANTE'),
(9,'Serra',9,'DEM'),
(10,'Hitler',10,'PCB');

/*Table structure for table `votos` */

DROP TABLE IF EXISTS `votos`;

CREATE TABLE `votos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idcandidato` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idcandidatofk` (`idcandidato`),
  CONSTRAINT `fk` FOREIGN KEY (`idcandidato`) REFERENCES `candidato` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=latin1;

/*Data for the table `votos` */

insert  into `votos`(`id`,`idcandidato`,`quantidade`) values 
(1,1,0),
(2,2,0),
(3,3,0),
(4,4,0),
(5,5,0),
(6,6,0),
(7,7,0),
(8,8,0),
(9,9,0),
(10,10,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
