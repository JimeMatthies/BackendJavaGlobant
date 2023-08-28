/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
° Constructor predeterminado o vacío
° Constructor con la capacidad máxima y la cantidad actual
° Métodos getters y setters.
° Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
° Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
° Método vaciarCafetera(): pone la cantidad de café actual en cero.
° Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidades.Cafetera;

public class CafeteraServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {
        System.out.println("---------------------------------");
        System.out.println("Capacidad Máxima de la cafetera:");
        double capacidadMaxima = SC.nextDouble();
        System.out.println("Cantidad actual de la cafetera:");
        double cantidadActual = SC.nextDouble();

        return new Cafetera(capacidadMaxima, cantidadActual);
    }

    public void mostrarCafetera(Cafetera cc) {
        System.out.println("---------------------------------");
        System.out.println("Información de la cafetera: ");
        System.out.println("Capacidad máxima: " + cc.getCapacidadMaxima());
        System.out.println("Cantidad actual: " + cc.getCantidadActual());
    }

    public void llenarCafetera(Cafetera cc) {
        System.out.println("---------------------------------");
        System.out.println("(LLENAR CAFETERA) Cantidad anterior: " + cc.getCantidadActual());
        cc.setCantidadActual(cc.getCapacidadMaxima());
        System.out.println("(LLENAR CAFETERA) Cafetera llenada: " + cc.getCantidadActual());
    }

    public void servirTaza(Cafetera cc) {
        System.out.println("---------------------------------");
        System.out.println("Seleccione el tamaño del café: ");
        System.out.println("1.- Chico");
        System.out.println("2.- Mediano");
        System.out.println("3.- Grande");
        int op = SC.nextInt();
        switch (op) {
            case 1:
                if (cc.getCantidadActual() >= 120) {
                    cc.setCantidadActual(cc.getCantidadActual() - 120);
                    System.out.println("(CAFÉ SERVIDO) Eligió un caé chico (120 ml)");
                    System.out.println("(CAFÉ SERVIDO) Quedan: " + cc.getCantidadActual() + " ml.");
                } else {
                    System.out.println("No hay suficiente café");
                    System.out.println("(CAFÉ SERVIDO)Solo se sirvieron " + cc.getCantidadActual() + " ml.");
                }
                break;
            case 2:
                if (cc.getCantidadActual() >= 240) {
                    cc.setCantidadActual(cc.getCantidadActual() - 240);
                    System.out.println("(CAFÉ SERVIDO) Eligió un caé mediano (240 ml)");
                    System.out.println("(CAFÉ SERVIDO) Quedan: " + cc.getCantidadActual() + " ml.");
                } else {
                    System.out.println("Ya no hay suficiente café");
                    System.out.println("(CAFÉ SERVIDO) Solo se sirvieron " + cc.getCantidadActual() + " ml.");
                }
                break;
            case 3:
                if (cc.getCantidadActual() >= 400) {
                    cc.setCantidadActual(cc.getCantidadActual() - 400);
                    System.out.println("(CAFÉ SERVIDO) Eligió un caé grande (400 ml)");
                    System.out.println("(CAFÉ SERVIDO) Quedan: " + cc.getCantidadActual() + " ml.");
                } else {
                    System.out.println("Ya no hay suficiente café");
                    System.out.println("(CAFÉ SERVIDO) Solo se sirvieron " + cc.getCantidadActual() + " ml.");
                }
                break;
            default:
                System.out.println("Selección incorrecta");
                break;
        }
    }

    public void vaciarCafetera(Cafetera cc) {
        System.out.println("---------------------------------");
        cc.setCantidadActual(0);
        System.out.println("(VACIAR CAFETERA) Se vacio la cafetera");
        System.out.println("(VACIAR CAFETERA) Cantidad actual: " + cc.getCantidadActual());
    }

    public void agregarCafe(Cafetera cc) {
        System.out.println("---------------------------------");
        System.out.println("(AGREGAR CAFÉ) ¿Cuanto café se va a agregar?: ");
        int add = SC.nextInt();
        cc.setCantidadActual(add);
        System.out.println("(AGREGAR CAFÉ) Se agrego café a la cafetera");
        System.out.println("(AGREGAR CAFÉ) Cantidad actual: " + cc.getCantidadActual());
    }
}
