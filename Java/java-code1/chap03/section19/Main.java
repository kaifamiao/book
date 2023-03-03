package chap03.section19;

// chap03/section19
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if(i%4==0){
                return;
            }
            System.out.println(i+" ");
        }
        System.out.println("循环结束");
    }
}
