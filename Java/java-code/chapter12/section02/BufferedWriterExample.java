package chapter12.section02;

// chapter12/section02/BufferedWriterExample.java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("E:\\kfm\\test2.txt", true);
            bw = new BufferedWriter(fw);
            bw.write("学而时习之"); // 写入到缓存区中
            bw.newLine(); // 输入换行
            bw.write("不亦说乎"); // 写入到缓存区中
            bw.newLine();  // 输入换行
            bw.flush();  // 刷新缓存区，将缓存区中的数据立即写入到目标数据源
            System.out.println("写入完毕");
        } catch (IOException e) {
            System.out.println("写入文件时出错");
        } finally {
            if (bw != null) {
                bw.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
    }
}
