// Given two binary strings, return their sum (also a binary string).

// The input strings are both non-empty and contains only characters 1
// or 0.

// Example 1:
// Input: a = "11", b = "1"
// Output: "100"

// Example 2:
// Input: a = "1010", b = "1011"
// Output: "10101"

public class Main {
    public static void main(String[] args) {
        System.out.println("0: " + Solution.addBinary("0", "0"));
        System.out.println("1: " + Solution.addBinary("1", "0"));
        System.out.println("10: " + Solution.addBinary("1", "1"));
        System.out.println("100: " + Solution.addBinary("11", "1"));
        System.out.println("10100: " + Solution.addBinary("1010", "1010"));
    }
}
