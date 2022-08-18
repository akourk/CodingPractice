import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        Solution.nextPermutation(nums1);
        System.out.println("\n[1, 3, 2]\n" + Arrays.toString(nums1));

        int[] nums2 = {3, 2, 1};
        Solution.nextPermutation(nums2);
        System.out.println("\n[1, 2, 3]\n" + Arrays.toString(nums2));

        int[] nums3 = {1, 1, 5};
        Solution.nextPermutation(nums3);
        System.out.println("\n[1, 5, 1]\n" + Arrays.toString(nums3));


        int[] nums4 = {1, 3, 2};
        Solution.nextPermutation(nums4);
        System.out.println("\n[2, 1, 3]\n" + Arrays.toString(nums4));


        int[] nums5 = {1, 2};
        Solution.nextPermutation(nums5);
        System.out.println("\n[2, 1]\n" + Arrays.toString(nums5));



        int[] nums7 = {4, 2, 0, 2, 3, 2, 0};
        Solution.nextPermutation(nums7);
        System.out.println("\n[4, 2, 0, 3, 0, 2, 2]\n" + Arrays.toString(nums7));

        int[] nums8 = {4, 2, 0, 3, 2, 2, 0};
        Arrays.sort(nums8, 4, nums8.length);
        System.out.println(Arrays.toString(nums8));


    }
}


// scan array from right to left until you find element to the right is larger than left, then mark as index
// scan from right to left again until you find an element larger than nums[index]. mark as j
// swap nums[index] with nums[j].
// reverse the rest of the array
class Solution {
    public static void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int j = n - 1;
        for (int i = n - 1; i >= index + 1; i--) {
            if (nums[i] > nums[index]) {
                j = i;
                break;
            }
        }
        swap(nums, index, j);

        reverse(nums, index + 1, n - 1);
        
    }
    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    private static void swap(int[] nums, int i, int index) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }

}


/*
// i was onto something
// but it doesn't work...
class Solution {
    public static void nextPermutation(int[] nums) {
        

        // iterate from right to left
        // 5 7 9 4 6 0 8 4 1
        // if right is greater than left, swap them.
        // 5 7 9 4 6 0 8 4 1
        //           8 0 4 1
        // sort everything to the right of the swap
        // 5 7 9 4 6 8 0 1 4


        // if none, then sort whole array?
        boolean flag = false;

        for (int i = nums.length - 1; i >= 0 && !flag; i--) {
            int temp = Integer.MAX_VALUE;
            int index = Integer.MAX_VALUE;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] > nums[i] && nums[j] < temp) {
                    temp = nums[j];
                    index = j;
                }
            }
            if (temp != Integer.MAX_VALUE) {
                System.out.println("i:" + i + " temp:" + temp + " index" + index + " nums[i]:" + nums[i]);
                System.out.println("::" + Arrays.toString(nums));
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                // System.out.println("::" + Arrays.toString(nums));

                // System.out.println("list " + Arrays.toString(nums));
                Arrays.sort(nums, i + 1, nums.length);
                // System.out.println("::" + Arrays.toString(nums));
                // Arrays.sort(nums, 0, 2);
                // System.out.println("listPost " + Arrays.toString(nums));
                flag = true;
                break;
            }
        }

        if (!flag)
            Arrays.sort(nums);
    }
}

*/