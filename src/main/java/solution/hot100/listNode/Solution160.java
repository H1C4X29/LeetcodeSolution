package solution.hot100.listNode;

/**
 * 160. 相交链表

 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)return null;
        ListNode pa = headA,pb = headB;
        while (pa!= pb){
//            pa = pa.next==null ? headB : pa.next;     不能这样写，如果是两个不相交链表 1->2-> null 和 3->4->null 会导致永远无法跳出循环
//            pb = pb.next==null ? headA : pb.next;
            pa = pa == null ? headB : pa.next;
            pb = pb == null ? headA : pb.next;
        }
        return pa;
    }
}
