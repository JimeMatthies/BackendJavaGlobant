/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidades.Rectangulo;

public class RectanguloServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {
        System.out.println("---------------------------------");
        System.out.println("Altura del rectangulo:");
        int altura = SC.nextInt();
        System.out.println("Base del rectangulo:");
        int base = SC.nextInt();

        return new Rectangulo(altura, base);
    }

    public void mostrarRectangulo(Rectangulo rr) {
        System.out.println("---------------------------------");
        System.out.println("Información del rectangulo: ");
        System.out.println("Altura: " + rr.getAltura());
        System.out.println("Base: " + rr.getBase());
        System.out.println("");
        for (int i = 0; i < rr.getAltura(); i++) {
            for (int j = 0; j < rr.getBase(); j++) {
                if (i == 0 || i == rr.getAltura() - 1 || j == 0 || j == rr.getBase() - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        System.out.println("");

    }

    public void Superficie(Rectangulo rr) {
        System.out.println("---------------------------------");
        System.out.println("Superficie del rectangulo: " + rr.getAltura() * rr.getBase());
    }

    public void Perimetro(Rectangulo rr) {
        System.out.println("---------------------------------");
        System.out.print("Perimetro del rectangulo: ");
        System.out.println(rr.getAltura()*2 + rr.getBase()*2);
    }
}
