<h1 align="center">Encuentro 96 a 104 - Base de Datos MySQL</h1>

## Videos de Youtube:

Durante el curso se utilizan distintos videos con ejemplos y tips para aprender a programar. Puedes encontrarlos todos en esta lista de reproducción.

- [Lista de reproducción de Youtube](https://youtube.com/playlist?list=PLQ77MrE4f4tKN_NLQeICJ1rCjiLbj5r94)

## Instalación de MySQL:

Revisar Instructivos para instalación de MySQL y Scripts.

- [Instalación MySQL](https://github.com/JimeMatthies/BackendJavaGlobant/blob/master/Guia%2014%20-%20Base%20de%20Datos%20MySQL/Encuentro%2096%20a%20104%20-%20Base%20de%20Datos%20MySQL/Instalaci%C3%B3n%20MySQL.pdf)
- [Instructivo Instalación MySQL](https://github.com/JimeMatthies/BackendJavaGlobant/blob/master/Guia%2014%20-%20Base%20de%20Datos%20MySQL/Encuentro%2096%20a%20104%20-%20Base%20de%20Datos%20MySQL/Instructivo%20Instalaci%C3%B3n%20MySQL.pdf)
- [Tutorial Scripts SQL](https://github.com/JimeMatthies/BackendJavaGlobant/blob/master/Guia%2014%20-%20Base%20de%20Datos%20MySQL/Encuentro%2096%20a%20104%20-%20Base%20de%20Datos%20MySQL/Tutorial%20Scripts%20SQL.pdf)

## Importante!:

Desde JUnit en adelante todos los codigos seran totalmente en ingles (variables, comentarios) con el fin de practicar el idioma dentro del mismo.

## Respuestas Guía MySQL:

Las  preguntas están basadas en la información entregada en la [Guía MySQL](https://github.com/JimeMatthies/BackendJavaGlobant/blob/master/Guia%2014%20-%20Base%20de%20Datos%20MySQL/Encuentro%2096%20a%20104%20-%20Base%20de%20Datos%20MySQL/Gu%C3%ADa%20MySQL.pdf) 

### Actividad 1:

1. ¿Qué es una base de datos?:

- a) Un conjunto de datos organizados de manera aleatoria.
- b) Una colección organizada de datos no estructurados.
- c) Una tabla que posee filas y columnas que estructuran la información.
- **d) Una colección organizada de información estructurada.** <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>

2. ¿Qué es una tabla?:

- a) Las tablas constituyen la base de datos y organizan la información.
- b) Una tabla es una estructura organizada para almacenar información.
- c) Una tabla posee filas y columnas, en apariencia, es similar a una hoja de cálculo.
- **d) Todas son correctas.** <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>

3. ¿Cuál de estos no es un tipo de base de datos?:

- a) Base de datos no relacional
- b) Base de datos relacional
- **c) Base de datos imperativa** <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>
- d) Base de datos orientada a objetos

4. ¿Cuál de estas SI es una ventaja al trabajar el almacenamiento de los datos con bases de
datos en lugar de hojas de cálculo?:

- **a) Los datos están más protegidos.** <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>
- b) Hay mayor repetición de datos.
- c) Existe mayor eficiencia en la codificación, pero no en la captura.
- d) Los datos dependen de las aplicaciones que los usan.

5. En las bases de datos relacionales existe un elemento clave que identifica a cada registro
o fila y la hace única, ¿cómo se llama ese elemento?:

- a) Clave única
- b) Clave foránea
- **c) Llave primaria** <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>
- d) Llave maestra

### Actividad 2:

1. Primero deberás localizar en ambas tablas los siguientes elementos:

- a) Llaves primarias
- b) Llave foránea
- c) Un campo que almacena datos de tipo carácter
- d) Los atributos de cada tabla
- e) Una tupla

2. Compara tus respuestas con las de tus compañeros: recuerda abordar cada duda que
tengas, a partir de ellas es que fortalecemos el aprendizaje.

- a) id_casa, id_usuario
- b) id_casa en tabla usuario
- c) calle, nombre y apellido
- d) Tabla casa: id_casa, calle, numeracion, es_departamento. Tabla usuario: id_usuario, nombre, apellido, id_casa
. e) 854267, Noelia, Devito, 163748

3. ¿Cuál es la función de una llave primaria? Selecciona la opción correcta:

- a) Una llave primaria identifica a cada registro imposibilitando la repetición de un mismo
registro, y por defecto, la redundancia
- b) Una llave primaria, por buenas prácticas, debería ser un valor abstracto de la relación y
su valor debería ser autogenerado
- c) Una llave primaria es un elemento clave en la relación entre tablas, ya que, para la
existencia de una llave foránea, se requiere anteriormente, la de una llave primaria
- **d) Todas las anteriores son correctas** <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>

### Actividad 3:

Verdadero o Falso

- Para que exista una relación se requiere de una llave foránea. <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/> (Y de una llave primaria)
- Pueden existir relaciones entre tablas de muchos a muchos. <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>
- En un diagrama ERD con una llave dorada se identifica la llave foránea. <img src="https://cdn-icons-png.flaticon.com/512/9068/9068699.png" width="13"/>(Con una llave dorada se identifica la llave primaria)
- Existen cuatro tipos de relaciones entre tablas. <img src="https://cdn-icons-png.flaticon.com/512/9068/9068699.png" width="13"/> (Esxisten 3 tipos de relaciones entre tablas: Uno a Uno, Uno a Muchos, Muchos a Muchos)

### Actividad 4:

1. ¡Ahora ejecutaremos un script y crearemos una base de datos por primera vez! Primero,
deberemos abrir el script llamado “superhéroes.sql” y ejecutarlo de modo tal que se cree
la base de datos y todas sus tablas.

2. Analiza el script detenidamente, línea por línea, ayudándote con la guía. Intenta
comprender qué pasa en cada sentencia del script. Luego contesta:

    2.1. ¿Cuántas columnas posee la tabla “creador”?
    - a) 0
    - b) 1
    - c) 2 <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>
    - d) 3

    2.2. ¿Cuántas columnas numéricas posee la tabla “personaje”?
    - a) 6 <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>
    - b) 9
    - c) 10
    - d) 12

    2.3 ¿Cuántas columnas de la tabla “personaje” pueden ser nulas?
    - a) Todas las columnas
    - b) 1 <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>
    - c) 10
    - d) Ninguna columna

    2.4. ¿Qué significa la primera línea del script?
    - a) Selecciona la base de datos sobre la cual se aplicarán las siguientes sentencias.
    - b) Elimina la base de datos al finalizar de ejecutar el script.
    - c) Elimina la base de datos en caso de ya estar creada. <img src="https://cdn-icons-png.flaticon.com/512/190/190411.png" width="13"/>
    - d) Ninguna de las anteriores

