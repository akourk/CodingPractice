import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        int[] n1 = {100, 4, 200, 1, 3, 2};
        System.out.println("4:" + Solution.longestConsecutive(n1));
        int[] n2 = {0, -1};
        System.out.println("2:" + Solution.longestConsecutive(n2));
        int[] n3 = {9,-8,9,8,-7,9,-4,6,5,5,6,7,-9,-5,-4,6,-8,-1,8,0,1,5,4};
        System.out.println("6:" + Solution.longestConsecutive(n3));
    }
}


// 2 while loops: one to go left from each num, one to go right.
// solved the problem below with only one while loop, but it was much
// slower over a broad range of test cases.
class Solution {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int maxLen = 0;
        int curLen = 1;

        for (int num : nums)
            hs.add(num);

        for (int i = 0; i < nums.length && maxLen <= nums.length - i; i++) {
            int leftPointer = nums[i] - 1;
            int rightPointer = nums[i] + 1;
            while (hs.contains(leftPointer)) {
                hs.remove(leftPointer);
                leftPointer--;
                curLen++;
            }
            while (hs.contains(rightPointer)) {
                hs.remove(rightPointer);
                rightPointer++;
                curLen++;
            }

            maxLen = Math.max(curLen, maxLen);
            curLen = 1;
        }

        return maxLen;
    }
}

/*
// well, it turns out this is generally way slower in over the whole set
// of test cases. The code looks cleaner and the solution is easier to
// understand, but going to comment it out and leave the first solution
class Solution {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int maxLen = 0;
        int curLen = 1;

        for (int num : nums)
            hs.add(num);

        for (int i = 0; i < nums.length; i++) {
            if (!hs.contains(nums[i] - 1)) {
                int rightPointer = nums[i] + 1;
                while (hs.contains(rightPointer)) {
                    rightPointer++;
                    curLen++;
                }
            }
            
            maxLen = Math.max(curLen, maxLen);
            curLen = 1;
        }

        return maxLen;
    }
}
*/