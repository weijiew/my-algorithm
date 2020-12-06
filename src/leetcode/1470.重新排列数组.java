/*
 * @lc app=leetcode.cn id=1470 lang=java
 *
 * [1470] 重新排列数组
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] t = new int[nums.length];
        int k = 0;
        for (int i = 0; i < n; i++) {
            t[k++] = nums[i];
            t[k++] = nums[i + n];
        }
        return t;
    }
}
// @lc code=end

