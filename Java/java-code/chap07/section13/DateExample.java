package chap07.section13;

// chap07/section13/DateExample.java
import java.util.Date;
public class DateExample {
    public static void main(String[] args) {
        // 创建一个表示当前时间的Date对象
        Date currentDate = new Date();
        // Current Date: Wed May 31 09:53:28 CST 2023
        System.out.println("Current Date: " + currentDate);
        // 获取Date对象的时间（毫秒数）
        long timeInMillis = currentDate.getTime();
        // Time in milliseconds: 1640886000000
        System.out.println("Time in milliseconds: " + timeInMillis);
        // 创建一个指定时间的Date对象
        Date specifiedDate = new Date(1640886000000L);
        // Specified Date: Wed May 31 09:53:28 CST 2023
        System.out.println("Specified Date: " + specifiedDate);
        // 比较两个Date对象的时间
        boolean isBefore = currentDate.before(specifiedDate);
        boolean isAfter = currentDate.after(specifiedDate);
        boolean isEqual = currentDate.equals(specifiedDate);
        // Is current date before specified date? false
        System.out.println("Is current date before specified date? " + isBefore);
        // Is current date after specified date? true
        System.out.println("Is current date after specified date? " + isAfter);
        // Is current date equal to specified date? false
        System.out.println("Is current date equal to specified date? " + isEqual);
    }
}

