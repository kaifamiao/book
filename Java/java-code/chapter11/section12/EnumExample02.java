package chapter11.section12;

// chapter11/section12/EnumExample02.java
public class EnumExample02 {

    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY,
        JUNE, JULY, AUGUST, SEPTEMBER,
        OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        Month myMonth = Month.AUGUST;
        int position = myMonth.ordinal();
        System.out.println("The position of " + myMonth + " is " + position);
    }
}
