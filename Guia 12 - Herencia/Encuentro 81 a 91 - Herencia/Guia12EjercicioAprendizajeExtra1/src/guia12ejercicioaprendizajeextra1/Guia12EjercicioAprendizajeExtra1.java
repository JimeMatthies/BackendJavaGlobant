/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el nombre, documento 
del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
° Número de mástiles para veleros.
° Potencia en CV para barcos a motor.
° Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de alquiler y devolución), 
por un valor módulo de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y sumándole el atributo 
particular de cada barco. En los veleros se suma el número de mástiles, en los barcos a motor se le suma la potencia 
en CV y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los métodos necesarios que 
permitan al usuario elegir el barco que quiera alquilar y mostrarle el precio final de su alquiler.
@author JimeM
 */
package guia12ejercicioaprendizajeextra1;

import entities.Boat;
import entities.Motorboat;
import entities.Rent;
import entities.Sailboat;
import entities.Yacht;

public class Guia12EjercicioAprendizajeExtra1 {

    public static void main(String[] args) {

        Rent rr = new Rent();

        Boat b1 = new Boat("CVWD90", 10, 2012);
        Boat s1 = new Sailboat(2, "CVWD91", 10, 2013);
        Boat m1 = new Motorboat(40, "CVWD92", 10, 2014);
        Boat y1 = new Yacht(2, 40, "CVWD94", 10, 2015);

        System.out.println("---------------------------------");
        System.out.println(b1.toString());
        System.out.println("Module=" + b1.calculateModule());
        rr.createRent(b1);

        System.out.println("---------------------------------");
        System.out.println(s1.toString());
        System.out.println("Module=" + s1.calculateModule());
        rr.createRent(s1);

        System.out.println("---------------------------------");
        System.out.println(m1.toString());
        System.out.println("Module=" + m1.calculateModule());
        rr.createRent(m1);

        System.out.println("---------------------------------");
        System.out.println(y1.toString());
        System.out.println("Module=" + y1.calculateModule());
        rr.createRent(y1);

    }

}
