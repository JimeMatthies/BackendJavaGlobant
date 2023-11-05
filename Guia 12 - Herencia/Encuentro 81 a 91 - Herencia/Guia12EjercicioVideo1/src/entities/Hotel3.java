/*
Guia 12 = Aplicacion Hoteles (Videos 1-2)
@author JimeM
 */
package entities;

public class Hotel3 extends Hotel2 {

    protected boolean airConditioner = true;
    protected boolean bar = true;

    public Hotel3(Double price, Double size, Integer amountOfRooms) {
        super(price, size, amountOfRooms);
    }

}
