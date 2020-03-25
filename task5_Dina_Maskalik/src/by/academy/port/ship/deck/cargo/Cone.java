package by.academy.port.ship.deck.cargo;

import static by.academy.Constants.*;

public class Cone implements Cargo {
    String size ;
    double height;
    int density;

    public Cone(String size, double height, int density) {
        this.size = size;
        this.height = height;
        this.density = density;
    }


    @Override
    public double calculateVolume() {
        if(BIG.equals("BIG")){
            return height*Math.pow(10,2)*PI/3;
        }
        return height*Math.pow(5,2)*PI/3;
    }

    @Override
    public double calculateWaterCount() {
        if(BIG.equals("BIG")){
            return 2*density*calculateVolume();
        }
        return 4*density*calculateVolume();
    }
}
