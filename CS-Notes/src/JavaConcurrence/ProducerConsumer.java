package JavaConcurrence;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    /**
     * @program: CS-Notes
     * @description: 使用BlockingQueue实现生产者消费者问题
     * @author: Log1c
     * @create: 2022-01-05 01:13
     **/

    private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

    // 生产者，只有当阻塞队列不为满时可以放入
    private static class Producer extends Thread{
        public void run(){
            try{
                queue.put("product");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("produce...");
        }
    }

    // 消费者，只有当阻塞队列不为空时可以拿出
    private static class Consumer extends Thread{
        public void run(){
            try{
                String product = queue.take();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("consume..");
        }
    }


    // 运行程序，可以见得，阻塞的厉害！
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Producer producer = new Producer();
            producer.start();
        }
        for (int i = 0; i < 5; i++) {
            Consumer consumer = new Consumer();
            consumer.start();
        }
        for (int i = 0; i < 3; i++) {
            Producer producer = new Producer();
            producer.start();
        }
    }
}
