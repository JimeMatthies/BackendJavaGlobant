/*
Guia 8 = Aplicación Mascotas (Videos 1 - 9)
@author JimeM
 */
package Entidades;

public class Mascota {

    private String nombre;
    private String apodo;
    private String tipo;
    private String raza;
    private String color;
    private int edad;
    private boolean cola;  
    private int energia;

    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String raza, String color, int edad, boolean cola) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.energia = 1000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
   
    /**
     * Función destinada a pasear 
     * @param energiaRestar
     * @return energia
     */
    
    public int pasear(int energiaRestar){
        energia -= energiaRestar;
        return energia;
    }
    
    /**
     * Función destinada a pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    
    public int pasear(int energiaRestar, int vueltas){
        energia -= (energiaRestar * vueltas);
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", energia=" + energia + '}';
    }

}
