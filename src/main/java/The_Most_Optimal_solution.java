import java.util.HashMap;
import java.util.Map;

public class The_Most_Optimal_solution {
    private static int arrayOfNumbers[] = {2, 10, 15, 26, 7, 3, 45, 7, 14, 12, 13, 9, 5, 8};

    public static void main(String[] args) {
        findPairsOfNumbers(21);
    }

    public static void findPairsOfNumbers(int sum) {
        Map<Integer, Integer> pairs = new HashMap<>();  //O(n)
        for (int arrayOfNumber : arrayOfNumbers) {
            if (pairs.containsKey(sum - arrayOfNumber))
                System.out.println("(" + arrayOfNumber + "," + (sum - arrayOfNumber) + ")");
            else
                pairs.put(arrayOfNumber, 0);
        }
    }
}
