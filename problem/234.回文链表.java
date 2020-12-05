/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        List<Integer> a = new ArrayList<>();
        ListNode b = head;
        while (b != null) {
            a.add(b.val);
            b = b.next;
        }
        int i = 0 , j = a.size() - 1;
        while (i < j) {
            if (head.val != a.get(j)) {
                return false;
            }
            head = head.next;
            j--;
        }
        return true;
    }
}
// @lc code=end

