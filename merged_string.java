import java.util.*;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String newWord = "";
        int n = Math.min(word1.length(), word2.length());
        
        for (int i = 0; i < n; i++) {
            newWord = newWord + word1.charAt(i) + word2.charAt(i);
        }
        
        if (word1.length() > word2.length()) {
            newWord = newWord + word1.substring(n);
        } else if (word2.length() > word1.length()) {
            newWord = newWord + word2.substring(n);
        }
        
        return newWord;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        
        Solution solution = new Solution();
        String ret = solution.mergeAlternately(word1, word2); // Pass two separate strings
        System.out.println(ret);
    }
}
