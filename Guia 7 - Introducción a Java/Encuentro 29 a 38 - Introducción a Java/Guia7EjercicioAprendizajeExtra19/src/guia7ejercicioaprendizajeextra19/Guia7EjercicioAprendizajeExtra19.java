/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
@author JimeM
*/
package guia7ejercicioaprendizajeextra19;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la longitud del vector: ");
        int N = leer.nextInt();
        int vectorA[] = new int[N];
        int vectorB[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            vectorA[i] = (int) (Math.random() * 10);
            vectorB[i] = (int) (Math.random() * 10); //comentar para testear
            //vectorB [i] = vectorA[i]; //descomentar para testear
        }
        
        System.out.println("Vector A:");
        System.out.print("[ ");
        
        for (int i = 0; i < N; i++) {
            if (i == N-1){
                System.out.print(vectorA[i] + " ");
            } else {
                System.out.print(vectorA[i] + ", ");
            }
        }
        
        System.out.println("]");
        System.out.println("");
        System.out.println("Vector B:");
        System.out.print("[ ");
        
        for (int i = 0; i < N; i++) {
            if (i == N-1){
                System.out.print(vectorB[i] + " ");
            } else {
                System.out.print(vectorB[i] + ", ");                
            }
        }
        
        System.out.println("]");
        System.out.println("");
        VerificarIgualdad(vectorA, vectorB, N);
    }

    public static void VerificarIgualdad(int[] vectorA, int[] vectorB, int N) {
        boolean iguales = true;
        for (int i = 0; i < N; i++) {
            if (vectorA[i] != vectorB[i]){
                iguales = false;
                break;
            }
        }
        
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }
    
}
