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
		ArrayList<Integer> bitonicGenerator=solution.bitonicGenerator(arr);
		for(int value:bitonicGenerator)
		{
		    System.out.print(value);
		}
		sc.close();
	}
}
class Solution
{
    public ArrayList<Integer>bitonicGenerator(int[] arr)
    {
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                even.add(arr[i]);
            }
            else
            {
                odd.add(arr[i]);
            }
            
        }
        even.sort(null);
        odd.sort((a,b)-> b-a);
        result.addAll(even);
         result.addAll(odd);
        return result;
    }
    
}
