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
 // 核心思路：快慢指针，当快指针的后一个结点为空或后两个结点为空时，slow的后一个结点就是要删除的结点
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while ((fast != null)&&(fast.next!= null)) {
            fast = fast.next.next;
            // 此时跳出循环，slow的下一个结点就是要删除结点
            if ((fast == null )|| (fast.next == null)) {
                break;
            }
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}