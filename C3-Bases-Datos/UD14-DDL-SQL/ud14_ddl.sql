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

-- Tabla de clientes con restricciones
CREATE TABLE clientes (
    id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    telefono VARCHAR(15),
    fecha_registro DATE DEFAULT CURRENT_DATE
);

-- Tabla de pedidos con claves foráneas y restricciones
CREATE TABLE pedidos (
    id_pedido INT PRIMARY KEY,
    fecha DATE NOT NULL,
    total DECIMAL(10, 2) NOT NULL CHECK (total >= 0),
    id_cliente INT NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

INSERT INTO clientes (id_cliente, nombre, email, telefono, fecha_registro) VALUES
(1, 'Ana García', 'ana.garcia@email.com', '600123456', '2024-01-10'),
(2, 'Carlos Ruiz', 'carlos.ruiz@email.com', '601234567', '2024-01-15'),
(3, 'Lucía Torres', 'lucia.torres@email.com', '602345678', DEFAULT),
(4, 'Miguel Fernández', 'miguel.fernandez@email.com', NULL, '2024-02-01');

INSERT INTO pedidos (id_pedido, fecha, total, id_cliente) VALUES
(101, '2024-03-01', 120.50, 1),
(102, '2024-03-02', 85.99, 1),
(103, '2024-03-05', 45.00, 2),
(104, '2024-03-06', 230.75, 3),
(105, '2024-03-07', 0, 4);
