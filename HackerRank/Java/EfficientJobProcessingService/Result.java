import java.util.List;

public class Result {
    public static int maximumTotalWeight(List<Integer> weights, List<Integer> tasks, int p) {
        int[][] arr = new int[tasks.size() + 1][p / 2 + 1];

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (j < tasks.get(i - 1))
                    arr[i][j] = arr[i - 1][j];
                else
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - tasks.get(i - 1)] + weights.get(i - 1));
            }
        }
        return arr[tasks.size()][p / 2];
    }
}
