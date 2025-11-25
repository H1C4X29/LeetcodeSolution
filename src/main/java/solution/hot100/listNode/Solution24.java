package solution.hot100.listNode;

/**
 * 24. 两两交换链表中的节点

 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode node0 = dummy;
        ListNode node1 = head;
        while(node1 != null && node1.next !=null){
            ListNode node2 = node1.next;
            ListNode node3 = node2.next;

            node0.next = node2;
            node2.next = node1;
            node1.next = node3;

            node0 = node1;
            node1 = node3;
        }

        return dummy.next;
    }

    /**
     * 递归版本
     * @param head
     * @return
     */
    public ListNode swapPairs_1(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode node0 = head;
        ListNode node1 = head.next;
        ListNode node2 = head.next.next;

        node0.next = swapPairs(node2);
        node1.next = node0;

        return node1;
    }

}
