package chap09.section04;

// chap09/section04/USBInterface.java
public interface USBInterface { // 定义USB接口
    // 定义默认方法，默认方法可以被子类覆盖，也可以被子类直接继承使用
    public default void service() {
        System.out.println("请使用USB接口");
    }
}

// 定义U盘类，实现USB接口
class UDisk implements USBInterface {
    // 重写接口中的方法
    public void service() {
        System.out.println("连接USB接口，开始传输数据");
    }
}

// 定义风扇类，实现USB接口
class UsbFan implements USBInterface {

}

