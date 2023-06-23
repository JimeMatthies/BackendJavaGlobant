/*
Ejemplo Video 3 = Numeros Naturales.
Muestre N sumatorias de los primeros números enteros partiendo desde 1, siendo N par.
De un aviso si el usuario identifica un valor N superior a 1000 por ejecución lenta.
@author JimeM
*/
package guia7ejerciciovideo3;

import java.util.Scanner;

public class Guia7EjercicioVideo3 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un número entero positivo");
            num = leer.nextInt();
            if (num > 1000){
                System.out.println("Este programa puede trabajar mucho en ejecutarse, ¿Desea continuar? (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")){
                    break;
                }
            }
        } while (num <= 0 || num > 1000);
        
        int j, suma;
        
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0){
                continue;
            }
            suma = 0;
            j = 1;
            while (j <= i){
                suma += j;
                j++;
            }
            System.out.println("La suma de los " + i + " números naturales es: " + suma);
        }
    }
    
}
