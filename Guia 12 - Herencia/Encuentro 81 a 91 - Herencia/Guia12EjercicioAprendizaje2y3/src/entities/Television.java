/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador tdt (booleano), además de los atributos heredados.
- Los constructores que se implementarán serán:
° Un constructor vacío y un constructor con la resolución, sintonizador tdt y el resto de los atributos heredados.
Recuerda que debes llamar al constructor de la clase padre.
- Los métodos que se implementara serán:
° Método get y set de los atributos resolución y sintonizador tdt.
° Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar 
los atributos heredados del padre y después llenamos los atributos del televisor.
° Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene una 
resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un sintonizador tdt incorporado, aumentará 
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
@author JimeM
 */
package entities;

import java.util.Scanner;

public final class Television extends Appliance {

    private Integer resolution;
    private boolean tdt;

    public Television() {
        super();
    }

    public Television(Integer resolution, boolean tdt, String color, Character energyEfficiency, Integer weight) {
        super(color, energyEfficiency, weight);
        this.resolution = resolution;
        this.tdt = tdt;
    }

    public Integer getResolution() {
        return resolution;
    }

    public void setResolution(Integer resolution) {
        this.resolution = resolution;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void createTelevision() {
        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        super.createAppliance();
        System.out.println("Television resolution:");
        this.resolution = SC.nextInt();
        System.out.println("Television has TDT tuner (true/false):");
        this.tdt = SC.nextBoolean();
    }

    @Override
    public Double finalPrice() {
        Double increase = 0d;
        if (this.resolution > 40) {
            increase += (super.finalPrice() * 0.3);
        }
        if (this.tdt) {
            increase += 500d;
        }
        return super.finalPrice() + increase;
    }

    @Override
    public String toString() {
        return "Television{"
                + "resolution = " + resolution
                + ", tdt = " + tdt + '\''
                + ", price = " + price
                + ", color = '" + color + '\''
                + ", energy efficiency = " + energyEfficiency
                + ", weight = " + weight
                + '}';
    }

}
