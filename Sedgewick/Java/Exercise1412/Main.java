// Author       :   Alex Kourkoumelis
// Date         :   4/14/2019
// Title        :   Exercise1412
// Description  :   Write a program that, given two sorted arrays of n int
//              :   values, prints all elements that appear in both arrays,
//              :   in sorted order. The running time of your program
//              :   should be proportional to n in the worst case.

public class Main {

    public static void main(String[] args) {

        // hi
        System.out.println("Hello World!");
        int[] a = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4};
        int[] b = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] c = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] d = {0, 1, 1, 1, 1, 1, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6};
        int[] e = {0, 2, 2, 3, 4, 4, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        int[] f = {0, 1, 2, 3};
        int[] g = {4, 5, 6, 7};

        System.out.println("\nShould print \"-1 0 1 2 3 4\" :");
        Solution.findIntersection(a, b);

        System.out.println("\nShould print \"4 5 6 7 8\" :");
        Solution.findIntersection(b, c);

        System.out.println("\nShould print \"4\" :");
        Solution.findIntersection(a, c);

        System.out.println("\nShould print \"0 3 4 6\"");
        Solution.findIntersection(d, e);

        System.out.println("\nShould print \"empty\"");
        Solution.findIntersection(f, g);

    }
}