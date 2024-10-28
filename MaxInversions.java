public class MaxInversions {

    public static void main(String[] args) {
        int N = 2;
        int[] arr = {1, 2};
        System.out.println(maxInversionsAfterReplacement(N, arr));  // Output: 1
    }

   

    public static int maxInversionsAfterReplacement(int N, int[] arr) {
        
        int inversions = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    inversions++;
                }
            }
        }
        int initialInversions = inversions;
        int maxInversions = initialInversions;

        for (int i = 0; i < N; i++) {
            int originalValue = arr[i];
            for (int replacement = 1; replacement <= 3; replacement++) {
                if (originalValue != replacement) {
                    arr[i] = replacement;
                    int newInversions = inversions;
                    maxInversions = Math.max(maxInversions, newInversions);
                    arr[i] = originalValue;  // revert back to original
                }
            }
        }

        return maxInversions;
    }
}
