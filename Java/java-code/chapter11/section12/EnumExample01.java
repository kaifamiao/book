package chapter11.section12;

// chapter11/section12/EnumExample01.java
public class EnumExample01 {
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Day[] allDays = Day.values();
        for (Day day : allDays) {
            System.out.println(day);
        }
    }
}
