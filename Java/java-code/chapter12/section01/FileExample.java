package chapter12.section01;

// chapter12/section01/FileExample.java
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String folderPath = "E:\\Temp\\knowledge";
        String fileName = "test.txt";
        FileUtils.createFolder(folderPath);
        System.out.println("创建目录完毕");
        FileUtils.createFile(folderPath, fileName);
        System.out.println("创建文件完毕");
        FileUtils.listFile("E:\\Temp\\knowledge");
        System.out.println("显示E盘中temp/knowledge的目录和文件完毕");
        FileUtils.listDisk();
        System.out.println("罗列所有盘符数据完毕");
        FileUtils.deleteFile("E:\\Temp\\knowledge\\data.txt");
        System.out.println("删除文件完毕");
        FileUtils.fileInfo("E:\\Temp\\knowledge\\kfm", "data.txt");
        System.out.println("显示文件信息完毕");
    }
}
