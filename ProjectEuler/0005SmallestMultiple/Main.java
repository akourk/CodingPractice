class Main {
    public static void main(String[] args) {
        int i = 2520;
        while (true) {
            if (checkTwenty(i)) {
                System.out.println("the one: " + i);
                break;
            }
            // System.out.println(i);
            i++;
        }
    }

    private static boolean checkTwenty(int num) {
        for (int i = 1; i < 21; i++) {
            if (num % i != 0)
                return false;
        }

        return true;
    }
}