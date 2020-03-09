// Twitter is testing a new job processing service called Pigeon
// Pigeon processes any task in double the actual duration of the task and every task has a weight.
// Also, Pigeon can serve only for a limited duration(maximum runtime) in an hour.

// Given the maximum runtime of the Pigeon service, the list of tasks with their lengths and weights,
// determine the maximum total weight that the Pigeon service can achieve in an hour.

// For example, the task duration, tasks=[2,2,3,4] and their weights, weights = [2,4,4,5].
// If maximum runtime(p) is 15, which tasks must be processed? Pigeon will process each task
// in double the actual length to gain the weight. Associating 2*tasks[i] with weights[i], we
// can create the array associated = [[4,2],[4,4],[6,4],[8,5]]. The maximum combined length of
// tasks processed in twice the duration lengths is 14 and there are two ways to get there:
// process tasks[0], tasks[1] and tasks[2] for a total weight of 2 + 4 + 4 = 10 or process
// tasks[2] and tasks[3] for a total weight of 4 + 5 = 9. Our maximum total weight is 10.

// Function Description
// Complete the function maximumTotalWeight in the editor below. The function must return the
// integer value representing the maximum total weight you can get in one hour.

// maximumTotalWeight has the following parameter(s):
//      weights[weights[0],...weights[n-1]]: an array of integers
//      tasks[tasks[0],...tasks[n-1]]: an array of integers
//      p: an integer

// Constraints
//  1 <= n <= 10^3
//  1 <= weights[i] <= 10^6, where 0 <= i < n.
//  1 <= tasks[i] <= 100, where 0 <= i <= n.
//  1 <= p <= 10^3

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> weights1 = new ArrayList<Integer>();
        List<Integer> tasks1 = new ArrayList<Integer>();
        weights1.add(3);
        weights1.add(2);
        weights1.add(2);
        tasks1.add(3);
        tasks1.add(2);
        tasks1.add(2);
        int p1 = 9;

        List<Integer> weights2 = new ArrayList<Integer>();
        List<Integer> tasks2 = new ArrayList<Integer>();
        weights2.add(1);
        weights2.add(4);
        weights2.add(6);
        weights2.add(3);
        tasks2.add(1);
        tasks2.add(2);
        tasks2.add(2);
        tasks2.add(3);
        int p2 = 8;

        List<Integer> weights3 = new ArrayList<Integer>();
        List<Integer> tasks3 = new ArrayList<Integer>();
        weights3.add(1);
        weights3.add(4);
        weights3.add(2);
        weights3.add(5);
        weights3.add(3);
        tasks3.add(2);
        tasks3.add(6);
        tasks3.add(4);
        tasks3.add(7);
        tasks3.add(1);
        int p3 = 13;

        System.out.println("4: " + Result.maximumTotalWeight(weights1, tasks1, p1));
        System.out.println("10: " + Result.maximumTotalWeight(weights2, tasks2, p2));
        System.out.println("5: " + Result.maximumTotalWeight(weights3, tasks3, p3));
    }
}
