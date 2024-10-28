import java.util.*;
public class Main
{
    

public static void main (String[] args) {
    
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    Solution solution =new Solution();
    String gcdOfStrings=Solution.gcdOfStrings(str1,str2);
    System.out.print(gcdOfStrings);

}
}
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenated strings are equal or not, if not return ""
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        // If strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }
}