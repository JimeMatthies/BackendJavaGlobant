/*
Validador de Fechas:
Crea una clase DateValidator que valide la corrección de una fecha (por ejemplo, si es una
fecha válida en el calendario gregoriano).
Escribe pruebas unitarias para asegurarte de que el validador de fechas detecte correctamente
fechas válidas e inválidas, teniendo en cuenta diferentes casos, como años bisiestos.
@author JimeM
 */
package Services;

public class DateValidator {

    public boolean validDate(int day, int month, int year) {
        boolean leapYear = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
        boolean dayMonth = (month > 0 && month < 13) && (day > 0 && day < 32);
        boolean february = (month == 2) && ((day < 29) || leapYear && (day < 30));
        boolean month30 = (month == 4 || month == 6 || month == 9 || month == 11) && (day < 31);
        boolean month31 = !(month == 2 || month == 4 || month == 6 || month == 9 || month == 11);
        return dayMonth && (february || month30 || month31);
    }

}
