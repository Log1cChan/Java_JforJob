package DataStructureIntro;

public class DSI21 {
    /**
     * @program: R0det041ive
     * @description: 合并两个有序链表
     * @author: Log1c
     * @create: 2021-12-23 20:35
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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
//        方法一：构造一头节点，头节点下一个永远指向最小的，最后看哪个还没合并完
//        if(list1 == null){
//            return list2;
//        }
//        if(list2 == null){
//            return list1;
//        }
//        ListNode head = new ListNode(-1);
//        ListNode p = head;
//        while(list1!=null && list2!=null){
//            if(list1.val<=list2.val){
//                p.next = list1;
//                list1 = list1.next;
//            }else{
//                p.next = list2;
//                list2 = list2.next;
//            }
//            p = p.next;
//        }
//        p.next = (list1 == null)?list2:list1;
//        return head.next;

//        方法二：递归
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode a3 = new ListNode(4);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(1, a2);

        ListNode b3 = new ListNode(4);
        ListNode b2 = new ListNode(3, b3);
        ListNode b1 = new ListNode(1, b2);

        ListNode p = mergeTwoLists(a1, b1);
        while(p!=null){
            System.out.println(p.val);
            p = p.next;
        }
    }
}
