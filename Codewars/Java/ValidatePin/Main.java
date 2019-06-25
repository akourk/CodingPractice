public class Main {

    public static void main(String[] args) {

        System.out.println("True: Valid Pins");
        System.out.println(Solution.validatePin("1234"));
        System.out.println(Solution.validatePin("0000"));
        System.out.println(Solution.validatePin("1111"));
        System.out.println(Solution.validatePin("123456"));
        System.out.println(Solution.validatePin("000000"));
        System.out.println(Solution.validatePin("090909"));

        System.out.println("False: Non Digit Characters");
        System.out.println(Solution.validatePin("a234"));
        System.out.println(Solution.validatePin(".234"));

        System.out.println("False: Invalid Lengths");
        System.out.println(Solution.validatePin("1"));
        System.out.println(Solution.validatePin("12"));
        System.out.println(Solution.validatePin("123"));
        System.out.println(Solution.validatePin("12345"));
        System.out.println(Solution.validatePin("-1234"));
        System.out.println(Solution.validatePin("1.234"));
        System.out.println(Solution.validatePin("00000000"));

    }
}
