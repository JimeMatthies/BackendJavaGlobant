/*
Guia 10 = Repositorio Colecciones (Curso, Listas, HashSets, Mapas)
@author JimeM
 */
package Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSets {

    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in).useDelimiter("\n");

        HashSet<Integer> hashInt = new HashSet();
        int num;
        String answer = "";
        
        do {
            System.out.println("Enter a number");
            num = SC.nextInt();
            hashInt.add(num);
            System.out.println("Do you want to enter another number? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
        
        System.out.println("---------------------------------");
        System.out.println("Loop HashSet with for each");
        for (Integer number : hashInt) {
            System.out.println(number);
        }

        System.out.println("---------------------------------");
        System.out.println("Loop HashSet with iterator");
        Iterator<Integer> it = hashInt.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------------------------");
        System.out.println("Remove number with iterator");
        Iterator<Integer> it2 = hashInt.iterator();
        while (it2.hasNext()) {
            if (it2.next() == 3) { //Remove number 3 if exists.
                it2.remove();
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Loop HashSet without number 3");
        for (Integer number : hashInt) {
            System.out.println(number);
        }

        System.out.println("---------------------------------");
        System.out.println("HashSet's size: " + hashInt.size());

        System.out.println("---------------------------------");
        System.out.println("Sort HashSet Asc.");
        ArrayList<Integer> listInt = new ArrayList(hashInt); //To sort we need to transform the Hashset into a list
        Collections.sort(listInt);

        System.out.println("---------------------------------");
        System.out.println("Loop sorted HashSet");
        for (Integer number : listInt) {
            System.out.println(number);
        }
        
        System.out.println("---------------------------------");
        System.out.println("Sort HashSet Desc.");
        ArrayList<Integer> listInt2 = new ArrayList(hashInt);
        Collections.sort(listInt2, Collections.reverseOrder());

        System.out.println("---------------------------------");
        System.out.println("Loop sorted HashSet");
        for (Integer number : listInt2) {
            System.out.println(number);
        }

        System.out.println("---------------------------------");
        System.out.println("Show if number -3- is on the HashSet");
        if (hashInt.contains(3)) {
            System.out.println("HashSet has number 3");
        } else {
            System.out.println("HashSet doesn't have it");
        }

        System.out.println("---------------------------------");
        System.out.println("Show if list is empty");
        if (hashInt.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }

        System.out.println("---------------------------------");
        System.out.println("Remove all elements of the HashSet");
        hashInt.clear();
    }
    
}
