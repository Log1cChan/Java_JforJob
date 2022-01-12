package JavaConcurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    /**
     * @program: CS-Notes
     * @description: ReentrantLock的理解
     * @author: Log1c
     * @create: 2022-01-04 15:53
     **/
    private Lock lock = new ReentrantLock();

    public void func(){
        lock.lock();
        try{
            for (int i=0; i<10; i++){
                System.out.print(i+" ");
            }
        }finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> lockExample.func());
        executorService.execute(() -> lockExample.func());
        executorService.shutdown();
    }
}
