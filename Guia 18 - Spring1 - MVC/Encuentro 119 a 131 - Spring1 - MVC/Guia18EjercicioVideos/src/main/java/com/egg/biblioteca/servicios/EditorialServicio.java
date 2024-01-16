/*
Guia 18 = Aplicación Biblioteca Spring (Videos 1-14)
@author JimeM
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EditorialServicio {

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearEditorial(String nombre) throws MiException {
        if (nombre == null || nombre.isEmpty()) {
            throw new MiException("El nombre no puede estar vacío o ser nulo");
        }
        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        editorialRepositorio.save(editorial);
    }

    @Transactional(readOnly = true)
    public Editorial listarEditorial(String id) {
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(id);
        Editorial editorial = new Editorial();
        if (respuestaEditorial.isPresent()) {
            editorial = respuestaEditorial.get();
        }
        return editorial;
    }

    @Transactional(readOnly = true)
    public List<Editorial> listarEditoriales() {
        List<Editorial> editoriales = new ArrayList();
        editoriales = editorialRepositorio.findAll();
        return editoriales;
    }

    @Transactional
    public void modificarEditorial(String id, String nombre) throws MiException {
        if (id == null || id.isEmpty()) {
            throw new MiException("El ID no puede estar vacío o ser nulo");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new MiException("El nombre no puede estar vacío o ser nulo");
        }
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);
            editorialRepositorio.save(editorial);
        }
    }

    @Transactional
    public void eliminar(String id) throws MiException {
        if (id == null || id.isEmpty()) {
            throw new MiException("El ID no puede estar vacío o ser nulo");
        }
        Editorial editorial = editorialRepositorio.getById(id);
        editorialRepositorio.delete(editorial);
    }
    
}