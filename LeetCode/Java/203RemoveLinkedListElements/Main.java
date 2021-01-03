package LeetCode203RemoveLinkedListElements;

// Remove all elements from a linked list of integers that have value val.

// Ex:
// Input:   1 > 2 > 6 > 3 > 4 > 5 > 6, val = 6
// Output:  1 > 2 > 3 > 4 > 5

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(6);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(4);
        l1.next.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next.next = new ListNode(6);
        ListNode l1new = Solution.removeElements(l1, 6);
        while (l1new != null) {
            System.out.print(l1new.val + " ");
            l1new = l1new.next;
        }

    }
}

class Solution {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode p = helper;

        while (p.next != null) {
            if (p.next.val == val) {
                ListNode next = p.next;
                p.next = next.next;
            } else {
                p = p.next;
            }
        }
        return helper.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}