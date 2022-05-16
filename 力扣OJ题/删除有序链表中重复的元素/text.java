import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param head ListNode类 
     * @return ListNode类
     */
    // 核心思路：设置一个虚拟节点将不重复的结点全部连接成新的链表
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode newHead = new ListNode(-1);// 要返回的新链表的头节点的前一个节点
        ListNode tmp = newHead; // 新链表的最后一个结点
        while (cur != null) {
            if ((cur.next != null)&&(cur.val == cur.next.val)) {
                // 可能有多个连续的节点重复
                while ((cur.next != null)&&(cur.val == cur.next.val)) {
                    cur = cur.next;
                }
                //跳过重复的这个结点
                cur = cur.next;
            } else {  
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        // 让最后一个结点的next为null （最后一个结点也有可能是重复结点）
        tmp.next = null;
        return newHead.next;
    }
}