/*
Guia 8 = App Sueldo y Antiguedad (Video 10)
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidades.Vendedor;
import java.util.Date;

public class VendedorServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Vendedor crearVendedor() {
        System.out.println("---------------------------------");
        Vendedor v1 = new Vendedor();
        System.out.println("Nombre del vendedor:");
        v1.setNombre(SC.next());
        System.out.println("Rut del vendedor:");
        v1.setRut(SC.nextInt());
        System.out.println("Sueldo base del vendedor:");
        v1.setSueldoBase(SC.nextDouble());
        System.out.println("Ingrese el dia que comenzó a trabajar:");
        int dia = SC.nextInt();
        System.out.println("Ingrese el mes que comenzó a trabajar:");
        int mes = SC.nextInt();
        System.out.println("Ingrese el año que comenzó a trabajar:");
        int anio = SC.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechainicio(fecha);

        return v1;
    }

    public void mostrarVendedor(Vendedor vv) {
        System.out.println("---------------------------------");
        System.out.println("Información del vendedor: ");
        System.out.println("Nombre: " + vv.getNombre());
        System.out.println("Rut: " + vv.getRut());
        System.out.println("Sueldo Base: " + vv.getSueldoBase());
        System.out.println("Comisiones: " + vv.getComisiones());
        System.out.println("Sueldo Mensual: " + vv.getSueldoMensual());
        System.out.println("Fecha de Inicio: " + vv.getFechainicio());
    }

    public void calcularSueldo(Vendedor v1) {
        System.out.println("---------------------------------");
        System.out.println("Cuales fueron las ventas totales del vendedor:");
        double ventas = SC.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBase() + v1.getComisiones());
        System.out.println("El sueldo Mensual de " + v1.getNombre() + " es " + v1.getSueldoMensual());
    }

    public void calcularVacaciones(Vendedor v1) {
        System.out.println("---------------------------------");
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechainicio().getYear();
        if (antiguedad < 5) {
            System.out.println("Al vendedor " + v1.getNombre() + " le corresponden 14 días de vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("Al vendedor " + v1.getNombre() + " le corresponden 21 días de vacaciones");
        } else if (antiguedad < 20) {
            System.out.println("Al vendedor " + v1.getNombre() + " le corresponden 28 días de vacaciones");
        } else if (antiguedad >= 20) {
            System.out.println("Al vendedor " + v1.getNombre() + " le corresponden 35 días de vacaciones");
        }
    }
}
