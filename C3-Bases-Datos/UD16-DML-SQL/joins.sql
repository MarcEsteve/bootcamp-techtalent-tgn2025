-- Una cláusula SQL JOIN se utiliza para combinar las filas de dos o más tablas,basado en un campo común entre ellos. PK - FK

SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate
FROM Orders INNER JOIN Custormers
ON Orders.CustomerID=Customers.CustomerID;

-- Queremos saber los clientes que han hecho pedidos de Madrid.

SELECT c.EMPRESA, c.`POBLACIÓN`, p.`NÚMERO_DE_PEDIDO`, p.FECHA_PEDIDO 
FROM CLIENTES AS c INNER JOIN PEDIDOS  AS p
ON c.`CÓDIGOCLIENTE` = p.`CÓDIGO_CLIENTE`
WHERE POBLACIÓN='MADRID';