/*
Guia 10 = Repositorio Colecciones (Curso, Listas, Sets, Mapas)
@author JimeM
 */
package Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayLists {

    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> list = new ArrayList();
        
        String word;
        String answer = "";

        do {
            System.out.println("Enter a word:");
            word = SC.next();
            list.add(word);
            System.out.println("Do you want to enter another word? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
        
        System.out.println("---------------------------------");
        System.out.println("Loop list with for each");
        for (String string : list) {
            System.out.println(string);
        }
        
        System.out.println("---------------------------------");
        System.out.println("Loop list with iterator");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------------------------");
        System.out.println("Remove word wih iterator");
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals("Hello")) { //Remove word Hello
                it2.remove();
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Loop list without Hello");
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("---------------------------------");
        System.out.println("List's size: " + list.size());

        System.out.println("---------------------------------");
        System.out.println("Remove by index");
        list.remove(1);

        System.out.println("---------------------------------");
        System.out.println("Loop list without index object");

        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("---------------------------------");
        System.out.println("Sort list asc.");
        Collections.sort(list);

        System.out.println("---------------------------------");
        System.out.println("Loop sorted list");
        for (String string : list) {
            System.out.println(string);
        }
        
        System.out.println("---------------------------------");
        System.out.println("Sort list desc.");
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("---------------------------------");
        System.out.println("Loop sorted list");
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("---------------------------------");
        System.out.println("Show index of word -World-");
        System.out.println(list.indexOf("World"));

        System.out.println("---------------------------------");
        System.out.println("Show if word -Great- is on the list");
        if (list.contains("Great")) {
            System.out.println("List have the word Great");
        } else {
            System.out.println("Doesn't have it");
        }

        System.out.println("---------------------------------");
        System.out.println("Show if list is empty");
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        System.out.println("---------------------------------");
        System.out.println("Remove all elements of the list");
        list.clear();
    }
    
}
