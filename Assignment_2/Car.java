package Assignment_2;

public class Car implements CarDecorator{
    private String carMark;
    private String carModel;
    private String carNumber;
    private boolean carStatus = false;

    public Car(String carMark, String carModel, String carNumber) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.carNumber = carNumber;
    }

    public void turnCarOn() {
        if (carStatus == false) {
            carStatus = true;
        } else {
            System.out.println(carMark + " " + carModel + " is Already Turned On");
        }
    }

    public void turnCarOff() {
        if (carStatus == true) {
            carStatus = false;
        } else {
            System.out.println(carMark + " " + carModel + " is Already Turned Off");
        }
    }

    @Override
    public void carDrive() {
        if (carStatus) {
            System.out.println("Car is Driving away!");
        } else {
            System.out.println("First Turn Car On");
        }
    }

    public String carDescription() {
        return "Mark is " + carMark + ", model is " + carModel + " and number is " + carNumber + "!!!";
    }

    public String getCarMark() {
        return carMark;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarNumber() {
        return carNumber;
    }
}