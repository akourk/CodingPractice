import java.util.ArrayList;
import java.util.Arrays;


class Main {
    public static void main(String[] args) {
        int[][] i1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println("[[1,3],[2,6],[8,10],[15, 18]]");
        System.out.println("[[1,6],[8,10],[15,18]]");
        int[][] iSol = Solution.merge(i1);
        for(int[] i : iSol) {
            System.out.print("[");
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.print("], ");
        }
        System.out.println();
    }
}

class Solution {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        ArrayList<int[]> mergedIntervals = new ArrayList<>();
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        int[] currentInterval = intervals[0];

        mergedIntervals.add(currentInterval);

        for (int[] interval: intervals) {
            int currentEnd = currentInterval[1];
            int newStart = interval[0];
            int newEnd = interval[1];

            if (currentEnd >= newStart) {
                currentInterval[1] = Math.max(currentEnd, newEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }
        

        return mergedIntervals.toArray(new int[0][2]);
    }
}