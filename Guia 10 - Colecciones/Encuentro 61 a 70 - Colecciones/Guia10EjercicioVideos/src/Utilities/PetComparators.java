/*
Guia 10 = Aplicación Mascotas Conjuntos (Videos 1 - 8)
@author JimeM
 */
package Utilities;

import Entity.Pet;
import java.util.Comparator;

public class PetComparators {
    
    public static Comparator<Pet> orderByNameDesc = new Comparator<Pet>() {
        @Override
        public int compare(Pet p1, Pet p2) {
            return p2.getName().compareTo(p1.getName());
        }
    };
    
    public static Comparator<Pet> orderByAgeDesc = new Comparator<Pet>() {
        @Override
        public int compare(Pet p1, Pet p2) {
            return p2.getAge().compareTo(p1.getAge());
        }
    };
            
}
