/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1 y 12
(el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe contener un método toString()
que retorne el número de carta y el palo. La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
° barajar(): cambia de posición todas las cartas aleatoriamente.
° siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, 
se indica al usuario que no hay más cartas.
° cartasDisponibles(): indica el número de cartas que aún se puede repartir.
° darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas. 
En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
° cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
° mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y luego se llama al método, 
este no mostrara esa primera carta.
@author JimeM
 */
package Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> drawPile;
    private List<Card> discardPile;

    public Deck() {
        this.drawPile = new ArrayList();
        this.discardPile = new ArrayList();
        newDeck();
    }

    public Deck(List<Card> drawPile, List<Card> discardPile) {
        this.drawPile = drawPile;
        this.discardPile = discardPile;
    }

    private void newDeck() {
        String[] suits = {
            "SWORDS",
            "CLUBS",
            "GOLDS",
            "CUPS"
        };
        for (String suit : suits) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    drawPile.add(new Card(i, suit));
                }
            }
        }
    }

    public List<Card> getDrawPile() {
        return drawPile;
    }

    public void setDrawPile(List<Card> drawPile) {
        this.drawPile = drawPile;
    }

    public List<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(List<Card> discardPile) {
        this.discardPile = discardPile;
    }

    public void shuffleDeck() {
        Collections.shuffle(drawPile);
    }

    public Card nextCard() {
        if (drawPile.isEmpty()) {
            System.out.println("There are no more cards");
        }
        Card card = drawPile.get(0);
        discardPile.add(card);
        drawPile.remove(card);
        return card;
    }

    public Integer cardsAvailable() {
        return drawPile.size();
    }

    public List<Card> dealCards(Integer amount) {
        List<Card> cardsDealt = new ArrayList();
        if (amount > cardsAvailable()) {
            System.out.println("There are not enough cards remaining");
        } else {
            for (int i = 0; i < amount; i++) {
                cardsDealt.add(nextCard());
            }
        }
        return cardsDealt;
    }

    public void showDiscardPile() {
        if (discardPile.isEmpty()) {
            System.out.println("Discard pile is empty");
        } else {
            System.out.println("---------------------------------");
            System.out.println("Discard pile:");
            discardPile.forEach(card -> System.out.println(card));
        }
    }

    public void showDrawPile() {
        if (drawPile.isEmpty()) {
            System.out.println("Draw pile is empty");
        } else {
            System.out.println("---------------------------------");
            System.out.println("Draw pile:");
            drawPile.forEach(card -> System.out.println(card));
        }
    }

    @Override
    public String toString() {
        return "Deck{" + "drawPile=" + drawPile + ", discardPile=" + discardPile + '}';
    }

}
