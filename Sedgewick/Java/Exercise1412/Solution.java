// Author       :   Alex Kourkoumelis
// Date         :   4/14/2019
// Title        :   Exercise1412
// Description  :   Write a program that, given two sorted arrays of n int
//              :   values, prints all elements that appear in both arrays,
//              :   in sorted order. The running time of your program
//              :   should be proportional to n in the worst case.


// An int is initialized to 0 to keep track of the index of each array and
// iterated through. If the element at a[index] is less than the element
// at b[index] then we iterate the index of a because we know that the
// element at a[index] won't be a duplicate in b. The same goes for
// for the opposite case, we increment b's index if the element at
// b[index] is smaller than the corresponding element in a.

class Solution {
    public static void findIntersection(int[] a, int[] b) {

        // initializing both indexes to 0
        int aIndex = 0;
        int bIndex = 0;
        boolean found = false;

        // to make sure we don't iterate past the end of either array
        while(aIndex < a.length && bIndex < b.length) {

            // case 1: element in a is less than the element in b
            if(a[aIndex] < b[bIndex]) {
                aIndex++;

                // case 2: element in b is less than the element in a
            } else if (a[aIndex] > b[bIndex]) {
                bIndex++;

                // case 3: both elements are equal
            } else {

                found = true;
                int temp=a[aIndex];
                System.out.print(a[aIndex] + " ");

                // consume all similar elements in a
                while(aIndex < a.length && temp==a[aIndex]){
                    aIndex++;
                }

                bIndex++;
            }
        }

        // if no matches are found
        if(!found) {
            System.out.println("empty");
        }
    }
}