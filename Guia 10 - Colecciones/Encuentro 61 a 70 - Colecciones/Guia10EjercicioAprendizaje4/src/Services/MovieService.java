/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, tendremos una clase 
Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos 
y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
@author JimeM
 */
package Services;

import Entity.Movie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Movie> movies;

    public MovieService() {
        this.movies = new ArrayList();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public Movie createMovie() {
        System.out.println("---------------------------------");
        System.out.println("Movies's title:");
        String title = SC.next();
        title = title.toUpperCase();
        System.out.println("Movies's director:");
        String director = SC.next();
        director = director.toUpperCase();
        System.out.println("Movie's duration:");
        Double duration = SC.nextDouble();

        return new Movie(title, director, duration);
    }

    public void createMovies() {
        String answer = "";
        do {
            addMovie(createMovie());
            System.out.println("Do you want to add another movie? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
    }

    public void addMovie(Movie mm) {
        movies.add(mm);
    }

    public void showMovie(Movie mm) {
        System.out.println("---------------------------------");
        System.out.println("Movie's information: ");
        System.out.println("Title: " + mm.getTitle());
        System.out.println("Director: " + mm.getDirector());
        System.out.println("Duration: " + mm.getDuration());
    }

    public void showMovies() {
        System.out.println("---------------------------------");
        System.out.println("Movies from List:");
        for (Movie mm : movies) {
            System.out.println(mm.toString());
        }
        System.out.println("Number of movies = " + movies.size());
    }

    public void longMovies() {
        System.out.println("---------------------------------");
        System.out.println("Movies longer than an hour");
        movies.stream().filter((mm) -> mm.getDuration() > 1.0).forEach((mm) -> System.out.println(mm));
    }

    public void orderByDurationAsc() {
        Collections.sort(movies, (Movie m1, Movie m2) -> m1.getDuration().compareTo(m2.getDuration()));
    }

    public void orderByDurationDesc() {
        Collections.sort(movies, (Movie m1, Movie m2) -> m2.getDuration().compareTo(m1.getDuration()));
    }

    public void orderByTitleAsc() {
        Collections.sort(movies, (Movie m1, Movie m2) -> m1.getTitle().compareTo(m2.getTitle()));
    }

    public void orderByDirectorAsc() {
        Collections.sort(movies, (Movie m1, Movie m2) -> m1.getDirector().compareTo(m2.getDirector()));
    }
}
