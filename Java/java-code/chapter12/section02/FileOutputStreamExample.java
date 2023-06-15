package chapter12.section02;

// chapter12/section02/FileOutputStreamExample.java
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            // 定义输出流
            fos = new FileOutputStream("E:\\kfm\\test.txt", true);
            // 缓存输出流包装输出流对象
            bos = new BufferedOutputStream(fos);
            String str = "让编程变简单，让学习变快乐";
            // 将字符串转化为 byte 数组
            byte[] b = str.getBytes();
            bos.write(b, 0, b.length);
            System.out.println("写入完毕");
        } catch (IOException e) {
            System.out.println("创建文件时出错");
        } finally {
            if (bos != null) {
                bos.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
