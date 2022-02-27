import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[][] i1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println("1:" + Solution.eraseOverlapIntervals(i1));

        int[][] i2 = {{1, 2}, {1, 2}, {1, 2}};
        System.out.println("2:" + Solution.eraseOverlapIntervals(i2));
    }
}

class Solution {
    public static int eraseOverlapIntervals(int[][] intervals) {
        int minRemoved = 0;
        if (intervals.length <= 1)
            return minRemoved;

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        int i = 0;

        while (i < intervals.length - 1) {
            if (intervals[i][0] == intervals[i + 1][0] || intervals[i + 1][0] < intervals[i][1]) {
                intervals[i + 1][1] = Math.min(intervals[i][1], intervals[i + 1][1]);
                minRemoved++;
                i++;
            } else
                i++;
        }

        return minRemoved;
    }
}