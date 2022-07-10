class Main {
    public static void main(String[] args) {

        int count = 0;
        long i = 2L;
        // 104743
        while (count < 10001) {
            if (isPrimeLong(i)) {
                count++;
                System.out.println(i + " " + count);
                i += 2;
            } else {
                i++;
            }
        }
    }
    // private static boolean isPrimeLong(long x) {
    //     for (long l = 2L; l < x/2 + 1; l++) {
    //         if (x % l == 0)
    //             return false;
    //     }
    //     return true;
    // }

    // more efficient method (explained in comments of problem 0010SummationOfPrimes):
    private static boolean isPrimeLong(long n) {
        long r, f;
        if (n == 1)
            return false;
        if (n < 4)
            return true;
        if (n % 2 == 0)
            return false;
        if (n < 9)
            return true;
        if (n % 3 == 0)
            return false;
        else
            // sqrt(x) rounded to the greatest integer r
            // so that r*r <= x
            r = (long) Math.floor(Math.sqrt(n));
            f = 5;
            while (f <= r) {
                if (n % f == 0 || n % (f + 2) == 0)
                    return false;
                f += 6;
        }

        return true;
    }
}