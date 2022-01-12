package DataStructureIntro;

public class DSI83 {
    /**
     * @program: R0det041ive
     * @description: 删除排序链表中的重复元素
     * @author: Log1c
     * @create: 2021-12-24 01:03
     **/

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

    public static ListNode deleteDuplicates(ListNode head) {
//        if(head==null || head.next==null) return head;
//        ListNode preHead = new ListNode(-101);
//        ListNode p = preHead;
//        while(head!=null){
//            if(p.val != head.val){
//                p.next = head;
//                p = p.next;
//            }
//            head = head.next;
//        }
//        p.next = null;
//
//        return preHead.next;

//        递归方法：
        if (head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }

    public static void main(String[] args) {
        ListNode a5 = new ListNode(3);
        ListNode a4 = new ListNode(3, a5);
        ListNode a3 = new ListNode(2, a4);
        ListNode a2 = new ListNode(1, a3);
        ListNode a1 = new ListNode(1, a2);
        ListNode p = deleteDuplicates(a1);
        while(p!=null){
            System.out.println(p.val);
            p = p.next;
        }
    }
}
