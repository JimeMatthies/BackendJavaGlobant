/*
Guia 18 = Aplicación Biblioteca Spring API y Test
@author JimeM
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.servicios.EditorialServicio;
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
@RequestMapping("/api/editoriales") //localhost:8080/api/editoriales
public class EditorialControlador {

    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Editorial> getEditoriales() {
        return editorialServicio.getEditoriales();
    }
    
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Editorial saveEditorial(@RequestBody Editorial editorial){
        return editorialServicio.saveEditorial(editorial);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Editorial> getEditorialByID(@PathVariable("id") String id) {
        return editorialServicio.getEditorialById(id);
    }
    
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Editorial updateEditorialById(@RequestBody Editorial editorial, @PathVariable("id") String id){
        return editorialServicio.updateEditorialById(editorial, id);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteEditorialById(@PathVariable("id") String id){
        boolean ok = editorialServicio.deleteEditorialById(id);  
        if(ok){
            return "Editorial con id " + id + " eliminado";
        } else {
            return "Error, no se pudo eliminar la editorial con el id " + id;
        }
    }

}