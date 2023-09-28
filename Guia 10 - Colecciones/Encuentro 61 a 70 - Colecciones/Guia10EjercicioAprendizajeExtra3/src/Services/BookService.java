/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos repetidos. Para ello, se debe 
crear una clase llamada Libro que guarde la información de cada uno de los libros de una Biblioteca.
La clase Libro debe guardar el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
° Constructor por defecto.
° Constructor con parámetros.
° Métodos Setters/getters
° Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
° Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
° Método toString para mostrar los datos de los libros.
@author JimeM
 */
package Services;

import Entity.Book;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class BookService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private final HashSet<Book> books;

    public BookService() {
        this.books = new HashSet();
    }

    public Book createBook() {
        System.out.println("---------------------------------");
        System.out.println("Book's title:");
        String title = SC.next();
        title = title.toUpperCase();
        System.out.println("Book's author:");
        String author = SC.next();
        author = author.toUpperCase();
        System.out.println("Books's number of copies:");
        Integer copies = SC.nextInt();
        System.out.println("Books's number of copies lent:");
        Integer lent = SC.nextInt();

        return new Book(title, author, copies, lent);
    }

    public void addBook(Book bb) {
        books.add(bb);
    }

    public void createBooks() {
        String answer = "";
        do {
            addBook(createBook());
            System.out.println("Do you want to add another book? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
    }

    public void showBook(Book bb) {
        System.out.println("---------------------------------");
        System.out.println("Book's info: ");
        System.out.println("Title: " + bb.getTitle());
        System.out.println("Author: " + bb.getAuthor());
        System.out.println("N° of copies: " + bb.getCopies());
        System.out.println("N° of copies lent: " + bb.getLent());
    }

    public void showBooks() {
        System.out.println("---------------------------------");
        System.out.println("Books from List:");
        for (Book bb : books) {
            System.out.println(bb.toString());
        }
        System.out.println("Number of books = " + books.size());
    }

    public boolean loanBook() {
        System.out.println("Which book do you want to loan?");
        Book searchedBook = searchBook(SC.next().toUpperCase());
        if (searchedBook != null) {
            if (searchedBook.getCopies() > searchedBook.getLent()) {
                searchedBook.setLent(searchedBook.getLent() + 1);
                System.out.println("Book Lended");
                return true;
            } else {
                System.out.println("There are not enough copies of this book to loan");
                return false;
            }
        }
        return false;
    }

    public boolean returnBook() {
        System.out.println("Wich book do you want to return?");
        Book searchedBook = searchBook(SC.next().toUpperCase());
        if (searchedBook != null) {
            if (searchedBook.getLent() > 0) {
                searchedBook.setLent(searchedBook.getLent() - 1);
                System.out.println("Book returned");
                return true;
            } else {
                System.out.println("There is no lend copies of this book");
                return false;
            }
        }
        return false;
    }

    public Book searchBook(String title) {
        for (Book bb : books) {
            if (bb.getTitle().equals(title)) {
                return bb;
            }
        }
        return null;
    }

}
