/*
Guia 12 = Aplicacion Dibujos (Video 5)
@author JimeM
 */
package entities;

public abstract class Animal {
    
    protected Integer paws;
    protected boolean tail;
    protected Integer yearsLiving;
    protected Double energy;

    public Animal(Integer paws, boolean tail, Integer yearsLiving, Double energy) {
        this.paws = paws;
        this.tail = tail;
        this.yearsLiving = yearsLiving;
        this.energy = energy;
    }
    
    public abstract void calculateAge();
    
    public void makeNoise(){
        System.out.println("Animal Breathing...");
    }
}
