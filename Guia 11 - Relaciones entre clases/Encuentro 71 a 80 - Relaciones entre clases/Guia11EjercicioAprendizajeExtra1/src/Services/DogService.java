/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a tener que contar con 
muchas personas y muchos perros. El programa deberá preguntarle a cada persona, que perro según su nombre, quiere 
adoptar. Dos personas no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado, se 
le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las personas con sus 
respectivos perros.
@author JimeM
 */
package Services;

import Entity.Dog;
import Entity.Person;
import java.util.ArrayList;
import java.util.Scanner;

public class DogService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Dog> dogs;

    public DogService() {
        this.dogs = new ArrayList();
        loadDogs();
    }

    public Dog createDog() {
        System.out.println("---------------------------------");
        System.out.println("Dog's name:");
        String name = SC.next();
        name = name.toUpperCase();
        System.out.println("Dog's breed:");
        String breed = SC.next();
        breed = breed.toUpperCase();
        System.out.println("Dog's age:");
        int age = SC.nextInt();
        System.out.println("Dog's size:");
        String size = SC.next();
        size = size.toUpperCase();

        return new Dog(name, breed, age, size);
    }

    public void addDog(Dog dd) {
        dogs.add(dd);
    }

    public void showDog(Dog dd) {
        System.out.println("---------------------------------");
        System.out.println("Dog's information: ");
        System.out.println("Name: " + dd.getName());
        System.out.println("Breed: " + dd.getBreed());
        System.out.println("Age: " + dd.getAge());
        System.out.println("Size: " + dd.getSize());
    }

    public void showDogs() {
        System.out.println("---------------------------------");
        System.out.println("Dogs from List:");
        dogs.forEach(dd -> System.out.println(dd.toString()));
        System.out.println("Number of dogs = " + dogs.size());
    }

    public boolean searchAdoptDog(String name, Person pp) {
        for (Dog dd : dogs) {
            if (dd.getName().equals(name)) {
                if (dd.isAdopted()) {
                    System.out.println("The dog named " + dd.getName() + " is already adopted.");
                    return false;
                } else {
                    pp.setDog(dd);
                    dd.setAdopted(true);
                    System.out.println("Congratulations, " + pp.getName() + " has adopted " + dd.getName());
                    return true;
                }
            }
        }
        System.out.println("The dog named " + name + " is not on the list. Try again.");
        return false;
    }

    public void loadDogs() {
        dogs.add(new Dog("Nala", "Cocker", 15, "Small"));
        dogs.add(new Dog("Coca", "Labrador", 13, "Medium"));
        dogs.add(new Dog("Milky", "Labrador", 1, "Big"));
    }

}
