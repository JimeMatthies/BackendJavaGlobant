/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
@author JimeM
 */
package guia8ejercicioaprendizaje11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Guia8EjercicioAprendizaje11 {

    public static void main(String[] args) {
      
        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresa el año: aaaa");
        //int anio = SC.nextInt();
        int anio = 1987;
        System.out.println("Ingresa el mes: mm");
        //int mes = SC.nextInt();
        int mes = 07;
        System.out.println("Ingresa el día: dd");
        //int dia = SC.nextInt();
        int dia = 29;
        
        System.out.println("---------------------------------");
        System.out.println("Date:");
        Date fechaIngresada = new Date(anio-1900, mes-1, dia);
        System.out.println("Fecha ingresada: " + fechaIngresada);
        Date fechaActual = new Date();
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Diferencia de años: " + (fechaActual.getYear() - fechaIngresada.getYear()));
        
        System.out.println("---------------------------------");
        System.out.println("LocalDate");
        LocalDate fechaIngresadaLD = LocalDate.of(anio, mes, dia);
        System.out.println("Fecha ingresada: " + fechaIngresadaLD);
        LocalDate fechaActualLD = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActualLD);
        System.out.println("Diferencia de años: " + (fechaActualLD.getYear() - fechaIngresadaLD.getYear()));

        System.out.println("---------------------------------");
        System.out.println("Diferencia en días:");
        long diferenciaEnDias = ChronoUnit.DAYS.between(fechaIngresadaLD, fechaActualLD);
        System.out.println("La diferencia en días es: " + diferenciaEnDias);
        
        System.out.println("---------------------------------");
        System.out.println("Diferencia en meses:");
        long diferenciaEnMeses = ChronoUnit.MONTHS.between(fechaIngresadaLD, fechaActualLD);
        System.out.println("La diferencia en meses es: " + diferenciaEnMeses);
    }
    
}
