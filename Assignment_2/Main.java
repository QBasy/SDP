package Assignment_2;

public class Main {
    public static void main(String[] args) {
        Car car = new ConcreteCar();
        System.out.println("Car: " + car.getDescription());
        System.out.println("Cost: $" + car.getCost());

        car = new LeatherSeatsCar(car);
        System.out.println("Car: " + car.getDescription());
        System.out.println("Cost: $" + car.getCost());

        car = new GPSDecorator(car);
        System.out.println("Car: " + car.getDescription());
        System.out.println("Cost: $" + car.getCost());

        car = new SunroofCar(car);
        System.out.println("Car: " + car.getDescription());
        System.out.println("Cost: $" + car.getCost());
    }
}
