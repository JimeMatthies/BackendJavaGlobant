/*
Guia 10 = Ejemplos dentro de la guía.
@author JimeM
 */
package Entity;

import java.util.Comparator;

public class Book {
    
    private int ISBN;
    private String Title;
    private String Author;

    public Book() {
    }

    public Book(int ISBN, String Title, String Author) {
        this.ISBN = ISBN;
        this.Title = Title;
        this.Author = Author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", Title=" + Title + ", Author=" + Author + '}';
    }
    
    public static Comparator<Book> compareTitle = new Comparator<Book>(){
        @Override
        public int compare(Book b1, Book b2){
            return b2.getTitle().compareTo(b1.getTitle());
        }
    };
}
