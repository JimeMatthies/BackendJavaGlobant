/*
Guia 13 = Apuntes y Aplicación Mascotas Exceptions (Videos 1 y 2)
@author JimeM
 */
package guia13ejerciciovideos;

import exceptions.ExcepcionPropia;
import exceptions.PetException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import services.PetService;

public class Guia13EjercicioVideos {

    public static void main(String[] args) throws FileNotFoundException, IOException, ExcepcionPropia {

        apuntesExcepciones();

        PetService ps = new PetService();
        try {
            ps.createPet("Coca-Cola", "Coca", "Dog", "Labrador", "Black", 13, "Female", true);
//            ps.createPet("Milky", "", "Dog", "Labrador", "Black", 1, "Female", true);
//            ps.searchPet("Nala");
//            ps.emptyPetsList();
            ps.showPetsList();
        } catch (PetException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void apuntesExcepciones() throws FileNotFoundException, IOException, ExcepcionPropia {
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

        //Division por cero
//        int numero1 = 10, numero2 = 0;
//        try {
//            int resultado = numero1 / numero2;
//            System.out.println("La division es: " + resultado);
//        } catch (ArithmeticException e) {
//            System.out.println("No se peude dividir por cero");
//            System.out.println(e.getMessage());
//        } catch (Exception e) { 
//            System.out.println("Error de sistema");           
//        } finally {            
//            System.out.println("fin del Programa");
//        }

        //Error input       
//        Scanner SC = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingrese un numero entero");     
//        try {
//            int numero3 = SC.nextInt();
//            System.out.println("El numero ingresado es " + numero3);
//        } catch (InputMismatchException e) {
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
//            System.out.println("Error al ingresar el numero");
//        } finally {
//            System.out.println("Fin del programa");
//        }
//    }

        //Error leer Archivo.  
//        File archivo = new File("C:\\Users\\archivo.txt");
//        Scanner SC = new Scanner(archivo);
//        SC.useDelimiter("\\Z"); // Z Lee todo el archivo , z lee hasta 1021 caracteres
//        System.out.println(leer.next());
//        System.out.println("Fin del Programa");

        //Error leer Archivo 2
//        Scanner SC = new Scanner(archivo);
//        SC.useDelimiter("\\Z"); // Z Lee todo el archivo , z lee hasta 1021 caracteres
//        System.out.println(leer.next());
//        while (leer.hasNextLine()) { // Uso un ciclo, mientras exista algo para leer en la siguiente linea......
//            String line = leer.nextLine();
//        }

        //Manejar el error al leer el archivo
//        try {
//            File archivo = new File("C:\\Users\\archivo.txt");
//            Scanner SC = new Scanner(archivo);
//            SC.useDelimiter("\\Z");
//            System.out.println(leer.next());
//        } catch (FileNotFoundException y) {
//            System.out.println("No se encontro el archivo");
//        } catch (IOException x) {
//            System.out.println("Excepcion que no trabaja IO");
//        } finally {
//            System.out.println("Fin del Programa");
//        }
        
        //crearPersona();
    }
    
    public static void crearPersona() {
        try {
            ingresarDatos();
        } catch (ExcepcionPropia | InputMismatchException ex) { // Recordar que en el mismo bloque puedo concatenar cosas...
            System.out.println(ex.getMessage());
            crearPersona();
        }
    }
    
    public static void ingresarDatos() throws ExcepcionPropia, InputMismatchException {
        Scanner SC = new Scanner(System.in).useDelimiter("\n");      
        System.out.println("Ingrese su nombre");
        String nombre1 = SC.next();
        if (nombre1.length() < 2) {//Inventando que si ingresa menos 2 es un 
            throw new ExcepcionPropia("No ingreso un nombre valido - Vas a tener q reingresar el dato");
        }
        
        System.out.println("Ingrese su edad");
        byte edad1 = SC.nextByte();
        if (edad1 < 0) {
            throw new ExcepcionPropia("No se puede tener menos que 0 años.....");
        }
        System.out.println("---------------------------------");
        System.out.println("Los datos ingresados son: "
                + "\n Nombre: " + nombre1.toUpperCase()
                + "\n Edad: " + edad1);
    }

}
