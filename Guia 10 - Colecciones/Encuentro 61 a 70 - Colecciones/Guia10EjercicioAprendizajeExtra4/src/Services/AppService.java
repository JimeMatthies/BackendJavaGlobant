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
import java.util.Scanner;

public class AppService {
    
    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    ZipCodeService zcs;

    public AppService() {
        this.zcs = new ZipCodeService();
    }
    
    public void ZipCodesApp() {
        //createFamousSingers();
        zcs.addZipCode(new ZipCode("Compton", 90220));
        zcs.addZipCode(new ZipCode("Ñuñoa", 7750000));
        zcs.addZipCode(new ZipCode("Ipanema", 22411030));
        zcs.addZipCode(new ZipCode("Napoli", 80132));
        zcs.addZipCode(new ZipCode("La Habana Vieja", 10100));
        zcs.addZipCode(new ZipCode("Dalseo", 42608));
        zcs.addZipCode(new ZipCode("Gangnam", 06000));
        zcs.addZipCode(new ZipCode("PalmSprings", 92262));
        zcs.addZipCode(new ZipCode("Totoralillo", 1780000));
        zcs.addZipCode(new ZipCode("Toshima", 1700000));
        zcs.showZipCodes();
        menu();
        int op = 0;
        do {
            op = SC.nextInt();
            switch (op) {
                case 1:
                    zcs.addZipCode(zcs.createZipCode());
                    menu();
                    break;
                case 2:
                    zcs.searchCityBycode();
                    menu();
                    break;
                case 3:
                    zcs.searchRemoveZipCode();
                    menu();
                    break;
                case 4:
                    zcs.showZipCodes();
                    menu();
                    break;
                default:
                    System.out.println("THANKS, GOODBYE!");
            }
        } while (op != 5);
    }

    public void menu() {
        System.out.println("---------------------------------");
        System.out.println("MENU: ");
        System.out.println("1.- CREATE ZIP CODE");
        System.out.println("2.- SEARCH CITY");
        System.out.println("3.- REMOVE ZIPCODE");
        System.out.println("4.- SHOW ALL ZIP CODES");
        System.out.println("5.- QUIT");
    }
    
}
