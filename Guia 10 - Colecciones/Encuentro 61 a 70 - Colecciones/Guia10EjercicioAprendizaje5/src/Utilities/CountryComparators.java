/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
@author JimeM
 */
package Utilities;

import Entity.Country;
import java.util.Comparator;

public class CountryComparators {

    public static Comparator<Country> orderByNameAsc = new Comparator<Country>() {
        @Override
        public int compare(Country c1, Country c2) {
            return c1.getName().compareTo(c2.getName());
        }
    };

    public static Comparator<Country> orderByNameDesc = new Comparator<Country>() {
        @Override
        public int compare(Country c1, Country c2) {
            return c2.getName().compareTo(c1.getName());
        }
    };

}
