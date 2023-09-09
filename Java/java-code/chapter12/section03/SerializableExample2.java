package chapter12.section03;

// chapter12/section03/SerializableExample2.java
import java.io.*;

public class SerializableExample2 {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("E:\\kfm\\Student.txt");
            ObjectInputStream ois = new ObjectInputStream(in);){
            // 2：开始反序列化
            Student s1 = (Student) ois.readObject();
            //3：输出反序列化后的学生状态
            System.out.println("姓名"+s1.getName()+"，成绩"+s1.getScore());
            System.out.println("反序列化完成");
        } catch (ClassNotFoundException e) {
            System.out.println("类未找到！");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("操作文件失败！");
        }
    }
}
