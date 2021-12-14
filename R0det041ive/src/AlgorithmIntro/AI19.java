package AlgorithmIntro;

public class AI19 {
    /**
     * @program: R0det041ive
     * @description: Remove the certain node from linklist
     * @author: Log1c
     * @create: 2021-12-07 22:31
     **/
    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        Solution 1:
//        ListNode[] l = new ListNode[31];
//        ListNode p = head;
//        int count = 0;
//        while(p!=null){
//            l[count] = p;
//            count++;
//            p = p.next;
//        }
//        if (count-n-1 < 0 && count-n+1 < count){
//            head = l[count-n+1];
//        }else if (count-n-1 < 0 && count-n+1 >= count){
//            head = null;
//        }else if (count-n-1 >= 0 && count-n+1 < count){
//            l[count-n-1].next = l[count-n+1];
//        }else{
//            l[count-n-1].next = null;
//        }
//
//        Solution 2:




        return head;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        int n = 2;
        ListNode head = new ListNode(input[0]);
        ListNode temp = head;
        for (int i = 1; i < input.length; i++){
            ListNode s = new ListNode(input[i]);
            temp.next = s;
            temp = s;
        }
        head = removeNthFromEnd(head, n);
        ListNode p = head;
        while(p!=null){
            System.out.println(p.val);
            p=p.next;
        }
    }

}
