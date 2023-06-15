package chapter09.section08;

// chapter09/section08/A2.java
public interface A2{
    void show();
}

class Test02 {
    public static void main(String[] args) {
        A2 a1 = new A2() {
            public void show() {
                System.out.println("我是匿名类的show()方法");
            }
        };
        a1.show();
    }
}