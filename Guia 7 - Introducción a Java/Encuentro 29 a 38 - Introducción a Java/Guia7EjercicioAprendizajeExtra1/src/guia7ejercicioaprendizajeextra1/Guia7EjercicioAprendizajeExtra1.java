/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
@author JimeM
*/
package guia7ejercicioaprendizajeextra1;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min, days, hours;
        System.out.print("Minutos:");
        min = leer.nextInt();
        days = Math.round((min/60)/24);
        hours = ((min/60)-(24*days));
        System.out.println(min + " Minutos equivalen a:");
        System.out.println(Math.round(days) + " dias, " + Math.round(Math.floor(hours)) + " horas");
    }
    
}
