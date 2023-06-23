/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
@author JimeM
*/
package guia7ejercicioaprendizajeextra15;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        System.out.println("Ingrese la operacion deseada:");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacón");
        System.out.println("4.- División");
        int opcion = leer.nextInt();
        int respuesta;

        switch (opcion){
            case 1:
                respuesta = suma(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + respuesta);
                break;
            case 2:
                respuesta = resta(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + respuesta);
                break;
            case 3:
                respuesta = multiplicacion(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + respuesta);
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("No se puede dividir entre 0");
                } else {
                    double respuestaD = division(num1, num2);
                    System.out.println(num1 + " / " + num2 + " = " + respuestaD);
                    break;
                }
        }
    }

    public static int suma(int num1, int num2){
        return num1 + num2;
    }
    
    public static int resta(int num1, int num2){
        return num1 - num2;
    }
    
    public static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
    
    public static double division(int num1, int num2){
        return num1 / num2;
    }
    
}