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

import Entidades.Alquiler;
import Entidades.Pelicula;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class AlquilerServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private static final ArrayList<Alquiler> ALQUILERES = new ArrayList<>();

    public static void crearAlquiler() {
        System.out.println("---------------------------------");
        Pelicula pp;
        String pelicula;
        do {
            System.out.println("Título de la película a alquilar:");
            pelicula = SC.next();
            pp = PeliculaServicio.buscarPeliculaTitulo(pelicula);
        } while (pp == null);
        String[] fecha;
        String input;
        while (true) {
            System.out.println("Fecha de inicio del alquiler (DD/MM/AAAA):");
            input = SC.next();
            if (input.matches("\\d{2}/\\d{2}/\\d{4}")) {
                break;
            } else {
                System.out.println("Formato no válido");
            }
        }
        fecha = input.split("/");
        LocalDate fechaIncio = LocalDate.of(Integer.parseInt(fecha[2]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[0]));
        while (true) {
            System.out.println("Fecha de fin del alquiler (DD/MM/AAAA):");
            input = SC.next();
            if (input.matches("\\d{2}/\\d{2}/\\d{4}")) {
                break;
            } else {
                System.out.println("Formato no válido");
            }
        }
        fecha = input.split("/");
        LocalDate fechaFin = LocalDate.of(Integer.parseInt(fecha[2]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[0]));
        Period duracion = Period.between(fechaIncio, fechaFin);
        double precio = calcularIngreso(duracion.getDays());

        ALQUILERES.add(new Alquiler(pelicula, fechaIncio, fechaFin, precio));
    }

    public static void mostrarAlquiler(Alquiler aa) {
        System.out.println("---------------------------------");
        System.out.println("Información del alquiler: ");
        System.out.println("Pelicula: " + aa.getPelicula());
        System.out.println("Fecha de inicio: " + aa.getFechaIncio());
        System.out.println("Fecha de fin: " + aa.getFechaFin());
        System.out.println("Precio: " + aa.getPrecio());
    }

    public static void mostrarAlquileres() {
        ALQUILERES.forEach((aa) -> {
            mostrarAlquiler(aa);
        });
    }

    public static double calcularIngreso(int duracion) {
        if (duracion <= 3) {
            return 10;
        } else {
            return 10 + (duracion - 3) * 0.1;
        }
    }

    public static Alquiler buscarAlquilerFecha(LocalDate fecha) {
        for (Alquiler aa : ALQUILERES) {
            if (aa.getFechaIncio().equals(fecha)) {
                System.out.println("El alquiler si existe");
                mostrarAlquiler(aa);
                return aa;
            } else {
                System.out.println("El alquiler en la fecha" + aa + " no existe");
            }
        }
        return null;
    }

}
