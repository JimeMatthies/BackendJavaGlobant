/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
@author JimeM
*/
package guia7ejercicio8;

import java.util.Scanner;

public class Guia7Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota = -1;
        
        while (nota < 0 || nota > 10){
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
        }
    }
    
}
