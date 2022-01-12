package JavaConcurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterruptExample {
    /**
     * @program: CS-Notes
     * @description: 使用interrupt()方法来中断线程
     * @author: Log1c
     * @create: 2022-01-04 02:30
     **/
//    这里是实现的interrupt()方法
    private static class MyThread1 extends Thread{
        public void run(){
            try {
                Thread.sleep(200);
                System.out.println("Thread Run");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

//    这里测试interrupted()判断中断状态
    private static class MyThread2 extends Thread{
        public void run(){
            while(!interrupted()){  // 判断啦
                System.out.println("并没有被中断");
            }
            System.out.println("Thread End");
        }
}

    public static void main(String[] args) throws InterruptedException{
//        Thread thread1 = new MyThread1();
//        thread1.start();
//        thread1.interrupt();
//        System.out.println("Main Running");


//        Thread thread2 = new MyThread2();
//        thread2.start();
//        thread2.interrupt();

//        测试使用Executor的shutdown结束
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            try{
                Thread.sleep(2000);
                System.out.println("Thread Run");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });
        // 立刻停止每个线程
        executorService.shutdownNow();
        // 等待每个线程执行完毕后停止它
//        executorService.shutdown();
        System.out.println("Main Run");
    }
}
