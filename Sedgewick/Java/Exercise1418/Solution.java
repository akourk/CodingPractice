// Author       :   Alex Kourkoumelis
// Date         :   4/18/2019
// Title        :   Exercise1418
// Description  :   Write a program that, given an array a[] of n distinct integers,
//              :   finds a strict local minimum: an entry a[i] that is strictly less
//              :   than its neighbors. Each internal entry (other than a[0] and a[n-1])
//              :   has 2 neighbors. Your program should use ~2(lgn) compares in the
//              :   worst case (Exercise 1.4.18). Provide tests for all possible cases.


class Solution {

    public static int localMin(int[] a) {

        // handles all edge cases:
        // empty array, array of 1 element, array of 2 elements
        // also handles both edges being local min for shortcuts
        if (a.length == 0) {
            return 0;
        } else if (a.length == 1 || a[0] < a[1]) {
            return a[0];
        } else if (a.length == 2 || a[a.length - 1] < a[a.length - 2]) {
            return a[a.length - 1];
        } else {
            return divider(a, 0, a.length - 1);
        }
    }

    // checks the middle element, then checks the left and right elements.
    // recursively divides the array in half depending on which side of the
    // middle element is lower.
    private static int divider(int[] a, int low, int high) {
        if (low != high) {
            int mid = (high - low) / 2;
            if (a[mid] < a[mid - 1] && a[mid] < a[mid + 1]) {
                return a[mid];
            } else if (a[mid - 1] < a[mid]) {
                return divider(a, low, mid);
            } else {
                return divider(a, mid + 1, high);
            }
        } else {
            return a[low];
        }
    }
}