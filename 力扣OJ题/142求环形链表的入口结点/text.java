/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 // 核心思路: fast和slow 相遇的点到入口点和头结点到入口点的距离相等
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while ((fast != null)&&(fast.next != null)) {
            fast = fast.next.next;
            slow = slow.next;
            // 相遇
            if (fast == slow) {
                ListNode meet = slow;
                while (meet != head) {
                    meet = meet.next;
                    head = head.next;
                }
                return meet;
            }
        }
        return null;
    }
}