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

import Entity.Cinema;
import Entity.Movie;
import Entity.Seat;
import java.util.ArrayList;
import java.util.Scanner;

public class CinemaService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private MovieService ms;

    public CinemaService() {
        this.ms = new MovieService();
    }

    public Cinema createCinema() {
        System.out.println("---------------------------------");
        System.out.println("Cinema's movie:");
        Movie movie = ms.createMovie();
        System.out.println("Cinema's auditorium:");
        ArrayList<ArrayList<Seat>> auditorium = createAuditorium();
        System.out.println("Cinema's ticket price:");
        Double ticket = SC.nextDouble();

        return new Cinema(movie, auditorium, ticket);
    }

    public void showCinema(Cinema cc) {
        System.out.println("---------------------------------");
        System.out.println("Cinema's info: ");
        System.out.println("Movie: " + cc.getMovie());
        System.out.println("Auditorium: " + cc.getAuditorium());
        System.out.println("Ticket: " + cc.getTicket());
    }

    public ArrayList<ArrayList<Seat>> createAuditorium() {
        ArrayList<ArrayList<Seat>> auditorium = new ArrayList();
        ArrayList<Seat> row = new ArrayList();
        System.out.println("---------------------------------");
        System.out.println("Number of columns:");
        int columns = SC.nextInt();
        System.out.println("Number of rows:");
        int rows = SC.nextInt();
        Character[] marks = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                row.add(new Seat(marks[i], i + 1, false));
            }
        }
        auditorium.add(row);
        return auditorium;
    }

    public void showAuditorium(ArrayList<ArrayList<Seat>> auditorium) {
        System.out.println("---------------------------------");
        System.out.println("Seats from auditorium:");
        int rowSize = 0;
        int seatsOccupied = 0;
        for (ArrayList<Seat> row : auditorium) {
            rowSize++;
            for (Seat ss : row) {
                System.out.print(ss.getMark());
                System.out.print(ss.getNum());
                if (ss.getOccupied()) {
                    System.out.print("X | ");
                    seatsOccupied++;
                } else {
                    System.out.print("  | ");
                }
            }
            System.out.println("");
        }
        System.out.println("Total of seats = " + auditorium.size()*rowSize);
        System.out.println("Free seats = " + ((auditorium.size()*rowSize) - seatsOccupied));
    }
}
