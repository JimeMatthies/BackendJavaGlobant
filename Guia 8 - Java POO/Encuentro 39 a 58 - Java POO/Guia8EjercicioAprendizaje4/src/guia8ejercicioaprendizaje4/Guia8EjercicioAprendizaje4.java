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
package guia8ejercicioaprendizaje4;

import Entidades.Rectangulo;
import Servicios.RectanguloServicio;

public class Guia8EjercicioAprendizaje4 {

    public static void main(String[] args) {
        
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.crearRectangulo();
        rs.mostrarRectangulo(r1);
        rs.Superficie(r1);
        rs.Perimetro(r1);
    }
    
}
