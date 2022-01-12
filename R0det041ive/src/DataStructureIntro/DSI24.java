package DataStructureIntro;

public class DSI24 {
    /**
     * @program: R0det041ive
     * @description: 两两交换链表中的节点
     * @author: Log1c
     * @create: 2021-12-24 01:22
     **/

    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode preHead = new ListNode(-1);
        ListNode p = preHead;
        while(head!=null && head.next!=null){
            p.next = new ListNode(head.next.val);
            p = p.next;
            p.next = new ListNode(head.val);
            p = p.next;
            head = head.next.next;
        }
        p.next = head;

        return preHead.next;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = new ListNode(arr[0]);
        ListNode p = head;
        int n = arr.length;
        for (int i=1; i<n; i++){
            p.next = new ListNode(arr[i]);
            p = p.next;
        }
        head = swapPairs(head);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
