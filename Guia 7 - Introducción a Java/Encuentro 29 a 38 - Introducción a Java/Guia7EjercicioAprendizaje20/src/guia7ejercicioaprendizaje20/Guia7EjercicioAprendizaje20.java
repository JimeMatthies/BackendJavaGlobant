/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
@author JimeM
*/
package guia7ejercicioaprendizaje20;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje20 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        RellenarMatriz(matriz);
        System.out.println("Matriz: ");
        ImprimirMatriz(matriz, 3, 3); 
        ComprobarMatrizMagica(matriz);  
    }

    public static void RellenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un valor del 1 al 9");
                    System.out.print("Matriz [" + i + ", " + j +"]: ");
                    num = leer.nextInt();
                    if ((num <= 9)&&( num >= 1)){
                        matriz[i][j] = num;
                    }
                }while (num > 9 || num <= 0);
            }
        }
        System.out.println("");
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

    public static void ComprobarMatrizMagica(int[][] matriz) {
        boolean magic = true;
        int [] check = new int[8];
        int i, j, k = 0;
       	
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                check[k] += matriz[i][j];
                check[k+3] += matriz[j][i];
            }
            check[6] += matriz[i][i];
            check[7] += matriz[i][(2-i)];
            k += 1;
        }
        
        for (i = 0; i < 7; i++) {
            if (check[i] != check[i+1]){
                magic = false;
            }
        }
        
        if (magic == true) {
            System.out.println("La matriz es mágica");
            System.out.println("La suma de sus filas es:");
            System.out.println("[" + check[0] + ", " + check[1] + ", " + check[2] + "]");
            System.out.println("La suma de sus columnas es:");
            System.out.println("[" + check[3] + ", " + check[4] + ", " + check[5] + "]");
            System.out.println("La suma de sus diagonales es:");
            System.out.println("[" + check[6] + ", " + check[7] + "]");
        } else {
            System.out.println("La matriz no es mágica");
            System.out.println("La suma de sus filas es:");
            System.out.println("[" + check[0] + ", " + check[1] + ", " + check[2] + "]");
            System.out.println("La suma de sus columnas es:");
            System.out.println("[" + check[3] + ", " + check[4] + ", " + check[5] + "]");
            System.out.println("La suma de sus diagonales es:");
            System.out.println("[" + check[6] + ", " + check[7] + "]");
        } 
    }
    
}
