package solution.hot100.listNode;

/**
 * 206. 反转链表

 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。

 */
public class Solution206 {

    /**
     * 头插法，本质上是从链表头依次将元素插入到新链表里
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    /**
     * 尾插法，实质上就是通过递归获得到链表的最后部分，一层一层将链表反转
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode revHead = reverseList1(head.next);
        ListNode tmp = head.next;
        tmp.next = head;
        head.next = null;   //如果不写可能会导致循环
        return revHead;
    }
}
