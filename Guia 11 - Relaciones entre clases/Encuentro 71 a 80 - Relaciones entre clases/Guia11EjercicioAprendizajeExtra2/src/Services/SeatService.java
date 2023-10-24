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

import Entity.Seat;
import java.util.Scanner;

public class SeatService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Seat createSeat() {
        System.out.println("---------------------------------");
        System.out.println("Seat's Character:");
        Character mark = SC.next().charAt(0);
        mark = Character.toUpperCase(mark);
        System.out.println("Seat's Number:");
        Integer num = SC.nextInt();
        System.out.println("Is the seat occupied?:");
        Boolean occupied = SC.nextBoolean();

        return new Seat(mark, num, occupied);
    }

    public void showSeat(Seat ss) {
        System.out.println("---------------------------------");
        System.out.println("Seat's info: ");
        System.out.println("Character: " + ss.getMark());
        System.out.println("Number: " + ss.getNum());
        System.out.println("Occupied?: " + ss.getOccupied());
    }

}
