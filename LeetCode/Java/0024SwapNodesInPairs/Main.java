
class Main {
    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);
        n1.next.next.next = new ListNode(4);
        n1.next.next.next.next = new ListNode(5);
        n1.next.next.next.next.next = new ListNode(6);
        n1.next.next.next.next.next.next = new ListNode(7);

        n1 = Solution.swapPairs(n1);

        while (n1.next != null) {
            System.out.print(n1.val + " ");
            n1 = n1.next;
        }
        System.out.println(n1.val);

    }
}

class Solution {
    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode p1 = head;
        ListNode p2 = p1.next;
        ListNode p3 = p2.next;
        
        head = p2;
        head.next = p1;
        p1.next = p3;


        while (p1.next != null) {

            p2 = p1.next;
            p3 = p2.next;
            p1.next = p3;
            if (p3 == null) {
                p1.next = p2;
                break;
            }
                
            p2.next = p3.next;
            p3.next = p2;
            p1 = p2;
        }

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


// this looks a lot cleaner, but performs roughly the same:
// this uses 2 listnodes rather than 3
/*
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode curr = start;
        
        while (head != null && head.next != null) {
            curr.next = head.next;
            head.next = head.next.next;
            curr.next.next = head;
            curr = head;
            head = head.next;
        }
        
        return start.next;
    }
}
 */