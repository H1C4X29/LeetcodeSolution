package solution.hot100.listNode;

/**
 * 234. 回文链表

 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 */
public class Solution234 {
    /**
     * 本质是寻找中间节点 + 反转链表 一次复习两个题目
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head){
        ListNode mid = findMid(head);
        ListNode head2 = reverse(mid);
        while (head2 != null){
            if (head.val != head2.val){
                return false;
            }
            head =  head.next;
            head2 = head2.next;
        }
        return true;
    }

    // 头插法反转链表
    private ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    // 快慢指针
    private ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){  //如果是偶数个，需要返回的是中间第二个
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
