/*
Analizador de Texto:
Crea una clase TextAnalyzer que analice un texto y proporcione estadísticas sobre él (por
ejemplo, número de palabras, número de frases, frecuencia de palabras, etc.).
Escribe pruebas unitarias para asegurarte de que el analizador de texto proporcione los
resultados correctos y maneje diferentes escenarios, como texto vacío o texto con caracteres
especiales.
@author JimeM
 */

import Services.TextAnalyzer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TextAnalyzerTest {

    public TextAnalyzerTest() {
    }

    TextAnalyzer ta;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ta = new TextAnalyzer();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void wordCounterTest() {
        System.out.println("---------------------------------");
        System.out.println("Word counter test");
        assertEquals(7, ta.wordCounter("1 2 3 4 5 6 7"));
    }

    @Test
    public void phraseCounterTest() {
        System.out.println("---------------------------------");
        System.out.println("Phrase counter test");
        assertEquals(3, ta.phraseCounter("1 2 3. 4 5 6. 7 8 9"));
    }

    @Test
    public void wordFrequencyTest() {
        System.out.println("---------------------------------");
        System.out.println("Word frequency test");
        assertEquals(1, (int) ta.wordFrequency("1 2 2 3 3 3 4 5 6 7").get("1"));
        assertEquals(2, (int) ta.wordFrequency("1 2 2 3 3 3 4 5 6 7").get("2"));
        assertEquals(3, (int) ta.wordFrequency("1 2 2 3 3 3 4 5 6 7").get("3"));
    }

}
