package solution.hot100.listNode;

/**
 * 876. 链表的中间结点

 * 给你单链表的头结点 head ，请你找出并返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        // while (fast.next != null && fast.next.next != null){ 返回两个中间节点的第一个
        while (fast != null && fast.next != null){ // 返回两个中间节点的第二个
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
