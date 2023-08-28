/*
Guia 8 = App Sueldo y Antiguedad (Video 10)
@author JimeM
 */
package guia8ejerciciovideointegrador;

import Entidades.Vendedor;
import Servicios.VendedorServicio;

public class Guia8EjercicioVideoIntegrador {

    public static void main(String[] args) {
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.crearVendedor();
        vs.calcularSueldo(v1);
        vs.calcularVacaciones(v1);
        vs.mostrarVendedor(v1);
    }
    
}
