/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
@author JimeM
*/
package guia7ejercicioaprendizajeextra16;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = leer.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el nombre de la " + i + "° persona: ");
            String nombre = leer.next();
            System.out.print("Ingrese la edad de la " + i + "° persona: ");
            int edad = leer.nextInt();
            System.out.println("");
            System.out.println(i + "° persona: ");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            if (edad >= 18) {
                System.out.println("Mayor de edad");
            } else {
                System.out.println("Menor de edad");
            }

            if (i == n) {
                break;
            } else {
                boolean eleccion = VerificarSeguir();
                if (!eleccion) {
                    break;
                }
            }

        }
        System.out.println("Has salido con éxito.");
    }

    public static boolean VerificarSeguir() {
        Scanner leer = new Scanner(System.in);
        boolean opcion = false;
        boolean invalida = false;

        do {
            System.out.println("¿Desea continuar ingresando datos? (Si/No)");
            String respuesta = leer.next();
            switch (respuesta.toLowerCase()) {
                case "si":
                    opcion = true;
                    break;
                case "no":
                    opcion = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente");
                    invalida = true;
                    break;
            }
        } while (invalida == true);
        return opcion;
    }
    
}
