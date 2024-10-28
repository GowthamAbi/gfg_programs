import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n ;i++ )
		{
		    arr[i]=sc.nextInt();
		}
		Solution solution=new Solution();
		ArrayList<Integer> modifyAndRearrangeArr=solution.modifyAndRearrangeArr(arr);
		for(int value:modifyAndRearrangeArr)
		{
		    System.out.print(value);
		}
		sc.close();
	}
}
class Solution
{
    public ArrayList<Integer>modifyAndRearrangeArr(int[] arr)
    {
        int n=arr.length;
        ArrayList<Integer>result=new ArrayList<>();
        for (int i=0;i<n-1 ;i++ )
        {
            if(arr[i]==arr[i+1]&&arr[i+1]!=0)
            {
                arr[i]=arr[i]*2;
                arr[i+1]=0;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                result.add(arr[i]);
            }
        }
        while(result.size()<n)
        {
            result.add(0);
        }
        return result;
    }
    
}
