DROP DATABASE IF EXISTS Coches;
CREATE DATABASE  Coches;
USE Coches;
CREATE TABLE  Coche (
  id integer NOT NULL AUTO_INCREMENT,
  matricula varchar(10) DEFAULT NULL,
  marca varchar(100) DEFAULT NULL,
  modelo varchar(100) DEFAULT NULL,
  tipo varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
);