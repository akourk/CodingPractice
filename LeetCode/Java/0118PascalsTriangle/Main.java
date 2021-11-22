package LeetCode118PascalsTriangle;

// Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it.

// Ex:

// Input: 5
// Output:
// [
//      [1],
//     [1,1],
//    [1,2,1],
//   [1,3,3,1],
//  [1,4,6,4,1]
// ]



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> zero = Solution.generate(0);
        System.out.println(zero);
        List<List<Integer>> one = Solution.generate(1);
        System.out.println(one);
        List<List<Integer>> two = Solution.generate(2);
        System.out.println(two);
        List<List<Integer>> three = Solution.generate(3);
        System.out.println(three);
        List<List<Integer>> four = Solution.generate(4);
        System.out.println(four);
    }
}

class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> fib = new ArrayList<>();

        if (numRows == 0)
            return fib;

        List<Integer> one = new ArrayList<>(1);
        one.add(1);
        fib.add(one);

        if (numRows == 1) {
            return fib;
        }

        for(int i = 1; i < numRows; i++) {
            fib.add(generateRow(i, fib.get(i - 1)));
        }

        return fib;
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