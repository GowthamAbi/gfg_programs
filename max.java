import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int result = minRemovalsToChangeMex(arr);
        System.out.println(result); // Output: 1
    }

    public static int minRemovalsToChangeMex(int[] arr) {
        int n = arr.length;
   
        int originalMex = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        while (set.contains(originalMex)) {
            originalMex++;
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                boolean canChangeMex = true;
                for (int j = 0; j < n; j++) {
                    if (i != j && arr[j] == 0) {
                        canChangeMex = false;
                        break;
                    }
                }
                if (canChangeMex) {
                    return 1;
                }
            }
        }
        
        return -1;
    }
}
