/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
@author JimeM
 */
package Services;

import Entity.Dog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
    
    public void searchRemoveDog(String dogBreed) {
        Iterator<Dog> it = dogs.iterator();
        boolean removed = false;
        while (it.hasNext()) {
            if (it.next().getBreed().equals(dogBreed)) {
                it.remove();
                System.out.println(dogBreed + " removed");
                removed = true;
            }
        }
        if (!removed) {
            System.out.println("The dog wasn't on the list");
        }
    }

    public void orderByBreedAsc() {      
        Collections.sort(dogs,(Dog d1, Dog d2) -> d1.getBreed().compareTo(d2.getBreed()));
    }
    
}