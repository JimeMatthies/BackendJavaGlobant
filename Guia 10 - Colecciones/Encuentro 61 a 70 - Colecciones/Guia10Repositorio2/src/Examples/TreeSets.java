/*
Guia 10 = Repositorio Colecciones (Curso, Listas, Sets, Mapas)
@author JimeM
 */
package Examples;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in).useDelimiter("\n");

        TreeSet<Integer> treeInt = new TreeSet();
        int num;
        String answer = "";
        do {
            System.out.println("Enter a number");
            num = SC.nextInt();
            treeInt.add(num);
            System.out.println("Do you want to enter another number? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
        
        System.out.println("---------------------------------");
        System.out.println("Loop TreeSet with for each");
        for (Integer number : treeInt) {
            System.out.println(number);
        }

        System.out.println("---------------------------------");
        System.out.println("Loop TreeSet with iterator");
        Iterator<Integer> it = treeInt.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------------------------");
        System.out.println("Remove number with iterator");
        Iterator<Integer> it2 = treeInt.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(3)) { //Remove number 3 if exists.
                it2.remove();
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Loop HashSet without number 3");
        for (Integer number : treeInt) {
            System.out.println(number);
        }

        System.out.println("---------------------------------");
        System.out.println("TreeSet's size: " + treeInt.size());

        System.out.println("---------------------------------");
        System.out.println("Show if number -3- is on the TreeSet");
        if (treeInt.contains(3)) {
            System.out.println("TreeSet has number 3");
        } else {
            System.out.println("TreeSet doesn't have it");
        }

        System.out.println("---------------------------------");
        System.out.println("Show if list is empty");
        if (treeInt.isEmpty()) {
            System.out.println("TreeSet is empty");
        } else {
            System.out.println("TreeSet is not empty");
        }

        System.out.println("---------------------------------");
        System.out.println("Remove all elements of the TreeSet");
        treeInt.clear();
    }
    
}
