package chap11.section05;

// chap11/section05/PropertiesExample.java
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        // 创建 Properties 对象
        Properties properties = new Properties();
        // 设置属性值
        properties.setProperty("username", "kfm");
        properties.setProperty("password", "kaifamiao");
        // 获取属性值
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
