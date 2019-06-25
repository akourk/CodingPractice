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

public class Main {

    public static void main(String[] args) {


        System.out.println(Solution.countAndSay(1));
        System.out.println(Solution.countAndSay(2));
        System.out.println(Solution.countAndSay(3));
        System.out.println(Solution.countAndSay(4));
        System.out.println(Solution.countAndSay(5));
        System.out.println(Solution.countAndSay(6));
        System.out.println(Solution.countAndSay(7));
        System.out.println(Solution.countAndSay(8));
        System.out.println(Solution.countAndSay(9));
        System.out.println(Solution.countAndSay(10));
        System.out.println(Solution.countAndSay(30));
    }
}
