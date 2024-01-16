/*
Guia 18 = Aplicación Biblioteca Spring API y Test
@author JimeM
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;

    public List<Libro> getLibros() {
        List<Libro> libros = new ArrayList();
        libros = libroRepositorio.findAll();
        return libros;
    }

    public Libro saveLibro(Libro libro) {
        return libroRepositorio.save(libro);
    }

    public Optional<Libro> getLibroByIsbn(Long isbn) {
        return libroRepositorio.findById(isbn);
    }

    public Libro updateLibroByIsbn(Libro request, Long isbn) {
        Libro libro = libroRepositorio.findById(isbn).get();
        libro.setTitulo(request.getTitulo());
        libro.setEjemplares(request.getEjemplares());
        libro.setAutor(request.getAutor());
        libro.setEditorial(request.getEditorial());
        return libro;
    }
    
    public Boolean deleteLibroById(Long isbn){
        try {
            libroRepositorio.deleteById(isbn);
            return true;       
        } catch (Exception e) {
            return false;
        }
    }
    
}