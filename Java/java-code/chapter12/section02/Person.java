package chapter12.section02;

// chapter12/section02/Person.java
public class Person implements Cloneable {
    private String name;
    private Address address;
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
