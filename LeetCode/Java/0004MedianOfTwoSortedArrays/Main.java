import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};

        int[] nums5 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums6 = {1, 2, 3, 4};

        int[] nums7 = {3};
        int[] nums8 = {-2, -1};

        int[] nums9 = {};
        int[] nums10 = {1};

        int[] nums11 = {3, 4, 5, 6};
        int[] nums12 = {1, 2};

        System.out.println("2.00000 : " + Solution.findMedianSortedArrays(nums1, nums2));
        System.out.println("2.50000 : " + Solution.findMedianSortedArrays(nums3, nums4));
        System.out.println("3.00000 : " + Solution.findMedianSortedArrays(nums5, nums6));
        System.out.println("-1.00000 : " + Solution.findMedianSortedArrays(nums7, nums8));
        System.out.println(Solution.findMedianSortedArrays(nums11, nums12));

    }
}

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);
        
        int m = nums1.length;
        int n = nums2.length;
        int start = 0;
        int end = m;

        while (start <= end) {
            int partitionNums1 = (start + end) / 2;
            int partitionNums2 = (m + n + 1) / 2 - partitionNums1;
            int maxLeftNums1 = partitionNums1 == 0 ? Integer.MIN_VALUE : nums1[partitionNums1 - 1];
            int minRightNums1 = partitionNums1 == m ? Integer.MAX_VALUE : nums1[partitionNums1];
            int maxLeftNums2 = partitionNums2 == 0 ? Integer.MIN_VALUE : nums2[partitionNums2 - 1];
            int minRightNums2 = partitionNums2 == n ? Integer.MAX_VALUE : nums2[partitionNums2];
            
            if (maxLeftNums1 <= minRightNums2 && maxLeftNums2 <= minRightNums1)
                if ((m + n) % 2 == 0)
                    return (Math.max(maxLeftNums1, maxLeftNums2) + Math.min(minRightNums1, minRightNums2)) / 2.0;
                else
                    return Math.max(maxLeftNums1, maxLeftNums2);
            else if (maxLeftNums1 > minRightNums2)
                end = partitionNums1 - 1;
            else
                start = partitionNums1 + 1;
        }

        throw new IllegalArgumentException();
    }
}


// kill me

