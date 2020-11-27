# 1470. 重新排列数组

[Leetcode-1470](https://leetcode.com/problems/shuffle-the-array/) / [力扣-1470](https://leetcode-cn.com/problems/shuffle-the-array/)

## 思想


## Java
```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] t = new int[nums.length];
        int i = 0;
        for (int ii = 0; ii < n; ii++) {
            t[i++] = nums[ii];
            t[i++] = nums[ii + n];
        }
        return t;
    }
}
```

## C++

```cpp
class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector<int> result(2*n);
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i+n];
        }
        return result;
    }
};
```