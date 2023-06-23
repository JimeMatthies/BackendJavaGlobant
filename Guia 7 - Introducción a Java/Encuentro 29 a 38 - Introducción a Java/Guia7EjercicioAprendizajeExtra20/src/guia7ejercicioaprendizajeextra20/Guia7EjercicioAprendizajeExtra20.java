/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
@author JimeM
*/
package guia7ejercicioaprendizajeextra20;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int vector[] = new int[N];
        LlenarVector(vector, N);
        ImprimirVector(vector, N);
    }

    public static void LlenarVector(int[] vector, int N) {
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void ImprimirVector(int[] vector, int N) {
        System.out.println("Vector:");
        System.out.print("[ ");
        
        for (int i = 0; i < N; i++) {
            if (i == N-1){
                System.out.print(vector[i] + " ");
            } else {
                System.out.print(vector[i] + ", ");
            }
        }
        System.out.println("]");
    }
    
}