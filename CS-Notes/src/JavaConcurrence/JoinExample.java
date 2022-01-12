package JavaConcurrence;

public class JoinExample {
    /**
     * @program: CS-Notes
     * @description: 线程协作中的join方法
     * @author: Log1c
     * @create: 2022-01-04 16:13
     **/

    private class A extends Thread{
        public void run(){
            System.out.println("A");
        }
    }

    private class B extends Thread{
        private A a;
        B(A a){
            this.a = a;
        }

        public void run(){
            try{
                a.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test(){
        A a = new A();
        B b = new B(a);
        b.start();
        a.start();
    }

    public static void main(String[] args) {
        JoinExample example = new JoinExample();
        example.test();
    }
}
