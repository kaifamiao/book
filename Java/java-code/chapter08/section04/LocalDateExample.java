package chapter08.section04;

// chapter08/section04/LocalDateExample.java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        // 创建LocalDate对象
        LocalDate today = LocalDate.now();
//        System.out.println("今天的日期: " + today);
        LocalDate specificDate = LocalDate.of(1970, 1, 1);
        System.out.println("指定日期: " + specificDate);
        // 解析字符串为LocalDate对象
        LocalDate parsedDate = LocalDate.parse("1949-10-01");
        System.out.println("解析后的日期: " + parsedDate);
        // 获取日期信息
        int year = specificDate.getYear();
        int month = specificDate.getMonthValue();
        int day = specificDate.getDayOfMonth();
        System.out.println("年份: " + year);
        System.out.println("月份: " + month);
        System.out.println("日期: " + day);
        // 增加/减少日期
        LocalDate futureDate = specificDate.plusDays(7);
        LocalDate pastDate = specificDate.minusMonths(1);
        System.out.println("增加日期: " + futureDate);
        System.out.println("减少日期: " + pastDate);

        // 判断日期关系
        boolean isBefore = specificDate.isBefore(parsedDate);
        boolean isAfter = specificDate.isAfter(parsedDate);
        boolean isEqual = specificDate.isEqual(parsedDate);
        System.out.println("是否在指定日期之前: " + isBefore);
        System.out.println("是否在指定日期之后: " + isAfter);
        System.out.println("是否与指定日期相等: " + isEqual);

        // 格式化日期
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = specificDate.format(formatter);
        System.out.println("格式化后的日期: " + formattedDate);
    }
}

