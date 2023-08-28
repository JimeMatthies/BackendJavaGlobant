/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidades.Operacion;

public class OperacionServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {
        System.out.println("---------------------------------");
        System.out.println("1° número:");
        int numero1 = SC.nextInt();
        System.out.println("2° número:");
        int numero2 = SC.nextInt();

        return new Operacion(numero1, numero2);
    }

    public void mostrarOperacion(Operacion oo) {
        System.out.println("---------------------------------");
        System.out.println("Información de la operación: ");
        System.out.println("1° número: " + oo.getNumero1());
        System.out.println("2° número: " + oo.getNumero2());
    }

    public void Sumar(Operacion oo) {
        System.out.println("---------------------------------");
        System.out.println("Suma de los números: " + (oo.getNumero1() + oo.getNumero2()));
    }

    public void Restar(Operacion oo) {
        System.out.println("---------------------------------");
        System.out.println("Resta de los números: " + (oo.getNumero1() - oo.getNumero2()));
    }

    public void Multiplicar(Operacion oo) {
        System.out.println("---------------------------------");
        if (oo.getNumero1() == 0 || oo.getNumero2() == 0) {
            System.out.println("Uno de los multiplicadores es 0, operación inválida");
        } else {
            System.out.println("Multiplicacion de los numeros: " + (oo.getNumero1() * oo.getNumero2()));
        }
    }

    public void Dividir(Operacion oo) {
        System.out.println("---------------------------------");
        if (oo.getNumero2() == 0) {
            System.out.println("El divisor es 0, operación invalida");
        } else {
            System.out.println("Division de los numeros: " + (double) oo.getNumero1() / oo.getNumero2());
        }
    }
}
