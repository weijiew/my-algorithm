/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode a = null , b = head;
        while (b != null) {
            ListNode t = b.next;
            b.next = a;
            a = b;
            b = t;
        }
        return a;
    }
}
// @lc code=end

