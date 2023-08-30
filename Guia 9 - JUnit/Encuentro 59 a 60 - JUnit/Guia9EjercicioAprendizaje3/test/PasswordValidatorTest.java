/*
Validador de Contraseñas:
Crea una clase PasswordValidator que verifique la fortaleza de una contraseña según ciertas
reglas (por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione
correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.
@author JimeM
 */

import Services.PasswordValidator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidatorTest {

    PasswordValidator pv;

    public PasswordValidatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pv = new PasswordValidator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void minLengthTest() {
        System.out.println("---------------------------------");
        System.out.println("Minimum Length Test");
        assertEquals(false, pv.minLength("hola"));
        assertEquals(true, pv.minLength("holacomovamos"));
    }

    @Test
    public void specialCharectersTest() {
        System.out.println("---------------------------------");
        System.out.println("Special Charecters Test");
        assertEquals(false, pv.specialCharecters("holacomovamos"));
        assertEquals(true, pv.specialCharecters("hola!comovamos"));
    }

    @Test
    public void caseSensitive() {
        System.out.println("---------------------------------");
        System.out.println("Case Sensitive Test");
        assertEquals(false, pv.caseSensitive("holacomovamos"));
        assertEquals(true, pv.caseSensitive("holaComoVamos"));
    }
}
