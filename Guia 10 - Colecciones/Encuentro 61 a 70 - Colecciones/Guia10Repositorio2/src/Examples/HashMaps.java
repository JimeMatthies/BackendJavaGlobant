/*
Guia 10 = Repositorio Colecciones (Curso, Listas, Sets, Mapas)
@author JimeM
 */
package Examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMaps {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in).useDelimiter("\n");

        HashMap<Integer, String> students = new HashMap(); //First Key, then Values
        int document;
        String name;
        String answer = "";
        do {
            System.out.println("Student's document: ");
            document = SC.nextInt();
            System.out.println("Students's name: ");
            name = SC.next();
            students.put(document, name);
            System.out.println("Do you want to add another student? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("---------------------------------");
        for (Map.Entry<Integer, String> ss : students.entrySet()) {
            System.out.println("Document = " + ss.getKey() + ", Name = " + ss.getValue());
        }

        System.out.println("---------------------------------");
        for (Integer SSN : students.keySet()) {
            System.out.println("Document = " + SSN);
        }

        System.out.println("---------------------------------");
        for (String names : students.values()) {
            System.out.println("Name: " + names);
        }

        System.out.println("---------------------------------");
        Iterator<Map.Entry<Integer, String>> it = students.entrySet().iterator();
        System.out.println("Which student do you want to remove?");
        int SSN = SC.nextInt();
        while (it.hasNext()) {
            Map.Entry<Integer, String> ss = it.next();
            if (ss.getKey() == SSN) {
                it.remove();
            }
        }
        for (Map.Entry<Integer, String> ss : students.entrySet()) {
            System.out.println("Document = " + ss.getKey() + ", Name = " + ss.getValue());
        }

        System.out.println("---------------------------------");
        System.out.println("Which student do you want to remove?");
        int SSNRemove = SC.nextInt();
        students.remove(SSNRemove);
        System.out.println("---------------------------------");
        for (Map.Entry<Integer, String> ss : students.entrySet()) {
            System.out.println("Document = " + ss.getKey() + ", Name = " + ss.getValue());
        }

    }

}
