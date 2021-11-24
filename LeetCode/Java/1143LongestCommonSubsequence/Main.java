
public class Main {
    public static void main(String[] args) {
        System.out.println("hola");
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(s1 + " " + s1.length());
        System.out.println(Solution.longestCommonSubsequence(s1, s2));
    }
}

class Solution {
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] lcs = new int[text1.length() + 1][text2.length() + 1];

        for (int i = text1.length() - 1; i >= 0; i--) {
            for (int j = text2.length() - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j))
                    lcs[i][j] = lcs[i + 1][j + 1] + 1;
                else
                    lcs[i][j] = Math.max(lcs[i + 1][j], lcs[i][j + 1]);
            }
        }
        return lcs[0][0];
    }
}