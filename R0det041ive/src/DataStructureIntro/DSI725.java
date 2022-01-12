package DataStructureIntro;

import java.util.Stack;

public class DSI725 {
    /**
     * @program: R0det041ive
     * @description: 分隔链表
     * @author: Log1c
     * @create: 2021-12-24 03:41
     **/

    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        ListNode p = head;
        int count = 0;
        while(p!=null){
            p = p.next;
            count++;
        }
        int mod = count%k>=count?0:count%k;
        int n = count/k==0?1:count/k;
        p = head;
        int add = 0;
        for (int i = 0; i < k; i++){
            res[i] = p;
            if(mod>0){
                add = 1;
                mod--;
            }else{
                add = 0;
            }
            for (int j = 0; j < n+add && p!=null; j++){
                if(j == n+add-1){
                    ListNode tmp = p.next;
                    p.next = null;
                    p = tmp;
                }else{
                    p = p.next;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        ListNode l1 = new ListNode(-1);
        ListNode p =l1;
        for (int i=0; i<a1.length; i++){
            p.next = new ListNode(a1[i]);
            p = p.next;
        }
        ListNode[] res = splitListToParts(l1.next,k);
    }
}
