/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
@author JimeM
*/
package guia7ejercicioaprendizaje10;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float limit;
        
        do {
            System.out.println("Ingrese un limite positivo:");
            limit = leer.nextFloat();
        } while (limit <= 0);
        
        float num;
        float sum = 0;
        
        do {
            System.out.println("Ingrese un número:");
            num = leer.nextFloat();
            sum += num;
        } while (sum < limit);
        
        System.out.println("Ha superado el límite. La suma de los números introducidos es " + sum);
    }
    
}
