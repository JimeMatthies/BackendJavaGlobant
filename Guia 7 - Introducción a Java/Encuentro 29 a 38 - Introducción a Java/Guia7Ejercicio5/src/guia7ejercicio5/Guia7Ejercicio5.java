/*
Define una variable de tipo boolean, double y char. Guarda información en ellas
a través del Scanner.
@author JimeM
*/
package guia7ejercicio5;

import java.util.Scanner;

public class Guia7Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa las siguientes variables:");
        System.out.println("Eres mayor de edad? (true/false)");
        boolean r18 = leer.nextBoolean();
        System.out.println("Promedio Escolar? (1 a 7)");
        double promedio = leer.nextDouble();
        System.out.println("Letra de tu curso? (A, B, C o D)");
        char curso = leer.next().charAt(0);
        System.out.println("Mayor de edad: " + r18);
        System.out.println("Promeido escolar: " + promedio);
        System.out.println("Curso: " + curso);      
    }
    
}