3. Elimina la base de datos “superhéroes.sql”.

- DROP DATABASE IF EXISTS superheroes;

### Actividad 5:
1. Primero insertar en la tabla “creador” los siguientes datos:

    - INSERT INTO creador VALUES(1, 'Marvel');
    - INSERT INTO creador VALUES(1, 'DC Comics');

2. Ahora, continuaremos insertando registros en la tabla personaje:

    - INSERT INTO personajes VALUES(1, 'Bruce Banner', 'Hulk', 160, '600 mil', 75, 98, 1962, 'Físico Nuclear', 1);
    - INSERT INTO personajes VALUES(2, 'Tony Stark', 'Iron Man', 170, '200 mil', 70, 123, 1963, 'Inventor Industrial', 1);
    - INSERT INTO personajes VALUES(3, 'Thor Odison', 'Thor', 145, 'infinita', 100, 235, 1962, 'Rey de Asgard', 1);
    - INSERT INTO personajes VALUES(4, 'Wanda Maximoff', 'Bruja Escarlata', 170, '100 mil', 90, 345, 1964, 'Bruja', 1);
    - INSERT INTO personajes VALUES(5, 'Carol Danvers', 'Capitana Marvel', 157, '250 mil', 85, 128, 1968, 'Oficial de Inteligencia', 1);
    - INSERT INTO personajes VALUES(6, 'Thanos', 'Thanos', 170, 'infinita', 40, 306, 1973, 'Adorador de la Muerte', 1);
    - INSERT INTO personajes VALUES(7, 'Peter Parker', 'Spiderman', 165, '25 mil', 80, 74, 1962, 'Fotógrafo', 1);
    - INSERT INTO personajes VALUES(8, 'Steve Rogers', 'Capitán América', 145, '600', 45, 60, 1941, 'Oficial Federal', 1);
    - INSERT INTO personajes VALUES(9, 'Bobby Drake', 'Ice Man', 140, '2 mil', 64, 122, 1963, 'Contador', 1);
    - INSERT INTO personajes VALUES(10, 'Barry Allen', 'Flash', 160, '10 mil', 120, 168, 1956, 'Científico Forense', 2);
    - INSERT INTO personajes VALUES(11, 'Bruce Wayne', 'Batman', 170, '500', 32, 47, 1939, 'Hombre de Negocios', 2);
    - INSERT INTO personajes VALUES(12, 'Clarck Kent', 'Superman', 165, 'infinita', 120, 182, 1948, 'Reportero', 2);
    - INSERT INTO personajes VALUES(13, 'diana Prince', 'Mujer Maravilla', 160, 'infinita', 95, 127, 1949, 'Princesa Guerrera', 2);

3. Cambiar en la tabla personajes el año de aparición a 1938 del personaje Superman:

    - UPDATE personajes SET aparicion = 1938 WHERE id_personaje = 12;

4. Eliminar el registro que contiene al personaje Iron Man (Bye Bye Mr. Stark! :D):

    - DELETE FROM personajes WHERE personaje = 'Iron Man';

### Actividad 6:

1. Ahora veamos cómo ha quedado la tabla “superheroes” que creaste anteriormente. Para ello
necesitarás una consulta de tipo SELECT.

2. Realiza una consulta que devuelva todos los valores de la columna “nombre_real” de la tabla
superhéroe.

    - SELECT nombre_real FROM personajes;

3. Realiza una consulta que devuelva todos los nombres reales de los personajes cuyo nombre
empieza con “B”.

    - SELECT nombre_real FROM personajes WHERE nombre_real LIKE 'b%';

### Actividad 7:

1. Pongamos a prueba esta nueva cláusula: order by. Seguiremos trabajando con la tabla
“superhéroe”. Realiza una consulta que devuelva todos los registros ordenados por “inteligencia”.

    - SELECT * FROM personajes ORDER BY inteligencia DESC;

## Ejercicios de Aprendizaje:

