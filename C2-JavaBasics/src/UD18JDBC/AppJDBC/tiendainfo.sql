-- Para crear la base de datos `tiendainfo` y las tablas `articulos`, `fabricantes` y `prova`
-- Marc Esteve Garcia
--
-- Base de dades: `tiendainfo`
--

-- --------------------------------------------------------
CREATE DATABASE IF NOT EXISTS `tiendainfo`;
USE `tiendainfo`;
--
-- Estructura de la taula `articulos`
--

CREATE TABLE `articulos` (
  `codart` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `fabricante` int(11) DEFAULT NULL,
  PRIMARY KEY (`codart`)
);

-- --------------------------------------------------------

--
-- Estructura de la taula `fabricantes`
--

CREATE TABLE `fabricantes` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
);

--
-- Bolcament de dades per a la taula `fabricantes`
--

INSERT INTO `fabricantes` (`codigo`, `nombre`) VALUES
(1, 'Asus'),
(2, 'LG Gram'),
(3, 'Samsung'),
(5, 'Volkswagen'),
(6, 'Pepito'),
(8, 'Audi'),
(10, 'Benq'),
(11, 'Opel');

