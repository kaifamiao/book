package chapter09.section03;

// chapter09/section03/USBInterface.java
public interface USBInterface { // 定义USB接口
    void service();
}

// 定义U盘类，实现USB接口
class UDisk implements USBInterface {
    // 实现接口中的抽象方法
    public void service() {
        System.out.println("连接USB接口，开始传输数据");
    }
}

// 定义风扇类，实现USB接口
class UsbFan implements USBInterface {
    // 实现接口中的抽象方法
    public void service() {
        System.out.println("连接USB接口，风扇转动");
    }
}