1. Abrir el script llamado “personal” y ejecutarlo de modo tal que se cree la base de datos
“personal”, se creen las tablas y se inserten todos los datos en las tablas. A continuación, realizar las siguientes consultas sobre la base de datos personal:

    1.1. Obtener los datos completos de los empleados:
    - SELECT * FROM empleados;

    1.2. Obtener los datos completos de los departamentos:
    - SELECT * FROM departamentos;

    1.3. Listar el nombre de los departamentos:
    - SELECT DISTINCT nombre_depto FROM departamentos;

    1.4. Obtener el nombre y salario de todos los empleados:
    - SELECT nombre, sal_emp FROM empleados;

    1.5. Listar todas las comisiones:
    - SELECT comision_emp FROM empleados;

    1.6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’:
    - SELECT * FROM empleados WHERE cargo_emp = 'Secretaria';

    1.7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente:
    - SELECT * FROM empleados WHERE cargo_emp = 'Vendedor' ORDER BY nombre ASC;

    1.8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor:
    - SELECT nombre, cargo_emp FROM empleados ORDER BY sal_emp ASC;

    1.9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”:
    - SELECT nombre_jefe_depto FROM departamentos WHERE ciudad = 'Ciudad Real';

    1.10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados:
    - SELECT nombre AS Nombre, cargo_emp AS Cargo FROM empleados;

    1.11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor:
    - SELECT sal_emp, comision_emp FROM empleados WHERE id_depto = 2000 ORDER BY comision_emp ASC;

    1.12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del empleado y el total a pagar, en orden alfabético:
    - SELECT nombre AS Nombre, (sal_emp + comision_emp) + 500 AS 'Total a Pagar' FROM Empleados WHERE id_depto = 3000 ORDER BY nombre ASC;

    1.13. Muestra los empleados cuyo nombre empiece con la letra J:
    - SELECT * FROM empleados WHERE nombre LIKE 'j%';

    1.14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000:
    - SELECT nombre AS 'Nombre', sal_emp AS 'Salario', comision_emp AS 'Comision', (sal_emp + comision_emp) AS 'Salario Total' FROM empleados WHERE comision_emp > 1000;

    1.15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión:
    - SELECT nombre AS 'Nombre', sal_emp AS 'Salario', comision_emp AS 'Comision', (sal_emp + comision_emp) AS 'Salario Total' FROM empleados WHERE comision_emp = 0;

    1.16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo:
    - SELECT * FROM empleados WHERE comision_emp > sal_emp;

    1.17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo:
    - SELECT * FROM empleados WHERE comision_emp <= (sal_emp * 0.30);

    1.18. Hallar los empleados cuyo nombre no contiene la cadena “MA”:
    - SELECT * FROM empleados WHERE nombre NOT LIKE '%ma%';

    1.19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento:
    - SELECT nombre_depto FROM departamentos WHERE nombre_depto IN ('Ventas', 'Investigacion', 'Mantenimiento');

    1.20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento:
    - SELECT nombre_depto FROM departamentos WHERE nombre_depto NOT IN ('Ventas', 'Investigacion', 'Mantenimiento');

    1.21. Mostrar el salario más alto de la empresa:
    - SELECT MAX(sal_emp) FROM empleados;

    1.22. Mostrar el nombre del último empleado de la lista por orden alfabético:
    - SELECT nombre FROM empleados ORDER BY nombre DESC LIMIT 1;

    1.23. Hallar el salario más alto, el más bajo y la diferencia entre ellos:
    - SELECT MAX(sal_emp) AS 'Salario más alto', MIN(sal_emp) AS 'Salario más bajo', (MAX(sal_emp) - MIN(sal_emp)) AS 'Diferencia' FROM empleados;

    1.24. Hallar el salario promedio por departamento:
    - SELECT nombre_depto, ROUND(AVG(sal_emp)) AS 'Salario Promedio' FROM empleados LEFT JOIN departamentos ON empleados.id_depto = departamentos.id_depto GROUP BY nombre_depto;

    1.25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos:
    - SELECT nombre_depto AS 'Departamento' , COUNT(id_emp) AS 'N° de Empleados' FROM empleados LEFT JOIN departamentos ON empleados.id_depto = departamentos.id_depto GROUP BY nombre_depto HAVING COUNT(id_emp) > 3;

    1.26. Hallar los departamentos que no tienen empleados:
    - SELECT nombre_depto AS 'Departamento' , COUNT(id_emp) AS 'N° de Empleados' FROM empleados LEFT JOIN departamentos ON empleados.id_depto = departamentos.id_depto GROUP BY nombre_depto HAVING COUNT(id_emp) = 0;

    1.27. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento:
    - SELECT * FROM empleados WHERE sal_emp >= (SELECT ROUND(AVG(sal_emp)) FROM empleados) ORDER BY id_depto;

2. Abrir el script de la base de datos llamada “tienda.sql” y ejecutarlo para crear sus tablas e
insertar datos en las mismas. A continuación, generar el modelo de entidad relación:

    2.1. Lista el nombre de todos los productos que hay en la tabla producto:
    - SELECT nombre FROM producto;

    2.2. Lista los nombres y los precios de todos los productos de la tabla producto:
    - SELECT nombre, precio FROM producto;

    2.3. Lista todas las columnas de la tabla producto.
    - SELECT * FROM producto;

    2.4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio:
    - SELECT nombre, ROUND(precio) AS redondeado FROM producto;

    2.5. Lista el código de los fabricantes que tienen productos en la tabla producto:
    - SELECT codigo_fabricante FROM producto;
    
    2.6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos:
    - SELECT DISTINCT codigo_fabricante FROM producto;

    2.7. Lista los nombres de los fabricantes ordenados de forma ascendente:
    - SELECT nombre FROM fabricante ORDER BY nombre ASC;

    2.8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente:
    - SELECT nombre, precio FROM producto ORDER BY nombre ASC, precio DESC;

    2.9. Devuelve una lista con las 5 primeras filas de la tabla fabricante:
    - SELECT * FROM fabricante LIMIT 5;

    2.10. Lista el nombre y el precio del producto más barato (Utilice solamente las cláusulas ORDER BY y LIMIT):
    - SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;

    2.11. Lista el nombre y el precio del producto más caro (Utilice solamente las cláusulas ORDER BY y LIMIT):
    - SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;

    2.12. Lista el nombre de los productos que tienen un precio menor o igual a $120:
    - SELECT nombre FROM producto WHERE precio <= 120;

    2.13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN:
    - SELECT * FROM producto WHERE precio BETWEEN 60 AND 200;

    2.14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.
    - SELECT * FROM producto WHERE codigo_fabricante IN (1,3,5);

    2.15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre:
    - SELECT nombre FROM producto WHERE nombre LIKE '%Portátil%';

    2.16. Devuelve una lista con el código del producto, nombre del producto, código del fabricante y nombre del fabricante, de todos los productos de la base de datos:
    - SELECT p.codigo, p.nombre, p.codigo_fabricante, f.nombre FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo;

    2.17. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por orden alfabético:
    - SELECT p.nombre, p.precio, f.nombre FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo ORDER BY f.nombre ASC;

    2.18. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato:
    - SELECT p.nombre, p.precio, f.nombre FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo ORDER BY p.precio ASC LIMIT 1;

    2.19. Devuelve una lista de todos los productos del fabricante Lenovo:
    - SELECT p.* FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo AND f.nombre = 'Lenovo';

    2.20. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200:
    - SELECT p.* FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo AND f.nombre = 'Crucial' AND p.precio > 200;

    2.21. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN.
    - SELECT p.* FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo AND f.nombre IN ('Asus', 'Hewlett-Packard');

    2.22. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente):
    - SELECT p.nombre, p.precio, f.nombre FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo AND p.precio >= 180 ORDER BY p.precio DESC, p.nombre ASC;

    2.23. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos fabricantes que no tienen productos asociados:
    - SELECT f.nombre, p.nombre, p.precio FROM fabricante f LEFT JOIN producto p ON p.codigo_fabricante = f.codigo;

    2.24. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado:
    - SELECT f.nombre FROM fabricante f LEFT JOIN producto p on p.codigo_fabricante = f.codigo WHERE p.nombre IS NULL;

    2.25. Devuelve todos los productos del fabricante Lenovo (Sin utilizar INNER JOIN):
    - SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo');

    2.26. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo (Sin utilizar INNER JOIN):
    - SELECT * FROM producto WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo'));

    2.27. Lista el nombre del producto más caro del fabricante Lenovo:
    - SELECT nombre from producto WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo')) AND codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo');

    2.28. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos:
    - SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Asus') AND precio > (SELECT AVG(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'Asus'));

    2.29. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN):
    - SELECT * FROM fabricante WHERE codigo IN (SELECT codigo_fabricante FROM producto);

    2.30. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN):
    - SELECT * FROM fabricante WHERE codigo NOT IN (SELECT codigo_fabricante FROM producto);

    2.31. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo:
    - SELECT f.nombre, count(*) FROM producto p, fabricante f WHERE p.codigo_fabricante = f.codigo GROUP BY f.nombre HAVING COUNT(*) = (SELECT COUNT(*) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre ='Lenovo'));

