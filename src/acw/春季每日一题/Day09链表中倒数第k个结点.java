package acw.春季每日一题;

/**
 * @purpose:
 */
public class Day09链表中倒数第k个结点 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */

    public ListNode findKthToTail(ListNode pListHead, int k) {
        //求出链表长度
        int len = 0;
        ListNode head = pListHead;
        while (head != null) {
            len++;
            head = head.next;
        }
        //变成正数  求出链表第k个结点
        k = len - k + 1;
        int key = 1;
        while (pListHead != null && k != key) {
            pListHead = pListHead.next;
            key++;
        }
        return pListHead;

    }

}
