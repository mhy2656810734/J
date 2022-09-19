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
 // 核心思路: 1.先找到链表的中间节点  2.再反转后半段链表 3.判断是否为回文链表
 // 例:1->2->3->2->1->null  --->>    1->2->3<-2-<1
class Solution {
    public boolean isPalindrome(ListNode head) {
       if (head == null) {
            return false;
        }
        // 只有一个节点的情况下
        if (head.next == null) {
            return true;
        }
        // 1.先找中间节点 快慢指针
        ListNode fast = head;
        ListNode slow = head;
        while ((fast != null)&&(fast.next != null)) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // 2.翻转后半段链表 三指针法
        ListNode prev = slow;
        ListNode cur = prev.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur =curNext;
        }
        // 3.判断
        while (head != prev) {
            // 不相等
            if (head.val != prev.val) {
                return false;
            }
            // 偶数节点的情况
            if (head.next == prev) {
                return true;
            }
            head = head.next;
            prev = prev.next;
        }
        // 相等
        return true;
    }
}
