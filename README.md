# My-alg

数据结构&算法刷题笔记。

## Leetcode

### 数组

1. [1470. 重新排列数组](Leetcode/1470.md)
2. [🎯🎯🎯118. 杨辉三角](Leetcode/0118.md)
3. [1. 两数之和](Leetcode/0001.md)
4. [66. 加一](Leetcode/0066.md)
5. [345. 反转字符串中的元音字母](Leetcode/0345.md)
6. [🎯🎯🎯88. 合并两个有序数组](Leetcode/0088.md)
7. [🎯🎯🎯680. 验证回文字符串 Ⅱ](Leetcode/0680.md)

### 链表

1. [160. 相交链表](Leetcode/0160.md)
2. [142. 相交链表](Leetcode/0142.md)
3. [🎯🎯🎯🎯🎯21. 合并两个有序链表](Leetcode/0021.md)
4. [🎯🎯141. 环形链表](Leetcode/0141.md)
5. [203. 移除链表元素](Leetcode/0203.md)
6. [🎯🎯🎯🎯🎯83. 删除排序链表中的重复元素](Leetcode/0083.md)
7. [🎯🎯🎯🎯🎯82. 删除排序链表中的重复元素 II](Leetcode/0082.md)
8. [🎯🎯🎯🎯🎯19. 删除链表的倒数第N个节点](Leetcode/0019.md)
9. [🎯🎯🎯🎯🎯🎯206. 反转链表](Leetcode/0206.md)
10. [🎯🎯🎯🎯🎯🎯234. 回文链表](Leetcode/0234.md)


#### 总结

* 删除的第 n 个结点存在有两种做法：
  * 可以设置哑节点来循环 n 次拿到被删除节点的前一个结点。
  * 或者从头节点循环 n-1 拿到被删除节点的前一个结点。

* 上面的两种做法也恰恰说明了想要删除链表的某个结点必须拿到该节点的前一个结点。
* 站在被删除的结点上是无法删除当前节点的。

1. 在调用 next 字段之前，始终检查节点是否为空。

> 获取空节点的下一个节点将导致空指针错误。例如，在我们运行 fast = fast.next.next 之前，需要检查 fast 和 fast.next 不为空。

### 双指针

双指针可以理解为两个下标，快慢指针的索引。

1. [167. 两数之和 II - 输入有序数组](Leetcode/0167.md)
2. [1. 两数之和](Leetcode/0001.md)
3. [633. 平方数之和](Leetcode/0633.md)
4. [283. 移动零](Leetcode/0283.md)
5. [345. 反转字符串中的元音字母](Leetcode/0345.md)
6. [ 680. 验证回文字符串 Ⅱ](Leetcode/0680.md)
7. [88. 合并两个有序数组](Leetcode/0088.md)
8. [141. 环形链表](Leetcode/0141.md)

### 递归


|                        题目                        |   语言    |
| :------------------------------------------------: | :-------: |
|      [🎯🎯🎯🎯🎯344. 反转字符串](Leetcode/0344.md)      |   Java    |
|   [🎯🎯🎯🎯🎯21. 合并两个有序链表](Leetcode/0021.md)    |           |
| [🎯🎯🎯🎯🎯 24. 两两交换链表中的节点](Leetcode/0024.md) | C++，Java |
|     [104. 二叉树的最大深度](Leetcode/0104.md)      |   Java    |
|      [🎯🎯🎯🎯🎯110. 平衡二叉树](Leetcode/0110.md)      |   Java    |
|          [Leetcode-543](Leetcode/0543.md)           |           |
|          [Leetcode-226](Leetcode-226.md)           |           |
|          [Leetcode-617](Leetcode-617.md)           |           |
|          [Leetcode-112](Leetcode-112.md)           |           |
|          [Leetcode-437](Leetcode-437.md)           |           |
|          [Leetcode-101](Leetcode-101.md)           |           |
|          [Leetcode-111](Leetcode-111.md)           |           |
|          [Leetcode-404](Leetcode-404.md)           |           |
|          [Leetcode-687](Leetcode-687.md)           |           |

