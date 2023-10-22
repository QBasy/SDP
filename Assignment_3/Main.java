package Assignment_3;

public class Main {
    public static void main(String[] args) {
        USB usbflashdevice = new USBFlashDevice("My USB");
        String[] Data = {"ECK.txt","MyPhoto.jpg","something.avi"};
        
        usbflashdevice.connectToUSB();
        usbflashdevice.writeData(Data);
        usbflashdevice.readData();

        AnotherDevice lightning = new Lightning();
        USB adapter = new USBAdapter(lightning);
        adapter.connectToUSB();
    }
}
