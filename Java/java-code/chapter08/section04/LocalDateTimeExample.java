package chapter08.section04;

// chapter08/section04/LocalDateTimeExample.java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class LocalDateTimeExample {
    public static void main(String[] args) {
        // 创建LocalDateTime对象
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime specificDateTime = LocalDateTime.of(1949, 10, 1, 14, 0);
        System.out.println("指定日期时间: " + specificDateTime);
        // 解析字符串为LocalDateTime对象
        LocalDateTime parsedDateTime = LocalDateTime.parse("1970-01-01T09:00:00");
        System.out.println("解析后的日期时间: " + parsedDateTime);
        // 获取日期和时间信息
        LocalDate date = specificDateTime.toLocalDate();
        int year = specificDateTime.getYear();
        int minute = specificDateTime.getMinute();
        System.out.println("日期部分: " + date);
        System.out.println("年份: " + year);
        System.out.println("分钟数: " + minute);
        // 增加/减少日期和时间
        LocalDateTime futureDateTime = specificDateTime.plusDays(7).plusHours(3);
        System.out.println("增加日期时间: " + futureDateTime);
        // 判断日期时间关系
        boolean isBefore = parsedDateTime.isBefore(specificDateTime);
        System.out.println("当前日期时间是否在指定日期时间之前: " + isBefore);
        // 格式化日期时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = parsedDateTime.format(formatter);
        System.out.println("格式化后的日期时间: " + formattedDateTime);
    }
}