### 二分法

|              题目               | 语言  |
| :-----------------------------: | :---: |
|  [Leetcode-69](Leetcode-69.md)  |       |  |
| [Leetcode-540](Leetcode-540.md) |       |
| [Leetcode-744](Leetcode-744.md) |       |
| [Leetcode-540](Leetcode-540.md) |       |
| [Leetcode-278](Leetcode-278.md) |       |
| [Leetcode-153](Leetcode-153.md) |       |
|  [Leetcode-34](Leetcode-34.md)  |       |
| [Leetcode-704](Leetcode-704.md) |       |


### 哈希表

|              题目               | 语言  |
| :-----------------------------: | :---: |
|   [Leetcode-1](Leetcode-1.md)   |       |
| [Leetcode-217](Leetcode-217.md) |       |
| [Leetcode-594](Leetcode-594.md) |       |
| [Leetcode-128](Leetcode-128.md) |       |


### 位运算

|            题目             | 语言  |
| :-------------------------: | :---: |
| [Leetcode-1](Leetcode-1.md) |       |

### 遍历

|              题目               | 语言  |
| :-----------------------------: | :---: |
| [Leetcode-144](Leetcode-144.md) |  C++  |
| [Leetcode-145](Leetcode-145.md) |  C++  |
|  [Leetcode-94](Leetcode-94.md)  |  C++  |
| [Leetcode-637](Leetcode-637.md) |  C++  |
| [Leetcode-513](Leetcode-513.md) |  C++  |
| [Leetcode-100](Leetcode-100.md) |  C++  |
| [Leetcode-101](Leetcode-101.md) |  C++  |
| [Leetcode-543](Leetcode-543.md) |  C++  |
| [Leetcode-226](Leetcode-226.md) |  C++  |
| [Leetcode-617](Leetcode-617.md) |  C++  |
| [Leetcode-112](Leetcode-112.md) |  C++  |
| [Leetcode-637](Leetcode-637.md) |  C++  |
| [Leetcode-513](Leetcode-513.md) |  C++  |
| [Leetcode-617](Leetcode-617.md) |  C++  |
| [Leetcode-617](Leetcode-617.md) |  C++  |


### BST

二叉查找树（BST）：根节点大于等于左子树所有节点，小于等于右子树所有节点。

二叉查找树中序遍历有序。

1. [Leetcode-667](Leetcode-669.md)
2. [Leetcode-230](Leetcode-230.md)
3. [Leetcode-538](Leetcode-538.md)
4. [235. 二叉搜索树的最近公共祖先](Leetcode/0235.md)
5. [Leetcode-236](Leetcode-236.md)
6. [108. 将有序数组转换为二叉搜索树](Leetcode/Leetcode-108.md)
7. [Leetcode-109](Leetcode-109.md)
8. [Leetcode-653](Leetcode-653.md)
9. [Leetcode-530](Leetcode-530.md)
10. [Leetcode-501](Leetcode-501.md)
11. [Leetcode-669](Leetcode-669.md)

### Trie

1. [Leetcode-208](Leetcode-208.md)
2. [Leetcode-677](Leetcode-677.md)

### 树

1. [501. 二叉搜索树中的众数](leetcode/0501.md) 暴力可以练习 Map 和 sort 。
2. [235. 二叉搜索树的最近公共祖先](leetcode/0235.md) 二叉搜索的性质。
3. [108. 将有序数组转换为二叉搜索树](Leetcode/0108.md)
3. [106. 从中序与后序遍历序列构造二叉树](Leetcode/0106.md) 需要多练习！
4. [105. 从前序与中序遍历序列构造二叉树](leetcode/0105.md) 搞定 106 这道题就很简单。
5. [](leetcode/0654.md) 注意数据范围。