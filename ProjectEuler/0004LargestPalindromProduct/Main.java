class Main {
    public static void main(String[] args) {
        int l = 999;
        int r = 999;
        int largestPalindrome = 0;

        while (l > 1) {
            if (checkPalindrome(l * r)) {
                System.out.println(l + "*" + r + " = " + l * r);
                largestPalindrome = Math.max(l * r, largestPalindrome);
            }
            l--;
            largestPalindrome = Math.max(decrementRight(l, r, largestPalindrome), largestPalindrome);
        }
        System.out.println(largestPalindrome);
    }
    private static int decrementRight(int l, int r, int max) {
        while (r > l) {
            if (checkPalindrome(l * r)) {
                System.out.println(l + "*" + r + " = " + l * r);
                return (l * r);
            }
            r--;
        }
        return 0;
    }
    private static boolean checkPalindrome(int num) {
        if (num == reverseNum(num))
            return true;
        return false;
    }

    private static int reverseNum(int num) {
        int rev = 0;
        while (num > 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        return rev;
    }
}