package chapter14.section03;

// chapter14/section03/Server.java
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        // 建立一个服务器 Socket（ ServerSocket），指定端口8800并开始监听
        ServerSocket server = new ServerSocket(8800);
        // 一直在监听中
        Socket socket  =null;
        while(true) {
            socket = server.accept();
            LoginThread loginThread = new LoginThread(socket);
            loginThread.start();
        }
    }
}
