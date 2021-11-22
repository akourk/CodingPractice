// Given a string, find the length of the longest substring
// without repeating characters.

// ex1:
// Input: "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the
// length of 3.

// ex2:
// Input: "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the
// length of 1.

// ex3:
// Input: "pwwkew"
// Output: 3
// Explanation: The answer is "wko", with the
// length of 3.
//          Note that the answer must be a
// substring, "pwke" is a subsequence and not a
// substring.
public class Main {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "aab";
        String s5 = "dvdf";

        System.out.println("3: " + Solution.lengthOfLongestSubstring(s1));
        System.out.println("1: " + Solution.lengthOfLongestSubstring(s2));
        System.out.println("3: " + Solution.lengthOfLongestSubstring(s3));
        System.out.println("2: " + Solution.lengthOfLongestSubstring(s4));
        System.out.println("3: " + Solution.lengthOfLongestSubstring(s5));
    }
}

