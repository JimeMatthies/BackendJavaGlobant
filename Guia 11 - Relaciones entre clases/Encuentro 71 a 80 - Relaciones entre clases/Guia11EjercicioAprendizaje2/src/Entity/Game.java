/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
@author JimeM
 */
package Entity;

import java.util.Collections;
import java.util.List;

public class Game {

    private List<Player> players;
    private WaterGun waterGun;

    public Game() {
    }

    public Game(List<Player> players, WaterGun waterGun) {
        this.players = players;
        this.waterGun = waterGun;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public WaterGun getWaterGun() {
        return waterGun;
    }

    public void setWaterGun(WaterGun waterGun) {
        this.waterGun = waterGun;
    }

    public void startGame(List<Player> players, WaterGun waterGun) {
        Collections.shuffle(players);
        this.players = players;
        this.waterGun = waterGun;
    }

    public void round() {
        int position = 0;
        do {
            Player player = players.get(position);
            if (player.shot(waterGun)) {
                System.out.println(player.getName() + " turn");
                System.out.println("You got wet");
                System.out.println("Game Over");
                return;
            }
            System.out.println(player.getName() + " turn");
            System.out.println("Nothing happened, next player");
            position++;
            if (position == players.size()) {
                position = 0;
            }
        } while (true);
    }

    @Override
    public String toString() {
        return "Game{" + "players=" + players + ", waterGun=" + waterGun + '}';
    }

}
