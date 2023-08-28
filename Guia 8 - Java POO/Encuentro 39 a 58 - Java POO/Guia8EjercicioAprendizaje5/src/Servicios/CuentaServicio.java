/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidades.Cuenta;

public class CuentaServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        System.out.println("---------------------------------");
        System.out.println("Número de cuenta:");
        int numeroCuenta = SC.nextInt();
        System.out.println("DNI:");
        long dni = SC.nextLong();
        System.out.println("Saldo Actual:");
        int saldoActual = SC.nextInt();

        return new Cuenta(numeroCuenta, dni, saldoActual);
    }

    public void mostrarCuenta(Cuenta cc) {
        System.out.println("---------------------------------");
        System.out.println("Información de la cuenta: ");
        System.out.println("Número de cuenta: " + cc.getNumeroCuenta());
        System.out.println("DNI: " + cc.getDni());
        System.out.println("Saldo Actual: " + cc.getSaldoActual());
    }

    public void Ingresar(double ingreso, Cuenta cc) {
        System.out.println("---------------------------------");
        System.out.println("(INGRESAR) Saldo anterior: " + cc.getSaldoActual());
        System.out.println("(INGRESAR) Monto a Ingresar: " + (int) ingreso);
        cc.setSaldoActual((int) ingreso + cc.getSaldoActual());
        System.out.println("(INGRESAR) Saldo nuevo: " + cc.getSaldoActual());
    }

    public void Retirar(double retiro, Cuenta cc) {
        System.out.println("---------------------------------");
        System.out.println("(RETIRAR) Saldo anterior: " + cc.getSaldoActual());
        System.out.println("(RETIRAR) Mionto a retirar: " + (int) retiro);
        cc.setSaldoActual(cc.getSaldoActual() - (int) retiro);
        System.out.println("(RETIRAR) Saldo nuevo: " + cc.getSaldoActual());
    }

    public void extraccionRapida(double porcentaje, Cuenta cc) {
        System.out.println("---------------------------------");
        if (porcentaje > 20) {
            System.out.println("Cantidad incorrecta");
        } else {
            System.out.println("(EXTRACCIÓN RÁPIDA) Saldo anterior: " + cc.getSaldoActual());
            double retiro = cc.getSaldoActual()*(porcentaje / 100);
            System.out.println("(EXTRACCIÓN RÁPIDA) Monto a retirar: " + (int) retiro);
            cc.setSaldoActual(cc.getSaldoActual() - (int)retiro);
            System.out.println("(EXTRACCIÓN RÁPIDA) Saldo nuevo: " + cc.getSaldoActual());
        }
    }

    public void consultarSaldo(Cuenta cc) {
        System.out.println("---------------------------------");
        System.out.println("(CONSULTAR) Saldo actual: " + cc.getSaldoActual());
    }
}
