public class Main {

    public static void main(String[] args) {

        System.out.println(CountingDuplicates.countDuplicates("abcde"));
        System.out.println(CountingDuplicates.countDuplicates("aabbcde"));
        System.out.println(CountingDuplicates.countDuplicates("aabBcde"));
        System.out.println(CountingDuplicates.countDuplicates("indivisibility"));
        System.out.println(CountingDuplicates.countDuplicates("Indivisibilities"));
        System.out.println(CountingDuplicates.countDuplicates("aA11"));
        System.out.println(CountingDuplicates.countDuplicates("ABBA"));
    }
}

// Count the number of Duplicates
// Write a function that will return the count of distinct
// case-insensitive alphabetic characters and numeric
// digits that occur more than once in the input string. The
// input string can be assumed to contain only alphabets
// (both uppercase and lowercase) and numeric digits.