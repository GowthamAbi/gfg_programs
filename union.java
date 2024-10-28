import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int[] a2 = new int[m];
        for (int i = 0; i < m; i++) {
            a2[i] = sc.nextInt();
        }
        
        Solution solution = new Solution();
        int doUnion = solution.doUnion(n, a1, m, a2);
        System.out.print(doUnion);
    }
}

class Solution {
    public int doUnion(int n, int[] a1, int m, int[] a2) {
        Set<Integer> unionSet = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            unionSet.add(a1[i]);
        }
        
        for (int i = 0; i < m; i++) {
            unionSet.add(a2[i]);
        }
        
        return unionSet.size();
    }
}
