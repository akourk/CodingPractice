// You are given two non-empty linked lists representing two
// non-negative integers. The digits are stored in reverse order
// and each of their nodes contain a single digit. Add the two
// numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading
// zero, except the number 0 itself.

// ex:
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
// Explanation: 342 + 465 = 807.

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val;
        int carry = 0;
        int l1val, l2val;
        ListNode returnList = new ListNode(0);
        ListNode dummyHead = returnList;

        while (l1 != null || l2 != null) {

            l1val = l1 == null ? 0 : l1.val;
            l2val = l2 == null ? 0 : l2.val;

            val = l1val + l2val + carry;

            if (val > 9) {
                returnList.next = new ListNode(val - 10);
                carry = 1;
            } else {
                returnList.next = new ListNode(val);
                carry = 0;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            returnList = returnList.next;
        }
        if (carry > 0)
            returnList.next = new ListNode(carry);

        return dummyHead.next;
    }
}


// without ternary operators:
/*
package LeetCode002AddTwoNumbers;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val;
        int remainder = 0;
        int l1val, l2val = 0;
        ListNode returnList = new ListNode(0);
        ListNode pointer = returnList;

        while (l1 != null || l2 != null) {
//            if (l1 == null)
//                l1val = 0;
//            else
//                l1val = l1.val;
//            if (l2 == null)
//                l2val = 0;
//            else
//                l2val = l2.val;

            l1val = l1 == null ? 0 : l1.val;
            l2val = l2 == null ? 0 : l2.val;

            val = l1val + l2val + remainder;

            if (val > 9) {
                returnList.next = new ListNode(val - 10);
                remainder = 1;
            } else {
                returnList.next = new ListNode(val);
                remainder = 0;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
//            if (l1 != null)
//                l1 = l1.next;
//            if (l2 != null)
//                l2 = l2.next;
            returnList = returnList.next;
        }
        if (remainder > 0)
            returnList.next = new ListNode(remainder);

        return pointer.next;
    }
}

 */
