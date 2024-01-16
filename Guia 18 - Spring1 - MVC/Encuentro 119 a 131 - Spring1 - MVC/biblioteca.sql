DROP DATABASE IF EXISTS biblioteca;
CREATE DATABASE biblioteca CHARACTER SET utf8mb4;
USE biblioteca;

SELECT * from libro;
SELECT * from autor;
SELECT * from editorial; 

DELETE from libro;
DELETE from autor;
DELETE from editorial;