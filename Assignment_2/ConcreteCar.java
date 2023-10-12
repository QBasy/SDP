package Assignment_2;

public class ConcreteCar implements Car {
    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public double getCost() {
        return 15000.0;
    }
}