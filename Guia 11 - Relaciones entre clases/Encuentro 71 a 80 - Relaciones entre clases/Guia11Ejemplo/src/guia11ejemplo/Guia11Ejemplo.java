/*
Guia 11 = Ejemplos.
@author JimeM
 */
package guia11ejemplo;

import Entity.Person;
import Entity.Player;
import Entity.SSN;
import Entity.Team;
import java.util.ArrayList;

public class Guia11Ejemplo {

    public static void main(String[] args) {

        //Ejemplo 1:
        SSN s1 = new SSN();
        Person p1 = new Person();

        s1.setNumber(16624798);
        s1.setSerie("K");

        p1.setName("Jime");
        p1.setLastname("Matthies");
        p1.setSsn(s1);

        System.out.println(p1.toString());

        //Ejemplo 2:
        Player pl1 = new Player();
        Player pl2 = new Player();
        Player pl3 = new Player();
        Player pl4 = new Player();
        Player pl5 = new Player();     
        Team t1 = new Team();

        pl1.setName("Michael");
        pl1.setLastname("Jordan");
        pl1.setPosition("SG");
        pl1.setNumber(23);

        pl2.setName("Kareem");
        pl2.setLastname("Abdul-Jabbar");
        pl2.setPosition("C");
        pl2.setNumber(33);

        pl3.setName("Larry");
        pl3.setLastname("Bird");
        pl3.setPosition("SF");
        pl3.setNumber(33);

        pl4.setName("Kobe");
        pl4.setLastname("Bryant");
        pl4.setPosition("SG");
        pl4.setNumber(24);

        pl5.setName("Shaquille ");
        pl5.setLastname("O'Neal");
        pl5.setPosition("C");
        pl5.setNumber(32);

        ArrayList<Player> players = new ArrayList();
        players.add(pl1);
        players.add(pl2);
        players.add(pl3);
        players.add(pl4);
        players.add(pl5);
        
        t1.setName("All Stars");
        t1.setPlayers(players);
        System.out.println(t1.toString());
    }

}
