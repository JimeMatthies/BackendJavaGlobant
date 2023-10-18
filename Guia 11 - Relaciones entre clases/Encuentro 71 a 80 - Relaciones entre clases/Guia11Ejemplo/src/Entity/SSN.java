/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
@author JimeM
 */
package Entity;

public class SSN {
    
    private String serie;
    private int number;

    public SSN() {
    }

    public SSN(String serie, int number) {
        this.serie = serie;
        this.number = number;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SSN{" + "serie=" + serie + ", number=" + number + '}';
    }
    
}
