/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
@author JimeM
*/
package guia7ejercicioaprendizajeextra14;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias: ");
        int familias = leer.nextInt();
        
        for (int i = 0; i < familias; i++) {
            int Suma = 0;
            double promedio;
            System.out.println("Ingrese la cantidad de hijos de la " + (i + 1) + "° familia: ");
            int hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del " + (j + 1) + "° hijo de la " + (i + 1) + "° familia:");
                int edad = leer.nextInt();
                Suma += edad;
            }
            promedio = Suma / hijos;
            System.out.println("La media de edad de la " + (i + 1) + "° familia es de " + promedio);
        }
    }
    
}
