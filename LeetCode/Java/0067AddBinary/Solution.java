public class Solution {
    public static String addBinary(String a, String b) {
        int carry = 0;
        String rev = "";
        String s = "";

        if (a.length() > b.length()) {
            for (int i = 0; i < a.length() - b.length(); i++) {
                s += "0";
            }
            s += b;
            b = s;
        }
        if (b.length() > a.length()) {
            for (int i = 0; i < b.length() - a.length(); i++) {
                s += "0";
            }
            s += a;
            a = s;
        }
        s = "";

        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(a.length() - 1 -i) - 48) + (b.charAt(b.length() - 1 -i) - 48) + carry == 3) {
                carry = 1;
                rev += "1";
            } else if ((a.charAt(a.length() - 1 -i) - 48) + (b.charAt(b.length() - 1 -i) - 48) + carry == 2) {
                carry = 1;
                rev += "0";
            } else if ((a.charAt(a.length() - 1 -i) - 48) + (b.charAt(b.length() - 1 -i) - 48) + carry == 1) {
                carry = 0;
                rev += "1";
            } else {
                carry = 0;
                rev += "0";
            }
        }
        if (carry == 1)
            rev += "1";
        if (carry == 2)
            rev += "01";

        for (int i = 1; i <= rev.length(); i++) {
            s += rev.charAt(rev.length() - i);
        }
        return s;
    }
}

// faster and better solution...

/*

StringBuilder sb = new StringBuilder();
int s = 0;
for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || s > 0; i--, j--) {
    if (i >= 0) s += a.charAt(i) - '0';
    if (j >= 0) s += b.charAt(j) - '0';
    sb.append(s & 1);
    s >>= 1;
}
return sb.reverse().toString();

*/
