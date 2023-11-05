/*
Guia 12 = Aplicacion Mascotas (Video 3)
@author JimeM
 */
package services;

import entities.User;
import java.util.Scanner;

public class UserService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public User createUser() {
        System.out.println("---------------------------------");
        System.out.println("Name:");
        String name = SC.next();
        name = name.toUpperCase();
        System.out.println("LastName:");
        String lastname = SC.next();
        lastname = lastname.toUpperCase();
        System.out.println("SSN:");
        int snn = SC.nextInt();

        return new User(name, lastname, snn);
    }

}