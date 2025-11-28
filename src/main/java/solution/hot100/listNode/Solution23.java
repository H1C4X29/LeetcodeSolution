package solution.hot100.listNode;

import java.util.PriorityQueue;

/*
23. 合并 K 个升序链表

给你一个链表数组，每个链表都已经按升序排列。

请你将所有链表合并到一个升序链表中，返回合并后的链表。
 */
public class Solution23 {
    /**
     * Algorithm: 优先队列
     * Time Complexity: O(L*log(m))
     * Space Complexity: O(m)
     *
     * Description:
     * 用优先队列，将所有链表的头节点加入队列，每次让最小的出列，同时加入下一个节点，直到没有可以出列的
     */
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>( (a,b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null){
                pq.offer(list);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!pq.isEmpty()){
            ListNode node =pq.poll();
            if (node.next != null){
                pq.offer(node.next);
            }
            cur.next = node;
            cur = cur.next;
        }
        return dummy.next;
    }
}
