/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos (8 filas por 6 columnas). 
De Cine nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y 
el precio de la entrada. Luego, de las películas nos interesa saber el título, duración, edad mínima y director. 
Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son etiquetados por una letra 
y un número la fila A1 empieza al final del mapa como se muestra en la tabla. También deberemos saber si el 
asiento está ocupado por un espectador o no, si esta ocupado se muestra una X, sino un espacio vacío.
@author JimeM
 */
package Entity;

public class Spectator {
    
    private String name;
    private Integer age;
    private Double budget;

    public Spectator() {
    }

    public Spectator(String name, Integer age, Double budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Spectator{" + "name=" + name + ", age=" + age + ", budget=" + budget + '}';
    }
    
}
