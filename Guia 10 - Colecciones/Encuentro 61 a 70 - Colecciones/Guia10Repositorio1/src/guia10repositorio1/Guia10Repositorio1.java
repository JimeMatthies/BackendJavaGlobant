/*
Guia 10 = Repositorio Atributo Coleccion
@author JimeM
 */
package guia10repositorio1;

import Entity.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Guia10Repositorio1 {

    public static void main(String[] args) {
        
        Collections c1 = new Collections();
        
        //List
        ArrayList<String> books = new ArrayList();
        books.add("The Life-Changing Magic of Tidying Up");
        books.add("Someday, Someday, Maybe");
        c1.setBooks(books);      
        //Set
        HashSet<Integer> numbers = new HashSet();
        numbers.add(25);
        numbers.add(29);
        c1.setNumbers(numbers);
        // Maps
        HashMap<Integer, String> students = new HashMap();
        students.put(16624798, "Jime Matthies");
        students.put(16694647, "Rosa Carrera");
        c1.setStudents(students);
        //Show books through getter
        for (String book : c1.getBooks()) {
            System.out.println(book);
        }
        //Show entity through methods
        c1.loopCollections();
    }
    
}
