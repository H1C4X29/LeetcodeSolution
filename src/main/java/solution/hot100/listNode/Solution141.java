package solution.hot100.listNode;

/**
 * 141. 环形链表

 * 给你一个链表的头节点 head ，判断链表中是否有环。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 *
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 */
public class Solution141 {

    /**
     * 快慢指针 没想到这题还能使用快慢指针来做，如果存在环必然有一个时刻快指针会追上满指针
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    /**
     * 因为题目数据范围是 -10^5 <= val <= 10^5 ，所以对于历遍过的元素用10^5+1 进行标记，如果访问到被标记的元素说明是回环的
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {
        while (head != null){
            if (head.val > 100000){
                return true;
            }
            head.val = 100001;
            head = head.next;
        }
        return false;
    }
}
