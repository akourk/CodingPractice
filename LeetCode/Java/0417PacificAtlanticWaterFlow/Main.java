import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        int[][] h1 = {{1, 2, 2, 3, 5},
                        {3, 2, 3, 4, 4},
                        {2, 4, 5, 3, 1},
                        {6, 7, 1, 4, 5},
                        {6, 1, 1, 2, 4}};
        System.out.println(Solution.pacificAtlantic(h1));
    }
}

class Solution {
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        final int m = heights.length;
        final int n = heights[0].length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[][] seenPac = new boolean[m][n];
        boolean[][] seenAtl = new boolean[m][n];

        for (int i = 0; i < m; ++i) {
            dfs(heights, i, 0, 0, seenPac);
            dfs(heights, i, n - 1, 0, seenAtl);
        }

        for (int i = 0; i < n; ++i) {
            dfs(heights, 0, i, 0, seenPac);
            dfs(heights, m - 1, i, 0, seenAtl);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (seenAtl[i][j] && seenPac[i][j])
                    res.add(new ArrayList<>(Arrays.asList(i, j)));
            }
        }

        return res;
    }

    private static void dfs(final int[][] heights, int i, int j, int h, boolean[][] seen) {
        if (i < 0 || i == heights.length || j < 0 || j == heights[0].length)
            return;
        if (seen[i][j] || heights[i][j] < h)
            return;

        seen[i][j] = true;
        dfs(heights, i + 1, j, heights[i][j], seen);
        dfs(heights, i - 1, j, heights[i][j], seen);
        dfs(heights, i, j + 1, heights[i][j], seen);
        dfs(heights, i, j - 1, heights[i][j], seen);

    }
}