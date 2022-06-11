class Main {
    public static void main(String[] args) {
        long num = 600851475143L;
        // System.out.println(isPrime(30));
        // checkFactors(13195);
        checkFactorLong(num);
    }
    private static void checkFactorLong(long x) {

        long num = x;
        long i = 2L;
        while (i <= num) {
            if (num % i == 0) {
                if (isPrimeLong(i)) {
                    System.out.println(i);
                    num /= i;
                }
            }
            i++;
        }


        // for (long l = 2L; l < x/2; l++) {
        //     if (x % l == 0) {
        //         if (isPrimeLong(l)) {
        //             System.out.print(l + " ");
        //         }
                    
        //     }
        // }
    }
    private static void checkFactors(int x) {
        for (int i = 2; i < x/2; i++) {
            if (x % i == 0) {
                if (isPrime(i))
                    System.out.println(i + " ");
            }
        }
    }
    private static boolean isPrimeLong(long x) {
        for (long l = 2L; l < x/2; l++) {
            if (x % l == 0)
                return false;
        }
        return true;
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i < x/2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}