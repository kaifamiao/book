package chap10.section08;

import java.util.HashMap;
import java.util.Hashtable;

// chap10/section08/Main.java
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setName("扈三娘");
            person.setAge(18);
            person.setGender("Female");
            person.print();
        } catch (GenderException e) {//在main()方法中捕获GenderException异常
            e.printStackTrace();
        }
        new HashMap<>();
    }
}

// 自定义异常类GenderException
class GenderException extends Exception {
    public GenderException(String message) {
        super(message);
    }
}