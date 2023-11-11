/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones.
@author JimeM
 */
package guia13ejercicioaprendizaje4;

import entities.Division;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Guia13EjercicioAprendizaje4 {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        Division ds = new Division();
        try {
            System.out.println("Please enter 2 numbers:");
            Integer a = Integer.parseInt(SC.next());//NumberFormatException
            Integer b = SC.nextInt();//InputMismatchException
            System.out.println("Result: " + ds.division(a, b));
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
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            System.out.println("Error: " + e.getMessage());
            System.out.println("System Error");
        }
    }

}
