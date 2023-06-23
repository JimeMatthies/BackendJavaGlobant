/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje.
@author JimeM
*/
package guia7ejercicioaprendizajeextra3;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Escriba una letra: ");
        String letra = leer.next();
        if (letra.toUpperCase().equals("A") || 
            letra.toUpperCase().equals("E") || 
            letra.toUpperCase().equals("I") || 
            letra.toUpperCase().equals("O") || 
            letra.toUpperCase().equals("U")){
            System.out.println("Es vocal");
        } else {
            System.out.println("No es vocal");
        }
    }
    
}