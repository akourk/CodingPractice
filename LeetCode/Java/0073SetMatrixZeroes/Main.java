import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        int[][] m1 = {{0, 1, 2, 0}, 
                    {3, 4, 5, 2}, 
                    {1, 3, 1, 5}};
        Solution.setZeroes(m1);
        for(int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }



    }
}

class Solution {
    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> columns = new HashSet<>();

        for(int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }

        for (int x : columns)
                System.out.println(x);

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (rows.contains(i) || columns.contains(j))
                    matrix[i][j] = 0;
    }
}