package chap14.section03;

// chap14/section03/LoginThread.java
import chap14.section02.UserModel;
import java.io.*;
import java.net.Socket;

public class LoginThread extends Thread {
    Socket socket = null;

    // 每启动一个线程，连接对应的一个Socket
    public LoginThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (OutputStream outputStream = socket.getOutputStream();
             InputStream inputStream = socket.getInputStream();) {
            // 反序列化
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            UserModel userModel = (UserModel) ois.readObject();
            if (userModel != null) {
                System.out.println("我是服务端，客户端登录信息为"
                        + userModel.getUserName() + "，密码为"
                        + userModel.getUserPass());
            }
            // 给客户端一个响应，即向输出流中写入信息
            String reply = "欢迎你，登录成功";
            outputStream.write(reply.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
