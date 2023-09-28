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
import java.util.Scanner;

public class AppService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    FamousSingerService fss;

    public AppService() {
        this.fss = new FamousSingerService();
    }
    
    public void FamousSingersApp() {
        //createFamousSingers();
        fss.addFamousSinger(new FamousSinger("Michael Jackson", "Thriller"));
        fss.addFamousSinger(new FamousSinger("Britney Spears", "Baby One More Time"));
        fss.addFamousSinger(new FamousSinger("Backstreet Boys", "Millenium"));
        fss.addFamousSinger(new FamousSinger("Eminem", "The Marshall Mathers LP"));
        fss.addFamousSinger(new FamousSinger("Usher", "Confessions"));
        fss.showFamousSingers();
        menu();
        int op = 0;
        do {
            op = SC.nextInt();
            switch (op) {
                case 1:
                    fss.addFamousSinger(fss.createFamousSinger());
                    menu();
                    break;
                case 2:
                    fss.searchRemoveFamousSinger();
                    menu();
                    break;
                case 3:
                    fss.showFamousSingers();
                    menu();
                    break;
                default:
                    System.out.println("THANKS, GOODBYE!");
            }
        } while (op != 4);
    }

    public void menu() {
        System.out.println("---------------------------------");
        System.out.println("MENU: ");
        System.out.println("1.- CREATE FAMOUS SINGER");
        System.out.println("2.- REMOVE FAMOUS SINGER");
        System.out.println("3.- SHOW ALL FAMOUS SINGERS");
        System.out.println("4.- QUIT");
    }

}
