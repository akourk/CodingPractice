class Main {
    public static void main(String[] args) {
        int sum = 2;
        int prev = 1;
        int curr = 2;
        int temp;
        while (curr < 4000000) {
            temp = curr;
            curr += prev;
            prev = temp;
            if (curr % 2 == 0)
                sum += curr;
        }
        System.out.println(sum);
    }
}