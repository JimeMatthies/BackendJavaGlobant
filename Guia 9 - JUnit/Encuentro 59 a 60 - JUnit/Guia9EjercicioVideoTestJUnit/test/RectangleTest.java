/*
Guia 9 = Aplicación Test con JUnit (Videos 1 - 2)
@author JimeM
 */

import Entity.Rectangle;
import Services.RectangleService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    public RectangleTest() {
    }

    RectangleService rs;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        rs = new RectangleService();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testColor() {
        System.out.println("---------------------------------");
        System.out.println("Color test");
        assertNotNull(new Rectangle(10, 5).getColor());
    }

    @Test
    public void testArea() {
        System.out.println("---------------------------------");
        System.out.println("Area test");
        assertEquals(50, rs.calculateArea(new Rectangle(5, 10)), 0);
        assertEquals(200, rs.calculateArea(new Rectangle(10, 20)), 0);
        assertEquals(450, rs.calculateArea(new Rectangle(15, 30)), 0);
    }

    @Test
    public void testPerimeter() {
        System.out.println("---------------------------------");
        System.out.println("Perimeter test");
        assertEquals(30, rs.calculatePerimeter(new Rectangle(5, 10)), 0);
        assertEquals(60, rs.calculatePerimeter(new Rectangle(10, 20)), 0);
        assertEquals(90, rs.calculatePerimeter(new Rectangle(15, 30)), 0);
    }

    @Test
    public void testActivation() {
        System.out.println("---------------------------------");
        System.out.println("Activation test");
        Rectangle rr = new Rectangle(2, 5);
        assertTrue(rr.isActive());
        rr.setActive(false);
        assertFalse(rr.isActive());
    }
}
