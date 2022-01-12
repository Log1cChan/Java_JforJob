package DataStructureIntro;

public class ListNode {
    /**
     * @program: R0det041ive
     * @description: ListNode
     * @author: Log1c
     * @create: 2021-12-24 01:23
     **/
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
