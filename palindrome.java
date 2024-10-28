import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution solution=new Solution();
        String toLower=solution.toLower(s);
        System.out.print(toLower);
    }
}
class Solution
{
    public static String toLower(String s)
    {
        return s.toLowerCase();
    }
}