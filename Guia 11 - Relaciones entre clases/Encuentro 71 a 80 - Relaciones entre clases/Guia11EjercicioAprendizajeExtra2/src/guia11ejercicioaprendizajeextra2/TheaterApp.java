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
package guia11ejercicioaprendizajeextra2;

import Entity.Cinema;
import Entity.Movie;
import Entity.Seat;
import Entity.Spectator;
import Services.CinemaService;
import Services.SpectatorService;
import java.util.ArrayList;

public class TheaterApp {

    private ArrayList<ArrayList<Seat>> auditorium;
    private ArrayList<Spectator> audience;
    private Cinema cinema;
    private Movie movie;
    private CinemaService cs;
    private SpectatorService ps;

    public TheaterApp() {
        this.auditorium = new ArrayList();
        this.audience = new ArrayList();
        this.cs = new CinemaService();
        this.ps = new SpectatorService();
    }

    public void createTheather() {
        cinema = cs.createCinema();
        cs.showCinema(cinema);
        for (int i = 0; i < 5; i++) {
            audience.add(ps.createSpectator());
        }
        for (Spectator sp : audience) {
            ps.showSpectator(sp);
        }
    }

    public void sellTickets() {
        boolean sold = false;
        for (Spectator sp : audience) {
            if (cinema.getTicket() < sp.getBudget()) {
                if (cinema.getMovie().getRating() < sp.getAge()) {
                    do {
                        int index = (int) (Math.random() * auditorium.size());
                        ArrayList<Seat> row = auditorium.get(index);
                        int index2 = (int) (Math.random() * row.size());
                        Seat ss = row.get(index2);
                        if (!ss.getOccupied()) {
                            ss.setOccupied(Boolean.TRUE);
                            sp.setBudget(sp.getBudget() - cinema.getTicket());
                            sold = true;
                            System.out.println("Thanks " + sp.getName() + " for buying a ticket");
                            System.out.println("Your seats is " + ss.toString());
                        } else {
                            System.out.println("Sorry," + sp.getName() + " the seat " + ss.getMark() + ss.getNum() + " is occupied");
                            sold = false;
                        }
                    } while (!sold);
                } else {
                    System.out.println("Sorry, you are too young for this movie");
                }
            } else {
                System.out.println("Sorry, not enough money to purchase ticket");
            }
        }
    }

    public void loadAudience() {
        for (int i = 1; i <= 30; i++) {
            audience.add(new Spectator("Viewer " + i, 21, 21.50));
        }
    }

    public void loadTheater() {
        Character[] marks = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (Character mark : marks) {
            ArrayList<Seat> row = new ArrayList();
            for (int i = 1; i <= 8; i++) {
                row.add(new Seat(mark, i, false));

            }
            auditorium.add(row);
        }
        movie = new Movie("Everything Everywhere All at Once", 139, 17, "Daniels");
//        audience.add(new Spectator("Maria", 15, 17.25));
//        audience.add(new Spectator("Jimena", 36, 30.50));
//        audience.add(new Spectator("Adolfo", 50, 68.35));
//        audience.add(new Spectator("Eliana", 60, 75.45));
//        audience.add(new Spectator("German", 25, 4.25));
        loadAudience();
        cinema = new Cinema(movie, auditorium, 6.30);
    }

    public void showTheater() {
        cs.showCinema(cinema);
        for (Spectator sp : audience) {
            ps.showSpectator(sp);
        }
        cs.showAuditorium(auditorium);
    }

}
