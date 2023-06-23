/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
"MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:"
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
@author JimeM
*/
package guia7ejercicioaprendizaje11;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        String exit = "N";
        
        do {
            System.out.println("Ingrese un número entero positivo:");
            num1 = leer.nextInt();
        } while (num1 <= 0);
        
        do {
            System.out.println("Ingrese otro número entero positivo:");
            num2 = leer.nextInt();
        } while (num2 <= 0);
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");

            int option = leer.nextInt();
            
            if (option >= 1 && option <= 5) {
                switch (option) {
                    case 1:
                        System.out.println("Sumar");
                        System.out.println("La suma de " + num1 + " y " + num2 + " es de " + (num1 + num2));
                        continue;
                    case 2:
                        System.out.println("Restar");
                        System.out.println("La resta de " + num1 + " y " + num2 + " es de " + (num1 - num2));
                        continue;
                    case 3:
                        System.out.println("Multiplicar");
                        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es de " + (num1 * num2));
                        continue;
                    case 4:
                        System.out.println("Dividir");
                        System.out.println("La divición de " + num1 + " y " + num2 + " es de " + (num1 / num2));
                        System.out.println("EL resto es de " + (num1 % num2));
                        continue;
                    case 5:
                        System.out.println("Estas seguro que deseas salir? (S/N)");
                        exit = leer.next();
                        if (exit.toUpperCase().equals("S")){
                            System.out.println("Hasta la proxima!");
                            break;
                        } else {
                            exit = "N";
                        }
                }
            } else {
                System.out.println(option + " no es una opción válida. Por favor eliga una opción del menu.");
            }     
        } while (exit.equals("N") );
    }
    
}
