import java.util.*;

public class Result {
    public static String solve(int k, List<Integer> numbers) {
        // Write your code here
        if (numbers.size() < 1 || numbers.size() % k != 0 || k < 1)
            return ("No");

        int dup, temp;
        int size = numbers.size();

        for (int i = 0; i < numbers.size(); i++) {
            temp = numbers.get(0);
            dup = 0;
            while (numbers.contains(temp)) {
                numbers.remove((Integer) temp);
                dup++;
                if (dup > size / k)
                    return ("No");
            }
        }
        return ("Yes");
    }
}

//public class Result {
//    public static String solve(int k, List<Integer> numbers) {
//        // Write your code here
//        if (numbers.size() < 1 || numbers.size() % k != 0 || k < 1)
//            return ("No");
//
//        int dup;
//        int temp;
//        int removed = 0;
//        boolean flag = true;
//
//        for(int i = 0; i < numbers.size() - removed; i++) {
//            dup = 0;
//            temp = numbers.get(0);
//            while (numbers.contains(temp)) {
//                numbers.remove((Integer) temp);
//                removed++;
//                dup++;
//            }
//            if (dup > k)
//                return ("No");
//        }
//        return ("Yes");
//    }
//}
//public class Result {
//    public static String solve(int k, List<Integer> numbers) {
//        // Write your code here
//        if (numbers.size() < 1 || numbers.size() % k != 0 || k < 1)
//            return ("No");
//
//        int max = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int num: numbers) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//            if (map.get(num) > max) {
//                max = map.get(num);
//            }
//        }
//        if (max <= (numbers.size() / k))
//            return ("Yes");
//        return ("No");
//    }
//}
