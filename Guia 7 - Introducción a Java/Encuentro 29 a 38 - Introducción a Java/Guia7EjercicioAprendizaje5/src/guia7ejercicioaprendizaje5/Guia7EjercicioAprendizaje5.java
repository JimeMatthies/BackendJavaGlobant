/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
@author JimeM
*/
package guia7ejercicioaprendizaje5;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num = leer.nextInt();
        int numdouble = num * 2;
        int numtriple = num * 3;
        double numsqrt = Math.sqrt(num);
        System.out.println("El doble de " + num + " es " + numdouble);
        System.out.println("El triple de " + num + " es " + numtriple);
        System.out.println("La raíz cuadrada de " + num + " es " + numsqrt);
    }
    
}
