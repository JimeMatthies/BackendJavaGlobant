/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer numero es múltiplo del segundo y e imprima si 
el primer numero es múltiplo del segundo, sino informe que no lo son.
@author JimeM
*/
package guia7ejercicio12;

import java.util.Scanner;

public class Guia7Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese primer número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese segundo número: ");
        int num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo (int num1, int num2) {
        if (num2 % num1 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de " + num2);
        } else{
            System.out.println("El numero " + num1 + " no es multiplo de " + num2);
        }
    }
    
}
