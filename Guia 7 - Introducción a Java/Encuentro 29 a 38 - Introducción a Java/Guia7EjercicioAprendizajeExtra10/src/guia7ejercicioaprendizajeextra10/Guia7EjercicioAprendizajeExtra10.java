/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente.
@author JimeM
*/
package guia7ejercicioaprendizajeextra10;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int)Math.floor(Math.random() * (10 - 0 + 1) + 0);
        int num2 = (int)Math.floor(Math.random() * (10 - 0 + 1) + 0);
        System.out.println(num1);
        System.out.println(num2);
        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();

        while (num != num1 * num2){
            System.out.println("Incorrecto");
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();
        }
        System.out.println("Correcto");
    }
    
}