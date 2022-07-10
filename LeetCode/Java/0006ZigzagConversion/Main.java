class Main {
    public static void main(String[] args) {

        System.out.println("PAHNAPLSIIGYIR\n" + Solution.convert("PAYPALISHIRING", 3));
        System.out.println("PINALSIGYAHRPI\n" + Solution.convert("PAYPALISHIRING", 4));
        System.out.println("PAYPALISHIRING\n" + Solution.convert("PAYPALISHIRING", 1));
    }
}

/*
 PAYPALISHIRING, 3
 PAHNAPLSIIGYIR

 P   A   H   N
 A P L S I I G
 Y   I   R

 PAYPALISHIRING, 4
 PINALSIGYAHRPI

 P     I     N
 A   L S   I G
 Y A   H R
 P     I
 
 */

//i guess SB is more than twice as fast as "string += string.charAt()..."
class Solution {
    public static String convert(String s, int numRows) {
        
        int row = 1;
        int count = 1;
        boolean incrementing = false;
        StringBuilder sb = new StringBuilder();

        if (numRows == 1)
            return s;

        while (row <= numRows) {
            count = 1;
            for (int i = 0; i < s.length(); i++) {
                if (count == row)
                    sb.append(s.charAt(i));

                if (count == 1) {
                    incrementing = true;
                    count++;
                } else if (count == numRows) {
                    incrementing = false;
                    count--;
                } else if (incrementing) {
                    count++;
                } else
                    count--;
            }
            row++;
        }
        
        return sb.toString();
    }
}

// class Solution {
//     public static String convert(String s, int numRows) {
        
//         int row = 1;
//         int count = 1;
//         boolean incrementing = false;
//         String ret = "";

//         if (numRows == 1)
//             return s;

//         while (row <= numRows) {
//             count = 1;
//             for (int i = 0; i < s.length(); i++) {
//                 if (count == row)
//                     ret += s.charAt(i);

//                 if (count == 1) {
//                     incrementing = true;
//                     count++;
//                 } else if (count == numRows) {
//                     incrementing = false;
//                     count--;
//                 } else if (incrementing) {
//                     count++;
//                 } else
//                     count--;
//             }
//             row++;
//         }
        
//         return ret;
//     }
// }
