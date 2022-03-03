import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given nums and segment x, find for each segment of size x the minimum number and find the
maximum of all these segments.
eg: [8, 2, 4, 6], x=2
segments: [8, 2], [2, 4], [4, 6]
min of each: [2, 2, 4]
max of those: 4
output: 4

this solved most of the cases:
didn't have time to test more
*/

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> space1 = new ArrayList<Integer>(Arrays.asList(8, 2, 4, 6));
        System.out.println("2:" + Solution.segment(2, space1));

        ArrayList<Integer> space2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 1, 2));
        System.out.println("3:" + Solution.segment(1, space2));

    }
}

class Solution {
    public static int segment(int x, List<Integer> space) {
        ArrayList<Integer> mins = new ArrayList<>();

        for (int i = 0; i < space.size() - x; i++) {
            ArrayList<Integer> window = new ArrayList<>();
            for (int j = i; j < i + x; j++) {
                window.add(space.get(j));
            }
            Collections.sort(window);
            mins.add(window.get(0));
        }

        Collections.sort(mins);

        if (mins.size() == 0) {
            Collections.sort(space);
            return space.get(space.size() - 1);
        }

        return mins.get(mins.size() - 1);
    }
}