package LeetCode160IntersectionofTwoLinkedLists;

// Write a program to find the node at which the intersection of two singly linked lists begins.

// For example, the following two linked lists:

// A:        a1 > a2 >
//                     c1 > c2 > c3
// B:   b1 > b2 > b3 >

// begin to intersect at node c1.

// Ex:
// A:       4 > 1 >
//                  8 > 4 > 5
// B:   5 > 6 > 1 >

// Input:   intersect Val = 8, ListA = [4, 1, 8, 4, 5], listB = [5, 6, 1, 8, 4, 5], skipA = 2, skipB = 3
// Output:  Reference of the node with value = 8
// Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
// From the head of A, it reads as [4, 1, 8, 4, 5]. From the head of B, it reads as [5, 6, 1, 8, 4, 5]. There
// are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.

// Ex:
// A:   1 > 9 > 1 >
//                  2 > 4
// B:           3 >

// Input:   intersectVal = 2, listA = [1, 9, 1, 2, 4], listB = [3, 2, 4], skipA = 3, skipB = 1
// Output:  Reference of the node with value = 2
// Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
// From the head of A, it reads as [1, 9, 1, 2, 4]. From the head of B, it reads as [3, 2, 4]. There are 3 nodes
// before the intersected node in A; There is 1 node before the intersected node in B.

// Ex:
// A:   2 > 6 > 4
//
// B:   1 > 5

// Input:   intersect Val = 0, listA = [2, 6, 4], listB = [1, 5], skipA = 3, skipB = 2
// Output:  null
// Input Explanation: From the head of A, it reads as [2, 6, 4]. From the head of B, it reads as [1, 5]. Since
// the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
// Explanation: The two lists do not intersect, so return null.

public class Main {

}

class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode bPointer;
        while (headA != null) {
            bPointer = headB;
            while (bPointer.next != null) {
                if (headA == bPointer)
                    return headA;
                bPointer = bPointer.next;
            }
            headA = headA.next;
        }

        return null;
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

// faster solution:
// get the length of each linkedlist
// while (lenA != lenB) {
//     if (lenA > lenB) {
//         nodeA = nodeA.next;
//         lenA--;
//     } else {
//         nodeB = nodeB.next;
//         lenB--;
//     }
// }
// while (nodeA != null && nodeB != null) {
//     if (nodeA == nodeB)
//         return nodeA;
//     nodeA = nodeA.next;
//     nodeB = nodeB.next;
// }
// return null;