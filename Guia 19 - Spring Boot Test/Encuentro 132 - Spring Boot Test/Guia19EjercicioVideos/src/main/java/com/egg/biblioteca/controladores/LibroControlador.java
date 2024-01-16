/*
Guia 18 = Aplicación Biblioteca Spring API y Test
@author JimeM
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.servicios.LibroServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/libros") //localhost:8080/api/libros
public class LibroControlador {

    @Autowired
    private LibroServicio libroServicio;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Libro> getAutores() {
        return libroServicio.getLibros();
    }
    
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Libro saveLibro(@RequestBody Libro libro){
        return libroServicio.saveLibro(libro);
    }

    @GetMapping("/{isbn}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Libro> getLibroByID(@PathVariable("isbn") Long isbn) {
        return libroServicio.getLibroByIsbn(isbn);
    }
    
    @PutMapping("/{isbn}")
    @ResponseStatus(HttpStatus.OK)
    public Libro updateLibroById(@RequestBody Libro libro, @PathVariable("isbn") Long isbn){
        return libroServicio.updateLibroByIsbn(libro, isbn);
    }
    
    @DeleteMapping("/{isbn}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLibroById(@PathVariable("isbn") Long isbn){
        boolean ok = libroServicio.deleteLibroById(isbn);  
        if(ok){
            return "Libro con isbn " + isbn + " eliminado";
        } else {
            return "Error, no se pudo eliminar el libro con el isbn " + isbn;
        }
    }

}