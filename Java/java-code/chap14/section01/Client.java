package chap14.section01;

// chap14/section01/Client.java
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        // 建立客户端 Socket连接，指定服务器的位置为本机以及端口为8800
        Socket client = new Socket("localhost", 8800);
        // 打开输入和输出流
        OutputStream outputStream = client.getOutputStream();
        InputStream inputStream = client.getInputStream();
        // 发送客户端登录信息，即向输出流写入信息
        String info = "用户名：admin，密码：12345";
        outputStream.write(info.getBytes());
        client.shutdownOutput();
        // 接收服务器端的响应，即从输入流中读取信息
        String reply = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while ((reply = bufferedReader.readLine()) != null) {
            System.out.println("我是客户端，服务器相应的内容为：" + reply);
        }
        // 关闭资源
        bufferedReader.close();
        inputStream.close();
        outputStream.close();
        client.close();
    }
}
