/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma.
@author JimeM
*/
package guia7ejercicioaprendizaje1;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero para sumar:");
        int num1 = leer.nextInt();
        System.out.print("Ingrese un número entero para sumar:");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los dos números enteros es " + suma);
    }
    
}
