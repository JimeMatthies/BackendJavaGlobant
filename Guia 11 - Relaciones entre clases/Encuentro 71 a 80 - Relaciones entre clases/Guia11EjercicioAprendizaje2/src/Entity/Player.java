/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja.
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
@author JimeM
 */
package Entity;

public class Player {

    private Integer id;
    private String name;
    private Boolean wet;

    public Player() {
        this.wet = false;
    }

    public Player(Integer id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isWet() {
        return wet;
    }

    public void setWet(Boolean wet) {
        this.wet = wet;
    }

    public Boolean shot(WaterGun wg) {
        wet = wg.wet();
        wg.nextJet();
        return wet;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", name=" + name + ", wet=" + wet + '}';
    }

}
