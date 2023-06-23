/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse.
@author JimeM
*/
package guia7ejercicioaprendizajeextra8;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int par, impar, total, num;
        par = 0;
        impar = 0;
        total = 0;
        
        do {
            do {
                System.out.print("Ingrese un número entero positivo: ");
                num = leer.nextInt();
            } while (num < 0);
            if (num%2 == 0){
                par++;
            }else{
                impar++;
            }
            total++;
        }while (num%5 != 0);

        System.out.println("Números leidos: " + total);
        System.out.println("Números pares: " + par);
        System.out.println("Números impares: " + impar);
    }
    
}