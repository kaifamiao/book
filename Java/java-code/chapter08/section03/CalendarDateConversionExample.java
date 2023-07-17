package chapter08.section03;

// chapter08/section03/CalendarDateConversionExample.java

import java.util.Calendar;
import java.util.Date;

public class CalendarDateConversionExample {
    public static void main(String[] args) {
        // 创建一个Calendar对象
        Calendar calendar = Calendar.getInstance();
        // 设置日期为指定的年份、月份和日
        calendar.set(1970, 1, 1);
        // 获取当前日期和时间
        Date date = calendar.getTime();
        // Date: Sun Feb 01 19:55:31 CST 1970
        System.out.println("Date: " + date);
        // 将Calendar转换为Date
        Date convertedDate = calendarToDate(calendar);
        // Converted Date: Sun Feb 01 19:55:31 CST 1970
        System.out.println("Converted Date: " + convertedDate);
        // 创建一个新的Date对象
        Date newDate = new Date(70, 1, 1);
        // 将Date转换为Calendar
        Calendar convertedCalendar = dateToCalendar(newDate);
        // Converted Calendar: Sun Feb 01 00:00:00 CST 1970
        System.out.println("Converted Calendar: " + convertedCalendar.getTime());
    }

    // 将Calendar对象转换为Date对象
    public static Date calendarToDate(Calendar calendar) {
        return calendar.getTime();
    }

    // 将Date对象转换为Calendar对象
    public static Calendar dateToCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
}

