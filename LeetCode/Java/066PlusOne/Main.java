// Given a non-empty array of digits representing a non-negative integer, plus
// one to the integer.

// The digits are stored such that the most significant digit is at the head of the
// list, and each element in the array contain a single digit.

// You may assume the integer does not contain any leading zero, except the
// number 0 itself.

// Example 1:
// Input: [1, 2, 3]
// Output: [1, 2, 4]
// Explanation: The array represents the integer 123

// Example 2:
// Input: [4, 3, 2, 1]
// Output: [4, 3, 2, 2]
// Explanation: The array represents the integer 4321

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.print("1 2 4: ");
        int[] arr1return = Solution.plusOne(arr1);
        for (int i = 0; i < arr1return.length; i++) {
            System.out.print(arr1return[i] + " ");
        }
        System.out.println();


        int[] arr2 = {4, 3, 2, 1};
        System.out.print("4 3 2 2: ");
        int[] arr2return = Solution.plusOne(arr2);
        for (int i = 0; i < arr2return.length; i++) {
            System.out.print(arr2return[i] + " ");
        }
        System.out.println();

        int[] arr3 = {9};
        System.out.print("1 0: ");
        int[] arr3return = Solution.plusOne(arr3);
        for (int i = 0; i < arr3return.length; i++) {
            System.out.print(arr3return[i] + " ");
        }
        System.out.println();
    }
}