## Ejercicios de Aprendizaje Extra:

1. Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e
insertar datos en las mismas. A continuación, realizar las siguientes consultas sobre la base de datos:

    1.1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente:
    - SELECT Nombre FROM jugadores ORDER BY Nombre ASC;

    1.2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente:
    - SELECT Nombre FROM jugadores WHERE posicion LIKE '%C%' AND peso > 200 ORDER BY Nombre ASC;

    1.3. Mostrar el nombre de todos los equipos ordenados alfabéticamente:
    - SELECT Nombre FROM equipos ORDER BY Nombre ASC;

    1.4. Mostrar el nombre de los equipos del este (East):
    - SELECT Nombre FROM equipos WHERE conferencia = 'East' ORDER BY Nombre ASC;

    1.5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre:
    - SELECT Nombre FROM equipos WHERE ciudad LIKE 'C%' ORDER BY Nombre ASC; 

    1.6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo:
    - SELECT Nombre, Nombre_equipo FROM jugadores ORDER BY Nombre_equipo, Nombre ASC;

    1.7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre:
    - SELECT Nombre, Nombre_equipo FROM jugadores WHERE Nombre_equipo = 'Raptors' ORDER BY Nombre ASC;

    1.8. Mostrar los puntos por partido del jugador ‘Pau Gasol’:
    - SELECT Puntos_por_partido FROM estadisticas e, jugadores j WHERE e.jugador = j.codigo AND j.Nombre = 'Pau Gasol';

    1.9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′:
    - SELECT Puntos_por_partido FROM estadisticas e, jugadores j WHERE e.jugador = j.codigo AND j.Nombre = 'Pau Gasol' AND temporada = '04/05';

    1.10. Mostrar el número de puntos de cada jugador en toda su carrera:
    - SELECT j.Nombre, SUM(e.Puntos_por_partido) AS Puntos FROM jugadores j, estadisticas e WHERE j.codigo = e.jugador GROUP BY j.Nombre ORDER BY j.Nombre ASC;

    1.11. Mostrar el número de jugadores de cada equipo:
    - SELECT Nombre_equipo, COUNT(*) FROM jugadores GROUP BY Nombre_equipo; 

    1.12. Mostrar el jugador que más puntos ha realizado en toda su carrera:
    - SELECT p.Nombre FROM (SELECT j.Nombre, SUM(e.Puntos_por_partido) AS Puntos FROM jugadores j, estadisticas e WHERE j.codigo = e.jugador GROUP BY j.Nombre ORDER BY j.Nombre ASC) p ORDER BY p.Puntos DESC LIMIT 1;

    1.13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA:
    - SELECT j.Nombre AS Jugador, e.Nombre AS Equipo, e.conferencia AS Conferencia, e.division AS Division FROM equipos e, jugadores j WHERE e.Nombre = j.Nombre_equipo AND j.altura = (SELECT MAX(altura) FROM jugadores);

    1.14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos:
    - SELECT equipo_local, equipo_visitante, ABS(puntos_local - puntos_visitante) AS diferencia FROM partidos WHERE ABS(puntos_local - puntos_visitante) = (SELECT MAX(ABS(puntos_local - puntos_visitante)) FROM partidos);

    1.15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null:
    - SELECT codigo, equipo_local, equipo_visitante, CASE WHEN p.puntos_local > p.puntos_visitante THEN equipo_local WHEN p.puntos_local < p.puntos_visitante THEN equipo_visitante ELSE NULL END AS ganador FROM partidos p;

