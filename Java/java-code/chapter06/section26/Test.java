package chapter06.section26;

// chapter06/section26/Test.java
public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        child.print(); // Child.print()
        // name = 子类, age = 12, weight = 23.0, key = kfm-mxr2
        child.printInfo();
        System.out.println(child.name); // 子类
        System.out.println(child.age); // 12
        System.out.println(child.weight); // 23.0
        System.out.println(child.key); // kfm-mxr2

        Parent child1 = new Child();
        child1.print(); // Parent.print()
         // name = 子类, age = 12, weight = 23.0, key = kfm-mxr2
        child1.printInfo();
        System.out.println(child1.name); // 父类
        System.out.println(child1.age);  // 20
        System.out.println(child1.weight); // 45.5
        System.out.println(child1.key);  // kfm-mxr
    }
}
