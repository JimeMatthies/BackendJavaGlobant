/*
Guia 18 = Aplicación Biblioteca Spring (Videos 1-14)
@author JimeM
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Transactional
    public void crearAutor(String nombre) throws MiException {
        if (nombre == null || nombre.isEmpty()) {
            throw new MiException("El nombre no puede estar vacío o ser nulo");
        }
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autorRepositorio.save(autor);
    }

    @Transactional(readOnly = true)
    public Autor getOne(String id) {
        return autorRepositorio.getOne(id);
    }

    @Transactional(readOnly = true)
    public Autor listarAutor(String id) {
        Optional<Autor> respuestaAutor = autorRepositorio.findById(id);
        Autor autor = new Autor();
        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
        }
        return autor;
    }

    @Transactional(readOnly = true)
    public List<Autor> listarAutores() {
        List<Autor> autores = new ArrayList();
        autores = autorRepositorio.findAll();
        return autores;
    }

    @Transactional
    public void modificarAutor(String id, String nombre) throws MiException {
        if (id == null || id.isEmpty()) {
            throw new MiException("El ID no puede estar vacío o ser nulo");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new MiException("El nombre no puede estar vacío o ser nulo");
        }
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autorRepositorio.save(autor);
        }
    }

    @Transactional
    public void eliminar(String id) throws MiException {
        if (id == null || id.isEmpty()) {
            throw new MiException("El ID no puede estar vacío o ser nulo");
        }
        Autor autor = autorRepositorio.getById(id);
        autorRepositorio.delete(autor);
    }

}
