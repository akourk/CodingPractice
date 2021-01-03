package LeetCode168ExcelSheetColumnTitle;

// Given a positive integer, return its corresponding column title as it would appear in an Excel sheet.

// For example:
//  1:A
//  2:B
//  3:C
//  ...
//  26:Z
//  27:AA
//  28:AB
//  ...

// Ex:
// Input:   1
// Output:  "A"

// Ex:
// Input:   28
// Output:  "AB"

// Ex:
// Input:   701
// Output:  "ZY"
public class Main {
    public static void main(String[] args) {
        System.out.println("A:" + Solution.convertToTitle(1));
        System.out.println("AB:" + Solution.convertToTitle(28));
        System.out.println("AY:" + Solution.convertToTitle(51));
        System.out.println("AZ:" + Solution.convertToTitle(52));
        System.out.println("ZY:" + Solution.convertToTitle(701));
        System.out.println("ZZ:" + Solution.convertToTitle(702));
        System.out.println("AAA:" + Solution.convertToTitle(703));
        System.out.println("ZZY:" + Solution.convertToTitle(18277));
        System.out.println("ZZZ:" + Solution.convertToTitle(18278));
        System.out.println("AAAA:" + Solution.convertToTitle(18279));
    }
}

class Solution {
    public static String convertToTitle(int n) {
        String str = "";
        while (n > 0) {
            n--;
            char ch = (char) (n % 26 + 'A');
            n /= 26;
            str = ch + str;
        }
        return str;
    }
}

// fastest solution with stringbuilder:

//class Solution {
//    public static String convertToTitle(int n) {
//        StringBuilder sb = new StringBuilder();
//        while (n != 0) {
//            int i = (n - 1) % 26;
//            sb.append((char)('A' + i));
//            n = (n - 1) / 26;
//        }
//        return sb.reverse().toString();
//    }
//}


//// so close...
//class Solution {
//    public static String convertToTitle(int n) {
//        String str = "";
//        char ch = '@';
//        while (n > 26) {
//            ch += (n % 26);
//            str = ch + str;
//            n /= 26;
//            ch = '@';
//        }
//        ch += n;
//        str = ch + str;
//        return str;
//    }
//}



//class Solution {
//    public static String convertToTitle(int n) {
//        String str = "";
//        char ch = '@';
//        while (n > 26) {
//            ch += (n / 26);
//            str += ch;
//            System.out.println("n:" + n);
//            n /= 26;
////            n = n - (ch * 26);
//            ch = '@';
//        }
//        System.out.println("n:" + n);
//        ch += n;
//        str += ch;
//
//        return str;
//    }
//}