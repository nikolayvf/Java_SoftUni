package needForSpeed;

public class Vehicle {
    private final static double	DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int	horsePower;

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Vehicle(double fuel, int horsePower){
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public void drive(double kilometers) {
        double neededFuel = kilometers * this.fuelConsumption;
        if (this.fuel >= neededFuel) {
            double newFuel = getFuel() - neededFuel;
            this.setFuel(newFuel);
        }
    }
}