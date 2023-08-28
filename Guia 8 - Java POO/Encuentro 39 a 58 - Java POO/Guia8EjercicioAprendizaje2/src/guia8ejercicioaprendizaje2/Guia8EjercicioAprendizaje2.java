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
package guia8ejercicioaprendizaje2;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicio;

public class Guia8EjercicioAprendizaje2 {

    public static void main(String[] args) {

        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia c1 = cs.crearCircunferencia();
        //cs.mostrarCircunferencia(c1);
        cs.Area(c1);
        cs.Perimetro(c1);
    }

}
