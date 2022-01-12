package AlgorithmIntro;

public class AI141 {
    /**
     * @program: R0det041ive
     * @description: 环形链表
     * @author: Log1c
     * @create: 2021-12-19 00:45
     **/
    public static boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode p1 = head, p2 = head.next;
        while (p1!=null&&p2!=null&&p2.next!=null){
            if (p1==p2){
                return true;
            }
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(0);
        ListNode p3 = new ListNode(-4);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p1;
        System.out.println(hasCycle(head));
    }
}
