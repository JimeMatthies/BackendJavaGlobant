/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
El programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
@author JimeM
*/
package guia7ejercicio9;

import java.util.Scanner;

public class Guia7Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int counter = 0;
        int num;
        
        do {
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            if (num > 0){
                suma += num;
            }
            counter++;
            if (counter == 20){
                break;
            }
            if (num == 0){
                System.out.println("Se capturó el número cero");
            }
        } while (num != 0);

        System.out.println("La suma de los numeros positivos es " + suma);
    }
    
}