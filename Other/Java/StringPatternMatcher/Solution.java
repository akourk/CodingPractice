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


class Solution {
    public static int stringPatternMatcher(String t, String p) {

        int pos = 0;
        int i = 0;
        int start = 0;
        boolean finished = false;


        // takes care of empty strings and if the pattern is longer than the string
        if(p.length() > t.length() || p.length() == 0) {
            return -1;
        }

        // while the letter in the text matches the pattern we increment the position
        // and pattern index. Also, if ever the remaining characters in the pattern are
        // more than the remaining characters in the text, end the loop.
        while(pos < p.length() && t.length() - i >= p.length() - pos) {


            if(t.charAt(i) == p.charAt(pos)){

                // this is how we keep track of the starting index
                if(pos == 0) {
                    start = i;
                }
                pos++;
                if (pos == p.length()) {
                    finished = true;
                }

                // if the text stops matching for some reason, we reset the position
            } else {
                pos = 0;
            }
            i++;
        }
        if(finished) {
            return start;
        } else {
            return -1;
        }
    }
}