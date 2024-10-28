import java.util.*;
public  class Main
{
    public  static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        
        for (int i=0;i<n ;i++ )
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Solution solution=new Solution();
        int binarysearch=solution.binarysearch(n,arr,k);
        System.out.print(binarysearch);
    }
    
}
class Solution
{
    public int binarysearch(int n,int[] arr,int k)
    {
         result=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                result=i;
            }
            
        }
        if(result==0)
        {
            result=-1;
        }
        return result;
    }
}