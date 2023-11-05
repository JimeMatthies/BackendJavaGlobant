/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias.
@author JimeM
 */
package entities;

public class ExtraHotelAccommodation extends Accommodation {

    protected Boolean isPrivate;
    protected Integer area;

    public ExtraHotelAccommodation() {
    }

    public ExtraHotelAccommodation(Boolean isPrivate, Integer area, String name, String address, String location, String manager) {
        super(name, address, location, manager);
        this.isPrivate = isPrivate;
        this.area = area;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "ExtraHotelAccommodation{" + "name=" + name + ", address=" + address + ", location=" + location + ", manager=" + manager + "isPrivate=" + isPrivate + ", area=" + area + '}';
    }
     
}
