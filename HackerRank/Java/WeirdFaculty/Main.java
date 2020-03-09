// This semester you are taking a course taught by a faculty member who has a weird way of grading tests.
// In a test, n questions will be asked, and the correctness of the answers is already determined.
// For the ith question, the verdict will be v[i](where 0 <= i < n). If v[i] = 1, the answer is correct
// but if v[i] = 0, the answer is wrong.

// When a test is given, you have to answer the first k questions (indices 0 to k-1) where 0 <= k < n, and
// your friend has to answer the remaining quesstions (indices k to n-1) on the test. At the end, results
// are calculated as follows:

// Your results:
// int Your_result = 0;
// for (int i = 0; i < k; i++) {
//      if (v[i] == 1)
//          Your_result++;
//      else Your_result--;
// }

// Your friend's results:
// int YourFriend_result = 0;
// for (int i = k; i < n; i++) {
//      if (v[i] == 1)
//          YourFriend_result++;
//      else YourFriend_result--;
// }

// Choose the minimum k such that Your_result > YourFriend_result.

// Function Description
// Complete the function exam in the editor below. The function must return an integer that denotes the
// minimum number of questions you must answer to have Your_result > YourFriend_result.

// exam has the following parameter(s):
//  v[v[0],...v[n-1]]: an array of integers

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0);
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l1.add(0);

        System.out.println(Result.exam(l1));
    }
}
