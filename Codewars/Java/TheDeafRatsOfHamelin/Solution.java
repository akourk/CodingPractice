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

public class Solution {

    public static int countDeafRats(String town) {

        int count = 0;

        town = town.replace(" ", "");
        town = town.replace("O", "0");
        for(int i = 0; i < town.length(); i += 2) {
            if (town.charAt(i) == '0') {
                count++;
            }
        }

        return count;
        
    }
}
