package chapter14.section02;

// chapter14/section02/Server.java
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    public static void main(String[] args) throws Exception {
        // 建立一个服务器 Socket（ ServerSocket），指定端口8800并开始监听
        ServerSocket server = new ServerSocket(8800);
        // 使用accept()方法等待客户端发起通信
        Socket socket = server.accept();
        // 打开输入/输出流
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        // 反序列化
        ObjectInputStream ois =new ObjectInputStream(inputStream);
        UserModel userModel = (UserModel)ois.readObject();
        if (userModel != null) {
            System.out.println("我是服务端，客户端登录信息为"
                    + userModel.getUserName() + "，密码为"
                    + userModel.getUserPass());
        }
        // 给客户端一个响应，即向输出流中写入信息
        String reply = "欢迎你，登录成功";
        outputStream.write(reply.getBytes());
        // 关闭资源
        ois.close();
        outputStream.close();
        inputStream.close();
        socket.close();
        server.close();
    }
}
