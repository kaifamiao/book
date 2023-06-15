package chapter12.section02;

// chapter12/section02/OutputStreamWriterExample.java
import java.io.*;

public class OutputStreamWriterExample {

    public static void main(String[] args) {
        try {
            File f = new File("E:\\kfm\\test3.txt");
            // 创建字节输出流对象
            FileOutputStream fr = new FileOutputStream(f);
            // 将字节输出流包装成字符输出流对象，同时指定编码格式
            OutputStreamWriter osw = new OutputStreamWriter(fr, "utf-8");
            // 使用缓存流包装字符输出流对象
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("我的编码格式不是默认的ANSI编码，");
            bw.newLine();
            bw.write("而是UTF-8编码，");
            bw.newLine();
            bw.write("在读取我时，还需要使用UTF-8编码，否则会乱码哦。");
            bw.newLine();
            bw.close();
            System.out.println("写入完毕");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("写入失败！");
        }
    }
}
