package by.academy.port.ship;

import by.academy.port.ship.deck.Deck;

public class Ship {
    private Deck deck;

    public Ship(Deck deck) {
        this.deck = deck;
    }

    public double getShipMass(){
        return deck.getDeckMass();
    }

}
