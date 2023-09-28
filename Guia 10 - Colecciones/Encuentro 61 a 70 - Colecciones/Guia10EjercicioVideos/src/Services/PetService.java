/*
Guia 10 = Aplicación Mascotas Conjuntos (Videos 1 - 8)
@author JimeM
 */
package Services;

import Entity.Pet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PetService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private List<Pet> pets;

    public PetService() {
        this.pets = new ArrayList();
    }

    public Pet createPet() {
        System.out.println("---------------------------------");
        System.out.println("Pet's name:");
        String name = SC.next();
        System.out.println("Pet's nickname:");
        String nickname = SC.next();
        System.out.println("Type of pet:");
        String type = SC.next();
        System.out.println("Pet's breed:");
        String breed = SC.next();
        System.out.println("Pet's color:");
        String color = SC.next();
        System.out.println("Pet's age:");
        int age = SC.nextInt();
        System.out.println("Does the pet have a tail? true/false");
        boolean tail = SC.nextBoolean();

        return new Pet(name, nickname, type, breed, color, age, tail);
    }

    public void addPet(Pet pp) {
        pets.add(pp);
    }

    public void showPet(Pet pp) {
        System.out.println("---------------------------------");
        System.out.println("Pet's info: ");
        System.out.println("Name: " + pp.getName());
        System.out.println("Nickname: " + pp.getNickname());
        System.out.println("Type: " + pp.getType());
        System.out.println("Breed: " + pp.getBreed());
        System.out.println("Color: " + pp.getColor());
        System.out.println("Age: " + pp.getAge());
        System.out.println("Tail?: " + pp.isTail());
        System.out.println("Energy: " + pp.getEnergy());
    }

    public void showPets() {
        System.out.println("---------------------------------");
        System.out.println("Pets from List:");
        for (Pet pp : pets) {
            System.out.println(pp.toString());
        }
        System.out.println("Number of pets = " + pets.size());
    }

    /**
     * Create Pets, all puppies.
     *
     * @param amount = number of puppies to create and add to the list.
     */
    public void puppyFactory(int amount) {
        for (int i = 0; i < amount; i++) {
            addPet(new Pet("Puppy " + (i + 1), "Chiquito", "Dog", "Labrador", "Black", 0, true));
        }
    }

    /**
     * Create Pets, info by keyboard.
     *
     * @param amount = number of puppies to create and add to the list.
     */
    public void petsFactory(int amount) {
        for (int i = 0; i < amount; i++) {
            Pet pp = createPet();
            addPet(pp);
            System.out.println(pp.toString());
        }
    }

    /**
     * Update Pet's name (Pick any setter that you want yo update).
     *
     * @param index
     */
    public void updatePetNameByIndex(int index) {
        System.out.println("---------------------------------");
        Pet pp = pets.get(index);
        if (index <= pets.size() - 1 && index >= 0) {
            System.out.println("(UPDATE PET) Enter new pet's name:");
            String name = SC.next();
            pp.setName(name);
            System.out.println("(UPDATE PET) Name: " + name);
            System.out.println("(UPDATE PET) Pet's name updated");
        } else {
            System.out.println("(UPDATE PET) Wrong index");
        }
    }

    /**
     * Update Pet's name (Pick any setter that you want yo update).
     * 
     * @param oldname
     * @param newname 
     */
    public void updatePetByName(String oldname, String newname) {
        for (int i = 0; i < pets.size(); i++) {
            Pet pp = pets.get(i);
            if (pp.getName().equals(oldname)) {
                pp.setName(newname);
            }
        }
    }

    public void updatePet(int index) {
        System.out.println("---------------------------------");
        if (index <= pets.size() - 1 && index >= 0) {
            System.out.println("(UPDATE PET) Enter new pet's info:");
            Pet pp = createPet();
            pets.set(index, pp);
            System.out.println("(UPDATE PET) Pet updated");
        } else {
            System.out.println("(UPDATE PET) Wrong index");
        }
    }

    public void removePet(int index) {
        System.out.println("---------------------------------");
        if (index <= pets.size() - 1 && index >= 0) {
            System.out.println("(REMOVE PET) Pet will be remove from index " + index);
            pets.remove(index);
            System.out.println("(REMOVE PET) Pet removed");
        } else {
            System.out.println("(REMOVE PET) Wrong index");
        }
    }

    public void removePetByName(String name) {
        for (int i = 0; i < pets.size(); i++) {
            Pet pp = pets.get(i);
            if (pp.getName().equals(name)) {
                pets.remove(i);
            }
        }
    }
}
