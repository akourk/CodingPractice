package LeetCode206ReverseLinkedList;

// Reverse a singly linked list.

// Ex.
// Input:   1 > 2 > 3 > 4 > 5 > NULL
// Output:  5 > 4 > 3 > 2 > 1 > NULL

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1 = Solution.reverseList(l1);
        while (l1 != null) {
            System.out.print(l1.val + " ");
            l1 = l1.next;
        }
    }
}

class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val  = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}