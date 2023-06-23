/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
@author JimeM
*/
package guia7ejercicioaprendizaje13;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        int side = leer.nextInt();
        
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i > 0 && i < side - 1 && j > 0 && j < side - 1){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
