import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Solution solution=new Solution();
        System.out.print(solution.primeSum(N));
    }
    
}

class Solution
{
    public static int primeSum(int N)
    {
        String number=String.valueOf(N);
        int digit=0;
        for(char num:number.toCharArray())
        {
            int digitvalue=Character.getNumericValue(digit);
            if(isPrimeDigit(digitvalue))
            {
               digit+=digitvalue;
            }
        }
    }
    private static boolean isPrimeDigit(int digit) {
      
        return digit == 2 || digit == 3 || digit == 5 || digit == 7;
    }
}