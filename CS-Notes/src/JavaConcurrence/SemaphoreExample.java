package JavaConcurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    /**
     * @program: CS-Notes
     * @description: 使用Semaphore控制互斥资源访问
     * @author: Log1c
     * @create: 2022-01-05 00:51
     **/

    public static void main(String[] args) {
        final int clientCount = 3;
        final int totalRequestCount = 10;
        Semaphore semaphore = new Semaphore(clientCount);   // 构造函数
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i=0; i<totalRequestCount; i++){
            executor.execute(()->{
                try{
                    semaphore.acquire();    // 请求访问
                    System.out.print(semaphore.availablePermits() + " ");
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    semaphore.release();    // 释放信号量
                }
            });
        }
        executor.shutdown();
    }
}
