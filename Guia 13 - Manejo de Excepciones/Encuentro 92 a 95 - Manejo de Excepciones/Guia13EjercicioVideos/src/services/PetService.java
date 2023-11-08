/*
Guia 13 = Apuntes y Aplicación Mascotas Exceptions (Videos 1 y 2)
@author JimeM
 */
package services;

import entities.Pet;
import exceptions.PetException;
import java.util.ArrayList;
import java.util.Scanner;

public class PetService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pet> pets = new ArrayList();

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public Pet createPet(String name, String nickname, String type, String breed, String color, Integer age, String gender, boolean tail) throws PetException {
        try {
            if (name.isEmpty()) {
                throw new PetException("Must enter pet's name");
            }
            if (nickname.isEmpty()) {
                throw new PetException("Must enter pet's nickname");
            }
            if (type.isEmpty()) {
                throw new PetException("Must enter pet's type");
            }
            if (breed.isEmpty()) {
                throw new PetException("Must enter pet's breed");
            }
            if (color.isEmpty()) {
                throw new PetException("Must enter pet's color");
            }
            if (age <= 0) {
                throw new PetException("Pet's age cannot be zero or negative");
            }
            if (gender.isEmpty()) {
                throw new PetException("Must enter pet's gender");
            }

            Pet pp = new Pet();
            pp.setName(name);
            pp.setNickname(nickname);
            pp.setType(type);
            pp.setBreed(breed);
            pp.setColor(color);
            pp.setAge(age);
            pp.setGender(gender);
            pp.setTail(tail);

            savePet(pp);

        } catch (PetException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PetException("System Error");
        }
        return new Pet(name, nickname, type, breed, color, age, gender, tail);
    }

    public void savePet(Pet pp) {
        pets.add(pp);
    }

    public Pet searchPet(String name) throws PetException {
        try {
            if (name.isEmpty()) {
                throw new PetException("Must enter pet's name");
            }
            Pet petFound = null;
            for (Pet pp : pets) {
                if (pp.getName().equals(name)) {
                    petFound = pp;
                    break;
                }
            }
            if (petFound == null) {
                throw new PetException("Couldn't find '" + name + "' on the list.");
            }
            return petFound;
        } catch (PetException e) {
            throw e;
        } catch (Exception e) {
            e.getMessage();
            throw new PetException("System Error");
        }
    }

    public void removePet(String name) throws PetException {
        try {
            if (name.isEmpty()) {
                throw new PetException("Must enter pet's name");
            }
            Pet petFound = null;
            for (Pet pp : pets) {
                if (pp.getName().equals(name)) {
                    petFound = pp;
                    break;
                }
            }
            if (petFound == null) {
                throw new PetException("Couldn't find " + name + "on the list.");
            }
            pets.remove(petFound);
        } catch (PetException e) {
            throw e;
        } catch (Exception e) {
            e.getMessage();
            throw new PetException("System Error");
        }
    }

    public void emptyPetsList() {
        pets.clear();
    }

    public void showPetsList() throws PetException {
        try {
            if (pets.isEmpty()) {
                throw new PetException("Pet's list is empty");
            } else {
                for (Pet pp : pets) {
                    System.out.println("---------------------------------");
                    System.out.println(pp.getName());
                    System.out.println(pp.getNickname());
                    System.out.println(pp.getType());
                    System.out.println(pp.getBreed());
                    System.out.println(pp.getColor());
                    System.out.println(pp.getAge());
                    System.out.println(pp.getGender());
                    System.out.println(pp.isTail());
                }
            }
        } catch (PetException e) {
            throw e;
        } catch (Exception e) {
            e.getMessage();
            throw new PetException("System Error");
        }
    }
}
