/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Realizar un programa en el que se representen todas las relaciones descriptas.
@author JimeM
 */
package guia12ejercicioaprendizajeextra3;

import entities.Accommodation;
import entities.Camping;
import entities.Hotel4Stars;
import entities.Hotel5Stars;
import entities.Residence;
import java.util.ArrayList;
import java.util.List;
import services.AccommodationService;

public class Guia12EjercicioAprendizajeExtra3 {

    public static void main(String[] args) {
        
        List<Accommodation> accommodations = new ArrayList();
        accommodations.add(new Hotel4Stars('B', "El Cid", 100, 400, 525, 20, 0, "Sheraton", "Av. Sta. María 1742", "Santiago", "O. Madrid"));
        accommodations.add(new Hotel5Stars(11 , 10, 20, 'A', "W", 120, 450, 550, 25, 0, "Marriott", "Av. Pdte. Kennedy 5741", "Santiago", "J.Matthies"));
        accommodations.add(new Camping(50, 10, true, true, 1000, "Molco", "Molco 45", "Villarica", "R.Carrera"));
        accommodations.add(new Residence(10, true, false, true, 500, "La antigua", "Av Grecia 2815", "Ñuñoa", "K. Cancino"));

        AccommodationService as = new AccommodationService();
        as.showAccommodations(accommodations);
        as.showAccommodations(as.hotelsOrderByPriceDesc(accommodations));
        as.showAccommodations(as.campingWithRestaurant(accommodations));
        as.showAccommodations(as.residenceWithDsct(accommodations));
    }
    
}
