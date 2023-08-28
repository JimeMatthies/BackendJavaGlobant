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
package guia8ejercicioactividadextra201;

import Servicios.AlquilerServicio;
import Servicios.PeliculaServicio;

public class Guia8EjercicioActividadExtra201 {

    public static void main(String[] args) {
                     
        PeliculaServicio.crearPelicula("Everything Everywhere All at Once", "Ciencia ficción", 2022, 139);
        PeliculaServicio.crearPelicula("The Shining", "Terror", 1980, 146);
        PeliculaServicio.crearPelicula("2001: A Space Odyssey", "Ciencia ficción", 1968, 149);
        PeliculaServicio.crearPelicula("Gia", "Drama", 1998, 126);
        PeliculaServicio.crearPelicula("Scary Movie", "Comedia", 2000, 88);    
        PeliculaServicio.mostrarPeliculas();
        AlquilerServicio.crearAlquiler();
        AlquilerServicio.crearAlquiler();
        AlquilerServicio.mostrarAlquileres();
    }

}
