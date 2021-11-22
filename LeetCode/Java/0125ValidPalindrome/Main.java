package LeetCode125ValidPalindrome;

// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

// Note: For the purpose of this problem, we define empty string as valid palindrome.

// Ex:
// Input:   "A man, a plan, a canal: Panama"
// Output:  true

// Ex:
// Input:   "race a car"
// Output:  false

public class Main {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("true:" + Solution.isPalindrome(s1));
        String s2 = "race a car";
        System.out.println("false:" + Solution.isPalindrome(s2));
        String s3 = " ";
        System.out.println("true:" + Solution.isPalindrome(s3));
        String s4 = "a.";
        System.out.println("true:" + Solution.isPalindrome(s4));
        String s5 = ".,";
        System.out.println("true:" + Solution.isPalindrome(s5));
        String s6 = "0P";
        System.out.println("false:" + Solution.isPalindrome(s6));
        String s7 = ":!B?0lz,w!zl0?B,:";
        System.out.println("true:" + Solution.isPalindrome(s7));
    }
}

class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int j = s.length() - 1;
        int i = 0;
        boolean letterflag = false;

        while (i < s.length() && j > 0) {
            while ((i < s.length() - 1) && (s.charAt(i) < 48 ||
                    (s.charAt(i) > 57 && s.charAt(i) < 97) ||
                    s.charAt(i) > 122)) {
                i++;
            }
            while ((j > 0) && (s.charAt(j) < 48 ||
                    (s.charAt(j) > 57 && s.charAt(j) < 97) ||
                    s.charAt(j) > 122))
                j--;
            if (!letterflag && (i < s.length() - 1 && j > 0) &&
                    ((s.charAt(i) > 47 && s.charAt(i) < 58) ||
                    (s.charAt(i) > 96 && s.charAt(i) < 123)) ||
                    (s.charAt(j) > 47 && s.charAt(j) < 58) ||
                    (s.charAt(j) > 96 && s.charAt(j) < 123))
                letterflag = true;
            if (s.charAt(i) != s.charAt(j) && letterflag)
                return false;
            i++;
            j--;
        }
        return true;
    }
}


// way simpler...
// runs in O(n/2) as opposed to O(n).
// also, Character.isLetterOrDigit exists...

//class Solution {
//    public static boolean isPalindrome(String s) {
//        int i = 0;
//        int j = s.length() - 1;
//        while (i < j) {
//            if (!Character.isLetterOrDigit(s.charAt(i))) {
//                i++;
//                continue;
//            }
//            if (!Character.isLetterOrDigit(s.charAt(j))) {
//                j--;
//                continue;
//            }
//            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
//                return false;
//            i++;
//            j--;
//        }
//        return true;
//    }
//}