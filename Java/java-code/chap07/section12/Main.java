package chap07.section12;

// chap07/section12/Main
public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String result = sb.toString();
        System.out.println(result); // Hello World
    }
}