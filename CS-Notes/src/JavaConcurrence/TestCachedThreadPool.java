package JavaConcurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCachedThreadPool {
    /**
     * @program: CS-Notes
     * @description: 测试CachedThreadPool
     * @author: Log1c
     * @create: 2022-01-04 02:15
     **/

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0; i<5; i++){
            executorService.execute(new MyRunnable(){
                public void run(){
                    System.out.println("hello");
                }
            });
        }
        executorService.shutdown();
    }
}
