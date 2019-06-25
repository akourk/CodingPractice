// Author       :   Alex Kourkoumelis
// Date         :   4/18/2019
// Title        :   Exercise1418
// Description  :   Write a program that, given an array a[] of n distinct integers,
//              :   finds a strict local minimum: an entry a[i] that is strictly less
//              :   than its neighbors. Each internal entry (other than a[0] and a[n-1])
//              :   has 2 neighbors. Your program should use ~2(lgn) compares in the
//              :   worst case (Exercise 1.4.18). Provide tests for all possible cases.

public class Main {

    public static void main(String[] args) {

        // hi
        System.out.println("Hello World!");
        int[] a = {5, -4, 10, 16, 11, 20, 24};
        int[] b = {-8, -6, 18, 8, 20, 4, 40};
        int[] c = {-8, -6, 18, 8, 20, 4, 40, 41};
        int[] d = {};
        int[] e = {5};
        int[] f = {5, 6};
        int[] threeOne = {4, 5, 6};
        int[] threeTwo = {7, 5, 6};
        int[] threeThree = {7, 6, 5};
        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] descending = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] test = {19, 11, 5, 4, 3, 1, 2, 4, 6, 8, 10};
        int[] descendingFour = {8, 7, 6, 5};
        int[] ascendingFour = {5, 6, 7, 8};

        System.out.println("\nShould print \"-4 or 11\" :");
        System.out.println(Solution.localMin(a));

        System.out.println("\nShould print \"-8, 4, or 8\" :");
        System.out.println(Solution.localMin(b));

        System.out.println("\nShould print \"-8, 4, or 8\" :");
        System.out.println(Solution.localMin(c));

        System.out.println("\nShould print \"0\" :");
        System.out.println(Solution.localMin(d));

        System.out.println("\nShould print \"5\" :");
        System.out.println(Solution.localMin(e));

        System.out.println("\nShould print \"5\" :");
        System.out.println(Solution.localMin(f));

        System.out.println("\nShould print \"4\" :");
        System.out.println(Solution.localMin(threeOne));

        System.out.println("\nShould print \"5\" :");
        System.out.println(Solution.localMin(threeTwo));

        System.out.println("\nShould print \"5\" :");
        System.out.println(Solution.localMin(threeThree));

        System.out.println("\nShould print \"1\" :");
        System.out.println(Solution.localMin(ascending));

        System.out.println("\nShould print \"1\" :");
        System.out.println(Solution.localMin(descending));

        System.out.println("\nShould print \"1\" :");
        System.out.println(Solution.localMin(test));

        System.out.println("\nShould print \"5\" :");
        System.out.println(Solution.localMin(descendingFour));

        System.out.println("\nShould print \"5\" :");
        System.out.println(Solution.localMin(ascendingFour));

    }
}