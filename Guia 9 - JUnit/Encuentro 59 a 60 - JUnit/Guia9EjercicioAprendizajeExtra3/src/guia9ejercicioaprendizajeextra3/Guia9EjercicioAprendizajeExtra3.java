/*
Generador de Contraseñas Seguras:
Crea una clase SecurePasswordGenerator que genere contraseñas seguras con ciertos
requisitos (por ejemplo, longitud mínima, combinación de caracteres, etc.).
Escribe pruebas unitarias para asegurarte de que el generador de contraseñas seguras
cumpla con los requisitos establecidos y produzca contraseñas seguras.
@author JimeM
 */
package guia9ejercicioaprendizajeextra3;

import Services.SecurePasswordGenerator;

public class Guia9EjercicioAprendizajeExtra3 {

    public static void main(String[] args) {
        SecurePasswordGenerator spg = new SecurePasswordGenerator();
        String password = spg.generatePassword();
        System.out.println("Password: " + password);
    }
    
}
