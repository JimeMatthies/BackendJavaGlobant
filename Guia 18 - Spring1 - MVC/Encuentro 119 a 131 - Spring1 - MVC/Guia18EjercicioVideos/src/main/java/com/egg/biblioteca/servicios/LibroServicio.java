/*
Guia 18 = Aplicación Biblioteca Spring (Videos 1-14)
@author JimeM
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import com.egg.biblioteca.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    @Autowired
    private LibroRepositorio libroRepositorio;

    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException {
        validarLibro(isbn, titulo, ejemplares, idAutor, idEditorial);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
        }
        if (respuestaEditorial.isPresent()) {
            editorial = respuestaEditorial.get();
        }
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAlta(new Date());
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libroRepositorio.save(libro);
    }

    @Transactional(readOnly = true)
    public Libro listarLibro(Long isbn) {
        Optional<Libro> respuestaLibro = libroRepositorio.findById(isbn);
        Libro libro = new Libro();
        if (respuestaLibro.isPresent()) {
            libro = respuestaLibro.get();
        }
        return libro;
    }

    @Transactional(readOnly = true)
    public List<Libro> listarLibros() {
        List<Libro> libros = new ArrayList();
        libros = libroRepositorio.findAll();
        return libros;
    }

    @Transactional
    public void modificarLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException {
        validarLibro(isbn, titulo, ejemplares, idAutor, idEditorial);
        Optional<Libro> respuestaLibro = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
        }
        if (respuestaEditorial.isPresent()) {
            editorial = respuestaEditorial.get();
        }
        if (respuestaLibro.isPresent()) {
            Libro libro = respuestaLibro.get();
            libro.setTitulo(titulo);
            libro.setEjemplares(ejemplares);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libroRepositorio.save(libro);
        }
    }

    @Transactional
    public void eliminar(Long isbn) throws MiException {
        if (isbn == null) {
            throw new MiException("El ISBN no puede estar vacío");
        }
        Libro libro = libroRepositorio.getById(isbn);
        libroRepositorio.delete(libro);
    }

    private void validarLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException {
        if (isbn == null) {
            throw new MiException("El isbn no puede ser nulo");
        }
        if (titulo == null || titulo.isEmpty()) {
            throw new MiException("El título no puede estar vacío o ser nulo");
        }
        if (ejemplares == null) {
            throw new MiException("Los ejemplares no pueden ser nulo");
        }
        if (idAutor == null || idAutor.isEmpty()) {
            throw new MiException("El ID del autor no puede estar vacío o ser nulo");
        }
        if (idEditorial == null || idEditorial.isEmpty()) {
            throw new MiException("El ID del editorial no puede estar vacío o ser nulo");
        }
    }

}
