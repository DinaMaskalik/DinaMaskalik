package by.academy.port;

import by.academy.port.ship.Ship;

public class Port {
    private int quantityOfShip;
    private Ship[] ship;

    public Port(int quantityOfShip, Ship[] ship) {
        this.quantityOfShip = quantityOfShip;
        this.ship = new Ship[this.quantityOfShip];
        for (int i = 0; i < quantityOfShip; i++) {
            this.ship[i] = ship[i];
        }
    }

    public int getQuantityOfShip() {
        return quantityOfShip;
    }

    public double getTotalPortMass() {
        double result = 0;
        for (int i = 0; i < quantityOfShip; i++) {
            result += ship[i].getShipMass();
        }
        return result;
    }


}
