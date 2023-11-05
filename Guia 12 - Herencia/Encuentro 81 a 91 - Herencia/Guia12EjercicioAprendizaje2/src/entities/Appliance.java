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
@author JimeM
 */
package entities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Appliance {

    protected Double price;
    protected String color;
    protected Character energyEfficiency;
    protected Integer weight;

    public Appliance() {
        this.price = 1000d;
    }

    public Appliance(String color, Character energyEfficiency, Integer weight) {
        this();
        this.color = this.checkColor(color);
        this.energyEfficiency = this.checkEnergyEfficiency(energyEfficiency);
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(Character energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    private Character checkEnergyEfficiency(Character energyEfficiency) {
        energyEfficiency = energyEfficiency.toString().trim().toUpperCase().charAt(0);
        if ("ABCDEF".contains(energyEfficiency.toString())) {
            return energyEfficiency;
        }
        return 'F';
    }

    private String checkColor(String color) {
        color = color.trim().toUpperCase();
        List<String> colors = Arrays.asList("WHITE BLACK GRAY BLUE RED".split(" "));
        if (colors.contains(color)) {
            return color;
        }
        return "WHITE";
    }

    protected void createAppliance() {
        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---------------------------------");
        System.out.println("Appliance color:");
        this.color = this.checkColor(SC.next());
        System.out.println("Appliance energy efficiency label:");
        this.energyEfficiency = this.checkEnergyEfficiency(SC.next().charAt(0));
        System.out.println("Appliance weight:");
        this.weight = SC.nextInt();
    }

    public Double finalPrice() {
        Double weightPrice = 0d;
        if (this.weight >= 1 && this.weight <= 19) {
            weightPrice = 100d;
        } else if (this.weight <= 49) {
            weightPrice = 500d;
        } else if (this.weight <= 79) {
            weightPrice = 800d;
        } else {
            weightPrice = 1000d;
        }
        Map<Character, Double> energyEfficiencyPrice = new HashMap();
        energyEfficiencyPrice.put('A', 1000d);
        energyEfficiencyPrice.put('B', 800d);
        energyEfficiencyPrice.put('C', 600d);
        energyEfficiencyPrice.put('D', 500d);
        energyEfficiencyPrice.put('E', 300d);
        energyEfficiencyPrice.put('F', 100d);
        return this.price + weightPrice + energyEfficiencyPrice.get(this.energyEfficiency);
    }
    
}
