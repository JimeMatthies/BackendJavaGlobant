/*
Conversión de Temperatura:
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.
@author JimeM
 */
package Services;

public class TemperatureConverter {

    public double celciusFahrenheit(double celcius) {
        return ((celcius * 9) / 5) + 32;
    }

    public double fahrenheitCelcius(double fahrenheit) {
        return ((fahrenheit - 32) * 5) / 9;
    }

    public double celciusKelvin(double celcius) {
        return celcius + 273.15;
    }

    public double kelvinCelcius(double kelvin) {
        return kelvin - 273.15;
    }

}
