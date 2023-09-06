/*
Generador de Contraseñas Seguras:
Crea una clase SecurePasswordGenerator que genere contraseñas seguras con ciertos
requisitos (por ejemplo, longitud mínima, combinación de caracteres, etc.).
Escribe pruebas unitarias para asegurarte de que el generador de contraseñas seguras
cumpla con los requisitos establecidos y produzca contraseñas seguras.
@author JimeM
 */
package Services;

public class SecurePasswordGenerator {

    public String generatePassword() {
        String password = "";
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789", "ªº!|@#~¬!·$%&/()=?¿'¡^*¨Çḉ{}[]'\""};
        String allgroups = "";
        int length = (int) (Math.random() * (15 - 8)) + 8;
        for (int i = 0; i < length; i++) {
            int group = (int) (Math.random() * 100) % 3;
            int position = (int) (Math.random() * characters[group].length());
            password += characters[group].substring(position, position + 1);
            allgroups += group;
        }
        if (!allgroups.contains("0")) {
            int position = (int) (Math.random() * 26);
            password += characters[0].substring(position, position + 1);
        } else {
            if (!allgroups.contains("1")) {
                int position = (int) (Math.random() * 26);
                password += characters[1].substring(position, position + 1);
            } else {
                if (!allgroups.contains("2")) {
                    int position = (int) (Math.random() * 10);
                    password += characters[2].substring(position, position + 1);
                } else {
                    if (!allgroups.contains("3")) {
                        int position = (int) (Math.random() * 32);
                        password += characters[3].substring(position, position + 1);
                    }
                }
            }
        }
        return password;
    }

}
