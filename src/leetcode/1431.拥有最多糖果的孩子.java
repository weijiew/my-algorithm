/*
 * @lc app=leetcode.cn id=1431 lang=java
 *
 * [1431] 拥有最多糖果的孩子
 */

// @lc code=start
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        ArrayList<Boolean> results = new ArrayList<Boolean>();
        for(int num : candies){
            max = num<max?max:num;
        }
        for(int i = 0;i<candies.length;i++){
            results.add(max>(candies[i]+extraCandies)?false:true);
        }
        return results;
    }
}
// @lc code=end

