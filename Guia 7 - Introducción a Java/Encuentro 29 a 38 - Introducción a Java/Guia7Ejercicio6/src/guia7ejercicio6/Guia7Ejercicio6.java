/*
Implementar un programa que le pida dos números enteros a usuario y determine
si ambos o alguno de ellos es mayor a 25.
@author JimeM
*/
package guia7ejercicio6;

import java.util.Scanner;

public class Guia7Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos numeros enteros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos números son mayores a 25");
        } else if (num1 > 25){
            System.out.println("El número " + num1 + " es mayor a 25");
        } else if (num2 > 25){
            System.out.println("El número " + num2 + " es mayor a 25");
        } else {
            System.out.println("Ningún número es mayor a 25");
        }
    }
    
}
