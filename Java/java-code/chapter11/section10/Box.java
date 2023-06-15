package chapter11.section10;

// chapter11/section10/Box.java
public class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Apple {}
class Orange {}
class Banana {}
