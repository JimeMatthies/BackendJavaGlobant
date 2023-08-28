/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
° Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
° Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
° Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
° Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
° Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
° Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a)
@author JimeM
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Raices crearRaices() {
        System.out.println("---------------------------------");
        System.out.println("A:");
        double a = SC.nextDouble();
        System.out.println("B:");
        double b = SC.nextDouble();
        System.out.println("C:");
        double c = SC.nextDouble();

        return new Raices(a, b, c);
    }

    public void mostrarRaices(Raices rr) {
        System.out.println("---------------------------------");
        System.out.println("Información de las raices: ");
        System.out.println("A: " + rr.getA());
        System.out.println("B: " + rr.getB());
        System.out.println("C: " + rr.getC());
    }

    public double getDiscriminante(Raices rr) {
        double discriminante = (Math.pow(rr.getB(), 2)) - 4 * rr.getA() * rr.getC();
        return discriminante;
    }

    public boolean tieneRaices(Raices rr) {
        boolean respuesta = false;
        if (getDiscriminante(rr) > 0) {
            respuesta = true;
        }
        return respuesta;
    }

    public boolean tieneRaiz(Raices rr) {
        boolean respuesta = false;
        if (getDiscriminante(rr) == 0) {
            respuesta = true;
        }
        return respuesta;
    }

    public void obtenerRaices(Raices rr) {
        System.out.println("---------------------------------");
        if (tieneRaices(rr) == true) {
            System.out.println("Ambas soluciones:");
            double s1 = (-rr.getB() + Math.sqrt(getDiscriminante(rr))) / (2 * rr.getA());
            double s2 = (-rr.getB() - Math.sqrt(getDiscriminante(rr))) / (2 * rr.getA());
            System.out.println("Solucion 1 = " + s1);
            System.out.println("Solucion 2 = " + s2);
        } else {
            System.out.println("No tiene 2 soluciones:");
        }
    }

    public void obtenerRaiz(Raices rr) {
        System.out.println("---------------------------------");
        if (tieneRaiz(rr) == true) {
            System.out.println("Solucion:");
            double resultado = (-rr.getB() + Math.sqrt(getDiscriminante(rr))) / (2 * rr.getA());
            System.out.println(resultado);
        } else {
            System.out.println("No tiene 1 solucion:");
        }
    }
    
    public void calcular(Raices rr) {
        System.out.println("---------------------------------");
        System.out.println("Valor del discriminante:");
        System.out.println(getDiscriminante(rr));
        if (tieneRaiz(rr)) {
            obtenerRaiz(rr);
        } else if (tieneRaices(rr)) {
            obtenerRaices(rr);
        } else {
            System.out.println("---------------------------------");
            System.out.println("La ecuación no tiene solucion real");
        }
    }
}
