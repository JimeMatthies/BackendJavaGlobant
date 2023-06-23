/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
@author JimeM
*/
package guia7ejercicioaprendizaje3;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String phrase = leer.nextLine();
        System.out.println("Frase en mayusculas:");
        System.out.println(phrase.toUpperCase());
        System.out.println("Frase en minusculas:");
        System.out.println(phrase.toLowerCase());
    }
    
}
