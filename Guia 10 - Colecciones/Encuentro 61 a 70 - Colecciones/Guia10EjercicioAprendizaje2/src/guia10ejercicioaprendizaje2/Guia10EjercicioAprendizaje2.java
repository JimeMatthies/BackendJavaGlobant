/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
@author JimeM
 */
package guia10ejercicioaprendizaje2;

import Services.DogService;
import java.util.Scanner;

public class Guia10EjercicioAprendizaje2 {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        DogService ds = new DogService();
        String answer = "";
        do {
            ds.addDog(ds.createDog());
            System.out.println("Do you want to add another dog? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
        ds.showDogs();
        System.out.println("Wich dog do you want to remove from the list?");
        String dogBreed = SC.next();
        ds.searchRemoveDog(dogBreed.toUpperCase());
        ds.orderByBreedAsc();
        ds.showDogs();
    }

}
