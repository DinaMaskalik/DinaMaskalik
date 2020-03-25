package by.academy.port.ship.deck.cargo;

import static by.academy.Constants.BIG;
import static by.academy.Constants.PI;

public class Drum implements Cargo {
    String size ;
    double height;
    int density;

    public Drum(String size, double height, int density) {
        this.size = size;
        this.height = height;
        this.density = density;
    }


    @Override
    public double calculateVolume() {
        if(BIG.equals("BIG")){
            return height*Math.pow(10,2)*PI;
        }
        return height*Math.pow(5,2)*PI;
    }

    @Override
    public double calculateWaterCount() {
        if(BIG.equals("BIG")){
            return 2*density*calculateVolume();
        }
        return 4*density*calculateVolume();
    }
}
