/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
@author JimeM
 */
package Services;

import java.util.ArrayList;
import java.util.Scanner;

public class Integers {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Integer> integers;

    public Integers() {
        this.integers = new ArrayList();
    }

    private void loadIntegers() {
        Integer num = 0;
        do {
            System.out.println("Enter a integer: (Enter -99 to end)");
            num = SC.nextInt();
            if (num != -99) {
                integers.add(num);
            } else {
                break;
            }
        } while (true);
    }

    private Double average() {
        return (1.0 * sum()) / integers.size();
    }

    private Integer sum() {
        Integer sum = 0;
        for (Integer num : integers) {
            sum += num;
        }
        return sum;
    }

    public void startIntegers() {
        loadIntegers();
        System.out.println("Amount of numbers: " + integers.size());
        System.out.println("Sum of every numer: " + sum());
        System.out.println("Average of numbers: " + average());
    }

}
