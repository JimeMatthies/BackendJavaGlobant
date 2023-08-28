/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
@author JimeM
 */
package Servicios;

import Entidades.Matematica;
import java.util.Scanner;

public class MatematicaServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Matematica crearMatematica() {
        System.out.println("---------------------------------");
        System.out.println("1° número:");
        double numero1 = SC.nextDouble();
        System.out.println("2° número:");
        double numero2 = SC.nextDouble();

        return new Matematica(numero1, numero2);
    }

    public void mostrarMatematica(Matematica mm) {
        System.out.println("---------------------------------");
        System.out.println("Información de la operación: ");
        System.out.println("1° número: " + mm.getNumero1());
        System.out.println("2° número: " + mm.getNumero2());
    }
    
    public double devolverMayor(Matematica mm){
        return Double.max(mm.getNumero1(), mm.getNumero2());
    }
    
    public void calcularPotencia(Matematica mm){
        System.out.println("---------------------------------");
        System.out.println("Potencia: ");
        System.out.println(Math.pow((int)Double.max(mm.getNumero1(), mm.getNumero2()), (int)Double.min(mm.getNumero1(), mm.getNumero2())));
    }
    
    public void calculaRaiz(Matematica mm){
        System.out.println("---------------------------------");
        System.out.println("Raíz cuadrada del menor de los numeros: ");
        System.out.println(Math.sqrt(Math.abs(Double.min(mm.getNumero1(), mm.getNumero2()))));
    }

}
