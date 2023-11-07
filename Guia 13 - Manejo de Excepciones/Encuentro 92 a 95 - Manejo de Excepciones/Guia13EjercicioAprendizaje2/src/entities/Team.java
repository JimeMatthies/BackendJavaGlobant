/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
@author JimeM
 */
package entities;

public class Team {
    
    private Integer[] playerNumbers;

    public Team() {
        playerNumbers = new Integer[11];
    }

    public Team(Integer[] playerNumbers) {
        this.playerNumbers = playerNumbers;
    }

    public Integer[] getPlayerNumbers() {
        return playerNumbers;
    }

    public void setPlayerNumbers(Integer[] playerNumbers) {
        this.playerNumbers = playerNumbers;
    }

    @Override
    public String toString() {
        return "Team{" + "playerNumbers = " + playerNumbers + '}';
    }

}
