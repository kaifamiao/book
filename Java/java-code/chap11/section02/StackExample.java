package chap11.section02;

// chap11/section02/StackExample.java
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // 创建一个空的Stack对象
        Stack<Integer> stack = new Stack<>();
        // 向Stack中添加元素
        stack.push(1); // 将元素1推入栈顶
        stack.push(2); // 将元素2推入栈顶
        stack.push(3); // 将元素3推入栈顶
        // 从Stack中弹出元素
        // 弹出栈顶元素并赋值给变量poppedElement
        int poppedElement = stack.pop();
        System.out.println(poppedElement); // 输出：3
        // 查看栈顶元素但不弹出
        int peekedElement = stack.peek(); // 查看栈顶元素但不弹出
        System.out.println(peekedElement); // 输出：2
        // 判断栈是否为空
        boolean isEmpty = stack.isEmpty(); // 判断栈是否为空
        System.out.println(isEmpty); // 输出：false
        // 获取栈中元素的个数
        int size = stack.size(); // 获取栈中元素的个数
        System.out.println("Stack size: " + size); // 输出：2
        // 搜索元素在栈中的位置
        // 搜索元素1在栈中的位置，返回相对于栈顶的位置
        int index = stack.search(1);
        System.out.println(index); // 输出： -1，表示未找到
    }
}
