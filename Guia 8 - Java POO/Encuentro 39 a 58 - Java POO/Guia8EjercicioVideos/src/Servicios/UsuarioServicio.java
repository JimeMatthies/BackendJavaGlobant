/*
Guia 8 = Aplicación Mascotas (Videos 1 - 9)
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidades.Usuario;
import java.time.LocalDate;

public class UsuarioServicio {

    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Usuario crearUsuario() {
        System.out.println("---------------------------------");
        System.out.println("Ingrese el nombre del usuario:");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido del usuario:");
        String apellido = sc.next();
        System.out.println("Ingrese el país del usuario:");
        String pais = sc.next();
        System.out.println("Ingrese el rut del usuario:");
        int rut = sc.nextInt();
        System.out.println("Ingrese la fecha de nacimiento del usuario:");
        String[] fecha;
        String input;
        input = sc.next();
        fecha = input.split("/");
        LocalDate nacimiento = LocalDate.of(Integer.parseInt(fecha[2]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[0]));

        return new Usuario(nombre, apellido, pais, rut, nacimiento);
    }

    public void mostrarUsuario(Usuario uu) {
        System.out.println("---------------------------------");
        System.out.println("Información del usuario: ");
        System.out.println("Nombre: " + uu.getNombre());
        System.out.println("Apellido: " + uu.getApellido());
        System.out.println("Pais: " + uu.getPais());
        System.out.println("Rut: " + uu.getRut());
        System.out.println("Nacimiento: " + uu.getNacimiento());
    }

}
