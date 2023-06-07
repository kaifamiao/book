package chap08.section03;

// chap08/section03/CalendarDateConversionExample.java
import java.util.Calendar;
import java.util.Date;
public class CalendarDateConversionExample {
    public static void main(String[] args) {
        // 创建一个Calendar对象
        Calendar calendar = Calendar.getInstance();
        // 获取当前日期和时间
        Date currentDate = calendar.getTime();
        // Current Date: Wed May 31 09:53:28 CST 2023
        System.out.println("Current Date: " + currentDate);
        // 将Calendar转换为Date
        Date convertedDate = calendarToDate(calendar);
        // Converted Date: Wed May 31 09:53:28 CST 2023
        System.out.println("Converted Date: " + convertedDate);
        // 创建一个新的Date对象
        Date newDate = new Date();
        // 将Date转换为Calendar
        Calendar convertedCalendar = dateToCalendar(newDate);
        // Converted Calendar: Wed May 31 09:53:28 CST 2023
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

