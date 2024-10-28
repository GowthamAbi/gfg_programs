import java.util.*;
public  class  Main
{
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n ;i++ ) 
       {
           arr[i]=sc.nextInt();
       }
         Solution solution=new Solution();
         int maxSubarraySum=solution.maxSubarraySum(arr);
         System.out.print(maxSubarraySum);
       
    }
}
class Solution
{
    public static int maxSubarraySum(int[] arr)
{
     int maxSoFar=Integer.MIN_VALUE;
       int maxEndingHere=0;
       for (int i=0;i<arr.length ;i++ ) 
       {
           maxEndingHere+=arr[i];
       
       if(maxSoFar<maxEndingHere)
       {
          maxSoFar=maxEndingHere;
       }
       if (maxEndingHere<0) 
       
        {
        maxEndingHere=0;  
        }
       }
        return maxSoFar;
      
    }
     
}
 