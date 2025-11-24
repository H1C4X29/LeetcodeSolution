package solution.hot100.listNode;

/**
 * 19. 删除链表的倒数第 N 个结点

 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。

 */
public class Solution19 {
    /**
     * 快慢指针，让两个指针之间的距离为n，当快指针到达末尾时满指针刚好在倒数第n个；
     * 因为n可能等于链表长度，所以引入一个哨兵节点，这样不用单独特判
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0,head);
        ListNode pre = dummy;
        ListNode suf = dummy;
        while (n-- > 0){
            suf = suf.next;
        }
        while (suf.next != null){
            suf = suf.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;

        return dummy.next;
    }
}
