package AlgorithmIntro;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AI876 {
    /**
     * @program: R0det041ive
     * @description: Find the mid node of the linklist
     * @author: Log1c
     * @create: 2021-12-07 17:08
     **/
    public static ListNode middleNode(ListNode head) {
//        Solution 1:
//        int count = 0;
//        ListNode p = head;
//        while (p!=null){
//            count++;
//            p = p.next;
//        }
//        p = head;
//        for (int i=0; i<count/2; i++){
//            p = p.next;
//        }

//        Solution 2:
        ListNode[] l = new ListNode[101];
        ListNode p = head;
        int count = 0;
        while(p!=null){
            count++;
            l[count] = p;
            p = p.next;
        }
        return l[count/2+1];
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int[] input = {1,2,3,4,5};
        for (int i = 0; i < input.length; i++){
            ListNode s = new ListNode(input[i]);
            temp.next = s;
            temp = s;
        }
        System.out.println(middleNode(head).val);
    }
}
