class Solution {
    static Long isPowerOfAnother(Long X, Long Y) {
        if (X == 1) {
            return Y == 1 ? 1L : 0L;
        }
        
        double logY = Math.log(Y);
        double logX = Math.log(X);
        double k = logY / logX;
        
        if (Math.abs(k - Math.round(k)) < 1e-10) {
            return 1L;
        } else {
            return 0L;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Long X = 2L;
        Long Y = 8L;

        System.out.println(solution.isPowerOfAnother(X, Y)); // Output: 1
    }
}
