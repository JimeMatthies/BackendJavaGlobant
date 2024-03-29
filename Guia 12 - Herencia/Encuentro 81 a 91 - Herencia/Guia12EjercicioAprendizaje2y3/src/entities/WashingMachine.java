/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga, además de los atributos heredados.
- Los constructores que se implementarán serán:
° Un constructor vacío y un constructor con la carga y el resto de los atributos heredados. 
Recuerda que debes llamar al constructor de la clase padre.
- Los métodos que se implementara serán:
° Método get y set del atributo carga.
° Método crearLavadora (): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar 
los atributos heredados del padre y después llenamos el atributo propio de la lavadora.
° Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si tiene una carga 
mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se incrementará el precio. 
Este método debe llamar al método padre y añadir el código necesario. Recuerda que las condiciones que hemos visto 
en la clase Electrodoméstico también deben afectar al precio.
@author JimeM
 */
package entities;

import java.util.Scanner;

public final class WashingMachine extends Appliance {

    private Integer load;

    public WashingMachine() {
        super();
    }

    public WashingMachine(Integer load, String color, Character energyEfficiency, Integer weight) {
        super(color, energyEfficiency, weight);
        this.load = load;
    }

    public Integer getLoad() {
        return load;
    }

    public void setLoad(Integer load) {
        this.load = load;
    }

    public void createWashingMachine() {
        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        super.createAppliance();
        System.out.println("Washing Machine Load:");
        this.load = SC.nextInt();
    }

    @Override
    public Double finalPrice() {
        Integer increase = 0;
        if (this.load > 30) {
            increase = 500;
        }
        return super.finalPrice() + increase;
    }

    @Override
    public String toString() {
        return "Washing Machine{"
                + "load = " + load
                + ", price = " + price
                + ", color = '" + color + '\''
                + ", energy efficiency = " + energyEfficiency
                + ", weight = " + weight
                + '}';
    }

}
