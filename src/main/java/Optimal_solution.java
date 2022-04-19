import java.util.Arrays;

public class Optimal_solution {
    private static int array[] = {-2, -1, 0, 3, 5, 6, 7, 9, 13, 14};

    public static void main(String[] args) {
        int sum = 10;
        findPairsOfNumbers(sum);
    }

    static void findPairsOfNumbers(int sum) {
        Arrays.sort(array);                 // O(n log n)
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int s = array[first] + array[last];
            if (s == sum) {
                System.out.println(array[first] + " and " + array[last]);
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
    }
}
