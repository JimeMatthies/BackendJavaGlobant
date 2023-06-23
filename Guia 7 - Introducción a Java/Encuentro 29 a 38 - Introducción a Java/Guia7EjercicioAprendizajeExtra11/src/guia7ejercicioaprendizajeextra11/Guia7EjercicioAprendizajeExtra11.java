/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división.
@author JimeM
*/
package guia7ejercicioaprendizajeextra11;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int digitos = 1;
        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();
        int aux = num;
        
        while (aux > 9){
            aux = aux/10;
            digitos++;
        }
        System.out.println("El número " + num + " tiene " + digitos + " digitos.");
    }
    
}