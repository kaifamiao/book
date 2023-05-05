package chap13.section05;

// chap13/section05/Producer.java
// 生产者线程类
public class Producer extends Thread {
    private SharedData s;

    public Producer(SharedData s) {
        this.s = s;
    }

    @Override
    public void run() {
        for (char ch = 'A'; ch <= 'D'; ch++) {
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (Exception e) {
                e.printStackTrace();
            }
            s.putShareChar(ch); // 将产品放入仓库
        }
    }
}
