/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidades.Circunferencia;

public class CircunferenciaServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    double pi = Math.PI;

    public Circunferencia crearCircunferencia() {
        System.out.println("---------------------------------");
        System.out.println("Radio de la Circunferencia:");
        double radio = SC.nextDouble();

        return new Circunferencia(radio);
    }

    public void mostrarCircunferencia(Circunferencia cc) {
        System.out.println("---------------------------------");
        System.out.println("Información de la circunferencia: ");
        System.out.println("Radio: " + cc.getRadio());
    }

    public void Area(Circunferencia cc) {
        System.out.println("---------------------------------");
        System.out.println("Área del círculo: " + (pi * Math.pow(cc.getRadio(), 2)));
    }

    public void Perimetro(Circunferencia cc) {
        System.out.println("---------------------------------");
        System.out.println("Perímetro del círculo: " + (2 * pi * cc.getRadio()));
    }
}
