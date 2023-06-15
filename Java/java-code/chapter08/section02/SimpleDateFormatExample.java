package chapter08.section02;

// chapter08/section02/SimpleDateFormatExample.java
import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date date = new Date();
        // 创建SimpleDateFormat对象，并指定格式化模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 格式化Date对象为字符串
        String formattedDate = sdf.format(date);
        // Formatted Date: 2023-05-31 09:47:33
        System.out.println("Formatted Date: " + formattedDate);
        // 解析字符串为Date对象
        String dateString = "2023-05-30 15:30:45";
        try {
            Date parsedDate = sdf.parse(dateString);
            // Parsed Date: Tue May 30 15:30:45 CST 2023
            System.out.println("Parsed Date: " + parsedDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

