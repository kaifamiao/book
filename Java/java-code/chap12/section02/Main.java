package chap12.section02;

// chap12/section02/Main.java
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("City A");
        Person originalPerson = new Person("John", address);

        // 浅拷贝
        Person shallowCopyPerson = (Person) originalPerson.clone();

        // 深拷贝
        Person deepCopyPerson = new Person(originalPerson.getName(),
                new Address(originalPerson.getAddress().getCity()));

        // 修改原始对象的地址信息
        originalPerson.getAddress().setCity("City B");

        // 输出浅拷贝和深拷贝的地址信息
        System.out.println("浅拷贝的地址：" + shallowCopyPerson.getAddress().getCity());
        System.out.println("深拷贝的地址：" + deepCopyPerson.getAddress().getCity());
    }
}

