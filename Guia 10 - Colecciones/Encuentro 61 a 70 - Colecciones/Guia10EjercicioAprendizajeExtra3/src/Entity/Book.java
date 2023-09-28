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
package Entity;

import java.util.Objects;

public class Book {
    
    private String title;
    private String author;
    private Integer copies;
    private Integer lent;

    public Book() {
    }

    public Book(String title, String author, Integer copies, Integer lent) {
        this.title = title.toUpperCase();
        this.author = author.toUpperCase();
        this.copies = copies;
        this.lent = lent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Integer getLent() {
        return lent;
    }

    public void setLent(Integer lent) {
        this.lent = lent;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.title);
        hash = 53 * hash + Objects.hashCode(this.author);
        hash = 53 * hash + Objects.hashCode(this.copies);
        hash = 53 * hash + Objects.hashCode(this.lent);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.copies, other.copies)) {
            return false;
        }
        if (!Objects.equals(this.lent, other.lent)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", copies=" + copies + ", lent=" + lent + '}';
    }

}
