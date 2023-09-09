package chapter12.section02;

// chapter12/section02/InputStreamReaderExample.java
import java.io.*;
public class InputStreamReaderExample {

    public static void main(String[] args) {
        try {
            File f = new File("E:\\kfm\\test3.txt");
            // 创建字节输入流对象
            FileInputStream fr = new FileInputStream(f);
            // 将字节输入流包装成字符输入流对象，同时指定编码格式
            InputStreamReader isr = new InputStreamReader(fr,"GBK");
            // 使用缓存流包装字符输入流对象
            BufferedReader br = new BufferedReader(isr);
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("读取失败！");
        }
    }
}
