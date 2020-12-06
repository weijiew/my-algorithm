/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
        ListNode a = head;
        while (a != null && a.next != null) {
            if (a.val == a.next.val) {
                a.next = a.next.next;
            }else {
                a = a.next;
            }
        }
        return head;
    }
}
// @lc code=end

