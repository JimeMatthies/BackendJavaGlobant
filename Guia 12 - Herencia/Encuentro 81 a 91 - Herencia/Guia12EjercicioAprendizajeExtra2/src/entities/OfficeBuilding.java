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

public class OfficeBuilding extends Building {

    private Integer offices;
    private Integer peopleInOffices;
    private Integer floors;

    public OfficeBuilding() {
    }

    public OfficeBuilding(Integer offices, Integer peopleInOffices, Integer floors, Integer height, Integer width, Integer length) {
        super(height, width, length);
        this.offices = offices;
        this.peopleInOffices = peopleInOffices;
        this.floors = floors;
    }

    public Integer getOffices() {
        return offices;
    }

    public void setOffices(Integer offices) {
        this.offices = offices;
    }

    public Integer getPeopleInOffices() {
        return peopleInOffices;
    }

    public void setPeopleInOffices(Integer peopleInOffices) {
        this.peopleInOffices = peopleInOffices;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public void amountPeople() {
        System.out.println("The amount of people per floor is = " + this.peopleInOffices + " people.");
        System.out.println("The amount of people in the building is = " + (this.peopleInOffices * this.offices) + " people.");
    }

    @Override
    public Integer calculateSurface() {
        return this.height * this.width * 2 + this.height * this.length * 2 + this.width * this.length;
    }

    @Override
    public Integer calculateVolume() {
        return this.height * this.width * this.length;
    }

    @Override
    public String toString() {
        return "OfficeBuilding{" + "height=" + height + ", width=" + width + ", length=" + length + "offices=" + offices + ", peopleInOffices=" + peopleInOffices + ", floors=" + floors + '}';
    }

}
