package chap14.section01;

// chap14/section01/Server.java
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        // 建立一个服务器 Socket（ServerSocket），指定端口8800并开始监听
        ServerSocket server = new ServerSocket(8800);
        // 使用accept()方法等待客户端发起通信
        Socket socket = server.accept();
        // 打开输入/输出流
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        // 获取客户端信息，即从输入流读取信息
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String info = null;
        while ((info = bufferedReader.readLine()) != null) {
            System.out.println("我是服务端，客户端登录信息为" + info);
        }
        // 给客户端一个响应，即向输出流中写入信息
        String reply = "欢迎你，登录成功";
        outputStream.write(reply.getBytes());
        // 关闭资源
        bufferedReader.close();
        outputStream.close();
        inputStream.close();
        socket.close();
        server.close();
    }
}
