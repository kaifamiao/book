package chapter14.section04;

// chapter14/section04/UDPSocket1.java
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSocket1 {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            InetAddress address = null;
            String message = "你好，我想咨询一个问题";
            // 获取本机主机地址
            address = InetAddress.getByName("localhost");
            // 创建DatagramPacket对象，封装数据
            DatagramPacket packet = new DatagramPacket(message.getBytes(),
                    message.getBytes().length, address, 8800);
            // 创建DatagramSocket对象，向服务器发送数据
            socket = new DatagramSocket();
            // 发送数据
            socket.send(packet);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}
