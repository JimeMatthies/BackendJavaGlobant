/*
Guia 8 = Aplicación Mascotas (Videos 1 - 9)
@author JimeM
 */
package guia8ejerciciovideos;

import Entidades.Mascota;
import Entidades.Usuario;
import Servicios.MascotaServicio;
import Servicios.UsuarioServicio;

public class Guia8EjercicioVideos {

    public static void main(String[] args) {

        MascotaServicio ms = new MascotaServicio();
        Mascota m1 = ms.crearMascota();
        ms.mostrarMascota(m1);

        //m1.pasear(100);
        //m1.pasear(100, 4);          
        //m1 = null;
        UsuarioServicio us = new UsuarioServicio();
        Usuario u1 = us.crearUsuario();
        System.out.println(u1);
    }

}