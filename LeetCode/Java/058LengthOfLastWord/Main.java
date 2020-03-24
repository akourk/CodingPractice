// Given a string s consists of upper/lower-case alphabets and empty space
// characters ' ', return the length of the last word (last word means the last
// appearing word if we loop from left to right) in the string.

// If the last word does not exist, return 0.

// Note: A word is defined as a maximal substring consisting of non-space characters only.

// Example:
// Input: "Hello World"
// Output: 5

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println("5: " + Solution.lengthOfLastWord(s1));
        String s2 = "       ";
        System.out.println("0: " + Solution.lengthOfLastWord(s2));
        String s3 = "a";
        System.out.println("1: " + Solution.lengthOfLastWord(s3));
        String s4 = " a";
        System.out.println("1: " + Solution.lengthOfLastWord(s4));
        String s5 = "a ";
        System.out.println("1: " + Solution.lengthOfLastWord(s5));
    }
}
