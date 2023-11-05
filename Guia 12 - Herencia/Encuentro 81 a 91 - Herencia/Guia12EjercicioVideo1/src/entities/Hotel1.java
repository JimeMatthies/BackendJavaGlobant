/*
Guia 12 = Aplicacion Hoteles (Videos 1-2)
@author JimeM
 */
package entities;

public class Hotel1 extends Hotel {

    protected Double price;
    protected Double size;
    protected boolean bathroom = true;
    protected boolean elevator = true;
    protected boolean heating = true;

    public Hotel1(Double price, Double size, Integer amountOfRooms) {
        super(amountOfRooms);
        this.price = price;
        this.size = size;
    }
    
}