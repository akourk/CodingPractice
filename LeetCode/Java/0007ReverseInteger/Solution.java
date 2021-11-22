// Given a 32-bit signed integer, reverse digits of an integer
// Note: Assume we are dealing with an environment which could
// only store integers within the 32-bit signed integer range:
// [-2^31, 2^31 - 1]. For the purpose of this problem, assume
// that your function returns 0 when the reversed integer overflows


public class Solution {

    public static int reverseInteger(int num) {

        long rev = 0;
        boolean flag = false;
        if (num < 0) {
            flag = true;
            num = 0 - num;
        }
        if(num < Integer.MAX_VALUE) {
            while (num > 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
        }
        if(rev > Integer.MAX_VALUE) {
            return 0;
        } else if (flag) {
            return 0 - (int)rev;
        } else {
            return (int)rev;
        }
    }
}
//
// Fastest solution:
//
//
//class Solution {
//    public static int reverseInteger(int x) {
//        int result = 0;
//        int remainder = 0;
//        int num = x;
//
//        while (num != 0)
//        {
//            int tail = num % 10;
//            remainder = (result * 10) + tail;
//            if ((remainder - tail) / 10 != result)
//            { return 0; }
//            result = remainder;
//            num /= 10;
//        }
//
//        return result;
//    }
//}