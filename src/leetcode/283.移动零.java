/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0 , j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
    }
}
// @lc code=end


/*

一次遍历！

Accepted
21/21 cases passed (0 ms)
Your runtime beats 100 % of java submissions
Your memory usage beats 42.33 % of java submissions (38.9 MB)

*/

/**

暴力！

class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        for(int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

 */