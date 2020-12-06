# My-alg

数据结构&算法刷题笔记。

# 进度
## Leetcode
### 数组

|                      题目                       | 语言  |
| :---------------------------------------------: | :---: |
|     [1470. 重新排列数组](Leetcode/1470.md)      |       |
|         [1. 两数之和](Leetcode/0001.md)         |       |
|          [66. 加一](Leetcode/0066.md)           |       |
| [345. 反转字符串中的元音字母](Leetcode/0345.md) |       |
|    [🎯88. 合并两个有序数组](Leetcode/0088.md)    |       |
|   [🎯680. 验证回文字符串 Ⅱ](Leetcode/0680.md)    |       |

### 链表

|                         题目                         | 语言  |
| :--------------------------------------------------: | :---: |
|          [160. 相交链表](Leetcode/0160.md)           |       |
|          [142. 相交链表](Leetcode/0142.md)           |       |
|          [🎯141. 环形链表](Leetcode/0141.md)          |       |
|      [🎯21. 合并两个有序链表](Leetcode/0021.md)       |       |
|        [203. 移除链表元素](Leetcode/0203.md)         |       |
|  [🎯83. 删除排序链表中的重复元素](Leetcode/0083.md)   |       |
| [🎯82. 删除排序链表中的重复元素 II](Leetcode/0082.md) |       |
|   [🎯19. 删除链表的倒数第N个节点](Leetcode/0019.md)   |       |
|          [🎯206. 反转链表](Leetcode/0206.md)          |       |
|          [🎯234. 回文链表](Leetcode/0234.md)          |       |

## 总结

* 删除的第 n 个结点存在有两种做法：
  * 可以设置哑节点来循环 n 次拿到被删除节点的前一个结点。
  * 或者从头节点循环 n-1 拿到被删除节点的前一个结点。

* 上面的两种做法也恰恰说明了想要删除链表的某个结点必须拿到该节点的前一个结点。
* 站在被删除的结点上是无法删除当前节点的。

1. 在调用 next 字段之前，始终检查节点是否为空。

> 获取空节点的下一个节点将导致空指针错误。例如，在我们运行 fast = fast.next.next 之前，需要检查 fast 和 fast.next 不为空。

> 参考：https://leetcode-cn.com/leetbook/detail/linked-list/

# 双指针

双指针可以理解为两个下标，快慢指针的索引。

|                        题目                         |   语言   |
| :-------------------------------------------------: | :------: |
|           [1. 两数之和](Leetcode/0001.md)           | CPP,Java |
| [167. 两数之和 II - 输入有序数组](Leetcode/0167.md) | CPP,Java |
|         [633. 平方数之和](Leetcode/0633.md)         | CPP,Java |
|           [283. 移动零](Leetcode/0283.md)           |   Java   |  |
|   [345. 反转字符串中的元音字母](Leetcode/0345.md)   |   Java   |
|     [ 680. 验证回文字符串 Ⅱ](Leetcode/0680.md)      | CPP,Java |
|      [88. 合并两个有序数组](Leetcode/0088.md)       | CPP,Java |
|          [141. 环形链表](Leetcode/0141.md)          | CPP,Java |

# 递归


|                 题目                 | 语言  |
| :----------------------------------: | :---: |
| [🎯344. 反转字符串](Leetcode/0344.md) |       |
|   [Leetcode-24](Leetcode/0024.md)    |       |
|   [Leetcode-104](Leetcode-104.md)    |       |
|   [Leetcode-110](Leetcode-110.md)    |       |
|   [Leetcode-543](Leetcode-543.md)    |       |
|   [Leetcode-226](Leetcode-226.md)    |       |
|   [Leetcode-617](Leetcode-617.md)    |       |
|   [Leetcode-112](Leetcode-112.md)    |       |
|   [Leetcode-437](Leetcode-437.md)    |       |
|   [Leetcode-101](Leetcode-101.md)    |       |
|   [Leetcode-111](Leetcode-111.md)    |       |
|   [Leetcode-404](Leetcode-404.md)    |       |
|   [Leetcode-687](Leetcode-687.md)    |       |



# 二分法

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


# 哈希表

|              题目               | 语言  |
| :-----------------------------: | :---: |
|   [Leetcode-1](Leetcode-1.md)   |       |
| [Leetcode-217](Leetcode-217.md) |       |
| [Leetcode-594](Leetcode-594.md) |       |
| [Leetcode-128](Leetcode-128.md) |       |


# 位运算

|            题目             | 语言  |
| :-------------------------: | :---: |
| [Leetcode-1](Leetcode-1.md) |       |

# 遍历

|              题目               | 语言  |
| :-----------------------------: | :---: |
| [Leetcode-144](Leetcode-144.md) |  cpp  |
| [Leetcode-145](Leetcode-145.md) |  cpp  |
|  [Leetcode-94](Leetcode-94.md)  |  cpp  |
| [Leetcode-637](Leetcode-637.md) |  cpp  |
| [Leetcode-513](Leetcode-513.md) |  cpp  |
| [Leetcode-100](Leetcode-100.md) |  cpp  |
| [Leetcode-101](Leetcode-101.md) |  cpp  |
| [Leetcode-543](Leetcode-543.md) |  cpp  |
| [Leetcode-226](Leetcode-226.md) |  cpp  |
| [Leetcode-617](Leetcode-617.md) |  cpp  |
| [Leetcode-112](Leetcode-112.md) |  cpp  |
| [Leetcode-637](Leetcode-637.md) |  cpp  |
| [Leetcode-513](Leetcode-513.md) |  cpp  |
| [Leetcode-617](Leetcode-617.md) |  cpp  |
| [Leetcode-617](Leetcode-617.md) |  cpp  |


# BST

二叉查找树（BST）：根节点大于等于左子树所有节点，小于等于右子树所有节点。

二叉查找树中序遍历有序。

|              题目               | 难度  | 语言  |
| :-----------------------------: | :---: | :---: |
| [Leetcode-667](Leetcode-669.md) |   💗   |  cpp  |
| [Leetcode-230](Leetcode-230.md) |   💗   |  cpp  |
| [Leetcode-538](Leetcode-538.md) |   💗   |  cpp  |
| [Leetcode-235](Leetcode-235.md) |   💗   |  cpp  |
| [Leetcode-236](Leetcode-236.md) |   💗   |  cpp  |
| [Leetcode-108](Leetcode-108.md) |   💗   |  cpp  |
| [Leetcode-109](Leetcode-109.md) |   💗   |  cpp  |
| [Leetcode-653](Leetcode-653.md) |   💗   |  cpp  |
| [Leetcode-530](Leetcode-530.md) |   💗   |  cpp  |
| [Leetcode-501](Leetcode-501.md) |   💗   |  cpp  |
| [Leetcode-669](Leetcode-669.md) |   💗   |  cpp  |

# Trie

|              题目               | 难度  | 语言  |
| :-----------------------------: | :---: | :---: |
| [Leetcode-208](Leetcode-208.md) |   💗   |  cpp  |
| [Leetcode-677](Leetcode-677.md) |   💗   |  cpp  |