/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidades.Libro;

public class LibroServicio {
    
    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        System.out.println("---------------------------------");
        System.out.println("ISBN del libro:");
        int isbn = SC.nextInt();
        System.out.println("Título del libro:");
        String titulo = SC.next();
        System.out.println("Autor del libro:");
        String autor = SC.next();
        System.out.println("Número de paginas del libro:");
        int paginas = SC.nextInt();
        
        return new Libro(isbn, titulo, autor, paginas);
    }
    
    public void mostrarLibro(Libro ll){
        System.out.println("---------------------------------");
        System.out.println("Información del libro: ");
        System.out.println("ISBN: " + ll.getIsbn());
        System.out.println("Título: " + ll.getTitulo());
        System.out.println("Autor: " + ll.getAutor());
        System.out.println("Páginas: " + ll.getPaginas());
    }
}