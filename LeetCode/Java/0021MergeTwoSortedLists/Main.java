// Merge two sorted linked lists and return it as a new list.
// The new list should be made by splicing together the nodes
// of the first two lists.

// Ex.
// Input: 1->2->4, 1->3->4
// Output: 1->1->2->3->4->4


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(-9);
        l3.next = new ListNode(3);

        ListNode l4 = new ListNode(5);
        l4.next = new ListNode(7);

        ListNode result = (Solution.mergeTwoLists(l1, l2));
        while (result.next != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println(result.val);

        ListNode result2 = (Solution.mergeTwoLists(l3, l4));
        while (result2.next != null) {
            System.out.print(result2.val + " ");
            result2 = result2.next;
        }
        System.out.println(result2.val);
    }
}
