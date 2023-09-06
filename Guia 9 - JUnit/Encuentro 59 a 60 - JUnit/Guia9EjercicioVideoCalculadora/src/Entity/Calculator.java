/*
Guia 9 = Aplicación Calculadora (Videos 3)
@author JimeM
 */
package Entity;

public class Calculator {
    
    public int add(int a, int b){
        return a + b;
    }
    
    public int subtract(int a, int b){
        return a - b;
    }
    
    public int multiply(int a, int b){
        return a * b;
    }
    
    public int divide(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }
}
