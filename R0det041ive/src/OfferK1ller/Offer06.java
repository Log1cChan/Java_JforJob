package OfferK1ller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer06 {
    /**
     * @program: R0det041ive
     * @description: 从尾到头打印链表
     * @author: Log1c
     * @create: 2021-12-20 21:17
     **/

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static int[] reversePrint(ListNode head) {
//        LinkedList<Integer> list = new LinkedList<>();
//        while (head!=null){
//            list.add(head.val);
//            head = head.next;
//        }
//        int[] res = new int[list.size()];
//
//        for(int i=0; i< res.length; i++){
//            res[i] = list.removeLast();
//        }

        ListNode p = head;
        int count = 0;
        while (p!=null){
            count++;
            p = p.next;
        }
        int res[] = new int[count];

        while (head!=null){
            res[--count] = head.val;
            head = head.next;
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p1 = new ListNode(3);
        ListNode p2 = new ListNode(2);
        head.next = p1;
        p1.next = p2;
        int[] res = reversePrint(head);
        for (int i : res){
            System.out.println(i);
        }
    }
}
