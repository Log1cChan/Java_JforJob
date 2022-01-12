package JavaConcurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotifyExample {
    /**
     * @program: CS-Notes
     * @description: wait()方法以及notify
     * @author: Log1c
     * @create: 2022-01-04 23:34
     **/
    public synchronized void before(){
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after(){
        try{
            wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("after");
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        WaitNotifyExample example = new WaitNotifyExample();
        executor.execute(() -> example.after());
        executor.execute(() -> example.before());
    }
}
