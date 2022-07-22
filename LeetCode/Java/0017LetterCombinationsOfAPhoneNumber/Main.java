import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Main {
    public static void main(String[] args) {
       List<String> l1 = Solution.letterCombinations("23");
       System.out.println(l1);

       List<String> l2 = Solution.letterCombinations("232");
       System.out.println(l2);

       List<String> l3 = Solution.letterCombinations("237");
       System.out.println(l3);

       List<String> l4 = Solution.letterCombinations("292");
       System.out.println(l4);

       List<String> l5 = Solution.letterCombinations("7");
       System.out.println(l5);

       List<String> l6 = Solution.letterCombinations("5678");
       System.out.println(l6);
    }
}


class Solution {
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if (digits.length() >= 1) {
            int nums = 1;
            for (int i = 0; i < digits.length(); i++)
                if (digits.charAt(i) == '7' || digits.charAt(i) == '9')
                    nums *= 4;
                else
                    nums *= 3;

            String a = convertIntToChar(digits.charAt(0));
            for (int i = 0; i < nums; i++) {
                list.add(Character.toString(a.charAt(i % a.length())));
            }

            if (digits.length() >= 2) {
                Collections.sort(list);
                a = convertIntToChar(digits.charAt(1));
                for (int i = 0; i < nums; i++) {
                    StringBuilder s = new StringBuilder(list.get(i));
                    s.append(a.charAt(i % a.length()));
                    list.set(i, s.toString());
                }

                if (digits.length() >= 3) {
                    Collections.sort(list);
                    a = convertIntToChar(digits.charAt(2));
                    for (int i = 0; i < nums; i++) {
                        StringBuilder s = new StringBuilder(list.get(i));
                        s.append(a.charAt(i % a.length()));
                        list.set(i, s.toString());
                    }

                    if (digits.length() >= 4) {
                        Collections.sort(list);
                        a = convertIntToChar(digits.charAt(3));
                        for (int i = 0; i < nums; i++) {
                            StringBuilder s = new StringBuilder(list.get(i));
                            s.append(a.charAt(i % a.length()));
                            list.set(i, s.toString());
                        }
                    }
                }
            }
        }

        return list;
    }

    private static String convertIntToChar(char c) {
        String chars;
        switch (c) {
            case '2': chars = "abc";
            break;
            case '3': chars = "def";
            break;
            case '4': chars = "ghi";
            break;
            case '5': chars = "jkl";
            break;
            case '6': chars = "mno";
            break;
            case '7': chars = "pqrs";
            break;
            case '8': chars = "tuv";
            break;
            case '9': chars = "wxyz";
            break;
            default: chars = "";
            break;
        }
        return chars;
    }
}


// well, it turns out calling a switch statement is quite a bit faster than making a string array,
// and a little bit less memory.
// even though the switch statement doesn't look as nice, it performs better in both space and time complexity.
/*
class Solution {
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        String[] map = new String[] {"", "", "abc", "def", 
        "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (digits.length() >= 1) {
            int nums = 1;
            for (int i = 0; i < digits.length(); i++)
                if (digits.charAt(i) == '7' || digits.charAt(i) == '9')
                    nums *= 4;
                else
                    nums *= 3;

            String a = map[digits.charAt(0) - '0'];
            for (int i = 0; i < nums; i++) {
                list.add(Character.toString(a.charAt(i % a.length())));
            }

            if (digits.length() >= 2) {
                Collections.sort(list);
                a = map[digits.charAt(1) - '0'];
                for (int i = 0; i < nums; i++) {
                    StringBuilder s = new StringBuilder(list.get(i));
                    s.append(a.charAt(i % a.length()));
                    list.set(i, s.toString());
                }

                if (digits.length() >= 3) {
                    Collections.sort(list);
                    a = map[digits.charAt(2) - '0'];
                    for (int i = 0; i < nums; i++) {
                        StringBuilder s = new StringBuilder(list.get(i));
                        s.append(a.charAt(i % a.length()));
                        list.set(i, s.toString());
                    }

                    if (digits.length() >= 4) {
                        Collections.sort(list);
                        a = map[digits.charAt(3) - '0'];
                        for (int i = 0; i < nums; i++) {
                            StringBuilder s = new StringBuilder(list.get(i));
                            s.append(a.charAt(i % a.length()));
                            list.set(i, s.toString());
                        }
                    }
                }
            }
        }

        return list;
    }
}

*/