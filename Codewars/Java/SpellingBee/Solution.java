// How many bees are in the beehive?
// - bees can be facing UP, DOWN, LEFT, or RIGHT
// - bees can share parts of other bees
// ex:
// bee.bee
// .e..e..
// .b..eeb
// answer: 5
// notes:
// - the hive may be empty or null/None/nil/...
// - Python: the hive is passed as a list of lists (not a list of strings)

public class Solution {

    public static int howManyBees(final char[][] hive) {

        int count = 0;
        String bees = "";
        String bees2 = "";


        if (hive == null || hive.length < 1) {
            return 0;
        }
        int height = hive.length;
        int width = hive[0].length;


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                bees += hive[i][j];
            }
            bees += " ";
        }


        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                bees2 += hive[j][i];
            }
            bees2 += " ";
        }


        String beecopy = bees;

        while(beecopy.contains("bee")) {
            beecopy = beecopy.replaceFirst("bee", ".");
            count++;
        }
        while(bees.contains("eeb")) {
            bees = bees.replaceFirst("eeb", ".");
            count++;
        }

        beecopy = bees2;

        while(beecopy.contains("bee")) {
            beecopy = beecopy.replaceFirst("bee", ".");
            count++;
        }
        while(bees2.contains("eeb")) {
            bees2 = bees2.replaceFirst("eeb", ".");
            count++;
        }

        return count;
    }
}