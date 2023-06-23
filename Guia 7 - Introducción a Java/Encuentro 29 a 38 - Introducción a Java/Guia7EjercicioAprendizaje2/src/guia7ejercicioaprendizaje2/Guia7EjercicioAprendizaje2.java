/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
@author JimeM
*/
package guia7ejercicioaprendizaje2;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String name = leer.nextLine();
        System.out.println("Hola " + name + ", Un gusto!");
    }
    
}
