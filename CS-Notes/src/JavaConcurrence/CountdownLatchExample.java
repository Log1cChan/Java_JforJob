package JavaConcurrence;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountdownLatchExample {
    /**
     * @program: CS-Notes
     * @description: AQS中的CountDownLatch
     * @author: Log1c
     * @create: 2022-01-05 00:01
     **/

    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i=0; i<totalThread; i++){
            executor.execute(() -> {
                System.out.println("run..");
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();     // 此时main属于是等待状态 等所有线程运行完
        System.out.println("End");
        executor.shutdown();
    }
}
