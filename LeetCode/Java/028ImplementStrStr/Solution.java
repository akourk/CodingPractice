public class Solution {
    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        if (!haystack.contains(needle)) return -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                    if (j == needle.length() - 1)
                        return i;
                }
            }
        }
        return 0;
    }
}
