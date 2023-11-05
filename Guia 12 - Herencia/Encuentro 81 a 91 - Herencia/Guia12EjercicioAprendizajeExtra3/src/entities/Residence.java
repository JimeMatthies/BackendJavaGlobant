/*
Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios 
y si posee o no campo deportivo.
@author JimeM
 */
package entities;

public class Residence extends ExtraHotelAccommodation {

    private Integer numberOfRooms;
    private Boolean hasUnionDiscount;
    private Boolean hasSportsField;

    public Residence() {
    }

    public Residence(Integer numberOfRooms, Boolean hasUnionDiscount, Boolean hasSportsField, Boolean isPrivate, Integer area, String name, String address, String location, String manager) {
        super(isPrivate, area, name, address, location, manager);
        this.numberOfRooms = numberOfRooms;
        this.hasUnionDiscount = hasUnionDiscount;
        this.hasSportsField = hasSportsField;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Boolean getHasUnionDiscount() {
        return hasUnionDiscount;
    }

    public void setHasUnionDiscount(Boolean hasUnionDiscount) {
        this.hasUnionDiscount = hasUnionDiscount;
    }

    public Boolean getHasSportsField() {
        return hasSportsField;
    }

    public void setHasSportsField(Boolean hasSportsField) {
        this.hasSportsField = hasSportsField;
    }

    @Override
    public String toString() {
        return "Residence{" + "name=" + name + ", address=" + address + ", location=" + location + ", manager=" + manager + "isPrivate=" + isPrivate + ", area=" + area + "numberOfRooms=" + numberOfRooms + ", hasUnionDiscount=" + hasUnionDiscount + ", hasSportsField=" + hasSportsField + '}';
    }
    
}
