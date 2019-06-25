public class Solution {

    public static boolean validatePin(String pin) {

        for (char a : pin.toCharArray())
            if(a < '0' || a > '9')
                return false;
            return pin.length() == 6 || pin.length() == 4;
    }
}

/*
// another way would be regex:

import java.util.regex.*;

public class Solution {

    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
 */