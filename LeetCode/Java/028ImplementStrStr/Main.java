// Implement strStr().
// Return the index of the first occurrence of needle in haystack, or -1
// if needle is not part of haystack.

// Example1:
// Input: haystack = "hello", needle = "ll"
// Output: 2

// Exmaple2:
// Input: haystack = "aaaaa", needle = "bba"
// Output: -1

// Clarification:
// What should we return when needle is an empty string? This is a great
// question to ask during an interview.

// For the purpose of this problem, we will return 0 when needle is an
// empty string. This is consistent to C's strstr() and Java's indexOf().

public class Main {
    public static void main(String[] args) {
        String hs1 = "hello";
        String n1 = "ll";
        System.out.println("2: " + Solution.strStr(hs1, n1));

        String hs2 = "mississippi";
        String n2 = "issip";
        System.out.println("4: " + Solution.strStr(hs2, n2));
    }
}
