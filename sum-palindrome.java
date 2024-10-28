import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Solution solution=new Solution();
        long isSumPalindrome=solution.isSumPalindrome(n);
        System.out.println(isSumPalindrome);
        scanner.close();
    }
}

   class Solution 
   {
    static long isSumPalindrome(long n) {
        int iteration=0;
            while(iteration<=5)
            {
                if(ispalindrome(n))
                {
                    return n;
                }
                long reverseNumber=reverseNumber(n);
                n=n+reverseNumber;
                iteration++;
            }
        
       
       return -1;
       
    }
    static long reverseNumber(long n)
    {
        long reverse=0;
        while(n!=0)
        {
            reverse=reverse*10+n%10;
        n=n/10;
        }
        
        return reverse;
    }
    
    static boolean ispalindrome(long n)
    {
        String str=Long.toString(n);
      
        int len=str.length();
        for(int i=0;i<len/2;i++)
        {
            if(str.charAt(i)!=str.charAt(len-1-i))
            
            {
                return false;
            }
        }
        return true;
    }
    
} 