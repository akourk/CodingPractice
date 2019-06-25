// Determine whether an integer is a palindrome. An integer
// is a palindrome when it reads the same backward as forward.


public class Solution {

    public static boolean palindromeNumber(int num) {

        if(num < 0) {
            return false;
        }

        int temp = num;
        int newNum = 0;

        while (temp > 0) {
            newNum = (newNum * 10) + temp % 10;
            temp = temp / 10;
        }
        return (num == newNum);
    }
}

//
//// faster with larger numbers.
//
//public class Solution {
//
//    public static boolean palindromeNumber(int num) {
//
//        if(num < 0) {
//            return false;
//        } else if (num % 10 == 0) {
//            return num == 0;
//        }
//
//        int newNum = 0;
//
//        while (num >= newNum) {
//            newNum = (newNum * 10) + num % 10;
//            if(num==newNum)return true;
//            num = num / 10;
//            if(num==newNum)return true;
//        }
//        return (false);
//    }
//}

