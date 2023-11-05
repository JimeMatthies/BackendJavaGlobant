/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas geométricas, 
en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las dos formas geométricas, 
vamos a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos para calcular el área, el perímetro 
y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se calcule el área y el perímetro 
de los dos. En el main se crearán las formas y se mostrará el resultado final.
° Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
° Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
@author JimeM
 */
package guia12ejercicioaprendizaje4;

import entities.Circle;
import entities.Rectangle;

public class Guia12EjercicioAprendizaje4 {

    public static void main(String[] args) {
        
        Circle c1 = new Circle(5.0);
        Rectangle r1 = new Rectangle(5.0, 10.0);
        System.out.println("---------------------------------");
        System.out.println("Circle:");
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Perimeter: " + c1.calculatePerimeter());
        System.out.println("---------------------------------");
        System.out.println("Rectangle:");
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.calculateArea());
        System.out.println("Perimeter: " + r1.calculatePerimeter());
        
    }
    
}
