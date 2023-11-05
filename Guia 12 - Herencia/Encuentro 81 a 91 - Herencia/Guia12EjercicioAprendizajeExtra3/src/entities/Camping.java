/*
Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños disponibles 
y si posee o no un restaurante dentro de las instalaciones.
@author JimeM
 */
package entities;

public class Camping extends ExtraHotelAccommodation {

    private Integer tents;
    private Integer toilets;
    private Boolean hasRestaurant;

    public Camping() {
    }

    public Camping(Integer tents, Integer toilets, Boolean hasRestaurant, Boolean isPrivate, Integer area, String name, String address, String location, String manager) {
        super(isPrivate, area, name, address, location, manager);
        this.tents = tents;
        this.toilets = toilets;
        this.hasRestaurant = hasRestaurant;
    }

    public Integer getTents() {
        return tents;
    }

    public void setTents(Integer tents) {
        this.tents = tents;
    }

    public Integer getToilets() {
        return toilets;
    }

    public void setToilets(Integer toilets) {
        this.toilets = toilets;
    }

    public Boolean getHasRestaurant() {
        return hasRestaurant;
    }

    public void setHasRestaurant(Boolean hasRestaurant) {
        this.hasRestaurant = hasRestaurant;
    }

    @Override
    public String toString() {
        return "Camping{" + "name=" + name + ", address=" + address + ", location=" + location + ", manager=" + manager + "isPrivate=" + isPrivate + ", area=" + area + "tents=" + tents + ", toilets=" + toilets + ", hasRestaurant=" + hasRestaurant + '}';
    }
   
}
