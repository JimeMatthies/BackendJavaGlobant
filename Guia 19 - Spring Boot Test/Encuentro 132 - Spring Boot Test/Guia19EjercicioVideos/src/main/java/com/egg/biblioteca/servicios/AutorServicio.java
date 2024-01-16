/*
Guia 18 = Aplicación Biblioteca Spring API y Test
@author JimeM
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;

    public List<Autor> getAutores() {
        List<Autor> autores = new ArrayList();
        autores = autorRepositorio.findAll();
        return autores;
    }

    public Autor saveAutor(Autor autor) {
        return autorRepositorio.save(autor);
    }

    public Optional<Autor> getAutorById(String id) {
        return autorRepositorio.findById(id);
    }

    public Autor updateAutorById(Autor request, String id) {
        Autor autor = autorRepositorio.findById(id).get();
        autor.setNombre(request.getNombre());
        return autor;
    }
    
    public Boolean deleteAutorById(String id){
        try {
            autorRepositorio.deleteById(id);
            return true;       
        } catch (Exception e) {
            return false;
        }
    }
    
}