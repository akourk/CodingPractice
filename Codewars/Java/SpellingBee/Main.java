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


public class Main {

    public static void main(String[] args) {

        final char hive[][] = new char[][] {
                "bee.bee".toCharArray(),
                ".e..e..".toCharArray(),
                ".b..eeb".toCharArray()
        };
        final char hive2[][] = new char[][] {
                "bee.bee".toCharArray(),
                "e.e.e.e".toCharArray(),
                "eeb.eeb".toCharArray()
        };
        final char hive3[][] = new char[0][0];
        final char hive4[][] = new char[][] {
                "bee.bee".toCharArray()
        };
        final char hive5[][] = null;
        System.out.println("Should return 5: ");
        System.out.println(Solution.howManyBees(hive));

        System.out.println("Should return 8: ");
        System.out.println(Solution.howManyBees(hive2));

        System.out.println("Should return 0: ");
        System.out.println(Solution.howManyBees(hive3));

        System.out.println("Should return 2: ");
        System.out.println(Solution.howManyBees(hive4));

        System.out.println("Should return null: ");
        System.out.println(Solution.howManyBees(hive5));

    }
}
