/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página: https://mapanet.eu/index.htm.
Nota: Poner el código postal sin la letra, solo el número.
° Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
° Muestra por pantalla los datos introducidos
° Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
° Muestra por pantalla los datos
° Agregar una ciudad con su código postal correspondiente más al HashMap.
° Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
° Muestra por pantalla los datos
@author JimeM
 */
package Services;

import Entity.ZipCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZipCodeService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private final HashMap<String, Integer> zipcodes;

    public ZipCodeService() {
        this.zipcodes = new HashMap();
    }

    public ZipCode createZipCode() {
        System.out.println("---------------------------------");
        System.out.println("City:");
        String city = SC.next();
        city = city.toUpperCase();
        System.out.println("Zip Code:");
        Integer code = SC.nextInt();

        return new ZipCode(city, code);
    }

    public void addZipCode(ZipCode zc) {
        zipcodes.put(zc.getCity(), zc.getCode());
    }

    public void createZipCodes() {
        String answer = "";
        do {
            addZipCode(createZipCode());
            System.out.println("Do you want to add another Zip Code? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
    }

    public void showZipCode(ZipCode zc) {
        System.out.println("---------------------------------");
        System.out.println("Zip Code's info: ");
        System.out.println("City: " + zc.getCity());
        System.out.println("Code: " + zc.getCode());
    }

    public void showZipCodes() {
        System.out.println("---------------------------------");
        System.out.println("Zip Codes from List:");
        for (Map.Entry<String, Integer> zc : zipcodes.entrySet()) {
            String key = zc.getKey();
            Integer value = zc.getValue();
            System.out.println("City: " + key);
            System.out.println("Code: " + value);
        }
        System.out.println("Number of Zip Codes = " + zipcodes.size());
    }

    public void searchCityBycode() {
        System.out.println("Enter zip code to find city?");
        Integer code = SC.nextInt();
        if (zipcodes.containsValue(code)) {
            for (Map.Entry<String, Integer> zc : zipcodes.entrySet()) {
                String key = zc.getKey();
                Integer value = zc.getValue();
                if (value.equals(code)) {
                    System.out.println(key);
                }
            }
        } else {
            System.out.println("City with zip code " + code + " is not on the list");
        }
    }

    public void searchRemoveZipCode() {
        System.out.println("Wich Zip code do you want to remove?");
        String city = SC.next();
        city = city.toUpperCase();
        if (zipcodes.containsKey(city)) {
            System.out.println("Are you sure you want to remove this zip code? (Y/N)");
            if (SC.next().equalsIgnoreCase("y")) {
                zipcodes.remove(city);
                System.out.println("Zip Code removed");
            }
        } else {
            System.out.println("Zip Code of " + city + " is not on the list");
        }
    }

}
