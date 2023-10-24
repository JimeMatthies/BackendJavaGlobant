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

import java.util.ArrayList;

public class Cinema {
    
    private Movie movie;
    private ArrayList<ArrayList<Seat>> auditorium;
    private Double ticket;

    public Cinema() {
    }

    public Cinema(Movie movie, ArrayList<ArrayList<Seat>> auditorium, Double ticket) {
        this.movie = movie;
        this.auditorium = auditorium;
        this.ticket = ticket;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public ArrayList<ArrayList<Seat>> getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(ArrayList<ArrayList<Seat>> auditorium) {
        this.auditorium = auditorium;
    }

    public Double getTicket() {
        return ticket;
    }

    public void setTicket(Double ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Cinema{" + "movie=" + movie + ", auditorium=" + auditorium + ", ticket=" + ticket + '}';
    }

}
