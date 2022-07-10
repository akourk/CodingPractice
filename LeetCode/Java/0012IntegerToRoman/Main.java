class Main {
    public static void main(String[] args) {
        System.out.println("III\n" + Solution.intToRoman(3));
        System.out.println("LVIII\n" + Solution.intToRoman(58));
        System.out.println("MCMXCIV\n" + Solution.intToRoman(1994));
        System.out.println("MMMMMMMMMMMMMMMMMMMMCMXLIV\n" + Solution.intToRoman(20944));

    }
}

class Solution {
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        while (num >= 1000) {
            sb.append('M');
            num -= 1000;
        }
        while (num >= 900) {
            sb.append("CM");
            num -= 900;
        }
        while (num >= 500) {
            sb.append('D');
            num -= 500;
        }
        while (num >= 400) {
            sb.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            sb.append('C');
            num -= 100;
        }
        while (num >= 90) {
            sb.append("XC");
            num -= 90;
        }
        while (num >= 50) {
            sb.append('L');
            num -= 50;
        }
        while (num >= 40) {
            sb.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            sb.append('X');
            num -= 10;
        }
        while (num >= 9) {
            sb.append("IX");
            num -= 9;
        }
        while (num >= 5) {
            sb.append('V');
            num -= 5;
        }
        while (num >= 4) {
            sb.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            sb.append("I");
            num -= 1;
        }
            
        return sb.toString();
    }
}