2. Abrir el script de la base de datos llamada “jardineria.sql” y ejecutarlo para crear todas las
tablas e insertar datos en las mismas. A continuación, se deben realizar las siguientes consultas sobre la base de datos:

    2.1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas:
    - SELECT codigo_oficina, ciudad FROM oficina;

    2.2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España:
    - SELECT ciudad, telefono FROM oficina WHERE pais = 'España';

    2.3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7:
    - SELECT nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe = 7;

    2.4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa:
    - SELECT puesto, nombre, apellido1, apellido2, email FROM empleado WHERE puesto LIKE 'Director General';

    2.5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas:
    - SELECT nombre, apellido1, apellido2, puesto FROM empleado WHERE puesto NOT LIKE 'Representante Ventas';

    2.6. Devuelve un listado con el nombre de los todos los clientes españoles:
    - SELECT nombre_cliente FROM cliente WHERE pais LIKE 'Spain';

    2.7. Devuelve un listado con los distintos estados por los que puede pasar un pedido:
    - SELECT DISTINCT estado FROM pedido;

    2.8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. Resuelva la consulta:
        ° Utilizando la función YEAR de MySQL.
        - SELECT DISTINCT pago.codigo_cliente FROM pago WHERE YEAR(pago.fecha_pago) = 2008;
        ° Utilizando la función DATE_FORMAT de MySQL.
        - SELECT DISTINCT pago.codigo_cliente FROM pago WHERE DATE_FORMAT(pago.fecha_pago, "%Y") = 2008;
        ° Sin utilizar ninguna de las funciones anteriores.
        - SELECT DISTINCT pago.codigo_cliente FROM pago WHERE DATE(pago.fecha_pago) >= "2008-01-01" AND DATE(pago.fecha_pago) <= "2008-12-31";
    
    2.9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo:
    - SELECT pedido.codigo_pedido, pedido.codigo_cliente, pedido.fecha_esperada, pedido.fecha_entrega FROM pedido WHERE pedido.estado = "Entregado" AND pedido.fecha_entrega > pedido.fecha_esperada;

    2.10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada:
        ° Utilizando la función ADDDATE de MySQL.
        - SELECT pedido.codigo_pedido, pedido.codigo_cliente, pedido.fecha_esperada, pedido.fecha_entrega FROM pedido WHERE ADDDATE(pedido.fecha_entrega, 2) <= pedido.fecha_esperada;
        ° Utilizando la función DATEDIFF de MySQL.
        - SELECT pedido.codigo_pedido, pedido.codigo_cliente, pedido.fecha_esperada, pedido.fecha_entrega FROM pedido WHERE DATEDIFF(pedido.fecha_esperada, pedido.fecha_entrega) >= 2;
    
    2.11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009:
    - SELECT * FROM pedido WHERE pedido.estado = "Rechazado" AND YEAR(pedido.fecha_pedido) = 2009;

    2.12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año:
    - SELECT * FROM pedido WHERE pedido.estado = "Entregado" AND MONTH(pedido.fecha_entrega) = 1;

    2.13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor:
    - SELECT * FROM pago WHERE YEAR(pago.fecha_pago) = 2008 AND pago.forma_pago = "PayPal" ORDER BY pago.total DESC;

    2.14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas:
    - SELECT DISTINCT pago.forma_pago FROM pago;

    2.15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio:
    - SELECT * FROM producto WHERE producto.gama = "Ornamentales" AND producto.cantidad_en_stock > 100 ORDER BY producto.precio_venta DESC;

    2.16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30:
    - SELECT * FROM cliente WHERE cliente.ciudad = "Madrid" AND (cliente.codigo_empleado_rep_ventas = 11 OR cliente.codigo_empleado_rep_ventas = 30);

    2.17. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas:
    - SELECT c.nombre_cliente, c.nombre_contacto, c.apellido_contacto, e.nombre, e.apellido1, e.apellido2 FROM cliente c, empleado e WHERE c.codigo_empleado_rep_ventas = e.codigo_empleado;

    2.18 Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas:
    - SELECT c.nombre_cliente, e.nombre AS "Representante de Ventas" FROM cliente c INNER JOIN empleado e ON e.codigo_empleado = c.codigo_empleado_rep_ventas INNER JOIN pago USING(codigo_cliente);

    2.19 Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas:
    - SELECT c.nombre_cliente, e.nombre AS "Representante de Ventas" FROM cliente c INNER JOIN empleado e ON e.codigo_empleado = c.codigo_empleado_rep_ventas WHERE c.codigo_cliente NOT IN (SELECT p.codigo_cliente FROM pago p);

    2.20 Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante:
    - SELECT DISTINCT cliente.nombre_cliente, empleado.nombre, oficina.ciudad FROM cliente INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina;

    2.21 Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante:
    - SELECT DISTINCT cliente.nombre_cliente, empleado.nombre, oficina.ciudad FROM cliente INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE cliente.codigo_cliente NOT IN (SELECT p.codigo_cliente FROM pago p);

    2.22 Lista la dirección de las oficinas que tengan clientes en Fuenlabrada:
    - SELECT oficina.linea_direccion1, oficina.linea_direccion2 FROM oficina INNER JOIN empleado ON empleado.codigo_oficina = oficina.codigo_oficina INNER JOIN cliente ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado WHERE cliente.ciudad = "Fuenlabrada";

    2.23 Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante:
    - SELECT cliente.nombre_cliente, empleado.nombre, oficina.ciudad FROM cliente INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina;

    2.24 Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes:
    - SELECT empleado.nombre, e.nombre AS "Jefe" FROM empleado as e INNER JOIN empleado ON e.codigo_empleado = empleado.codigo_jefe;

    2.25 Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido:
    - SELECT DISTINCT cliente.nombre_cliente FROM cliente INNER JOIN pedido ON pedido.codigo_cliente = cliente.codigo_cliente WHERE pedido.fecha_esperada < pedido.fecha_entrega;

    2.26 Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente:
    - SELECT DISTINCT c.nombre_cliente, p.gama FROM cliente AS c INNER JOIN pedido AS pe ON pe.codigo_cliente = c.codigo_cliente INNER JOIN detalle_pedido AS d ON d.codigo_pedido = pe.codigo_pedido INNER JOIN producto AS p ON p.codigo_producto = d.codigo_producto;

    2.27 Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago:
    - SELECT c.nombre_cliente FROM cliente AS c LEFT JOIN pago AS p ON p.codigo_cliente = c.codigo_cliente WHERE p.codigo_cliente IS NULL;

    2.28 Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido:
    - SELECT c.nombre_cliente FROM cliente AS c LEFT JOIN pedido AS p ON p.codigo_cliente = c.codigo_cliente WHERE p.codigo_cliente IS NULL;

    2.29 Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido:
    - SELECT c.nombre_cliente FROM cliente AS c LEFT JOIN pago AS p ON p.codigo_cliente = c.codigo_cliente LEFT JOIN pedido AS pe ON pe.codigo_cliente = c.codigo_cliente WHERE pe.codigo_cliente IS NULL;

    2.30 Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada:
    - SELECT e.nombre, e.apellido1, e.apellido2 FROM empleado AS e LEFT JOIN oficina AS o ON o.codigo_oficina = e.codigo_oficina WHERE o.codigo_oficina IS NULL;

    2.31 Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado:
    - SELECT e.nombre, e.apellido1, e.apellido2 FROM empleado AS e LEFT JOIN cliente AS c ON c.codigo_empleado_rep_ventas = e.codigo_empleado WHERE c.codigo_empleado_rep_ventas IS NULL;

    2.32 Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado:
    - SELECT e.nombre, e.apellido1, e.apellido2 FROM empleado AS e LEFT JOIN oficina AS o ON o.codigo_oficina = e.codigo_oficina LEFT JOIN cliente AS c ON c.codigo_empleado_rep_ventas = e.codigo_empleado WHERE o.codigo_oficina IS NULL AND c.codigo_empleado_rep_ventas IS NULL;

    2.33 Devuelve un listado de los productos que nunca han aparecido en un pedido:
    - SELECT DISTINCT p.nombre FROM producto AS p LEFT JOIN detalle_pedido AS d ON d.codigo_producto = p.codigo_producto WHERE d.codigo_producto IS NULL;

    2.34 Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún  cliente que haya realizado la compra de algún producto de la gama Frutales:
    - SELECT * FROM oficina AS o LEFT JOIN (SELECT DISTINCT e.codigo_oficina FROM empleado AS e INNER JOIN cliente AS c ON c.codigo_empleado_rep_ventas = e.codigo_empleado INNER JOIN pedido AS p ON p.codigo_cliente = c.codigo_cliente INNER JOIN detalle_pedido AS de ON de.codigo_pedido = p.codigo_pedido INNER JOIN producto AS pro ON de.codigo_pedido = pro.codigo_producto WHERE pro.gama = "Frutales") AS q ON o.codigo_oficina = q.codigo_oficina WHERE q.codigo_oficina IS NULL;

    2.35 Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago:
    - SELECT DISTINCT c.codigo_cliente, c.nombre_cliente FROM cliente as c LEFT JOIN pedido AS p ON p.codigo_cliente = c.codigo_cliente LEFT JOIN pago AS pa ON pa.codigo_cliente = c.codigo_cliente WHERE pa.codigo_cliente IS NULL AND c.codigo_cliente = p.codigo_cliente;

    2.36 Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado:
    - SELECT e.codigo_empleado, e.nombre, e.apellido1, e.apellido2, e.email, empleado.nombre AS 'Jefe' FROM empleado e LEFT JOIN empleado ON e.codigo_jefe = empleado.codigo_empleado LEFT JOIN cliente AS c ON c.codigo_empleado_rep_ventas = e.codigo_empleado WHERE c.codigo_empleado_rep_ventas IS NULL;

    2.37 ¿Cuántos empleados hay en la compañía?:
    - SELECT COUNT(empleado.codigo_empleado) FROM empleado;

    2.38 ¿Cuántos clientes tiene cada país?:
    - SELECT COUNT(cliente.codigo_cliente) AS "N° Clientes por país", cliente.pais FROM cliente GROUP BY pais ORDER BY COUNT(cliente.codigo_cliente) DESC;

    2.39 ¿Cuál fue el pago medio en 2009?:
    - SELECT AVG(pago.total) FROM pago WHERE YEAR(pago.fecha_pago) = 2009;

    2.40 ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos:
    - SELECT pedido.estado, COUNT(pedido.codigo_pedido) FROM pedido GROUP BY pedido.estado ORDER BY COUNT(pedido.codigo_pedido) DESC;

    2.41 Calcula el precio de venta del producto más caro y más barato en una misma consulta:
    - SELECT MAX(producto.precio_venta), MIN(producto.precio_venta) FROM producto;

    2.42 Calcula el número de clientes que tiene la empresa:
    - SELECT COUNT(cliente.codigo_cliente) FROM cliente;

    2.43 ¿Cuántos clientes tiene la ciudad de Madrid?:
    - SELECT COUNT(cliente.codigo_cliente) FROM cliente WHERE cliente.ciudad = "Madrid";

    2.44 ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?:
    - SELECT COUNT(cliente.codigo_cliente) FROM cliente WHERE cliente.ciudad LIKE "M%";

    2.45 Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno:
    - SELECT e.nombre, COUNT(c.codigo_empleado_rep_ventas) FROM empleado AS e INNER JOIN cliente AS c ON c.codigo_empleado_rep_ventas = e.codigo_empleado GROUP BY e.codigo_empleado;

    2.46 Calcula el número de clientes que no tiene asignado representante de ventas:
    - SELECT COUNT(c.codigo_cliente) FROM cliente AS c WHERE c.codigo_empleado_rep_ventas IS NULL;

    2.47 Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado deberá mostrar el nombre y los apellidos de cada cliente:
    - SELECT c.nombre_contacto, c.apellido_contacto, MIN(p.fecha_pago), MAX(p.fecha_pago) FROM pago AS p INNER JOIN cliente AS c ON c.codigo_cliente = p.codigo_cliente GROUP BY c.codigo_cliente;

    2.48 Calcula el número de productos diferentes que hay en cada uno de los pedidos:
    - SELECT detalle_pedido.codigo_pedido, COUNT(DISTINCT detalle_pedido.codigo_producto) FROM detalle_pedido GROUP BY detalle_pedido.codigo_pedido;

    2.49 Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos:
    - SELECT detalle_pedido.codigo_pedido, SUM(detalle_pedido.cantidad) FROM detalle_pedido GROUP BY detalle_pedido.codigo_pedido;

    2.50 Devuelve un listado de los 20 productos más vendidos y el número total de unidades que se han vendido de cada uno. El listado deberá estar ordenado por el número total de unidades vendidas:
    - SELECT p.nombre, SUM(dp.cantidad) FROM producto p INNER JOIN detalle_pedido dp ON p.codigo_producto = dp.codigo_producto GROUP BY p.nombre ORDER BY SUM(dp.cantidad) DESC LIMIT 20;

    2.51 La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base imponible, y el total la suma de los dos campos anteriores:
    - SELECT SUM(cantidad * precio_unidad) AS "Base Imponible", SUM(cantidad * precio_unidad * 0.21) AS "IVA", SUM(cantidad * precio_unidad) + SUM(cantidad * precio_unidad * 0.21) AS "Facturación Total" FROM detalle_pedido;

    2.52 La misma información que en la pregunta anterior, pero agrupada por código de producto:
    - SELECT codigo_producto, SUM(cantidad * precio_unidad) AS "Base Imponible", SUM(cantidad * precio_unidad * 0.21) AS "IVA", SUM(cantidad * precio_unidad) + SUM(cantidad * precio_unidad * 0.21) AS "Facturación Total" FROM detalle_pedido GROUP BY codigo_producto ORDER BY SUM(cantidad * precio_unidad) + SUM(cantidad * precio_unidad * 0.21) ASC;

    2.53 La misma información que en la pregunta anterior, pero agrupada por código de producto filtrada por los códigos que empiecen por OR:
    - SELECT codigo_producto, SUM(cantidad * precio_unidad) AS "Base Imponible", SUM(cantidad * precio_unidad * 0.21) AS "IVA", SUM(cantidad * precio_unidad) + SUM(cantidad * precio_unidad * 0.21) AS "Facturación Total" FROM detalle_pedido WHERE codigo_producto LIKE "OR%" GROUP BY codigo_producto ORDER BY SUM(cantidad * precio_unidad) + SUM(cantidad * precio_unidad * 0.21) ASC;

    2.54 Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA):
    - SELECT producto.nombre AS "Nombre del producto", SUM(detalle_pedido.cantidad) AS "Unidades vendidas", SUM(detalle_pedido.cantidad * detalle_pedido.precio_unidad) AS "Total facturado", SUM(detalle_pedido.cantidad * detalle_pedido.precio_unidad * 0.21) AS "IVA", SUM(detalle_pedido.cantidad * detalle_pedido.precio_unidad) + SUM(detalle_pedido.cantidad * detalle_pedido.precio_unidad * 0.21) AS "Total facturado con impuestos" FROM producto INNER JOIN detalle_pedido ON detalle_pedido.codigo_producto = producto.codigo_producto GROUP BY producto.codigo_producto HAVING SUM(detalle_pedido.cantidad * detalle_pedido.precio_unidad) > 3000;

    2.55 Devuelve el nombre del cliente con mayor límite de crédito:
    - SELECT cliente.codigo_cliente, cliente.nombre_cliente, cliente.limite_credito FROM cliente WHERE cliente.limite_credito = (SELECT MAX(cliente.limite_credito) FROM cliente);

    2.56 Devuelve el nombre del producto que tenga el precio de venta más caro:
    - SELECT producto.codigo_producto, producto.nombre, producto.precio_venta FROM producto WHERE producto.precio_venta = (SELECT MAX(producto.precio_venta) FROM producto);

    2.57 Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta que tendrá que calcular cuál es el número total de unidades que se han vendido de cada producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código del producto, puede obtener su nombre fácilmente.):
    - SELECT producto.nombre, detalle_pedido.codigo_producto, SUM(detalle_pedido.cantidad) FROM detalle_pedido INNER JOIN producto ON producto.codigo_producto = detalle_pedido.codigo_producto GROUP BY detalle_pedido.codigo_producto ORDER BY SUM(detalle_pedido.cantidad) DESC LIMIT 1;

    2.58 Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN):
    - SELECT cliente.nombre_cliente FROM cliente WHERE cliente.limite_credito > (SELECT SUM(pago.total) FROM pago WHERE pago.codigo_cliente = cliente.codigo_cliente);

    2.59 Devuelve el producto que más unidades tiene en stock:
    - SELECT p.nombre, SUM(p.cantidad_en_stock) FROM producto p GROUP BY p.nombre HAVING SUM(p.cantidad_en_stock) = (SELECT MAX(suma) AS max_suma FROM (SELECT SUM(p.cantidad_en_stock) AS suma FROM producto p GROUP BY p.nombre) AS subquery);

    2.60 Devuelve el producto que menos unidades tiene en stock:
    - SELECT p.nombre, SUM(p.cantidad_en_stock) FROM producto p GROUP BY p.nombre HAVING SUM(p.cantidad_en_stock) = (SELECT MIN(suma) AS min_suma FROM (SELECT SUM(p.cantidad_en_stock) AS suma FROM producto p GROUP BY p.nombre) AS subquery);

    2.61 Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria:
    - SELECT empleado.nombre, empleado.apellido1, empleado.apellido2, empleado.email FROM empleado WHERE empleado.codigo_jefe = (SELECT empleado.codigo_empleado FROM empleado WHERE empleado.nombre = "Alberto" AND empleado.apellido1 = "Soria");

    2.62 Devuelve el nombre del cliente con mayor límite de crédito:
    - SELECT cliente.nombre_cliente FROM cliente WHERE cliente.limite_credito >= ALL (SELECT cliente.limite_credito FROM cliente);

    2.63 Devuelve el nombre del producto que tenga el precio de venta más caro:
    - SELECT producto.nombre FROM producto WHERE producto.precio_venta >= ALL (SELECT producto.precio_venta FROM producto);

    2.64 Devuelve el producto que menos unidades tiene en stock:
    - SELECT producto.nombre, producto.cantidad_en_stock FROM producto WHERE producto.cantidad_en_stock <= ALL (SELECT producto.cantidad_en_stock FROM producto);

    2.65 Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún cliente:
    - SELECT empleado.nombre, empleado.apellido1, empleado.puesto FROM empleado WHERE empleado.codigo_empleado NOT IN (SELECT cliente.codigo_empleado_rep_ventas FROM cliente);

    2.66 Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago:
    - SELECT * FROM cliente WHERE cliente.codigo_cliente NOT IN (SELECT pago.codigo_cliente FROM pago);

    2.67 Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago:
    - SELECT * FROM cliente WHERE cliente.codigo_cliente IN (SELECT pago.codigo_cliente FROM pago);

    2.68 Devuelve un listado de los productos que nunca han aparecido en un pedido:
    - SELECT * FROM producto WHERE producto.codigo_producto NOT IN (SELECT detalle_pedido.codigo_producto FROM detalle_pedido);

    2.69 Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que no sean representante de ventas de ningún cliente:
    - SELECT empleado.nombre, empleado.apellido1, empleado.apellido2, empleado.puesto FROM empleado INNER JOIN oficina ON oficina.codigo_oficina = empleado.codigo_oficina WHERE empleado.codigo_empleado NOT IN (SELECT cliente.codigo_empleado_rep_ventas FROM cliente);
    
    2.70 Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago:
    - SELECT * FROM cliente WHERE NOT EXISTS (SELECT * FROM pago WHERE pago.codigo_cliente = cliente.codigo_cliente);

    2.71 Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago:
    - SELECT * FROM cliente WHERE EXISTS (SELECT * FROM pago WHERE pago.codigo_cliente = cliente.codigo_cliente);

    2.72 Devuelve un listado de los productos que nunca han aparecido en un pedido:
    - SELECT * FROM producto WHERE NOT EXISTS (SELECT * FROM detalle_pedido WHERE detalle_pedido.codigo_producto = producto.codigo_producto);

    2.73 Devuelve un listado de los productos que han aparecido en un pedido alguna vez:
    - SELECT * FROM producto WHERE EXISTS (SELECT * FROM detalle_pedido WHERE detalle_pedido.codigo_producto = producto.codigo_producto);

