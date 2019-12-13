i// You are given two non-empty linked lists representing two
// non-negative integers. The digits are stored in reverse order
// and each of their nodes contain a single digit. Add the two
// numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading
// zero, except the number 0 itself.

// ex:
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
// Explanation: 342 + 465 = 807.

public class Main {

    public static void main(String[] args) {

        // hi
        System.out.println("Hello World!");

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(5);

        ListNode l5 = new ListNode(0);
        ListNode l6 = new ListNode(0);

        ListNode l7 = new ListNode(9);
        ListNode l8 = new ListNode(1);
        l8.next = new ListNode(9);
        l8.next.next = new ListNode(9);
        l8.next.next.next = new ListNode(9);
        l8.next.next.next.next = new ListNode(9);
        l8.next.next.next.next.next = new ListNode(9);
        l8.next.next.next.next.next.next = new ListNode(9);
        l8.next.next.next.next.next.next.next = new ListNode(9);
        l8.next.next.next.next.next.next.next.next = new ListNode(9);
        l8.next.next.next.next.next.next.next.next.next= new ListNode(9);

        ListNode l9 = new ListNode(7);
        ListNode l10 = new ListNode(3);
        l10.next = new ListNode(9);
        l10.next.next = new ListNode(9);
        l10.next.next.next = new ListNode(9);
        l10.next.next.next.next = new ListNode(9);
        l10.next.next.next.next.next = new ListNode(9);
        l10.next.next.next.next.next.next = new ListNode(9);
        l10.next.next.next.next.next.next.next = new ListNode(9);
        l10.next.next.next.next.next.next.next.next = new ListNode(9);
        l10.next.next.next.next.next.next.next.next.next= new ListNode(9);

        ListNode l11 = new ListNode(9);
        ListNode l12 = new ListNode(9);



        ListNode answer = Solution.addTwoNumbers(l1, l2);
        System.out.print("708: ");
        while(answer != null) {
            System.out.print(answer.val);
            answer = answer.next;
        }
        System.out.println();

        ListNode answer2 = Solution.addTwoNumbers(l3, l4);
        System.out.print("01: ");
        while(answer2 != null) {
            System.out.print(answer2.val);
            answer2 = answer2.next;
        }
        System.out.println();

        ListNode answer3 = Solution.addTwoNumbers(l5, l6);
        System.out.print("0: ");
        while(answer3 != null) {
            System.out.print(answer3.val);
            answer3 = answer3.next;
        }
        System.out.println();

        ListNode answer4 = Solution.addTwoNumbers(l7, l8);
        System.out.print("00000000001: ");
        while(answer4 != null) {
            System.out.print(answer4.val);
            answer4 = answer4.next;
        }
        System.out.println();

        ListNode answer5 = Solution.addTwoNumbers(l9, l10);
        System.out.print("00000000001: ");
        while(answer5 != null) {
            System.out.print(answer5.val);
            answer5 = answer5.next;
        }
        System.out.println();

        ListNode answer6 = Solution.addTwoNumbers(l11, l12);
        System.out.print("81: ");
        while(answer6 != null) {
            System.out.print(answer6.val);
            answer6 = answer6.next;
        }
    }
}
