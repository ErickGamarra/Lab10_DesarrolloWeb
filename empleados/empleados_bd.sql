CREATE DATABASE IF NOT EXISTS empleados_dev;
CREATE DATABASE IF NOT EXISTS empleados_qa;
CREATE DATABASE IF NOT EXISTS empleados_test;
CREATE DATABASE IF NOT EXISTS empleados_prod;

USE empleados_dev;
CREATE TABLE empleado(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100),
    apellidos VARCHAR(100),
    email VARCHAR(100),
    sueldo DECIMAL(10,2)
);

USE empleados_qa;
CREATE TABLE empleado(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100),
    apellidos VARCHAR(100),
    email VARCHAR(100),
    sueldo DECIMAL(10,2)
);

USE empleados_test;
CREATE TABLE empleado(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100),
    apellidos VARCHAR(100),
    email VARCHAR(100),
    sueldo DECIMAL(10,2)
);

USE empleados_prod;
CREATE TABLE empleado(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100),
    apellidos VARCHAR(100),
    email VARCHAR(100),
    sueldo DECIMAL(10,2)
);
