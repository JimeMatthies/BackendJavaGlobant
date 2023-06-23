/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus 
compañeros de equipo.
@author JimeM
*/
package guia7ejercicio14;

import java.util.Scanner;

public class Guia7Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[9];
        for (int i = 0; i < 9; i++) {
            Equipo[i] = leer.nextLine();
        }
        for (int i = 0; i < 9; i++) {
            System.out.println(Equipo[i]);
        }
    }
    
}
