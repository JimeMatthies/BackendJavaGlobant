/*
Escribir un programa en Java que simule un servicio de alquiler de películas. El programa debe tener una clase Pelicula
que represente los datos de una película, como el título, el género, el año y la duración. El programa también debe 
tener una clase Alquiler que represente los datos de un alquiler, como la película alquilada, la fecha de inicio, la 
fecha de fin y el precio.
El programa puede usar la clase Date para manejar las fechas, la clase Arrays para almacenar y ordenar las películas y
los alquileres, la clase Math para calcular el precio según la duración y el género de la película, y la clase String 
para manipular los textos.
El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las 
peliculas disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por 
genero y buscar alquileres por fecha.
Metodos de ambas entidades (realizar los metodos en las clases de servicio):
° Crear Película
° Crear Alquiler
° Listar todas las películas disponibles
° Listar todas las películas alquiladas
° Buscar una película por título (Decir si se existe o no)
° Buscar una película por género (Decir si se existe o no)
° Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)
° Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de
  interés.)
El programa debe validar que los datos ingresados por el usuario sean correctos y mostrar mensajes de error en caso
contrario. El programa debe terminar cuando el usuario elija la opción de salir.
° Se deben crear al menos 5 películas, junto con todos sus datos.
° Se deben realizar 3 alquileres de películas.
° Mostrar todas las películas cargadas.
° Mostrar todos los alquileres realizados.
@author JimeM
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private static final ArrayList<Pelicula> CATALOGO = new ArrayList<>();

    public static void crearPelicula() {
        System.out.println("---------------------------------");
        System.out.println("Título de la película:");
        String titulo = SC.next().toUpperCase();
        System.out.println("Genero de la película:");
        String genero = SC.next().toUpperCase();
        System.out.println("Año de la película:");
        int anio = SC.nextInt();
        System.out.println("Duración de la película:");
        int duracion = SC.nextInt();
        CATALOGO.add(new Pelicula(titulo, genero, anio, duracion));
    }

    public static void crearPelicula(String titulo, String genero, int anio, int duracion) {
        CATALOGO.add(new Pelicula(titulo, genero, anio, duracion));
    }

    public static void mostrarPelicula(Pelicula pp) {
        System.out.println("---------------------------------");
        System.out.println("Información de la película:");
        System.out.println("Título: " + pp.getTitulo());
        System.out.println("Genero: " + pp.getGenero());
        System.out.println("Año: " + pp.getAnio());
        System.out.println("Duración: " + pp.getDuracion());
    }

    public static void mostrarPeliculas() {
        CATALOGO.forEach((pp) -> {
            mostrarPelicula(pp);
        });
    }

    public static Pelicula buscarPeliculaTitulo(String titulo) {
        for (Pelicula pp : CATALOGO) {
            if (pp.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("La película si existe");
                mostrarPelicula(pp);
                return pp;
            }
        }
        System.out.println("La película " + titulo + " no existe");
        return null;
    }

    public static ArrayList<Pelicula> buscarPeliculaGenero(String genero) {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        CATALOGO.stream().filter((pp) -> (pp.getGenero().equalsIgnoreCase(genero))).forEachOrdered((pp) -> {
            peliculas.add(pp);
        });
        if (peliculas.isEmpty()) {
            System.out.println("No existen películas del genero " + genero);
            return null;
        } else {
            System.out.println("Películas del genero " + genero);
            peliculas.forEach((pp) -> {
                mostrarPelicula(pp);
            });
        }
        return peliculas;
    }

}
