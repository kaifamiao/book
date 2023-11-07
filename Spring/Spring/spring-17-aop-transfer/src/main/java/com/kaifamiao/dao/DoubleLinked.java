package com.kaifamiao.dao;

public class DoubleLinked {

    public static void main(String[] args) {
        DoubleLinked linked = new DoubleLinked();
        linked.addHead("A");
        linked.addHead("B");
        linked.addHead("C");
        linked.display();
    }

   //定义一个内部类Node，Node实例代表链表的节点
    private class Node{
        private Object data;
        private Node next;
        private Node prev;
        public Node(Object data){
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    //初始化
    public DoubleLinked(){
        head = null;
        tail = null;
        size = 0;
    }
    //判断是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    //获取链表长度
    public int getSize(){
        return size;
    }
    //在链表头部添加元素
    public void addHead(Object data){
        Node node = new Node(data);
        if(size == 0){
            head = node;
            tail = node;
            size++;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
            size++;
        }
    }
    //在链表尾部添加元素
    public void addTail(Object data){
        Node node = new Node(data);
        if(size == 0){
            head = node;
            tail = node;
            size++;
        }else{
            node.prev = tail;
            tail.next = node;
            tail = node;
            size++;
        }
    }
    //删除链表头部元素
    public Node deleteHead(){
        Node temp = head;
        if(size != 0){
            head = head.next;
            head.prev = null;
            size--;
        }
        return temp;
    }
    //删除链表尾部元素
    public Node deleteTail(){
        Node temp = tail;
        if(size != 0){
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        return temp;
    }
    //删除指定元素，删除成功返回true
    public boolean delete(Object value){
        if(size == 0){
            return false;
        }
        Node current = head;
        Node previous = head;
        while(current.data != value){
            if(current.next == null){
                return false;
            }else{
                previous = current;
                current = current.next;
            }
        }
        if(current == head){
            head = head.next;
            head.prev = null;
            size--;
        }else if(current == tail){
            tail = tail.prev;
            tail.next = null;
            size--;
        }else{
            previous.next = current.next;
            current.next.prev = previous;
            size--;
        }
        return true;
    }
    //判断是否包含某个元素
    public boolean contains(Object value){
        if(size == 0){
            return false;
        }
        Node current = head;
        while(current.data != value){
            if(current.next == null){
                return false;
            }else{
                current = current.next;
            }
        }
        return true;
    }
    //根据下标获取元素
    public Node getByIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        int i = 0;
        while(i != index){
            current = current.next;
            i++;
        }
        return current;
    }
    //根据下标修改元素
    public boolean modifyByIndex(int index,Object value){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        int i = 0;
        while(i != index){
            current = current.next;
            i++;
        }
        current.data = value;
        return true;
    }
    //根据下标插入元素
    public boolean insertByIndex(int index,Object value){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node node = new Node(value);
        Node current = head;
        int i = 0;
        while(i != index){
            current = current.next;
            i++;
        }
        if(current == head){
            node.next = head;
            head.prev = node;
            head = node;
            size++;
        }else{
            node.next = current;
            node.prev = current.prev;
            current.prev.next = node;
            current.prev = node;
            size++;
        }
        return true;
    }
    //打印链表
    public void display(){
        if(size == 0){
            System.out.println("[]");
        }else{
            Node current = head;
            System.out.print("[");
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println("]");
        }
    }


}
