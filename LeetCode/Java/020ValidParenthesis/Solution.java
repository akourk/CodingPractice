public class Solution {
    public static boolean isValid(String s){
        String lastParen = " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                lastParen += s.charAt(i);
            } else {
                if (s.charAt(i) == ')')
                    if (lastParen.endsWith("("))
                        lastParen = lastParen.substring(0, lastParen.length() - 1);
                    else
                        return false;
                if (s.charAt(i) == ']')
                    if (lastParen.endsWith("["))
                        lastParen = lastParen.substring(0, lastParen.length() - 1);
                    else
                        return false;
                if (s.charAt(i) == '}')
                    if (lastParen.endsWith("{"))
                        lastParen = lastParen.substring(0, lastParen.length() - 1);
                    else
                        return false;
            }
        }
        return lastParen.equals(" ");
    }
}
// this is a more optimal solution utilizing a stack

//import java.util.Stack;
//public class Solution {
//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (Character ch: s.toCharArray()) {
//            if (ch == '(' || '[' || '{')
//                stack.push(ch);
//            else if (stack.empty()) {
//                return false;
//            } else {
//                char k = stack.pop();
//                if ((k == '(' && ch != ')') ||
//                        (k == '[' && ch != ']') ||
//                        (k == '{' && ch != '}')) {
//                    return false;
//                }
//            }
//        }
//        return stack.empty();
//    }
//}
