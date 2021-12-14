import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s1 = "leetcode";
        List<String> l1 = new ArrayList<String>();
        l1.add("leet");
        l1.add("code");
        System.out.println("true:" + Solution.wordBreak(s1, l1));
        
    }
}

class Solution {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[dp.length - 1] = true;

        for (int i = s.length(); i >= 0; i--) {
            for (String word : wordDict) {
                if (i + word.length() - 1 <= s.length() - 1 && 
                    s.substring(i, i + word.length()).equals(word))

                    dp[i] = dp[i + word.length()];
                if (dp[i])
                    break;
            }
        }
        return dp[0];
    }
}

// this is cleaner and faster. always use a hashset...
// class Solution {
//     public static boolean wordBreak(String s, List<String> wordDict) {
//         Set<String> hs = new HashSet<>(wordDict);
//         boolean[] dp = new boolean[s.length() + 1];
//         dp[0] = true;
//         for (int i = 1; i <= s.length(); i++) {
//             for (int j = 0; j < i; j++) {
//                 if (dp[j] && hs.contains(s.substring(j, i))) {
//                     dp[i] = true;
//                     break;
//                 }
//             }
//         }
//         return dp[s.length()];
//     }
// }
