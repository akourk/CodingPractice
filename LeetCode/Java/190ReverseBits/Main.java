package LeetCode190ReverseBits;

// Reverse bits of a given 32 bits unsigned integer.

// Note:
//  -   Note that in some languages such as Java, there is no unsigned integer type. In this case, both input and
//      output will be given as a signed integer type. They should not affect your implementation, as integer's
//      internal binary representation is the same, whether it is signed or unsigned.
//  -   In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in
//      Example 2 below, the input represents the signed integer -3 and the output represents the signed
//      integer -1073741825.

// Follow up:
// If this function is called many times, how would you optimize it?

// Example 1:
// Input:   n = 00000010100101000001111010011100
// Output:  964176192 (00111001011110000010100101000000)
// Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
// so return 964176192 which its binary representation is 00111001011110000010100101000000.

// Example 2:
// Input:   n = 11111111111111111111111111111101
// Output:  3221225471 (10111111111111111111111111111111)
// Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293,
// so return 3221225471 which its binary representation is 10111111111111111111111111111111.

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int reverseBits(int n) {
        for (int i = 0; i < 16; i++)
            n = swapBits(n, i, 32 - i - 1);
        return n;
    }
    private static int swapBits(int n, int i, int j) {
        int a = (n >> i) & 1;
        int b = (n >> j) & 1;
        if ((a ^ b) != 0)
            return n ^= (1 << i) | (1 << j);
        return n;
    }
}

// fastest solution:
//public class Solution {
//    public static int reverseBits(int n) {
//        n = (n >> 16 & 0x0000ffff) | (n << 16 & 0xffff0000);
//        n = (n >> 8 & 0x00ff00ff) | (n << 8 & 0xff00ff00);
//        n = (n >> 4 & 0x0f0f0f0f) | (n << 4 & 0xf0f0f0f0);
//        n = (n >> 2 & 0x33333333) | (n << 2 & 0xcccccccc);
//        n = (n >> 1 & 0x55555555) | (n << 1 & 0xaaaaaaaa);
//        return n;
//    }
//}