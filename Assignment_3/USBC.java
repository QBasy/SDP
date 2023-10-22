package Assignment_3;

public class USBC implements AnotherDevice {
    private String USBCName;

    public USBC(String USBCName) {
        this.USBCName = USBCName;
    }
    @Override
    public void connectDevice() {
        System.out.println(USBCName + "connected to Type-C port");
    }
}
