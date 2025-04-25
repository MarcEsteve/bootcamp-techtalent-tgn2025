-- 1. Realizar una consulta que muestre los campos “Empresa” y “Población” de la tabla "Clientes". 
SELECT * FROM clientes;

SELECT EMPRESA,POBLACIÓN FROM clientes;
-- 2. Realizar una consulta que muestre los artículos de la sección “Cerámica”. 
SELECT NOMBREARTÍCULO AS `ARTÍCULOS DE CERÁMICA` FROM PRODUCTOS WHERE SECCIÓN='CERÁMICA';

-- 3. Realizar una consulta que muestre los productos de la sección “Deportes” cuyo precio esté entre 100 y 200 €. 
-- En la consulta solo se mostrarán los campos “Nombre de artículo” y “Precio”. 

SELECT NOMBREARTÍCULO AS `DEPORTES`, PRECIO AS `ENTRE 100 y 200€` FROM PRODUCTOS WHERE SECCIÓN="DEPORTES" AND PRECIO BETWEEN 100 AND 200;

-- 4. Realizar una consulta que muestre los productos cuyo país no sea España. 

SELECT * FROM PRODUCTOS WHERE PAÍSDEORIGEN <> "ESPAÑA";
SELECT * FROM PRODUCTOS WHERE IMPORTADO = "TRUE";
SELECT * FROM PRODUCTOS WHERE PAÍSDEORIGEN IS NOT 'ESPAÑA';
SELECT * FROM PRODUCTOS WHERE PAÍSDEORIGEN != 'ESPAÑA';

-- 5. Realizar una consulta que muestre los artículos españoles de la sección “Deportes” o aquellos cuyo precio sea superior a 350 € independientemente de cual sea su sección o país de origen. 

SELECT * 
FROM PRODUCTOS 
WHERE (SECCIÓN="DEPORTES" AND PAÍSDEORIGEN = "ESPAÑA")
OR 
PRECIO > 350;


-- 6. Realizar una consulta que muestre los productos cuya fecha esté entre 1/05/2001 y 15/12/2001. En la consulta solo se visualizarán los campos “Nombre de artículo”, “Sección” y “Fecha”. 
-- Modificamos el campo FECHA para tipo 'date'
ALTER TABLE `productos` CHANGE `FECHA` `FECHA` DATE NULL DEFAULT NULL;

-- FORMATO FECHA: '2001-05-01'

SELECT NOMBREARTÍCULO, SECCIÓN, FECHA 
FROM PRODUCTOS 
WHERE FECHA BETWEEN '2001-05-01' AND '2001-12-15';