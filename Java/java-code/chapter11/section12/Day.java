package chapter11.section12;

// chapter11/section12/Day.java
public enum Day {
    SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"),
    THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat");

    private final String shortName;

    // 构造函数
    Day(String shortName) {
        this.shortName = shortName;
    }

    // 获取枚举常量的简称
    public String getShortName() {
        return shortName;
    }
}
