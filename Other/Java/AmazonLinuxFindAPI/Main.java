import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


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

        System.out.println(mins.size());
        
        return mins.get(mins.size() - 1);
    }
}

// class Main {
//     public static void main(String[] args) {
//         ArrayList<String> ws1 = new ArrayList<String>(Arrays.asList("listen", "silent", "it", "is"));
//         ArrayList<String> s1 = new ArrayList<String>(Arrays.asList("listen it is silent"));

//         System.out.println("4:" + Solution.countSentences(ws1, s1));

//         ArrayList<String> wl2 = new ArrayList<String>(Arrays.asList("listen", "silent", "it", "is"));


//     }
// }
// /*
// 1. How Many Sentences?
// given an array of words and an array of sentences, 
// determine which words are anagrams of each other.
// Calculate how many sentences can be created by
// replacing any word with one of its anagrams.

// ex.
// wordSet = ['listen', 'silent', 'it', 'is']
// sentences = "listen it is silent"

// listen it is silent
// listen it is listen
// silent it is silent
// silent it is listen

// output: 4

// ex2.
// wordSet = ["the", "bats", "tabs", "in", "cat", "act"]
// sentences = ["cat the bats", "in the act", "act in tabs"]

// sentence 1:
// cat the bats
// act the bats
// cat the tabs
// act the tabs

// sentence 2:
// in the act
// in the cat

// sentence 3:
// act tabs in
// cat tabs in
// act bats in
// cat bats in

// output: 4, 2, 4


// */
// class Solution {
//     public static List<Long> countSentences(List<String> wordSet, List<String> sentences) {
//         ArrayList<Long> res = new ArrayList<>();
//         HashMap<String, Integer> sortedWords = new HashMap<>();

//         for (String word : wordSet) {
//             String sortedWord = sortWord(word);
//             if (sortedWords.containsKey(sortedWord)) {
//                 int frequency = sortedWords.get(sortedWord);
//                 sortedWords.put(sortedWord, frequency + 1);
//             } else {
//                 sortedWords.put(sortedWord, 1);
//             }
//         }

//         for (String sentence : sentences) {
//             String[] splitSentence = sentence.split(" ");
//             ArrayList<String> splitAL = new ArrayList<>();
//             for (int i = 0; i < splitSentence.length; i++) {
//                 splitAL.add(sortWord(splitSentence[i]));
//             }
//             Long sum = 1L;
//             for (String word : splitAL) {
//                 sum *= sortedWords.get(word);
//             }
//             res.add(sum);
//         }

//         return res;
//     }
//     private static String sortWord(String word) {
//         char charArray[] = word.toCharArray();
//         Arrays.sort(charArray);
//         String sortedWord = new String(charArray);

//         return sortedWord;
//     }
// }