/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
@author JimeM
*/
package guia7ejercicioaprendizaje4;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique la temperatura en grados Celcius:");
        float celcius = leer.nextFloat();
        float fahrenheit = 32 + ((9 * celcius)/5);
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
    }
    
}
