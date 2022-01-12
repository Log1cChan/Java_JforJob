package JavaConcurrence;

public class TestDaemon {
    /**
     * @program: CS-Notes
     * @description: 设置守护线程
     * @author: Log1c
     * @create: 2022-01-04 02:20
     **/
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.setDaemon(true); // 这样就把这个线程设置为守护线程了
    }
}
