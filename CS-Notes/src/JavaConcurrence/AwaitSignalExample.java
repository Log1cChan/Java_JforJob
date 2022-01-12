package JavaConcurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AwaitSignalExample {
    /**
     * @program: CS-Notes
     * @description: 使用await() and signal()
     * @author: Log1c
     * @create: 2022-01-04 23:44
     **/
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();  // condition 依赖于Lock接口 调用方法必须在lock保护之内

    public void before(){
        lock.lock();
        try{
            System.out.println("before");
            condition.signalAll();
        }finally{
            lock.unlock();
        }
    }

    public void after(){
        lock.lock();
        try{
            condition.await();
            System.out.println("after");
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        AwaitSignalExample example = new AwaitSignalExample();
        executor.execute(() -> example.after());
        executor.execute(() -> example.before());
    }
}
