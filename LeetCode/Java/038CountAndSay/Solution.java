// The count-and-say sequence is the sequence of integers
// with the first ten terms as following:
// 1.   1
// 2.   11
// 3.   21
// 4.   1211
// 5.   111221
// 6.   312211
// 7.   13112221
// 8.   1113213211
// 9.   31131211131221
// 10.  13211311123113112211
// 1 is read off as "one 1" or 11
// 11 is read off as "two 1's" or 21
// 21 is read off as "one two", then "one 1" or 1211
// Given an integer n where 1 <= n <= 30, generate the nth term
// of the count-and-say sequence.
// Note: Each term of the sequence of integers will be
// represented as a string.

public class Solution {

    public static String countAndSay(int n) {
        if (n < 1)
            return null;
        if (n == 1)
            return "1";

        StringBuffer sb = new StringBuffer("11");
        for (int i = 2; i < n; i++) {
            StringBuffer c = new StringBuffer();
            int count = 1;
            for (int j = 1; j < sb.length(); j++) {
                if (sb.charAt(j-1) == sb.charAt(j)) {
                    count++;
                } else {
                    c.append(count);
                    c.append(sb.charAt(j-1));
                    count = 1;
                }
            }
            c.append(count);
            c.append(sb.charAt(sb.length() - 1));
            sb = c;
        }

        return sb.toString();

    }
}
