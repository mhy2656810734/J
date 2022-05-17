/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 // 核心思路: 让fast先走n步，然后再让slow和fast一起走，当fast为最后一个结点时
 //           slow的下一个结点就是要删除的结点
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(n > 0) {
            fast = fast.next;
            n--;
        }
        // 如果此时的fast已经为空,说明要删除的结点就是头结点
        if (fast == null) {
            return head.next;
        }
        // 此时让fast 和 slow 一起走
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // 此时slow的下一个节点就是要删除
        slow.next = slow.next.next;
        return head;
    }
}