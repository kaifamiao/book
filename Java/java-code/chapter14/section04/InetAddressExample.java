package chapter14.section04;

// chapter14/section04/InetAddressExample.java
import java.net.InetAddress;

public class InetAddressExample {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
