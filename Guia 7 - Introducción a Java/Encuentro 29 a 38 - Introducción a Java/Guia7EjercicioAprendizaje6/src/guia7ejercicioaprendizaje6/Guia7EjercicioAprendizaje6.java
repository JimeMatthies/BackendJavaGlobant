/*
Crear un programa que dado un numero determine si es par o impar.
@author JimeM
*/
package guia7ejercicioaprendizaje6;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }
    }
    
}
