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


// fastest solution
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();

        int[] seen = new int[128];
        int max = 0;
        int left = 0;

        for (int i = 0; i < str.length; i++) {
            if (seen[str[i]] <= left) {
                seen[str[i]] = i + 1;
                max = Math.max(i - left + 1, max);
            } else {
                left = seen[str[i]];
                seen[str[i]] = i + 1;
            }
        }

        return max;
    }
}

// first attempt
//public class Solution {
//    public static int lengthOfLongestSubstring(String s) {
//        int maxLen = 0;
//        String substring = "";
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                if (substring.indexOf(s.charAt(j)) >= 0) {
//                    j = s.length();
//                    substring = "";
//                } else {
//                    substring += s.charAt(j);
//                    if (maxLen < substring.length())
//                        maxLen = substring.length();
//                }
//            }
//        }
//        return maxLen;
//    }
//}
