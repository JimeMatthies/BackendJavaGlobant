/*
Guia 12 = Aplicacion Dibujos (Video 5)
@author JimeM
 */
package entities;

public final class Cat extends Animal {
    
    private String catBreed;

    public Cat(String catBreed, Integer paws, boolean tail, Integer yearsLiving, Double energy) {
        super(paws, tail, yearsLiving, energy);
        this.catBreed = catBreed;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public Integer getPaws() {
        return paws;
    }

    public void setPaws(Integer paws) {
        this.paws = paws;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public Integer getYearsLiving() {
        return yearsLiving;
    }

    public void setYearsLiving(Integer yearsLiving) {
        this.yearsLiving = yearsLiving;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }
    
    public void purr(){
        System.out.println("Purrrrrrr....");
    }

    @Override
    public void calculateAge() {
        System.out.println("The cat age for " + this.yearsLiving + " years living is " + (yearsLiving * 5));
    }
    
    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Miau...");
    }
    
}
