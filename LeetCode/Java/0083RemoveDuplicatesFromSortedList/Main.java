package LeetCode083RemoveDuplicatesFromSortedList;

// Given a sorted linked list, delete all duplicates such that each element appear only once.
// Ex. 1:
//  Input: 1 -> 1 -> 2
//  Output: 1 -> 2

// Ex. 2:
// Input: 1 -> 1 -> 2 -> 3 -> 3
// Output: 1 -> 2 -> 3

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);

        System.out.println(l1.val + " " + l1.next.val + " " + l1.next.next.val);

        ListNode l1result = Solution.deleteDuplicates(l1);

        System.out.print("result: " + l1result.val + " ");
        while (l1result.next != null) {
            l1result = l1result.next;
            System.out.print(l1result.val + " ");
        }
        System.out.println();

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);
        l2.next.next.next = new ListNode(3);
        l2.next.next.next.next = new ListNode(3);

        System.out.println(l2.val + " " + l2.next.val + " " + l2.next.next.val +
                " " + l2.next.next.next.val + " " + l2.next.next.next.next.val);


        ListNode l2result = Solution.deleteDuplicates(l2);

        System.out.print("result: " + l2result.val + " ");
        while (l2result.next != null) {
            l2result = l2result.next;
            System.out.print(l2result.val + " ");
        }
        System.out.println();
    }
}

class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode temp = head;

        while (temp.next != null) {
            if (temp.val == temp.next.val) {

                ListNode traveler = temp;

                while (traveler.next != null && traveler.val == temp.val) {
                    traveler = traveler.next;
                }
                if (traveler.val == temp.val) {
                    temp.next = null;
                    return head;
                } else {
                    temp.next = traveler;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}

/*
other solution:
this is faster but slightly more memory

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode t = head;
        while (t.next != null) {
            ListNode next = t.next;
            if (t.val == next.val) {
                t.next = next.next;
            } else {
                t = t.next;
            }
        }
        return head;
    }
}
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}