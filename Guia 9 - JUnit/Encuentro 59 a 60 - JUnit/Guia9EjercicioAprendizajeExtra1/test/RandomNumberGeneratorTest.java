/*
Generador de Números Aleatorios:
Crea una clase RandomNumberGenerator que genere números aleatorios dentro de un rango
específico.
Escribe pruebas unitarias para asegurarte de que el generador de números aleatorios produce
resultados dentro del rango esperado y cumple con las propiedades de aleatoriedad.
@author JimeM
 */

import Services.RandomNumberGenerator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomNumberGeneratorTest {

    public RandomNumberGeneratorTest() {
    }

    RandomNumberGenerator rng;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        rng = new RandomNumberGenerator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void generateRandomNumTest() {
        System.out.println("---------------------------------");
        System.out.println("Random number test");
        for (int i = 0; i < 1000; i++) {
            int num = rng.generateRandomNum(10, 20);
            assertNotSame(num, 9);
            assertNotSame(num, 21);
        }
    }
}
