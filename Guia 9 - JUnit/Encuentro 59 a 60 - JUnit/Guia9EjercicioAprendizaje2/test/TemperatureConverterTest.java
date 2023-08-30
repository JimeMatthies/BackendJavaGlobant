/*
Conversión de Temperatura:
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.
@author JimeM
 */

import Services.TemperatureConverter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    public TemperatureConverterTest() {
    }

    TemperatureConverter tc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tc = new TemperatureConverter();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testcelciusFahrenheit() {
        System.out.println("---------------------------------");
        System.out.println("Celcius to Farenheit Test");
        assertEquals(32, tc.celciusFahrenheit(0), 0);
        assertEquals(122, tc.celciusFahrenheit(50), 0);
    }

    @Test
    public void testfahrenheitCelcius() {
        System.out.println("---------------------------------");
        System.out.println("Farenheit to Celcius Test");
        assertEquals(0, tc.fahrenheitCelcius(32), 0);
        assertEquals(50, tc.fahrenheitCelcius(122), 0);
    }

    @Test
    public void testcelciusKelvin() {
        System.out.println("---------------------------------");
        System.out.println("Celcius to Kelvin Test");
        assertEquals(273.15, tc.celciusKelvin(0), 0);
    }

    @Test
    public void kelvinCelcius() {
        System.out.println("---------------------------------");
        System.out.println("Kelvin to Celcius Test");
        assertEquals(0, tc.kelvinCelcius(273.15), 0);
    }
}
