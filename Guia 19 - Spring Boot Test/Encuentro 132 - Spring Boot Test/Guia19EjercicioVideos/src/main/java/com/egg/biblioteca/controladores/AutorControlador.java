/*
Guia 18 = Aplicación Biblioteca Spring API y Test
@author JimeM
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.servicios.AutorServicio;
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
@RequestMapping("/api/autores") //localhost:8080/api/autor
public class AutorControlador {

    @Autowired
    private AutorServicio autorServicio;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Autor> getAutores() {
        return autorServicio.getAutores();
    }
    
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Autor saveAutor(@RequestBody Autor autor){
        return autorServicio.saveAutor(autor);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Autor> getAutorByID(@PathVariable("id") String id) {
        return autorServicio.getAutorById(id);
    }
    
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Autor updateAutorById(@RequestBody Autor autor, @PathVariable("id") String id){
        return autorServicio.updateAutorById(autor, id);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteAutorById(@PathVariable("id") String id){
        boolean ok = autorServicio.deleteAutorById(id);  
        if(ok){
            return "Autor con id " + id + " eliminado";
        } else {
            return "Error, no se pudo eliminar el autor con el id " + id;
        }
    }

}