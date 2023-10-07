package Assignment_2;

public class Car implements CarDecorator{
    private String carMark;
    private String carModel;
    private String carNumber;

    public Car(String carMark, String carModel, String carNumber) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.carNumber = carNumber;
    }

    public void drive() {
        System.out.println("\uD83D\uDE97 is Driving away!");
    }

    public void writeCarDescription() {
        System.out.println("Mark is " + carMark + ", model is " + carModel + " and number is " + carNumber + "!!!");
    }

    @Override
    public String carDescription(Car car) {
        return null;
    }
}
