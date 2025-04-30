CREATE DATABASE prueba_gente;
USE prueba_gente;
DROP TABLE IF EXISTS gente;

CREATE TABLE gente 
        (id_gente INT AUTO_INCREMENT,
        nombre VARCHAR(20), 
        edad INT, 
        ciudad VARCHAR(20), 
        fecha DATE, 
        salario FLOAT,
        PRIMARY KEY (id_gente)
        );

CREATE TABLE gente 
        (id_gente INT AUTO_INCREMENT,
        nombre VARCHAR(20), 
        edad INT, 
        ciudad VARCHAR(20), 
        fecha DATE, 
        salario FLOAT,
        PRIMARY KEY (id_gente)
        ) ;