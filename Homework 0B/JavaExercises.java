import java.util.*;

public class JavaExercises {
    public static int[] makeDice() {
        int[] dice = { 1, 2, 3, 4, 5, 6 };
        return dice;
    }

    public static String[] takeOrder(String customer) {
        if (customer == "Ergun") {
            String[] arr = { "beyti", "pizza", "hamburger", "tea" };
            return arr;
        } else if (customer == "Erik") {
            String[] arr = { "sushi", "pasta", "avocado", "coffee" };
            return arr;
        } else {
            String[] arr = new String[3];
            return arr;
        }
    }

    public static int findMinMax(int[] array) {
        int min = 10000, max = -10000;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int difference = max - min;
        return difference;
    }

    public static List<Integer> hailstone(int n) {
        List<Integer> sequence = new ArrayList<>();
        hailstoneHelper(n, sequence);
        return sequence;
    }

    private static void hailstoneHelper(int n, List<Integer> sequence) {
        if (n == 1) {
            sequence.add(1);
        } else {
            sequence.add(n);
            if (n % 2 == 0) {
                hailstoneHelper(n / 2, sequence);
            } else {
                hailstoneHelper(3 * n + 1, sequence);
            }
        }
    }

}
