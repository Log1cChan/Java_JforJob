package JavaConcurrence;

public class MyThread extends Thread{
    /**
     * @program: CS-Notes
     * @description: 继承Thread类
     * @author: Log1c
     * @create: 2022-01-04 02:05
     **/

    public void run(){
        // ..
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
