/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    - Primer trabajo práctico evaluativo 10%
    - Segundo trabajo práctico evaluativo 15%
    - Primer Integrador 25%
    - Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
@author JimeM
*/
package guia7ejercicioaprendizajeextra21;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double vector[] = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + "° Alumno:");
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo:");
            double PrimerPractico = leer.nextDouble();
            System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo:");
            double SegundoPractico = leer.nextDouble();
            System.out.println("Ingrese la nota del primer Integrador:");
            double PrimerIntegrador = leer.nextDouble();
            System.out.println("Ingrese la nota del segundo Integrador:");
            double SegundoIntegrador = leer.nextDouble();
            double promedio = (PrimerPractico * 0.1) + (SegundoPractico * 0.15) + (PrimerIntegrador * 0.25) + (SegundoIntegrador * 0.5);
            vector[i] = promedio;
        }
        
        System.out.println("");
        System.out.println("Tabla de Promedios:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("El promedio del " + (i+1) + "° alumno es " + vector[i]);
        }
        
        int aprobados = 0;
        int reprobados = 0;
        
        for (int i = 0; i < 10; i++) {
            if (vector[i] < 7) {
                reprobados++;
            } else {
                aprobados++;
            }
        }
        
        System.out.println("La cantidad de aprobados es: " + aprobados);
        System.out.println("La cantidad de reprobados es: " + reprobados);
    }
    
}
