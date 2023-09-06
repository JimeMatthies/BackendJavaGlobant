/*
Guia 9 = Aplicación Calculadora (Videos 3)
@author JimeM
 */
package guia9ejerciciovideocalculadora;

import Entity.Calculator;

public class Guia9EjercicioVideoCalculadora {

    public static void main(String[] args) {
       
        Calculator c1 = new Calculator();
        System.out.println(c1.add(2, 5));
        System.out.println(c1.subtract(10, 5));
        System.out.println(c1.multiply(25, 4));
        System.out.println(c1.divide(60, 3));
    }
    
}
