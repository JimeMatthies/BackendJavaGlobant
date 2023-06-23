/*
Ejemplo Video 4 = Arreglos.
Realizar la multiplicación de un vector por una matriz.
Dado un vector 1xN y una matriz NxM el resultado del producto es 1xM.
Ej: El vector 1x2 * matriz 2x3 = producto 1x3
v = |3, 5| * m = |4, 8, 6| = |3x4+5x2, 3x8+5x1, 3x6+5x7| = |22, 29, 53|
                 |2, 1, 7|
@author JimeM
*/
package guia7ejerciciovideo4;

import java.util.Scanner;

public class Guia7EjercicioVideo4 {

    public static void main(String[] args) {
        int[] vector;
        vector = new int[2];
        int[] producto = new int[3];
        int[][] matriz = {{4,8,6}, {2,1,7}};
        System.out.println("ingrese los valores del vector tamaño "+ vector.length + ":");
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("v[" + i + "]=");
            vector[i] = leer.nextInt();
        }
        
        int sum;
        
        for (int j = 0; j < matriz[0].length; j++) {
            sum = 0;
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i] * matriz[i][j];
            }
            producto[j] = sum;
        }
        
        String aux = "";
        System.out.println("* Vector:");
        for (int elemento: vector) {
            aux = aux + " " + elemento;
        }
        System.out.println(aux);
        
        System.out.println("\n* Matriz:");
        for (int[] fila: matriz) {
            aux = "";
            for (int elemento: fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        
        aux = "";
        System.out.println("\n* Vector x Matriz:");
        for (int elemento: producto) {
            aux += " " + elemento;
        }
        System.out.println(aux);
    }
    
}
