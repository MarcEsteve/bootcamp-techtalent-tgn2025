-- Una cláusula SQL JOIN se utiliza para combinar las filas de dos o más tablas,basado en un campo común entre ellos. PK - FK

SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate
FROM Orders INNER JOIN Custormers
ON Orders.CustomerID=Customers.CustomerID;

-- Queremos saber los clientes que han hecho pedidos de Madrid.

SELECT c.EMPRESA, c.`POBLACIÓN`, p.`NÚMERO_DE_PEDIDO`, p.FECHA_PEDIDO 
FROM CLIENTES AS c INNER JOIN PEDIDOS  AS p
ON c.`CÓDIGOCLIENTE` = p.`CÓDIGO_CLIENTE`
WHERE POBLACIÓN='MADRID';

-- Queremos mostrar los clientes con pedidos de Madrid solo los siguientes campos CÓDIGO CLIENTE (de la tabla Clientes),POBLACIÓN, DIRECCIÓN, NÚMERODEPEDIDO, CÓDIGO CLIENTE (de la tabla Pedidos) y FORMADEPAGO

SELECT CLIENTES.`CÓDIGOCLIENTE`, POBLACIÓN, DIRECCIÓN, `NÚMERO DE PEDIDO`,
PEDIDOS.`CÓDIGO CLIENTE`, `FORMA DE PAGO` FROM CLIENTES INNER JOIN
PEDIDOS ON CLIENTES.CÓDIGOCLIENTE = PEDIDOS.`CÓDIGO CLIENTE`
WHERE POBLACIÓN='MADRID';

-- Muestra los clientes que han hecho pedidos de "A Coruña".Muestra solo los campos Código cliente (de la tabla pedidos),el nombre de la empresa, el teléfono y la forma de pago.

SELECT PEDIDOS.`CÓDIGO CLIENTE`, EMPRESA, TELÉFONO, `FORMA DE PAGO`
FROM CLIENTES INNER JOIN PEDIDOS ON
CLIENTES.`CÓDIGOCLIENTE` = PEDIDOS.`CÓDIGO CLIENTE`
WHERE POBLACIÓN='A CORUÑA';

-- Mostrar los campos NOMBREARTÍCULO y PRECIO de la tabla "PRODUCTOS" y UNIDADES de la tabla "PRODUCTOS-PEDIDOS", Mostrar solo los artículos que se han vendido más de 20 unidades

SELECT p.NOMBREARTÍCULO,p.PRECIO, pp.UNIDADES
FROM PRODUCTOS AS p INNER JOIN `PRODUCTOS- PEDIDOS` AS pp
ON p.`CÓDIGOARTÍCULO`=pp.`CÓDIGO ARTÍCULO`
WHERE UNIDADES>20;

-- Los clientes que NO han hecho pedidos (LEFT JOIN)

SELECT *
FROM CLIENTES LEFT JOIN PEDIDOS
ON CLIENTES.`CÓDIGOCLIENTE` = PEDIDOS.`CÓDIGO CLIENTE`
WHERE PEDIDOS.`CÓDIGO CLIENTE` IS NULL;

-- Pruébalo con RIGHT JOIN para ver un resultado equivalente.

SELECT *
FROM PEDIDOS RIGHT JOIN CLIENTES
ON PEDIDOS.[CÓDIGO CLIENTE] = CLIENTES.CÓDIGOCLIENTE
WHERE PEDIDOS.[CÓDIGO CLIENTE] IS NULL;