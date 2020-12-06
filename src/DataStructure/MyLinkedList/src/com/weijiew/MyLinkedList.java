package DataStructure.MyLinkedList;

import com.weijiew.ListNode;

/**
 * @Description 代码骨架来源于:https://leetcode-cn.com/leetbook/read/linked-list/jy291/
 * @ClassName MyLinkedList
 * @Author jie wei
 * @Date 2020.12.06 13:42
 */

public class MyLinkedList {

    int size;
    ListNode head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        while (index-- > 0 && head != null) {
            head = head.next;
        }
        if (head == null) {
            return -1;
        }
        return head.next.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode a = new ListNode(0);
        a.val = val;
        a.next = head;
        head = a;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode a = new ListNode(0);
        a.val = val;
        while (head.next != null) {
            head = head.next;
        }
        head.next = a;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

    }
}
