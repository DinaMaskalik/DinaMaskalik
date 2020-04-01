package task1;

public interface ICar {

    boolean start(Motor motor);
    boolean stop(Motor motor);
    void addPassenger(Passenger passenger);
    int getFuel(FuelTank fuelTank);
}
