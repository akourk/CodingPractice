import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        System.out.println(pq.size());

    }
}

class Solution {
    public static int findKthLargest(int[] nums, int k) {
        if (nums.length == 1 && k == 1)
            return nums[0];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(nums[i]);

            if (minHeap.size() > k)
                minHeap.poll();
        }

        return minHeap.peek();
    }
}


/*
// O(nlogn)
class Solution {
    public static int findKthLargest(int[] nums, int k) {
        if (nums.length == 1 && k == 1)
            return nums[0];

        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i : nums)
            al.add(i);

        Collections.sort(al, Collections.reverseOrder());
        
        return al.get(k - 1);
    }
}

*/