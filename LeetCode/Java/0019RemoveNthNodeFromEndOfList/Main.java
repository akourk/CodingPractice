class Main {
    public static void main(String[] args) {

        ListNode ln = new ListNode(0);
        ln.next = new ListNode(1);
        ln.next.next = new ListNode(2);
        ln.next.next.next = new ListNode(3);
        ln.next.next.next.next = new ListNode(4);
        ln.next.next.next.next.next = new ListNode(5);

        ln = Solution.removeNthFromEnd(ln, 2);
        while (ln != null) {
            System.out.print(ln.val + " ");
            ln = ln.next;
        }
        System.out.println();

        ListNode ln2 = new ListNode(1);
        ln2 = Solution.removeNthFromEnd(ln2, 1);
        while (ln2 != null) {
            System.out.print(ln2.val + " ");
            ln2 = ln2.next;
        }
        System.out.println();

        ListNode ln3 = new ListNode(1);
        ln3.next = new ListNode(2);
        ln3 = Solution.removeNthFromEnd(ln3, 1);
        while (ln3 != null) {
            System.out.print(ln3.val + " ");
            ln3 = ln3.next;
        }
        System.out.println();

        ListNode ln4 = new ListNode(1);
        ln4.next = new ListNode(2);
        ln4 = Solution.removeNthFromEnd(ln4, 2);
        while (ln4 != null) {
            System.out.print(ln4.val + " ");
            ln4 = ln4.next;
        }
        System.out.println();

        ListNode ln5 = new ListNode(1);
        ln5.next = new ListNode(2);
        ln5.next.next = new ListNode(3);
        ln5 = Solution.removeNthFromEnd(ln5, 3);
        while (ln5 != null) {
            System.out.print(ln5.val + " ");
            ln5 = ln5.next;
        }
        System.out.println();

        ListNode ln6 = new ListNode(1);
        ln6.next = new ListNode(2);
        ln6.next.next = new ListNode(3);
        ln6 = Solution.removeNthFromEnd(ln6, 2);
        while (ln6 != null) {
            System.out.print(ln6.val + " ");
            ln6 = ln6.next;
        }
        System.out.println();

        ListNode ln7 = new ListNode(1);
        ln7.next = new ListNode(2);
        ln7.next.next = new ListNode(3);
        ln7.next.next.next = new ListNode(4);
        ln7.next.next.next.next = new ListNode(5);
        ln7.next.next.next.next.next = new ListNode(6);
        ln7.next.next.next.next.next.next = new ListNode(7);
        ln7.next.next.next.next.next.next.next = new ListNode(8);
        ln7.next.next.next.next.next.next.next.next = new ListNode(9);
        ln7.next.next.next.next.next.next.next.next.next = new ListNode(10);

        ln7 = Solution.removeNthFromEnd(ln7, 7);
        while (ln7 != null) {
            System.out.print(ln7.val + " ");
            ln7 = ln7.next;
        }
        System.out.println();


    }
}

// 0 1 2 3 4 5      n = 2
//         x

// 1                n = 1
// x

// 1 2              n = 1
//   x

// 1 2              n = 2
// x

// 1 2 3            n = 3
// x

// 1 2 3 4 5 6 7 8 9 10     n = 7
//       x

class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointer = head;
        ListNode pointer2 = head;
        int size = 1;

        for (int i = 0; i < n; i++) {
            if (pointer.next != null) {
                size++;
                pointer = pointer.next;
            }
        }

        while (pointer.next != null) {
            size++;
            pointer = pointer.next;
            pointer2 = pointer2.next;
        }

        if (size == 1)
            return null;
        else if (size == 2) {
            if (n == 1)
                head.next = null;
            else if (n == 2)
                return pointer;
        } else if (n == size)
            return head.next;
        else
            pointer2.next = pointer2.next.next;

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}