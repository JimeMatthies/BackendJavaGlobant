/*
Validador de Contraseñas:
Crea una clase PasswordValidator que verifique la fortaleza de una contraseña según ciertas
reglas (por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione
correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.
@author JimeM
 */
package Services;

public class PasswordValidator {

    public boolean minLength(String password) {
        return password.length() >= 8;
    }

    public boolean specialCharecters(String password) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < password.length(); i++) {
            if (!characters.contains(password.substring(i, i + 1))) {
                return true;
            }
        }
        return false;
    }

    public boolean caseSensitive(String password) {
        return !password.equals(password.toLowerCase());
    }

}
