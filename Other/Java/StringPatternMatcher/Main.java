// Author       :   Alex Kourkoumelis
// Date         :   4/22/2019
// Title        :   String Pattern Matcher
// Description  :   Performs substring pattern matching.
//              :   Determines if the text contains the
//              :   given pattern and returns the
//              :   starting index of the pattern.
//              :   O(n + m), n = text, m = pattern
//              :   The pattern matcher will at most iterate
//              :   through the text once and pattern once.

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Should return 3:");
        System.out.println(Solution.stringPatternMatcher("substring", "string"));

        System.out.println("Should return 5:");
        System.out.println(Solution.stringPatternMatcher("substring", "ring"));

        System.out.println("Should return 2:");
        System.out.println(Solution.stringPatternMatcher("wizard", "zard"));

        System.out.println("Should return -1:");
        System.out.println(Solution.stringPatternMatcher("man", "manuel"));

        System.out.println("Should return -1:");
        System.out.println(Solution.stringPatternMatcher("", ""));

        System.out.println("Should return -1:");
        System.out.println(Solution.stringPatternMatcher("This is a test", "tell"));
    }
}
