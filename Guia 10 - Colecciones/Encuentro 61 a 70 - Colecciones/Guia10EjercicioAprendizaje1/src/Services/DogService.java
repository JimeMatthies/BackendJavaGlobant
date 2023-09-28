/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
@author JimeM
 */
package Services;

import Entity.Dog;
import java.util.ArrayList;
import java.util.Scanner;

public class DogService {
    
    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Dog> dogs;

    public DogService() {
        this.dogs = new ArrayList();
    }
    
    public Dog createDog() {
        System.out.println("---------------------------------");
        System.out.println("Dog's Breed:");
        String breed = SC.next();
        breed = breed.toUpperCase();

        return new Dog(breed);
    }

    public void addDog(Dog dd) {
        dogs.add(dd);
    }

    public void showDog(Dog dd) {
        System.out.println("---------------------------------");
        System.out.println("Dog's information: ");
        System.out.println("Breed: " + dd.getBreed());
    }

    public void showDogs() {
        System.out.println("---------------------------------");
        System.out.println("Dogs from List:");
        for (Dog dd : dogs) {
            System.out.println(dd.toString());
        }
        System.out.println("Number of dogs = " + dogs.size());
    }
    
}