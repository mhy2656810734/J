import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param pHead ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    //核心思路：先让fast走k-1步，然后再让fast和slow一起走，每次一步，直到fast为空，此时
    //slow就是倒数第K个节点
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if (pHead == null) {
            return null;
        }
        if (k <= 0){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        //让fast走k-1步
        while (k-1 > 0) {
            if (fast.next == null){
                return null;
            }
            fast = fast.next;
            k--;
        }
        //此时再让slow指针和fast指针一起走，当fast为空时就是倒数第k个节点。
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}