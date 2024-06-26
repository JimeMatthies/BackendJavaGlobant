/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo.
La clase edificio tendrá como métodos:
° Método calcularSuperficie(): calcula la superficie del edificio.
° Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
° Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o Abierto, 
esta clase implementará los dos métodos abstractos y los atributos del padre.
° Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas por oficina y número de pisos. 
Esta clase implementará los dos métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el usuario dirá cuántas personas 
entran en cada oficina, cuantas oficinas y el número de piso (suponiendo que en cada piso hay una oficina). 
Crear el método cantPersonas(), que muestre cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener dos polideportivos y 
dos edificios de oficinas. Luego, recorrer este array y ejecutar los métodos calcularSuperficie y calcularVolumen 
en cada Edificio. Se deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son techados y cuantos abiertos. 
Y para la clase EdificioDeOficinas deberemos llamar al método cantPersonas() y mostrar los resultados de cada edificio 
de oficinas.
@author JimeM
 */
package entities;

public abstract class Building {
    
    protected Integer height;
    protected Integer width;
       protected Integer length;

    public Building() {
    }

    public Building(Integer height, Integer width, Integer length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public abstract Integer calculateSurface();

    public abstract Integer calculateVolume();

    @Override
    public String toString() {
        return "Building{" + "height=" + height + ", width=" + width + ", length=" + length + '}';
    }

}