// this method would work, but i don't have the patience to work out every edge case...
/*

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] larger;
        int[] smaller;
        if (nums1.length > nums2.length) {
            larger = nums1;
            smaller = nums2;
        } else {
            larger = nums2;
            smaller = nums1;
        }
        if (smaller.length == 0 && larger.length == 0)
            return 0;
        if (smaller.length == 0)
            return (getMedianDouble(larger));
        if (smaller.length == 1 && larger.length == 1) {
            double median = 0.0;
            median += smaller[0];
            median += larger[0];
            return (median / 2.0);
        }

        double medianIndex = 0.0;
        medianIndex += larger.length - 1;
        medianIndex /= 2.0;
        double median = getMedianDouble(larger);

        double medianIndexS = 0.0;
        medianIndexS += smaller.length - 1;
        medianIndexS /= 2.0;
        double medianS = getMedianDouble(smaller);

        System.out.print("Larger ");
        printArr(larger);
        System.out.println("Median: " + median + " - MedianIndex:" + medianIndex);

        System.out.print("Smaller ");
        printArr(smaller);
        System.out.println("Median: " + medianS + " MedianIndex:" + medianIndexS);

        while (smaller.length > 2) {
            if (smaller[smaller.length / 2 - 1] < median) {
                System.out.println("<");
                medianIndex -= (smaller.length / 2.0) / 2.0;
                median = getMedianDouble(Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex) + 1));
                System.out.println(median);
                smaller = Arrays.copyOfRange(smaller, smaller.length / 2, smaller.length);
            } else if (smaller[smaller.length / 2 - 1] > median) {
                System.out.println(">");
                medianIndex += (smaller.length / 2.0) / 2.0;
                median = getMedianDouble(Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex) + 1));
                System.out.println(median);
                smaller = Arrays.copyOfRange(smaller, 0, smaller.length / 2);
            } else {
                System.out.println("==");
                return median;
            }
        }

        
        if (smaller.length == 0)
            return median;
        if (smaller.length == 1) {
            // if medianIndex ends with .5 && remaining element is <
            // return whichever is larger: 
            // the left side of larger index
            // or the remaining element in smaller
            if (medianIndex % 1 != 0 && smaller[0] < median) {
                medianIndex = Math.floor(medianIndex);
                median = larger[(int) medianIndex];
                return(Math.max(median, smaller[0]));
                // else if ends with .5 && remaining element is >
                // return whichever is smaller:
                // right side of larger index
                // or the remaining element in smaller
            } else if (medianIndex % 1 != 0 && smaller[0] > median) {
                medianIndex = Math.ceil(medianIndex);
                median = larger[(int) medianIndex];
                return(Math.min(median, smaller[0]));
                // else if ends with .00 && remaining element is <
            } else if (smaller[0] < median) {
                medianIndex -= .5;
                double left = Math.max(larger[(int) Math.floor(medianIndex)], smaller[0]);
                left += larger[(int) Math.ceil(medianIndex)]; // add right
                left /= 2.0;
                return left;
            } else if (smaller[0] > median) {
                medianIndex += .5;
                double right = Math.min(larger[(int) Math.ceil(medianIndex)], smaller[0]);
                right += larger[(int) Math.floor(medianIndex)]; // add left
                right /= 2.0;
                return right;
            } else {
                return median;
            }
            // if len = 2
        } else {
            // fuck it just merge the 2 and find the median...
            if (smaller.length == 2 && larger.length == 2)
                return mergeTwos(smaller, larger);
            if (medianIndex % 1 != 0) {
                // larger = Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex) + 1);
                if (smaller[1] < larger[(int) Math.floor(medianIndex)]) {
                    medianIndex -= 1.0;
                    return (getMedianDouble(Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex) + 1)));
                } else if (smaller[0] > larger[(int) Math.ceil(medianIndex)]) {
                    medianIndex += 1.0;
                    return (getMedianDouble(Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex) + 1)));
                }
                return mergeTwos(smaller, Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex) + 1));

            }
            else {
                System.out.println("flag");
                // 
                if (smaller[0] > median) {
                    return Math.min(smaller[0], larger[(int) medianIndex + 1]);
                } else if (smaller[1] < median) {
                    return Math.max(smaller[1], larger[(int) medianIndex - 1]);
                }
            }
        }

        // down to 2 or fewer in smaller:

        
        // while (smaller.length > 1) {

        //     if (smaller[smaller.length / 2 - 1] < median) {
        //         // System.out.println("<");
        //         // System.out.println(medianIndex);
        //         medianIndex -= (smaller.length / 2.0) / 2.0;
        //         median = getMedianDouble(Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex)));
        //         System.out.println(median);
        //         smaller = Arrays.copyOfRange(smaller, smaller.length / 2, smaller.length);
        //     } else if (smaller[smaller.length / 2 - 1] > median) {
        //         // System.out.println(">");
        //         // System.out.println(medianIndex);
        //         medianIndex += (smaller.length / 2.0) / 2.0;
        //         median = getMedianDouble(Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex)));
        //         System.out.println(median);
        //         smaller = Arrays.copyOfRange(smaller, 0, smaller.length / 2);
        //     } else {
        //         // System.out.println("==");
        //         return median;
        //     }
        // }
        // System.out.print("\nsmaller:");
        // for (int i : smaller) {
        //     System.out.print(" " + i);
        // }
        // System.out.println();

        // if (smaller.length > 0) {
        //     if (median % 1 == 0) {

        //     }
        //     if (smaller[0] < median) {
        //         if (medianIndex % 1 == 0 && medianIndex >= 1) {
        //             medianIndex -= .5;
        //             median = getMedianDouble(Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex)));
        //         } else if (medianIndex % 1 == 0 && medianIndex < 1) {
        //             median = Math.max(larger[0], smaller[0]);
        //         } else // if (medianIndex % 1 != 0) {
        //             median = Math.max(larger[(int) (medianIndex - .5)], smaller[0]);
                
        //         // System.out.println(medianIndex);
        //         // medianIndex -= .5;
        //         // System.out.println(medianIndex);
        //         // median = getMedianDouble(Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex)));
        //     } else if (smaller[0] > median) {
        //         if (medianIndex % 1 == 0) {
        //             medianIndex += .5;
        //         } else {
        //             median = Math.min(smaller[0], larger[(int) (median + .5)]);
        //         }
        //         // medianIndex += .5;
        //         // median = getMedianDouble(Arrays.copyOfRange(larger, (int) Math.floor(medianIndex), (int) Math.ceil(medianIndex)));
        //     } 
        // }

        // System.out.println("medianIndex:" + medianIndex + " : median: " + median);
        return median;
    }
    private static double mergeTwos(int[] nums1, int[] nums2) {
        System.out.println(nums2[0]);
        ArrayList<Integer> al = new ArrayList();
        al.add(nums1[0]);
        al.add(nums1[1]);
        al.add(nums2[0]);
        al.add(nums2[1]);
        Collections.sort(al);
        double median = 0.0;
        median += al.get(1);
        median += al.get(2);
        return (median / 2.0);
    }
    private static double getMedianDouble(int[] nums) {
        // printArr(nums);
        double median = nums[nums.length / 2];

        if (nums.length % 2 == 0) {
            median += nums[(nums.length / 2) - 1];
            median /= 2;
        }
        return median;
    }
    private static void printArr(int[] nums) {
        System.out.print("Array: ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

*/
/*

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // determine which array is larger
        int[] larger;
        int[] smaller;
        int ll, lr;
        int sl, sr; 

        if (nums1.length > nums2.length) {
            larger = nums1;
            smaller = nums2;
        } else {
            larger = nums2;
            smaller = nums1;
        }
        sl = 0;
        sr = smaller.length;
        ll = 0;
        lr = larger.length;


        // get median index of both
        double medianIndexL = getMedianIndex(larger);
        double medianIndexS = getMedianIndex(smaller);

        // get median of both (in double)
        double medianL = getMedianDouble(larger);
        double medianS = getMedianDouble(smaller);
        System.out.println(getMedianDouble(Arrays.copyOfRange(smaller, 2, 4)));
        
        if (medianL == medianS) return medianL;

        if (medianL > medianS) {
            // checks for x.5 or x.0
            if (medianIndexS % 1 == 0) {
                 System.out.println("blah");
            }
        }

        while (smaller.length > 1) {
            System.out.println();
            for (int i : smaller)
                System.out.print(" " + i);
            System.out.println();

            if (getMedianDouble(Arrays.copyOfRange(smaller, sl, sr)) < medianL) {
                medianIndexL -= (sr - sl) / 2;
                medianL = getMedianDouble(Arrays.copyOfRange(larger, ll, lr));
            }
            smaller = Arrays.copyOfRange(smaller, 0, smaller.length - 1);
        }


        return getMedianDouble(larger);
    }
    private static double getMedianDouble(int[] nums) {
        double median = nums[nums.length / 2];

        // System.out.println();
        // for(int i : nums)
        //     System.out.print(":" + i);
        // System.out.println();

        if (nums.length % 2 == 0) {
            median += nums[(nums.length / 2) - 1];
            median /= 2;
        }
        return median;
    }
    private static double getMedianIndex(int[] nums) {
        double index = 0;
        index += nums.length / 2.0;
        return index -= .5;
    }
}

*/