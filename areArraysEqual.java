import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 2, 5, 4, 0};
        int[] B = {2, 4, 5, 0, 1};
        int N = 5;
        
        int result = areArraysEqual(A, B, N);
        System.out.println(result);
    }
    
    static int areArraysEqual(int[] A, int[] B, int N) {
        // Step 1: Sort both arrays
        Arrays.sort(A);
        Arrays.sort(B);
        
        // Step 2: Check if the sorted arrays are equal
        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                return 0; // Arrays are not equal
            }
        }
        
        // Step 3: Arrays are equal
        return 1;
    }
}
