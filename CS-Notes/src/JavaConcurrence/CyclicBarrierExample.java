package JavaConcurrence;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {
    /**
     * @program: CS-Notes
     * @description: 使用循环屏障
     * @author: Log1c
     * @create: 2022-01-05 00:15
     **/
    public static void main(String[] args) {
        final int totalThread = 10;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(totalThread);
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i=0; i<totalThread; i++){
            executor.execute(() -> {
                System.out.println("before..");
                try{
                    cyclicBarrier.await();  // 计数器会等所有的线程到达执行完before之后，再执行下一个
                }catch(InterruptedException | BrokenBarrierException e){
                    e.printStackTrace();
                }
                System.out.println("after");
            });
        }
        executor.shutdown();
    }
}
