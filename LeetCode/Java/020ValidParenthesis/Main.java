// Given a string containing just the characters '(', ')', '{', '}', '[', and ']',
// determine if the input string is valid.

// An input string is valid if:
//  1. Open brackets must be closed by the same type of brackets.
//  2. Open brackets must be closed int he correct order.

// Note that an empty string is also considered valid.

// ex1:
// Input: "()"
// Output: true

// ex2:
// Input: "()[]{}"
// Output: true

// ex3:
// Input: "(]"
// Output: false

// ex4:
// Input: "([)]"
// Output: false

// ex5:
// Input: "{[]}"
// Output: true

public class Main {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        System.out.println("true: " + Solution.isValid(s1));
        System.out.println("true: " + Solution.isValid(s2));
        System.out.println("false: " + Solution.isValid(s3));
        System.out.println("false: " + Solution.isValid(s4));
        System.out.println("true: " + Solution.isValid(s5));

    }
}
