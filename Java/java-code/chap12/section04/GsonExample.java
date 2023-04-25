package chap12.section04;

// chap12/section04/GsonExample.java
import com.google.gson.Gson;
import java.util.Arrays;

public class GsonExample {
    public static void main(String[] args) {
        // 创建一个Java对象
        Person person = new Person("John", 30, true, Arrays.asList("reading", "traveling"));
        // 将Java对象转换成JSON格式
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);

        // 创建一个JSON格式字符串
        String jsonStr = "{\"name\":\"John\",\"age\":30,\"isMarried\"" +
                ":true,\"hobbies\":[\"reading\",\"traveling\"]}";
        // 将JSON格式字符串转换成Java对象
        Person person1 = gson.fromJson(json, Person.class);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.isMarried());
        System.out.println(person1.getHobbies());
    }
}
