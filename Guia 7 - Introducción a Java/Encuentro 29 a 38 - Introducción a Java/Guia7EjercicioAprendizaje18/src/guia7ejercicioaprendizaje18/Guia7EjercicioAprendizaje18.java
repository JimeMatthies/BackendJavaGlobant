/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
@author JimeM
*/
package guia7ejercicioaprendizaje18;

import java.util.Random;

public class Guia7EjercicioAprendizaje18 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] transpuesta = new int[4][4];
        
        LlenarMatriz(matriz, 4, 4);
        System.out.println("Matriz: ");
        ImprimirMatriz(matriz, 4, 4);
        System.out.println("");
        TransponerMatriz(matriz, 4, 4, transpuesta);
        System.out.println("Transpuesta: ");
        ImprimirMatriz(transpuesta, 4, 4);
    }
    
    public static void LlenarMatriz(int [][] matriz, int M, int N){
        Random random = new Random();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
    }
    
    public static void ImprimirMatriz(int[][] matriz, int M, int N){
        for (int i = 0; i < M; i++) {
            System.out.print("{ ");
            for (int j = 0; j < N; j++) {
                if (j == N - 1){
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + ", ");                    
                }
            }
            System.out.println(" }");
        }
    }
    
    public static void TransponerMatriz(int [][] matriz, int M, int N, int[][] transpuesta){
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }
    
}
