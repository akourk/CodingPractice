// Given a 32-bit signed integer, reverse digits of an integer
// Note: Assume we are dealing with an environment which could
// only store integers within the 32-bit signed integer range:
// [-2^31, 2^31 - 1]. For the purpose of this problem, assume
// that your function returns 0 when the reversed integer overflows

public class Main {

    public static void main(String[] args) {

        System.out.println(-11%10);

        System.out.println("Simple tests:");
        System.out.println(Solution.reverseInteger(1));
        System.out.println(Solution.reverseInteger(12));
        System.out.println(Solution.reverseInteger(123));
        System.out.println(Solution.reverseInteger(1234));
        System.out.println(Solution.reverseInteger(12345));
        System.out.println(Solution.reverseInteger(123456));
        System.out.println(Solution.reverseInteger(1234567));
        System.out.println(Solution.reverseInteger(105020403));

        System.out.println("\nEnding with 0:");
        System.out.println(Solution.reverseInteger(10));
        System.out.println(Solution.reverseInteger(120));
        System.out.println(Solution.reverseInteger(1230));
        System.out.println(Solution.reverseInteger(12340));
        System.out.println(Solution.reverseInteger(123450));
        System.out.println(Solution.reverseInteger(1234560));
        System.out.println(Solution.reverseInteger(12345670));
        System.out.println(Solution.reverseInteger(1050204030));

        System.out.println("\nNegative numbers:");
        System.out.println(Solution.reverseInteger(-1));
        System.out.println(Solution.reverseInteger(-12));
        System.out.println(Solution.reverseInteger(-123));
        System.out.println(Solution.reverseInteger(-1234));
        System.out.println(Solution.reverseInteger(-12345));
        System.out.println(Solution.reverseInteger(-123456));
        System.out.println(Solution.reverseInteger(-1234567));
        System.out.println(Solution.reverseInteger(-105020403));

        System.out.println("\nOut of range solutions:");
        System.out.println(Solution.reverseInteger(1056389759));


    }
}
