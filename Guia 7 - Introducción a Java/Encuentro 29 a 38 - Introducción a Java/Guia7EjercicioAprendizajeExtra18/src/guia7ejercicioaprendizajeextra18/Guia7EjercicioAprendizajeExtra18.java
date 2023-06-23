/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
@author JimeM
*/
package guia7ejercicioaprendizajeextra18;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
        int suma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el " + (i+1) + "° número: ");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los números iungresados es: " + suma);
    }
    
}