3. Importar el script de la base de datos llamada “pokemondb.sql” y ejecutarlo para crear todas
las tablas e insertar los registros en las mismas. A continuación, se deben realizar las siguientes consultas:

    3.1 Mostrar el nombre de todos los pokemon:
    - SELECT nombre FROM pokemon;

    3.2 Mostrar los pokemon que pesen menos de 10k:
    - SELECT nombre FROM pokemon WHERE peso <= 10;

    3.3 Mostrar los pokemon de tipo agua:
    - SELECT p.nombre FROM pokemon p, pokemon_tipo pt, tipo t WHERE p.numero_pokedex = pt.numero_pokedex AND pt.id_tipo=t.id_tipo AND t.nombre = 'Agua';

    3.4 Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo:
    - SELECT p.nombre, t.nombre FROM pokemon p, pokemon_tipo pt, tipo t WHERE p.numero_pokedex = pt.numero_pokedex AND pt.id_tipo=t.id_tipo AND t.nombre = 'Agua' OR t.nombre = 'Fuego' OR t.nombre = 'Tierra' ORDER BY t.nombre;

    3.5 Mostrar los pokemon que son de tipo fuego y volador:
    - SELECT nombre FROM pokemon WHERE numero_pokedex IN (SELECT numero_pokedex FROM pokemon_tipo pt, tipo t WHERE pt.id_tipo=t.id_tipo AND t.nombre = 'Fuego') AND numero_pokedex IN (SELECT numero_pokedex FROM pokemon_tipo pt, tipo t WHERE pt.id_tipo=t.id_tipo AND t.nombre = 'Volador');

    3.6 Mostrar los pokemon con una estadística base de ps mayor que 200:
    - SELECT p.nombre FROM pokemon p, estadisticas_base est WHERE p.numero_pokedex=est.numero_pokedex AND est.ps >= 200;

    3.7 Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok:
    - SELECT p.nombre, p.altura, p.peso FROM pokemon p, evoluciona_de ev WHERE p.numero_pokedex = ev.pokemon_origen AND ev.pokemon_evolucionado = (SELECT numero_pokedex FROM pokemon WHERE nombre = 'Arbok');

    3.8 Mostrar aquellos pokemon que evolucionan por intercambio:
    - SELECT p.nombre FROM pokemon p, pokemon_forma_evolucion pfe, forma_evolucion fe, tipo_evolucion te WHERE p.numero_pokedex = pfe.numero_pokedex AND pfe.id_forma_evolucion = fe.id_forma_evolucion AND fe.tipo_evolucion = te.id_tipo_evolucion AND te.tipo_evolucion = 'Intercambio';

    3.9 Mostrar el nombre del movimiento con más prioridad:
    - SELECT nombre FROM movimiento mov WHERE prioridad = (SELECT MAX(prioridad) FROM movimiento);

    3.10 Mostrar el pokemon más pesado:
    - SELECT nombre, peso FROM pokemon WHERE peso = (SELECT MAX(peso) FROM pokemon);

    3.11 Mostrar el nombre y tipo del ataque con más potencia:
    - SELECT m.nombre AS movimiento, t.nombre AS tipo, m.potencia FROM movimiento m, tipo t WHERE m.id_tipo = t.id_tipo AND m.potencia = (SELECT MAX(potencia) FROM movimiento);

    3.12 Mostrar el número de movimientos de cada tipo:
    - SELECT t.nombre AS tipo, COUNT(*) AS num_mov FROM tipo t, movimiento m WHERE m.id_tipo = t.id_tipo GROUP BY t.nombre;

    3.13 Mostrar todos los movimientos que puedan envenenar:
    - SELECT m.nombre, mes.probabilidad FROM movimiento m, movimiento_efecto_secundario mes, efecto_secundario es WHERE m.id_movimiento = mes.id_movimiento AND mes.id_efecto_secundario = es.id_efecto_secundario AND es.efecto_secundario LIKE '%Envenena%';

    3.14 Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre:
    - SELECT m.nombre, m.descripcion FROM movimiento m WHERE m.descripcion LIKE '%daño%';
    
    3.15 Mostrar todos los movimientos que aprende pikachu:
    - SELECT DISTINCT m.nombre FROM movimiento m, pokemon p, pokemon_movimiento_forma pmf WHERE p.numero_pokedex = pmf.numero_pokedex AND pmf.id_movimiento = m.id_movimiento AND p.nombre = 'Pikachu';

    3.16 Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje):
    - SELECT DISTINCT m.nombre FROM movimiento m, pokemon p, pokemon_movimiento_forma pmf, forma_aprendizaje fa, tipo_forma_aprendizaje tfa WHERE p.numero_pokedex = pmf.numero_pokedex AND pmf.id_movimiento = m.id_movimiento AND pmf.id_forma_aprendizaje = fa.id_forma_aprendizaje AND fa.id_tipo_aprendizaje = tfa.id_tipo_aprendizaje AND tfa.tipo_aprendizaje = 'MT' AND p.nombre = 'Pikachu';

    3.17 Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel:
    - SELECT DISTINCT m.nombre FROM movimiento m, pokemon p, pokemon_movimiento_forma pmf, forma_aprendizaje fa, tipo_forma_aprendizaje tfa, tipo t WHERE p.numero_pokedex = pmf.numero_pokedex AND pmf.id_movimiento = m.id_movimiento AND pmf.id_forma_aprendizaje = fa.id_forma_aprendizaje AND fa.id_tipo_aprendizaje = tfa.id_tipo_aprendizaje AND m.id_tipo = t.id_tipo AND t.nombre = 'Normal' AND tfa.tipo_aprendizaje = 'Nivel' AND p.nombre = 'Pikachu';

    3.18 Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%:
    - SELECT m.*, mes.probabilidad FROM movimiento m, movimiento_efecto_secundario mes, efecto_secundario es WHERE m.id_movimiento = mes.id_movimiento AND mes.id_efecto_secundario = es.id_efecto_secundario AND mes.probabilidad >= 30;

    3.19 Mostrar todos los pokemon que evolucionan por piedra:
    - SELECT * FROM pokemon_evolucion_piedra;

    3.20 Mostrar todos los pokemon que no pueden evolucionar:
    - SELECT * FROM pokemon_no_evolucionan;
    
    3.21 Mostrar la cantidad de los pokemon de cada tipo:
    - SELECT * FROM cantidad_tipo_pokemon;