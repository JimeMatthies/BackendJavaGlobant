/*
Guia 8 = App Sueldo y Antiguedad (Video 10)
@author JimeM
 */
package Entidades;

import java.util.Date;

public class Vendedor {
    private String nombre;
    private int rut;
    private double sueldoBase;
    private double comisiones;
    private double sueldoMensual;
    private Date fechainicio;
    
    public Vendedor(){  
    }

    public Vendedor(String nombre, int rut, double sueldoBase, double comisiones, double sueldoMensual, Date fechainicio) {
        this.nombre = nombre;
        this.rut = rut;
        this.sueldoBase = sueldoBase;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechainicio = fechainicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", rut=" + rut + ", sueldoBase=" + sueldoBase + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechainicio=" + fechainicio + '}';
    }

}
