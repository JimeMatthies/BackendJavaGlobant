/*
Las características de las distintas categorías son las siguientes:
Hotel 4 estrellas: Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, Nombre del Restaurante, 
Capacidad del Restaurante, Precio de las Habitaciones.
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

public class Hotel4Stars extends Hotel {

    protected Character gym;
    protected String restaurantsName;
    protected Integer restaurantsCapacity;

    public Hotel4Stars() {
    }

    public Hotel4Stars(Character gym, String restaurantsName, Integer restaurantsCapacity, Integer numberOfRooms, Integer numberOfBeds, Integer floors, Integer roomPrice, String name, String address, String location, String manager) {
        super(numberOfRooms, numberOfBeds, floors, roomPrice, name, address, location, manager);
        this.gym = gym;
        this.restaurantsName = restaurantsName;
        this.restaurantsCapacity = restaurantsCapacity;
    }

    public Character getGym() {
        return gym;
    }

    public void setGym(Character gym) {
        this.gym = gym;
    }

    public String getRestaurantsName() {
        return restaurantsName;
    }

    public void setRestaurantsName(String restaurantsName) {
        this.restaurantsName = restaurantsName;
    }

    public Integer getRestaurantsCapacity() {
        return restaurantsCapacity;
    }

    public void setRestaurantsCapacity(Integer restaurantsCapacity) {
        this.restaurantsCapacity = restaurantsCapacity;
    }
    
    @Override
    public void totalRoomPrice() {
        super.totalRoomPrice();
        if (this.restaurantsCapacity < 30) {
            this.roomPrice += 10;
        } else if (this.restaurantsCapacity <= 50) {
            this.roomPrice += 30;
        } else {
            this.roomPrice += 50;
        }
        if (this.gym.equals('A')) this.roomPrice += 50;
        if (this.gym.equals('B')) this.roomPrice += 30;
    }

    @Override
    public String toString() {
        return "Hotel4Stars{" + "name=" + name + ", address=" + address + ", location=" + location + ", manager=" + manager + "numberOfRooms=" + numberOfRooms + ", numberOfBeds=" + numberOfBeds + ", floors=" + floors + ", roomPrice=" + roomPrice + "gym=" + gym + ", restaurantsName=" + restaurantsName + ", restaurantsCapacity=" + restaurantsCapacity + '}';
    } 
    
}
