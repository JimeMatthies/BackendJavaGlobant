/*
Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
@author JimeM
 */
package Services;

public class DiscountCalculator {

    public double discountNumber(double price, double rate) {
        return price * (rate / 100);
    }

}
