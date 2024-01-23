import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {

    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> letterToNumMap = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            letterToNumMap.put(c, c - 'a' + 1);
        }
        return letterToNumMap;
    }

    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> squaresMap = new HashMap<>();
        nums.forEach(num -> squaresMap.put(num, num * num));
        return squaresMap;
    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        words.forEach(word -> wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1));
        return wordCountMap;
    }
}
