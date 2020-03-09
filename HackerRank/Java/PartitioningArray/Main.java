// Given an array of numbers, you are required to check if it is possible to partition the array into
// some subsequences of length k each, such that:
//  - Each element in the array occurs in exactly one subsequence
//  - All the numbers in a subsequence are distinct
//  - Elements in the array having the same value must be in different subsequences

// Is possible to partition the array satisfying the above conditions? If it is possible, return "Yes",
// else return "No".

// For example, suppose:
//  - There are n = 4 numbers in the array
//  - The length of each subsequence needs to be k = 2.
//  - The given array is {1, 2, 3, 4}.
//  - Then one possible way is to choose the first 2 elements of the array {1, 2} as the first
// subsequence, the next 2 elements {3, 4} as the next subsequence. So the answer is Yes.

// Consider another example:'
//  - There are n = 4 numbers in the array,
//  - The length of each subsequence needs to be k = 3.
//  - The given array is {1, 2, 2, 3}.
//  - Here there is no way to partition the array into subsequences such that all subsequences are of
// length 3 and each element in the array occurs in exactly one subsequence. Hence the answer is No.

// Function Description
// Complete the function solve in the editor below. The function has to return one string
// denoting the answer.

// solve has the following parameters:
//  k: an integer
//  numbers[0,...,n-1]: an array of integers

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(2);
        l2.add(3);

        List<Integer> l3 = new ArrayList<Integer>();
        l3.add(4);
        l3.add(8);
        l3.add(8);
        l3.add(8);
        l3.add(6);
        l3.add(4);


        System.out.println("l1, Yes: " + Result.solve(2, l1));
        System.out.println("l2, No: " + Result.solve(3, l2));
        System.out.println("l2, Yes: " + Result.solve(2, l2));
        System.out.println("l3, No: " + Result.solve(3, l3));
    }
}
