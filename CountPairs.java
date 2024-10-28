import java.util.*;

public class CountPairsModuloK {

    public static void main(String[] args) {
        int N = 5;
        int k = 3;
        int[] arr = {1, 2, 3, 2, 1};
        int result = countPairs(N, k, arr);
        System.out.println("Output: " + result); // Output: 2
    }

    public static int countPairs(int N, int k, int[] arr) {
        long MOD = 1000000007;
        int[] countMod = new int[k];
        long pairsCount = 0;

        // Count occurrences of remainders when index % k
        for (int i = 0; i < N; i++) {
            int remainder = arr[i] % k;
            if (remainder < 0) {
                remainder += k; // Adjust negative remainders
            }
            // Increment the count for current remainder
            countMod[remainder]++;
        }

        // Calculate pairs using countMod array
        for (int i = 0; i < k; i++) {
            // If there are at least two elements with remainder i
            if (countMod[i] > 1) {
                // Calculate number of pairs possible with these elements
                pairsCount = (pairsCount + (long) countMod[i] * (countMod[i] - 1) / 2) % MOD;
            }
        }

        return (int) pairsCount;
    }
}
