/*
Guia 9 = Aplicación Test con JUnit (Videos 1 - 2)
@author JimeM
 */
package Services;

import Entity.Rectangle;
import java.util.Scanner;

public class RectangleService {
    
    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Rectangle createRectangle() {
        System.out.println("---------------------------------");
        System.out.println("Width:");
        double width = SC.nextDouble();
        System.out.println("Length:");
        double length = SC.nextDouble();

        return new Rectangle(width, length);
    }

    public void showRectangle(Rectangle rr) {
        System.out.println("---------------------------------");
        System.out.println("Rectangle's information: ");
        System.out.println("Width: " + rr.getWidth());
        System.out.println("Length: " + rr.getLength());
        System.out.println("Color: " + rr.getColor());
        System.out.println("Is Active?: " + rr.isActive());
    }

    public double calculateArea(Rectangle rr) {
        return rr.getWidth() * rr.getLength();
    }

    public double calculatePerimeter(Rectangle rr) {
        return 2 * (rr.getWidth() + rr.getLength());
    }
}
