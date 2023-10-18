/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja.
@author JimeM
 */
package guia11ejercicioaprendizaje2;

import Entity.Game;
import Entity.Player;
import Entity.WaterGun;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guia11EjercicioAprendizaje2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Number of players:");
        int limit = sc.nextInt();
        List<Player> players = new ArrayList();
        for (int i = 0; i < limit; i++) {
            players.add(new Player((i + 1), "Payer " + (i + 1)));
        }
        WaterGun wg = new WaterGun();
        wg.loadGun();
        Game game = new Game();
        game.startGame(players, wg);
        game.round();    
    }
    
}
