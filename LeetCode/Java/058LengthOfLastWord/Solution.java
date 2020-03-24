public class Solution {
    public static int lengthOfLastWord(String s) {
        int index = 0;

        while (!s.equals(" ") && !s.equals("") && s.charAt(s.length() - 1) == ' ')
            s = s.substring(0, s.length() - 1);
        if (!s.contains(" "))
            return s.length();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length() - i - 1;
            }
        }
        return index;
    }
}
