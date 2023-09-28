/*
Guia 10 = Repositorio Atributo Coleccion
@author JimeM
 */
package Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collections {

    private ArrayList<String> books;
    private HashSet<Integer> numbers; //Could be HashSet or TreeSet
    private HashMap<Integer, String> students; //Could be HashMap or TreeMap

    public Collections() {
        //The collections are initialized so that they are not null, but empty.
        books = new ArrayList();
        numbers = new HashSet();
        students = new HashMap();
    }

    public Collections(ArrayList<String> books, HashSet<Integer> numbers, HashMap<Integer, String> students) {
        this.books = books;
        this.numbers = numbers;
        this.students = students;
    }

    public ArrayList<String> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<String> books) {
        this.books = books;
    }

    public HashSet<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(HashSet<Integer> numbers) {
        this.numbers = numbers;
    }

    public HashMap<Integer, String> getStudents() {
        return students;
    }

    public void setStudents(HashMap<Integer, String> students) {
        this.students = students;
    }

    public void loopCollections() {
        System.out.println("---------------------------------");
        for (String book : books) {
            System.out.println(book);
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            Integer key = student.getKey();
            String value = student.getValue();
            System.out.println("N°: " + key + "\nStudent: " + value);
        }
    }
}
