/*
Generador de Contraseñas Seguras:
Crea una clase SecurePasswordGenerator que genere contraseñas seguras con ciertos
requisitos (por ejemplo, longitud mínima, combinación de caracteres, etc.).
Escribe pruebas unitarias para asegurarte de que el generador de contraseñas seguras
cumpla con los requisitos establecidos y produzca contraseñas seguras.
@author JimeM
 */

import Services.SecurePasswordGenerator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SecurePasswordGeneratorTest {

    public SecurePasswordGeneratorTest() {
    }

    SecurePasswordGenerator spg;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        spg = new SecurePasswordGenerator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void checkPasswordLength() {
        System.out.println("---------------------------------");
        System.out.println("Check Password Length test");
        assertTrue(spg.generatePassword().length() >= 8);
    }

    @Test
    public void checkPasswordCaseSensitive() {
        System.out.println("---------------------------------");
        System.out.println("Check Password Case Sensitive test");
        String password = spg.generatePassword();
        assertNotEquals(password, password.toLowerCase());
    }

    @Test
    public void checkPasswordSpecialsCharecters() {
        System.out.println("---------------------------------");
        System.out.println("Check Password Specials Characters test");
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        boolean valid = true;
        String password = spg.generatePassword();
        for (int i = 0; i < password.length(); i++) {
            valid = valid && caracteres.contains(password.substring(i, i + 1));
        }
        assertFalse(valid);
    }
}
