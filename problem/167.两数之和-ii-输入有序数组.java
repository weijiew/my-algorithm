/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null )  return null;
        int index1 = 0 , index2 = numbers.length - 1;
        while(index1 < index2) {
            int temp = numbers[index1] + numbers[index2];
            if ( temp == target) {
                return new int[]{ index1 + 1 , index2 + 1 };
            }else if (temp < target) {
                index1++;
            }else {
                index2--;
            }
        }
        return null;
    }
}
// @lc code=end

