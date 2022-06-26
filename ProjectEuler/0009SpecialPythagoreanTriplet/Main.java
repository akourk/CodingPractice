class Main {
    public static void main(String[] args) {
        // a < b < c
        // a^2 + b^2 = c^2
        // 3^2 + 4^2 = 5^2
        // 9 + 16 = 25

        // a + b + c = 1000
        int c = Integer.MAX_VALUE;
        for (int a = 332; a > 3; a--) {
            for (int b = a + 1; b < c; b++) {
                c = 1000 - a - b;
                if (checkPythag(a, b, c))
                    System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c) + 
                    "\n" + a + "^2 + " + b + "^2 = " + c + "^2 \n"
                    + a*a + " + " + b*b + " = " + c*c + "\n"
                    + a + " * " + b + " * " + c + " = " + a*b*c);
                // System.out.println(a + " " + b + " " + c + " = " + (a + b + c));
            }
        }
    }
    private static boolean checkPythag(int a, int b, int c) {
        if (a * a + b * b == c * c)
            return true;

        return false;
    }
}