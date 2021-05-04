package acw.春季每日一题_已完结;

/**
 * @purpose:
 */
class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
    }
}

public class Day08合并两个排序的链表 {
    public ListNode2 merge(ListNode2 l1, ListNode2 l2) {
        ListNode2 head = new ListNode2(0);
        ListNode2 p = head;
        head.next = null;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            }
            else{
                p.next = l2;
                l2 = l2.next;
            }
            p=p.next;
        }
        p.next=l1==null?l2:l1;
        return head.next;
    }

}
