/*
Guia 12 = Aplicacion Dibujos (Video 5)
@author JimeM
 */
package entities;

public final class Dog extends Animal {

    private String dogBreed;

    public Dog(String dogBreed, Integer paws, boolean tail, Integer yearsLiving, Double energy) {
        super(paws, tail, yearsLiving, energy);
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
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

    public void playAtPark(int time) {
        for (int i = 0; i < time; i++) {
            energy -= 10;
        }
        System.out.println("The amount of energy left is " + this.energy);
    }

    @Override
    public void calculateAge() {
        System.out.println("The dog age for " + this.yearsLiving + " years living is " + (yearsLiving * 7));
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Woof...");
    }
}
