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
        // 链表为空
        if (head == null) {
            return false;
        }
        // 链表为一个结点
        if (head.next == null) {
            return true;
        }
        // 1.先找链表的中间节点 (快慢指针)
        ListNode fast = head;
        ListNode slow = head;
        while ((fast !=null)&&(fast.next != null)){
            fast = fast.next.next;
            slow = slow.next;
        }
        // 此时slow就是中间结点 
        // 2.反转后半段结点
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode curNext = cur.next; // 反转链表必须需要三指针
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        // 此时反转链表成功,slow就是最后一个节点
        // 3.判断是否为回文链表:head 和 slow 一次走一步，直到相等结束
        while (slow != head) {
            // 不相等就不是
            if (slow.val != head.val) {
                return false;
            }
            // 判断偶数的情况
            if (head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        // 循环结束 说明是
        return true;
    }
}