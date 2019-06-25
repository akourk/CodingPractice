//  You live in the city of Cartesia where all roads are laid out
//  in a perfect grid. You arrived ten minutes too early to an
//  appointment, so you decided to take the opportunity to go for
//  a short walk. The city provides its citizens with a Walk Generating
//  App on their phones -- everytime you press the button it sends you
//  an array of one-letter strings representing directions to walk
//  (eg. ['n', 's', 'w', 'e']). You always walk only a single block in
//  a direction and you know it takes you one minute to traverse one
//  city block, so create a function that will return true if the walk
//  the app gives you will take you exactly ten minutes (you don't want
//  to be early or late!) and will, of course, return you to your starting
//  point. Return false otherwise.
//  Note: you will alwaays receive a valid array containing a random
//  assortment of direction letters. It will never be empty.

public class Solution {

    public static boolean TenMinWalk(char[] walk) {

        if (walk.length != 10) {
            return false;
        }

        int ns = 0;
        int ew = 0;

        for(int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n':   ns++;
                break;
                case 's':   ns--;
                break;
                case 'e':   ew++;
                break;
                case 'w':   ew--;
                break;
                default: break;
            }
        }

        return (ns == 0 && ew == 0);
    }
}