import java.util.stream.IntStream;

public class CountingDuplicates {
    public static int countDuplicates(String text) {
        int[] array = new int[255];
        for (char a : text.toCharArray())
            array[a & 0b11011111]++;
        return IntStream.of(array).map(a -> a > 1 ? 1 : 0).sum();
    }
}

/*

// This is another way to do it

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int ans = 0;
        text = text.toLowerCase();
        while (text.length() > 0) {
            String firstLetter = text.substring(0,1);
            text = text.substring(1);
            if (text.contains(firstLetter)) ans++;
            text = text.replace(firstLetter, "");
        }
        return ans;
    }
}

// Another way to do it is with a map:

import java.util.Map;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class CountingDuplicates {
    private static Map<Character, Long> charFrequenciesMap(final String text) {
        return text.codePoints()
            .map(Character::toLowerCase)
            .mapToObj(c -> (char) c)
            .collect(groupingBy(identity(), counting()));
    }

    static int duplicateCount(final String text) {
        return (int) charFrequenciesMap(text).values().stream()
            .filter(i -> i > 1)
            .count();
    }
}

*/