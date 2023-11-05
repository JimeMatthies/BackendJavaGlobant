/*
Guia 12 = Aplicacion Hoteles (Videos 1-2)
@author JimeM
 */
package guia12ejerciciovideo1;

import entities.Hotel;
import entities.Hotel1;
import entities.Hotel2;
import entities.Hotel3;
import entities.Hotel4;
import entities.Hotel5;
import java.util.ArrayList;
import java.util.List;

public class Guia12EjercicioVideo1 {

    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList();

        Hotel1 h1 = new Hotel1(1500d, 9d, 10);
        Hotel2 h2 = new Hotel2(2500d, 12d, 15);
        Hotel3 h3 = new Hotel3(3500d, 15d, 20);
        Hotel4 h4 = new Hotel4(5000d, 20d, 30);
        Hotel5 h5 = new Hotel5(10000d, 30d, 50);

        hotels.add(h1);
        hotels.add(h2);
        hotels.add(h3);
        hotels.add(h4);
        hotels.add(h5);

        for (Hotel aux : hotels) {        
            if (aux instanceof Hotel5) {
                Hotel5 object = (Hotel5) aux;
                System.out.println("I'm a 5 stars hotel");
                continue;
            }
            if (aux instanceof Hotel4) {
                Hotel4 object = (Hotel4) aux;
                System.out.println("I'm a 4 stars hotel");
                continue;
            }
            if (aux instanceof Hotel3) {
                Hotel3 object = (Hotel3) aux;
                System.out.println("I'm a 3 stars hotel");
                continue;
            }
            if (aux instanceof Hotel2) {
                Hotel2 object = (Hotel2) aux;
                System.out.println("I'm a 2 stars hotel");
                continue;
            }
            if (aux instanceof Hotel1) {
                Hotel1 object = (Hotel1) aux;
                System.out.println("I'm a 1 stars hotel");
            }
        }
    }
    
}
