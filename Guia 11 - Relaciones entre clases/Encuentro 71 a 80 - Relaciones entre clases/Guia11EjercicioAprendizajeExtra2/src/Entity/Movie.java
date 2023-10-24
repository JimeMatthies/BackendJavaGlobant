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
package Entity;

public class Movie {
    
    private String title;
    private Integer minutes;
    private Integer rating;
    private String director;

    public Movie() {
    }

    public Movie(String title, Integer minutes, Integer rating, String director) {
        this.title = title;
        this.minutes = minutes;
        this.rating = rating;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", minutes=" + minutes + ", rating=" + rating + ", director=" + director + '}';
    }
    
}
