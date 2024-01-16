/*
Guia 18 = Aplicación Biblioteca Spring API y Test
@author JimeM
 */
package com.egg.biblioteca;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import com.egg.biblioteca.servicios.AutorServicio;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class BibliotecaApIwithTestApplicationTests {

    @Autowired
    private AutorServicio autorServicio;
    
    @MockBean
    private AutorRepositorio autorRepositorio;

    @Test
    public void deberiaCrearAutor() { 
// Configuración del mock
        when(autorRepositorio.save(any(Autor.class)))
                .thenAnswer(invocation -> {
                    Autor autor = invocation.getArgument(0);
                    autor.setId("1");
                    return autor;
                });
// Ejecución de la lógica de la clase de servicio
        Autor autor = new Autor("John Doe");
        Autor autorCreado = autorServicio.saveAutor(autor);
// Verificación de resultados
        assertNotNull(autorCreado.getId());
        assertEquals("John Doe", autorCreado.getNombre());
    }

    @Test
    public void deberiaBuscarAutorPorId() {
// Configuración del mock
        String autorId = "1";
        Autor autor = new Autor("Jane Doe");
        when(autorRepositorio.findById(autorId)).thenReturn(Optional.of(autor));
// Ejecución de la lógica de la clase de servicio
        Optional<Autor> autorEncontrado = autorServicio.getAutorById(autorId);
// Verificación de resultados
        assertTrue(autorEncontrado.isPresent());
        assertEquals("Jane Doe", autorEncontrado.get().getNombre());
    }

}