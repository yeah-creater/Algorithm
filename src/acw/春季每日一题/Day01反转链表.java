package acw.春季每日一题;

/**
 * @author Yeah
 * @date 2021/3/19 - 16:01
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Day01反转链表 {
        public ListNode reverseList(ListNode head) {
            if(head==null||head.next==null){
                return head;
            }
            //从没有处理的最后的2个开始处理
            ListNode newHead=reverseList(head.next);
            head.next.next=head;
            head.next=null;
            return newHead;
        }

}
