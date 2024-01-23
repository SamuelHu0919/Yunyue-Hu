import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    public static int sum(List<Integer> L) {
        int Sum = 0;

        for (int num : L) {
            Sum += num;
        }
        return Sum;
    }

    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evenList = new ArrayList<>();
        for (int num : L) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> commonList = new ArrayList<>();
        for (int num : L1) {
            if (L2.contains(num)) {
                commonList.add(num);
            }
        }
        return commonList;
    }

    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (String word : words) {
            for (char character : word.toCharArray()) {
                if (character == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
