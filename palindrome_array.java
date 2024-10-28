import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        GfG gfg = new GfG();
        int palinArray = gfg.palinArray(a, n);
        System.out.print(palinArray);
    }
}

class GfG
{
    public static int palinArray(int [] a,int n)
    {
        int rev=0;
        for(int i=0;i<n;i++)
        {
            int num=a[i];
            while(num>0)
            {
                int remainder=num%10;
            rev=rev*10+remainder;
            num/=10;
                
            }
            if(rev==a[i])
            {
                System.out.print(0);
            }
            else
            {
                System.out.print(1);
            }
        }
    }
}
}