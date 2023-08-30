/*
Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
@author JimeM
 */

import Services.DiscountCalculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiscountCalculatorTest {

    public DiscountCalculatorTest() {
    }

    DiscountCalculator dc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dc = new DiscountCalculator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testDiscount() {
        System.out.println("---------------------------------");
        System.out.println("Discount Test");
        assertEquals(0, dc.discountNumber(100, 0), 0);
        assertEquals(10, dc.discountNumber(100, 10), 0);
        assertEquals(100, dc.discountNumber(100, 100), 0);
        assertEquals(400, dc.discountNumber(2000, 20), 0);
    }

}
