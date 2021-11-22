// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// ex1:
// Input: ["flower", "flow", "flight"]
// Output: "fl"

// ex2:
// Input: ["dog", "racecar", "car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

// note: All given inputs are in lowercase letters a-z.

public class Main {
    public static void main(String[] args) {
        String[] str1 = {"flower", "flow", "flight"};
        String[] str2 = {"a"};
        String[] str3 = {"c", "c"};
        String[] str4 = {"aa", "a"};

        System.out.println("str1: fl: " + Solution.longestCommonPrefix(str1));
        System.out.println("str2: a: " + Solution.longestCommonPrefix(str2));
        System.out.println("str3: c: " + Solution.longestCommonPrefix(str3));
        System.out.println("str4: a: " + Solution.longestCommonPrefix(str4));

    }
}
