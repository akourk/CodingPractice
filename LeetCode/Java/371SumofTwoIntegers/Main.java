/*
Given two integers a and b, return the sum of the two integers without using the operators + and -.



Example 1:

Input: a = 1, b = 2
Output: 3
Example 2:

Input: a = 2, b = 3
Output: 5


Constraints:

-1000 <= a, b <= 1000
 */

public class Main {
    public static void main(String[] args) {

    }
}

// using bit shifting with no recursion:
class Solution {
    public static int getSum(int a, int b) {
        while (b != 0) {
            int answer = a ^ b;         // ^ = XOR      if the bits are opposite: 1, if they match: 0
            int carry = (a & b) << 1;   // & = AND      if the bits are both 1: 1, else: 0
            a = answer;                 // << 1 = left shift 1      shifts all bits 1 place to the left. (6 becomes 12)
            b = carry;
        }

        return a;
    }
}

//// using bit shifting and recursion:
//class Solution {
//    public static int getSum(int a, int b) {
//        return b == 0? a: getSum((a ^ b), (a & b) << 1);
//    }
//}

// is this cheating?
//class Solution {
//    public static int getSum(int a, int b) {
//        return Math.addExact(a, b);
//    }
//}

