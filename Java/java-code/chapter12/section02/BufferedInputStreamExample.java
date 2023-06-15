package chapter12.section02;

// chapter12/section02/BufferedExample.java
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fis = new FileInputStream("E:\\kfm\\test.txt"); // 定义输出流对象
            bis = new BufferedInputStream(fis); // 缓存输出流包装输出流对象
            System.out.println("可读取的字节数" + fis.available());
            System.out.println("文件内容为:");
            String str = "";
            byte data[] = new byte[fis.available()];
            while ((bis.read(data)) != -1) {
                str = new String(data); // 将 byte 数组转换为String类型
            }
            System.out.println(str);
        } catch (IOException e) {
            System.out.println("读取文件时出错");
        } finally {
            if (bis != null) {
                bis.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}
