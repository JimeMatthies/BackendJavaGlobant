/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
- Los constructores que se deben implementar son los siguientes:
° Un constructor vacío y un constructor con todos los atributos pasados por parámetro.
- Los métodos a implementar son:
° Métodos getters y setters de todos los atributos.
° Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra 
F por defecto. Este método se debe invocar al crear el objeto y no será visible.
° Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el color blanco por 
defecto. Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el 
nombre está en mayúsculas o en minúsculas. Este método se invocará al crear el objeto y no será visible.
° Metodo crearElectrodomestico(): le pide la información al usuario y llena el electrodoméstico, también llama los 
métodos para comprobar el color y el consumo. Al precio se le da un valor base de $1000.
° Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio. 
Esta es la lista de precios:
LETRA / PRECIO -----      PESO       /  PRECIO
  A     $1000        Entre 1 y 19 kg     $100
  B     $800         Entre 20 y 49 kg    $500
  C     $600         Entre 50 y 79 kg    $800
  D     $500         Mayor que 80 kg     $1000
  E     $300
  F     $100
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el precio final de los 
dos electrodomésticos.
@author JimeM
 */
package guia12ejercicioaprendizaje2y3;

import entities.Appliance;
import entities.Television;
import entities.WashingMachine;
import java.util.ArrayList;
import java.util.List;

public class Guia12EjercicioAprendizaje2y3 {

    public static void main(String[] args) {

        //Ejercicio 2
//        WashingMachine w1 = new WashingMachine();
//        w1.createWashingMachine();
//        System.out.println(w1);
//        System.out.println(w1.finalPrice());
//     
//        Television t1 = new Television();
//        t1.createTelevision();
//        System.out.println(t1);
//        System.out.println(t1.finalPrice());
        //Ejercicio 3
        List<Appliance> appliances = new ArrayList();
        appliances.add(new WashingMachine(30, "Gray", 'C', 60));
        appliances.add(new WashingMachine(40, "Blue", 'A', 70));
        appliances.add(new Television(50, true, "Black", 'A', 20));
        appliances.add(new Television(43, false, "Gray", 'B', 15));

        Double total = 0d;
        total = 0d;
        for (Appliance aa : appliances) {
            if (aa instanceof WashingMachine) {
                total += aa.finalPrice();
            }
        }
        System.out.println("All washing machines total price: " + total);
        total = 0d;
        for (Appliance aa : appliances) {
            if (aa instanceof Television) {
                total += aa.finalPrice();
            }
        }
        System.out.println("All televisions total price: " + total);
        for (Appliance aa : appliances) {
            total += aa.finalPrice();
        }
        System.out.println("All appliances total price: " + total);
    }

}
