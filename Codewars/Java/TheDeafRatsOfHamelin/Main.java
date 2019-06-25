//  The Deaf Rats of Hamelin
//  Story
//  The Pied Piper has been enlisted to play his magical
//  tune and coax all the rats out of town.
//  But some of the rats are deaf and going the wrong way!
//  Kata Task
//  How many deaf rats are there?
//  Legend:
//  P = Pied Piper
//  0~ or O~ = Rat going left
//  ~0 or ~O = Rat going right

public class Main {

    public static void main(String[] args) {

        System.out.println("\nExample 1:");
        System.out.println(Solution.countDeafRats("~0~0~0~0 P"));
        System.out.println("\nExample 2:");
        System.out.println(Solution.countDeafRats("P O~ O~ ~O O~"));
        System.out.println("\nExample 3:");
        System.out.println(Solution.countDeafRats("~0~0~0~0P~0~00~"));
    }
}
