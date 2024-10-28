import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        ArrayList<Integer> dNumber = solution.dNumber(n, arr);
        System.out.print(dNumber);
    }
}

class Solution {
    public ArrayList<Integer> dNumber(int n, int[] arr) {
         ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                if (!list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
        }
        if (list.isEmpty()) {
            list.add(-1); // If no duplicates found, add -1 to the list
        }
        return list;
         
    }
}
