/*
Guia 12 = Aplicacion Hoteles (Videos 1-2)
@author JimeM
 */
package entities;

public final class Hotel5 extends Hotel4 {

    protected boolean casino = true;
    protected boolean restaurant = true;

    public Hotel5(Double price, Double size, Integer amountOfRooms) {
        super(price, size, amountOfRooms);
    }

}