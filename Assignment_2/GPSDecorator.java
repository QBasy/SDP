package Assignment_2;

public class GPSDecorator implements CarDecorator {
    private Car car;

    public GPSDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void turnCarOn() {
        car.turnCarOn();
    }

    @Override
    public void turnCarOff() {
        car.turnCarOff();
    }

    @Override
    public void carDrive() {
        car.carDrive();
    }

    @Override
    public String carDescription() {
        return car.carDescription();
    }
}