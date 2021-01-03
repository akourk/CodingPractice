package LeetCode171ExcelSheetColumnNumber;

// Given a column title as it would appear in an Excel sheet, return its corresponding column number.

// For example:
// A:1
// B:2
// C:3
// ...
// Z:26
// AA:27
// AB:28
// ...

// Ex:
// Input:   "A"
// Output:  1

// Ex:
// Input:   "AB"
// Output:  28

// Ex:
// Input:   "ZY"
// Output:  701

public class Main {
    public static void main(String[] args) {
        System.out.println("1:" + Solution.titletoNumber("A"));
        System.out.println("28:" + Solution.titletoNumber("AB"));
        System.out.println("701:" + Solution.titletoNumber("ZY"));
    }
}

class Solution {
    public static int titletoNumber(String s) {
        int multiplier = 1;
        int val = 0;
        while (!s.equalsIgnoreCase("")) {
            val += multiplier * (s.charAt(s.length() - 1) - '@');
            s = s.substring(0, s.length() - 1);
            multiplier *= 26;
        }
        return val;
    }
}