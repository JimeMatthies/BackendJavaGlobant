/*
Validador de Fechas:
Crea una clase DateValidator que valide la corrección de una fecha (por ejemplo, si es una
fecha válida en el calendario gregoriano).
Escribe pruebas unitarias para asegurarte de que el validador de fechas detecte correctamente
fechas válidas e inválidas, teniendo en cuenta diferentes casos, como años bisiestos.
@author JimeM
 */

import Services.DateValidator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateValidatorTest {

    DateValidator dv;

    public DateValidatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dv = new DateValidator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void validDateTest() {
        System.out.println("---------------------------------");
        System.out.println("Date Validator Test");
        assertTrue(dv.validDate(1, 1, 2023));
        assertTrue(dv.validDate(31, 12, 2023));
        assertTrue(dv.validDate(31, 7, 2023));
        assertFalse(dv.validDate(32, 7, 2023));
        assertTrue(dv.validDate(31, 8, 2023));
        assertFalse(dv.validDate(32, 8, 2023));
        assertTrue(dv.validDate(30, 9, 2023));
        assertFalse(dv.validDate(31, 9, 2023));
        assertTrue(dv.validDate(28, 2, 2023));
        assertFalse(dv.validDate(29, 2, 2023));
        assertTrue(dv.validDate(29, 2, 2020));
        assertFalse(dv.validDate(30, 2, 2020));
        assertTrue(dv.validDate(28, 2, 1900));
        assertFalse(dv.validDate(29, 2, 1900));
    }
}
