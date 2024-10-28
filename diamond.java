import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution solution=new Solution();
       solution.print(n);
    }
}
class Solution
{
    public void print(int n)
    {
        int space=n-1;
        for(int i=0;i<n;i++)
        {
        for(int k=0;k<space;k++)
        {
            System.out.print(" ");
        }
        
        for(int j=0;j<=i;j++)
        {
            System.out.print("+ ");
        }
        System.out.print("\n");
        space--;
        }
         space=0;
         
        for(int i=n;i>0;i--)
        {
        for(int k=0;k<space;k++)
        {
            System.out.print(" ");
        }
        
        for(int j=0;j<i;j++)
        {
            System.out.print("+ ");
        }
        System.out.print("\n");
        space++;
        }
         
        
    }
       
    
}
