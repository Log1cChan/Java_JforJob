package DataStructureIntro;

import java.util.Stack;

public class DSI206 {
    /**
     * @program: R0det041ive
     * @description: 反转链表
     * @author: Log1c
     * @create: 2021-12-23 20:11
     **/
    //    链表结构
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
        ListNode(int x, ListNode next){
            val = x;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
//        使用栈(我的笨方法)
//        if(head == null) return null;
//        Stack<ListNode> stack = new Stack<ListNode>();
//        ListNode p = head;
//        while(p!=null){
//            stack.push(new ListNode(p.val));
//            p = p.next;
//        }
//        p = stack.pop();
//        head = p;
//        while(stack.size()>0){
//            p.next = stack.pop();
//            p = p.next;
//        }
//        return head;

//        使用递归
//        if(head == null || head.next == null) return head;
//        ListNode next = head.next;
//        ListNode newHead = reverseList(next);
//        next.next = head;
//        head.next = null;
//        return newHead;

//        头插法！！！
        ListNode newHead = new ListNode(-1);
        while(head!=null){
//            暂存next
            ListNode next = head.next;
//            清空next
            head.next = newHead.next;
            newHead.next = head;
            head = next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        head.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        head = reverseList(head);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
