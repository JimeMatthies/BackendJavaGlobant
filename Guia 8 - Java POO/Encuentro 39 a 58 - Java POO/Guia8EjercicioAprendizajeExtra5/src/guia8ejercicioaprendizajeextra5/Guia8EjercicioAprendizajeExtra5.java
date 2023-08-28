/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto.
@author JimeM
 */
package guia8ejercicioaprendizajeextra5;

import Entidades.Meses;
import Servicios.MesesServicio;

public class Guia8EjercicioAprendizajeExtra5 {

    public static void main(String[] args) {
        
        MesesServicio ms = new MesesServicio();
        Meses m1 = ms.crearAnio();
        ms.mostrarMeses(m1);
        ms.adivinarMes(m1);
    }
    
}
