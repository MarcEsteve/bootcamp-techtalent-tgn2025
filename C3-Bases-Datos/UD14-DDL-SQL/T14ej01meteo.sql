CREATE DATABASE meteo;
USE meteo;
CREATE TABLE estacion (
    id MEDIUMINT UNSIGNED NOT NULL AUTO_INCREMENT,
    lat VARCHAR(14) NOT NULL,
    longitud VARCHAR(15) NOT NULL,
    alt MEDIUMINT NOT NULL,
    PRIMARY KEY (id));

CREATE TABLE muestra (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    idestacion MEDIUMINT UNSIGNED NOT NULL,
    fecha DATE NOT NULL,
    tempmin TINYINT,
    tempmax TINYINT,
    precipita SMALLINT UNSIGNED,
    hummin TINYINT UNSIGNED,
    hummax TINYINT UNSIGNED,
    velmin SMALLINT UNSIGNED,
    velmax SMALLINT UNSIGNED,
    KEY (idestacion), FOREIGN KEY (idestacion) 
    REFERENCES estacion (id) 
        ON DELETE NO ACTION 
        ON UPDATE CASCADE);

-- Añadir datos a la tabla estacion y muestra completando los valores de las estaciones y las muestras de datos meteorológicos.

INSERT INTO estacion (lat, longitud, alt) VALUES
('41.3851N', '2.1734E', 12),     -- Barcelona
('40.4168N', '3.7038W', 667),    -- Madrid
('39.4699N', '0.3763W', 15),     -- Valencia
('43.2630N', '2.9350W', 19);     -- Bilbao

-- Asumiendo que las estaciones tienen id 1 a 4 en orden de inserción

INSERT INTO muestra (idestacion, fecha, tempmin, tempmax, precipita, hummin, hummax, velmin, velmax) VALUES
(1, '2024-04-15', 12, 22, 5, 55, 75, 5, 25),
(1, '2024-04-16', 11, 21, 0, 50, 70, 4, 20),
(2, '2024-04-15', 8, 19, 12, 40, 65, 3, 18),
(3, '2024-04-15', 14, 25, 0, 45, 60, 6, 22),
(4, '2024-04-15', 10, 17, 30, 60, 85, 2, 15);


-- Me he dado cuenta que quizás la estación debe tener nombre:

ALTER TABLE estacion
ADD nombre VARCHAR(20) AFTER id;


-- Actualizar los nombres de las estaciones

UPDATE estacion SET nombre = 'Barcelona' WHERE id = 1;
UPDATE estacion SET nombre = 'Madrid' WHERE id = 2;
UPDATE estacion SET nombre = 'Valencia' WHERE id = 3;
UPDATE estacion SET nombre = 'Bilbao' WHERE id = 4;

-- Elimino una estación 2 para mostrar el ON DELETE NO ACTION
--Primero la muestra relacionada con la estación:
DELETE FROM muestra WHERE `muestra`.`id` = 3;
--Luego la estación:
DELETE FROM estacion WHERE `estacion`.`id` = 2;

-- Actualizo la estación de Valencia:
UPDATE `estacion` SET `id` = '7' WHERE `estacion`.`id` = 3;
