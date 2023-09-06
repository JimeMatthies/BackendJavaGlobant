/*
Guia 9 = Aplicación Test con JUnit (Videos 1 - 2)
@author JimeM
 */
package Entity;

public class Rectangle {
    
    private double width;
    private double length;
    private String color;
    private boolean active;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "Green";
        this.active = true;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", color=" + color + ", active=" + active + '}';
    }
 
}
