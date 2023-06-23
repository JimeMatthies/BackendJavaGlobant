/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
@author JimeM
*/
package guia7ejercicioaprendizaje14;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad en euros: ");
        double euro = leer.nextDouble();
        System.out.println("Ingrese moneda a convertir (dolar, yen o libra)");
        String currency = leer.next();
        Exchange(euro, currency);
    }

    public static void Exchange(double euro, String currency) {
        switch (currency.toLowerCase()) {
            case "libra":
                System.out.println(euro + " € son " + (euro * 0.86) + " libras");
                break;
            case "dolar":
                System.out.println(euro + " € son " + (euro * 1.28611) + "US $");
                break;
            case "yen":
                System.out.println(euro + " € son " + (euro * 129.852) + " yen");
                break;
            default:
                System.out.println("Moneda no valida");
        }
    }
    
}
