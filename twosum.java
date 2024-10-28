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
		int [] twosum=solution.twosum(nums,target);
		
		    System.out.print("["+twosum[0]+","+twosum[1]+"]");
		
	}
}
class Solution{
    public static int[] twosum(int [] nums,int target)
    {
        Map<Integer,Integer>nummap=new HashMap<>();
        for (int i=0;i<nums.length ;i++ ) {
        int sub=target-nums[i];
        if(nummap.containsKey(sub))
        {
            return new int []
            {
                nummap.get(sub),i
            };
        }
        nummap.put(nums[i],i);
    
        }
        return new int []{};
        }
}
