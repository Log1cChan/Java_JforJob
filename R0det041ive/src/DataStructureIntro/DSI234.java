package DataStructureIntro;

import java.util.Stack;

public class DSI234 {
    /**
     * @program: R0det041ive
     * @description: 回文链表
     * @author: Log1c
     * @create: 2021-12-24 02:45
     **/

    public static boolean isPalindrome(ListNode head) {
//        Stack<ListNode> s = new Stack<ListNode>();
//        ListNode p = head;
//        while (p!=null){
//            s.push(p);
//            p = p.next;
//        }
//        p = head;
//        int size = s.size();
//        while(s.size()>size/2){
//            if (s.peek().val!=p.val){
//                return false;
//            }
//            p = p.next;
//            s.pop();
//        }
//        return true;

//        O(1)复杂度，使用快慢指针，切成两半，比较两半是否相等
        if(head == null || head.next == null) return true;
        ListNode slow = head, fast = head.next;
//        当fast到底，slow在中间
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
//        偶数节点时，令slow指向下一节点
        if(fast!=null) slow = slow.next;
        cut(head, slow);
        return isEqual(head, reverse(slow));
    }

//    分割链表
    private static void cut(ListNode head, ListNode cutNode){
        while(head.next!=cutNode){
            head = head.next;
        }
        head.next = null;
    }

//    反转链表:头插法
    private static ListNode reverse(ListNode head){
        ListNode newHead = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = newHead;
            newHead = head;
            head = nextNode;
        }
        return newHead;
    }

//    判断回文
private static boolean isEqual(ListNode l1, ListNode l2) {
    while (l1 != null && l2 != null) {
        if (l1.val != l2.val) return false;
        l1 = l1.next;
        l2 = l2.next;
    }
    return true;
}

    public static void main(String[] args) {
        int[] a1 = {1,2,1,2};
        ListNode l1 = new ListNode(-1);
        ListNode p =l1;
        for (int i=0; i<a1.length; i++){
            p.next = new ListNode(a1[i]);
            p = p.next;
        }
        System.out.println(isPalindrome(l1.next));
    }
}
