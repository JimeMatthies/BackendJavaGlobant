/*
Guia 12 = Aplicacion Hoteles (Videos 1-2)
@author JimeM
 */
package entities;

public class Hotel {
    
    protected Integer amountOfRooms;

    public Hotel(Integer amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }

    public Integer getAmountOfRooms() {
        return amountOfRooms;
    }

    public void setAmountOfRooms(Integer amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }

}
