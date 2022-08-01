import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        List<String> list = Solution.generateParenthesis(4);
        List<String> listAnswer = new ArrayList<>();
        listAnswer.add("(((())))");
        listAnswer.add("((()()))");
        listAnswer.add("((())())");
        listAnswer.add("((()))()");
        listAnswer.add("(()(()))");
        listAnswer.add("(()()())");
        listAnswer.add("(()())()");
        listAnswer.add("(())(())");
        listAnswer.add("(())()()");
        listAnswer.add("()((()))");
        listAnswer.add("()(()())");
        listAnswer.add("()(())()");
        listAnswer.add("()()(())");
        listAnswer.add("()()()()");

        for (String s : list) {
            if (listAnswer.contains(s)) {
                listAnswer.remove(s);
            }
        }
        System.out.println("missing:" + listAnswer);


        List<String> list2 = Solution.generateParenthesis(5);
        List<String> listAnswer2 = new ArrayList<>();
        String[] n5 = {"((((()))))","(((()())))","(((())()))","(((()))())","(((())))()","((()(())))","((()()()))","((()())())","((()()))()","((())(()))","((())()())","((())())()","((()))(())","((()))()()","(()((())))","(()(()()))","(()(())())","(()(()))()","(()()(()))","(()()()())","(()()())()","(()())(())","(()())()()","(())((()))","(())(()())","(())(())()","(())()(())","(())()()()","()(((())))","()((()()))","()((())())","()((()))()","()(()(()))","()(()()())","()(()())()","()(())(())","()(())()()","()()((()))","()()(()())","()()(())()","()()()(())","()()()()()"};

        for (String s : n5) {
            listAnswer2.add(s);
        }

        for (String s : list2) {
            if (listAnswer2.contains(s)) {
                listAnswer2.remove(s);
            }
        }
        System.out.println("missing:" + listAnswer2);
    }
}

class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        MyHashMap<String, Integer> mhm = new MyHashMap<>();

        mhm.put("()", 1);

        // loop to n, building mhm
        for (int i = 2; i <= n; i++) {
            // adding ( + n-1 + )
            for (String s : mhm.getKeys(i - 1)) {

                StringBuilder sb = new StringBuilder(s);

                sb.insert(0, "(");
                sb.append(')');

                if (!mhm.containsKey(sb.toString()))
                    mhm.put(sb.toString(), sb.length() / 2);                
            }
            // try all combinations of getkeys(1-i)... (1 + 1) (1 + 2) (2 + 1)
            for (int j = 1; j < i; j++) {
                // iterate through j
                for (String s : mhm.getKeys(j)) {
                    // append i - j
                    for (String t : mhm.getKeys(i - j)) {
                        StringBuilder sb = new StringBuilder(s);
                        sb.append(t);
                        if (!mhm.containsKey(sb.toString()))
                            mhm.put(sb.toString(), sb.length() / 2);           
                    }
                }
            }
        }

        list.addAll(mhm.getKeys(n));

        return list;
    }
}


class MyHashMap<K, V> extends HashMap<K, V> {
    Map<V, Set<K>> reverseMap = new HashMap<>();
 
    @Override
    public V put(K key, V value) {
        if (reverseMap.get(value) == null)
            reverseMap.put(value, new HashSet<K>());
 
        reverseMap.get(value).add(key);
        return super.put(key, value);
    }
 
    public Set<K> getKeys(V value) {
        return reverseMap.get(value);
    }
}


// it's much more efficient to use recursive backtracking:
/*

class Solution {
    
    char[] charArray;
    List<String> result;
    
    public List<String> generateParenthesis(int n) {
        this.result = new ArrayList<>();
        this.charArray = new char[2*n];
        backtrack(0, 0, 0, n);
        return result;
    }
    
     void backtrack(int open, int closed, int index, int n) {
        if (open == closed && index == 2 * n) {
            result.add(new String(charArray));
        }
        
        if (open < n) {
            charArray[index] = '(';
            backtrack(open + 1, closed, index + 1, n);
        }
        
        if (closed < open) {
            charArray[index] = ')';
            backtrack(open, closed + 1, index + 1, n);
        }
    }
}
 */