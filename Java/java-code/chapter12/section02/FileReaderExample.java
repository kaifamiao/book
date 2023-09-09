package chapter12.section02;

// chapter12/section02/FileReaderExample.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("E:\\kfm\\test2.txt");
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("读取文件时出错");
        } finally {
            if (br != null) {
                br.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
    }
}
