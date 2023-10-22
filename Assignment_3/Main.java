package Assignment_3;

public class Main {
    public static void main(String[] args) {
        USB usbflashdevice = new USBFlashDevice("My USB");
        String[] Data = {"ECK.txt","MyPhoto.jpg","something.avi"};

        usbflashdevice.connectToUSB();

        System.out.println();

        usbflashdevice.writeData(Data);
        usbflashdevice.readData();

        System.out.println();

        AnotherDevice usbc = new USBC();
        USB adapter = new USBAdapter(usbc);
        adapter.connectToUSB();

        System.out.println();

        AnotherDevice lightning = new Lightning();
        adapter = new USBAdapter(lightning);
        adapter.connectToUSB();
    }
}
