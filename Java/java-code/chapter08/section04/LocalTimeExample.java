package chapter08.section04;

// chapter08/section04/LocalTimeExample.java
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
    public static void main(String[] args) {
        // 创建LocalTime对象
        LocalTime now = LocalTime.now();
        System.out.println("当前时间: " + now);

        LocalTime specificTime = LocalTime.of(14, 30);
        System.out.println("指定时间: " + specificTime);

        // 解析字符串为LocalTime对象
        LocalTime parsedTime = LocalTime.parse("08:45:30");
        System.out.println("解析后的时间: " + parsedTime);

        // 获取时间信息
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println("小时数: " + hour);
        System.out.println("分钟数: " + minute);
        System.out.println("秒数: " + second);

        // 增加/减少时间
        LocalTime futureTime = now.plusHours(3);
        LocalTime pastTime = now.minusMinutes(15);
        System.out.println("未来时间: " + futureTime);
        System.out.println("过去时间: " + pastTime);

        // 判断时间关系
        boolean isBefore = now.isBefore(specificTime);
        boolean isAfter = now.isAfter(specificTime);
        boolean isEqual = now.equals(specificTime);
        System.out.println("当前时间是否在指定时间之前: " + isBefore);
        System.out.println("当前时间是否在指定时间之后: " + isAfter);
        System.out.println("当前时间是否与指定时间相等: " + isEqual);

        // 格式化时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = now.format(formatter);
        System.out.println("格式化后的时间: " + formattedTime);
    }
}

