/*
Guia 11 = Aplicación Mascotas Relaciones (Videos 1, 6, 7, 8)
@author JimeM
 */
package guia11ejerciciovideos1;

import Entity.Pet;
import Entity.User;
import Enum.CatBreeds;
import Enum.DogBreeds;
import Enum.Gender;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Guia11EjercicioVideos1 {

    public static void main(String[] args) {
        
        int num1 = 6;
        int num2 = 8;
        System.out.println(num1==num2);

        //relationsNotes();

    }

    public static void relationsNotes() {

        //Enum DogBreed
        String BreedImput = "LABRADOR";
        for (DogBreeds bb : DogBreeds.values()) {
            if (bb.toString().equals(BreedImput)) {
                System.out.println("Breed imput is equal to " + bb + " in position N°" + bb.ordinal());
            }
        }

        //Enum Gender Examples
        User u1 = new User();
        u1.setGender(Gender.FEMALE);
        System.out.println(u1.getGender());

        //Enum Breeds Examples
        System.out.println(DogBreeds.COCKER_SPANIEL.toString());
        System.out.println(DogBreeds.COCKER_SPANIEL.getCode());
        System.out.println(DogBreeds.COCKER_SPANIEL.getValue());
        System.out.println(CatBreeds.BOMBAY.toString());
        System.out.println(CatBreeds.BOMBAY.getCode());
        System.out.println(CatBreeds.BOMBAY.getValue());

        //Generic
        Pet p1 = new Pet<DogBreeds>("Fer", "Chiquito", "Dog");
        Pet p2 = new Pet<CatBreeds>("Pepa", "Lola", "Cat");
        p1.setBreed(DogBreeds.CHIHUAHUA);
        p2.setBreed(CatBreeds.RAGDOLL);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        //Relation User Pets
        u1.setName("Fernando");
        u1.setLastname("Romero");
        u1.setCountry("Argentina");
        u1.setSsn(174859872);
        u1.setBirthdate(LocalDate.of(1991, Month.JULY, 25));
        u1.setGender(Gender.MALE);
        u1.setFavoritePet(p1);
        ArrayList<Pet> pets = new ArrayList();
        pets.add(p1);
        pets.add(p2);
        u1.setPets(pets);
        System.out.println(u1.toString());
    }

}
