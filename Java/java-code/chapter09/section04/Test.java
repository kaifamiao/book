package chapter09.section04;

// chapter09/section04/Test.java
public class Test {

    public static void main(String[] args) {
        //U盘插入USB接口
        USBInterface udisk = new UDisk();
        udisk.service();
        //风扇插入USB接口
        USBInterface usbFan = new UsbFan();
        usbFan.service();
    }
}
