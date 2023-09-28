/*
Guia 10 = Ejemplos dentro de la guía.
@author JimeM
 */
package Services;

import Entity.Book;
import java.util.Scanner;

public class BookService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Book createBook() {
        System.out.println("---------------------------------");
        System.out.println("Book's ISBN:");
        int ISBN = SC.nextInt();
        System.out.println("Book's title:");
        String title = SC.next();
        System.out.println("Book's author:");
        String author = SC.next();

        return new Book(ISBN, title, author);
    }

    public void showBook(Book bb) {
        System.out.println("---------------------------------");
        System.out.println("Book's info: ");
        System.out.println("ISBN: " + bb.getISBN());
        System.out.println("Title: " + bb.getTitle());
        System.out.println("Author: " + bb.getAuthor());
    }
}
