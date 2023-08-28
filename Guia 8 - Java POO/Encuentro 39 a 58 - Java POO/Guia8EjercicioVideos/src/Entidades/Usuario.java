/*
Guia 8 = Aplicación Mascotas (Videos 1 - 9)
@author JimeM
 */
package Entidades;

import java.time.LocalDate;

public class Usuario {

    public String nombre;
    public String apellido;
    public String pais;
    public int rut;
    public LocalDate nacimiento;

    public Usuario() {

    }

    public Usuario(String nombre, String apellido, String pais, int rut, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.rut = rut;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais + ", rut=" + rut + ", nacimiento=" + nacimiento + '}';
    }

}
