package by.academy.port.ship.deck.cargo;

import static by.academy.Constants.*;

public class Cube implements Cargo {

    String size ;
    double height;
    int density;

    public Cube(String size, double height, int density) {
        this.size = size;
        this.height = height;
        this.density = density;
    }


    @Override
    public double calculateVolume() {
        if(BIG.equals("BIG")){
            return 20*20*height;
        }
        return 10*10*height;
    }

    @Override
    public double calculateWaterCount() {
        double result;
        if(BIG.equals("BIG")){
            result=2*density*calculateVolume();
            return  result;
        }
        result =4*density*calculateVolume();
        return result;
    }
}
