/*
Guia 10 = Ejemplos dentro de la guía.
@author JimeM
 */
package guia10ejemplos;

import Entity.Book;
import Services.BookService;
import java.util.*;

public class Guia10Ejemplos {

    public static void main(String[] args) {
        //List:
        ArrayList<Integer> numbersA = new ArrayList();
        int x = 20;
        numbersA.add(x); //Add num 20 to numbersA List at position 0.

        //Set:
        HashSet<Integer> numbersB = new HashSet();
        int y = 30;
        numbersB.add(y);

        //Map:
        HashMap<Integer, String> students = new HashMap();
        int dni = 166247985;
        String studentName = "Jime Matthies";
        students.put(dni, studentName); //Add key and value.

        //Add 5 elements to each:
        int a = 21;
        numbersA.add(a);
        int b = 22;
        numbersA.add(b);
        int c = 23;
        numbersA.add(c);
        int d = 24;
        numbersA.add(d);
        int e = 25;
        numbersA.add(e);

        int f = 31;
        numbersB.add(f);
        int g = 32;
        numbersB.add(g);
        int h = 33;
        numbersB.add(h);
        int i = 34;
        numbersB.add(i);
        int j = 35;
        numbersB.add(j);

        int dni1 = 123456789;
        String studentName1 = "Rosa Carrera";
        students.put(dni1, studentName1);
        int dni2 = 234567891;
        String studentName2 = "Ana Watson";
        students.put(dni2, studentName2);
        int dni3 = 345678912;
        String studentName3 = "Maria Mendez";
        students.put(dni3, studentName3);
        int dni4 = 456789123;
        String studentName4 = "Mijael Matus";
        students.put(dni4, studentName4);
        int dni5 = 567891234;
        String studentName5 = "Rodrigo Santillan";
        students.put(dni5, studentName5);

        //Remove an item from each group.
        numbersA.remove(0);
        numbersB.remove(y);
        students.remove(567891234);

        //List:
        for (Integer number : numbersA) {
            System.out.println(number);
        }
        //Set:
        for (Integer number : numbersB) {
            System.out.println(number);
        }
        //Map:
        //Both elements:
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("DNI: " + student.getKey());
            System.out.println("Student name: " + student.getValue());
        }
        //Just keys:
        for (Integer studentdni : students.keySet()) {
            System.out.println("DNI: " + studentdni);
        }
        //Just names:
        for (String studentname : students.values()) {
            System.out.println("Student name: " + studentname);
        }

        //Iterator
        ArrayList<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        Iterator it = list.iterator();
        System.out.println("Elements:");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        //Remove with iterator
        //List:
        ArrayList<String> words = new ArrayList();
        Iterator<String> it2 = words.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals("Hola")) {
                it2.remove();
            }
        }
        //Set:
        HashSet<Integer> numbersC = new HashSet();
        Iterator<Integer> it3 = numbersC.iterator();
        while (it3.hasNext()) {
            if (it3.next() == 3) {
                it3.remove();
            }
        }

        //Sort List:
        ArrayList<Integer> numbersD = new ArrayList();
        Collections.sort(numbersD);
        //Sort Set (TreeSet sorts itself):
        HashSet<Integer> numbersESet = new HashSet();
        ArrayList<Integer> numbersEList = new ArrayList(numbersESet); //Set -> List to sort
        Collections.sort(numbersEList);
        //Sort Map (TreeMap sorts itself):
        HashMap<Integer, String> studentsA = new HashMap();
        TreeMap<Integer, String> studentsATree = new TreeMap(studentsA);

        //Books example:
        BookService bs = new BookService();
        ArrayList<Book> library = new ArrayList();
        Book book1 = new Book(12345, "Game of Thrones", "George R. R. Martin");
        Book book2 = new Book(12346, "Harry Potter", "J.K. Rowliing");
        library.add(book1);
        library.add(book2);
        for (Book book : library) {
            System.out.println(book.getTitle());
            bs.showBook(book);
        }
        //Comparator:
        library.sort(Book.compareTitle);
    }

}
