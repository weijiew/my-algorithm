# 110. 平衡二叉树

[Leetcode-110](https://leetcode-cn.com/problems/balanced-binary-tree/) / [力扣-110](https://leetcode-cn.com/problems/balanced-binary-tree/)

> 2020/12/8 时隔四个月，这道题写不出来了。是上一题的加强版。

```java
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }else {
            return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 
                && isBalanced(root.left) && isBalanced(root.right);
        }
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
```