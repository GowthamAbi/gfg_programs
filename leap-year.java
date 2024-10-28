import java.util.*;
public class Main{
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Solution solution=new Solution();
        System.out.print(solution.isLeap(N));
    }
}
class Solution{
    public static int isLeap(int N)
    {
        if(N%4==0)
        {
            if(N%100!=0||(N%100==0&&N%400==0))
            {
                return 1;
            }
        }
        return 0;
    }
}