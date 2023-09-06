/*
Guia 9 = Aplicación Test con JUnit (Videos 1 - 2)
@author JimeM
 */
package guia9ejerciciovideotestjunit;

import Entity.Rectangle;
import Services.RectangleService;

public class Guia9EjercicioVideoTestJUnit {

    public static void main(String[] args) {
        
        RectangleService rs = new RectangleService();
        Rectangle r1 = rs.createRectangle();
        rs.showRectangle(r1);

    }
    
}
