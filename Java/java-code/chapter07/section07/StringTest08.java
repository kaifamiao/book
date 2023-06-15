package chapter07.section07;

// chapter07/section07/StringTest08.java
public class StringTest08 {

    public static void main(String[] args) {
        String path = "E:\\Image\\开发喵\\logo.png";
        int startIndex = path.lastIndexOf("\\");
        int endIndex = path.lastIndexOf(".");
        String fileName = path.substring(startIndex + 1, endIndex);
        System.out.println(path + "路径中的文件是：" + fileName); // logo
    }
}
