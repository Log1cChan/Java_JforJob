package DataStructureIntro;

public class DSI328 {
    /**
     * @program: R0det041ive
     * @description: 奇偶链表
     * @author: Log1c
     * @create: 2021-12-24 05:45
     **/

    public static ListNode oddEvenList(ListNode head) {
//        if (head==null || head.next == null || head.next.next == null) return head;
//        ListNode preHead = head;
//        ListNode evenHead =head.next;
//        ListNode evenTail = evenHead;
//        ListNode p = evenTail.next;
//
//        while (p!=null){
//            evenTail.next = p.next;
//            p.next = evenHead;
//            head.next = p;
//            head = head.next;
//            evenTail = evenTail.next;
//            if(evenTail==null){
//                break;
//            }
//            p = evenTail.next;
//        }
//
//        return preHead;

//        一样的方法 只不过用更少空间了
        if (head == null) {
            return null;
        }
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        ListNode l1 = new ListNode(-1);
        ListNode p =l1;
        for (int i=0; i<a1.length; i++){
            p.next = new ListNode(a1[i]);
            p = p.next;
        }
        l1 = oddEvenList(l1.next);
        while (l1!=null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}
