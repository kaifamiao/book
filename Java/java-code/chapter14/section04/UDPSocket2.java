package chapter14.section04;

// chapter14/section04/UDPSocket2.java
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPSocket2 {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            // 创建DatagramPacket对象，准备接收数据
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, 1024);
            // 创建DatagramSocket对象，接收数据
            socket = new DatagramSocket(8800);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            // 显示接收到的消息
            System.out.println(packet.getAddress().getHostAddress() + "说"
                    + message);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}
