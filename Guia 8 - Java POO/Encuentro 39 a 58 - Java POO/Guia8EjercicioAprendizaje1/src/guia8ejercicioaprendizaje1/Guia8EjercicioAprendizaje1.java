/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
@author JimeM
 */
package guia8ejercicioaprendizaje1;

import Entidades.Libro;
import Servicios.LibroServicio;

public class Guia8EjercicioAprendizaje1 {

    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        Libro L1 = ls.crearLibro();
        ls.mostrarLibro(L1);
    }

}
