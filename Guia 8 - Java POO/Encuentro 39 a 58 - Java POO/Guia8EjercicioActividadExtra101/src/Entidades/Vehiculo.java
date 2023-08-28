/*
Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos 
a indicar si es un automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los 
métodos de moverse y frenar:
° Moverse: Es la cantidad de metros que avanzará por segundo.
° Frenar: Dejará de avanzar y se frenará 2 metros más adelante. 
En el caso de la bicicleta, se frenará y no avanzará más metros.

Referencias: 
° Un automóvil avanza 3 metros por segundo.
° Una motocicleta avanza 2 metros por segundo.
° Una bicicleta avanza 1 metro por segundo

Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es),
y mostrar por pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 
1 minuto. Luego mostrar que vehículo logró llegar más lejos luego de frenar, tras avanzar durante 
5 minutos, y cual fue la cantidad de metros que avanzó.
@author JimeM
 */
package Entidades;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    private int velocidad;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String tipo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Función mover el vehiculo
     * @param seg
     * @return cantidad de metros recorridos.
     */
    public int moverse(int seg) {
        return seg * velocidad;
    }
    
    /**
     * Función frenar el vehículo
     * @return cantidad de metros recorridos.
     */
    public int frenar() {
        if (tipo.equals("Automóvil") || tipo.equals("Motocicleta")) {
            return 2;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", tipo=" + tipo + ", velocidad=" + velocidad + '}';
    }

}
