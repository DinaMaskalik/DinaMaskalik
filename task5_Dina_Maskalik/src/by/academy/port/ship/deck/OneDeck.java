package by.academy.port.ship.deck;

import by.academy.port.ship.deck.cargo.Cargo;

public class OneDeck implements Deck {

    private Cargo cargo;

    public OneDeck(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public double getDeckMass() {
        return cargo.calculateWaterCount();
    }
}
