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
package Services;

import Entity.Country;
import Utilities.CountryComparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CountryService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private HashSet<Country> countries;

    public CountryService() {
        this.countries = new HashSet();
    }

    public HashSet<Country> getCountries() {
        return countries;
    }

    public Country createCountry() {
        System.out.println("---------------------------------");
        System.out.println("Country's name:");
        String name = SC.next();
        name = name.toUpperCase();

        return new Country(name);
    }

    public void addCountry(Country cc) {
        countries.add(cc);
    }

    public void createCountries() {
        String answer = "";
        do {
            addCountry(createCountry());
            System.out.println("Do you want to add another country? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
    }

    public void showCountry(Country cc) {
        System.out.println("---------------------------------");
        System.out.println("Country's information: ");
        System.out.println("Name: " + cc.getName());
    }

    public void showCountries() {
        System.out.println("---------------------------------");
        System.out.println("Countries from List:");
        for (Country cc : countries) {
            System.out.println(cc.toString());
        }
        System.out.println("Number of countries = " + countries.size());
    }

    public void orderByNameAsc() {
        ArrayList<Country> countriesList = new ArrayList(countries);
        countriesList.sort(CountryComparators.orderByNameAsc);
        System.out.println("---------------------------------");
        System.out.println("Countries sorted:");
        for (Country cc : countriesList) {
            System.out.println(cc.toString());
        }
        System.out.println("Number of countries = " + countriesList.size());
    }

    public void searchRemoveCountry(String countryName) {
        Iterator<Country> it = countries.iterator();
        boolean removed = false;
        while (it.hasNext()) {
            if (it.next().getName().equals(countryName)) {
                it.remove();
                System.out.println(countryName + " removed");
                removed = true;
            }
        }
        if (!removed) {
            System.out.println("The country wasn't on the list");
        }
    }

}
