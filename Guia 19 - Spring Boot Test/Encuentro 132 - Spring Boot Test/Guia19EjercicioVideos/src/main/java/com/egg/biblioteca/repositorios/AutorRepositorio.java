/*
Guia 18 = Aplicación Biblioteca Spring API y Test
@author JimeM
 */
package com.egg.biblioteca.repositorios;

import com.egg.biblioteca.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String> {
    
}