/*
Conversión de Temperatura:
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.
@author JimeM
 */

package guia9ejercicioaprendizaje2;

import Services.TemperatureConverter;

public class Guia9EjercicioAprendizaje2 {

    public static void main(String[] args) {
        
        TemperatureConverter tc = new TemperatureConverter();
        
        System.out.println("Farenheit to Kelvin");
        double f = 86;
        System.out.println("Farenheit: " + f);
        double k = tc.celciusKelvin(tc.fahrenheitCelcius(f));
        System.out.println("Kelvin: " + k);
    }
    
}
