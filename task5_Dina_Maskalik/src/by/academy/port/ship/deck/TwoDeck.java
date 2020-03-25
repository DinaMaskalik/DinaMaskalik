package by.academy.port.ship.deck;

import by.academy.port.ship.deck.cargo.Cargo;

public class TwoDeck implements Deck {

    private Cargo cargo;
    private Cargo cargo1;

    public TwoDeck(Cargo cargo) {
        this.cargo = cargo;
    }

    public TwoDeck(Cargo cargo, Cargo cargo1) {
        this.cargo = cargo;
        this.cargo1 = cargo1;
    }

    @Override
    public double getDeckMass() {
        if(cargo1==null){
            return cargo.calculateWaterCount();
        }else{
            return cargo.calculateWaterCount()+cargo1.calculateWaterCount();
        }
    }
}
