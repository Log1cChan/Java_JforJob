package JavaConcurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample {
    /**
     * @program: CS-Notes
     * @description: 互斥同步的实现
     * @author: Log1c
     * @create: 2022-01-04 15:38
     **/

    public void func1(){
        synchronized(this){
            for (int i=0; i<10; i++){
                System.out.print(i+" ");
            }
        }
    }

//    同步一个方法，同样作用于同一对象
    public synchronized void func () {
        // ...
    }

    public void func2(){
        synchronized(SynchronizedExample.class){
            for(int i=0; i<10; i++){
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String[] args) {
//        作用于同一个对象时
//        SynchronizedExample e1 = new SynchronizedExample();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(() -> e1.func1());
//        executorService.execute(() -> e1.func1());

//        作用于两个对象时
        SynchronizedExample e1 = new SynchronizedExample();
        SynchronizedExample e2 = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func2());
        executorService.execute(() -> e2.func2());
    }
}
