/*
Verificador de Palíndromos:
Crea una clase PalindromeChecker que verifique si una cadena es un palíndromo (se lee
igual de adelante hacia atrás y viceversa).
Escribe pruebas unitarias para asegurarte de que el verificador de palíndromos detecte
correctamente las cadenas que son palíndromos y las que no lo son.
@author JimeM
 */

import Services.PalindromeChecker;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    public PalindromeCheckerTest() {
    }

    PalindromeChecker pc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pc = new PalindromeChecker();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testcheckPalindrome() {
        System.out.println("---------------------------------");
        System.out.println("Palindrome checker test");
        assertFalse(pc.checkPalindrome("hello"));
        assertFalse(pc.checkPalindrome("world"));
        assertTrue(pc.checkPalindrome("radar"));
        assertTrue(pc.checkPalindrome("racecar"));
    }
}
