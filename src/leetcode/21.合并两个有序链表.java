/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
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
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode t = new ListNode();
        // 需要将头节点记录下来，用作返回值。
        ListNode tt = t;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                t.next = l1;
                l1 = l1.next;
            }else {
                t.next = l2;
                l2 = l2.next;
            }
            t = t.next;
        }

        if (l1 == null) {
            t.next = l2;
        }

        if (l2 == null) {
            t.next = l1;
        }
        return tt.next;
    }
}
// @lc code=end

