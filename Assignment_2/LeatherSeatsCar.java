package Assignment_2;

public class LeatherSeatsCar extends CarDecorator  {
    public LeatherSeatsCar(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Leather Seats";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1000.0;
    }
}
