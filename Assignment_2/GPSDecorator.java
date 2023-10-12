package Assignment_2;

public class GPSDecorator extends CarDecorator {
    public GPSDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", GPS";
    }

    @Override
    public double getCost() {
        return super.getCost() + 500.0;
    }
}