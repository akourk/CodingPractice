// Author       :   Alex Kourkoumelis
// Date         :   4/18/2019
// Title        :   Trailing Zeroes
// Description  :   Returns the total number of trailing zeroes for all
//              :   integers from 1 to its parameter n. Given 5, it
//              :   returns 0 + 1 + 0 + 2 + 0 = 3. The trailing zeroes
//              :   of an integer a are the zeroes following the last 1
//              :   in a's binary representation (ex: 0100 -> 2; 0101 -> 0).
//              :   Big-O notation in terms of n is:
//              :   Time complexity is: O(logn)


// one way to count them would be to just grab the zero
// off of the end of every binary string and add them up
// the other is to look for a pattern

// every 2 binary numbers there is 1 trailing zero
// every 4 binary numbers, there is another trailing zero
// every 8 binary numbers, there is another trailing zero
// every 16, 32, 64, etc. there is another zero
// equation: SUM(n/(2^k))


class Solution {
    public static int trailingZeroes(int n) {

        int count = 0;


//        // one way would be to convert the integer to a binary string
//        // and then remove the ending 0's while counting them up
//        // this is O(n) at least. Maybe more depending on how
//        // "toBinaryString", "endsWith", and "substring" operate.
//
//        String bin;
//        for(int i = 1; i <= n; i++) {
//            bin = Integer.toBinaryString(i);
//            while(bin.endsWith("0")) {
//                count++;
//                bin = bin.substring(0, bin.length() -1);
//            }
//        }



//        // this works too, but is O(2*logn)
//
//        int temp = n;
//        int zeroes = 0;
//
//        // to find log(n)
//        while(temp > 1) {
//            temp = temp/2;
//            count+=temp;
//        }
//
//        // this is our SUM(n/(2^k)) equation
//        for(int i = 1; i <= count; i++) {
//            zeroes += n / (1<<i);   // bit shifting for multiply by 2
//        }
//        return zeroes;



        // this is faster: O(logn)
        // I cut out a pointless step in the previous example
        // once I remembered how logs work.
        while(n > 1) {
            n = n/2;
            count+=n;
        }

        return count;
    }

}