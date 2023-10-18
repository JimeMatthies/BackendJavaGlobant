/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja.
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
@author JimeM
 */
package Entity;

public class WaterGun {
    
    private Integer currentPosition;
    private Integer waterPosition;

    public WaterGun() {
    }

    public WaterGun(Integer currentPosition, Integer waterPosition) {
        this.currentPosition = currentPosition;
        this.waterPosition = waterPosition;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Integer getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(Integer waterPosition) {
        this.waterPosition = waterPosition;
    }
    
    public void loadGun(){
        currentPosition = (int) (Math.random()*6) + 1;
        waterPosition = (int) (Math.random()*6) + 1;
    }
    
    public Boolean wet(){
        return currentPosition.equals(waterPosition);
    }
    
    public void nextJet() {
        if (currentPosition == 6){
            currentPosition = 1;
        } else {
            currentPosition++;
        }
    }

    @Override
    public String toString() {
        return "WaterGun{" + "currentPosition=" + currentPosition + ", waterPosition=" + waterPosition + '}';
    }
    
}
