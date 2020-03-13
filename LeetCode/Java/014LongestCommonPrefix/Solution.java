public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String longestPrefix = "";

        if (strs.length < 1 || strs[0].length() < 1)
            return longestPrefix;

        for (int i = 0; i < strs[0].length(); i++) {
            longestPrefix += strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < longestPrefix.length() || strs[j].charAt(i) != strs[0].charAt(i))
                    return longestPrefix.substring(0, longestPrefix.length() - 1);
            }
        }
        return longestPrefix;
    }
}

// this is the optimized solution

//public class Solution {
//    public static String longestCommonPrefix(String[] strs) {
//        if (strs == null)
//            return null;
//        if (strs.length == 0)
//            return "";
//        String res = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            while (strs[i].indexOf(res) != 0)
//                res = res.substring(0, res.length() - 1);
//        }
//        return res;
//    }
//}


// this finds the longest substring. I misinterpreted the question, but this is definitely
// a solution to a different problem. The question asks for the longest common prefix.

//        String longestStr = "";
//        String currStr = "";
//        boolean flag;
//
//        if (strs.length < 1 || strs[0].length() < 1)
//            return longestStr;
//
//        for (int i = 0; i < strs[0].length(); i++) {
//            currStr += strs[0].charAt(i);
//            flag = true;
//            for (int j = 1; j < strs.length; j++) {
//                if (!strs[j].contains(currStr))
//                    flag = false;
//            }
//            if (!flag)
//                currStr = currStr.substring(0, currStr.length() - 1);
//            if (currStr.length() > longestStr.length())
//                longestStr = currStr;
//        }
//        return longestStr;
//    }
//}
