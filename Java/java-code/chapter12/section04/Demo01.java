package chapter12.section04;

// chapter12/section04/Demo01.java
public class Demo01 {
    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException {
        Class c = Person.class;
        Person instance = (Person) c.newInstance();
        System.out.println(instance);
    }
}
