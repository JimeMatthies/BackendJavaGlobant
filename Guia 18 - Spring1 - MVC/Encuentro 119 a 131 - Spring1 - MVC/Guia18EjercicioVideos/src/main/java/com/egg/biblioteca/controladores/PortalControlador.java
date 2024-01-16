/*
Guia 18 = Aplicación Biblioteca Spring (Videos 1-14)
@author JimeM
 */
package com.egg.biblioteca.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador {
    
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
    
}