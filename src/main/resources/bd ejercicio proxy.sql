CREATE DATABASE IF NOT EXISTS ejercicio_proxy;
USE ejercicio_proxy;

CREATE TABLE IF NOT EXISTS personas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS telefonos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    numero VARCHAR(20) NOT NULL,
    persona_id INT,
    FOREIGN KEY (persona_id) REFERENCES personas(id)
);
