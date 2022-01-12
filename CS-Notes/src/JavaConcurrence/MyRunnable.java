package JavaConcurrence;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // ...
    }
    /**
     * @program: CS-Notes
     * @description: 实现Runnable接口
     * @author: Log1c
     * @create: 2022-01-04 01:59
     **/

    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();
        Thread thread = new Thread(instance);
        thread.start();
    }
}
