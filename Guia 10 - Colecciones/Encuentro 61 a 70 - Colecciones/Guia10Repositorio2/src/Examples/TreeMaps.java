/*
Guia 10 = Repositorio Colecciones (Curso, Listas, Sets, Mapas)
@author JimeM
 */
package Examples;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        
        TreeMap<Integer, String> students = new TreeMap();
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
        students.replace(document, "Jime", "Jimena");
        for (Map.Entry<Integer, String> ss : students.entrySet()) {
            System.out.println("Document = " + ss.getKey() + ", Name = " + ss.getValue());
        }
    }
    
}
