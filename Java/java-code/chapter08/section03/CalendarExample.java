package chapter08.section03;

// chapter08/section03/CalendarExample.java
import java.util.Calendar;
import java.util.Date;
public class CalendarExample {
    public static void main(String[] args) {
        // 获取当前日期和时间的Calendar对象
        Calendar calendar = Calendar.getInstance();
        // 设置日期为指定的年份、月份和日
        calendar.set(1970, 1, 1);
        // 获取年份
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year); // 1970
        // 获取月份（需要注意，月份从0开始计数）
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println(month); // 2
        // 获取当前是月份中的第几天
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth); // 1
        // 在月份上增加1
        calendar.add(Calendar.MONTH, 1);
        // 输出修改后的日期
        System.out.println(calendar.getTime()); // Sun Mar 01 19:54:31 CST 1970
        // 将Calendar转换为Date对象
        Date date = calendar.getTime();
        System.out.println(date); // Sun Mar 01 19:54:31 CST 1970
    }
}
