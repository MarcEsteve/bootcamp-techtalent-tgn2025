-- CONSULTAS UNION
-- Realizar una consulta que visualice los registros de la tabla PRODUCTOS con un precio entre 200 y 500 y además losregistros de la tabla PRODUCTOSNUEVOS donde el precio sea superior a 1100.

SELECT * FROM PRODUCTOS WHERE PRECIO BETWEEN 200 AND 500
UNION
SELECT * FROM PRODUCTOSNUEVOS WHERE PRECIO >1100 ORDER BY SECCIÓN, PRECIO;