package JavaConcurrence;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return 123;
    }
    /**
     * @program: CS-Notes
     * @description: 实现Callable接口
     * @author: Log1c
     * @create: 2022-01-04 02:02
     **/

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }
}
