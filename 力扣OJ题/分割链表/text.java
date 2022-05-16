/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // 核心思路：将比x小的和比x大的分别放在两个不同的链表中，然后连接这两个表链表即可
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode ba = null;
        ListNode be = null;
        ListNode aa = null;
        ListNode ae = null;
        ListNode cur = head;
        // cur不为空就循环
        while (cur != null) {
            if (cur.val < x) {     //比x小的链表
                // 判断是否为第一个结点
                if (ba == null) {
                    ba = cur;
                    be = ba;
                } else {           // 如果不为空就说明有结点了,将cur连接到后面即可
                    be.next = cur;
                    be = be.next;
                }
            } else {    // 比x大的链表
            // 判断第一个节点是否为空
            if (aa == null) {
                aa = cur;
                ae = aa;
            } else {
                ae.next = cur;
                ae = ae.next;
            }
            }
            cur = cur.next;
        }
        // 此时已经将cur中的节点重新进行了排序
        //需要对ba 和 aa进行判断 （因为可能所有值都比x小或大）
        if (ba == null) {
            ae.next = null; //先将ae.next置为空
            return aa;
        } else if (aa == null) {
            return ba;
        } else {
            // 此时需要连接两个链表
            be.next = aa;
            ae.next = null;
            return ba;
        }
    }
}