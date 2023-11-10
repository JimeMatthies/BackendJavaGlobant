/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos números en forma de cadena. 
A continuación, utilice el método parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en 
dos variables de tipo int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.
@author JimeM
 */
package guia13ejercicioaprendizaje3;

import entities.Division;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Guia13EjercicioAprendizaje3 {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        Division ds = new Division();
        try {
            System.out.println("Please enter 2 numbers:");
            Integer a = Integer.parseInt(SC.next());//NumberFormatException
            Integer b = SC.nextInt();//InputMismatchException
            System.out.println("Result: " + ds.division(a,b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.toString());
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cannot divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.toString());
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cannot turn into a number");
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.toString());
            System.out.println("Error: " + e.getMessage());
            System.out.println("Number entered is not an Integer");
        }
    }

}
