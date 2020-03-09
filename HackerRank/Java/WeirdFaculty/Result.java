import java.util.List;
public class Result {
    public static int exam(List<Integer> v) {

        for (int i = 0; i < v.size(); i++) {
            System.out.println("me: " + myResults(v, i) + " friend: " + friendResults(v, i));
            if (myResults(v, i) > friendResults(v, i))
                return(i);
        }

        return(v.size());
    }

    public static int myResults(List<Integer> v, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            if (v.get(i) == 1)
                result++;
            else result--;
        }
        return result;
    }

    public static int friendResults(List<Integer> v, int k) {
        int result = 0;
        for (int i = k; i < v.size(); i++) {
            if (v.get(i) == 1)
                result++;
            else result--;
        }
        return result;
    }
}
