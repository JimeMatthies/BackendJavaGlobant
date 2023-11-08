/*
Guia 13 = Apuntes y Aplicación Mascotas Exceptions (Videos 1 y 2)
@author JimeM
 */
package guia13ejerciciovideos;

import exceptions.PetException;
import services.PetService;

public class Guia13EjercicioVideos {

    public static void main(String[] args) {
        
        apuntesExcepciones();
        
        PetService ps = new PetService();
        
        try {  
            ps.createPet("Coca-Cola", "Coca", "Dog", "Labrador", "Black", 13, "Female", true);
//            ps.createPet("Milky", "", "Dog", "Labrador", "Black", 1, "Female", true);
//            ps.searchPet("Nala");
//            ps.emptyPetsList();
            ps.showPetsList();   
        } catch (PetException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void apuntesExcepciones() {
        
        //Excepciones
//        int valor1 = Integer.valueOf("a");
        
        //Capturar Excepciones Individualmente
//        int valor2 = 5;
//        System.out.println("El valor se inicializo en " + valor2);
//        try {
//            valor2 = Integer.valueOf("a");
//            System.out.println("El valor indicado es " + valor2);
//        } catch (NumberFormatException e) {
//            System.out.println("El valor indicado no es un numero.");
//        }
        
        //Capturar todas las Excepciones
//        try {
//            int valor3 = Integer.valueOf("a");
//            System.out.println("El valor indicado es " + valor3);
//        } catch (Exception e) {
//            System.out.println("El valor indicado no es un numero.");
//        }
        
        //Bolque Finally
//        try {
//            int valor4 = Integer.valueOf("a");
//            System.out.println("El valor indicado es " + valor4);
//        } catch (NumberFormatException e) {
//            System.out.println("El valor indicado no es un numero.");
//        } catch (Exception e) {
//            System.out.println("El valor indicado no es un numero.");
//        } finally {
//            int valor5 = 7;
//            System.out.println("El valor indicado es " + valor5);
//        } 
    }
    
}
