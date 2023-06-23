/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
@author JimeM
*/
package guia7ejercicioaprendizajeextra6;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero de personas: ");
        int Total = leer.nextInt();     
        double PromedioBajo, PromedioTotal, TotalBajo, Estatura;      
        PromedioBajo = 0;
        PromedioTotal = 0;
        TotalBajo = 0;
        Estatura = 0;

        for (int i = 0; i < Total; i++) {
            System.out.print("Ingrese estatura de la " + (i+1) + "° persona: ");
            Estatura = leer.nextDouble();

            if (Estatura < 1.6) {
                PromedioBajo += Estatura;
                TotalBajo++;
            }
            PromedioTotal += Estatura;
        }
        
        PromedioBajo = PromedioBajo/TotalBajo;
        PromedioTotal = PromedioTotal/Total;
        System.out.println("El promedio de estaturas debajo de 1.60 es de " + PromedioBajo);
        System.out.println("El promedio de estaturas general es de " + PromedioTotal);
    }
    
}