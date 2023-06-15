package chapter09.section03;

// chapter09/section03/Test.java
public class Test {
    public static void main(String[] args) {
        //U盘插入USB接口
        USBInterface uDisk = new UDisk();
        uDisk.service();
        //风扇插入USB接口
        USBInterface usbFan = new UsbFan();
        usbFan.service();
    }
}