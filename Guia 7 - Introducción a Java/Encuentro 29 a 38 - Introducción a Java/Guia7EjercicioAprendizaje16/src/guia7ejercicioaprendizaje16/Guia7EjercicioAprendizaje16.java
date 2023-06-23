/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
@author JimeM
*/
package guia7ejercicioaprendizaje16;

import java.util.Random;
import java.util.Scanner;

public class Guia7EjercicioAprendizaje16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
        
        for (int i = 0; i < N; i++) {
            vector[i] = random.nextInt(10);
        }
        
        System.out.print("Ingrese el numero a buscar: ");
        int S = leer.nextInt(); 
        int counter = 0;
        
        for (int i = 0; i < N; i++) {
            if (vector[i] == S){
                counter++;
                System.out.println("El número " + S + " se encontró en la posición " + i);
            }
        }
        
        System.out.println("El número " + S + " se encontró " + counter + " veces.");
        System.out.println("");
        System.out.println("Vector: ");
        System.out.print("[ ");
        
        for (int i = 0; i < N; i++) {
            if (i == N - 1){
                System.out.print(vector[i]);
            } else {
                System.out.print(vector[i] + ", ");
            }
        }
        
        System.out.println(" ]");
    }
    
}
