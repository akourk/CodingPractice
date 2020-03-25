public class Solution {
    public static int[] plusOne(int[] digits) {

        int i = digits.length - 1;
        boolean carry = false;

        while (i >= 0 && digits[i] == 9) {
            carry = true;
            digits[i] = 0;
            i--;
        }

        if (carry && i == -1) {
            int[] newarr = new int[digits.length + 1];
            newarr[0] = 1;
            for (int j = 0; j < digits.length; j++) {
                newarr[j + 1] = digits[j];
            }
            return newarr;
        }

        digits[i]++;
        return digits;
    }
}
