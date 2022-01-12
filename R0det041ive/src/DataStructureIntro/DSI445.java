package DataStructureIntro;

import java.util.Stack;

public class DSI445 {
    /**
     * @program: R0det041ive
     * @description: 两数相加II
     * @author: Log1c
     * @create: 2021-12-24 01:59
     **/
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = buildStack(l1);
        Stack<Integer> s2 = buildStack(l2);
        ListNode head = new ListNode(-1);
        int carry = 0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int x = s1.isEmpty() ? 0 : s1.pop();
            int y = s2.isEmpty() ? 0 : s2.pop();
            int sum = x + y + carry;
            ListNode node = new ListNode(sum % 10);
            node.next = head.next;
            head.next = node;
            carry = sum / 10;
        }

        return head.next;
    }

    private static Stack<Integer> buildStack(ListNode l) {
        Stack<Integer> stack = new Stack<>();
        while (l != null) {
            stack.push(l.val);
            l = l.next;
        }
        return stack;
    }
    public static void main(String[] args) {
        int[] a1 = {7,2,4,3};
        int[] a2 = {5,6,4};
        ListNode l1 = new ListNode(-1);
        ListNode p =l1;
        ListNode l2 = new ListNode(-1);
        ListNode q = l2;
        for (int i=0; i<a1.length; i++){
            p.next = new ListNode(a1[i]);
            p = p.next;
        }
        for (int i=0; i<a2.length; i++){
            q.next = new ListNode(a2[i]);
            q = q.next;
        }
        ListNode res = addTwoNumbers(l1.next, l2.next);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
