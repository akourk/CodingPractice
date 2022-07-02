class Main {
    public static void main(String[] args) {
        long x = 3L;
        long sum = 2L;

        while (x < 100) {
            if (isPrimeLong(x)) {
                sum += x;
                System.out.println(x + " :" + sum);
            }
            x += 2;
        }
    }
    // private static boolean isPrimeLong(long x) {
    //     for (long l = 2L; l < x/2 + 1; l++) {
    //         if (x % l == 0)
    //             return false;
    //     }
    //     return true;
    // }

    // much faster isPrime method:

    // explanation:
    // 1 is not prime
    // all primes except 2 are odd
    // all primes greater than 3 can be written in the form 6k +/- 1
    // any number n can have only 1 prime factor greater than sqrt(n)
    // the consequence for primality testing of a number n is:
    //  if we cannot find a number f less <= sqrt(n) that divides n then n is prime:
    // the only primefactor of n is n itself.
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