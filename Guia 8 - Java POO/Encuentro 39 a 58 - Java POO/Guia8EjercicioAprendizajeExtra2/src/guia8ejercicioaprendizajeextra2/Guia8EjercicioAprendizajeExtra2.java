/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
Nota: Formula ecuación calcular distancia: √((X2-X1)^2)+(Y2-Y1)^2))
@author JimeM
 */
package guia8ejercicioaprendizajeextra2;

import Entidades.Puntos;
import Servicios.PuntosServicio;

public class Guia8EjercicioAprendizajeExtra2 {

    public static void main(String[] args) {
        
        PuntosServicio ps = new PuntosServicio();
        Puntos p1 = ps.crearPuntos();
        ps.mostrarPuntos(p1);
        ps.calcularDistancia(p1);
    }
    
}
