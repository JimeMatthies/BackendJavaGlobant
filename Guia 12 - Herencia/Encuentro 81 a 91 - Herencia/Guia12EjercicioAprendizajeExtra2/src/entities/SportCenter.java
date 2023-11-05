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

import enums.InstallationType;

public class SportCenter extends Building {
    
    private String name;
    private InstallationType type;

    public SportCenter() {
    }

    public SportCenter(String name, InstallationType type, Integer height, Integer width, Integer length) {
        super(height, width, length);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstallationType getType() {
        return type;
    }

    public void setType(InstallationType type) {
        this.type = type;
    }

    @Override
    public Integer calculateSurface() {
        Integer surface = this.height * this.width * 2 + this.height * this.length * 2;
        if (this.type.equals(InstallationType.ARENA)) surface += this.width * this.length;
        return surface;
    }

    @Override
    public Integer calculateVolume() {
        return this.height * this.width * this.length;
    }

    @Override
    public String toString() {
        return "SportCenter{" + "height=" + height + ", width=" + width + ", length=" + length + "name=" + name + ", type=" + type + '}';
    }
    
}
