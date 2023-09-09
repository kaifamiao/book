package chapter12.section04;

// chapter12/section04/JacksonExample.java
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;

public class JacksonExample {
    public static void main(String[] args) {
        // 创建一个Java对象
        Person person = new Person("John", 30, true, Arrays.asList("reading", "traveling"));
        // 将Java对象转换成JSON格式
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(person);
            System.out.println(json);
            // 创建一个JSON格式字符串
            String jsonStr = "{\"name\":\"John\",\"age\":30,\"isMarried\":true," +
                    "\"hobbies\":[\"reading\",\"traveling\"]}";
            // 将JSON格式字符串转换成Java对象
            Person person1 = mapper.readValue(json, Person.class);
            System.out.println(person1.getName());
            System.out.println(person1.getAge());
            System.out.println(person1.isMarried());
            System.out.println(person1.getHobbies());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
