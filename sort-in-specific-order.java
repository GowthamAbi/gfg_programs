import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		long[] arr = {1, 2, 3, 5, 4, 7, 10};
        long n = arr.length;
        Solution solution=new Solution();
        long[] sortedArr=solution.sortIt(arr,n);
        for (long num : sortedArr) {
            System.out.print(num + " ");
        }
	}
}

class Solution
{
    public static long [] sortIt(long [] arr,long n)
    {
        List<Long>oddnumbers=new ArrayList<>();
        List<Long>evennumbers=new ArrayList<>();
        for(long num:arr)
        {
            if(num%2==0)
            {
                evennumbers.add(num);
            }
            else
            {
                oddnumbers.add(num);
            }
        }
        Collections.sort(oddnumbers,Collections.reverseOrder());
        Collections.sort(evennumbers);
        // long [] result=new long[n];
        int index=0;
        for(long num:oddnumbers)
        {
            arr[index++]=num;
        }
        for(long num:evennumbers)
        {
            arr[index++]=num;
        }
        return arr;
    }
}
