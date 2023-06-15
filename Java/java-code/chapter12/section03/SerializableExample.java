package chapter12.section03;

// chapter12/section03/SerializableExample.java
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {

    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
            // 1:创建序列化对象 oos
            oos = new ObjectOutputStream(new FileOutputStream("E:\\kfm\\Student.txt"));
            // 2：创建被序列化的对象 s
            Student s = new Student("解真", 60);
            // 3：开始序列化(将s的状态name="解真"，score=60 保存到Student.txt中)
            oos.writeObject(s);
            System.out.println("序列化完成");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("操作文件失败！");
        } finally {
            //4:关闭流
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
