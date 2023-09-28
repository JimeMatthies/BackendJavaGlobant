/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
@author JimeM
 */
package Services;

import Entity.FamousSinger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FamousSingerService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<FamousSinger> famousSingers;

    public FamousSingerService() {
        this.famousSingers = new ArrayList();
    }

    public FamousSinger createFamousSinger() {
        System.out.println("---------------------------------");
        System.out.println("Famous singer's name:");
        String name = SC.next();
        name = name.toUpperCase();
        System.out.println("Famous singer's best-selling album:");
        String bestSellingAlbum = SC.next();
        bestSellingAlbum = bestSellingAlbum.toUpperCase();

        return new FamousSinger(name, bestSellingAlbum);
    }

    public void createFamousSingers() {
        String answer = "";
        do {
            addFamousSinger(createFamousSinger());
            System.out.println("Do you want to add another famous singer? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
    }

    public void addFamousSinger(FamousSinger fs) {
        famousSingers.add(fs);
    }

    public void showFamousSinger(FamousSinger fs) {
        System.out.println("---------------------------------");
        System.out.println("Famous singer's information: ");
        System.out.println("Name: " + fs.getName());
        System.out.println("Best-Selling album: " + fs.getBestSellingAlbum());
    }

    public void showFamousSingers() {
        System.out.println("---------------------------------");
        System.out.println("Famous Singers from List:");
        for (FamousSinger fs : famousSingers) {
            System.out.println(fs.toString());
        }
        System.out.println("Number of famous singers = " + famousSingers.size());
    }

    public void searchRemoveFamousSinger() {
        Iterator<FamousSinger> it = famousSingers.iterator();
        boolean removed = false;
        System.out.println("Wich famous singer do you want to remove?");
        String famousSingersName = SC.next();
        while (it.hasNext()) {
            if (it.next().getName().equals(famousSingersName.toUpperCase())) {
                System.out.println("Are you sure you want to remove this famous singer? (Y/N)");
                if (SC.next().equalsIgnoreCase("y")) {
                    it.remove();
                    System.out.println(famousSingersName + " removed");
                    removed = true;
                }
            }
        }
        if (!removed) {
            System.out.println("The famous singer wasn't on the list");
        }
    }

}
