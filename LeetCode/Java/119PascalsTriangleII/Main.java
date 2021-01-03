package LeetCode119PascalsTriangleII;

// Given an integer rowIndex, return the rowIndexth row of the Pascal's triangle.

// Notice that the row index starts from 0.

// In Pascal's triangle, each number is the sum of the two numbers directly above it.

// Follow Up:
// Could you optimize your algorithm to use only O(k) extra space?

// Ex:
// Input:   rowIndex = 3
// Output:  [1, 3, 3, 1]

// Ex:
// Input:   rowIndex = 0
// Output:  [1]

// Ex:
// Input:   rowIndex = 1
// Output:  [1, 1]

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.getRow(0));
        System.out.println(Solution.getRow(1));
        System.out.println(Solution.getRow(2));
        System.out.println(Solution.getRow(3));
        System.out.println(Solution.getRow(4));
        System.out.println(Solution.getRow(5));
        System.out.println(Solution.getRow(6));
    }
}

class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        if (rowIndex == 0)
            return row;

        for (int i = 0; i < rowIndex + 1; i++) {
            row = generateRow(i, row);
        }

        return row;
    }

    private static List<Integer> generateRow(int row, List<Integer> prev) {
        List<Integer> next = new ArrayList<>();

        next.add(1);
        for (int i = 1; i < row; i++) {
            next.add(prev.get(i - 1) + prev.get(i));
        }
        next.add(1);
        return next;
    }
}
