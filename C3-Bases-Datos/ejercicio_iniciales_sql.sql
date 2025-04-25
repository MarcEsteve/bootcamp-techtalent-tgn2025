-- 1. Realizar una consulta que muestre los campos “Empresa” y “Población” de la tabla "Clientes". 
SELECT * FROM clientes;

SELECT EMPRESA,POBLACIÓN FROM clientes;
-- 2. Realizar una consulta que muestre los artículos de la sección “Cerámica”. 
SELECT NOMBREARTÍCULO AS `ARTÍCULOS DE CERÁMICA` FROM PRODUCTOS WHERE SECCIÓN='CERÁMICA';

-- 3. Realizar una consulta que muestre los productos de la sección “Deportes” cuyo precio esté entre 100 y 200 €. 
-- En la consulta solo se mostrarán los campos “Nombre de artículo” y “Precio”. 

SELECT NOMBREARTÍCULO AS `DEPORTES`, PRECIO AS `ENTRE 100 y 200€` FROM PRODUCTOS WHERE SECCIÓN="DEPORTES" AND PRECIO BETWEEN 100 AND 200;

-- 4. Realizar una consulta que muestre los productos cuyo país no sea España. 

SELECT * 
FROM productos 
WHERE (SECCIÓN="DEPORTES" AND PAÍSDEORIGEN = "ESPAÑA")
OR 
PRECIO > 350;