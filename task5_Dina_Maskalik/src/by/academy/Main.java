package by.academy;

import by.academy.port.Port;
import by.academy.port.ship.Ship;
import by.academy.port.ship.deck.OneDeck;
import by.academy.port.ship.deck.TwoDeck;
import by.academy.port.ship.deck.cargo.Cone;
import by.academy.port.ship.deck.cargo.Cube;
import by.academy.port.ship.deck.cargo.Drum;

import static by.academy.Constants.*;

public class Main {
    public static void main(String[] args) {

        Port port=new Port(10,new Ship[]{
                new Ship(new OneDeck(new Cube(BIG, 20,HEAVYWATER))),
                new Ship(new OneDeck(new Cube(SMALL,30,WATER))),
                new Ship(new TwoDeck(new Cone(SMALL,25,WATER), new Drum(SMALL, 58,HEAVYWATER))),
                new Ship(new TwoDeck(new Cube(SMALL,45,HEAVYWATER), new Drum(BIG, 23,HEAVYWATER))),
                new Ship(new TwoDeck(new Cone(BIG,20,WATER), new Drum(SMALL, 11,HEAVYWATER))),
                new Ship(new OneDeck(new Cube(BIG,43,HEAVYWATER))),
                new Ship(new OneDeck(new Cone(SMALL,65,WATER))),
                new Ship(new OneDeck(new Drum(SMALL,55,WATER))),
                new Ship(new OneDeck(new Drum(BIG,87,WATER))),
                new Ship(new TwoDeck(new Cube(SMALL,16,WATER), new Drum(SMALL, 79,HEAVYWATER))),
        });

        System.out.println(port.getTotalPortMass()/1000+" tons in "+port.getQuantityOfShip()+" ships" );
    }
}
