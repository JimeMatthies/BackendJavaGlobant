/*
Generador de Números Aleatorios:
Crea una clase RandomNumberGenerator que genere números aleatorios dentro de un rango
específico.
Escribe pruebas unitarias para asegurarte de que el generador de números aleatorios produce
resultados dentro del rango esperado y cumple con las propiedades de aleatoriedad.
@author JimeM
 */
package Services;

public class RandomNumberGenerator {
    
    public int generateRandomNum(int min, int max) {
        return (int)(Math.random() * (max - min)) + min;
    }
}
