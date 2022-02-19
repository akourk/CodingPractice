class Main {
    public static void main(String[] args) {
        char[][] g1 = {{'1', '1', '1', '1', '0'},
                    {'1', '1', '0', '1', '0'},
                    {'1', '1', '0', '0', '0'},
                    {'0', '0', '0', '0', '0'}};

        System.out.println("1:" + Solution.numIslands(g1));
    }
}

class Solution {
    public static int numIslands(char[][] grid) {
        int numOfIslands = 0;
        final int m = grid.length;
        final int n = grid[0].length;
        boolean[][] seen = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    numOfIslands++;
                    dfs(grid, m, n, i, j);
                }
            }
        }

        return numOfIslands;
    }

    private static void dfs(char[][] grid, int m, int n, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n)
            return;
        if (grid[i][j] != '1')
            return;
        
        grid[i][j] = 'X';

        dfs(grid, m, n, i + 1, j);
        dfs(grid, m, n, i - 1, j);
        dfs(grid, m, n, i, j + 1);
        dfs(grid, m, n, i, j - 1);
    }
}