package chapter12.section01;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtils {

/**
 * chapter12/section01/FileUtils.java/fileInfo()
 * 显示文件信息
 */
public static void fileInfo(String path, String filename) {
    File file = new File(path, filename);
    // length()方法用于获取文件大小
    System.out.println("文件大小=" + file.length() + "byte");
    System.out.println("文件最后修改日期" + new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss:SSS").format(new Date(file.lastModified())));
}

/**
 * chapter12/section01/FileUtils.java/deleteFile()
 * 删除文件
 */
public static void deleteFile(String fileFullName) {
    File file = new File(fileFullName);
    if (!file.exists()) { // exists()方法用于判断文件是否存在
        System.out.println(fileFullName + "文件不存");
        return;
    }
    if (!file.isFile()) { // isFile()方法用于判断File对象指向的是否是文件
        System.out.println(fileFullName + "不是文件，停止删除");
        return;
    }
    if (file.canExecute()) { // canExecute()判断是否有删除权限
        file.delete();       // delete()方法用于删除文件
    } else {
        System.out.println("没有删除权限");
    }
}

/**
 * chapter12/section01/FileUtils.java/createFolder()
 * 创建目录
 */
public static void createFolder(String folderPath) {
    File file = new File(folderPath);
    if (!file.exists()) {   // exists()方法用于判断文件是否存在
        file.mkdirs();     // mkdirs()方法用于创建多级目录
    }
}

/**
 * chapter12/section01/FileUtils.java/createFile()
 * 创建文件
 */
public static void createFile(String folderPath, String fileName) throws IOException {
    File file = new File(folderPath, fileName);
    if (!(file.exists())) {
        file.createNewFile();  // createNewFile()方法用于创建文件
    }
}

/**
 * chapter12/section01/FileUtils.java/listFile()
 * 显示指定目录下的子目录和文件
 */
public static void listFile(String diskName) {
    File file = new File(diskName);
    File[] files = file.listFiles();   //  listFiles()方法获取指定目录中的子目录和文件
    if (files != null && files.length > 0) {
        for (int i = 0; i < files.length; i++) {
            // isDirectory()方法用于判断File对象指向的是否是目录
            if (files[i].isDirectory()) {
                System.out.println("目录名：" + files[i].getAbsolutePath());
            }
            if (files[i].isFile()) {  // isFile()方法用于判断File对象指向的是否是文件
                System.out.println("这是文件：" + files[i].getName());
            }
        }
    }
}

/**
 * chapter12/section01/FileUtils.java/listDisk()
 * 显示系统盘符和磁盘空间
 */
public static void listDisk() {
    File[] disks = File.listRoots();  // listRoots()静态方法获取所有盘符
    if (disks != null) {
        for (File disk : disks) {
            System.out.println("磁盘：" + disk);
            System.out.println("\t磁盘大小：" +
                    disk.getTotalSpace() / 1000 / 1000 / 1000 + "G");
            System.out.println("\t磁盘剩余空间：" +
                    disk.getFreeSpace() / 1000 / 1000 / 1000 + "G");
        }
    }
}
}
