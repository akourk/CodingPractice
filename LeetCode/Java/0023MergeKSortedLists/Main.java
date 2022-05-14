import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ln = new ListNode();
        ArrayList<Integer> al = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                al.add(list.val);
                list = list.next;
            }
        }

        Collections.sort(al);

        ListNode temp = ln;

        for (int i = 0; i < al.size(); i++) {
            temp.next = new ListNode(al.get(i));
            temp = temp.next;
        }

        return ln.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}