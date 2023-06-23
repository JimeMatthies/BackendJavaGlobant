/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
@author JimeM
*/
package guia7ejercicioaprendizajeextra22;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz:");
        System.out.print("M: ");
        int M = leer.nextInt();
        System.out.print("N: ");
        int N = leer.nextInt();
        int[][] matriz = new int[M][N];
        RellenarMatriz(matriz, M, N);
        System.out.println("Matriz: ");
        ImprimirMatriz(matriz, M, N);   
    }

    public static void RellenarMatriz(int[][] matriz, int M, int N) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void ImprimirMatriz(int[][] matriz, int M, int N) {
        for (int i = 0; i < M; i++) {
            System.out.print("{ ");
            for (int j = 0; j < N; j++) {
                if (j == N - 1) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + ", ");
                }
            }
            System.out.println(" }");
        }
        System.out.println("");
    }
    
}