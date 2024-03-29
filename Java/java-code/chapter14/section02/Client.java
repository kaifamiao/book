package chapter14.section02;

// chapter14/section02/Client.java
import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        // 建立客户端 Socket连接，指定服务器的位置为本机以及端口为8800
        Socket client = new Socket("localhost", 8800);
        // 打开输入和输出流
        OutputStream outputStream = client.getOutputStream();
        InputStream inputStream = client.getInputStream();
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        UserModel userModel =new UserModel("admin", "123456");
        oos.writeObject(userModel);
        client.shutdownOutput();
        // 接收服务器端的响应，即从输入流中读取信息
        String reply = null;
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while ((reply = bufferedReader.readLine()) != null) {
            System.out.println("我是客户端，服务器相应的内容为：" + reply);
        }
        // 关闭资源
        oos.close();
        bufferedReader.close();
        inputStream.close();
        outputStream.close();
        client.close();
    }
}
