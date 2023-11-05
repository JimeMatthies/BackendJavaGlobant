/*
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
° todos los alojamientos.
° todos los hoteles de más caro a más barato.
° todos los campings con restaurante
° todos las residencias que tienen descuento.
@author JimeM
 */
package services;

import entities.Accommodation;
import entities.Camping;
import entities.Hotel;
import entities.Residence;
import java.util.ArrayList;
import java.util.List;

public class AccommodationService {
    
    public void showAccommodations(List<Accommodation> accommodations){
        for (Accommodation aa : accommodations) {
            System.out.println(aa.toString());
        }
    }
    
    public List<Accommodation> hotelsOrderByPriceDesc(List<Accommodation> accommodations) {
        List<Accommodation> result = new ArrayList();
        for (Accommodation aa : accommodations) {
            if (aa instanceof Hotel){
                result.add(aa);
            }
        }
        result.sort(
                (o1, o2) -> ((Hotel)o2).getRoomPrice().compareTo(((Hotel)o1).getRoomPrice())
        );
        return result;
    }

    public List<Accommodation> campingWithRestaurant(List<Accommodation> accommodations) {
        List<Accommodation> result = new ArrayList();
        for (Accommodation aa : accommodations) {
            if (aa instanceof Camping && ((Camping) aa).getHasRestaurant()){
                result.add(aa);
            }
        }
        return result;
    }

    public List<Accommodation> residenceWithDsct(List<Accommodation> accommodations) {
        List<Accommodation> result = new ArrayList();
        for (Accommodation aa : accommodations) {
            if (aa instanceof Residence && ((Residence)aa).getHasUnionDiscount()){
                result.add(aa);
            }
        }
        return result;
    }
}
