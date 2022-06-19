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
    private static boolean isPrimeLong(long x) {
        for (long l = 2L; l < x/2 + 1; l++) {
            if (x % l == 0)
                return false;
        }
        return true;
    }
}