/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
Nota: Formula ecuación calcular distancia: √((X2-X1)^2)+(Y2-Y1)^2))
@author JimeM
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

public class PuntosServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Puntos crearPuntos() {
        System.out.println("---------------------------------");
        System.out.println("X1:");
        int x1 = SC.nextInt();
        System.out.println("Y1:");
        int y1 = SC.nextInt();
        System.out.println("X2:");
        int x2 = SC.nextInt();
        System.out.println("Y2:");
        int y2 = SC.nextInt();

        return new Puntos(x1, y1, x2, y2);
    }

    public void mostrarPuntos(Puntos pp) {
        System.out.println("---------------------------------");
        System.out.println("Información de los Puntos: ");
        System.out.println("X1: " + pp.getX1());
        System.out.println("Y1: " + pp.getY1());
        System.out.println("X2: " + pp.getX2());
        System.out.println("Y2: " + pp.getY2());
    }

    public void calcularDistancia(Puntos pp) {

        System.out.println("---------------------------------");
        System.out.println("La distancia entre los 2 puntos es: ");
        double XResultado = Math.pow(pp.getX2() - pp.getX1(), 2);
        System.out.println(XResultado);
        double YResultado = Math.pow(pp.getY2() - pp.getY1(), 2);
        System.out.println(YResultado);
        System.out.println(Math.sqrt(XResultado + YResultado));
    }

}
