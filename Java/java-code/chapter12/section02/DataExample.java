package chapter12.section02;

// chapter12/section02/DataExample.java
import java.io.*;
public class DataExample {

    public static void main(String[] args) throws IOException {
        copyFile("E:\\kfm\\picture.zip", "E:\\kfm\\picture1.zip");
    }

    public static void copyFile(String source, String dest) throws IOException {
        // 定义源数据源对象 sourceFile
        File sourceFile = new File(source);
        // 目标数据源对象 destFile
        File destFile = new File(dest);
        try(  // 定义二进制输入流相关的对象
            FileInputStream fis = new FileInputStream(sourceFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream(destFile);
            // 定义二进制输出流相关的对象
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataInputStream dis = new DataInputStream(bis);
            DataOutputStream dos = new DataOutputStream(bos);) {
            // 开始拷贝
            int temp;
            while ((temp = dis.read()) != -1) { // 从源数据源中读取一个字节
                dos.write(temp);  // 向目标源数据源中写入一个字节
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("操作文件失败！");
        }
    }
}
