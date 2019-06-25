// String Incrementer
// Your job is to write a function which increments a string, to
// create a new string. If the string already ends with a number,
// the number should be incremented by 1. If the string does not
// end with a number the number 1 should be appended to the new
// string.

// ex.
// foo -> foo1
// foobar23 -> foobar24
// foo0042 -> foo0043
// foo9 -> foo10
// foo099 -> foo100

// Attention: if the number has leading zeros the amount of digits
// should be considered.

public class Solution {

    public static String solution(String str) {
        String solution = "";

        if(str.length() > 0 && Character.isDigit(str.charAt(str.length() - 1))) {
            String[] part = str.split("(?<=\\D)(?=\\d)");
            char[] ary = part[1].toCharArray();


            boolean first = true;
            boolean carry = false;
            for(int i = ary.length - 1; i >= 0; i--) {
                if(carry && ary[i] != '9'){
                    ary[i]++;
                    carry = false;
                }else if(carry && ary[i] == '9') {
                    ary[i] = '0';
                }else if(ary[i] == '9') {
                    ary[i] = '0';
                    carry = true;
                } else {
                    if(first) {
                        ary[i]++;
                        first = false;
                    }
                }
            }

            solution += part[0];
            if(carry) {
                solution += "1";
            }
            for(char c : ary) {
                solution += c;
            }

        } else {
            solution = str + "1";
        }


        return solution;
    }
}