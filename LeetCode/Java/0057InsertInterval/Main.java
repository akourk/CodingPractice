import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int[][] i1 = {{1, 3}, {6, 9}};
        int[] newI1 = {2, 5};
        System.out.println("[[1, 5], [6, 9]]");
        System.out.println(Solution.insert(i1, newI1));

        int[][] i2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newI2 = {4, 8};
        System.out.println("[[1, 2], [3, 10], [12, 16]]");
        System.out.println(Solution.insert(i2, newI2));

        int[][] i3 = {{1, 5}};
        int[] newI3 = {2, 7};
        System.out.println("[[1, 7]]");
        System.out.println(Solution.insert(i3, newI3));

        int[][] i4 = {};
        int[] newI4 = {5, 7};
        System.out.println("[[5, 7]]");
        System.out.println(Solution.insert(i4, newI4));

        int[][] i5 = {{1, 5}};
        int[] newI5 = {6, 8};
        System.out.println("[[1, 5], [6, 8]]");
        System.out.println(Solution.insert(i5, newI5));
        // Test.test(i5, newI5);

        int[][] i6 = {{1, 5}, {10, 12}};
        int[] newI6 = {6, 8};
        System.out.println("[[1, 5], [6, 8], [10, 12]]");
        System.out.println(Solution.insert(i6, newI6));
    }
}
// 1-3  6-9
//  2-5
// 1--5 6-9

// 1-2  3-5 6-7 8-10    12-16
//       4------8
// 1-2  3---------10    12-16

// 1-5
//  2-7

// 1-5
//     6-8

class Solution {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> al = new ArrayList<>();
        int i = 0;

        while (i < intervals.length && intervals[i][1] < newInterval[0])
            al.add(intervals[i++]);
        
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        al.add(newInterval);

        while (i < intervals.length)
            al.add(intervals[i++]);
    
        return al.toArray(new int[0][2]);
    }
}


/*

// i hate this
class Solution {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> al = new ArrayList<>();
        int l;
        int r;
        int i = 0;

        if (intervals.length == 0)
            al.add(new int[] {newInterval[0], newInterval[1]});
            
        while (i < intervals.length) {
            while (i + 1 < intervals.length && intervals[i][1] < newInterval[0]) {
                al.add(new int[] {intervals[i][0], intervals[i][1]});
                i++;
            }

            l = Math.min(newInterval[0], intervals[i][0]);
            while (i < intervals.length && intervals[i][1] < newInterval[1] && (i + 1 < intervals.length && intervals[i + 1][0] <= newInterval[1])) {
                i++;
            }

            if (intervals[i][0] > newInterval[1]) {
                r = newInterval[1];
                System.out.println("this");
            } else {
                r = Math.max(newInterval[1], intervals[i][1]);
            }

            al.add(new int[] {l, r});
            i++;
            
            while (i < intervals.length) {
                al.add(new int[] {intervals[i][0], intervals[i][1]});
                i++;
            }
        }

        int[][] res = new int[al.size()][2];
        for (i = 0; i < res.length; i++) {
            res[i][0] = al.get(i)[0];
            res[i][1] = al.get(i)[1];
        }

        for (i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }

        return res;
    }
}
*/

/*
class Solution {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> al = new ArrayList<>();

        int r = 0;
        int l = 0;

        if (intervals.length == 0)
            return (new int[][] {{newInterval[0], newInterval[1]}});
    
        for (int i = 0; i < intervals.length; i++) {

            while (newInterval[0] > intervals[i][1]) {
                al.add(new int[] {intervals[i][0], intervals[i][1]});
                i++;
            }

            l = Math.min(newInterval[0], intervals[i][0]);

            while (newInterval[1] > intervals[i][1])
                i++;
            
            
            if (newInterval[1] < intervals[i][0]) {
                r = newInterval[1];
            } else {
                r = Math.max(newInterval[1], intervals[i][1]);
                i++;
            }

            al.add(new int[] {l, r});

            while (i < intervals.length) {
                al.add(new int[] {intervals[i][0], intervals[i][1]});
                i++;
            }
        }

        int[][] res = new int[al.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = al.get(i)[0];
            res[i][1] = al.get(i)[1];
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }

        return res;
    }
}

*/