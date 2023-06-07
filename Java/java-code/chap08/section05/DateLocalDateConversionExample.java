package chap08.section05;

// chap08/section05/DateLocalDateConversionExample.java
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateLocalDateConversionExample {
    public static void main(String[] args) {
        // 将Date对象转换为LocalDate对象
        Date date = new Date(70, 0, 1);
        LocalDate localDate = dateToLocalDate(date);
        // Date对象转换为LocalDate对象: 1970-02-01
        System.out.println("Date对象转换为LocalDate对象: " + localDate);

        // 将LocalDate对象转换为Date对象
        LocalDate localDate1 = LocalDate.of(1970, 1, 1);
        Date convertedDate = localDateToDate(localDate1);
        // LocalDate对象转换为Date对象: Thu Jan 01 00:00:00 CST 1970
        System.out.println("LocalDate对象转换为Date对象: " + convertedDate);
    }

    // 将Date对象转换为LocalDate对象
    public static LocalDate dateToLocalDate(Date date) {
        ZoneId zoneId = ZoneId.systemDefault();
        return date.toInstant().atZone(zoneId).toLocalDate();
    }

    // 将LocalDate对象转换为Date对象
    public static Date localDateToDate(LocalDate localDate) {
        ZoneId zoneId = ZoneId.systemDefault();
        return Date.from(localDate.atStartOfDay(zoneId).toInstant());
    }
}
