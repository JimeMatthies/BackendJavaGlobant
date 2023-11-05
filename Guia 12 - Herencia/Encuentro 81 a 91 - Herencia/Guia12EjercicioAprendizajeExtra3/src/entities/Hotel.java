/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.
@author JimeM
 */
package entities;

public class Hotel extends Accommodation {

    protected Integer numberOfRooms;
    protected Integer numberOfBeds;
    protected Integer floors;
    protected Integer roomPrice;

    public Hotel() {
    }

    public Hotel(Integer numberOfRooms, Integer numberOfBeds, Integer floors, Integer roomPrice, String name, String address, String location, String manager) {
        super(name, address, location, manager);
        this.numberOfRooms = numberOfRooms;
        this.numberOfBeds = numberOfBeds;
        this.floors = floors;
        this.roomPrice = roomPrice;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Integer roomPrice) {
        this.roomPrice = roomPrice;
    }

    public void totalRoomPrice() {
        this.roomPrice = 50 + this.numberOfBeds;
    }
    
    @Override
    public String toString() {
        return "Hotel{" + "name=" + name + ", address=" + address + ", location=" + location + ", manager=" + manager + "numberOfRooms=" + numberOfRooms + ", numberOfBeds=" + numberOfBeds + ", floors=" + floors + ", roomPrice=" + roomPrice + '}';
    }
     
}
