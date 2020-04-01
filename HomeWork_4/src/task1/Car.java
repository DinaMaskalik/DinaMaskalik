package task1;

public class Car implements ICar {
    Door door;
    Lock lock;
    Wheels wheels;
    Seat seat;
    FuelTank tank;

    @Override
    public boolean start(Motor motor) {
        return false;
    }

    @Override
    public boolean stop(Motor motor) {
        return false;
    }

    @Override
    public void addPassenger(Passenger passenger) {

    }

    @Override
    public int getFuel(FuelTank fuelTank) {
        return 0;
    }
}
