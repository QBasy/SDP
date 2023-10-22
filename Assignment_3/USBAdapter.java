package Assignment_3;

public class USBAdapter implements USB {
    private AnotherDevice anotherDevice;
    public USBAdapter (AnotherDevice anotherDevice) {
        this.anotherDevice = anotherDevice;
    }

    @Override
    public void connectToUSB() {
        System.out.println("Adapter converting cable connection to USB.");
        anotherDevice.connectDevice();
    }

    @Override
    public void writeData(String[] Data) {

    }

    @Override
    public void readData() {

    }
}
