/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a = new ListNode();
        a.next = head;
        while (a.next != null) {
            ListNode b = a.next;
            while (b.next != null) {
                if (b.val == b.next.val) {
                    b.next = b.next.next;
                }else {
                    b = b.next;
                }
            }
        }
        return head;
    }
}
// @lc code=end

