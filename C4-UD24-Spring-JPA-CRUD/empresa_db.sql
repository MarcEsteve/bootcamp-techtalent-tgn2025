CREATE DATABASE IF NOT EXISTS empresa_db;
USE empresa_db;

CREATE TABLE `empleado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `departamento` varchar(100) DEFAULT NULL,
  `salario` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `empleado` (`nombre`, `departamento`, `salario`) VALUES
('Ana Martínez', 'Recursos Humanos', 3511.00),
('Lucía Fernández', 'IT', 4100.00),
('Pedro Sánchez', 'Marketing', 2950.75),
('Javier Pérez', 'IT', 3900.00),
('Laura García', 'Marketing', 3100.50),
('Andrés Ramírez', 'Administración', 2500.75),
('Isabel Torres', 'Finanzas', 3600.20);