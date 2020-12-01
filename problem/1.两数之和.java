/*
 * @lc app=leetcode.cn id=1 lang=java
 *  
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] a = new int[2];
        a[0] = -1; a[1] = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;        
    }
}
// @lc code=end

