package Assignment_2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes-Benz", "E-Class", "777GAY01");
        car1.turnCarOn();
        car1.carDrive();
        car1.turnCarOn();
        car1.turnCarOff();
        car1.turnCarOff();
        System.out.println("\n" + car1.carDescription());
    }
}
