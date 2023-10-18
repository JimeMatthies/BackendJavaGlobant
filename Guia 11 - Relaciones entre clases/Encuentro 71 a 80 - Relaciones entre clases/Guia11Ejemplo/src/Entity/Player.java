/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
@author JimeM
 */
package Entity;

public class Player {
    
    private String name;
    private String lastname;
    private String position;
    private int number;

    public Player() {
    }

    public Player(String name, String lastname, String position, int number) {
        this.name = name;
        this.lastname = lastname;
        this.position = position;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", lastname=" + lastname + ", position=" + position + ", number=" + number + '}';
    }

}
