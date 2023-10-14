/*
Guia 15 = Aplicación Mascotas JDBC (Videos 1-7)
@author JimeM
 */
package main;

import com.petsocial.domain.pet.PetService;
import com.petsocial.domain.user.User;
import com.petsocial.domain.user.UserService;

public class Guia15EjercicioVideos {

    public static void main(String[] args) {

        UserService us = new UserService();
        PetService ps = new PetService();

        //Create users
        try {
            us.createUser("jimematthies@gmail.com", "nalacocaymilky");
            us.createUser("jeangreenstar@gmail.com", "nalacocaymilky2");
            us.printUsers();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por " + e.getMessage());
        }

        //Update user
        try {
            us.changeUserPassword("jeangreenstar@gmail.com", "nalacocaymilky2", "nalacocaymilky25");
            us.printUsers();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por " + e.getMessage());
        }

        //Delete user
        try {
            us.deleteUser("jeangreenstar@gmail.com");
            us.printUsers();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por " + e.getMessage());
        }

        //Search user by email and add a pet
        try {
            User uu = us.searchUserByEmail("jimematthies@gmail.com");
            ps.createPet("Coca", "Labrador", uu);
            ps.printPets();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por " + e.getMessage());
        }

    }

}
