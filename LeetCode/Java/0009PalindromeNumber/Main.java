// Determine whether an integer is a palindrome. An integer
// is a palindrome when it reads the same backward as forward.

public class Main {

    public static void main(String[] args) {

        System.out.println("True: ");
        System.out.println(Solution.palindromeNumber(0));
        System.out.println(Solution.palindromeNumber(101));
        System.out.println(Solution.palindromeNumber(1221));
        System.out.println(Solution.palindromeNumber(10001));
        System.out.println(Solution.palindromeNumber(5355535));
        System.out.println(Solution.palindromeNumber(123321));

        System.out.println("\nFalse: ");
        System.out.println(Solution.palindromeNumber(-32));
        System.out.println(Solution.palindromeNumber(123456789));
        System.out.println(Solution.palindromeNumber(10));
        System.out.println(Solution.palindromeNumber(122));
        System.out.println(Solution.palindromeNumber(123124));
        System.out.println(Solution.palindromeNumber(1224213));
        System.out.println(Solution.palindromeNumber(12212343));
        System.out.println(Solution.palindromeNumber(123));


    }
}
