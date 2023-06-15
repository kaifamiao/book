package chapter07.section08;

// chapter07/section08/IntegerTest03.java
public class IntegerTest03 {

    public static void main(String[] args) {
        // 装箱：将int类型转换为Integer类型
        int i = 100;
        Integer integerObj = new Integer(i);
        Integer integerObj2 = Integer.valueOf(i);

        // 拆箱：将Integer类型转换为int类型
        Integer integerObj3 = new Integer(200);
        int j = integerObj3.intValue();
        int k = integerObj3; // 自动拆箱

    }
}
