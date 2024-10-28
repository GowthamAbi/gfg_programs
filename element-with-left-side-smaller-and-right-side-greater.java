import java.util.*;
public class  Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i=1;i<n ;i++ )
        {
            arr[i]=sc.nextInt();
        }
        Solution solution=new Solution();
        
        System.out.print(solution.findElement(arr));
    }
}
class Solution
{
    public static int findElement(int[] arr)
    {
        int len=arr.length;
        int[] left=new int[len];
        int[] right=new int[len];
        
        if (len < 3) return -1;
        
        left[0]=arr[0];

        for (int i=1;i<len ;i++ )
        {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        
        right[len-1]=arr[len-1];
        for (int i=len-2;i>=0 ;i-- )
        {
            right[i]=Math.min(right[i+1],arr[i]);
        }
        for (int i = 1; i < len ; i++) {
            if (arr[i] >= left[i - 1] && arr[i] <= right[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
