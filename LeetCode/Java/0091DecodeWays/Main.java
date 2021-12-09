class Main {
    public static void main(String[] args) {
        System.out.println("2:" + Solution.numDecodings("12"));
        System.out.println("3:" + Solution.numDecodings("226"));
        System.out.println("0:" + Solution.numDecodings("0"));
        System.out.println("0:" + Solution.numDecodings("06"));
        System.out.println("1:" + Solution.numDecodings("10"));
        System.out.println("1:" + Solution.numDecodings("2101"));
        System.out.println("4:" + Solution.numDecodings("2611055971756562"));

    }
}

class Solution {
    public static int numDecodings(String s) {

        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0')
                dp[i] = 0;
            else
                dp[i] = dp[i + 1];

            if (i + 1 < s.length() && 
                ((s.charAt(i) == '1') || 
                (s.charAt(i) == '2' && (s.charAt(i + 1) < 55 && s.charAt(i + 1) > 47)))) {
                dp[i] += dp[i + 2];
            }
        }

        return dp[0];
    }
}