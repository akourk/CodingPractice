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


public class Main {

    public static void main(String[] args) {

        System.out.println("\nValid:");
        System.out.println(Solution.TenMinWalk(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        System.out.println("\nInvalid:");
        System.out.println(Solution.TenMinWalk(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        System.out.println(Solution.TenMinWalk(new char[] {'w'}));
        System.out.println(Solution.TenMinWalk(new char[] {'n','n','n','s','n','s','n','s','n','s'}));

    }
}
