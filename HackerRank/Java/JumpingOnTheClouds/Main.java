// Emma is playing a new mobile game that starts with consecutively
// numbered clouds. Some of the clouds are thunderheads and others
// are cumulus. She can jump on any cumulus cloud having a number
// that is equal to the number of the current cloud plus 1 or 2. She
// must avoid the thunderheads. Determine the minimum number of
// jumps it will take Emma to jump from her starting position to the
// last cloud. It is always possible to win the game.
// For each game, Emma will get an array of clouds numbered 0 if they
// are safe or 1 if they must be avoided. For example, c = [0,1,0,0,0,1,0
// indexed from 0...6.
// The number on each cloud is its index in the list so she must avoid
// the clouds at indexes 1 and 5. She could follow the following two paths:
// 0 > 2 > 4 > 6 or 0 > 2 > 3 > 4 > 6.
// The first path takes 3 jumps while the second takes 4.

// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        int[] num1 = { 0, 0, 0, 0, 1, 0 };
        int[] num2 = { 0, 0, 1, 1, 0, 0, 1, 0 };
        int[] num3 = { 1, 0, 1, 1, 0, 0, 1, 0 };
        int[] c1 = {0,0,0,0,1,0}; // 3
        int[] c2 = {0,1,0,1,0,1}; // 2
        int[] c3 = {0,0,0,1,0,0,0}; // 3
        int[] c4 = {0,0,1,0,0,1,0}; // 4
        int[] c5 = {0,0,0,1,0,0}; // 3
        int[] c6 = {1,0,1,1,0,0,1,0}; // 4
        int[] c7 = {0, 0, 0, 0, 0};
        int[] c8 = {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0,};


        System.out.println(Solution.jumpClouds(num1));
        System.out.println(Solution.jumpClouds(num2));
        System.out.println(Solution.jumpClouds(num3));
        System.out.println(Solution.jumpClouds(c1));
        System.out.println(Solution.jumpClouds(c2));
        System.out.println(Solution.jumpClouds(c3));
        System.out.println(Solution.jumpClouds(c4));
        System.out.println(Solution.jumpClouds(c5));
        System.out.println(Solution.jumpClouds(c6));
        System.out.println(Solution.jumpClouds(c7));
        System.out.println(Solution.jumpClouds(c8));

    }
}
class Solution {
    public static int jumpClouds(int[] c) {
        int count = 0;

        for(int i = 0; i < c.length; i++) {
            if(i < c.length - 2 && c[i+1] == 0 && c[i+2] == 0 && c[i] != 1) {
                i++;
                count++;
            } else if (i < c.length -1 && c[i+1] == 0) {
                count++;
            }
        }

        return count;

    }
}