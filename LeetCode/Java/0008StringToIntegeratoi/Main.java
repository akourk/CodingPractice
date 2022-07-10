class Main {
    public static void main(String[] args) {
        System.out.println("-42\n" + Solution.myAtoi("     -42"));
        System.out.println("4193\n" + Solution.myAtoi("4193 with words"));
        System.out.println("-2147483648\n" + Solution.myAtoi("-91283472332"));
        System.out.println("2147483647\n" + Solution.myAtoi("9223372036854775808"));

    }
}

class Solution {
    public static int myAtoi(String s) {
        long val = 0;
        boolean pos = true;
        int i = 0;
        if (s.length() == 0)
            return 0;

        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        
        if (i < s.length() && s.charAt(i) == '-') {
            pos = false;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+')
            i++;

        if (i < s.length() && (s.charAt(i) < '0' || s.charAt(i) > '9'))
            return 0;
        
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            val *= 10;
            val += s.charAt(i) - '0';
            i++;
            if (val > Integer.MAX_VALUE)
                i = Integer.MAX_VALUE;
        }

        if (val > Integer.MAX_VALUE)
            if (pos)
                return Integer.MAX_VALUE;
            else
                return Integer.MIN_VALUE;
        else if (pos)
            return (int) val;
        else
            return (int) -val;
    }
}