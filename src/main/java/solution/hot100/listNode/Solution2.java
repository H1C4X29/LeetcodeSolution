package solution.hot100.listNode;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwo(l1,l2,0);
    }

    private ListNode addTwo(ListNode l1,ListNode l2,int carry){
        if (l1 ==null && l2 == null && carry==0){
            return null;
        }

        int s = carry;
        if (l1 != null){
            s += l1.val;
            l1 = l1.next;
        }
        if (l2 != null){
            s += l2.val;
            l2 = l2.next;
        }

        return new ListNode(s%10, addTwo(l1,l2,s/10));
    }
}
