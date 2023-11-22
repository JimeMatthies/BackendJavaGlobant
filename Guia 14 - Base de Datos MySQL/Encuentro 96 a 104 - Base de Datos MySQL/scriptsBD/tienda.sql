DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  codigo_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo)
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

/* Video */
-- SELECT * FROM fabricante;
-- SELECT * FROM producto;
-- SELECT f.nombre, p.nombre, p.precio FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante;
-- SELECT f.nombre, p.nombre, p.precio FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante AND f.codigo = 7;
-- SELECT f.codigo, f.nombre FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante AND f.codigo = 7;
-- SELECT p.codigo, p.nombre, p.precio FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante AND f.codigo = 7;
-- SELECT p.codigo, p.nombre, p.precio FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante AND f.nombre = 'Lenovo';
-- SELECT p.codigo, p.nombre, p.precio FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante AND f.nombre = 'Lenovo' AND p.precio > 450;
-- SELECT * FROM producto p INNER JOIN fabricante f ON p.codigo_fabricante = f.codigo;
-- SELECT * FROM producto p LEFT OUTER JOIN fabricante f ON p.codigo_fabricante = f.codigo;
-- SELECT * FROM producto p RIGHT OUTER JOIN fabricante f ON p.codigo_fabricante = f.codigo;
-- SELECT * FROM producto p WHERE EXISTS (SELECT f.codigo FROM fabricante f WHERE f.codigo = p.codigo_fabricante);
-- SELECT * FROM producto p WHERE NOT EXISTS (SELECT f.codigo FROM fabricante f WHERE f.codigo = p.codigo_fabricante);
-- SELECT * FROM fabricante f WHERE NOT EXISTS (SELECT p.codigo_fabricante FROM producto p WHERE p.codigo_fabricante = f.codigo);
-- SELECT * FROM producto p CROSS JOIN fabricante f;
-- SELECT * FROM fabricante ORDER BY nombre;
-- SELECT * FROM fabricante ORDER BY nombre ASC;
-- SELECT * FROM fabricante ORDER BY nombre DESC;
-- SELECT * FROM fabricante ORDER BY nombre, codigo;
-- SELECT f.nombre, p.nombre, p.precio FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante ORDER BY f.nombre, p.nombre;
-- SELECT f.nombre, p.nombre, p.precio FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante ORDER BY p.nombre, f.nombre;
-- SELECT f.nombre FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante GROUP BY f.nombre;
-- SELECT f.nombre, COUNT(*) FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante GROUP BY f.nombre;
-- SELECT f.nombre, COUNT(*) FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante GROUP BY f.nombre HAVING COUNT(*) > 1;
-- SELECT f.nombre, COUNT(*) FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante GROUP BY f.nombre HAVING COUNT(*) > 1 AND f.nombre <> 'Lenovo';
-- SELECT f.nombre, COUNT(*), SUM(p.precio) FROM fabricante f, producto p WHERE f.codigo = p.codigo_fabricante GROUP BY f.nombre HAVING SUM(p.precio) > 300;

/* Ejercicio Aprendizaje */
-- SELECT nombre FROM producto;
-- SELECT nombre, precio FROM producto;
-- SELECT * FROM producto;
-- SELECT nombre, ROUND(precio) AS redondeado FROM producto;
-- SELECT f.codigo FROM fabricante f WHERE EXISTS (SELECT p.codigo_fabricante FROM producto p WHERE p.codigo_fabricante = f.codigo);
-- SELECT codigo_fabricante FROM producto;
-- SELECT DISTINCT codigo_fabricante FROM producto;
-- SELECT nombre FROM fabricante ORDER BY nombre ASC;
-- SELECT nombre, precio FROM producto ORDER BY nombre ASC, precio DESC;
-- SELECT * FROM fabricante LIMIT 5;
-- SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;
-- SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;
-- SELECT nombre FROM producto WHERE precio <= 120;
-- SELECT * FROM producto WHERE precio BETWEEN 60 AND 200;
-- SELECT * FROM producto WHERE codigo_fabricante IN (1,3,5);
-- SELECT nombre FROM producto WHERE nombre LIKE '%Portátil%';
-- SELECT p.codigo, p.nombre, p.codigo_fabricante, f.nombre FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo;
-- SELECT p.nombre, p.precio, f.nombre FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo ORDER BY f.nombre ASC;
-- SELECT p.nombre, p.precio, f.nombre FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo ORDER BY p.precio ASC LIMIT 1;
-- SELECT p.* FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo AND f.nombre = 'Lenovo';
-- SELECT p.* FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo AND f.nombre = 'Crucial' AND p.precio > 200;
-- SELECT p.* FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo AND f.nombre IN ('Asus', 'Hewlett-Packard');
-- SELECT p.nombre, p.precio, f.nombre FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo AND p.precio >= 180 ORDER BY p.precio DESC, p.nombre ASC;
-- SELECT f.nombre, p.nombre, p.precio FROM fabricante f LEFT JOIN producto p ON p.codigo_fabricante = f.codigo;
-- SELECT f.nombre FROM fabricante f LEFT JOIN producto p on p.codigo_fabricante = f.codigo WHERE p.nombre IS NULL;
-- SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo');
-- SELECT * FROM producto WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo'));
-- SELECT nombre from producto WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo')) AND codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo');
-- SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Asus') AND precio > (SELECT AVG(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Asus'));
-- SELECT * FROM fabricante WHERE codigo IN (SELECT codigo_fabricante FROM producto);
-- SELECT * FROM fabricante WHERE codigo NOT IN (SELECT codigo_fabricante FROM producto);
-- SELECT f.nombre, count(*) FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo GROUP BY f.nombre HAVING COUNT(*) = (SELECT COUNT(*) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre ='Lenovo'));