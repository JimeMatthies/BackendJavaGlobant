/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
@author JimeM
*/
package guia7ejercicioaprendizaje19;

import java.util.Random;

public class Guia7EjercicioAprendizaje19 {

    public static void main(String[] args) {    
        //int[][] matriz = new int[3][3]; //descomentar para llenar con números random
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] transpuesta = new int[3][3];
        
        //LlenarMatriz(matriz, 3, 3); //descomentar para llenar con números random
        System.out.println("Matriz: ");
        ImprimirMatriz(matriz, 3, 3);
        TransponerMatriz(matriz, 3, 3, transpuesta);
        System.out.println("Transpuesta: ");
        ImprimirMatriz(transpuesta, 3, 3);
        
        if (MatrizAntisimetrica(matriz, transpuesta, 3, 3)){
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        } 
    }
    
    public static void LlenarMatriz(int [][] matriz, int M, int N){
        Random random = new Random();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = random.nextInt(99+99+1)-99;
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
        System.out.println("");
    }
    
    public static void TransponerMatriz(int [][] matriz, int M, int N, int[][] transpuesta){
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }
    
    public static boolean MatrizAntisimetrica(int [][] matriz, int [][] transpuesta, int M, int N){
        boolean flag = true;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] == (transpuesta[i][j]*-1)){
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
  
}
