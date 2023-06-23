/*
Ejemplo Video 1 = Hola Mundo
@author JimeM
*/
package guia7ejerciciovideo1;

import java.util.Scanner;

public class Guia7EjercicioVideo1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = leer.nextLine();
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
    }
    
}
