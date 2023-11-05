/*
Guia 12 = Aplicacion Mascotas (Video 3)
@author JimeM
 */
package services;

import entities.Pet;
import java.util.Scanner;

public class PetService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Pet createPet() {
        System.out.println("---------------------------------");
        System.out.println("Pet's name:");
        String name = SC.next();
        name = name.toUpperCase();
        System.out.println("Pet's nickname:");
        String nickname = SC.next();
        nickname = nickname.toUpperCase();
        System.out.println("Pet's type:");
        String type = SC.next();
        type = type.toUpperCase();

        return new Pet(name, nickname, type);
    }

}