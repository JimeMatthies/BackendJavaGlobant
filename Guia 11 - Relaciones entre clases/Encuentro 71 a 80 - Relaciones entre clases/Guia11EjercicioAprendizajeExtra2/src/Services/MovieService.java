/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos (8 filas por 6 columnas). 
De Cine nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y 
el precio de la entrada. Luego, de las películas nos interesa saber el título, duración, edad mínima y director. 
Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son etiquetados por una letra 
y un número la fila A1 empieza al final del mapa como se muestra en la tabla. También deberemos saber si el 
asiento está ocupado por un espectador o no, si esta ocupado se muestra una X, sino un espacio vacío.
@author JimeM
 */
package Services;

import Entity.Movie;
import java.util.Scanner;

public class MovieService {
    
    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Movie createMovie() {
        System.out.println("---------------------------------");
        System.out.println("Movie's title:");
        String title = SC.next();
        title = title.toUpperCase();
        System.out.println("Movies's duration in minutes:");
        Integer minutes = SC.nextInt();
        System.out.println("Movie's minimum age:");
        Integer age = SC.nextInt();
        System.out.println("Movie's director:");
        String director = SC.next();
        director = director.toUpperCase();

        return new Movie(title, minutes, age, director);
    }

    public void showMovie(Movie mm) {
        System.out.println("---------------------------------");
        System.out.println("Movie's info: ");
        System.out.println("Title: " + mm.getTitle());
        System.out.println("Minutes: " + mm.getMinutes());
        System.out.println("Rating: " + mm.getRating());
        System.out.println("Director: " + mm.getDirector());
    }

}