import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int [] nums=new int[n];
		for (int i=0;i<n ;i++ )
		{
		    nums[i]=sc.nextInt();
		}
		Solution solution=new Solution();
		int k=solution.position(nums,target);
            System.out.print(k);
	}
}

class Solution
{
    public static int position(int [] nums,int target)
    {

        int n=nums.length;
        int result=0;
        for (int i=0;i<n;i++ )
        {
           if(nums[i]==target)
           {
               return i;
           }
           else{
           result+=i;}
           if (result==target)
           {
               return i;
           }
           
        }
        return 0;
    }
}
