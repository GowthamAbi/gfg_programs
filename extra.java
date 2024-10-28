import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int [] arr1=new int[n];
		int [] arr2=new int[n-1];
		for (int i=0;i<n ;i++ )
		{
		    arr1[i]=sc.nextInt();
		}
		for (int j=0;j<n-1 ;j++ )
		{
		    arr2[j]=sc.nextInt();
		}
		Solution solution=new Solution();
		System.out.print(solution.extra(arr1,arr2,n));
	}
}
class Solution
{
    public int extra(int [] arr1,int [] arr2,int n)
    {
        int low=0;
        int high=n-2;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(arr1[mid]==arr2[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
}