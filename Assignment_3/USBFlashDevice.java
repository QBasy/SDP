package Assignment_3;

import java.util.ArrayList;

public class USBFlashDevice implements USB {
    private String USBName;
    private String[] Memory;

    public USBFlashDevice(String USBName) {
        this.USBName = USBName;
    }
    @Override
    public void connectToUSB() {
        System.out.println(USBName + " flash drive connected to USB port");
    }

    public void writeData(String[] Data) {
        for (int i = 0; i < Data.length; i++) {
            Memory[i] = Data[i];
        }
    }

    public void readData() {
        for (int i = 0; i < Memory.length; i++) {
            System.out.println(i + " " + Memory[i]);
        }
    }
}
