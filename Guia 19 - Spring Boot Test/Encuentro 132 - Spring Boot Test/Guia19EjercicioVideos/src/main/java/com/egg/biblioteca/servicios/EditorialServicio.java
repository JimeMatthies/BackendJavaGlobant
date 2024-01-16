/*
Guia 18 = Aplicación Biblioteca Spring API y Test
@author JimeM
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServicio {

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    public List<Editorial> getEditoriales() {
        List<Editorial> editoriales = new ArrayList();
        editoriales = editorialRepositorio.findAll();
        return editoriales;
    }

    public Editorial saveEditorial(Editorial editorial) {
        return editorialRepositorio.save(editorial);
    }

    public Optional<Editorial> getEditorialById(String id) {
        return editorialRepositorio.findById(id);
    }

    public Editorial updateEditorialById(Editorial request, String id) {
        Editorial editorial = editorialRepositorio.findById(id).get();
        editorial.setNombre(request.getNombre());
        return editorial;
    }
    
    public Boolean deleteEditorialById(String id){
        try {
            editorialRepositorio.deleteById(id);
            return true;       
        } catch (Exception e) {
            return false;
        }
    }
    
}