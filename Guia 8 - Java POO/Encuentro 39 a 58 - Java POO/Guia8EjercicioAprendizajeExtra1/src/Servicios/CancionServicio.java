/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
@author JimeM
 */
package Servicios;

import Entidades.Cancion;
import java.util.Scanner;

public class CancionServicio {
    
    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Cancion crearCancion() {
        System.out.println("---------------------------------");
        System.out.println("Titulo de la canción:");
        String titulo = SC.next();
        System.out.println("Autor de la canción:");
        String autor = SC.next();

        return new Cancion(titulo, autor);
    }

    public void mostrarCancion(Cancion cc) {
        System.out.println("---------------------------------");
        System.out.println("Información de la canción: ");
        System.out.println("Titulo: " + cc.getTitulo());
        System.out.println("Autor: " + cc.getAutor());
    }
    
}
