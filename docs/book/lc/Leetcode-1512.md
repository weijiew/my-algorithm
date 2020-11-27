# 1512. 好数对的数目

[Leetcode-1512](https://leetcode.com/problems/number-of-good-pairs/) / [力扣-1512](https://leetcode-cn.com/problems/number-of-good-pairs/)

暴力解法：

```cpp
class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int ans = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums[i] == nums[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }
};
```

根据数据范围的特性来解：

因为数据的范围是 1 - 100 ，所以定义一个长度为 100 的数组，下标代表每个数字，而数组中存的值代表该数字出现的次数。

最初数组中的值都为零，表示所有值都没有出现。当重复数字出现时将数组中存的值加一。

```cpp
class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int a[100];
        int ans = 0;
        for (int i = 0; i < 100; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < nums.size(); i++) {
            int k = nums[i] - 1;
            ans += a[k]++;
        }
        return ans;
    }
};
```

这种解法挺有意思的，适合数据范围不大的情况。