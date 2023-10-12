package Assignment_2;

public class SunroofCar extends CarDecorator  {
    public SunroofCar(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sunroof";
    }

    @Override
    public double getCost() {
        return super.getCost() + 800.0;
    }
}
