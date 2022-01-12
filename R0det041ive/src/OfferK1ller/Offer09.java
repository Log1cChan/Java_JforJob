package OfferK1ller;

import java.util.Stack;

public class Offer09 {
    /**
     * @program: R0det041ive
     * @description: 用两个栈实现队列
     * @author: Log1c
     * @create: 2021-12-21 00:05
     **/

    class CQueue {
        Stack<Integer> sin;
        Stack<Integer> sout;

        public CQueue() {
            sin = new Stack<Integer>();
            sout = new Stack<Integer>();
        }

        public void appendTail(int value) {
            sin.push(value);
        }

        public int deleteHead() {
            if (sin.size() == 0 && sout.size() == 0){
                return -1;
            }else if(sin.size() > 0 && sout.size() == 0){
                while(sin.size() > 0){
                    sout.push(sin.pop());
                }
                return sout.pop();
            }else{
                return sout.pop();
            }
        }
    }

    public static void main(String[] args) {
        Offer09 o = new Offer09();
        Offer09.CQueue cq = o.new CQueue();
        System.out.println(cq.deleteHead());
        cq.appendTail(5);
        cq.appendTail(2);
        System.out.println(cq.deleteHead());
        System.out.println(cq.deleteHead());


    }
}
