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

import Entity.Spectator;
import java.util.Scanner;

public class SpectatorService {
    
    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Spectator createSpectator() {
        System.out.println("---------------------------------");
        System.out.println("Spectator's name:");
        String name = SC.next();
        name = name.toUpperCase();
        System.out.println("Spectator's age:");
        Integer age = SC.nextInt();
        System.out.println("Spectator's budget:");
        Double budget = SC.nextDouble();

        return new Spectator(name, age, budget);
    }

    public void showSpectator(Spectator ss) {
        System.out.println("---------------------------------");
        System.out.println("Spectator's info: ");
        System.out.println("Name: " + ss.getName());
        System.out.println("Age: " + ss.getAge());
        System.out.println("Budget: " + ss.getBudget());
    }


}