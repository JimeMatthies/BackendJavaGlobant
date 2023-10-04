<h1 align="center">Encuentro 105 - Integrador Java + MySQL</h1>

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

## Respuestas Integrador MySQL:

### Candado A:

- Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:

    Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo. Este resultado nos dará la posición del candado (1, 2, 3 o 4)

    SELECT COUNT(*) FROM estadisticas GROUP BY Asistencias_por_partido ORDER BY Asistencias_por_partido DESC LIMIT 1;

    Respuesta: "2"

- Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de datos:

    Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro o esté comprendida en otras posiciones.

    SELECT SUM(Peso) FROM jugadores INNER JOIN equipos ON equipos.Nombre = jugadores.Nombre_Equipo WHERE Conferencia LIKE 'East' AND Posicion LIKE '%c%';

    Respuesta: "14043"

### Candado B:

- Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:

    Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat. Este resultado nos dará la posición del candado (1, 2, 3 o 4)

    SELECT COUNT(Nombre) FROM jugadores INNER JOIN estadisticas ON estadisticas.jugador = jugadores.codigo WHERE Asistencias_por_partido > (SELECT COUNT(codigo) FROM jugadores WHERE Nombre_Equipo LIKE 'Heat');

    Respuesta: "3"

- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos:

    La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.

    SELECT COUNT(temporada) FROM partidos WHERE temporada LIKE '%99%';

    Respuesta: "3480"

### Candado C:

- Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:

    La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de la conferencia oeste. Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a eso le vamos a sumar 0.9945. Este resultado nos dará la posición del candado (1, 2, 3 o 4)

    SELECT COUNT(*)/(SELECT COUNT(*) FROM jugadores WHERE Peso >= 195) + 0.9945 FROM jugadores INNER JOIN equipos ON equipos.Nombre = jugadores.Nombre_Equipo WHERE Procedencia LIKE 'Michigan' AND Conferencia = 'West';

    Respuesta: "1"

- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos:

    Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de tapones por partido. Además, este resultado debe ser, donde la división sea central.

    SELECT FLOOR(AVG(Puntos_por_partido)+COUNT(Asistencias_por_partido)+SUM(Tapones_por_partido)) FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre WHERE Division = 'Central';

    Respuesta: "631"

### Candado D:

- Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:

    Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este resultado debe ser redondeado. Nota: El resultado debe estar redondeado. Este resultado nos dará la posición del candado (1, 2, 3 o 4)

    SELECT ROUND(Tapones_por_partido) FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo  WHERE Temporada = '00/01' AND Nombre = 'Corey Maggette';

    Respuesta: "4"

- Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
datos:
    
    Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido de todos los jugadores de procedencia argentina.

    SELECT FLOOR(SUM(Puntos_por_partido)) FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo WHERE Procedencia = 'Argentina';

    Respuesta: "191"