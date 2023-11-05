/*
Las características de las distintas categorías son las siguientes:
Hotel 5 estrellas: Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, Nombre del Restaurante, 
Capacidad del Restaurante, Cantidad Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, 
Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de acuerdo a las prestaciones 
observadas. Las limosinas están disponibles para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto 
más limosinas tenga el hotel, más caro será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor agregado por gimnasio) 
+ (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
° $10 si la capacidad del restaurante es de menos de 30 personas.
° $30 si está entre 30 y 50 personas.
° $50 si es mayor de 50.
Valor agregado por el gimnasio:
° $50 si el tipo del gimnasio es A.
° $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
° $15 por la cantidad de limosinas del hotel.
@author JimeM
 */
package entities;

public final class Hotel5Stars extends Hotel4Stars {

    private Integer conferenceRooms;
    private Integer suites;
    private Integer limos;

    public Hotel5Stars() {
    }

    public Hotel5Stars(Integer conferenceRooms, Integer suites, Integer limos, Character gym, String restaurantsName, Integer restaurantsCapacity, Integer numberOfRooms, Integer numberOfBeds, Integer floors, Integer roomPrice, String name, String address, String location, String manager) {
        super(gym, restaurantsName, restaurantsCapacity, numberOfRooms, numberOfBeds, floors, roomPrice, name, address, location, manager);
        this.conferenceRooms = conferenceRooms;
        this.suites = suites;
        this.limos = limos;
    }

    public Integer getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(Integer conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimos() {
        return limos;
    }

    public void setLimos(Integer limos) {
        this.limos = limos;
    }

    @Override
    public void totalRoomPrice() {
        super.totalRoomPrice();
        this.roomPrice += this.limos * 15;
    }

    @Override
    public String toString() {
        return "Hotel5Stars{" + "name=" + name + ", address=" + address + ", location=" + location + ", manager=" + manager + "numberOfRooms=" + numberOfRooms + ", numberOfBeds=" + numberOfBeds + ", floors=" + floors + ", roomPrice=" + roomPrice + "gym=" + gym + ", restaurantsName=" + restaurantsName + ", restaurantsCapacity=" + restaurantsCapacity + "conferenceRooms=" + conferenceRooms + ", suites=" + suites + ", limos=" + limos + '}';
    }

}
