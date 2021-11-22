package LeetCode141LinkedListCycle;

// Given head, the head of a linked list, determine if the linked list ha s a cycle in it.

// There is a cycle in a linked list if there is some node in the list that can be reached
// again by continuously following the next pointer.  Internally, pos is used to denote the
// index of the node that tail's next pointer is connected to. Note that pos is not passed
// as a parameter.

// Return true if there is a cycle in the linked list. Otherwise, return false.

// Ex:
// 3 > 2 > 0 > -4 \/
//     /\----------

// Input: head = [3, 2, 0, -4], pos = 1
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

// Ex:
// 1 > 2 \/
// /\-----

// Input: head = [1, 2], pos = 0
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

// Ex:
// 1

// Input: head = [1], pos = -1
// Output: false
// Explanation: There is no cycle int he linked list.


public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(0);
        l1.next.next.next = new ListNode(-4);
        l1.next.next.next.next = l1.next;
        System.out.println("true:" + Solution.hasCycle(l1));

    }
}

class Solution {
    public static boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        ListNode copy = head;
        head = head.next;

        while (head != copy) {
            if (head == null || head.next == null)
                return false;
            head = head.next.next;
            copy = copy.next;
        }
        return true;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
