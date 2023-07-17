package chapter08.section01;

// chapter08/section01/DateExample.java
import java.util.Date;
public class DateExample {
    public static void main(String[] args) {
        // 创建一个表示当前时间的Date对象
        Date date = new Date(99, 1, 1);
        // Date: Mon Feb 01 00:00:00 CST 1999
        System.out.println("Date: " + date);
        // 获取Date对象的时间（毫秒数）
        long timeInMillis = date.getTime();
        // Time in milliseconds: 917798400000
        System.out.println("Time in milliseconds: " + timeInMillis);
        // 创建一个指定时间的Date对象
        Date specifiedDate = new Date(1640886000000L);
        // Specified Date: Fri Dec 31 01:40:00 CST 2021
        System.out.println("Specified Date: " + specifiedDate);
        // 比较两个Date对象的时间
        boolean isBefore = date.before(specifiedDate);
        boolean isAfter = date.after(specifiedDate);
        boolean isEqual = date.equals(specifiedDate);
        // Is current date before specified date? true
        System.out.println("Is current date before specified date? " + isBefore);
        // Is current date after specified date? false
        System.out.println("Is current date after specified date? " + isAfter);
        // Is current date equal to specified date? false
        System.out.println("Is current date equal to specified date? " + isEqual);
    }
}

