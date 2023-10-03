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

### Actividad Extra:

