package DataStructureIntro;

import java.util.HashSet;
import java.util.Set;

public class DSI160 {
    /**
     * @program: R0det041ive
     * @description: 相交链表
     * @author: Log1c
     * @create: 2021-12-23 19:45
     **/
//    链表结构
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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
/**
 * 我的做法：
 * 双指针：每次比较p和headA，若相同，则返回，不同：null
 */
//        while(headA != null){
//            ListNode p = headB;
//            while(p != null){
//                if(p!=headA){
//                    p = p.next;
//                }else{
//                    return headA;
//                }
//            }
//            headA = headA.next;
//        }
//        return null;

////        使用哈希表解题
////        建立哈希表存放已访问的节点
//        Set<ListNode> set = new HashSet<ListNode>();
//        ListNode tmp = headA;
//        while(tmp != null){
//            set.add(tmp);
//            tmp = tmp.next;
//        }
////        开始审判第二链表的节点是否存在于set中
//        tmp = headB;
//        while(tmp!=null){
//            if(set.contains(tmp)){
//                return tmp;
//            }
//            tmp = tmp.next;
//        }
//        return null;

/**
 * 另一种双指针
 * 设A长a+c, B长b+c, 那么a+c+b==b+c+a
 * 所以访问到A末端，让指针到B起点，同理B
 */

        ListNode l1 =headA, l2 = headB;
        while(l1!=l2){
            l1 = (l1==null)?headB:l1.next;
            l2 = (l2==null)?headA:l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode b1 = new ListNode(1);
        ListNode c1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode b2 = new ListNode(2);
        ListNode c2 = new ListNode(2);
        ListNode c3 = new ListNode(3);
        ListNode b3 = new ListNode(3);

        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        c1.next = c2;
        c2.next = c3;

        System.out.println(getIntersectionNode(a1, b1).val);
    }

}
