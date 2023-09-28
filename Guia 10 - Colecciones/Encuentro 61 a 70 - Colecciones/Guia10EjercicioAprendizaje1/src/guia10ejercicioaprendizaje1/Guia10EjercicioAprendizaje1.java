/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
@author JimeM
 */
package guia10ejercicioaprendizaje1;

import Services.DogService;
import java.util.Scanner;

public class Guia10EjercicioAprendizaje1 {

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
    }

}
